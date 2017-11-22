package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.RmaRequest;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the rma request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RmaRequestPersistenceImpl
 * @see RmaRequestUtil
 * @generated
 */
public interface RmaRequestPersistence extends BasePersistence<RmaRequest> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link RmaRequestUtil} to access the rma request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the rma requests where status = &#63;.
    *
    * @param status the status
    * @return the matching rma requests
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.RmaRequest> findByStatus(
        int status) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the rma requests where status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param status the status
    * @param start the lower bound of the range of rma requests
    * @param end the upper bound of the range of rma requests (not inclusive)
    * @return the range of matching rma requests
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.RmaRequest> findByStatus(
        int status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the rma requests where status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param status the status
    * @param start the lower bound of the range of rma requests
    * @param end the upper bound of the range of rma requests (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rma requests
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.RmaRequest> findByStatus(
        int status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first rma request in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rma request
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a matching rma request could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaRequest findByStatus_First(
        int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first rma request in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rma request, or <code>null</code> if a matching rma request could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaRequest fetchByStatus_First(
        int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last rma request in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rma request
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a matching rma request could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaRequest findByStatus_Last(
        int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last rma request in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rma request, or <code>null</code> if a matching rma request could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaRequest fetchByStatus_Last(
        int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the rma requests before and after the current rma request in the ordered set where status = &#63;.
    *
    * @param rmaRequestId the primary key of the current rma request
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next rma request
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a rma request with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaRequest[] findByStatus_PrevAndNext(
        long rmaRequestId, int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the rma requests where status = &#63; from the database.
    *
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public void removeByStatus(int status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rma requests where status = &#63;.
    *
    * @param status the status
    * @return the number of matching rma requests
    * @throws SystemException if a system exception occurred
    */
    public int countByStatus(int status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the rma request where rmaRequestNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchRmaRequestException} if it could not be found.
    *
    * @param rmaRequestNumber the rma request number
    * @return the matching rma request
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a matching rma request could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaRequest findByRmaRequestNumber(
        java.lang.String rmaRequestNumber)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the rma request where rmaRequestNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param rmaRequestNumber the rma request number
    * @return the matching rma request, or <code>null</code> if a matching rma request could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaRequest fetchByRmaRequestNumber(
        java.lang.String rmaRequestNumber)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the rma request where rmaRequestNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param rmaRequestNumber the rma request number
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching rma request, or <code>null</code> if a matching rma request could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaRequest fetchByRmaRequestNumber(
        java.lang.String rmaRequestNumber, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the rma request where rmaRequestNumber = &#63; from the database.
    *
    * @param rmaRequestNumber the rma request number
    * @return the rma request that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaRequest removeByRmaRequestNumber(
        java.lang.String rmaRequestNumber)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rma requests where rmaRequestNumber = &#63;.
    *
    * @param rmaRequestNumber the rma request number
    * @return the number of matching rma requests
    * @throws SystemException if a system exception occurred
    */
    public int countByRmaRequestNumber(java.lang.String rmaRequestNumber)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the rma requests where customerId = &#63;.
    *
    * @param customerId the customer ID
    * @return the matching rma requests
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.RmaRequest> findByCustomerId(
        java.lang.Long customerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the rma requests where customerId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param customerId the customer ID
    * @param start the lower bound of the range of rma requests
    * @param end the upper bound of the range of rma requests (not inclusive)
    * @return the range of matching rma requests
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.RmaRequest> findByCustomerId(
        java.lang.Long customerId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the rma requests where customerId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param customerId the customer ID
    * @param start the lower bound of the range of rma requests
    * @param end the upper bound of the range of rma requests (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rma requests
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.RmaRequest> findByCustomerId(
        java.lang.Long customerId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first rma request in the ordered set where customerId = &#63;.
    *
    * @param customerId the customer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rma request
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a matching rma request could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaRequest findByCustomerId_First(
        java.lang.Long customerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first rma request in the ordered set where customerId = &#63;.
    *
    * @param customerId the customer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rma request, or <code>null</code> if a matching rma request could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaRequest fetchByCustomerId_First(
        java.lang.Long customerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last rma request in the ordered set where customerId = &#63;.
    *
    * @param customerId the customer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rma request
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a matching rma request could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaRequest findByCustomerId_Last(
        java.lang.Long customerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last rma request in the ordered set where customerId = &#63;.
    *
    * @param customerId the customer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rma request, or <code>null</code> if a matching rma request could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaRequest fetchByCustomerId_Last(
        java.lang.Long customerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the rma requests before and after the current rma request in the ordered set where customerId = &#63;.
    *
    * @param rmaRequestId the primary key of the current rma request
    * @param customerId the customer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next rma request
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a rma request with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaRequest[] findByCustomerId_PrevAndNext(
        long rmaRequestId, java.lang.Long customerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the rma requests where customerId = &#63; from the database.
    *
    * @param customerId the customer ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByCustomerId(java.lang.Long customerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rma requests where customerId = &#63;.
    *
    * @param customerId the customer ID
    * @return the number of matching rma requests
    * @throws SystemException if a system exception occurred
    */
    public int countByCustomerId(java.lang.Long customerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the rma request in the entity cache if it is enabled.
    *
    * @param rmaRequest the rma request
    */
    public void cacheResult(com.dasannetworks.vn.sb.model.RmaRequest rmaRequest);

    /**
    * Caches the rma requests in the entity cache if it is enabled.
    *
    * @param rmaRequests the rma requests
    */
    public void cacheResult(
        java.util.List<com.dasannetworks.vn.sb.model.RmaRequest> rmaRequests);

    /**
    * Creates a new rma request with the primary key. Does not add the rma request to the database.
    *
    * @param rmaRequestId the primary key for the new rma request
    * @return the new rma request
    */
    public com.dasannetworks.vn.sb.model.RmaRequest create(long rmaRequestId);

    /**
    * Removes the rma request with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param rmaRequestId the primary key of the rma request
    * @return the rma request that was removed
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a rma request with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaRequest remove(long rmaRequestId)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.dasannetworks.vn.sb.model.RmaRequest updateImpl(
        com.dasannetworks.vn.sb.model.RmaRequest rmaRequest)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the rma request with the primary key or throws a {@link com.dasannetworks.vn.sb.NoSuchRmaRequestException} if it could not be found.
    *
    * @param rmaRequestId the primary key of the rma request
    * @return the rma request
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a rma request with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaRequest findByPrimaryKey(
        long rmaRequestId)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the rma request with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param rmaRequestId the primary key of the rma request
    * @return the rma request, or <code>null</code> if a rma request with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaRequest fetchByPrimaryKey(
        long rmaRequestId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the rma requests.
    *
    * @return the rma requests
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.RmaRequest> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the rma requests.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of rma requests
    * @param end the upper bound of the range of rma requests (not inclusive)
    * @return the range of rma requests
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.RmaRequest> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the rma requests.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of rma requests
    * @param end the upper bound of the range of rma requests (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of rma requests
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.RmaRequest> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the rma requests from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rma requests.
    *
    * @return the number of rma requests
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
