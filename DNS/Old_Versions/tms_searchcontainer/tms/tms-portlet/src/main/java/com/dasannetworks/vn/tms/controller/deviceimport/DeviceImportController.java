package com.dasannetworks.vn.tms.controller.deviceimport;

import com.dasannetworks.vn.sb.model.Device;
import com.dasannetworks.vn.sb.service.DeviceLocalServiceUtil;
import com.dasannetworks.vn.tms.pojo.PurchaseOrderVO;
import com.dasannetworks.vn.tms.service.DeviceService;
import com.dasannetworks.vn.tms.service.ImportDeviceListService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.upload.UploadRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.util.PortalUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import javax.portlet.*;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;

/**
 * Portlet implementation class DeviceRegistrationPortlet
 */
@Controller
@RequestMapping("VIEW")
public class DeviceImportController {
	@Autowired
    private ImportDeviceListService service;
    @Autowired
    private DeviceService deviceService;
	
    private static Log _log = LogFactoryUtil.getLog(DeviceImportController.class);

    @RenderMapping
    public String start(RenderRequest request, RenderResponse response, Model model) throws SystemException, PortalException {
        Integer count = DeviceLocalServiceUtil.getDevicesCount();
        model.addAttribute("totalCount", count);

        return "device_registration/device_registration";
    }

    @RenderMapping(params="render=edit")
    public String edit(RenderRequest request, Model model) throws SystemException, PortalException {
    	Long deviceId = null;
        String deviceIdParam = request.getParameter("device_id");
        if (deviceIdParam != null) {
        	deviceId = Long.valueOf(deviceIdParam);
        }
        Device device = deviceService.getOrCreate(deviceId);
        request.getPortletSession().setAttribute("device_ " + device.getDeviceId(), device);
        model.addAttribute("device", device);

        return "device_registration/edit";
    }

    @ActionMapping(params="action=save")
    public void save(ActionRequest request,
                     ActionResponse response,
                     Model model) throws SystemException, PortalException {
        Long deviceId = ParamUtil.getLong(request, "device_id");
        Device device = (Device) request.getPortletSession().getAttribute("device_ " + deviceId);
        device.setSerialNumber(request.getParameter("serial_number"));
        device.setModelName(request.getParameter("model_name"));
        device = deviceService.updateDevice(device);
        model.addAttribute("device", device);
        SessionMessages.add(request, "save_success");
        response.setRenderParameter("render", "edit");
    }

    @ActionMapping(params="action=delete")
    public void delete(ActionRequest request,
                     ActionResponse response,
                     Model model) throws SystemException, PortalException {
        Long deviceId = ParamUtil.getLong(request, "device_id");
        Device delete = deviceService.deleteDevice(deviceId);
        
        model.addAttribute("device", delete);
        SessionMessages.add(request, "delete_success");
        
        request.setAttribute("deletedDevice", delete);
        int totalDevice = DeviceLocalServiceUtil.getDevicesCount();
        model.addAttribute("totalDevice", totalDevice);
    }

    @ModelAttribute("po")
    public PurchaseOrderVO purchaseOrder() {
        return new PurchaseOrderVO();
    }

    @ResourceMapping("UPLOAD_FILE")
    @ResponseBody
    public DeviceRegistrationResponse upload(@Valid @ModelAttribute("po") PurchaseOrderVO purchaseOrderVO,
                                             BindingResult bindingResult,
                                             ResourceRequest request,
                                             ResourceResponse response) throws IOException, PortletException {
        String resourceId = request.getResourceID();
        _log.info("Serve Resource Request " + resourceId);

        String status = "FAILURE";
        String message = "";
        if(resourceId != null && resourceId.equals("UPLOAD_FILE")){
            try {
                message = uploadFile(PortalUtil.getUploadPortletRequest(request), purchaseOrderVO);
                status = "SUCCESS";
            } catch (Exception e) {
                _log.error(String.format("Upload File error [%s]", e.getMessage()));
                message = e.getMessage();
            }
        } else {
        	message = "UPLOAD_FILE";
        }
        
        return new DeviceRegistrationResponse(status, message);
    }

    private String uploadFile(UploadRequest uploadRequest, PurchaseOrderVO purchaseOrderVO) throws IOException, SystemException, PortalException {
        File objFile = uploadRequest.getFile("deviceListFile");
        String objFileName = uploadRequest.getFileName("deviceListFile");
        _log.info(String.format("received objFile: [%s], objFileName: [%s]", objFile.getName(), objFileName));
        service.importPurchaseOrder(objFile, purchaseOrderVO);
        
        return objFileName;
    }
}
