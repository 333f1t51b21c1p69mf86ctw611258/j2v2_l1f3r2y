package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.RmaRequestDevice;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the rma request device service. This utility wraps {@link RmaRequestDevicePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RmaRequestDevicePersistence
 * @see RmaRequestDevicePersistenceImpl
 * @generated
 */
public class RmaRequestDeviceUtil {
    private static RmaRequestDevicePersistence _persistence;

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
    public static void clearCache(RmaRequestDevice rmaRequestDevice) {
        getPersistence().clearCache(rmaRequestDevice);
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
    public static List<RmaRequestDevice> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<RmaRequestDevice> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<RmaRequestDevice> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static RmaRequestDevice update(RmaRequestDevice rmaRequestDevice)
        throws SystemException {
        return getPersistence().update(rmaRequestDevice);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static RmaRequestDevice update(RmaRequestDevice rmaRequestDevice,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(rmaRequestDevice, serviceContext);
    }

    /**
    * Returns all the rma request devices where rmaRequestId = &#63;.
    *
    * @param rmaRequestId the rma request ID
    * @return the matching rma request devices
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.RmaRequestDevice> findByRmaRequestId(
        long rmaRequestId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByRmaRequestId(rmaRequestId);
    }

    /**
    * Returns a range of all the rma request devices where rmaRequestId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param rmaRequestId the rma request ID
    * @param start the lower bound of the range of rma request devices
    * @param end the upper bound of the range of rma request devices (not inclusive)
    * @return the range of matching rma request devices
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.RmaRequestDevice> findByRmaRequestId(
        long rmaRequestId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByRmaRequestId(rmaRequestId, start, end);
    }

    /**
    * Returns an ordered range of all the rma request devices where rmaRequestId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param rmaRequestId the rma request ID
    * @param start the lower bound of the range of rma request devices
    * @param end the upper bound of the range of rma request devices (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rma request devices
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.RmaRequestDevice> findByRmaRequestId(
        long rmaRequestId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByRmaRequestId(rmaRequestId, start, end,
            orderByComparator);
    }

    /**
    * Returns the first rma request device in the ordered set where rmaRequestId = &#63;.
    *
    * @param rmaRequestId the rma request ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rma request device
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice findByRmaRequestId_First(
        long rmaRequestId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByRmaRequestId_First(rmaRequestId, orderByComparator);
    }

    /**
    * Returns the first rma request device in the ordered set where rmaRequestId = &#63;.
    *
    * @param rmaRequestId the rma request ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rma request device, or <code>null</code> if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice fetchByRmaRequestId_First(
        long rmaRequestId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByRmaRequestId_First(rmaRequestId, orderByComparator);
    }

    /**
    * Returns the last rma request device in the ordered set where rmaRequestId = &#63;.
    *
    * @param rmaRequestId the rma request ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rma request device
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice findByRmaRequestId_Last(
        long rmaRequestId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByRmaRequestId_Last(rmaRequestId, orderByComparator);
    }

    /**
    * Returns the last rma request device in the ordered set where rmaRequestId = &#63;.
    *
    * @param rmaRequestId the rma request ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rma request device, or <code>null</code> if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice fetchByRmaRequestId_Last(
        long rmaRequestId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByRmaRequestId_Last(rmaRequestId, orderByComparator);
    }

    /**
    * Returns the rma request devices before and after the current rma request device in the ordered set where rmaRequestId = &#63;.
    *
    * @param rmaRequestDevicePK the primary key of the current rma request device
    * @param rmaRequestId the rma request ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next rma request device
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a rma request device with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice[] findByRmaRequestId_PrevAndNext(
        com.dasannetworks.vn.sb.service.persistence.RmaRequestDevicePK rmaRequestDevicePK,
        long rmaRequestId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByRmaRequestId_PrevAndNext(rmaRequestDevicePK,
            rmaRequestId, orderByComparator);
    }

    /**
    * Removes all the rma request devices where rmaRequestId = &#63; from the database.
    *
    * @param rmaRequestId the rma request ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByRmaRequestId(long rmaRequestId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByRmaRequestId(rmaRequestId);
    }

    /**
    * Returns the number of rma request devices where rmaRequestId = &#63;.
    *
    * @param rmaRequestId the rma request ID
    * @return the number of matching rma request devices
    * @throws SystemException if a system exception occurred
    */
    public static int countByRmaRequestId(long rmaRequestId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByRmaRequestId(rmaRequestId);
    }

    /**
    * Returns the rma request device where deviceId = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException} if it could not be found.
    *
    * @param deviceId the device ID
    * @return the matching rma request device
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice findByDeviceId(
        long deviceId)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByDeviceId(deviceId);
    }

    /**
    * Returns the rma request device where deviceId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param deviceId the device ID
    * @return the matching rma request device, or <code>null</code> if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice fetchByDeviceId(
        long deviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByDeviceId(deviceId);
    }

    /**
    * Returns the rma request device where deviceId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param deviceId the device ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching rma request device, or <code>null</code> if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice fetchByDeviceId(
        long deviceId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByDeviceId(deviceId, retrieveFromCache);
    }

    /**
    * Removes the rma request device where deviceId = &#63; from the database.
    *
    * @param deviceId the device ID
    * @return the rma request device that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice removeByDeviceId(
        long deviceId)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().removeByDeviceId(deviceId);
    }

    /**
    * Returns the number of rma request devices where deviceId = &#63;.
    *
    * @param deviceId the device ID
    * @return the number of matching rma request devices
    * @throws SystemException if a system exception occurred
    */
    public static int countByDeviceId(long deviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByDeviceId(deviceId);
    }

    /**
    * Caches the rma request device in the entity cache if it is enabled.
    *
    * @param rmaRequestDevice the rma request device
    */
    public static void cacheResult(
        com.dasannetworks.vn.sb.model.RmaRequestDevice rmaRequestDevice) {
        getPersistence().cacheResult(rmaRequestDevice);
    }

    /**
    * Caches the rma request devices in the entity cache if it is enabled.
    *
    * @param rmaRequestDevices the rma request devices
    */
    public static void cacheResult(
        java.util.List<com.dasannetworks.vn.sb.model.RmaRequestDevice> rmaRequestDevices) {
        getPersistence().cacheResult(rmaRequestDevices);
    }

    /**
    * Creates a new rma request device with the primary key. Does not add the rma request device to the database.
    *
    * @param rmaRequestDevicePK the primary key for the new rma request device
    * @return the new rma request device
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice create(
        com.dasannetworks.vn.sb.service.persistence.RmaRequestDevicePK rmaRequestDevicePK) {
        return getPersistence().create(rmaRequestDevicePK);
    }

    /**
    * Removes the rma request device with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param rmaRequestDevicePK the primary key of the rma request device
    * @return the rma request device that was removed
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a rma request device with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice remove(
        com.dasannetworks.vn.sb.service.persistence.RmaRequestDevicePK rmaRequestDevicePK)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(rmaRequestDevicePK);
    }

    public static com.dasannetworks.vn.sb.model.RmaRequestDevice updateImpl(
        com.dasannetworks.vn.sb.model.RmaRequestDevice rmaRequestDevice)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(rmaRequestDevice);
    }

    /**
    * Returns the rma request device with the primary key or throws a {@link com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException} if it could not be found.
    *
    * @param rmaRequestDevicePK the primary key of the rma request device
    * @return the rma request device
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a rma request device with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice findByPrimaryKey(
        com.dasannetworks.vn.sb.service.persistence.RmaRequestDevicePK rmaRequestDevicePK)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(rmaRequestDevicePK);
    }

    /**
    * Returns the rma request device with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param rmaRequestDevicePK the primary key of the rma request device
    * @return the rma request device, or <code>null</code> if a rma request device with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice fetchByPrimaryKey(
        com.dasannetworks.vn.sb.service.persistence.RmaRequestDevicePK rmaRequestDevicePK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(rmaRequestDevicePK);
    }

    /**
    * Returns all the rma request devices.
    *
    * @return the rma request devices
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.RmaRequestDevice> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.dasannetworks.vn.sb.model.RmaRequestDevice> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the rma request devices.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of rma request devices
    * @param end the upper bound of the range of rma request devices (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of rma request devices
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.RmaRequestDevice> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the rma request devices from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of rma request devices.
    *
    * @return the number of rma request devices
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static RmaRequestDevicePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (RmaRequestDevicePersistence) PortletBeanLocatorUtil.locate(com.dasannetworks.vn.sb.service.ClpSerializer.getServletContextName(),
                    RmaRequestDevicePersistence.class.getName());

            ReferenceRegistry.registerReference(RmaRequestDeviceUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(RmaRequestDevicePersistence persistence) {
    }
}
