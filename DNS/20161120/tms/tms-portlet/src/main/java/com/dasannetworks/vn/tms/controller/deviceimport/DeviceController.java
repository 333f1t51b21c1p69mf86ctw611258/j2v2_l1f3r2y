package com.dasannetworks.vn.tms.controller.deviceimport;

import com.dasannetworks.vn.sb.model.Device;
import com.dasannetworks.vn.sb.service.DeviceLocalServiceUtil;
import com.dasannetworks.vn.tms.pojo.DeviceVO;
import com.dasannetworks.vn.tms.service.DeviceService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import javax.portlet.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Portlet implementation class DeviceRegistrationPortlet
 */
@Controller
@RequestMapping("VIEW")
public class DeviceController {
	@Autowired
	private DeviceService deviceService;

	private static Log _log = LogFactoryUtil.getLog(DeviceController.class);

	@RenderMapping
	public String start(RenderRequest request, RenderResponse response, Model model)
			throws SystemException, PortalException {
		model.addAttribute("defaultEditPanelState", "close");
		return "device_registration/device_registration";
	}

	@ModelAttribute("device")
	public DeviceVO deviceVO() {
		return new DeviceVO();
	}

	@RenderMapping(params="render=edit")
	public String edit(RenderRequest request, @RequestParam(value = "device_id", required = false) Long deviceId,
			Model model) throws SystemException, PortalException {

		DeviceVO deviceVO = new DeviceVO();
		if (deviceId != null) {
			Device device = deviceService.get(deviceId);
			BeanUtils.copyProperties(device, deviceVO);
		}
		model.addAttribute("device", deviceVO);
		return "device_registration/edit_device";
	}

	@ActionMapping(params="action=save")
	public void save(ActionRequest request, ActionResponse response, @ModelAttribute("device") DeviceVO deviceVO,
					 Model model) throws SystemException, PortalException {

		Device device = deviceService.updateDevice(deviceVO);
		
		model.addAttribute("device", device);
		SessionMessages.add(request, "save_success");
		response.setRenderParameter("render","edit");
	}

	@ActionMapping(params="action=delete")
	public void delete(ActionRequest request, ActionResponse response, Model model)
			throws SystemException, PortalException {
		String deviceIdList = ParamUtil.getString(request, "device_id_list");
		List<Long> deviceIds = Arrays.stream(deviceIdList.split(",")).map(Long::valueOf).collect(Collectors.toList());

		List<Device> deletedList = deviceService.deleteDevice(deviceIds);
		model.addAttribute("deletedList", deletedList);
		SessionMessages.add(request, "delete_success");

		int totalDevice = DeviceLocalServiceUtil.getDevicesCount();
		model.addAttribute("totalDevice", totalDevice);
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
