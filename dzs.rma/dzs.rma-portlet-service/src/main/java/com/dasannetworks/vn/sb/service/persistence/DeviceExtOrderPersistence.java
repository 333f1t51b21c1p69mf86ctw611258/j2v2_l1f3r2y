package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.DeviceExtOrder;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the device ext order service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DeviceExtOrderPersistenceImpl
 * @see DeviceExtOrderUtil
 * @generated
 */
public interface DeviceExtOrderPersistence extends BasePersistence<DeviceExtOrder> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link DeviceExtOrderUtil} to access the device ext order persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns the device ext order where deviceExtOrderNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceExtOrderException} if it could not be found.
    *
    * @param deviceExtOrderNumber the device ext order number
    * @return the matching device ext order
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtOrderException if a matching device ext order could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceExtOrder findByDeviceExtOrderNumber(
        java.lang.String deviceExtOrderNumber)
        throws com.dasannetworks.vn.sb.NoSuchDeviceExtOrderException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device ext order where deviceExtOrderNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param deviceExtOrderNumber the device ext order number
    * @return the matching device ext order, or <code>null</code> if a matching device ext order could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceExtOrder fetchByDeviceExtOrderNumber(
        java.lang.String deviceExtOrderNumber)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device ext order where deviceExtOrderNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param deviceExtOrderNumber the device ext order number
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching device ext order, or <code>null</code> if a matching device ext order could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceExtOrder fetchByDeviceExtOrderNumber(
        java.lang.String deviceExtOrderNumber, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the device ext order where deviceExtOrderNumber = &#63; from the database.
    *
    * @param deviceExtOrderNumber the device ext order number
    * @return the device ext order that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceExtOrder removeByDeviceExtOrderNumber(
        java.lang.String deviceExtOrderNumber)
        throws com.dasannetworks.vn.sb.NoSuchDeviceExtOrderException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of device ext orders where deviceExtOrderNumber = &#63;.
    *
    * @param deviceExtOrderNumber the device ext order number
    * @return the number of matching device ext orders
    * @throws SystemException if a system exception occurred
    */
    public int countByDeviceExtOrderNumber(
        java.lang.String deviceExtOrderNumber)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the device ext order in the entity cache if it is enabled.
    *
    * @param deviceExtOrder the device ext order
    */
    public void cacheResult(
        com.dasannetworks.vn.sb.model.DeviceExtOrder deviceExtOrder);

    /**
    * Caches the device ext orders in the entity cache if it is enabled.
    *
    * @param deviceExtOrders the device ext orders
    */
    public void cacheResult(
        java.util.List<com.dasannetworks.vn.sb.model.DeviceExtOrder> deviceExtOrders);

    /**
    * Creates a new device ext order with the primary key. Does not add the device ext order to the database.
    *
    * @param deviceExtOrderId the primary key for the new device ext order
    * @return the new device ext order
    */
    public com.dasannetworks.vn.sb.model.DeviceExtOrder create(
        long deviceExtOrderId);

    /**
    * Removes the device ext order with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param deviceExtOrderId the primary key of the device ext order
    * @return the device ext order that was removed
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtOrderException if a device ext order with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceExtOrder remove(
        long deviceExtOrderId)
        throws com.dasannetworks.vn.sb.NoSuchDeviceExtOrderException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.dasannetworks.vn.sb.model.DeviceExtOrder updateImpl(
        com.dasannetworks.vn.sb.model.DeviceExtOrder deviceExtOrder)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device ext order with the primary key or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceExtOrderException} if it could not be found.
    *
    * @param deviceExtOrderId the primary key of the device ext order
    * @return the device ext order
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtOrderException if a device ext order with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceExtOrder findByPrimaryKey(
        long deviceExtOrderId)
        throws com.dasannetworks.vn.sb.NoSuchDeviceExtOrderException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device ext order with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param deviceExtOrderId the primary key of the device ext order
    * @return the device ext order, or <code>null</code> if a device ext order with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceExtOrder fetchByPrimaryKey(
        long deviceExtOrderId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the device ext orders.
    *
    * @return the device ext orders
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.DeviceExtOrder> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.dasannetworks.vn.sb.model.DeviceExtOrder> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.dasannetworks.vn.sb.model.DeviceExtOrder> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the device ext orders from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of device ext orders.
    *
    * @return the number of device ext orders
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
