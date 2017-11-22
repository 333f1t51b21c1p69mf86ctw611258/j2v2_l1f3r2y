package com.dasannetworks.vn.sb.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DeviceExtHisLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DeviceExtHisLocalService
 * @generated
 */
public class DeviceExtHisLocalServiceWrapper implements DeviceExtHisLocalService,
    ServiceWrapper<DeviceExtHisLocalService> {
    private DeviceExtHisLocalService _deviceExtHisLocalService;

    public DeviceExtHisLocalServiceWrapper(
        DeviceExtHisLocalService deviceExtHisLocalService) {
        _deviceExtHisLocalService = deviceExtHisLocalService;
    }

    /**
    * Adds the device ext his to the database. Also notifies the appropriate model listeners.
    *
    * @param deviceExtHis the device ext his
    * @return the device ext his that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.DeviceExtHis addDeviceExtHis(
        com.dasannetworks.vn.sb.model.DeviceExtHis deviceExtHis)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceExtHisLocalService.addDeviceExtHis(deviceExtHis);
    }

    /**
    * Creates a new device ext his with the primary key. Does not add the device ext his to the database.
    *
    * @param deviceExtId the primary key for the new device ext his
    * @return the new device ext his
    */
    @Override
    public com.dasannetworks.vn.sb.model.DeviceExtHis createDeviceExtHis(
        long deviceExtId) {
        return _deviceExtHisLocalService.createDeviceExtHis(deviceExtId);
    }

    /**
    * Deletes the device ext his with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param deviceExtId the primary key of the device ext his
    * @return the device ext his that was removed
    * @throws PortalException if a device ext his with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.DeviceExtHis deleteDeviceExtHis(
        long deviceExtId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _deviceExtHisLocalService.deleteDeviceExtHis(deviceExtId);
    }

    /**
    * Deletes the device ext his from the database. Also notifies the appropriate model listeners.
    *
    * @param deviceExtHis the device ext his
    * @return the device ext his that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.DeviceExtHis deleteDeviceExtHis(
        com.dasannetworks.vn.sb.model.DeviceExtHis deviceExtHis)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceExtHisLocalService.deleteDeviceExtHis(deviceExtHis);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _deviceExtHisLocalService.dynamicQuery();
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
        return _deviceExtHisLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceExtHisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _deviceExtHisLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceExtHisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _deviceExtHisLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _deviceExtHisLocalService.dynamicQueryCount(dynamicQuery);
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
        return _deviceExtHisLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.dasannetworks.vn.sb.model.DeviceExtHis fetchDeviceExtHis(
        long deviceExtId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceExtHisLocalService.fetchDeviceExtHis(deviceExtId);
    }

    /**
    * Returns the device ext his with the primary key.
    *
    * @param deviceExtId the primary key of the device ext his
    * @return the device ext his
    * @throws PortalException if a device ext his with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.DeviceExtHis getDeviceExtHis(
        long deviceExtId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _deviceExtHisLocalService.getDeviceExtHis(deviceExtId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _deviceExtHisLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the device ext hises.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceExtHisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of device ext hises
    * @param end the upper bound of the range of device ext hises (not inclusive)
    * @return the range of device ext hises
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.dasannetworks.vn.sb.model.DeviceExtHis> getDeviceExtHises(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceExtHisLocalService.getDeviceExtHises(start, end);
    }

    /**
    * Returns the number of device ext hises.
    *
    * @return the number of device ext hises
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getDeviceExtHisesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceExtHisLocalService.getDeviceExtHisesCount();
    }

    /**
    * Updates the device ext his in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param deviceExtHis the device ext his
    * @return the device ext his that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.DeviceExtHis updateDeviceExtHis(
        com.dasannetworks.vn.sb.model.DeviceExtHis deviceExtHis)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceExtHisLocalService.updateDeviceExtHis(deviceExtHis);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _deviceExtHisLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _deviceExtHisLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _deviceExtHisLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public DeviceExtHisLocalService getWrappedDeviceExtHisLocalService() {
        return _deviceExtHisLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedDeviceExtHisLocalService(
        DeviceExtHisLocalService deviceExtHisLocalService) {
        _deviceExtHisLocalService = deviceExtHisLocalService;
    }

    @Override
    public DeviceExtHisLocalService getWrappedService() {
        return _deviceExtHisLocalService;
    }

    @Override
    public void setWrappedService(
        DeviceExtHisLocalService deviceExtHisLocalService) {
        _deviceExtHisLocalService = deviceExtHisLocalService;
    }
}
