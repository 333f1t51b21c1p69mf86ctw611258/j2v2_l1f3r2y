package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.DeviceExt;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the device ext service. This utility wraps {@link DeviceExtPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DeviceExtPersistence
 * @see DeviceExtPersistenceImpl
 * @generated
 */
public class DeviceExtUtil {
    private static DeviceExtPersistence _persistence;

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
    public static void clearCache(DeviceExt deviceExt) {
        getPersistence().clearCache(deviceExt);
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
    public static List<DeviceExt> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<DeviceExt> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<DeviceExt> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static DeviceExt update(DeviceExt deviceExt)
        throws SystemException {
        return getPersistence().update(deviceExt);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static DeviceExt update(DeviceExt deviceExt,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(deviceExt, serviceContext);
    }

    /**
    * Returns all the device exts where deviceExtOrderId = &#63;.
    *
    * @param deviceExtOrderId the device ext order ID
    * @return the matching device exts
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.DeviceExt> findByDeviceExtOrderId(
        java.lang.Long deviceExtOrderId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByDeviceExtOrderId(deviceExtOrderId);
    }

    /**
    * Returns a range of all the device exts where deviceExtOrderId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceExtModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param deviceExtOrderId the device ext order ID
    * @param start the lower bound of the range of device exts
    * @param end the upper bound of the range of device exts (not inclusive)
    * @return the range of matching device exts
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.DeviceExt> findByDeviceExtOrderId(
        java.lang.Long deviceExtOrderId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByDeviceExtOrderId(deviceExtOrderId, start, end);
    }

    /**
    * Returns an ordered range of all the device exts where deviceExtOrderId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceExtModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param deviceExtOrderId the device ext order ID
    * @param start the lower bound of the range of device exts
    * @param end the upper bound of the range of device exts (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching device exts
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.DeviceExt> findByDeviceExtOrderId(
        java.lang.Long deviceExtOrderId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByDeviceExtOrderId(deviceExtOrderId, start, end,
            orderByComparator);
    }

    /**
    * Returns the first device ext in the ordered set where deviceExtOrderId = &#63;.
    *
    * @param deviceExtOrderId the device ext order ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device ext
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtException if a matching device ext could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceExt findByDeviceExtOrderId_First(
        java.lang.Long deviceExtOrderId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceExtException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByDeviceExtOrderId_First(deviceExtOrderId,
            orderByComparator);
    }

    /**
    * Returns the first device ext in the ordered set where deviceExtOrderId = &#63;.
    *
    * @param deviceExtOrderId the device ext order ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device ext, or <code>null</code> if a matching device ext could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceExt fetchByDeviceExtOrderId_First(
        java.lang.Long deviceExtOrderId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByDeviceExtOrderId_First(deviceExtOrderId,
            orderByComparator);
    }

    /**
    * Returns the last device ext in the ordered set where deviceExtOrderId = &#63;.
    *
    * @param deviceExtOrderId the device ext order ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device ext
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtException if a matching device ext could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceExt findByDeviceExtOrderId_Last(
        java.lang.Long deviceExtOrderId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceExtException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByDeviceExtOrderId_Last(deviceExtOrderId,
            orderByComparator);
    }

    /**
    * Returns the last device ext in the ordered set where deviceExtOrderId = &#63;.
    *
    * @param deviceExtOrderId the device ext order ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device ext, or <code>null</code> if a matching device ext could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceExt fetchByDeviceExtOrderId_Last(
        java.lang.Long deviceExtOrderId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByDeviceExtOrderId_Last(deviceExtOrderId,
            orderByComparator);
    }

    /**
    * Returns the device exts before and after the current device ext in the ordered set where deviceExtOrderId = &#63;.
    *
    * @param deviceExtId the primary key of the current device ext
    * @param deviceExtOrderId the device ext order ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next device ext
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtException if a device ext with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceExt[] findByDeviceExtOrderId_PrevAndNext(
        long deviceExtId, java.lang.Long deviceExtOrderId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceExtException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByDeviceExtOrderId_PrevAndNext(deviceExtId,
            deviceExtOrderId, orderByComparator);
    }

    /**
    * Removes all the device exts where deviceExtOrderId = &#63; from the database.
    *
    * @param deviceExtOrderId the device ext order ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByDeviceExtOrderId(java.lang.Long deviceExtOrderId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByDeviceExtOrderId(deviceExtOrderId);
    }

    /**
    * Returns the number of device exts where deviceExtOrderId = &#63;.
    *
    * @param deviceExtOrderId the device ext order ID
    * @return the number of matching device exts
    * @throws SystemException if a system exception occurred
    */
    public static int countByDeviceExtOrderId(java.lang.Long deviceExtOrderId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByDeviceExtOrderId(deviceExtOrderId);
    }

    /**
    * Returns all the device exts where modelName = &#63;.
    *
    * @param modelName the model name
    * @return the matching device exts
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.DeviceExt> findByModelName(
        java.lang.String modelName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByModelName(modelName);
    }

    /**
    * Returns a range of all the device exts where modelName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceExtModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param modelName the model name
    * @param start the lower bound of the range of device exts
    * @param end the upper bound of the range of device exts (not inclusive)
    * @return the range of matching device exts
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.DeviceExt> findByModelName(
        java.lang.String modelName, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByModelName(modelName, start, end);
    }

    /**
    * Returns an ordered range of all the device exts where modelName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceExtModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param modelName the model name
    * @param start the lower bound of the range of device exts
    * @param end the upper bound of the range of device exts (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching device exts
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.DeviceExt> findByModelName(
        java.lang.String modelName, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByModelName(modelName, start, end, orderByComparator);
    }

    /**
    * Returns the first device ext in the ordered set where modelName = &#63;.
    *
    * @param modelName the model name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device ext
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtException if a matching device ext could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceExt findByModelName_First(
        java.lang.String modelName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceExtException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByModelName_First(modelName, orderByComparator);
    }

    /**
    * Returns the first device ext in the ordered set where modelName = &#63;.
    *
    * @param modelName the model name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device ext, or <code>null</code> if a matching device ext could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceExt fetchByModelName_First(
        java.lang.String modelName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByModelName_First(modelName, orderByComparator);
    }

    /**
    * Returns the last device ext in the ordered set where modelName = &#63;.
    *
    * @param modelName the model name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device ext
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtException if a matching device ext could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceExt findByModelName_Last(
        java.lang.String modelName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceExtException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByModelName_Last(modelName, orderByComparator);
    }

    /**
    * Returns the last device ext in the ordered set where modelName = &#63;.
    *
    * @param modelName the model name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device ext, or <code>null</code> if a matching device ext could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceExt fetchByModelName_Last(
        java.lang.String modelName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByModelName_Last(modelName, orderByComparator);
    }

    /**
    * Returns the device exts before and after the current device ext in the ordered set where modelName = &#63;.
    *
    * @param deviceExtId the primary key of the current device ext
    * @param modelName the model name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next device ext
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtException if a device ext with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceExt[] findByModelName_PrevAndNext(
        long deviceExtId, java.lang.String modelName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceExtException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByModelName_PrevAndNext(deviceExtId, modelName,
            orderByComparator);
    }

    /**
    * Removes all the device exts where modelName = &#63; from the database.
    *
    * @param modelName the model name
    * @throws SystemException if a system exception occurred
    */
    public static void removeByModelName(java.lang.String modelName)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByModelName(modelName);
    }

    /**
    * Returns the number of device exts where modelName = &#63;.
    *
    * @param modelName the model name
    * @return the number of matching device exts
    * @throws SystemException if a system exception occurred
    */
    public static int countByModelName(java.lang.String modelName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByModelName(modelName);
    }

    /**
    * Returns the device ext where serialNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceExtException} if it could not be found.
    *
    * @param serialNumber the serial number
    * @return the matching device ext
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtException if a matching device ext could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceExt findBySerialNumber(
        java.lang.String serialNumber)
        throws com.dasannetworks.vn.sb.NoSuchDeviceExtException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBySerialNumber(serialNumber);
    }

    /**
    * Returns the device ext where serialNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param serialNumber the serial number
    * @return the matching device ext, or <code>null</code> if a matching device ext could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceExt fetchBySerialNumber(
        java.lang.String serialNumber)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBySerialNumber(serialNumber);
    }

    /**
    * Returns the device ext where serialNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param serialNumber the serial number
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching device ext, or <code>null</code> if a matching device ext could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceExt fetchBySerialNumber(
        java.lang.String serialNumber, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchBySerialNumber(serialNumber, retrieveFromCache);
    }

    /**
    * Removes the device ext where serialNumber = &#63; from the database.
    *
    * @param serialNumber the serial number
    * @return the device ext that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceExt removeBySerialNumber(
        java.lang.String serialNumber)
        throws com.dasannetworks.vn.sb.NoSuchDeviceExtException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().removeBySerialNumber(serialNumber);
    }

    /**
    * Returns the number of device exts where serialNumber = &#63;.
    *
    * @param serialNumber the serial number
    * @return the number of matching device exts
    * @throws SystemException if a system exception occurred
    */
    public static int countBySerialNumber(java.lang.String serialNumber)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countBySerialNumber(serialNumber);
    }

    /**
    * Returns the device ext where gponSerialNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceExtException} if it could not be found.
    *
    * @param gponSerialNumber the gpon serial number
    * @return the matching device ext
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtException if a matching device ext could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceExt findByGponSerialNumber(
        java.lang.String gponSerialNumber)
        throws com.dasannetworks.vn.sb.NoSuchDeviceExtException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGponSerialNumber(gponSerialNumber);
    }

    /**
    * Returns the device ext where gponSerialNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param gponSerialNumber the gpon serial number
    * @return the matching device ext, or <code>null</code> if a matching device ext could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceExt fetchByGponSerialNumber(
        java.lang.String gponSerialNumber)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGponSerialNumber(gponSerialNumber);
    }

    /**
    * Returns the device ext where gponSerialNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param gponSerialNumber the gpon serial number
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching device ext, or <code>null</code> if a matching device ext could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceExt fetchByGponSerialNumber(
        java.lang.String gponSerialNumber, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByGponSerialNumber(gponSerialNumber, retrieveFromCache);
    }

    /**
    * Removes the device ext where gponSerialNumber = &#63; from the database.
    *
    * @param gponSerialNumber the gpon serial number
    * @return the device ext that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceExt removeByGponSerialNumber(
        java.lang.String gponSerialNumber)
        throws com.dasannetworks.vn.sb.NoSuchDeviceExtException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().removeByGponSerialNumber(gponSerialNumber);
    }

    /**
    * Returns the number of device exts where gponSerialNumber = &#63;.
    *
    * @param gponSerialNumber the gpon serial number
    * @return the number of matching device exts
    * @throws SystemException if a system exception occurred
    */
    public static int countByGponSerialNumber(java.lang.String gponSerialNumber)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByGponSerialNumber(gponSerialNumber);
    }

    /**
    * Returns the device ext where customerSerialNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceExtException} if it could not be found.
    *
    * @param customerSerialNumber the customer serial number
    * @return the matching device ext
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtException if a matching device ext could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceExt findByCustomerSerialNumber(
        java.lang.String customerSerialNumber)
        throws com.dasannetworks.vn.sb.NoSuchDeviceExtException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByCustomerSerialNumber(customerSerialNumber);
    }

    /**
    * Returns the device ext where customerSerialNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param customerSerialNumber the customer serial number
    * @return the matching device ext, or <code>null</code> if a matching device ext could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceExt fetchByCustomerSerialNumber(
        java.lang.String customerSerialNumber)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByCustomerSerialNumber(customerSerialNumber);
    }

    /**
    * Returns the device ext where customerSerialNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param customerSerialNumber the customer serial number
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching device ext, or <code>null</code> if a matching device ext could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceExt fetchByCustomerSerialNumber(
        java.lang.String customerSerialNumber, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByCustomerSerialNumber(customerSerialNumber,
            retrieveFromCache);
    }

    /**
    * Removes the device ext where customerSerialNumber = &#63; from the database.
    *
    * @param customerSerialNumber the customer serial number
    * @return the device ext that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceExt removeByCustomerSerialNumber(
        java.lang.String customerSerialNumber)
        throws com.dasannetworks.vn.sb.NoSuchDeviceExtException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .removeByCustomerSerialNumber(customerSerialNumber);
    }

    /**
    * Returns the number of device exts where customerSerialNumber = &#63;.
    *
    * @param customerSerialNumber the customer serial number
    * @return the number of matching device exts
    * @throws SystemException if a system exception occurred
    */
    public static int countByCustomerSerialNumber(
        java.lang.String customerSerialNumber)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByCustomerSerialNumber(customerSerialNumber);
    }

    /**
    * Caches the device ext in the entity cache if it is enabled.
    *
    * @param deviceExt the device ext
    */
    public static void cacheResult(
        com.dasannetworks.vn.sb.model.DeviceExt deviceExt) {
        getPersistence().cacheResult(deviceExt);
    }

    /**
    * Caches the device exts in the entity cache if it is enabled.
    *
    * @param deviceExts the device exts
    */
    public static void cacheResult(
        java.util.List<com.dasannetworks.vn.sb.model.DeviceExt> deviceExts) {
        getPersistence().cacheResult(deviceExts);
    }

    /**
    * Creates a new device ext with the primary key. Does not add the device ext to the database.
    *
    * @param deviceExtId the primary key for the new device ext
    * @return the new device ext
    */
    public static com.dasannetworks.vn.sb.model.DeviceExt create(
        long deviceExtId) {
        return getPersistence().create(deviceExtId);
    }

    /**
    * Removes the device ext with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param deviceExtId the primary key of the device ext
    * @return the device ext that was removed
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtException if a device ext with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceExt remove(
        long deviceExtId)
        throws com.dasannetworks.vn.sb.NoSuchDeviceExtException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(deviceExtId);
    }

    public static com.dasannetworks.vn.sb.model.DeviceExt updateImpl(
        com.dasannetworks.vn.sb.model.DeviceExt deviceExt)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(deviceExt);
    }

    /**
    * Returns the device ext with the primary key or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceExtException} if it could not be found.
    *
    * @param deviceExtId the primary key of the device ext
    * @return the device ext
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtException if a device ext with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceExt findByPrimaryKey(
        long deviceExtId)
        throws com.dasannetworks.vn.sb.NoSuchDeviceExtException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(deviceExtId);
    }

    /**
    * Returns the device ext with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param deviceExtId the primary key of the device ext
    * @return the device ext, or <code>null</code> if a device ext with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceExt fetchByPrimaryKey(
        long deviceExtId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(deviceExtId);
    }

    /**
    * Returns all the device exts.
    *
    * @return the device exts
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.DeviceExt> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the device exts.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceExtModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of device exts
    * @param end the upper bound of the range of device exts (not inclusive)
    * @return the range of device exts
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.DeviceExt> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the device exts.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceExtModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of device exts
    * @param end the upper bound of the range of device exts (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of device exts
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.DeviceExt> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the device exts from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of device exts.
    *
    * @return the number of device exts
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static DeviceExtPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (DeviceExtPersistence) PortletBeanLocatorUtil.locate(com.dasannetworks.vn.sb.service.ClpSerializer.getServletContextName(),
                    DeviceExtPersistence.class.getName());

            ReferenceRegistry.registerReference(DeviceExtUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(DeviceExtPersistence persistence) {
    }
}
