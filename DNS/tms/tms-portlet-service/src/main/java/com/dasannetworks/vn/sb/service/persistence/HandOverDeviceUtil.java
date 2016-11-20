package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.HandOverDevice;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the hand over device service. This utility wraps {@link HandOverDevicePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HandOverDevicePersistence
 * @see HandOverDevicePersistenceImpl
 * @generated
 */
public class HandOverDeviceUtil {
    private static HandOverDevicePersistence _persistence;

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
    public static void clearCache(HandOverDevice handOverDevice) {
        getPersistence().clearCache(handOverDevice);
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
    public static List<HandOverDevice> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<HandOverDevice> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<HandOverDevice> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static HandOverDevice update(HandOverDevice handOverDevice)
        throws SystemException {
        return getPersistence().update(handOverDevice);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static HandOverDevice update(HandOverDevice handOverDevice,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(handOverDevice, serviceContext);
    }

    /**
    * Returns all the hand over devices where handOverFormId = &#63;.
    *
    * @param handOverFormId the hand over form ID
    * @return the matching hand over devices
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.HandOverDevice> findByHandOverFormId(
        long handOverFormId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByHandOverFormId(handOverFormId);
    }

    /**
    * Returns a range of all the hand over devices where handOverFormId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.HandOverDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param handOverFormId the hand over form ID
    * @param start the lower bound of the range of hand over devices
    * @param end the upper bound of the range of hand over devices (not inclusive)
    * @return the range of matching hand over devices
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.HandOverDevice> findByHandOverFormId(
        long handOverFormId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByHandOverFormId(handOverFormId, start, end);
    }

    /**
    * Returns an ordered range of all the hand over devices where handOverFormId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.HandOverDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param handOverFormId the hand over form ID
    * @param start the lower bound of the range of hand over devices
    * @param end the upper bound of the range of hand over devices (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching hand over devices
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.HandOverDevice> findByHandOverFormId(
        long handOverFormId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByHandOverFormId(handOverFormId, start, end,
            orderByComparator);
    }

    /**
    * Returns the first hand over device in the ordered set where handOverFormId = &#63;.
    *
    * @param handOverFormId the hand over form ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching hand over device
    * @throws com.dasannetworks.vn.sb.NoSuchHandOverDeviceException if a matching hand over device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.HandOverDevice findByHandOverFormId_First(
        long handOverFormId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchHandOverDeviceException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByHandOverFormId_First(handOverFormId, orderByComparator);
    }

    /**
    * Returns the first hand over device in the ordered set where handOverFormId = &#63;.
    *
    * @param handOverFormId the hand over form ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching hand over device, or <code>null</code> if a matching hand over device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.HandOverDevice fetchByHandOverFormId_First(
        long handOverFormId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByHandOverFormId_First(handOverFormId,
            orderByComparator);
    }

    /**
    * Returns the last hand over device in the ordered set where handOverFormId = &#63;.
    *
    * @param handOverFormId the hand over form ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching hand over device
    * @throws com.dasannetworks.vn.sb.NoSuchHandOverDeviceException if a matching hand over device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.HandOverDevice findByHandOverFormId_Last(
        long handOverFormId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchHandOverDeviceException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByHandOverFormId_Last(handOverFormId, orderByComparator);
    }

    /**
    * Returns the last hand over device in the ordered set where handOverFormId = &#63;.
    *
    * @param handOverFormId the hand over form ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching hand over device, or <code>null</code> if a matching hand over device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.HandOverDevice fetchByHandOverFormId_Last(
        long handOverFormId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByHandOverFormId_Last(handOverFormId, orderByComparator);
    }

    /**
    * Returns the hand over devices before and after the current hand over device in the ordered set where handOverFormId = &#63;.
    *
    * @param handOverDevicePK the primary key of the current hand over device
    * @param handOverFormId the hand over form ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next hand over device
    * @throws com.dasannetworks.vn.sb.NoSuchHandOverDeviceException if a hand over device with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.HandOverDevice[] findByHandOverFormId_PrevAndNext(
        HandOverDevicePK handOverDevicePK, long handOverFormId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchHandOverDeviceException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByHandOverFormId_PrevAndNext(handOverDevicePK,
            handOverFormId, orderByComparator);
    }

    /**
    * Removes all the hand over devices where handOverFormId = &#63; from the database.
    *
    * @param handOverFormId the hand over form ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByHandOverFormId(long handOverFormId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByHandOverFormId(handOverFormId);
    }

    /**
    * Returns the number of hand over devices where handOverFormId = &#63;.
    *
    * @param handOverFormId the hand over form ID
    * @return the number of matching hand over devices
    * @throws SystemException if a system exception occurred
    */
    public static int countByHandOverFormId(long handOverFormId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByHandOverFormId(handOverFormId);
    }

    /**
    * Returns the hand over device where deviceId = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchHandOverDeviceException} if it could not be found.
    *
    * @param deviceId the device ID
    * @return the matching hand over device
    * @throws com.dasannetworks.vn.sb.NoSuchHandOverDeviceException if a matching hand over device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.HandOverDevice findByDeviceId(
        long deviceId)
        throws com.dasannetworks.vn.sb.NoSuchHandOverDeviceException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByDeviceId(deviceId);
    }

    /**
    * Returns the hand over device where deviceId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param deviceId the device ID
    * @return the matching hand over device, or <code>null</code> if a matching hand over device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.HandOverDevice fetchByDeviceId(
        long deviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByDeviceId(deviceId);
    }

    /**
    * Returns the hand over device where deviceId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param deviceId the device ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching hand over device, or <code>null</code> if a matching hand over device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.HandOverDevice fetchByDeviceId(
        long deviceId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByDeviceId(deviceId, retrieveFromCache);
    }

    /**
    * Removes the hand over device where deviceId = &#63; from the database.
    *
    * @param deviceId the device ID
    * @return the hand over device that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.HandOverDevice removeByDeviceId(
        long deviceId)
        throws com.dasannetworks.vn.sb.NoSuchHandOverDeviceException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().removeByDeviceId(deviceId);
    }

    /**
    * Returns the number of hand over devices where deviceId = &#63;.
    *
    * @param deviceId the device ID
    * @return the number of matching hand over devices
    * @throws SystemException if a system exception occurred
    */
    public static int countByDeviceId(long deviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByDeviceId(deviceId);
    }

    /**
    * Caches the hand over device in the entity cache if it is enabled.
    *
    * @param handOverDevice the hand over device
    */
    public static void cacheResult(
        com.dasannetworks.vn.sb.model.HandOverDevice handOverDevice) {
        getPersistence().cacheResult(handOverDevice);
    }

    /**
    * Caches the hand over devices in the entity cache if it is enabled.
    *
    * @param handOverDevices the hand over devices
    */
    public static void cacheResult(
        java.util.List<com.dasannetworks.vn.sb.model.HandOverDevice> handOverDevices) {
        getPersistence().cacheResult(handOverDevices);
    }

    /**
    * Creates a new hand over device with the primary key. Does not add the hand over device to the database.
    *
    * @param handOverDevicePK the primary key for the new hand over device
    * @return the new hand over device
    */
    public static com.dasannetworks.vn.sb.model.HandOverDevice create(
        HandOverDevicePK handOverDevicePK) {
        return getPersistence().create(handOverDevicePK);
    }

    /**
    * Removes the hand over device with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param handOverDevicePK the primary key of the hand over device
    * @return the hand over device that was removed
    * @throws com.dasannetworks.vn.sb.NoSuchHandOverDeviceException if a hand over device with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.HandOverDevice remove(
        HandOverDevicePK handOverDevicePK)
        throws com.dasannetworks.vn.sb.NoSuchHandOverDeviceException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(handOverDevicePK);
    }

    public static com.dasannetworks.vn.sb.model.HandOverDevice updateImpl(
        com.dasannetworks.vn.sb.model.HandOverDevice handOverDevice)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(handOverDevice);
    }

    /**
    * Returns the hand over device with the primary key or throws a {@link com.dasannetworks.vn.sb.NoSuchHandOverDeviceException} if it could not be found.
    *
    * @param handOverDevicePK the primary key of the hand over device
    * @return the hand over device
    * @throws com.dasannetworks.vn.sb.NoSuchHandOverDeviceException if a hand over device with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.HandOverDevice findByPrimaryKey(
        HandOverDevicePK handOverDevicePK)
        throws com.dasannetworks.vn.sb.NoSuchHandOverDeviceException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(handOverDevicePK);
    }

    /**
    * Returns the hand over device with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param handOverDevicePK the primary key of the hand over device
    * @return the hand over device, or <code>null</code> if a hand over device with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.HandOverDevice fetchByPrimaryKey(
        HandOverDevicePK handOverDevicePK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(handOverDevicePK);
    }

    /**
    * Returns all the hand over devices.
    *
    * @return the hand over devices
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.HandOverDevice> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.dasannetworks.vn.sb.model.HandOverDevice> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the hand over devices.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.HandOverDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of hand over devices
    * @param end the upper bound of the range of hand over devices (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of hand over devices
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.HandOverDevice> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the hand over devices from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of hand over devices.
    *
    * @return the number of hand over devices
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static HandOverDevicePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (HandOverDevicePersistence) PortletBeanLocatorUtil.locate(com.dasannetworks.vn.sb.service.ClpSerializer.getServletContextName(),
                    HandOverDevicePersistence.class.getName());

            ReferenceRegistry.registerReference(HandOverDeviceUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(HandOverDevicePersistence persistence) {
    }
}
