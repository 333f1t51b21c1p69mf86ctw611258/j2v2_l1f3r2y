package com.dasannetworks.vn.tms.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.dasannetworks.vn.sb.NoSuchDeviceException;
import com.dasannetworks.vn.sb.model.Device;
import com.dasannetworks.vn.sb.service.DeviceLocalServiceUtil;
import com.dasannetworks.vn.tms.pojo.DevicePOJO;
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

	public static List<DevicePOJO> getDeviceVOList(List<Device> deviceList) {
		List<DevicePOJO> devicePOJOList = new ArrayList<DevicePOJO>();
		if (deviceList != null && !deviceList.isEmpty()) {
			LOGGER.info("Device Size is " + deviceList.size());

			DevicePOJO devicePOJO = null;
			for (Device device : deviceList) {
				devicePOJO = new DevicePOJO();
				BeanUtils.copyProperties(device, devicePOJO);

				Date now = new Date();
				if (devicePOJO.getWarrantyEndDate() == null || !now.after(devicePOJO.getWarrantyEndDate())) {
					devicePOJO.setExpired(false);
				} else {
					devicePOJO.setExpired(true);
				}

				devicePOJOList.add(devicePOJO);
			}
			LOGGER.info("Device View list size " + devicePOJOList.size());
		}
		return devicePOJOList;
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
        return DeviceLocalServiceUtil.deleteDevice(deviceId);
    }

    public Device getOrCreate(Long deviceId) throws PortalException, SystemException {
        if (deviceId != null) {
            return get(deviceId);
        } else {
            return create();
        }
    }

    public Integer getDevicesCount() throws SystemException {
        return DeviceLocalServiceUtil.getDevicesCount();
    }

    public Device getBySerialNumber(String serialNumber) throws NoSuchDeviceException, SystemException {
        return DeviceLocalServiceUtil.getBySerialNumber(serialNumber);
    }
}
