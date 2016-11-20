package com.dasannetworks.vn.sb.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HandOverDeviceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see HandOverDeviceLocalService
 * @generated
 */
public class HandOverDeviceLocalServiceWrapper
    implements HandOverDeviceLocalService,
        ServiceWrapper<HandOverDeviceLocalService> {
    private HandOverDeviceLocalService _handOverDeviceLocalService;

    public HandOverDeviceLocalServiceWrapper(
        HandOverDeviceLocalService handOverDeviceLocalService) {
        _handOverDeviceLocalService = handOverDeviceLocalService;
    }

    /**
    * Adds the hand over device to the database. Also notifies the appropriate model listeners.
    *
    * @param handOverDevice the hand over device
    * @return the hand over device that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.HandOverDevice addHandOverDevice(
        com.dasannetworks.vn.sb.model.HandOverDevice handOverDevice)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _handOverDeviceLocalService.addHandOverDevice(handOverDevice);
    }

    /**
    * Creates a new hand over device with the primary key. Does not add the hand over device to the database.
    *
    * @param handOverDevicePK the primary key for the new hand over device
    * @return the new hand over device
    */
    @Override
    public com.dasannetworks.vn.sb.model.HandOverDevice createHandOverDevice(
        com.dasannetworks.vn.sb.service.persistence.HandOverDevicePK handOverDevicePK) {
        return _handOverDeviceLocalService.createHandOverDevice(handOverDevicePK);
    }

    /**
    * Deletes the hand over device with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param handOverDevicePK the primary key of the hand over device
    * @return the hand over device that was removed
    * @throws PortalException if a hand over device with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.HandOverDevice deleteHandOverDevice(
        com.dasannetworks.vn.sb.service.persistence.HandOverDevicePK handOverDevicePK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _handOverDeviceLocalService.deleteHandOverDevice(handOverDevicePK);
    }

    /**
    * Deletes the hand over device from the database. Also notifies the appropriate model listeners.
    *
    * @param handOverDevice the hand over device
    * @return the hand over device that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.HandOverDevice deleteHandOverDevice(
        com.dasannetworks.vn.sb.model.HandOverDevice handOverDevice)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _handOverDeviceLocalService.deleteHandOverDevice(handOverDevice);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _handOverDeviceLocalService.dynamicQuery();
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
        return _handOverDeviceLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.HandOverDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _handOverDeviceLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.HandOverDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _handOverDeviceLocalService.dynamicQuery(dynamicQuery, start,
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
        return _handOverDeviceLocalService.dynamicQueryCount(dynamicQuery);
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
        return _handOverDeviceLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.dasannetworks.vn.sb.model.HandOverDevice fetchHandOverDevice(
        com.dasannetworks.vn.sb.service.persistence.HandOverDevicePK handOverDevicePK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _handOverDeviceLocalService.fetchHandOverDevice(handOverDevicePK);
    }

    /**
    * Returns the hand over device with the primary key.
    *
    * @param handOverDevicePK the primary key of the hand over device
    * @return the hand over device
    * @throws PortalException if a hand over device with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.HandOverDevice getHandOverDevice(
        com.dasannetworks.vn.sb.service.persistence.HandOverDevicePK handOverDevicePK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _handOverDeviceLocalService.getHandOverDevice(handOverDevicePK);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _handOverDeviceLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the hand over devices.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.HandOverDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of hand over devices
    * @param end the upper bound of the range of hand over devices (not inclusive)
    * @return the range of hand over devices
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.dasannetworks.vn.sb.model.HandOverDevice> getHandOverDevices(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _handOverDeviceLocalService.getHandOverDevices(start, end);
    }

    /**
    * Returns the number of hand over devices.
    *
    * @return the number of hand over devices
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getHandOverDevicesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _handOverDeviceLocalService.getHandOverDevicesCount();
    }

    /**
    * Updates the hand over device in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param handOverDevice the hand over device
    * @return the hand over device that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.HandOverDevice updateHandOverDevice(
        com.dasannetworks.vn.sb.model.HandOverDevice handOverDevice)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _handOverDeviceLocalService.updateHandOverDevice(handOverDevice);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _handOverDeviceLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _handOverDeviceLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _handOverDeviceLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public java.util.List<com.dasannetworks.vn.sb.model.HandOverDevice> findByHandOverFormId(
        long handOverFormId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _handOverDeviceLocalService.findByHandOverFormId(handOverFormId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public HandOverDeviceLocalService getWrappedHandOverDeviceLocalService() {
        return _handOverDeviceLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedHandOverDeviceLocalService(
        HandOverDeviceLocalService handOverDeviceLocalService) {
        _handOverDeviceLocalService = handOverDeviceLocalService;
    }

    @Override
    public HandOverDeviceLocalService getWrappedService() {
        return _handOverDeviceLocalService;
    }

    @Override
    public void setWrappedService(
        HandOverDeviceLocalService handOverDeviceLocalService) {
        _handOverDeviceLocalService = handOverDeviceLocalService;
    }
}
