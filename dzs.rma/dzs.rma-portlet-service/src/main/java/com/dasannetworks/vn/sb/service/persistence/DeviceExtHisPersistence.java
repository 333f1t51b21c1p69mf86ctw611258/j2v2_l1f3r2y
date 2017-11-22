package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.DeviceExtHis;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the device ext his service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DeviceExtHisPersistenceImpl
 * @see DeviceExtHisUtil
 * @generated
 */
public interface DeviceExtHisPersistence extends BasePersistence<DeviceExtHis> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link DeviceExtHisUtil} to access the device ext his persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the device ext hises where deviceExtOrderId = &#63;.
    *
    * @param deviceExtOrderId the device ext order ID
    * @return the matching device ext hises
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.DeviceExtHis> findByDeviceExtOrderId(
        java.lang.Long deviceExtOrderId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the device ext hises where deviceExtOrderId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceExtHisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param deviceExtOrderId the device ext order ID
    * @param start the lower bound of the range of device ext hises
    * @param end the upper bound of the range of device ext hises (not inclusive)
    * @return the range of matching device ext hises
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.DeviceExtHis> findByDeviceExtOrderId(
        java.lang.Long deviceExtOrderId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the device ext hises where deviceExtOrderId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceExtHisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param deviceExtOrderId the device ext order ID
    * @param start the lower bound of the range of device ext hises
    * @param end the upper bound of the range of device ext hises (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching device ext hises
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.DeviceExtHis> findByDeviceExtOrderId(
        java.lang.Long deviceExtOrderId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first device ext his in the ordered set where deviceExtOrderId = &#63;.
    *
    * @param deviceExtOrderId the device ext order ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device ext his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException if a matching device ext his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceExtHis findByDeviceExtOrderId_First(
        java.lang.Long deviceExtOrderId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first device ext his in the ordered set where deviceExtOrderId = &#63;.
    *
    * @param deviceExtOrderId the device ext order ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device ext his, or <code>null</code> if a matching device ext his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceExtHis fetchByDeviceExtOrderId_First(
        java.lang.Long deviceExtOrderId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last device ext his in the ordered set where deviceExtOrderId = &#63;.
    *
    * @param deviceExtOrderId the device ext order ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device ext his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException if a matching device ext his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceExtHis findByDeviceExtOrderId_Last(
        java.lang.Long deviceExtOrderId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last device ext his in the ordered set where deviceExtOrderId = &#63;.
    *
    * @param deviceExtOrderId the device ext order ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device ext his, or <code>null</code> if a matching device ext his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceExtHis fetchByDeviceExtOrderId_Last(
        java.lang.Long deviceExtOrderId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device ext hises before and after the current device ext his in the ordered set where deviceExtOrderId = &#63;.
    *
    * @param deviceExtId the primary key of the current device ext his
    * @param deviceExtOrderId the device ext order ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next device ext his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException if a device ext his with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceExtHis[] findByDeviceExtOrderId_PrevAndNext(
        long deviceExtId, java.lang.Long deviceExtOrderId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the device ext hises where deviceExtOrderId = &#63; from the database.
    *
    * @param deviceExtOrderId the device ext order ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByDeviceExtOrderId(java.lang.Long deviceExtOrderId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of device ext hises where deviceExtOrderId = &#63;.
    *
    * @param deviceExtOrderId the device ext order ID
    * @return the number of matching device ext hises
    * @throws SystemException if a system exception occurred
    */
    public int countByDeviceExtOrderId(java.lang.Long deviceExtOrderId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the device ext hises where modelName = &#63;.
    *
    * @param modelName the model name
    * @return the matching device ext hises
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.DeviceExtHis> findByModelName(
        java.lang.String modelName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the device ext hises where modelName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceExtHisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param modelName the model name
    * @param start the lower bound of the range of device ext hises
    * @param end the upper bound of the range of device ext hises (not inclusive)
    * @return the range of matching device ext hises
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.DeviceExtHis> findByModelName(
        java.lang.String modelName, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the device ext hises where modelName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceExtHisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param modelName the model name
    * @param start the lower bound of the range of device ext hises
    * @param end the upper bound of the range of device ext hises (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching device ext hises
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.DeviceExtHis> findByModelName(
        java.lang.String modelName, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first device ext his in the ordered set where modelName = &#63;.
    *
    * @param modelName the model name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device ext his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException if a matching device ext his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceExtHis findByModelName_First(
        java.lang.String modelName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first device ext his in the ordered set where modelName = &#63;.
    *
    * @param modelName the model name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device ext his, or <code>null</code> if a matching device ext his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceExtHis fetchByModelName_First(
        java.lang.String modelName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last device ext his in the ordered set where modelName = &#63;.
    *
    * @param modelName the model name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device ext his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException if a matching device ext his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceExtHis findByModelName_Last(
        java.lang.String modelName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last device ext his in the ordered set where modelName = &#63;.
    *
    * @param modelName the model name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device ext his, or <code>null</code> if a matching device ext his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceExtHis fetchByModelName_Last(
        java.lang.String modelName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device ext hises before and after the current device ext his in the ordered set where modelName = &#63;.
    *
    * @param deviceExtId the primary key of the current device ext his
    * @param modelName the model name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next device ext his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException if a device ext his with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceExtHis[] findByModelName_PrevAndNext(
        long deviceExtId, java.lang.String modelName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the device ext hises where modelName = &#63; from the database.
    *
    * @param modelName the model name
    * @throws SystemException if a system exception occurred
    */
    public void removeByModelName(java.lang.String modelName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of device ext hises where modelName = &#63;.
    *
    * @param modelName the model name
    * @return the number of matching device ext hises
    * @throws SystemException if a system exception occurred
    */
    public int countByModelName(java.lang.String modelName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device ext his where serialNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceExtHisException} if it could not be found.
    *
    * @param serialNumber the serial number
    * @return the matching device ext his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException if a matching device ext his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceExtHis findBySerialNumber(
        java.lang.String serialNumber)
        throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device ext his where serialNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param serialNumber the serial number
    * @return the matching device ext his, or <code>null</code> if a matching device ext his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceExtHis fetchBySerialNumber(
        java.lang.String serialNumber)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device ext his where serialNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param serialNumber the serial number
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching device ext his, or <code>null</code> if a matching device ext his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceExtHis fetchBySerialNumber(
        java.lang.String serialNumber, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the device ext his where serialNumber = &#63; from the database.
    *
    * @param serialNumber the serial number
    * @return the device ext his that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceExtHis removeBySerialNumber(
        java.lang.String serialNumber)
        throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of device ext hises where serialNumber = &#63;.
    *
    * @param serialNumber the serial number
    * @return the number of matching device ext hises
    * @throws SystemException if a system exception occurred
    */
    public int countBySerialNumber(java.lang.String serialNumber)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device ext his where gponSerialNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceExtHisException} if it could not be found.
    *
    * @param gponSerialNumber the gpon serial number
    * @return the matching device ext his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException if a matching device ext his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceExtHis findByGponSerialNumber(
        java.lang.String gponSerialNumber)
        throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device ext his where gponSerialNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param gponSerialNumber the gpon serial number
    * @return the matching device ext his, or <code>null</code> if a matching device ext his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceExtHis fetchByGponSerialNumber(
        java.lang.String gponSerialNumber)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device ext his where gponSerialNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param gponSerialNumber the gpon serial number
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching device ext his, or <code>null</code> if a matching device ext his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceExtHis fetchByGponSerialNumber(
        java.lang.String gponSerialNumber, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the device ext his where gponSerialNumber = &#63; from the database.
    *
    * @param gponSerialNumber the gpon serial number
    * @return the device ext his that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceExtHis removeByGponSerialNumber(
        java.lang.String gponSerialNumber)
        throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of device ext hises where gponSerialNumber = &#63;.
    *
    * @param gponSerialNumber the gpon serial number
    * @return the number of matching device ext hises
    * @throws SystemException if a system exception occurred
    */
    public int countByGponSerialNumber(java.lang.String gponSerialNumber)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device ext his where customerSerialNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceExtHisException} if it could not be found.
    *
    * @param customerSerialNumber the customer serial number
    * @return the matching device ext his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException if a matching device ext his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceExtHis findByCustomerSerialNumber(
        java.lang.String customerSerialNumber)
        throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device ext his where customerSerialNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param customerSerialNumber the customer serial number
    * @return the matching device ext his, or <code>null</code> if a matching device ext his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceExtHis fetchByCustomerSerialNumber(
        java.lang.String customerSerialNumber)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device ext his where customerSerialNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param customerSerialNumber the customer serial number
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching device ext his, or <code>null</code> if a matching device ext his could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceExtHis fetchByCustomerSerialNumber(
        java.lang.String customerSerialNumber, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the device ext his where customerSerialNumber = &#63; from the database.
    *
    * @param customerSerialNumber the customer serial number
    * @return the device ext his that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceExtHis removeByCustomerSerialNumber(
        java.lang.String customerSerialNumber)
        throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of device ext hises where customerSerialNumber = &#63;.
    *
    * @param customerSerialNumber the customer serial number
    * @return the number of matching device ext hises
    * @throws SystemException if a system exception occurred
    */
    public int countByCustomerSerialNumber(
        java.lang.String customerSerialNumber)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the device ext his in the entity cache if it is enabled.
    *
    * @param deviceExtHis the device ext his
    */
    public void cacheResult(
        com.dasannetworks.vn.sb.model.DeviceExtHis deviceExtHis);

    /**
    * Caches the device ext hises in the entity cache if it is enabled.
    *
    * @param deviceExtHises the device ext hises
    */
    public void cacheResult(
        java.util.List<com.dasannetworks.vn.sb.model.DeviceExtHis> deviceExtHises);

    /**
    * Creates a new device ext his with the primary key. Does not add the device ext his to the database.
    *
    * @param deviceExtId the primary key for the new device ext his
    * @return the new device ext his
    */
    public com.dasannetworks.vn.sb.model.DeviceExtHis create(long deviceExtId);

    /**
    * Removes the device ext his with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param deviceExtId the primary key of the device ext his
    * @return the device ext his that was removed
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException if a device ext his with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceExtHis remove(long deviceExtId)
        throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.dasannetworks.vn.sb.model.DeviceExtHis updateImpl(
        com.dasannetworks.vn.sb.model.DeviceExtHis deviceExtHis)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device ext his with the primary key or throws a {@link com.dasannetworks.vn.sb.NoSuchDeviceExtHisException} if it could not be found.
    *
    * @param deviceExtId the primary key of the device ext his
    * @return the device ext his
    * @throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException if a device ext his with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceExtHis findByPrimaryKey(
        long deviceExtId)
        throws com.dasannetworks.vn.sb.NoSuchDeviceExtHisException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device ext his with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param deviceExtId the primary key of the device ext his
    * @return the device ext his, or <code>null</code> if a device ext his with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.DeviceExtHis fetchByPrimaryKey(
        long deviceExtId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the device ext hises.
    *
    * @return the device ext hises
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.DeviceExtHis> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the device ext hises.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceExtHisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of device ext hises
    * @param end the upper bound of the range of device ext hises (not inclusive)
    * @return the range of device ext hises
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.DeviceExtHis> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the device ext hises.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.DeviceExtHisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of device ext hises
    * @param end the upper bound of the range of device ext hises (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of device ext hises
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.DeviceExtHis> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the device ext hises from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of device ext hises.
    *
    * @return the number of device ext hises
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
