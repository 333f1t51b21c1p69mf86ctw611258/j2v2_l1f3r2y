package com.dasannetworks.vn.tms.service;

import java.util.*;

import com.dasannetworks.vn.sb.NoSuchWarrantyFormException;
import com.dasannetworks.vn.sb.model.WarrantyForm;
import com.dasannetworks.vn.sb.service.WarrantyFormLocalServiceUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dasannetworks.vn.sb.NoSuchDeviceException;
import com.dasannetworks.vn.sb.model.Device;
import com.dasannetworks.vn.sb.service.DeviceLocalServiceUtil;
import com.dasannetworks.vn.tms.pojo.DeviceVO;
import com.dasannetworks.vn.tms.pojo.WarrantyFormVO;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 *
 */
@Service
public class DeviceService {
	private static Log LOGGER = LogFactoryUtil.getLog(DeviceService.class);
    private final WarrantyFormService warrantyFormService;

    @Autowired
    public DeviceService(WarrantyFormService warrantyFormService) {
        this.warrantyFormService = warrantyFormService;
    }
   /* public static List<DeviceVO> getDeviceVOList(List<Device> deviceList) {
        return Optional.
                ofNullable(deviceList).
                orElse(new ArrayList<>()).
                stream().
                map(DeviceVO::create).
                collect(Collectors.toList());
	}*/

    public static List<DeviceVO> getDeviceVOList(List<Device> deviceList) throws PortalException, SystemException {
        List<DeviceVO> deviceVOList = new ArrayList<DeviceVO>();
        if (deviceList != null && !deviceList.isEmpty()) {
            LOGGER.info("Device Size is " + deviceList.size());

            DeviceVO deviceVO = null;
            for (Device device : deviceList) {
                device.fetchWarrantyForm();

                deviceVO = new DeviceVO();
                BeanUtils.copyProperties(device, deviceVO);

                if (device.getWarrantyForm() != null) {
                    WarrantyFormVO warrantyFormVO = new WarrantyFormVO();
                    BeanUtils.copyProperties(device.getWarrantyForm(), warrantyFormVO);
                    deviceVO.setWarrantyForm(warrantyFormVO);
                    
                    deviceVO.setWarrantyStartDate(warrantyFormVO.getWarrantyStartDate());
                    deviceVO.setWarrantyEndDate(warrantyFormVO.getWarrantyEndDate());
                }

                Date now = new Date();
                if (deviceVO.getWarrantyForm() != null && (deviceVO.getWarrantyForm().getWarrantyEndDate() == null || !now.after(deviceVO.getWarrantyForm().getWarrantyEndDate()))) {
                    deviceVO.setExpired(false);
                } else {
                    deviceVO.setExpired(true);
                }

                deviceVOList.add(deviceVO);
            }

            LOGGER.info("Device View list size " + deviceVOList.size());
        }

        return deviceVOList;
    }

    public Device get(Long deviceId) throws SystemException, PortalException {
        return DeviceLocalServiceUtil.getDevice(deviceId);
    }

    public Device create() throws SystemException, PortalException {
        Long deviceId = CounterLocalServiceUtil.increment(Device.class.getName());
        Device device = DeviceLocalServiceUtil.createDevice(deviceId);
        device.setCreateDate(Calendar.getInstance().getTime());
        return device;
    }

    public Device updateDevice(Device device) throws SystemException {
        return DeviceLocalServiceUtil.updateDevice(device);
    }

    public Device deleteDevice(Long deviceId) throws SystemException, PortalException {
        Device device = DeviceLocalServiceUtil.deleteDevice(deviceId);
        try {
            WarrantyFormLocalServiceUtil.deleteWarrantyForm(device.getWarrantyFormId());
        } catch (NoSuchWarrantyFormException e) {

        }
        return device;
    }

    public Integer getDevicesCount() throws SystemException {
        return DeviceLocalServiceUtil.getDevicesCount();
    }

    public Device getBySerialNumber(String serialNumber) throws NoSuchDeviceException, SystemException {
        return DeviceLocalServiceUtil.getBySerialNumber(serialNumber);
    }

    public List<Device> deleteDevice(List<Long> deviceIds) throws PortalException, SystemException {
        List<Device> result = new ArrayList<>();
        for (Long deviceId : deviceIds) {
            result.add(deleteDevice(deviceId));
        }
        return result;
    }

    public List<Device> getByPurchaseOrderNumber(Long purchaseOrderId) throws SystemException {
        return DeviceLocalServiceUtil.findByPurchaseOrderId(purchaseOrderId);
    }

    //TODO refactor to 1 query
    public List<Device> get(List<Long> deviceIds) throws PortalException, SystemException {
        List<Device> devices = new ArrayList<>();
        for (Long deviceId : deviceIds) {
            devices.add(get(deviceId));
        }
        return devices;
    }

    public Device updateDevice(DeviceVO deviceVO) throws SystemException, PortalException {
        Device device = null;
        if (deviceVO.getDeviceId() == null) {
            device = create();
        } else {
            device = get(deviceVO.getDeviceId());
        }

        deviceVO.update(device);
        WarrantyForm warrantyForm = null;
        try {
        	if (device.getWarrantyFormId() != null) {
        		warrantyForm = warrantyFormService.get(device.getWarrantyFormId());
        	} else {
        		warrantyForm = warrantyFormService.create();
        		device.setWarrantyFormId(warrantyForm.getWarrantyFormId());
        	}
        } catch (NoSuchWarrantyFormException e) {
            warrantyForm = warrantyFormService.create();
            device.setWarrantyFormId(warrantyForm.getWarrantyFormId());
        }
        warrantyForm.setWarrantyEndDate(deviceVO.getWarrantyEndDate());
        warrantyForm.setWarrantyStartDate(deviceVO.getWarrantyStartDate());
        warrantyFormService.updateWarrantyForm(warrantyForm);
        return updateDevice(device);
    }
}

