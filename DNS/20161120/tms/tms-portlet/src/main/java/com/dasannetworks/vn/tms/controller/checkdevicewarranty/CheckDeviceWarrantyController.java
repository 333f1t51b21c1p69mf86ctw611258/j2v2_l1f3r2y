package com.dasannetworks.vn.tms.controller.checkdevicewarranty;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.dasannetworks.vn.sb.model.impl.DeviceImpl;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import com.dasannetworks.vn.sb.model.Device;
import com.dasannetworks.vn.sb.service.DeviceLocalServiceUtil;
import com.dasannetworks.vn.tms.controller.BaseController;
import com.dasannetworks.vn.tms.pojo.DeviceVO;
import com.dasannetworks.vn.tms.service.DeviceSearchInput;
import com.dasannetworks.vn.tms.service.DeviceService;
import com.dasannetworks.vn.tms.service.ExcelService;
import com.dasannetworks.vn.tms.service.ImportDeviceListService.DeviceListInputFile;
import com.dasannetworks.vn.tms.service.ImportDeviceListService.DeviceListInputRow;
import com.dasannetworks.vn.tms.util.JsonServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.upload.UploadRequest;
import com.liferay.portal.util.PortalUtil;

@Controller("checkDeviceWarrantyController")
@RequestMapping("VIEW")
public class CheckDeviceWarrantyController extends BaseController {

	private static Log LOGGER = LogFactoryUtil.getLog(CheckDeviceWarrantyController.class);

	private DeviceVO pojoDevice = new DeviceVO();

	@RenderMapping
	public String defaultHandler(Map<String, Object> map) throws SystemException {

		// map.put("device", this.pojoDevice);

		// List<Device> deviceList = DeviceLocalServiceUtil.getDevices(0,
		// DeviceLocalServiceUtil.getDevicesCount());
		// map.put("deviceList", deviceList);

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
			@ModelAttribute("device") DeviceVO pojoDevice, BindingResult result) throws IOException,
			PortletException, SystemException {

		callRerenderView(actionResponse, pojoDevice);
	}

	private void callRerenderView(ActionResponse actionResponse, DeviceVO pojoDevice) {
		this.pojoDevice = pojoDevice;
		actionResponse.setRenderParameter("render", "rerenderView");
	}

	@ResourceMapping("getAllDevices")
	public void getAllDevices(ResourceRequest request, ResourceResponse response) throws IOException, PortalException, SystemException {
		LOGGER.info("TODO: getAllDevices");

		List<Device> deviceList = null;

		try {
			deviceList = DeviceLocalServiceUtil.getDevices(0, DeviceLocalServiceUtil.getDevicesCount());
		} catch (Exception e) {
			LOGGER.error("Error while getting all devices", e);
		}

		Map<String, Object> map = new HashMap<String, Object>();
		List<DeviceVO> deviceVOList = DeviceService.getDeviceVOList(deviceList);
		map.put("aaData", deviceVOList);

		PrintWriter writer = null;
		writer = response.getWriter();
		JsonServiceUtil.writeJson(writer, map);
	}

	@ResourceMapping("checkDevices")
	public void checkDevices(
			@RequestParam("exactly") Boolean exactly,
			@RequestParam("serialNumber") String serialNumber,
			@RequestParam("macAddress") String macAddress,
			@RequestParam("purchaseOrder") String purchaseOrder,
			@RequestParam("modelName") String modelName,
			ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException, PortalException, SystemException {

		Device dv = new DeviceImpl();

		List<Device> deviceList = null;
		try {
			deviceList = searchDeviceList(exactly, serialNumber, macAddress);
		} catch (Exception e) {
			LOGGER.error("Error while checking devices", e);
		}

		Map<String, Object> map = new HashMap<String, Object>();
		List<DeviceVO> listDeviceVO = DeviceService.getDeviceVOList(deviceList);
		map.put("deviceList", listDeviceVO);

		PrintWriter writer = null;
		writer = resourceResponse.getWriter();
		JsonServiceUtil.writeJson(writer, map);
	}

	@ResourceMapping("checkDevicesWithExcel")
	public void checkDevicesWithExcel(
			ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException, PortletException, SystemException, PortalException {

		UploadRequest uploadRequest = PortalUtil.getUploadPortletRequest(resourceRequest);
		Set<Device> hsDevices = new HashSet<Device>();
		if (uploadRequest != null) {
			File objFile = uploadRequest.getFile("fileExcel");

			if (objFile != null) {
				DeviceListInputFile deviceListInputFile = ExcelService.parseDeviceSerialNumberList(objFile);

				List<DeviceListInputRow> rows = deviceListInputFile.getRows();

				LOGGER.info("Excel rows: " + rows.size());

				List<Device> tmpDevices = null;
				for (DeviceListInputRow deviceListInputRow : rows) {
					tmpDevices = searchDeviceList(true, deviceListInputRow.getSerialNumber(), null);
					if (!CollectionUtils.isEmpty(tmpDevices)) {
						hsDevices.addAll(tmpDevices);
					}
				}
			}
		}

		Map<String, Object> map = new HashMap<String, Object>();
		List<Device> tmpDevices = new ArrayList<>(hsDevices);
		List<DeviceVO> listDeviceVO = DeviceService.getDeviceVOList(tmpDevices);
		map.put("deviceList", listDeviceVO);

		PrintWriter writer = null;
		writer = resourceResponse.getWriter();
		JsonServiceUtil.writeJson(writer, map);
	}

	private List<Device> searchDeviceList(boolean exactly, String serialNumber, String macAddress) throws SystemException {
		List<Device> deviceList;
		DeviceSearchInput deviceSearchInput = new DeviceSearchInput();
		deviceSearchInput.setExactly(exactly);
		deviceSearchInput.setAndSearchCondition(true);
		deviceSearchInput.setSerialNumber(serialNumber);
		deviceSearchInput.setMacAddress(macAddress);

		long count = DeviceLocalServiceUtil.searchCount(deviceSearchInput);

		deviceSearchInput.setStart(0);
		deviceSearchInput.setEnd((int) count);

		deviceList = DeviceLocalServiceUtil.search(deviceSearchInput);
		return deviceList;
	}

}
