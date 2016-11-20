package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.HandOverDevice;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the hand over device service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HandOverDevicePersistenceImpl
 * @see HandOverDeviceUtil
 * @generated
 */
public interface HandOverDevicePersistence extends BasePersistence<HandOverDevice> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link HandOverDeviceUtil} to access the hand over device persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the hand over devices where handOverFormId = &#63;.
    *
    * @param handOverFormId the hand over form ID
    * @return the matching hand over devices
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.HandOverDevice> findByHandOverFormId(
        long handOverFormId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.dasannetworks.vn.sb.model.HandOverDevice> findByHandOverFormId(
        long handOverFormId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.dasannetworks.vn.sb.model.HandOverDevice> findByHandOverFormId(
        long handOverFormId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first hand over device in the ordered set where handOverFormId = &#63;.
    *
    * @param handOverFormId the hand over form ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching hand over device
    * @throws com.dasannetworks.vn.sb.NoSuchHandOverDeviceException if a matching hand over device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.HandOverDevice findByHandOverFormId_First(
        long handOverFormId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchHandOverDeviceException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first hand over device in the ordered set where handOverFormId = &#63;.
    *
    * @param handOverFormId the hand over form ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching hand over device, or <code>null</code> if a matching hand over device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.HandOverDevice fetchByHandOverFormId_First(
        long handOverFormId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last hand over device in the ordered set where handOverFormId = &#63;.
    *
    * @param handOverFormId the hand over form ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching hand over device
    * @throws com.dasannetworks.vn.sb.NoSuchHandOverDeviceException if a matching hand over device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.HandOverDevice findByHandOverFormId_Last(
        long handOverFormId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchHandOverDeviceException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last hand over device in the ordered set where handOverFormId = &#63;.
    *
    * @param handOverFormId the hand over form ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching hand over device, or <code>null</code> if a matching hand over device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.HandOverDevice fetchByHandOverFormId_Last(
        long handOverFormId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.dasannetworks.vn.sb.model.HandOverDevice[] findByHandOverFormId_PrevAndNext(
        com.dasannetworks.vn.sb.service.persistence.HandOverDevicePK handOverDevicePK,
        long handOverFormId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchHandOverDeviceException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the hand over devices where handOverFormId = &#63; from the database.
    *
    * @param handOverFormId the hand over form ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByHandOverFormId(long handOverFormId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of hand over devices where handOverFormId = &#63;.
    *
    * @param handOverFormId the hand over form ID
    * @return the number of matching hand over devices
    * @throws SystemException if a system exception occurred
    */
    public int countByHandOverFormId(long handOverFormId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the hand over device where deviceId = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchHandOverDeviceException} if it could not be found.
    *
    * @param deviceId the device ID
    * @return the matching hand over device
    * @throws com.dasannetworks.vn.sb.NoSuchHandOverDeviceException if a matching hand over device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.HandOverDevice findByDeviceId(
        long deviceId)
        throws com.dasannetworks.vn.sb.NoSuchHandOverDeviceException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the hand over device where deviceId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param deviceId the device ID
    * @return the matching hand over device, or <code>null</code> if a matching hand over device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.HandOverDevice fetchByDeviceId(
        long deviceId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the hand over device where deviceId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param deviceId the device ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching hand over device, or <code>null</code> if a matching hand over device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.HandOverDevice fetchByDeviceId(
        long deviceId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the hand over device where deviceId = &#63; from the database.
    *
    * @param deviceId the device ID
    * @return the hand over device that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.HandOverDevice removeByDeviceId(
        long deviceId)
        throws com.dasannetworks.vn.sb.NoSuchHandOverDeviceException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of hand over devices where deviceId = &#63;.
    *
    * @param deviceId the device ID
    * @return the number of matching hand over devices
    * @throws SystemException if a system exception occurred
    */
    public int countByDeviceId(long deviceId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the hand over device in the entity cache if it is enabled.
    *
    * @param handOverDevice the hand over device
    */
    public void cacheResult(
        com.dasannetworks.vn.sb.model.HandOverDevice handOverDevice);

    /**
    * Caches the hand over devices in the entity cache if it is enabled.
    *
    * @param handOverDevices the hand over devices
    */
    public void cacheResult(
        java.util.List<com.dasannetworks.vn.sb.model.HandOverDevice> handOverDevices);

    /**
    * Creates a new hand over device with the primary key. Does not add the hand over device to the database.
    *
    * @param handOverDevicePK the primary key for the new hand over device
    * @return the new hand over device
    */
    public com.dasannetworks.vn.sb.model.HandOverDevice create(
        com.dasannetworks.vn.sb.service.persistence.HandOverDevicePK handOverDevicePK);

    /**
    * Removes the hand over device with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param handOverDevicePK the primary key of the hand over device
    * @return the hand over device that was removed
    * @throws com.dasannetworks.vn.sb.NoSuchHandOverDeviceException if a hand over device with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.HandOverDevice remove(
        com.dasannetworks.vn.sb.service.persistence.HandOverDevicePK handOverDevicePK)
        throws com.dasannetworks.vn.sb.NoSuchHandOverDeviceException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.dasannetworks.vn.sb.model.HandOverDevice updateImpl(
        com.dasannetworks.vn.sb.model.HandOverDevice handOverDevice)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the hand over device with the primary key or throws a {@link com.dasannetworks.vn.sb.NoSuchHandOverDeviceException} if it could not be found.
    *
    * @param handOverDevicePK the primary key of the hand over device
    * @return the hand over device
    * @throws com.dasannetworks.vn.sb.NoSuchHandOverDeviceException if a hand over device with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.HandOverDevice findByPrimaryKey(
        com.dasannetworks.vn.sb.service.persistence.HandOverDevicePK handOverDevicePK)
        throws com.dasannetworks.vn.sb.NoSuchHandOverDeviceException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the hand over device with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param handOverDevicePK the primary key of the hand over device
    * @return the hand over device, or <code>null</code> if a hand over device with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.HandOverDevice fetchByPrimaryKey(
        com.dasannetworks.vn.sb.service.persistence.HandOverDevicePK handOverDevicePK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the hand over devices.
    *
    * @return the hand over devices
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.HandOverDevice> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.dasannetworks.vn.sb.model.HandOverDevice> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.dasannetworks.vn.sb.model.HandOverDevice> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the hand over devices from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of hand over devices.
    *
    * @return the number of hand over devices
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
