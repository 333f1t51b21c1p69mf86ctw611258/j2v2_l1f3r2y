package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.Partner;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the partner service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PartnerPersistenceImpl
 * @see PartnerUtil
 * @generated
 */
public interface PartnerPersistence extends BasePersistence<Partner> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link PartnerUtil} to access the partner persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns the partner where partnerCode = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchPartnerException} if it could not be found.
    *
    * @param partnerCode the partner code
    * @return the matching partner
    * @throws com.dasannetworks.vn.sb.NoSuchPartnerException if a matching partner could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Partner findByPartnerCode(
        java.lang.String partnerCode)
        throws com.dasannetworks.vn.sb.NoSuchPartnerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the partner where partnerCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param partnerCode the partner code
    * @return the matching partner, or <code>null</code> if a matching partner could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Partner fetchByPartnerCode(
        java.lang.String partnerCode)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the partner where partnerCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param partnerCode the partner code
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching partner, or <code>null</code> if a matching partner could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Partner fetchByPartnerCode(
        java.lang.String partnerCode, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the partner where partnerCode = &#63; from the database.
    *
    * @param partnerCode the partner code
    * @return the partner that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Partner removeByPartnerCode(
        java.lang.String partnerCode)
        throws com.dasannetworks.vn.sb.NoSuchPartnerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of partners where partnerCode = &#63;.
    *
    * @param partnerCode the partner code
    * @return the number of matching partners
    * @throws SystemException if a system exception occurred
    */
    public int countByPartnerCode(java.lang.String partnerCode)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the partner in the entity cache if it is enabled.
    *
    * @param partner the partner
    */
    public void cacheResult(com.dasannetworks.vn.sb.model.Partner partner);

    /**
    * Caches the partners in the entity cache if it is enabled.
    *
    * @param partners the partners
    */
    public void cacheResult(
        java.util.List<com.dasannetworks.vn.sb.model.Partner> partners);

    /**
    * Creates a new partner with the primary key. Does not add the partner to the database.
    *
    * @param partnerId the primary key for the new partner
    * @return the new partner
    */
    public com.dasannetworks.vn.sb.model.Partner create(long partnerId);

    /**
    * Removes the partner with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param partnerId the primary key of the partner
    * @return the partner that was removed
    * @throws com.dasannetworks.vn.sb.NoSuchPartnerException if a partner with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Partner remove(long partnerId)
        throws com.dasannetworks.vn.sb.NoSuchPartnerException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.dasannetworks.vn.sb.model.Partner updateImpl(
        com.dasannetworks.vn.sb.model.Partner partner)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the partner with the primary key or throws a {@link com.dasannetworks.vn.sb.NoSuchPartnerException} if it could not be found.
    *
    * @param partnerId the primary key of the partner
    * @return the partner
    * @throws com.dasannetworks.vn.sb.NoSuchPartnerException if a partner with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Partner findByPrimaryKey(
        long partnerId)
        throws com.dasannetworks.vn.sb.NoSuchPartnerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the partner with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param partnerId the primary key of the partner
    * @return the partner, or <code>null</code> if a partner with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.Partner fetchByPrimaryKey(
        long partnerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the partners.
    *
    * @return the partners
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.Partner> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the partners.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.PartnerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of partners
    * @param end the upper bound of the range of partners (not inclusive)
    * @return the range of partners
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.Partner> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the partners.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.PartnerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of partners
    * @param end the upper bound of the range of partners (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of partners
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.Partner> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the partners from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of partners.
    *
    * @return the number of partners
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
