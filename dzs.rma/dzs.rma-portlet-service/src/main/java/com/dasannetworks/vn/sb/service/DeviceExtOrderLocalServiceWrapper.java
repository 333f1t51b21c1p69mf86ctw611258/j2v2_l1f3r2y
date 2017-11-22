package com.dasannetworks.vn.sb.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DeviceExtOrderLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DeviceExtOrderLocalService
 * @generated
 */
public class DeviceExtOrderLocalServiceWrapper
    implements DeviceExtOrderLocalService,
        ServiceWrapper<DeviceExtOrderLocalService> {
    private DeviceExtOrderLocalService _deviceExtOrderLocalService;

    public DeviceExtOrderLocalServiceWrapper(
        DeviceExtOrderLocalService deviceExtOrderLocalService) {
        _deviceExtOrderLocalService = deviceExtOrderLocalService;
    }

    /**
    * Adds the device ext order to the database. Also notifies the appropriate model listeners.
    *
    * @param deviceExtOrder the device ext order
    * @return the device ext order that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.DeviceExtOrder addDeviceExtOrder(
        com.dasannetworks.vn.sb.model.DeviceExtOrder deviceExtOrder)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceExtOrderLocalService.addDeviceExtOrder(deviceExtOrder);
    }

    /**
    * Creates a new device ext order with the primary key. Does not add the device ext order to the database.
    *
    * @param deviceExtOrderId the primary key for the new device ext order
    * @return the new device ext order
    */
    @Override
    public com.dasannetworks.vn.sb.model.DeviceExtOrder createDeviceExtOrder(
        long deviceExtOrderId) {
        return _deviceExtOrderLocalService.createDeviceExtOrder(deviceExtOrderId);
    }

    /**
    * Deletes the device ext order with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param deviceExtOrderId the primary key of the device ext order
    * @return the device ext order that was removed
    * @throws PortalException if a device ext order with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.DeviceExtOrder deleteDeviceExtOrder(
        long deviceExtOrderId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _deviceExtOrderLocalService.deleteDeviceExtOrder(deviceExtOrderId);
    }

    /**
    * Deletes the device ext order from the database. Also notifies the appropriate model listeners.
    *
    * @param deviceExtOrder the device ext order
    * @return the device ext order that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.DeviceExtOrder deleteDeviceExtOrder(
        com.dasannetworks.vn.sb.model.DeviceExtOrder deviceExtOrder)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceExtOrderLocalService.deleteDeviceExtOrder(deviceExtOrder);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _deviceExtOrderLocalService.dynamicQuery();
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
        return _deviceExtOrderLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceExtOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _deviceExtOrderLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceExtOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _deviceExtOrderLocalService.dynamicQuery(dynamicQuery, start,
            end, orderByComparator);
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
        return _deviceExtOrderLocalService.dynamicQueryCount(dynamicQuery);
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
        return _deviceExtOrderLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.dasannetworks.vn.sb.model.DeviceExtOrder fetchDeviceExtOrder(
        long deviceExtOrderId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceExtOrderLocalService.fetchDeviceExtOrder(deviceExtOrderId);
    }

    /**
    * Returns the device ext order with the primary key.
    *
    * @param deviceExtOrderId the primary key of the device ext order
    * @return the device ext order
    * @throws PortalException if a device ext order with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.DeviceExtOrder getDeviceExtOrder(
        long deviceExtOrderId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _deviceExtOrderLocalService.getDeviceExtOrder(deviceExtOrderId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _deviceExtOrderLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the device ext orders.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceExtOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of device ext orders
    * @param end the upper bound of the range of device ext orders (not inclusive)
    * @return the range of device ext orders
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.dasannetworks.vn.sb.model.DeviceExtOrder> getDeviceExtOrders(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceExtOrderLocalService.getDeviceExtOrders(start, end);
    }

    /**
    * Returns the number of device ext orders.
    *
    * @return the number of device ext orders
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getDeviceExtOrdersCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceExtOrderLocalService.getDeviceExtOrdersCount();
    }

    /**
    * Updates the device ext order in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param deviceExtOrder the device ext order
    * @return the device ext order that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.DeviceExtOrder updateDeviceExtOrder(
        com.dasannetworks.vn.sb.model.DeviceExtOrder deviceExtOrder)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceExtOrderLocalService.updateDeviceExtOrder(deviceExtOrder);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _deviceExtOrderLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _deviceExtOrderLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _deviceExtOrderLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public DeviceExtOrderLocalService getWrappedDeviceExtOrderLocalService() {
        return _deviceExtOrderLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedDeviceExtOrderLocalService(
        DeviceExtOrderLocalService deviceExtOrderLocalService) {
        _deviceExtOrderLocalService = deviceExtOrderLocalService;
    }

    @Override
    public DeviceExtOrderLocalService getWrappedService() {
        return _deviceExtOrderLocalService;
    }

    @Override
    public void setWrappedService(
        DeviceExtOrderLocalService deviceExtOrderLocalService) {
        _deviceExtOrderLocalService = deviceExtOrderLocalService;
    }
}
