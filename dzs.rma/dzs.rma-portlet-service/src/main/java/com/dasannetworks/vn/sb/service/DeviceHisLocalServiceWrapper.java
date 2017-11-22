package com.dasannetworks.vn.sb.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DeviceHisLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DeviceHisLocalService
 * @generated
 */
public class DeviceHisLocalServiceWrapper implements DeviceHisLocalService,
    ServiceWrapper<DeviceHisLocalService> {
    private DeviceHisLocalService _deviceHisLocalService;

    public DeviceHisLocalServiceWrapper(
        DeviceHisLocalService deviceHisLocalService) {
        _deviceHisLocalService = deviceHisLocalService;
    }

    /**
    * Adds the device his to the database. Also notifies the appropriate model listeners.
    *
    * @param deviceHis the device his
    * @return the device his that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.DeviceHis addDeviceHis(
        com.dasannetworks.vn.sb.model.DeviceHis deviceHis)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceHisLocalService.addDeviceHis(deviceHis);
    }

    /**
    * Creates a new device his with the primary key. Does not add the device his to the database.
    *
    * @param deviceId the primary key for the new device his
    * @return the new device his
    */
    @Override
    public com.dasannetworks.vn.sb.model.DeviceHis createDeviceHis(
        long deviceId) {
        return _deviceHisLocalService.createDeviceHis(deviceId);
    }

    /**
    * Deletes the device his with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param deviceId the primary key of the device his
    * @return the device his that was removed
    * @throws PortalException if a device his with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.DeviceHis deleteDeviceHis(
        long deviceId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _deviceHisLocalService.deleteDeviceHis(deviceId);
    }

    /**
    * Deletes the device his from the database. Also notifies the appropriate model listeners.
    *
    * @param deviceHis the device his
    * @return the device his that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.DeviceHis deleteDeviceHis(
        com.dasannetworks.vn.sb.model.DeviceHis deviceHis)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceHisLocalService.deleteDeviceHis(deviceHis);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _deviceHisLocalService.dynamicQuery();
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
        return _deviceHisLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceHisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _deviceHisLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceHisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _deviceHisLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _deviceHisLocalService.dynamicQueryCount(dynamicQuery);
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
        return _deviceHisLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.dasannetworks.vn.sb.model.DeviceHis fetchDeviceHis(long deviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceHisLocalService.fetchDeviceHis(deviceId);
    }

    /**
    * Returns the device his with the primary key.
    *
    * @param deviceId the primary key of the device his
    * @return the device his
    * @throws PortalException if a device his with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.DeviceHis getDeviceHis(long deviceId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _deviceHisLocalService.getDeviceHis(deviceId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _deviceHisLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the device hises.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceHisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of device hises
    * @param end the upper bound of the range of device hises (not inclusive)
    * @return the range of device hises
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.dasannetworks.vn.sb.model.DeviceHis> getDeviceHises(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceHisLocalService.getDeviceHises(start, end);
    }

    /**
    * Returns the number of device hises.
    *
    * @return the number of device hises
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getDeviceHisesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceHisLocalService.getDeviceHisesCount();
    }

    /**
    * Updates the device his in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param deviceHis the device his
    * @return the device his that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.DeviceHis updateDeviceHis(
        com.dasannetworks.vn.sb.model.DeviceHis deviceHis)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceHisLocalService.updateDeviceHis(deviceHis);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _deviceHisLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _deviceHisLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _deviceHisLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public DeviceHisLocalService getWrappedDeviceHisLocalService() {
        return _deviceHisLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedDeviceHisLocalService(
        DeviceHisLocalService deviceHisLocalService) {
        _deviceHisLocalService = deviceHisLocalService;
    }

    @Override
    public DeviceHisLocalService getWrappedService() {
        return _deviceHisLocalService;
    }

    @Override
    public void setWrappedService(DeviceHisLocalService deviceHisLocalService) {
        _deviceHisLocalService = deviceHisLocalService;
    }
}
