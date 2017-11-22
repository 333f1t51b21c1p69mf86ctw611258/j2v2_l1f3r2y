package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.DeviceHis;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the device his service. This utility wraps {@link DeviceHisPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DeviceHisPersistence
 * @see DeviceHisPersistenceImpl
 * @generated
 */
public class DeviceHisUtil {
    private static DeviceHisPersistence _persistence;

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
    public static void clearCache(DeviceHis deviceHis) {
        getPersistence().clearCache(deviceHis);
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
    public static List<DeviceHis> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<DeviceHis> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<DeviceHis> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static DeviceHis update(DeviceHis deviceHis)
        throws SystemException {
        return getPersistence().update(deviceHis);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static DeviceHis update(DeviceHis deviceHis,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(deviceHis, serviceContext);
    }

    /**
    * Returns all the device hises where purchaseOrderId = &#63;.
    *
    * @param purchaseOrderId the purchase order ID
    * @return the matching device hises
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.DeviceHis> findByPurchaseOrderId(
        java.lang.Long purchaseOrderId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPurchaseOrderId(purchaseOrderId);
    }

    /**
    * Returns a range of all the device hises where purchaseOrderId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceHisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param purchaseOrderId the purchase order ID
    * @param start the lower bound of the range of device hises
    * @param end the upper bound of the range of device hises (not inclusive)
    * @return the range of matching device hises
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.DeviceHis> findByPurchaseOrderId(
        java.lang.Long purchaseOrderId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByPurchaseOrderId(purchaseOrderId, start, end);
    }

    /**
    * Returns an ordered range of all the device hises where purchaseOrderId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceHisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param purchaseOrderId the purchase order ID
    * @param start the lower bound of the range of device hises
    * @param end the upper bound of the range of device hises (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching device hises
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.DeviceHis> findByPurchaseOrderId(
        java.lang.Long purchaseOrderId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByPurchaseOrderId(purchaseOrderId, start, end,
            orderByComparator);
    }

    /**
    * Returns the first device his in the ordered set where purchaseOrderId = &#63;.
    *
    * @param purchaseOrderId the purchase order ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis findByPurchaseOrderId_First(
        java.lang.Long purchaseOrderId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByPurchaseOrderId_First(purchaseOrderId,
            orderByComparator);
    }

    /**
    * Returns the first device his in the ordered set where purchaseOrderId = &#63;.
    *
    * @param purchaseOrderId the purchase order ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device his, or <code>null</code> if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis fetchByPurchaseOrderId_First(
        java.lang.Long purchaseOrderId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByPurchaseOrderId_First(purchaseOrderId,
            orderByComparator);
    }

    /**
    * Returns the last device his in the ordered set where purchaseOrderId = &#63;.
    *
    * @param purchaseOrderId the purchase order ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis findByPurchaseOrderId_Last(
        java.lang.Long purchaseOrderId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByPurchaseOrderId_Last(purchaseOrderId,
            orderByComparator);
    }

    /**
    * Returns the last device his in the ordered set where purchaseOrderId = &#63;.
    *
    * @param purchaseOrderId the purchase order ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device his, or <code>null</code> if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis fetchByPurchaseOrderId_Last(
        java.lang.Long purchaseOrderId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByPurchaseOrderId_Last(purchaseOrderId,
            orderByComparator);
    }

    /**
    * Returns the device hises before and after the current device his in the ordered set where purchaseOrderId = &#63;.
    *
    * @param deviceId the primary key of the current device his
    * @param purchaseOrderId the purchase order ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next device his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a device his with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis[] findByPurchaseOrderId_PrevAndNext(
        long deviceId, java.lang.Long purchaseOrderId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByPurchaseOrderId_PrevAndNext(deviceId,
            purchaseOrderId, orderByComparator);
    }

    /**
    * Removes all the device hises where purchaseOrderId = &#63; from the database.
    *
    * @param purchaseOrderId the purchase order ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByPurchaseOrderId(java.lang.Long purchaseOrderId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByPurchaseOrderId(purchaseOrderId);
    }

    /**
    * Returns the number of device hises where purchaseOrderId = &#63;.
    *
    * @param purchaseOrderId the purchase order ID
    * @return the number of matching device hises
    * @throws SystemException if a system exception occurred
    */
    public static int countByPurchaseOrderId(java.lang.Long purchaseOrderId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByPurchaseOrderId(purchaseOrderId);
    }

    /**
    * Returns all the device hises where modelName = &#63;.
    *
    * @param modelName the model name
    * @return the matching device hises
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.DeviceHis> findByModelName(
        java.lang.String modelName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByModelName(modelName);
    }

    /**
    * Returns a range of all the device hises where modelName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceHisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param modelName the model name
    * @param start the lower bound of the range of device hises
    * @param end the upper bound of the range of device hises (not inclusive)
    * @return the range of matching device hises
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.DeviceHis> findByModelName(
        java.lang.String modelName, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByModelName(modelName, start, end);
    }

    /**
    * Returns an ordered range of all the device hises where modelName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceHisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param modelName the model name
    * @param start the lower bound of the range of device hises
    * @param end the upper bound of the range of device hises (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching device hises
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.DeviceHis> findByModelName(
        java.lang.String modelName, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByModelName(modelName, start, end, orderByComparator);
    }

    /**
    * Returns the first device his in the ordered set where modelName = &#63;.
    *
    * @param modelName the model name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis findByModelName_First(
        java.lang.String modelName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByModelName_First(modelName, orderByComparator);
    }

    /**
    * Returns the first device his in the ordered set where modelName = &#63;.
    *
    * @param modelName the model name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device his, or <code>null</code> if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis fetchByModelName_First(
        java.lang.String modelName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByModelName_First(modelName, orderByComparator);
    }

    /**
    * Returns the last device his in the ordered set where modelName = &#63;.
    *
    * @param modelName the model name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis findByModelName_Last(
        java.lang.String modelName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByModelName_Last(modelName, orderByComparator);
    }

    /**
    * Returns the last device his in the ordered set where modelName = &#63;.
    *
    * @param modelName the model name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device his, or <code>null</code> if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis fetchByModelName_Last(
        java.lang.String modelName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByModelName_Last(modelName, orderByComparator);
    }

    /**
    * Returns the device hises before and after the current device his in the ordered set where modelName = &#63;.
    *
    * @param deviceId the primary key of the current device his
    * @param modelName the model name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next device his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a device his with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis[] findByModelName_PrevAndNext(
        long deviceId, java.lang.String modelName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByModelName_PrevAndNext(deviceId, modelName,
            orderByComparator);
    }

    /**
    * Removes all the device hises where modelName = &#63; from the database.
    *
    * @param modelName the model name
    * @throws SystemException if a system exception occurred
    */
    public static void removeByModelName(java.lang.String modelName)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByModelName(modelName);
    }

    /**
    * Returns the number of device hises where modelName = &#63;.
    *
    * @param modelName the model name
    * @return the number of matching device hises
    * @throws SystemException if a system exception occurred
    */
    public static int countByModelName(java.lang.String modelName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByModelName(modelName);
    }

    /**
    * Returns all the device hises where warrantyFormId = &#63;.
    *
    * @param warrantyFormId the warranty form ID
    * @return the matching device hises
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.DeviceHis> findByWarrantyFormId(
        java.lang.Long warrantyFormId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByWarrantyFormId(warrantyFormId);
    }

    /**
    * Returns a range of all the device hises where warrantyFormId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceHisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param warrantyFormId the warranty form ID
    * @param start the lower bound of the range of device hises
    * @param end the upper bound of the range of device hises (not inclusive)
    * @return the range of matching device hises
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.DeviceHis> findByWarrantyFormId(
        java.lang.Long warrantyFormId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByWarrantyFormId(warrantyFormId, start, end);
    }

    /**
    * Returns an ordered range of all the device hises where warrantyFormId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceHisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param warrantyFormId the warranty form ID
    * @param start the lower bound of the range of device hises
    * @param end the upper bound of the range of device hises (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching device hises
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.DeviceHis> findByWarrantyFormId(
        java.lang.Long warrantyFormId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByWarrantyFormId(warrantyFormId, start, end,
            orderByComparator);
    }

    /**
    * Returns the first device his in the ordered set where warrantyFormId = &#63;.
    *
    * @param warrantyFormId the warranty form ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis findByWarrantyFormId_First(
        java.lang.Long warrantyFormId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByWarrantyFormId_First(warrantyFormId, orderByComparator);
    }

    /**
    * Returns the first device his in the ordered set where warrantyFormId = &#63;.
    *
    * @param warrantyFormId the warranty form ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device his, or <code>null</code> if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis fetchByWarrantyFormId_First(
        java.lang.Long warrantyFormId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByWarrantyFormId_First(warrantyFormId,
            orderByComparator);
    }

    /**
    * Returns the last device his in the ordered set where warrantyFormId = &#63;.
    *
    * @param warrantyFormId the warranty form ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis findByWarrantyFormId_Last(
        java.lang.Long warrantyFormId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByWarrantyFormId_Last(warrantyFormId, orderByComparator);
    }

    /**
    * Returns the last device his in the ordered set where warrantyFormId = &#63;.
    *
    * @param warrantyFormId the warranty form ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device his, or <code>null</code> if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis fetchByWarrantyFormId_Last(
        java.lang.Long warrantyFormId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByWarrantyFormId_Last(warrantyFormId, orderByComparator);
    }

    /**
    * Returns the device hises before and after the current device his in the ordered set where warrantyFormId = &#63;.
    *
    * @param deviceId the primary key of the current device his
    * @param warrantyFormId the warranty form ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next device his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a device his with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis[] findByWarrantyFormId_PrevAndNext(
        long deviceId, java.lang.Long warrantyFormId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByWarrantyFormId_PrevAndNext(deviceId, warrantyFormId,
            orderByComparator);
    }

    /**
    * Removes all the device hises where warrantyFormId = &#63; from the database.
    *
    * @param warrantyFormId the warranty form ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByWarrantyFormId(java.lang.Long warrantyFormId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByWarrantyFormId(warrantyFormId);
    }

    /**
    * Returns the number of device hises where warrantyFormId = &#63;.
    *
    * @param warrantyFormId the warranty form ID
    * @return the number of matching device hises
    * @throws SystemException if a system exception occurred
    */
    public static int countByWarrantyFormId(java.lang.Long warrantyFormId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByWarrantyFormId(warrantyFormId);
    }

    /**
    * Returns the device his where serialNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceHisException} if it could not be found.
    *
    * @param serialNumber the serial number
    * @return the matching device his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis findBySerialNumber(
        java.lang.String serialNumber)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBySerialNumber(serialNumber);
    }

    /**
    * Returns the device his where serialNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param serialNumber the serial number
    * @return the matching device his, or <code>null</code> if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis fetchBySerialNumber(
        java.lang.String serialNumber)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBySerialNumber(serialNumber);
    }

    /**
    * Returns the device his where serialNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param serialNumber the serial number
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching device his, or <code>null</code> if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis fetchBySerialNumber(
        java.lang.String serialNumber, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchBySerialNumber(serialNumber, retrieveFromCache);
    }

    /**
    * Removes the device his where serialNumber = &#63; from the database.
    *
    * @param serialNumber the serial number
    * @return the device his that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis removeBySerialNumber(
        java.lang.String serialNumber)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().removeBySerialNumber(serialNumber);
    }

    /**
    * Returns the number of device hises where serialNumber = &#63;.
    *
    * @param serialNumber the serial number
    * @return the number of matching device hises
    * @throws SystemException if a system exception occurred
    */
    public static int countBySerialNumber(java.lang.String serialNumber)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countBySerialNumber(serialNumber);
    }

    /**
    * Returns the device his where gponSerialNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceHisException} if it could not be found.
    *
    * @param gponSerialNumber the gpon serial number
    * @return the matching device his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis findByGponSerialNumber(
        java.lang.String gponSerialNumber)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGponSerialNumber(gponSerialNumber);
    }

    /**
    * Returns the device his where gponSerialNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param gponSerialNumber the gpon serial number
    * @return the matching device his, or <code>null</code> if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis fetchByGponSerialNumber(
        java.lang.String gponSerialNumber)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGponSerialNumber(gponSerialNumber);
    }

    /**
    * Returns the device his where gponSerialNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param gponSerialNumber the gpon serial number
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching device his, or <code>null</code> if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis fetchByGponSerialNumber(
        java.lang.String gponSerialNumber, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByGponSerialNumber(gponSerialNumber, retrieveFromCache);
    }

    /**
    * Removes the device his where gponSerialNumber = &#63; from the database.
    *
    * @param gponSerialNumber the gpon serial number
    * @return the device his that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis removeByGponSerialNumber(
        java.lang.String gponSerialNumber)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().removeByGponSerialNumber(gponSerialNumber);
    }

    /**
    * Returns the number of device hises where gponSerialNumber = &#63;.
    *
    * @param gponSerialNumber the gpon serial number
    * @return the number of matching device hises
    * @throws SystemException if a system exception occurred
    */
    public static int countByGponSerialNumber(java.lang.String gponSerialNumber)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByGponSerialNumber(gponSerialNumber);
    }

    /**
    * Returns the device his where customerSerialNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceHisException} if it could not be found.
    *
    * @param customerSerialNumber the customer serial number
    * @return the matching device his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis findByCustomerSerialNumber(
        java.lang.String customerSerialNumber)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByCustomerSerialNumber(customerSerialNumber);
    }

    /**
    * Returns the device his where customerSerialNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param customerSerialNumber the customer serial number
    * @return the matching device his, or <code>null</code> if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis fetchByCustomerSerialNumber(
        java.lang.String customerSerialNumber)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByCustomerSerialNumber(customerSerialNumber);
    }

    /**
    * Returns the device his where customerSerialNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param customerSerialNumber the customer serial number
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching device his, or <code>null</code> if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis fetchByCustomerSerialNumber(
        java.lang.String customerSerialNumber, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByCustomerSerialNumber(customerSerialNumber,
            retrieveFromCache);
    }

    /**
    * Removes the device his where customerSerialNumber = &#63; from the database.
    *
    * @param customerSerialNumber the customer serial number
    * @return the device his that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis removeByCustomerSerialNumber(
        java.lang.String customerSerialNumber)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .removeByCustomerSerialNumber(customerSerialNumber);
    }

    /**
    * Returns the number of device hises where customerSerialNumber = &#63;.
    *
    * @param customerSerialNumber the customer serial number
    * @return the number of matching device hises
    * @throws SystemException if a system exception occurred
    */
    public static int countByCustomerSerialNumber(
        java.lang.String customerSerialNumber)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByCustomerSerialNumber(customerSerialNumber);
    }

    /**
    * Returns all the device hises where status = &#63;.
    *
    * @param status the status
    * @return the matching device hises
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.DeviceHis> findByStatus(
        int status) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByStatus(status);
    }

    /**
    * Returns a range of all the device hises where status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceHisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param status the status
    * @param start the lower bound of the range of device hises
    * @param end the upper bound of the range of device hises (not inclusive)
    * @return the range of matching device hises
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.DeviceHis> findByStatus(
        int status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByStatus(status, start, end);
    }

    /**
    * Returns an ordered range of all the device hises where status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceHisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param status the status
    * @param start the lower bound of the range of device hises
    * @param end the upper bound of the range of device hises (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching device hises
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.DeviceHis> findByStatus(
        int status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByStatus(status, start, end, orderByComparator);
    }

    /**
    * Returns the first device his in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis findByStatus_First(
        int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByStatus_First(status, orderByComparator);
    }

    /**
    * Returns the first device his in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device his, or <code>null</code> if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis fetchByStatus_First(
        int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByStatus_First(status, orderByComparator);
    }

    /**
    * Returns the last device his in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis findByStatus_Last(
        int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByStatus_Last(status, orderByComparator);
    }

    /**
    * Returns the last device his in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device his, or <code>null</code> if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis fetchByStatus_Last(
        int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByStatus_Last(status, orderByComparator);
    }

    /**
    * Returns the device hises before and after the current device his in the ordered set where status = &#63;.
    *
    * @param deviceId the primary key of the current device his
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next device his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a device his with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis[] findByStatus_PrevAndNext(
        long deviceId, int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByStatus_PrevAndNext(deviceId, status, orderByComparator);
    }

    /**
    * Removes all the device hises where status = &#63; from the database.
    *
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public static void removeByStatus(int status)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByStatus(status);
    }

    /**
    * Returns the number of device hises where status = &#63;.
    *
    * @param status the status
    * @return the number of matching device hises
    * @throws SystemException if a system exception occurred
    */
    public static int countByStatus(int status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByStatus(status);
    }

    /**
    * Caches the device his in the entity cache if it is enabled.
    *
    * @param deviceHis the device his
    */
    public static void cacheResult(
        com.dasannetworks.vn.sb.model.DeviceHis deviceHis) {
        getPersistence().cacheResult(deviceHis);
    }

    /**
    * Caches the device hises in the entity cache if it is enabled.
    *
    * @param deviceHises the device hises
    */
    public static void cacheResult(
        java.util.List<com.dasannetworks.vn.sb.model.DeviceHis> deviceHises) {
        getPersistence().cacheResult(deviceHises);
    }

    /**
    * Creates a new device his with the primary key. Does not add the device his to the database.
    *
    * @param deviceId the primary key for the new device his
    * @return the new device his
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis create(long deviceId) {
        return getPersistence().create(deviceId);
    }

    /**
    * Removes the device his with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param deviceId the primary key of the device his
    * @return the device his that was removed
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a device his with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis remove(long deviceId)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(deviceId);
    }

    public static com.dasannetworks.vn.sb.model.DeviceHis updateImpl(
        com.dasannetworks.vn.sb.model.DeviceHis deviceHis)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(deviceHis);
    }

    /**
    * Returns the device his with the primary key or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceHisException} if it could not be found.
    *
    * @param deviceId the primary key of the device his
    * @return the device his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a device his with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis findByPrimaryKey(
        long deviceId)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(deviceId);
    }

    /**
    * Returns the device his with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param deviceId the primary key of the device his
    * @return the device his, or <code>null</code> if a device his with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.DeviceHis fetchByPrimaryKey(
        long deviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(deviceId);
    }

    /**
    * Returns all the device hises.
    *
    * @return the device hises
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.DeviceHis> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.dasannetworks.vn.sb.model.DeviceHis> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the device hises.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceHisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of device hises
    * @param end the upper bound of the range of device hises (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of device hises
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.DeviceHis> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the device hises from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of device hises.
    *
    * @return the number of device hises
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static DeviceHisPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (DeviceHisPersistence) PortletBeanLocatorUtil.locate(com.dasannetworks.vn.sb.service.ClpSerializer.getServletContextName(),
                    DeviceHisPersistence.class.getName());

            ReferenceRegistry.registerReference(DeviceHisUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(DeviceHisPersistence persistence) {
    }
}
