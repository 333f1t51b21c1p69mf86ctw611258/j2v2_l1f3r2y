package com.dasannetworks.vn.sb.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DeviceService}.
 *
 * @author Brian Wing Shun Chan
 * @see DeviceService
 * @generated
 */
public class DeviceServiceWrapper implements DeviceService,
    ServiceWrapper<DeviceService> {
    private DeviceService _deviceService;

    public DeviceServiceWrapper(DeviceService deviceService) {
        _deviceService = deviceService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _deviceService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _deviceService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _deviceService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public DeviceService getWrappedDeviceService() {
        return _deviceService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedDeviceService(DeviceService deviceService) {
        _deviceService = deviceService;
    }

    @Override
    public DeviceService getWrappedService() {
        return _deviceService;
    }

    @Override
    public void setWrappedService(DeviceService deviceService) {
        _deviceService = deviceService;
    }
}
