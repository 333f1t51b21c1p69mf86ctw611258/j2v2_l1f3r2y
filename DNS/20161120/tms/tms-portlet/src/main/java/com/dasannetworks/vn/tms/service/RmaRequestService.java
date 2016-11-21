package com.dasannetworks.vn.tms.service;

import com.dasannetworks.vn.sb.NoSuchDeviceException;
import com.dasannetworks.vn.sb.NoSuchHandOverFormException;
import com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException;
import com.dasannetworks.vn.sb.model.*;
import com.dasannetworks.vn.sb.service.*;
import com.dasannetworks.vn.sb.service.persistence.RmaRequestDevicePK;
import com.dasannetworks.vn.tms.pojo.DeviceVO;
import com.dasannetworks.vn.tms.pojo.RmaRequestDeviceVO;
import com.dasannetworks.vn.tms.pojo.RmaRequestVO;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.workflow.WorkflowConstants;

import lombok.Data;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

/**
 *
 */
@Service
public class RmaRequestService {
    private static Log _log = LogFactoryUtil.getLog(RmaRequestService.class);

    private final ExcelService excelService;
    private final DeviceService deviceService;

    @Autowired
    public RmaRequestService(ExcelService excelService, DeviceService deviceService) {
        this.excelService = excelService;
        this.deviceService = deviceService;
    }

    public RmaRequest handleForm(RmaRequestVO form) throws SystemException, PortalException {
        Long rmaRequestId = form.getRmaRequestId();
        if (rmaRequestId == null) {
            return createRmaRequest(form);
        } else {
            return updateRmaRequest(form);
        }
    }

    public List<RmaRequest> getAll() throws SystemException {
        return RmaRequestLocalServiceUtil.getRmaRequests(0, 999);
    }

    public List<RmaRequestDevice> getHandOverDeviceList(long rmaRequestId) throws SystemException {
        return RmaRequestDeviceLocalServiceUtil.findByRmaRequestId(rmaRequestId);
    }

    public Device getByHandOverDevice(HandOverDevice handOverDevice) throws SystemException, PortalException {
        return DeviceLocalServiceUtil.getDevice(handOverDevice.getDeviceId());
    }

    public RmaRequestVO initRmaRequestVO(Long rmaRequestId) throws SystemException, PortalException {
        if (rmaRequestId == null) {
            return new RmaRequestVO();
        }
        RmaRequestVO result = null;
        try {

            RmaRequest rmaRequest = RmaRequestLocalServiceUtil.getRmaRequest(rmaRequestId);
            result = RmaRequestVO.create(rmaRequest);
            List<RmaRequestDevice> rmaRequestDeviceList = getHandOverDeviceList(rmaRequestId);
            List<Long> deviceIds = rmaRequestDeviceList.
                    stream().
                    map(RmaRequestDevice::getDeviceId).
                    collect(Collectors.toList());

            List<Device> deviceList = deviceService.get(deviceIds);
            List<DeviceVO> deviceVOList = deviceService.getDeviceVOList(deviceList);

            result.setRmaRequestDeviceList(RmaRequestDeviceVO.from(rmaRequestDeviceList, deviceVOList));
        } catch (NoSuchHandOverFormException e) {
        	result = new RmaRequestVO();
        }

        return result;
    }

    private RmaRequest updateRmaRequest(RmaRequestVO form) throws SystemException, PortalException {
        RmaRequest rmaRequest = RmaRequestLocalServiceUtil.getRmaRequest(form.getRmaRequestId());
        rmaRequest.setModifiedDate(new Date());
        form.update(rmaRequest);
        if (form.getDeviceListFile() != null) {
            DeviceListFile deviceList = excelService.parseDeviceListHandOverForm(form.getDeviceListFile());
            for(DeviceListRow row: deviceList.getRows()) {
                long deviceId = deviceService.getBySerialNumber(row.getSerialNumber()).getDeviceId();
                RmaRequestDevicePK pk = new RmaRequestDevicePK(rmaRequest.getRmaRequestId(), deviceId);
                RmaRequestDevice rmaRequestDevice = null;
                try {
                    rmaRequestDevice = RmaRequestDeviceLocalServiceUtil.getRmaRequestDevice(pk);
                    rmaRequestDevice.setModifiedDate(new Date());
                } catch (NoSuchRmaRequestDeviceException e) {
                    rmaRequestDevice = RmaRequestDeviceLocalServiceUtil.createRmaRequestDevice(pk);
                    rmaRequestDevice.setCreateDate(new Date());
                }
                rmaRequestDevice.setFaultNote(row.getNote());
                RmaRequestDeviceLocalServiceUtil.updateRmaRequestDevice(rmaRequestDevice);
            }
        }
        return RmaRequestLocalServiceUtil.updateRmaRequest(rmaRequest);
    }

    private RmaRequest createRmaRequest(RmaRequestVO form) throws SystemException, NoSuchDeviceException {
        Long rmaRequestId = CounterLocalServiceUtil.increment(RmaRequest.class.getName());
        RmaRequest rmaRequest = RmaRequestLocalServiceUtil.createRmaRequest(rmaRequestId);
        rmaRequest.setCreateDate(new Date());
        rmaRequest.setStatus(WorkflowConstants.STATUS_DRAFT);
        form.update(rmaRequest);
        if (form.getDeviceListFile() != null) {
            DeviceListFile deviceListFile = excelService.parseDeviceListHandOverForm(form.getDeviceListFile());
            for(DeviceListRow row: deviceListFile.getRows()) {
                long deviceId = deviceService.getBySerialNumber(row.getSerialNumber()).getDeviceId();
                RmaRequestDevicePK pk = new RmaRequestDevicePK(rmaRequestId, deviceId);
                RmaRequestDevice rmaRequestDevice = RmaRequestDeviceLocalServiceUtil.createRmaRequestDevice(pk);
                rmaRequestDevice.setCreateDate(new Date());
                rmaRequestDevice.setFaultNote(row.getNote());

                RmaRequestDeviceLocalServiceUtil.updateRmaRequestDevice(rmaRequestDevice);
            }
        }
        return RmaRequestLocalServiceUtil.updateRmaRequest(rmaRequest);
    }

    public RmaRequest delete(Long rmaRequestId) throws SystemException, PortalException {
        return RmaRequestLocalServiceUtil.deleteRmaRequest(rmaRequestId);
    }

    @Data
    public static class DeviceListFile {
        public static String SERIAL_NUMBER = "Serial Number";
        public static String NOTE = "Note";
        private List<DeviceListRow> rows;
        private String fileName;
        private String sheetName;
    }
    @Data
    public static class DeviceListRow {
        private String serialNumber;
        private String note;

        public DeviceListRow() {

        }

        public DeviceListRow(String serialNumber, String note) {
            this.note = note;
            this.serialNumber = serialNumber;
        }
    }

	public static List<RmaRequestVO> getRmaRequestVOList(List<RmaRequest> rmaRequests) {
		List<RmaRequestVO> rmaRequestVOList = new ArrayList<>();
		if (rmaRequests != null && !rmaRequests.isEmpty()) {
            _log.debug("HandOverForm Size is " + rmaRequests.size());

			RmaRequestVO rmaRequestVO = null;
			for (RmaRequest rmaRequest : rmaRequests) {
				rmaRequestVO = new RmaRequestVO();
				BeanUtils.copyProperties(rmaRequest, rmaRequestVO);

				rmaRequestVOList.add(rmaRequestVO);
			}
            _log.debug("HandOverForm View list size " + rmaRequestVOList.size());
		}
		return rmaRequestVOList;
	}
}
