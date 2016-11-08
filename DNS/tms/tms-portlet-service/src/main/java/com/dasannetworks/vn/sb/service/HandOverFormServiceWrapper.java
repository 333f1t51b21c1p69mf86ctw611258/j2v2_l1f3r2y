package com.dasannetworks.vn.sb.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HandOverFormService}.
 *
 * @author Brian Wing Shun Chan
 * @see HandOverFormService
 * @generated
 */
public class HandOverFormServiceWrapper implements HandOverFormService,
    ServiceWrapper<HandOverFormService> {
    private HandOverFormService _handOverFormService;

    public HandOverFormServiceWrapper(HandOverFormService handOverFormService) {
        _handOverFormService = handOverFormService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _handOverFormService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _handOverFormService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _handOverFormService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public HandOverFormService getWrappedHandOverFormService() {
        return _handOverFormService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedHandOverFormService(
        HandOverFormService handOverFormService) {
        _handOverFormService = handOverFormService;
    }

    @Override
    public HandOverFormService getWrappedService() {
        return _handOverFormService;
    }

    @Override
    public void setWrappedService(HandOverFormService handOverFormService) {
        _handOverFormService = handOverFormService;
    }
}
