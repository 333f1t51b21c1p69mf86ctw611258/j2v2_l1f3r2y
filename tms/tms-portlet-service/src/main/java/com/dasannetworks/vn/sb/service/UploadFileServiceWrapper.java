package com.dasannetworks.vn.sb.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UploadFileService}.
 *
 * @author Brian Wing Shun Chan
 * @see UploadFileService
 * @generated
 */
public class UploadFileServiceWrapper implements UploadFileService,
    ServiceWrapper<UploadFileService> {
    private UploadFileService _uploadFileService;

    public UploadFileServiceWrapper(UploadFileService uploadFileService) {
        _uploadFileService = uploadFileService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _uploadFileService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _uploadFileService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _uploadFileService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public UploadFileService getWrappedUploadFileService() {
        return _uploadFileService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedUploadFileService(UploadFileService uploadFileService) {
        _uploadFileService = uploadFileService;
    }

    @Override
    public UploadFileService getWrappedService() {
        return _uploadFileService;
    }

    @Override
    public void setWrappedService(UploadFileService uploadFileService) {
        _uploadFileService = uploadFileService;
    }
}
