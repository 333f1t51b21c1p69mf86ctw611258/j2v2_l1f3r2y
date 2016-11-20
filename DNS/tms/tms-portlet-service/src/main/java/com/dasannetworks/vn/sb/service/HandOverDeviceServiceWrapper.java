package com.dasannetworks.vn.sb.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HandOverDeviceService}.
 *
 * @author Brian Wing Shun Chan
 * @see HandOverDeviceService
 * @generated
 */
public class HandOverDeviceServiceWrapper implements HandOverDeviceService,
    ServiceWrapper<HandOverDeviceService> {
    private HandOverDeviceService _handOverDeviceService;

    public HandOverDeviceServiceWrapper(
        HandOverDeviceService handOverDeviceService) {
        _handOverDeviceService = handOverDeviceService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _handOverDeviceService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _handOverDeviceService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _handOverDeviceService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public HandOverDeviceService getWrappedHandOverDeviceService() {
        return _handOverDeviceService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedHandOverDeviceService(
        HandOverDeviceService handOverDeviceService) {
        _handOverDeviceService = handOverDeviceService;
    }

    @Override
    public HandOverDeviceService getWrappedService() {
        return _handOverDeviceService;
    }

    @Override
    public void setWrappedService(HandOverDeviceService handOverDeviceService) {
        _handOverDeviceService = handOverDeviceService;
    }
}
