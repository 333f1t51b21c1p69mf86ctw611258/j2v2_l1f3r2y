package com.dasannetworks.vn.sb.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DeviceExtLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DeviceExtLocalService
 * @generated
 */
public class DeviceExtLocalServiceWrapper implements DeviceExtLocalService,
    ServiceWrapper<DeviceExtLocalService> {
    private DeviceExtLocalService _deviceExtLocalService;

    public DeviceExtLocalServiceWrapper(
        DeviceExtLocalService deviceExtLocalService) {
        _deviceExtLocalService = deviceExtLocalService;
    }

    /**
    * Adds the device ext to the database. Also notifies the appropriate model listeners.
    *
    * @param deviceExt the device ext
    * @return the device ext that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.DeviceExt addDeviceExt(
        com.dasannetworks.vn.sb.model.DeviceExt deviceExt)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceExtLocalService.addDeviceExt(deviceExt);
    }

    /**
    * Creates a new device ext with the primary key. Does not add the device ext to the database.
    *
    * @param deviceExtId the primary key for the new device ext
    * @return the new device ext
    */
    @Override
    public com.dasannetworks.vn.sb.model.DeviceExt createDeviceExt(
        long deviceExtId) {
        return _deviceExtLocalService.createDeviceExt(deviceExtId);
    }

    /**
    * Deletes the device ext with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param deviceExtId the primary key of the device ext
    * @return the device ext that was removed
    * @throws PortalException if a device ext with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.DeviceExt deleteDeviceExt(
        long deviceExtId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _deviceExtLocalService.deleteDeviceExt(deviceExtId);
    }

    /**
    * Deletes the device ext from the database. Also notifies the appropriate model listeners.
    *
    * @param deviceExt the device ext
    * @return the device ext that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.DeviceExt deleteDeviceExt(
        com.dasannetworks.vn.sb.model.DeviceExt deviceExt)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceExtLocalService.deleteDeviceExt(deviceExt);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _deviceExtLocalService.dynamicQuery();
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
        return _deviceExtLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceExtModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _deviceExtLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceExtModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _deviceExtLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _deviceExtLocalService.dynamicQueryCount(dynamicQuery);
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
        return _deviceExtLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.dasannetworks.vn.sb.model.DeviceExt fetchDeviceExt(
        long deviceExtId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceExtLocalService.fetchDeviceExt(deviceExtId);
    }

    /**
    * Returns the device ext with the primary key.
    *
    * @param deviceExtId the primary key of the device ext
    * @return the device ext
    * @throws PortalException if a device ext with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.DeviceExt getDeviceExt(
        long deviceExtId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _deviceExtLocalService.getDeviceExt(deviceExtId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _deviceExtLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the device exts.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceExtModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of device exts
    * @param end the upper bound of the range of device exts (not inclusive)
    * @return the range of device exts
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.dasannetworks.vn.sb.model.DeviceExt> getDeviceExts(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceExtLocalService.getDeviceExts(start, end);
    }

    /**
    * Returns the number of device exts.
    *
    * @return the number of device exts
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getDeviceExtsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceExtLocalService.getDeviceExtsCount();
    }

    /**
    * Updates the device ext in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param deviceExt the device ext
    * @return the device ext that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.DeviceExt updateDeviceExt(
        com.dasannetworks.vn.sb.model.DeviceExt deviceExt)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceExtLocalService.updateDeviceExt(deviceExt);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _deviceExtLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _deviceExtLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _deviceExtLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public DeviceExtLocalService getWrappedDeviceExtLocalService() {
        return _deviceExtLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedDeviceExtLocalService(
        DeviceExtLocalService deviceExtLocalService) {
        _deviceExtLocalService = deviceExtLocalService;
    }

    @Override
    public DeviceExtLocalService getWrappedService() {
        return _deviceExtLocalService;
    }

    @Override
    public void setWrappedService(DeviceExtLocalService deviceExtLocalService) {
        _deviceExtLocalService = deviceExtLocalService;
    }
}
