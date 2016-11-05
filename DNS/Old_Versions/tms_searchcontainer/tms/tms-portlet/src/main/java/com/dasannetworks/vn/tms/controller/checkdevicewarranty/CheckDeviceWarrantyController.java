package com.dasannetworks.vn.tms.controller.checkdevicewarranty;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletRequest;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.dasannetworks.vn.sb.model.Device;
import com.dasannetworks.vn.sb.model.impl.DeviceImpl;
import com.dasannetworks.vn.sb.service.DeviceLocalServiceUtil;
import com.dasannetworks.vn.tms.pojo.DevicePOJO;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;

@Controller("checkDeviceWarrantyController")
@RequestMapping("VIEW")
public class CheckDeviceWarrantyController {

	private static Log LOG = LogFactoryUtil.getLog(CheckDeviceWarrantyController.class);
	
	@RenderMapping
	public String listDevices(Map<String, Object> map) throws SystemException {

		DevicePOJO pojoDevice = new DevicePOJO();
		map.put("device", pojoDevice);

		// List<Device> contactList = DeviceLocalServiceUtil.getDevices(0,
		// DeviceLocalServiceUtil.getDevicesCount());
		//
		// map.put("contactList", contactList);

		return "check-device-warranty/view";

	}

	@ActionMapping(params="action=checkDevice")
    public void checkDevice(ActionRequest request,
                     ActionResponse response,
                     Model model) throws SystemException, PortalException {
        String serialNumber = ParamUtil.getString(request, "serialNumber");
        String macAddress = ParamUtil.getString(request, "macAddress");
        
        LOG.info("serialNumber: " + serialNumber);
        LOG.info("MAC Address: " + macAddress);
    }
	
	@ActionMapping(params = "action=search")
	public void addDevice(ActionRequest actionRequest, ActionResponse actionResponse, Model model,
			@ModelAttribute("contact") DevicePOJO pojoDevice, BindingResult result) throws IOException,
			PortletException, SystemException {

		// System.out.println("result " + ParamUtil.getString(actionRequest,
		// "firstname"));
		// System.out.println("contact " + pojoDevice.getFirstname());

		Device contact = new DeviceImpl();

		BeanUtils.copyProperties(pojoDevice, contact);
		// long contactId = CounterLocalServiceUtil.increment();
		// contact.setId(contactId);

		DeviceLocalServiceUtil.addDevice(contact);

		// return "contact";

	}

	private List<Device> deviceList = null;

	@ModelAttribute("deviceList")
	public List<Device> getDeviceList(PortletRequest portletRequest) throws SystemException {
		deviceList = DeviceLocalServiceUtil.getDevices(0, DeviceLocalServiceUtil.getDevicesCount());

		return deviceList;
	}

}
