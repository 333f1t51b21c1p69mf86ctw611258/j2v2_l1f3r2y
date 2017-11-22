package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.RmaReplacement;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the rma replacement service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RmaReplacementPersistenceImpl
 * @see RmaReplacementUtil
 * @generated
 */
public interface RmaReplacementPersistence extends BasePersistence<RmaReplacement> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link RmaReplacementUtil} to access the rma replacement persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the rma replacements where rmaRequestId = &#63;.
    *
    * @param rmaRequestId the rma request ID
    * @return the matching rma replacements
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.RmaReplacement> findByRmaRequestId(
        long rmaRequestId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the rma replacements where rmaRequestId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaReplacementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param rmaRequestId the rma request ID
    * @param start the lower bound of the range of rma replacements
    * @param end the upper bound of the range of rma replacements (not inclusive)
    * @return the range of matching rma replacements
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.RmaReplacement> findByRmaRequestId(
        long rmaRequestId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the rma replacements where rmaRequestId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaReplacementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param rmaRequestId the rma request ID
    * @param start the lower bound of the range of rma replacements
    * @param end the upper bound of the range of rma replacements (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rma replacements
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.RmaReplacement> findByRmaRequestId(
        long rmaRequestId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first rma replacement in the ordered set where rmaRequestId = &#63;.
    *
    * @param rmaRequestId the rma request ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rma replacement
    * @throws com.dasannetworks.vn.sb.NoSuchRmaReplacementException if a matching rma replacement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaReplacement findByRmaRequestId_First(
        long rmaRequestId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchRmaReplacementException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first rma replacement in the ordered set where rmaRequestId = &#63;.
    *
    * @param rmaRequestId the rma request ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rma replacement, or <code>null</code> if a matching rma replacement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaReplacement fetchByRmaRequestId_First(
        long rmaRequestId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last rma replacement in the ordered set where rmaRequestId = &#63;.
    *
    * @param rmaRequestId the rma request ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rma replacement
    * @throws com.dasannetworks.vn.sb.NoSuchRmaReplacementException if a matching rma replacement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaReplacement findByRmaRequestId_Last(
        long rmaRequestId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchRmaReplacementException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last rma replacement in the ordered set where rmaRequestId = &#63;.
    *
    * @param rmaRequestId the rma request ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rma replacement, or <code>null</code> if a matching rma replacement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaReplacement fetchByRmaRequestId_Last(
        long rmaRequestId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the rma replacements before and after the current rma replacement in the ordered set where rmaRequestId = &#63;.
    *
    * @param rmaReplacementPK the primary key of the current rma replacement
    * @param rmaRequestId the rma request ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next rma replacement
    * @throws com.dasannetworks.vn.sb.NoSuchRmaReplacementException if a rma replacement with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaReplacement[] findByRmaRequestId_PrevAndNext(
        com.dasannetworks.vn.sb.service.persistence.RmaReplacementPK rmaReplacementPK,
        long rmaRequestId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchRmaReplacementException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the rma replacements where rmaRequestId = &#63; from the database.
    *
    * @param rmaRequestId the rma request ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByRmaRequestId(long rmaRequestId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rma replacements where rmaRequestId = &#63;.
    *
    * @param rmaRequestId the rma request ID
    * @return the number of matching rma replacements
    * @throws SystemException if a system exception occurred
    */
    public int countByRmaRequestId(long rmaRequestId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the rma replacement where replacedNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchRmaReplacementException} if it could not be found.
    *
    * @param replacedNumber the replaced number
    * @return the matching rma replacement
    * @throws com.dasannetworks.vn.sb.NoSuchRmaReplacementException if a matching rma replacement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaReplacement findByReplacedNumber(
        java.lang.String replacedNumber)
        throws com.dasannetworks.vn.sb.NoSuchRmaReplacementException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the rma replacement where replacedNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param replacedNumber the replaced number
    * @return the matching rma replacement, or <code>null</code> if a matching rma replacement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaReplacement fetchByReplacedNumber(
        java.lang.String replacedNumber)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the rma replacement where replacedNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param replacedNumber the replaced number
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching rma replacement, or <code>null</code> if a matching rma replacement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaReplacement fetchByReplacedNumber(
        java.lang.String replacedNumber, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the rma replacement where replacedNumber = &#63; from the database.
    *
    * @param replacedNumber the replaced number
    * @return the rma replacement that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaReplacement removeByReplacedNumber(
        java.lang.String replacedNumber)
        throws com.dasannetworks.vn.sb.NoSuchRmaReplacementException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rma replacements where replacedNumber = &#63;.
    *
    * @param replacedNumber the replaced number
    * @return the number of matching rma replacements
    * @throws SystemException if a system exception occurred
    */
    public int countByReplacedNumber(java.lang.String replacedNumber)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the rma replacements where status = &#63;.
    *
    * @param status the status
    * @return the matching rma replacements
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.RmaReplacement> findByStatus(
        int status) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the rma replacements where status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaReplacementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param status the status
    * @param start the lower bound of the range of rma replacements
    * @param end the upper bound of the range of rma replacements (not inclusive)
    * @return the range of matching rma replacements
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.RmaReplacement> findByStatus(
        int status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the rma replacements where status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaReplacementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param status the status
    * @param start the lower bound of the range of rma replacements
    * @param end the upper bound of the range of rma replacements (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rma replacements
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.RmaReplacement> findByStatus(
        int status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first rma replacement in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rma replacement
    * @throws com.dasannetworks.vn.sb.NoSuchRmaReplacementException if a matching rma replacement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaReplacement findByStatus_First(
        int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchRmaReplacementException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first rma replacement in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching rma replacement, or <code>null</code> if a matching rma replacement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaReplacement fetchByStatus_First(
        int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last rma replacement in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rma replacement
    * @throws com.dasannetworks.vn.sb.NoSuchRmaReplacementException if a matching rma replacement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaReplacement findByStatus_Last(
        int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchRmaReplacementException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last rma replacement in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching rma replacement, or <code>null</code> if a matching rma replacement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaReplacement fetchByStatus_Last(
        int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the rma replacements before and after the current rma replacement in the ordered set where status = &#63;.
    *
    * @param rmaReplacementPK the primary key of the current rma replacement
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next rma replacement
    * @throws com.dasannetworks.vn.sb.NoSuchRmaReplacementException if a rma replacement with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaReplacement[] findByStatus_PrevAndNext(
        com.dasannetworks.vn.sb.service.persistence.RmaReplacementPK rmaReplacementPK,
        int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchRmaReplacementException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the rma replacements where status = &#63; from the database.
    *
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public void removeByStatus(int status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rma replacements where status = &#63;.
    *
    * @param status the status
    * @return the number of matching rma replacements
    * @throws SystemException if a system exception occurred
    */
    public int countByStatus(int status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the rma replacement in the entity cache if it is enabled.
    *
    * @param rmaReplacement the rma replacement
    */
    public void cacheResult(
        com.dasannetworks.vn.sb.model.RmaReplacement rmaReplacement);

    /**
    * Caches the rma replacements in the entity cache if it is enabled.
    *
    * @param rmaReplacements the rma replacements
    */
    public void cacheResult(
        java.util.List<com.dasannetworks.vn.sb.model.RmaReplacement> rmaReplacements);

    /**
    * Creates a new rma replacement with the primary key. Does not add the rma replacement to the database.
    *
    * @param rmaReplacementPK the primary key for the new rma replacement
    * @return the new rma replacement
    */
    public com.dasannetworks.vn.sb.model.RmaReplacement create(
        com.dasannetworks.vn.sb.service.persistence.RmaReplacementPK rmaReplacementPK);

    /**
    * Removes the rma replacement with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param rmaReplacementPK the primary key of the rma replacement
    * @return the rma replacement that was removed
    * @throws com.dasannetworks.vn.sb.NoSuchRmaReplacementException if a rma replacement with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaReplacement remove(
        com.dasannetworks.vn.sb.service.persistence.RmaReplacementPK rmaReplacementPK)
        throws com.dasannetworks.vn.sb.NoSuchRmaReplacementException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.dasannetworks.vn.sb.model.RmaReplacement updateImpl(
        com.dasannetworks.vn.sb.model.RmaReplacement rmaReplacement)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the rma replacement with the primary key or throws a {@link com.dasannetworks.vn.sb.NoSuchRmaReplacementException} if it could not be found.
    *
    * @param rmaReplacementPK the primary key of the rma replacement
    * @return the rma replacement
    * @throws com.dasannetworks.vn.sb.NoSuchRmaReplacementException if a rma replacement with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaReplacement findByPrimaryKey(
        com.dasannetworks.vn.sb.service.persistence.RmaReplacementPK rmaReplacementPK)
        throws com.dasannetworks.vn.sb.NoSuchRmaReplacementException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the rma replacement with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param rmaReplacementPK the primary key of the rma replacement
    * @return the rma replacement, or <code>null</code> if a rma replacement with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.RmaReplacement fetchByPrimaryKey(
        com.dasannetworks.vn.sb.service.persistence.RmaReplacementPK rmaReplacementPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the rma replacements.
    *
    * @return the rma replacements
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.RmaReplacement> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the rma replacements.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaReplacementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of rma replacements
    * @param end the upper bound of the range of rma replacements (not inclusive)
    * @return the range of rma replacements
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.RmaReplacement> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the rma replacements.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaReplacementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of rma replacements
    * @param end the upper bound of the range of rma replacements (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of rma replacements
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.RmaReplacement> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the rma replacements from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rma replacements.
    *
    * @return the number of rma replacements
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
