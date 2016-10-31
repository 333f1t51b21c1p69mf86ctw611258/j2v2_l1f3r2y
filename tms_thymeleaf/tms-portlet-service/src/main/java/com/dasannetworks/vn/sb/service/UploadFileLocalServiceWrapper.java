package com.dasannetworks.vn.sb.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UploadFileLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see UploadFileLocalService
 * @generated
 */
public class UploadFileLocalServiceWrapper implements UploadFileLocalService,
    ServiceWrapper<UploadFileLocalService> {
    private UploadFileLocalService _uploadFileLocalService;

    public UploadFileLocalServiceWrapper(
        UploadFileLocalService uploadFileLocalService) {
        _uploadFileLocalService = uploadFileLocalService;
    }

    /**
    * Adds the upload file to the database. Also notifies the appropriate model listeners.
    *
    * @param uploadFile the upload file
    * @return the upload file that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.UploadFile addUploadFile(
        com.dasannetworks.vn.sb.model.UploadFile uploadFile)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _uploadFileLocalService.addUploadFile(uploadFile);
    }

    /**
    * Creates a new upload file with the primary key. Does not add the upload file to the database.
    *
    * @param uploadFileId the primary key for the new upload file
    * @return the new upload file
    */
    @Override
    public com.dasannetworks.vn.sb.model.UploadFile createUploadFile(
        long uploadFileId) {
        return _uploadFileLocalService.createUploadFile(uploadFileId);
    }

    /**
    * Deletes the upload file with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param uploadFileId the primary key of the upload file
    * @return the upload file that was removed
    * @throws PortalException if a upload file with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.UploadFile deleteUploadFile(
        long uploadFileId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _uploadFileLocalService.deleteUploadFile(uploadFileId);
    }

    /**
    * Deletes the upload file from the database. Also notifies the appropriate model listeners.
    *
    * @param uploadFile the upload file
    * @return the upload file that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.UploadFile deleteUploadFile(
        com.dasannetworks.vn.sb.model.UploadFile uploadFile)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _uploadFileLocalService.deleteUploadFile(uploadFile);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _uploadFileLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _uploadFileLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.UploadFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _uploadFileLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.UploadFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _uploadFileLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _uploadFileLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _uploadFileLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.dasannetworks.vn.sb.model.UploadFile fetchUploadFile(
        long uploadFileId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _uploadFileLocalService.fetchUploadFile(uploadFileId);
    }

    /**
    * Returns the upload file with the primary key.
    *
    * @param uploadFileId the primary key of the upload file
    * @return the upload file
    * @throws PortalException if a upload file with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.UploadFile getUploadFile(
        long uploadFileId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _uploadFileLocalService.getUploadFile(uploadFileId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _uploadFileLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the upload files.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.UploadFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of upload files
    * @param end the upper bound of the range of upload files (not inclusive)
    * @return the range of upload files
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.dasannetworks.vn.sb.model.UploadFile> getUploadFiles(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _uploadFileLocalService.getUploadFiles(start, end);
    }

    /**
    * Returns the number of upload files.
    *
    * @return the number of upload files
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getUploadFilesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _uploadFileLocalService.getUploadFilesCount();
    }

    /**
    * Updates the upload file in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param uploadFile the upload file
    * @return the upload file that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.UploadFile updateUploadFile(
        com.dasannetworks.vn.sb.model.UploadFile uploadFile)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _uploadFileLocalService.updateUploadFile(uploadFile);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _uploadFileLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _uploadFileLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _uploadFileLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public UploadFileLocalService getWrappedUploadFileLocalService() {
        return _uploadFileLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedUploadFileLocalService(
        UploadFileLocalService uploadFileLocalService) {
        _uploadFileLocalService = uploadFileLocalService;
    }

    @Override
    public UploadFileLocalService getWrappedService() {
        return _uploadFileLocalService;
    }

    @Override
    public void setWrappedService(UploadFileLocalService uploadFileLocalService) {
        _uploadFileLocalService = uploadFileLocalService;
    }
}
