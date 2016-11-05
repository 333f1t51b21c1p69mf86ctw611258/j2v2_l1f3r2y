package com.dasannetworks.vn.tms.service;

import com.dasannetworks.vn.sb.NoSuchDeviceException;
import com.dasannetworks.vn.sb.model.Device;
import com.dasannetworks.vn.sb.service.DeviceLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import org.springframework.stereotype.Service;

import java.util.Calendar;

/**
 *
 */
@Service
public class DeviceService {
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
