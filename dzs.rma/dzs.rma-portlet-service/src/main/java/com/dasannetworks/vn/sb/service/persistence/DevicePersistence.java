package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.Device;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the device service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DevicePersistenceImpl
 * @see DeviceUtil
 * @generated
 */
public interface DevicePersistence extends BasePersistence<Device> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link DeviceUtil} to access the device persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the devices where purchaseOrderId = &#63;.
    *
    * @param purchaseOrderId the purchase order ID
    * @return the matching devices
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.Device> findByPurchaseOrderId(
        java.lang.Long purchaseOrderId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the devices where purchaseOrderId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param purchaseOrderId the purchase order ID
    * @param start the lower bound of the range of devices
    * @param end the upper bound of the range of devices (not inclusive)
    * @return the range of matching devices
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.Device> findByPurchaseOrderId(
        java.lang.Long purchaseOrderId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the devices where purchaseOrderId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param purchaseOrderId the purchase order ID
    * @param start the lower bound of the range of devices
    * @param end the upper bound of the range of devices (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching devices
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.Device> findByPurchaseOrderId(
        java.lang.Long purchaseOrderId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first device in the ordered set where purchaseOrderId = &#63;.
    *
    * @param purchaseOrderId the purchase order ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceException if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Device findByPurchaseOrderId_First(
        java.lang.Long purchaseOrderId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first device in the ordered set where purchaseOrderId = &#63;.
    *
    * @param purchaseOrderId the purchase order ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device, or <code>null</code> if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Device fetchByPurchaseOrderId_First(
        java.lang.Long purchaseOrderId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last device in the ordered set where purchaseOrderId = &#63;.
    *
    * @param purchaseOrderId the purchase order ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceException if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Device findByPurchaseOrderId_Last(
        java.lang.Long purchaseOrderId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last device in the ordered set where purchaseOrderId = &#63;.
    *
    * @param purchaseOrderId the purchase order ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device, or <code>null</code> if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Device fetchByPurchaseOrderId_Last(
        java.lang.Long purchaseOrderId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the devices before and after the current device in the ordered set where purchaseOrderId = &#63;.
    *
    * @param deviceId the primary key of the current device
    * @param purchaseOrderId the purchase order ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next device
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceException if a device with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Device[] findByPurchaseOrderId_PrevAndNext(
        long deviceId, java.lang.Long purchaseOrderId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the devices where purchaseOrderId = &#63; from the database.
    *
    * @param purchaseOrderId the purchase order ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByPurchaseOrderId(java.lang.Long purchaseOrderId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of devices where purchaseOrderId = &#63;.
    *
    * @param purchaseOrderId the purchase order ID
    * @return the number of matching devices
    * @throws SystemException if a system exception occurred
    */
    public int countByPurchaseOrderId(java.lang.Long purchaseOrderId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the devices where modelName = &#63;.
    *
    * @param modelName the model name
    * @return the matching devices
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.Device> findByModelName(
        java.lang.String modelName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the devices where modelName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param modelName the model name
    * @param start the lower bound of the range of devices
    * @param end the upper bound of the range of devices (not inclusive)
    * @return the range of matching devices
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.Device> findByModelName(
        java.lang.String modelName, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the devices where modelName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param modelName the model name
    * @param start the lower bound of the range of devices
    * @param end the upper bound of the range of devices (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching devices
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.Device> findByModelName(
        java.lang.String modelName, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first device in the ordered set where modelName = &#63;.
    *
    * @param modelName the model name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceException if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Device findByModelName_First(
        java.lang.String modelName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first device in the ordered set where modelName = &#63;.
    *
    * @param modelName the model name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device, or <code>null</code> if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Device fetchByModelName_First(
        java.lang.String modelName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last device in the ordered set where modelName = &#63;.
    *
    * @param modelName the model name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceException if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Device findByModelName_Last(
        java.lang.String modelName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last device in the ordered set where modelName = &#63;.
    *
    * @param modelName the model name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device, or <code>null</code> if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Device fetchByModelName_Last(
        java.lang.String modelName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the devices before and after the current device in the ordered set where modelName = &#63;.
    *
    * @param deviceId the primary key of the current device
    * @param modelName the model name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next device
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceException if a device with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Device[] findByModelName_PrevAndNext(
        long deviceId, java.lang.String modelName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the devices where modelName = &#63; from the database.
    *
    * @param modelName the model name
    * @throws SystemException if a system exception occurred
    */
    public void removeByModelName(java.lang.String modelName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of devices where modelName = &#63;.
    *
    * @param modelName the model name
    * @return the number of matching devices
    * @throws SystemException if a system exception occurred
    */
    public int countByModelName(java.lang.String modelName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device where warrantyFormId = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceException} if it could not be found.
    *
    * @param warrantyFormId the warranty form ID
    * @return the matching device
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceException if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Device findByWarrantyFormId(
        java.lang.Long warrantyFormId)
        throws com.dasannetworks.vn.sb.NoSuchDeviceException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device where warrantyFormId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param warrantyFormId the warranty form ID
    * @return the matching device, or <code>null</code> if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Device fetchByWarrantyFormId(
        java.lang.Long warrantyFormId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device where warrantyFormId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param warrantyFormId the warranty form ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching device, or <code>null</code> if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Device fetchByWarrantyFormId(
        java.lang.Long warrantyFormId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the device where warrantyFormId = &#63; from the database.
    *
    * @param warrantyFormId the warranty form ID
    * @return the device that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Device removeByWarrantyFormId(
        java.lang.Long warrantyFormId)
        throws com.dasannetworks.vn.sb.NoSuchDeviceException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of devices where warrantyFormId = &#63;.
    *
    * @param warrantyFormId the warranty form ID
    * @return the number of matching devices
    * @throws SystemException if a system exception occurred
    */
    public int countByWarrantyFormId(java.lang.Long warrantyFormId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device where serialNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceException} if it could not be found.
    *
    * @param serialNumber the serial number
    * @return the matching device
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceException if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Device findBySerialNumber(
        java.lang.String serialNumber)
        throws com.dasannetworks.vn.sb.NoSuchDeviceException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device where serialNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param serialNumber the serial number
    * @return the matching device, or <code>null</code> if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Device fetchBySerialNumber(
        java.lang.String serialNumber)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device where serialNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param serialNumber the serial number
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching device, or <code>null</code> if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Device fetchBySerialNumber(
        java.lang.String serialNumber, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the device where serialNumber = &#63; from the database.
    *
    * @param serialNumber the serial number
    * @return the device that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Device removeBySerialNumber(
        java.lang.String serialNumber)
        throws com.dasannetworks.vn.sb.NoSuchDeviceException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of devices where serialNumber = &#63;.
    *
    * @param serialNumber the serial number
    * @return the number of matching devices
    * @throws SystemException if a system exception occurred
    */
    public int countBySerialNumber(java.lang.String serialNumber)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device where gponSerialNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceException} if it could not be found.
    *
    * @param gponSerialNumber the gpon serial number
    * @return the matching device
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceException if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Device findByGponSerialNumber(
        java.lang.String gponSerialNumber)
        throws com.dasannetworks.vn.sb.NoSuchDeviceException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device where gponSerialNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param gponSerialNumber the gpon serial number
    * @return the matching device, or <code>null</code> if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Device fetchByGponSerialNumber(
        java.lang.String gponSerialNumber)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device where gponSerialNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param gponSerialNumber the gpon serial number
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching device, or <code>null</code> if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Device fetchByGponSerialNumber(
        java.lang.String gponSerialNumber, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the device where gponSerialNumber = &#63; from the database.
    *
    * @param gponSerialNumber the gpon serial number
    * @return the device that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Device removeByGponSerialNumber(
        java.lang.String gponSerialNumber)
        throws com.dasannetworks.vn.sb.NoSuchDeviceException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of devices where gponSerialNumber = &#63;.
    *
    * @param gponSerialNumber the gpon serial number
    * @return the number of matching devices
    * @throws SystemException if a system exception occurred
    */
    public int countByGponSerialNumber(java.lang.String gponSerialNumber)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device where customerSerialNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceException} if it could not be found.
    *
    * @param customerSerialNumber the customer serial number
    * @return the matching device
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceException if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Device findByCustomerSerialNumber(
        java.lang.String customerSerialNumber)
        throws com.dasannetworks.vn.sb.NoSuchDeviceException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device where customerSerialNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param customerSerialNumber the customer serial number
    * @return the matching device, or <code>null</code> if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Device fetchByCustomerSerialNumber(
        java.lang.String customerSerialNumber)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device where customerSerialNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param customerSerialNumber the customer serial number
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching device, or <code>null</code> if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Device fetchByCustomerSerialNumber(
        java.lang.String customerSerialNumber, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the device where customerSerialNumber = &#63; from the database.
    *
    * @param customerSerialNumber the customer serial number
    * @return the device that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Device removeByCustomerSerialNumber(
        java.lang.String customerSerialNumber)
        throws com.dasannetworks.vn.sb.NoSuchDeviceException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of devices where customerSerialNumber = &#63;.
    *
    * @param customerSerialNumber the customer serial number
    * @return the number of matching devices
    * @throws SystemException if a system exception occurred
    */
    public int countByCustomerSerialNumber(
        java.lang.String customerSerialNumber)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the devices where status = &#63;.
    *
    * @param status the status
    * @return the matching devices
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.Device> findByStatus(
        int status) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the devices where status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param status the status
    * @param start the lower bound of the range of devices
    * @param end the upper bound of the range of devices (not inclusive)
    * @return the range of matching devices
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.Device> findByStatus(
        int status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the devices where status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param status the status
    * @param start the lower bound of the range of devices
    * @param end the upper bound of the range of devices (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching devices
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.Device> findByStatus(
        int status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first device in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceException if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Device findByStatus_First(int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first device in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device, or <code>null</code> if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Device fetchByStatus_First(
        int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last device in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceException if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Device findByStatus_Last(int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last device in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device, or <code>null</code> if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Device fetchByStatus_Last(int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the devices before and after the current device in the ordered set where status = &#63;.
    *
    * @param deviceId the primary key of the current device
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next device
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceException if a device with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Device[] findByStatus_PrevAndNext(
        long deviceId, int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the devices where status = &#63; from the database.
    *
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public void removeByStatus(int status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of devices where status = &#63;.
    *
    * @param status the status
    * @return the number of matching devices
    * @throws SystemException if a system exception occurred
    */
    public int countByStatus(int status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the device in the entity cache if it is enabled.
    *
    * @param device the device
    */
    public void cacheResult(com.dasannetworks.vn.sb.model.Device device);

    /**
    * Caches the devices in the entity cache if it is enabled.
    *
    * @param devices the devices
    */
    public void cacheResult(
        java.util.List<com.dasannetworks.vn.sb.model.Device> devices);

    /**
    * Creates a new device with the primary key. Does not add the device to the database.
    *
    * @param deviceId the primary key for the new device
    * @return the new device
    */
    public com.dasannetworks.vn.sb.model.Device create(long deviceId);

    /**
    * Removes the device with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param deviceId the primary key of the device
    * @return the device that was removed
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceException if a device with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Device remove(long deviceId)
        throws com.dasannetworks.vn.sb.NoSuchDeviceException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.dasannetworks.vn.sb.model.Device updateImpl(
        com.dasannetworks.vn.sb.model.Device device)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device with the primary key or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceException} if it could not be found.
    *
    * @param deviceId the primary key of the device
    * @return the device
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceException if a device with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Device findByPrimaryKey(long deviceId)
        throws com.dasannetworks.vn.sb.NoSuchDeviceException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param deviceId the primary key of the device
    * @return the device, or <code>null</code> if a device with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Device fetchByPrimaryKey(long deviceId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the devices.
    *
    * @return the devices
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.Device> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the devices.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of devices
    * @param end the upper bound of the range of devices (not inclusive)
    * @return the range of devices
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.Device> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the devices.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of devices
    * @param end the upper bound of the range of devices (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of devices
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.Device> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the devices from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of devices.
    *
    * @return the number of devices
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
