package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.DeviceHis;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the device his service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DeviceHisPersistenceImpl
 * @see DeviceHisUtil
 * @generated
 */
public interface DeviceHisPersistence extends BasePersistence<DeviceHis> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link DeviceHisUtil} to access the device his persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the device hises where purchaseOrderId = &#63;.
    *
    * @param purchaseOrderId the purchase order ID
    * @return the matching device hises
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.DeviceHis> findByPurchaseOrderId(
        java.lang.Long purchaseOrderId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.dasannetworks.vn.sb.model.DeviceHis> findByPurchaseOrderId(
        java.lang.Long purchaseOrderId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.dasannetworks.vn.sb.model.DeviceHis> findByPurchaseOrderId(
        java.lang.Long purchaseOrderId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first device his in the ordered set where purchaseOrderId = &#63;.
    *
    * @param purchaseOrderId the purchase order ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceHis findByPurchaseOrderId_First(
        java.lang.Long purchaseOrderId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first device his in the ordered set where purchaseOrderId = &#63;.
    *
    * @param purchaseOrderId the purchase order ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device his, or <code>null</code> if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceHis fetchByPurchaseOrderId_First(
        java.lang.Long purchaseOrderId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last device his in the ordered set where purchaseOrderId = &#63;.
    *
    * @param purchaseOrderId the purchase order ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceHis findByPurchaseOrderId_Last(
        java.lang.Long purchaseOrderId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last device his in the ordered set where purchaseOrderId = &#63;.
    *
    * @param purchaseOrderId the purchase order ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device his, or <code>null</code> if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceHis fetchByPurchaseOrderId_Last(
        java.lang.Long purchaseOrderId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.dasannetworks.vn.sb.model.DeviceHis[] findByPurchaseOrderId_PrevAndNext(
        long deviceId, java.lang.Long purchaseOrderId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the device hises where purchaseOrderId = &#63; from the database.
    *
    * @param purchaseOrderId the purchase order ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByPurchaseOrderId(java.lang.Long purchaseOrderId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of device hises where purchaseOrderId = &#63;.
    *
    * @param purchaseOrderId the purchase order ID
    * @return the number of matching device hises
    * @throws SystemException if a system exception occurred
    */
    public int countByPurchaseOrderId(java.lang.Long purchaseOrderId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the device hises where modelName = &#63;.
    *
    * @param modelName the model name
    * @return the matching device hises
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.DeviceHis> findByModelName(
        java.lang.String modelName)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.dasannetworks.vn.sb.model.DeviceHis> findByModelName(
        java.lang.String modelName, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.dasannetworks.vn.sb.model.DeviceHis> findByModelName(
        java.lang.String modelName, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first device his in the ordered set where modelName = &#63;.
    *
    * @param modelName the model name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceHis findByModelName_First(
        java.lang.String modelName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first device his in the ordered set where modelName = &#63;.
    *
    * @param modelName the model name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device his, or <code>null</code> if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceHis fetchByModelName_First(
        java.lang.String modelName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last device his in the ordered set where modelName = &#63;.
    *
    * @param modelName the model name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceHis findByModelName_Last(
        java.lang.String modelName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last device his in the ordered set where modelName = &#63;.
    *
    * @param modelName the model name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device his, or <code>null</code> if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceHis fetchByModelName_Last(
        java.lang.String modelName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.dasannetworks.vn.sb.model.DeviceHis[] findByModelName_PrevAndNext(
        long deviceId, java.lang.String modelName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the device hises where modelName = &#63; from the database.
    *
    * @param modelName the model name
    * @throws SystemException if a system exception occurred
    */
    public void removeByModelName(java.lang.String modelName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of device hises where modelName = &#63;.
    *
    * @param modelName the model name
    * @return the number of matching device hises
    * @throws SystemException if a system exception occurred
    */
    public int countByModelName(java.lang.String modelName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the device hises where warrantyFormId = &#63;.
    *
    * @param warrantyFormId the warranty form ID
    * @return the matching device hises
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.DeviceHis> findByWarrantyFormId(
        java.lang.Long warrantyFormId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.dasannetworks.vn.sb.model.DeviceHis> findByWarrantyFormId(
        java.lang.Long warrantyFormId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.dasannetworks.vn.sb.model.DeviceHis> findByWarrantyFormId(
        java.lang.Long warrantyFormId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first device his in the ordered set where warrantyFormId = &#63;.
    *
    * @param warrantyFormId the warranty form ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceHis findByWarrantyFormId_First(
        java.lang.Long warrantyFormId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first device his in the ordered set where warrantyFormId = &#63;.
    *
    * @param warrantyFormId the warranty form ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device his, or <code>null</code> if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceHis fetchByWarrantyFormId_First(
        java.lang.Long warrantyFormId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last device his in the ordered set where warrantyFormId = &#63;.
    *
    * @param warrantyFormId the warranty form ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceHis findByWarrantyFormId_Last(
        java.lang.Long warrantyFormId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last device his in the ordered set where warrantyFormId = &#63;.
    *
    * @param warrantyFormId the warranty form ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device his, or <code>null</code> if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceHis fetchByWarrantyFormId_Last(
        java.lang.Long warrantyFormId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.dasannetworks.vn.sb.model.DeviceHis[] findByWarrantyFormId_PrevAndNext(
        long deviceId, java.lang.Long warrantyFormId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the device hises where warrantyFormId = &#63; from the database.
    *
    * @param warrantyFormId the warranty form ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByWarrantyFormId(java.lang.Long warrantyFormId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of device hises where warrantyFormId = &#63;.
    *
    * @param warrantyFormId the warranty form ID
    * @return the number of matching device hises
    * @throws SystemException if a system exception occurred
    */
    public int countByWarrantyFormId(java.lang.Long warrantyFormId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device his where serialNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceHisException} if it could not be found.
    *
    * @param serialNumber the serial number
    * @return the matching device his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceHis findBySerialNumber(
        java.lang.String serialNumber)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device his where serialNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param serialNumber the serial number
    * @return the matching device his, or <code>null</code> if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceHis fetchBySerialNumber(
        java.lang.String serialNumber)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device his where serialNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param serialNumber the serial number
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching device his, or <code>null</code> if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceHis fetchBySerialNumber(
        java.lang.String serialNumber, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the device his where serialNumber = &#63; from the database.
    *
    * @param serialNumber the serial number
    * @return the device his that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceHis removeBySerialNumber(
        java.lang.String serialNumber)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of device hises where serialNumber = &#63;.
    *
    * @param serialNumber the serial number
    * @return the number of matching device hises
    * @throws SystemException if a system exception occurred
    */
    public int countBySerialNumber(java.lang.String serialNumber)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device his where gponSerialNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceHisException} if it could not be found.
    *
    * @param gponSerialNumber the gpon serial number
    * @return the matching device his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceHis findByGponSerialNumber(
        java.lang.String gponSerialNumber)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device his where gponSerialNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param gponSerialNumber the gpon serial number
    * @return the matching device his, or <code>null</code> if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceHis fetchByGponSerialNumber(
        java.lang.String gponSerialNumber)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device his where gponSerialNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param gponSerialNumber the gpon serial number
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching device his, or <code>null</code> if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceHis fetchByGponSerialNumber(
        java.lang.String gponSerialNumber, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the device his where gponSerialNumber = &#63; from the database.
    *
    * @param gponSerialNumber the gpon serial number
    * @return the device his that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceHis removeByGponSerialNumber(
        java.lang.String gponSerialNumber)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of device hises where gponSerialNumber = &#63;.
    *
    * @param gponSerialNumber the gpon serial number
    * @return the number of matching device hises
    * @throws SystemException if a system exception occurred
    */
    public int countByGponSerialNumber(java.lang.String gponSerialNumber)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device his where customerSerialNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceHisException} if it could not be found.
    *
    * @param customerSerialNumber the customer serial number
    * @return the matching device his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceHis findByCustomerSerialNumber(
        java.lang.String customerSerialNumber)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device his where customerSerialNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param customerSerialNumber the customer serial number
    * @return the matching device his, or <code>null</code> if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceHis fetchByCustomerSerialNumber(
        java.lang.String customerSerialNumber)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device his where customerSerialNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param customerSerialNumber the customer serial number
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching device his, or <code>null</code> if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceHis fetchByCustomerSerialNumber(
        java.lang.String customerSerialNumber, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the device his where customerSerialNumber = &#63; from the database.
    *
    * @param customerSerialNumber the customer serial number
    * @return the device his that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceHis removeByCustomerSerialNumber(
        java.lang.String customerSerialNumber)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of device hises where customerSerialNumber = &#63;.
    *
    * @param customerSerialNumber the customer serial number
    * @return the number of matching device hises
    * @throws SystemException if a system exception occurred
    */
    public int countByCustomerSerialNumber(
        java.lang.String customerSerialNumber)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the device hises where status = &#63;.
    *
    * @param status the status
    * @return the matching device hises
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.DeviceHis> findByStatus(
        int status) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.dasannetworks.vn.sb.model.DeviceHis> findByStatus(
        int status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.dasannetworks.vn.sb.model.DeviceHis> findByStatus(
        int status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first device his in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceHis findByStatus_First(
        int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first device his in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device his, or <code>null</code> if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceHis fetchByStatus_First(
        int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last device his in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceHis findByStatus_Last(
        int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last device his in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device his, or <code>null</code> if a matching device his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceHis fetchByStatus_Last(
        int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.dasannetworks.vn.sb.model.DeviceHis[] findByStatus_PrevAndNext(
        long deviceId, int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the device hises where status = &#63; from the database.
    *
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public void removeByStatus(int status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of device hises where status = &#63;.
    *
    * @param status the status
    * @return the number of matching device hises
    * @throws SystemException if a system exception occurred
    */
    public int countByStatus(int status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the device his in the entity cache if it is enabled.
    *
    * @param deviceHis the device his
    */
    public void cacheResult(com.dasannetworks.vn.sb.model.DeviceHis deviceHis);

    /**
    * Caches the device hises in the entity cache if it is enabled.
    *
    * @param deviceHises the device hises
    */
    public void cacheResult(
        java.util.List<com.dasannetworks.vn.sb.model.DeviceHis> deviceHises);

    /**
    * Creates a new device his with the primary key. Does not add the device his to the database.
    *
    * @param deviceId the primary key for the new device his
    * @return the new device his
    */
    public com.dasannetworks.vn.sb.model.DeviceHis create(long deviceId);

    /**
    * Removes the device his with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param deviceId the primary key of the device his
    * @return the device his that was removed
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a device his with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceHis remove(long deviceId)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.dasannetworks.vn.sb.model.DeviceHis updateImpl(
        com.dasannetworks.vn.sb.model.DeviceHis deviceHis)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device his with the primary key or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceHisException} if it could not be found.
    *
    * @param deviceId the primary key of the device his
    * @return the device his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceHisException if a device his with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceHis findByPrimaryKey(
        long deviceId)
        throws com.dasannetworks.vn.sb.NoSuchDeviceHisException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device his with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param deviceId the primary key of the device his
    * @return the device his, or <code>null</code> if a device his with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceHis fetchByPrimaryKey(
        long deviceId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the device hises.
    *
    * @return the device hises
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.DeviceHis> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.dasannetworks.vn.sb.model.DeviceHis> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.dasannetworks.vn.sb.model.DeviceHis> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the device hises from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of device hises.
    *
    * @return the number of device hises
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
