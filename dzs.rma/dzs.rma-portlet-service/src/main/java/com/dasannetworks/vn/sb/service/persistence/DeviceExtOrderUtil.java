package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.DeviceExtOrder;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the device ext order service. This utility wraps {@link DeviceExtOrderPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DeviceExtOrderPersistence
 * @see DeviceExtOrderPersistenceImpl
 * @generated
 */
public class DeviceExtOrderUtil {
    private static DeviceExtOrderPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(DeviceExtOrder deviceExtOrder) {
        getPersistence().clearCache(deviceExtOrder);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<DeviceExtOrder> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<DeviceExtOrder> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<DeviceExtOrder> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static DeviceExtOrder update(DeviceExtOrder deviceExtOrder)
        throws SystemException {
        return getPersistence().update(deviceExtOrder);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static DeviceExtOrder update(DeviceExtOrder deviceExtOrder,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(deviceExtOrder, serviceContext);
    }

    /**
    * Returns the device ext order where deviceExtOrderNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceExtOrderException} if it could not be found.
    *
    * @param deviceExtOrderNumber the device ext order number
    * @return the matching device ext order
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtOrderException if a matching device ext order could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceExtOrder findByDeviceExtOrderNumber(
        java.lang.String deviceExtOrderNumber)
        throws com.dasannetworks.vn.sb.NoSuchDeviceExtOrderException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByDeviceExtOrderNumber(deviceExtOrderNumber);
    }

    /**
    * Returns the device ext order where deviceExtOrderNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param deviceExtOrderNumber the device ext order number
    * @return the matching device ext order, or <code>null</code> if a matching device ext order could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceExtOrder fetchByDeviceExtOrderNumber(
        java.lang.String deviceExtOrderNumber)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByDeviceExtOrderNumber(deviceExtOrderNumber);
    }

    /**
    * Returns the device ext order where deviceExtOrderNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param deviceExtOrderNumber the device ext order number
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching device ext order, or <code>null</code> if a matching device ext order could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceExtOrder fetchByDeviceExtOrderNumber(
        java.lang.String deviceExtOrderNumber, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByDeviceExtOrderNumber(deviceExtOrderNumber,
            retrieveFromCache);
    }

    /**
    * Removes the device ext order where deviceExtOrderNumber = &#63; from the database.
    *
    * @param deviceExtOrderNumber the device ext order number
    * @return the device ext order that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceExtOrder removeByDeviceExtOrderNumber(
        java.lang.String deviceExtOrderNumber)
        throws com.dasannetworks.vn.sb.NoSuchDeviceExtOrderException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .removeByDeviceExtOrderNumber(deviceExtOrderNumber);
    }

    /**
    * Returns the number of device ext orders where deviceExtOrderNumber = &#63;.
    *
    * @param deviceExtOrderNumber the device ext order number
    * @return the number of matching device ext orders
    * @throws SystemException if a system exception occurred
    */
    public static int countByDeviceExtOrderNumber(
        java.lang.String deviceExtOrderNumber)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByDeviceExtOrderNumber(deviceExtOrderNumber);
    }

    /**
    * Caches the device ext order in the entity cache if it is enabled.
    *
    * @param deviceExtOrder the device ext order
    */
    public static void cacheResult(
        com.dasannetworks.vn.sb.model.DeviceExtOrder deviceExtOrder) {
        getPersistence().cacheResult(deviceExtOrder);
    }

    /**
    * Caches the device ext orders in the entity cache if it is enabled.
    *
    * @param deviceExtOrders the device ext orders
    */
    public static void cacheResult(
        java.util.List<com.dasannetworks.vn.sb.model.DeviceExtOrder> deviceExtOrders) {
        getPersistence().cacheResult(deviceExtOrders);
    }

    /**
    * Creates a new device ext order with the primary key. Does not add the device ext order to the database.
    *
    * @param deviceExtOrderId the primary key for the new device ext order
    * @return the new device ext order
    */
    public static com.dasannetworks.vn.sb.model.DeviceExtOrder create(
        long deviceExtOrderId) {
        return getPersistence().create(deviceExtOrderId);
    }

    /**
    * Removes the device ext order with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param deviceExtOrderId the primary key of the device ext order
    * @return the device ext order that was removed
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtOrderException if a device ext order with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceExtOrder remove(
        long deviceExtOrderId)
        throws com.dasannetworks.vn.sb.NoSuchDeviceExtOrderException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(deviceExtOrderId);
    }

    public static com.dasannetworks.vn.sb.model.DeviceExtOrder updateImpl(
        com.dasannetworks.vn.sb.model.DeviceExtOrder deviceExtOrder)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(deviceExtOrder);
    }

    /**
    * Returns the device ext order with the primary key or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceExtOrderException} if it could not be found.
    *
    * @param deviceExtOrderId the primary key of the device ext order
    * @return the device ext order
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtOrderException if a device ext order with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceExtOrder findByPrimaryKey(
        long deviceExtOrderId)
        throws com.dasannetworks.vn.sb.NoSuchDeviceExtOrderException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(deviceExtOrderId);
    }

    /**
    * Returns the device ext order with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param deviceExtOrderId the primary key of the device ext order
    * @return the device ext order, or <code>null</code> if a device ext order with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceExtOrder fetchByPrimaryKey(
        long deviceExtOrderId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(deviceExtOrderId);
    }

    /**
    * Returns all the device ext orders.
    *
    * @return the device ext orders
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.DeviceExtOrder> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.dasannetworks.vn.sb.model.DeviceExtOrder> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the device ext orders.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceExtOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of device ext orders
    * @param end the upper bound of the range of device ext orders (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of device ext orders
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.DeviceExtOrder> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the device ext orders from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of device ext orders.
    *
    * @return the number of device ext orders
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static DeviceExtOrderPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (DeviceExtOrderPersistence) PortletBeanLocatorUtil.locate(com.dasannetworks.vn.sb.service.ClpSerializer.getServletContextName(),
                    DeviceExtOrderPersistence.class.getName());

            ReferenceRegistry.registerReference(DeviceExtOrderUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(DeviceExtOrderPersistence persistence) {
    }
}
