package com.dasannetworks.vn.sb.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for DeviceHis. This utility wraps
 * {@link com.dasannetworks.vn.sb.service.impl.DeviceHisLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see DeviceHisLocalService
 * @see com.dasannetworks.vn.sb.service.base.DeviceHisLocalServiceBaseImpl
 * @see com.dasannetworks.vn.sb.service.impl.DeviceHisLocalServiceImpl
 * @generated
 */
public class DeviceHisLocalServiceUtil {
    private static DeviceHisLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.dasannetworks.vn.sb.service.impl.DeviceHisLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the device his to the database. Also notifies the appropriate model listeners.
    *
    * @param deviceHis the device his
    * @return the device his that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis addDeviceHis(
        com.dasannetworks.vn.sb.model.DeviceHis deviceHis)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addDeviceHis(deviceHis);
    }

    /**
    * Creates a new device his with the primary key. Does not add the device his to the database.
    *
    * @param deviceId the primary key for the new device his
    * @return the new device his
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis createDeviceHis(
        long deviceId) {
        return getService().createDeviceHis(deviceId);
    }

    /**
    * Deletes the device his with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param deviceId the primary key of the device his
    * @return the device his that was removed
    * @throws PortalException if a device his with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis deleteDeviceHis(
        long deviceId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteDeviceHis(deviceId);
    }

    /**
    * Deletes the device his from the database. Also notifies the appropriate model listeners.
    *
    * @param deviceHis the device his
    * @return the device his that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis deleteDeviceHis(
        com.dasannetworks.vn.sb.model.DeviceHis deviceHis)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteDeviceHis(deviceHis);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.dasannetworks.vn.sb.model.DeviceHis fetchDeviceHis(
        long deviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchDeviceHis(deviceId);
    }

    /**
    * Returns the device his with the primary key.
    *
    * @param deviceId the primary key of the device his
    * @return the device his
    * @throws PortalException if a device his with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis getDeviceHis(
        long deviceId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getDeviceHis(deviceId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<com.dasannetworks.vn.sb.model.DeviceHis> getDeviceHises(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getDeviceHises(start, end);
    }

    /**
    * Returns the number of device hises.
    *
    * @return the number of device hises
    * @throws SystemException if a system exception occurred
    */
    public static int getDeviceHisesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getDeviceHisesCount();
    }

    /**
    * Updates the device his in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param deviceHis the device his
    * @return the device his that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis updateDeviceHis(
        com.dasannetworks.vn.sb.model.DeviceHis deviceHis)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateDeviceHis(deviceHis);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static void clearService() {
        _service = null;
    }

    public static DeviceHisLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    DeviceHisLocalService.class.getName());

            if (invokableLocalService instanceof DeviceHisLocalService) {
                _service = (DeviceHisLocalService) invokableLocalService;
            } else {
                _service = new DeviceHisLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(DeviceHisLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(DeviceHisLocalService service) {
    }
}
