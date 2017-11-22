package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.RmaRequest;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the rma request service. This utility wraps {@link RmaRequestPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RmaRequestPersistence
 * @see RmaRequestPersistenceImpl
 * @generated
 */
public class RmaRequestUtil {
    private static RmaRequestPersistence _persistence;

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
    public static void clearCache(RmaRequest rmaRequest) {
        getPersistence().clearCache(rmaRequest);
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
    public static List<RmaRequest> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<RmaRequest> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<RmaRequest> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static RmaRequest update(RmaRequest rmaRequest)
        throws SystemException {
        return getPersistence().update(rmaRequest);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static RmaRequest update(RmaRequest rmaRequest,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(rmaRequest, serviceContext);
    }

    /**
    * Returns all the rma requests where status = &#63;.
    *
    * @param status the status
    * @return the matching rma requests
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.RmaRequest> findByStatus(
        int status) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByStatus(status);
    }

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
    public static java.util.List<com.dasannetworks.vn.sb.model.RmaRequest> findByStatus(
        int status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByStatus(status, start, end);
    }

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
    public static java.util.List<com.dasannetworks.vn.sb.model.RmaRequest> findByStatus(
        int status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByStatus(status, start, end, orderByComparator);
    }

    /**
    * Returns the first rma request in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rma request
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a matching rma request could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequest findByStatus_First(
        int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByStatus_First(status, orderByComparator);
    }

    /**
    * Returns the first rma request in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rma request, or <code>null</code> if a matching rma request could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequest fetchByStatus_First(
        int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByStatus_First(status, orderByComparator);
    }

    /**
    * Returns the last rma request in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rma request
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a matching rma request could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequest findByStatus_Last(
        int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByStatus_Last(status, orderByComparator);
    }

    /**
    * Returns the last rma request in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rma request, or <code>null</code> if a matching rma request could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequest fetchByStatus_Last(
        int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByStatus_Last(status, orderByComparator);
    }

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
    public static com.dasannetworks.vn.sb.model.RmaRequest[] findByStatus_PrevAndNext(
        long rmaRequestId, int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByStatus_PrevAndNext(rmaRequestId, status,
            orderByComparator);
    }

    /**
    * Removes all the rma requests where status = &#63; from the database.
    *
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public static void removeByStatus(int status)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByStatus(status);
    }

    /**
    * Returns the number of rma requests where status = &#63;.
    *
    * @param status the status
    * @return the number of matching rma requests
    * @throws SystemException if a system exception occurred
    */
    public static int countByStatus(int status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByStatus(status);
    }

    /**
    * Returns the rma request where rmaRequestNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchRmaRequestException} if it could not be found.
    *
    * @param rmaRequestNumber the rma request number
    * @return the matching rma request
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a matching rma request could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequest findByRmaRequestNumber(
        java.lang.String rmaRequestNumber)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByRmaRequestNumber(rmaRequestNumber);
    }

    /**
    * Returns the rma request where rmaRequestNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param rmaRequestNumber the rma request number
    * @return the matching rma request, or <code>null</code> if a matching rma request could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequest fetchByRmaRequestNumber(
        java.lang.String rmaRequestNumber)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByRmaRequestNumber(rmaRequestNumber);
    }

    /**
    * Returns the rma request where rmaRequestNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param rmaRequestNumber the rma request number
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching rma request, or <code>null</code> if a matching rma request could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequest fetchByRmaRequestNumber(
        java.lang.String rmaRequestNumber, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByRmaRequestNumber(rmaRequestNumber, retrieveFromCache);
    }

    /**
    * Removes the rma request where rmaRequestNumber = &#63; from the database.
    *
    * @param rmaRequestNumber the rma request number
    * @return the rma request that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequest removeByRmaRequestNumber(
        java.lang.String rmaRequestNumber)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().removeByRmaRequestNumber(rmaRequestNumber);
    }

    /**
    * Returns the number of rma requests where rmaRequestNumber = &#63;.
    *
    * @param rmaRequestNumber the rma request number
    * @return the number of matching rma requests
    * @throws SystemException if a system exception occurred
    */
    public static int countByRmaRequestNumber(java.lang.String rmaRequestNumber)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByRmaRequestNumber(rmaRequestNumber);
    }

    /**
    * Returns all the rma requests where customerId = &#63;.
    *
    * @param customerId the customer ID
    * @return the matching rma requests
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.RmaRequest> findByCustomerId(
        java.lang.Long customerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByCustomerId(customerId);
    }

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
    public static java.util.List<com.dasannetworks.vn.sb.model.RmaRequest> findByCustomerId(
        java.lang.Long customerId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByCustomerId(customerId, start, end);
    }

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
    public static java.util.List<com.dasannetworks.vn.sb.model.RmaRequest> findByCustomerId(
        java.lang.Long customerId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCustomerId(customerId, start, end, orderByComparator);
    }

    /**
    * Returns the first rma request in the ordered set where customerId = &#63;.
    *
    * @param customerId the customer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rma request
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a matching rma request could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequest findByCustomerId_First(
        java.lang.Long customerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCustomerId_First(customerId, orderByComparator);
    }

    /**
    * Returns the first rma request in the ordered set where customerId = &#63;.
    *
    * @param customerId the customer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rma request, or <code>null</code> if a matching rma request could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequest fetchByCustomerId_First(
        java.lang.Long customerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByCustomerId_First(customerId, orderByComparator);
    }

    /**
    * Returns the last rma request in the ordered set where customerId = &#63;.
    *
    * @param customerId the customer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rma request
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a matching rma request could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequest findByCustomerId_Last(
        java.lang.Long customerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCustomerId_Last(customerId, orderByComparator);
    }

    /**
    * Returns the last rma request in the ordered set where customerId = &#63;.
    *
    * @param customerId the customer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rma request, or <code>null</code> if a matching rma request could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequest fetchByCustomerId_Last(
        java.lang.Long customerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByCustomerId_Last(customerId, orderByComparator);
    }

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
    public static com.dasannetworks.vn.sb.model.RmaRequest[] findByCustomerId_PrevAndNext(
        long rmaRequestId, java.lang.Long customerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCustomerId_PrevAndNext(rmaRequestId, customerId,
            orderByComparator);
    }

    /**
    * Removes all the rma requests where customerId = &#63; from the database.
    *
    * @param customerId the customer ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByCustomerId(java.lang.Long customerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByCustomerId(customerId);
    }

    /**
    * Returns the number of rma requests where customerId = &#63;.
    *
    * @param customerId the customer ID
    * @return the number of matching rma requests
    * @throws SystemException if a system exception occurred
    */
    public static int countByCustomerId(java.lang.Long customerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByCustomerId(customerId);
    }

    /**
    * Caches the rma request in the entity cache if it is enabled.
    *
    * @param rmaRequest the rma request
    */
    public static void cacheResult(
        com.dasannetworks.vn.sb.model.RmaRequest rmaRequest) {
        getPersistence().cacheResult(rmaRequest);
    }

    /**
    * Caches the rma requests in the entity cache if it is enabled.
    *
    * @param rmaRequests the rma requests
    */
    public static void cacheResult(
        java.util.List<com.dasannetworks.vn.sb.model.RmaRequest> rmaRequests) {
        getPersistence().cacheResult(rmaRequests);
    }

    /**
    * Creates a new rma request with the primary key. Does not add the rma request to the database.
    *
    * @param rmaRequestId the primary key for the new rma request
    * @return the new rma request
    */
    public static com.dasannetworks.vn.sb.model.RmaRequest create(
        long rmaRequestId) {
        return getPersistence().create(rmaRequestId);
    }

    /**
    * Removes the rma request with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param rmaRequestId the primary key of the rma request
    * @return the rma request that was removed
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a rma request with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequest remove(
        long rmaRequestId)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(rmaRequestId);
    }

    public static com.dasannetworks.vn.sb.model.RmaRequest updateImpl(
        com.dasannetworks.vn.sb.model.RmaRequest rmaRequest)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(rmaRequest);
    }

    /**
    * Returns the rma request with the primary key or throws a {@link com.dasannetworks.vn.sb.NoSuchRmaRequestException} if it could not be found.
    *
    * @param rmaRequestId the primary key of the rma request
    * @return the rma request
    * @throws com.dasannetworks.vn.sb.NoSuchRmaRequestException if a rma request with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequest findByPrimaryKey(
        long rmaRequestId)
        throws com.dasannetworks.vn.sb.NoSuchRmaRequestException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(rmaRequestId);
    }

    /**
    * Returns the rma request with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param rmaRequestId the primary key of the rma request
    * @return the rma request, or <code>null</code> if a rma request with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.RmaRequest fetchByPrimaryKey(
        long rmaRequestId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(rmaRequestId);
    }

    /**
    * Returns all the rma requests.
    *
    * @return the rma requests
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.RmaRequest> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

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
    public static java.util.List<com.dasannetworks.vn.sb.model.RmaRequest> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<com.dasannetworks.vn.sb.model.RmaRequest> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the rma requests from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of rma requests.
    *
    * @return the number of rma requests
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static RmaRequestPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (RmaRequestPersistence) PortletBeanLocatorUtil.locate(com.dasannetworks.vn.sb.service.ClpSerializer.getServletContextName(),
                    RmaRequestPersistence.class.getName());

            ReferenceRegistry.registerReference(RmaRequestUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(RmaRequestPersistence persistence) {
    }
}
