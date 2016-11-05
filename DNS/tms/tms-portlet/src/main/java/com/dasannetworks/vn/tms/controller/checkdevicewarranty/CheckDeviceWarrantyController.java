package com.dasannetworks.vn.tms.controller.checkdevicewarranty;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.dasannetworks.vn.sb.model.Device;
import com.dasannetworks.vn.sb.service.DeviceLocalServiceUtil;
import com.dasannetworks.vn.tms.pojo.DevicePOJO;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

@Controller("checkDeviceWarrantyController")
@RequestMapping("VIEW")
public class CheckDeviceWarrantyController {

	private static Log LOGGER = LogFactoryUtil.getLog(CheckDeviceWarrantyController.class);
	
	private DevicePOJO pojoDevice = new DevicePOJO();

	@RenderMapping
	public String defaultHandler(Map<String, Object> map) throws SystemException {

		map.put("device", this.pojoDevice);

		List<Device> deviceList = DeviceLocalServiceUtil.getDevices(0, DeviceLocalServiceUtil.getDevicesCount());
		map.put("deviceList", deviceList);

		return "check-device-warranty/view";

	}

	@RenderMapping(params = { "render=rerenderView" })
	public String rerenderView(Model model, PortletRequest portletRequest, PortletResponse portletResponse) throws SystemException {
		LOGGER.debug("rerenderView called");

		model.addAttribute("device", this.pojoDevice);
		
		List<Device> deviceList = DeviceLocalServiceUtil.getDevices(0, DeviceLocalServiceUtil.getDevicesCount());
		model.addAttribute("deviceList", deviceList);

		return "check-device-warranty/view";
	}	
	
	@ActionMapping(params = "action=checkDevice")
	public void addDevice(ActionRequest actionRequest, ActionResponse actionResponse, Model model,
			@ModelAttribute("device") DevicePOJO pojoDevice, BindingResult result) throws IOException,
			PortletException, SystemException {

		callRerenderView(actionResponse, pojoDevice);		
	}
	
	private void callRerenderView(ActionResponse actionResponse, DevicePOJO pojoDevice) {
		this.pojoDevice = pojoDevice;
		actionResponse.setRenderParameter("render", "rerenderView");
	}

}
