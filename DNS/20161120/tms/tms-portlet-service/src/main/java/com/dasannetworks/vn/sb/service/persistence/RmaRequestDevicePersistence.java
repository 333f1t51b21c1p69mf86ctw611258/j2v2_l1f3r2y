package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.RmaRequestDevice;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the rma request device service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RmaRequestDevicePersistenceImpl
 * @see RmaRequestDeviceUtil
 * @generated
 */
public interface RmaRequestDevicePersistence extends BasePersistence<RmaRequestDevice> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link RmaRequestDeviceUtil} to access the rma request device persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the rma request devices where rmaRequestId = &#63;.
    *
    * @param rmaRequestId the rma request ID
    * @return the matching rma request devices
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.RmaRequestDevice> findByRmaRequestId(
        long rmaRequestId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.dasannetworks.vn.sb.model.RmaRequestDevice> findByRmaRequestId(
        long rmaRequestId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.dasannetworks.vn.sb.model.RmaRequestDevice> findByRmaRequestId(
        long rmaRequestId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first rma request device in the ordered set where rmaRequestId = &#63;.
    *
    * @param rmaRequestId the rma request ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rma request device
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaRequestDevice findByRmaRequestId_First(
        long rmaRequestId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first rma request device in the ordered set where rmaRequestId = &#63;.
    *
    * @param rmaRequestId the rma request ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rma request device, or <code>null</code> if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaRequestDevice fetchByRmaRequestId_First(
        long rmaRequestId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last rma request device in the ordered set where rmaRequestId = &#63;.
    *
    * @param rmaRequestId the rma request ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rma request device
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaRequestDevice findByRmaRequestId_Last(
        long rmaRequestId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last rma request device in the ordered set where rmaRequestId = &#63;.
    *
    * @param rmaRequestId the rma request ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rma request device, or <code>null</code> if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaRequestDevice fetchByRmaRequestId_Last(
        long rmaRequestId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.dasannetworks.vn.sb.model.RmaRequestDevice[] findByRmaRequestId_PrevAndNext(
        com.dasannetworks.vn.sb.service.persistence.RmaRequestDevicePK rmaRequestDevicePK,
        long rmaRequestId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the rma request devices where rmaRequestId = &#63; from the database.
    *
    * @param rmaRequestId the rma request ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByRmaRequestId(long rmaRequestId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rma request devices where rmaRequestId = &#63;.
    *
    * @param rmaRequestId the rma request ID
    * @return the number of matching rma request devices
    * @throws SystemException if a system exception occurred
    */
    public int countByRmaRequestId(long rmaRequestId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the rma request device where deviceId = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException} if it could not be found.
    *
    * @param deviceId the device ID
    * @return the matching rma request device
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaRequestDevice findByDeviceId(
        long deviceId)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the rma request device where deviceId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param deviceId the device ID
    * @return the matching rma request device, or <code>null</code> if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaRequestDevice fetchByDeviceId(
        long deviceId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the rma request device where deviceId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param deviceId the device ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching rma request device, or <code>null</code> if a matching rma request device could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaRequestDevice fetchByDeviceId(
        long deviceId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the rma request device where deviceId = &#63; from the database.
    *
    * @param deviceId the device ID
    * @return the rma request device that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaRequestDevice removeByDeviceId(
        long deviceId)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rma request devices where deviceId = &#63;.
    *
    * @param deviceId the device ID
    * @return the number of matching rma request devices
    * @throws SystemException if a system exception occurred
    */
    public int countByDeviceId(long deviceId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the rma request device in the entity cache if it is enabled.
    *
    * @param rmaRequestDevice the rma request device
    */
    public void cacheResult(
        com.dasannetworks.vn.sb.model.RmaRequestDevice rmaRequestDevice);

    /**
    * Caches the rma request devices in the entity cache if it is enabled.
    *
    * @param rmaRequestDevices the rma request devices
    */
    public void cacheResult(
        java.util.List<com.dasannetworks.vn.sb.model.RmaRequestDevice> rmaRequestDevices);

    /**
    * Creates a new rma request device with the primary key. Does not add the rma request device to the database.
    *
    * @param rmaRequestDevicePK the primary key for the new rma request device
    * @return the new rma request device
    */
    public com.dasannetworks.vn.sb.model.RmaRequestDevice create(
        com.dasannetworks.vn.sb.service.persistence.RmaRequestDevicePK rmaRequestDevicePK);

    /**
    * Removes the rma request device with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param rmaRequestDevicePK the primary key of the rma request device
    * @return the rma request device that was removed
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a rma request device with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaRequestDevice remove(
        com.dasannetworks.vn.sb.service.persistence.RmaRequestDevicePK rmaRequestDevicePK)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.dasannetworks.vn.sb.model.RmaRequestDevice updateImpl(
        com.dasannetworks.vn.sb.model.RmaRequestDevice rmaRequestDevice)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the rma request device with the primary key or throws a {@link com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException} if it could not be found.
    *
    * @param rmaRequestDevicePK the primary key of the rma request device
    * @return the rma request device
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException if a rma request device with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaRequestDevice findByPrimaryKey(
        com.dasannetworks.vn.sb.service.persistence.RmaRequestDevicePK rmaRequestDevicePK)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestDeviceException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the rma request device with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param rmaRequestDevicePK the primary key of the rma request device
    * @return the rma request device, or <code>null</code> if a rma request device with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaRequestDevice fetchByPrimaryKey(
        com.dasannetworks.vn.sb.service.persistence.RmaRequestDevicePK rmaRequestDevicePK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the rma request devices.
    *
    * @return the rma request devices
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.RmaRequestDevice> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.dasannetworks.vn.sb.model.RmaRequestDevice> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.dasannetworks.vn.sb.model.RmaRequestDevice> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the rma request devices from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rma request devices.
    *
    * @return the number of rma request devices
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
