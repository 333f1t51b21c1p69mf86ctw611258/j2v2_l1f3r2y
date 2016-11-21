package com.dasannetworks.vn.tms.controller.deviceimport;

import com.dasannetworks.vn.sb.model.PurchaseOrder;
import com.dasannetworks.vn.tms.pojo.PurchaseOrderVO;
import com.dasannetworks.vn.tms.service.ImportDeviceListService;
import com.dasannetworks.vn.tms.service.PurchaseOrderService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.util.PortalUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import javax.portlet.*;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 */
@Controller
@RequestMapping("VIEW")
public class PurchaseOrderController {
    @Autowired
    private ImportDeviceListService service;
    @Autowired
    private PurchaseOrderService purchaseOrderService;

    private static Log _log = LogFactoryUtil.getLog(DeviceController.class);

    @ModelAttribute("po")
    public PurchaseOrderVO purchaseOrder() {
        return new PurchaseOrderVO();
    }

    @ResourceMapping("get_all_purchase_order")
    @ResponseBody
    public List<PurchaseOrderVO> getAll(ResourceRequest request, ResourceResponse response) throws SystemException {
        return purchaseOrderService.getAll();
    }

    @ActionMapping(params="action=delete_purchase_order")
    public void deletePurchaseOrder(@RequestParam(value = "purchase_order_id") Long purchaseOrderId,
                                    ActionResponse response, Model model) throws SystemException, PortalException {
        PurchaseOrder purchaseOrder = purchaseOrderService.get(purchaseOrderId);
        purchaseOrderService.deletePurchaseOrder(purchaseOrder);
    }

    @RenderMapping(params="render=edit_purchase_order")
    public String editPurchaseOrder(
            @RequestParam(value = "purchase_order_id", required = false) Long purchaseOrderId,
            RenderRequest request,
            Model model) throws PortalException, SystemException {

        try {
            PurchaseOrderVO purchaseOrderVO = new PurchaseOrderVO();
            if (purchaseOrderId != null) {
                PurchaseOrder purchaseOrder = purchaseOrderService.get(purchaseOrderId);
                purchaseOrderVO = PurchaseOrderVO.create(purchaseOrder);
            }
            model.addAttribute("po", purchaseOrderVO);
        } catch (Exception e) {
            model.addAttribute("po", new PurchaseOrderVO());
            SessionErrors.add(request, "edit_purchase_order_error", e.getMessage());
        }
        return "device_registration/edit_purchase_order";
    }

    @ResourceMapping("upload_device_list_file")
    @ResponseBody
    public DeviceListUploadResponse upload(@Valid @ModelAttribute("po") PurchaseOrderVO purchaseOrderVO,
                         BindingResult bindingResult, ResourceRequest request, ResourceResponse response
    ) throws IOException, PortletException {
        String resourceId = request.getResourceID();
        _log.info("Serve Resource Request " + resourceId);
        String status = "";
        String message = "";

        try {
            UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(request);
            File objFile = uploadRequest.getFile("deviceListFile");
            String objFileName = uploadRequest.getFileName("deviceListFile");
            _log.info(String.format("received objFile: [%s], objFileName: [%s]", objFile.getName(), objFileName));
            message = service.importPurchaseOrder(objFile, purchaseOrderVO);
            status = "SUCCESS";
            SessionMessages.add(request, "save_purchase_order_success");
        } catch (Exception e) {
            status = "FALURE";
            message = e.getMessage();
            e.printStackTrace();
            _log.error(String.format("Upload File error [%s]", e.getMessage()));
        }

        return new DeviceListUploadResponse(status, message);
    }

    @InitBinder
    private void dateBinder(WebDataBinder binder) {
        //The date format to parse or output your dates
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        //Create a new CustomDateEditor
        CustomDateEditor editor = new CustomDateEditor(dateFormat, true);
        //Register it as custom editor for the Date type
        binder.registerCustomEditor(Date.class, editor);
    }
}
