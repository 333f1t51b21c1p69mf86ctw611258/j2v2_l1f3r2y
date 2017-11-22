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
    * Returns all the rma request devices where deviceId = &#63;.
    *
    * @param deviceId the device ID
    * @return the matching rma request devices
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.RmaRequestDevice> findByDeviceId(
        long deviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByDeviceId(deviceId);
    }

    /**
    * Returns a range of all the rma request devices where deviceId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param deviceId the device ID
    * @param start the lower bound of the range of rma request devices
    * @param end the upper bound of the range of rma request devices (not inclusive)
    * @return the range of matching rma request devices
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.RmaRequestDevice> findByDeviceId(
        long deviceId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByDeviceId(deviceId, start, end);
    }

    /**
    * Returns an ordered range of all the rma request devices where deviceId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param deviceId the device ID
    * @param start the lower bound of the range of rma request devices
    * @param end the upper bound of the range of rma request devices (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rma request devices
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.RmaRequestDevice> findByDeviceId(
        long deviceId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByDeviceId(deviceId, start, end, orderByComparator);
    }

    /**
    * Returns the first rma request device in the ordered set where deviceId = &#63;.
    *
    * @param deviceId the device ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rma request device
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice findByDeviceId_First(
        long deviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByDeviceId_First(deviceId, orderByComparator);
    }

    /**
    * Returns the first rma request device in the ordered set where deviceId = &#63;.
    *
    * @param deviceId the device ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rma request device, or <code>null</code> if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice fetchByDeviceId_First(
        long deviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByDeviceId_First(deviceId, orderByComparator);
    }

    /**
    * Returns the last rma request device in the ordered set where deviceId = &#63;.
    *
    * @param deviceId the device ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rma request device
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice findByDeviceId_Last(
        long deviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByDeviceId_Last(deviceId, orderByComparator);
    }

    /**
    * Returns the last rma request device in the ordered set where deviceId = &#63;.
    *
    * @param deviceId the device ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rma request device, or <code>null</code> if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice fetchByDeviceId_Last(
        long deviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByDeviceId_Last(deviceId, orderByComparator);
    }

    /**
    * Returns the rma request devices before and after the current rma request device in the ordered set where deviceId = &#63;.
    *
    * @param rmaRequestDevicePK the primary key of the current rma request device
    * @param deviceId the device ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next rma request device
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a rma request device with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice[] findByDeviceId_PrevAndNext(
        com.dasannetworks.vn.sb.service.persistence.RmaRequestDevicePK rmaRequestDevicePK,
        long deviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByDeviceId_PrevAndNext(rmaRequestDevicePK, deviceId,
            orderByComparator);
    }

    /**
    * Removes all the rma request devices where deviceId = &#63; from the database.
    *
    * @param deviceId the device ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByDeviceId(long deviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByDeviceId(deviceId);
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
    * Returns all the rma request devices where partnerId = &#63;.
    *
    * @param partnerId the partner ID
    * @return the matching rma request devices
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.RmaRequestDevice> findByPartnerId(
        java.lang.Long partnerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPartnerId(partnerId);
    }

    /**
    * Returns a range of all the rma request devices where partnerId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param partnerId the partner ID
    * @param start the lower bound of the range of rma request devices
    * @param end the upper bound of the range of rma request devices (not inclusive)
    * @return the range of matching rma request devices
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.RmaRequestDevice> findByPartnerId(
        java.lang.Long partnerId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPartnerId(partnerId, start, end);
    }

    /**
    * Returns an ordered range of all the rma request devices where partnerId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param partnerId the partner ID
    * @param start the lower bound of the range of rma request devices
    * @param end the upper bound of the range of rma request devices (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rma request devices
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.RmaRequestDevice> findByPartnerId(
        java.lang.Long partnerId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByPartnerId(partnerId, start, end, orderByComparator);
    }

    /**
    * Returns the first rma request device in the ordered set where partnerId = &#63;.
    *
    * @param partnerId the partner ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rma request device
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice findByPartnerId_First(
        java.lang.Long partnerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByPartnerId_First(partnerId, orderByComparator);
    }

    /**
    * Returns the first rma request device in the ordered set where partnerId = &#63;.
    *
    * @param partnerId the partner ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rma request device, or <code>null</code> if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice fetchByPartnerId_First(
        java.lang.Long partnerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByPartnerId_First(partnerId, orderByComparator);
    }

    /**
    * Returns the last rma request device in the ordered set where partnerId = &#63;.
    *
    * @param partnerId the partner ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rma request device
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice findByPartnerId_Last(
        java.lang.Long partnerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByPartnerId_Last(partnerId, orderByComparator);
    }

    /**
    * Returns the last rma request device in the ordered set where partnerId = &#63;.
    *
    * @param partnerId the partner ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rma request device, or <code>null</code> if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice fetchByPartnerId_Last(
        java.lang.Long partnerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByPartnerId_Last(partnerId, orderByComparator);
    }

    /**
    * Returns the rma request devices before and after the current rma request device in the ordered set where partnerId = &#63;.
    *
    * @param rmaRequestDevicePK the primary key of the current rma request device
    * @param partnerId the partner ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next rma request device
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a rma request device with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice[] findByPartnerId_PrevAndNext(
        com.dasannetworks.vn.sb.service.persistence.RmaRequestDevicePK rmaRequestDevicePK,
        java.lang.Long partnerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByPartnerId_PrevAndNext(rmaRequestDevicePK, partnerId,
            orderByComparator);
    }

    /**
    * Removes all the rma request devices where partnerId = &#63; from the database.
    *
    * @param partnerId the partner ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByPartnerId(java.lang.Long partnerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByPartnerId(partnerId);
    }

    /**
    * Returns the number of rma request devices where partnerId = &#63;.
    *
    * @param partnerId the partner ID
    * @return the number of matching rma request devices
    * @throws SystemException if a system exception occurred
    */
    public static int countByPartnerId(java.lang.Long partnerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByPartnerId(partnerId);
    }

    /**
    * Returns all the rma request devices where status = &#63;.
    *
    * @param status the status
    * @return the matching rma request devices
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.RmaRequestDevice> findByStatus(
        int status) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByStatus(status);
    }

    /**
    * Returns a range of all the rma request devices where status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param status the status
    * @param start the lower bound of the range of rma request devices
    * @param end the upper bound of the range of rma request devices (not inclusive)
    * @return the range of matching rma request devices
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.RmaRequestDevice> findByStatus(
        int status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByStatus(status, start, end);
    }

    /**
    * Returns an ordered range of all the rma request devices where status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param status the status
    * @param start the lower bound of the range of rma request devices
    * @param end the upper bound of the range of rma request devices (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rma request devices
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.RmaRequestDevice> findByStatus(
        int status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByStatus(status, start, end, orderByComparator);
    }

    /**
    * Returns the first rma request device in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rma request device
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice findByStatus_First(
        int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByStatus_First(status, orderByComparator);
    }

    /**
    * Returns the first rma request device in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rma request device, or <code>null</code> if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice fetchByStatus_First(
        int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByStatus_First(status, orderByComparator);
    }

    /**
    * Returns the last rma request device in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rma request device
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice findByStatus_Last(
        int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByStatus_Last(status, orderByComparator);
    }

    /**
    * Returns the last rma request device in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rma request device, or <code>null</code> if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice fetchByStatus_Last(
        int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByStatus_Last(status, orderByComparator);
    }

    /**
    * Returns the rma request devices before and after the current rma request device in the ordered set where status = &#63;.
    *
    * @param rmaRequestDevicePK the primary key of the current rma request device
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next rma request device
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a rma request device with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice[] findByStatus_PrevAndNext(
        com.dasannetworks.vn.sb.service.persistence.RmaRequestDevicePK rmaRequestDevicePK,
        int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByStatus_PrevAndNext(rmaRequestDevicePK, status,
            orderByComparator);
    }

    /**
    * Removes all the rma request devices where status = &#63; from the database.
    *
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public static void removeByStatus(int status)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByStatus(status);
    }

    /**
    * Returns the number of rma request devices where status = &#63;.
    *
    * @param status the status
    * @return the number of matching rma request devices
    * @throws SystemException if a system exception occurred
    */
    public static int countByStatus(int status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByStatus(status);
    }

    /**
    * Returns all the rma request devices where replacedNumber = &#63;.
    *
    * @param replacedNumber the replaced number
    * @return the matching rma request devices
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.RmaRequestDevice> findByReplacedNumber(
        java.lang.String replacedNumber)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByReplacedNumber(replacedNumber);
    }

    /**
    * Returns a range of all the rma request devices where replacedNumber = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param replacedNumber the replaced number
    * @param start the lower bound of the range of rma request devices
    * @param end the upper bound of the range of rma request devices (not inclusive)
    * @return the range of matching rma request devices
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.RmaRequestDevice> findByReplacedNumber(
        java.lang.String replacedNumber, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByReplacedNumber(replacedNumber, start, end);
    }

    /**
    * Returns an ordered range of all the rma request devices where replacedNumber = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestDeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param replacedNumber the replaced number
    * @param start the lower bound of the range of rma request devices
    * @param end the upper bound of the range of rma request devices (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rma request devices
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.RmaRequestDevice> findByReplacedNumber(
        java.lang.String replacedNumber, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByReplacedNumber(replacedNumber, start, end,
            orderByComparator);
    }

    /**
    * Returns the first rma request device in the ordered set where replacedNumber = &#63;.
    *
    * @param replacedNumber the replaced number
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rma request device
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice findByReplacedNumber_First(
        java.lang.String replacedNumber,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByReplacedNumber_First(replacedNumber, orderByComparator);
    }

    /**
    * Returns the first rma request device in the ordered set where replacedNumber = &#63;.
    *
    * @param replacedNumber the replaced number
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rma request device, or <code>null</code> if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice fetchByReplacedNumber_First(
        java.lang.String replacedNumber,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByReplacedNumber_First(replacedNumber,
            orderByComparator);
    }

    /**
    * Returns the last rma request device in the ordered set where replacedNumber = &#63;.
    *
    * @param replacedNumber the replaced number
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rma request device
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice findByReplacedNumber_Last(
        java.lang.String replacedNumber,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByReplacedNumber_Last(replacedNumber, orderByComparator);
    }

    /**
    * Returns the last rma request device in the ordered set where replacedNumber = &#63;.
    *
    * @param replacedNumber the replaced number
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rma request device, or <code>null</code> if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice fetchByReplacedNumber_Last(
        java.lang.String replacedNumber,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByReplacedNumber_Last(replacedNumber, orderByComparator);
    }

    /**
    * Returns the rma request devices before and after the current rma request device in the ordered set where replacedNumber = &#63;.
    *
    * @param rmaRequestDevicePK the primary key of the current rma request device
    * @param replacedNumber the replaced number
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next rma request device
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a rma request device with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice[] findByReplacedNumber_PrevAndNext(
        com.dasannetworks.vn.sb.service.persistence.RmaRequestDevicePK rmaRequestDevicePK,
        java.lang.String replacedNumber,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByReplacedNumber_PrevAndNext(rmaRequestDevicePK,
            replacedNumber, orderByComparator);
    }

    /**
    * Removes all the rma request devices where replacedNumber = &#63; from the database.
    *
    * @param replacedNumber the replaced number
    * @throws SystemException if a system exception occurred
    */
    public static void removeByReplacedNumber(java.lang.String replacedNumber)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByReplacedNumber(replacedNumber);
    }

    /**
    * Returns the number of rma request devices where replacedNumber = &#63;.
    *
    * @param replacedNumber the replaced number
    * @return the number of matching rma request devices
    * @throws SystemException if a system exception occurred
    */
    public static int countByReplacedNumber(java.lang.String replacedNumber)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByReplacedNumber(replacedNumber);
    }

    /**
    * Returns the rma request device where replacedOldDeviceId = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException} if it could not be found.
    *
    * @param replacedOldDeviceId the replaced old device ID
    * @return the matching rma request device
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice findByReplacedOldDeviceId(
        java.lang.Long replacedOldDeviceId)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByReplacedOldDeviceId(replacedOldDeviceId);
    }

    /**
    * Returns the rma request device where replacedOldDeviceId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param replacedOldDeviceId the replaced old device ID
    * @return the matching rma request device, or <code>null</code> if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice fetchByReplacedOldDeviceId(
        java.lang.Long replacedOldDeviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByReplacedOldDeviceId(replacedOldDeviceId);
    }

    /**
    * Returns the rma request device where replacedOldDeviceId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param replacedOldDeviceId the replaced old device ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching rma request device, or <code>null</code> if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice fetchByReplacedOldDeviceId(
        java.lang.Long replacedOldDeviceId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByReplacedOldDeviceId(replacedOldDeviceId,
            retrieveFromCache);
    }

    /**
    * Removes the rma request device where replacedOldDeviceId = &#63; from the database.
    *
    * @param replacedOldDeviceId the replaced old device ID
    * @return the rma request device that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice removeByReplacedOldDeviceId(
        java.lang.Long replacedOldDeviceId)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().removeByReplacedOldDeviceId(replacedOldDeviceId);
    }

    /**
    * Returns the number of rma request devices where replacedOldDeviceId = &#63;.
    *
    * @param replacedOldDeviceId the replaced old device ID
    * @return the number of matching rma request devices
    * @throws SystemException if a system exception occurred
    */
    public static int countByReplacedOldDeviceId(
        java.lang.Long replacedOldDeviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByReplacedOldDeviceId(replacedOldDeviceId);
    }

    /**
    * Returns the rma request device where replacedOldDeviceExtId = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException} if it could not be found.
    *
    * @param replacedOldDeviceExtId the replaced old device ext ID
    * @return the matching rma request device
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice findByReplacedOldDeviceExtId(
        java.lang.Long replacedOldDeviceExtId)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByReplacedOldDeviceExtId(replacedOldDeviceExtId);
    }

    /**
    * Returns the rma request device where replacedOldDeviceExtId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param replacedOldDeviceExtId the replaced old device ext ID
    * @return the matching rma request device, or <code>null</code> if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice fetchByReplacedOldDeviceExtId(
        java.lang.Long replacedOldDeviceExtId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByReplacedOldDeviceExtId(replacedOldDeviceExtId);
    }

    /**
    * Returns the rma request device where replacedOldDeviceExtId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param replacedOldDeviceExtId the replaced old device ext ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching rma request device, or <code>null</code> if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice fetchByReplacedOldDeviceExtId(
        java.lang.Long replacedOldDeviceExtId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByReplacedOldDeviceExtId(replacedOldDeviceExtId,
            retrieveFromCache);
    }

    /**
    * Removes the rma request device where replacedOldDeviceExtId = &#63; from the database.
    *
    * @param replacedOldDeviceExtId the replaced old device ext ID
    * @return the rma request device that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice removeByReplacedOldDeviceExtId(
        java.lang.Long replacedOldDeviceExtId)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .removeByReplacedOldDeviceExtId(replacedOldDeviceExtId);
    }

    /**
    * Returns the number of rma request devices where replacedOldDeviceExtId = &#63;.
    *
    * @param replacedOldDeviceExtId the replaced old device ext ID
    * @return the number of matching rma request devices
    * @throws SystemException if a system exception occurred
    */
    public static int countByReplacedOldDeviceExtId(
        java.lang.Long replacedOldDeviceExtId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .countByReplacedOldDeviceExtId(replacedOldDeviceExtId);
    }

    /**
    * Returns the rma request device where replacedNewDeviceId = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException} if it could not be found.
    *
    * @param replacedNewDeviceId the replaced new device ID
    * @return the matching rma request device
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice findByReplacedNewDeviceId(
        java.lang.Long replacedNewDeviceId)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByReplacedNewDeviceId(replacedNewDeviceId);
    }

    /**
    * Returns the rma request device where replacedNewDeviceId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param replacedNewDeviceId the replaced new device ID
    * @return the matching rma request device, or <code>null</code> if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice fetchByReplacedNewDeviceId(
        java.lang.Long replacedNewDeviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByReplacedNewDeviceId(replacedNewDeviceId);
    }

    /**
    * Returns the rma request device where replacedNewDeviceId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param replacedNewDeviceId the replaced new device ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching rma request device, or <code>null</code> if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice fetchByReplacedNewDeviceId(
        java.lang.Long replacedNewDeviceId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByReplacedNewDeviceId(replacedNewDeviceId,
            retrieveFromCache);
    }

    /**
    * Removes the rma request device where replacedNewDeviceId = &#63; from the database.
    *
    * @param replacedNewDeviceId the replaced new device ID
    * @return the rma request device that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice removeByReplacedNewDeviceId(
        java.lang.Long replacedNewDeviceId)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().removeByReplacedNewDeviceId(replacedNewDeviceId);
    }

    /**
    * Returns the number of rma request devices where replacedNewDeviceId = &#63;.
    *
    * @param replacedNewDeviceId the replaced new device ID
    * @return the number of matching rma request devices
    * @throws SystemException if a system exception occurred
    */
    public static int countByReplacedNewDeviceId(
        java.lang.Long replacedNewDeviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByReplacedNewDeviceId(replacedNewDeviceId);
    }

    /**
    * Returns the rma request device where replacedNewDeviceExtId = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException} if it could not be found.
    *
    * @param replacedNewDeviceExtId the replaced new device ext ID
    * @return the matching rma request device
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice findByReplacedNewDeviceExtId(
        java.lang.Long replacedNewDeviceExtId)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByReplacedNewDeviceExtId(replacedNewDeviceExtId);
    }

    /**
    * Returns the rma request device where replacedNewDeviceExtId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param replacedNewDeviceExtId the replaced new device ext ID
    * @return the matching rma request device, or <code>null</code> if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice fetchByReplacedNewDeviceExtId(
        java.lang.Long replacedNewDeviceExtId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByReplacedNewDeviceExtId(replacedNewDeviceExtId);
    }

    /**
    * Returns the rma request device where replacedNewDeviceExtId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param replacedNewDeviceExtId the replaced new device ext ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching rma request device, or <code>null</code> if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice fetchByReplacedNewDeviceExtId(
        java.lang.Long replacedNewDeviceExtId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByReplacedNewDeviceExtId(replacedNewDeviceExtId,
            retrieveFromCache);
    }

    /**
    * Removes the rma request device where replacedNewDeviceExtId = &#63; from the database.
    *
    * @param replacedNewDeviceExtId the replaced new device ext ID
    * @return the rma request device that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequestDevice removeByReplacedNewDeviceExtId(
        java.lang.Long replacedNewDeviceExtId)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .removeByReplacedNewDeviceExtId(replacedNewDeviceExtId);
    }

    /**
    * Returns the number of rma request devices where replacedNewDeviceExtId = &#63;.
    *
    * @param replacedNewDeviceExtId the replaced new device ext ID
    * @return the number of matching rma request devices
    * @throws SystemException if a system exception occurred
    */
    public static int countByReplacedNewDeviceExtId(
        java.lang.Long replacedNewDeviceExtId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .countByReplacedNewDeviceExtId(replacedNewDeviceExtId);
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
