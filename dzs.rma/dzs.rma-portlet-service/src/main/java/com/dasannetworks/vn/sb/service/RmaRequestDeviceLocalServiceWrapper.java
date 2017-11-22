package com.dasannetworks.vn.sb.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RmaRequestDeviceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see RmaRequestDeviceLocalService
 * @generated
 */
public class RmaRequestDeviceLocalServiceWrapper
    implements RmaRequestDeviceLocalService,
        ServiceWrapper<RmaRequestDeviceLocalService> {
    private RmaRequestDeviceLocalService _rmaRequestDeviceLocalService;

    public RmaRequestDeviceLocalServiceWrapper(
        RmaRequestDeviceLocalService rmaRequestDeviceLocalService) {
        _rmaRequestDeviceLocalService = rmaRequestDeviceLocalService;
    }

    /**
    * Adds the rma request device to the database. Also notifies the appropriate model listeners.
    *
    * @param rmaRequestDevice the rma request device
    * @return the rma request device that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.RmaRequestDevice addRmaRequestDevice(
        com.dasannetworks.vn.sb.model.RmaRequestDevice rmaRequestDevice)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rmaRequestDeviceLocalService.addRmaRequestDevice(rmaRequestDevice);
    }

    /**
    * Creates a new rma request device with the primary key. Does not add the rma request device to the database.
    *
    * @param rmaRequestDevicePK the primary key for the new rma request device
    * @return the new rma request device
    */
    @Override
    public com.dasannetworks.vn.sb.model.RmaRequestDevice createRmaRequestDevice(
        com.dasannetworks.vn.sb.service.persistence.RmaRequestDevicePK rmaRequestDevicePK) {
        return _rmaRequestDeviceLocalService.createRmaRequestDevice(rmaRequestDevicePK);
    }

    /**
    * Deletes the rma request device with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param rmaRequestDevicePK the primary key of the rma request device
    * @return the rma request device that was removed
    * @throws PortalException if a rma request device with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.RmaRequestDevice deleteRmaRequestDevice(
        com.dasannetworks.vn.sb.service.persistence.RmaRequestDevicePK rmaRequestDevicePK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _rmaRequestDeviceLocalService.deleteRmaRequestDevice(rmaRequestDevicePK);
    }

    /**
    * Deletes the rma request device from the database. Also notifies the appropriate model listeners.
    *
    * @param rmaRequestDevice the rma request device
    * @return the rma request device that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.RmaRequestDevice deleteRmaRequestDevice(
        com.dasannetworks.vn.sb.model.RmaRequestDevice rmaRequestDevice)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rmaRequestDeviceLocalService.deleteRmaRequestDevice(rmaRequestDevice);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _rmaRequestDeviceLocalService.dynamicQuery();
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
        return _rmaRequestDeviceLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _rmaRequestDeviceLocalService.dynamicQuery(dynamicQuery, start,
            end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _rmaRequestDeviceLocalService.dynamicQuery(dynamicQuery, start,
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
        return _rmaRequestDeviceLocalService.dynamicQueryCount(dynamicQuery);
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
        return _rmaRequestDeviceLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.dasannetworks.vn.sb.model.RmaRequestDevice fetchRmaRequestDevice(
        com.dasannetworks.vn.sb.service.persistence.RmaRequestDevicePK rmaRequestDevicePK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rmaRequestDeviceLocalService.fetchRmaRequestDevice(rmaRequestDevicePK);
    }

    /**
    * Returns the rma request device with the primary key.
    *
    * @param rmaRequestDevicePK the primary key of the rma request device
    * @return the rma request device
    * @throws PortalException if a rma request device with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.RmaRequestDevice getRmaRequestDevice(
        com.dasannetworks.vn.sb.service.persistence.RmaRequestDevicePK rmaRequestDevicePK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _rmaRequestDeviceLocalService.getRmaRequestDevice(rmaRequestDevicePK);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _rmaRequestDeviceLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the rma request devices.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of rma request devices
    * @param end the upper bound of the range of rma request devices (not inclusive)
    * @return the range of rma request devices
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.dasannetworks.vn.sb.model.RmaRequestDevice> getRmaRequestDevices(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rmaRequestDeviceLocalService.getRmaRequestDevices(start, end);
    }

    /**
    * Returns the number of rma request devices.
    *
    * @return the number of rma request devices
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getRmaRequestDevicesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rmaRequestDeviceLocalService.getRmaRequestDevicesCount();
    }

    /**
    * Updates the rma request device in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param rmaRequestDevice the rma request device
    * @return the rma request device that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.RmaRequestDevice updateRmaRequestDevice(
        com.dasannetworks.vn.sb.model.RmaRequestDevice rmaRequestDevice)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rmaRequestDeviceLocalService.updateRmaRequestDevice(rmaRequestDevice);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _rmaRequestDeviceLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _rmaRequestDeviceLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _rmaRequestDeviceLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public RmaRequestDeviceLocalService getWrappedRmaRequestDeviceLocalService() {
        return _rmaRequestDeviceLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedRmaRequestDeviceLocalService(
        RmaRequestDeviceLocalService rmaRequestDeviceLocalService) {
        _rmaRequestDeviceLocalService = rmaRequestDeviceLocalService;
    }

    @Override
    public RmaRequestDeviceLocalService getWrappedService() {
        return _rmaRequestDeviceLocalService;
    }

    @Override
    public void setWrappedService(
        RmaRequestDeviceLocalService rmaRequestDeviceLocalService) {
        _rmaRequestDeviceLocalService = rmaRequestDeviceLocalService;
    }
}
