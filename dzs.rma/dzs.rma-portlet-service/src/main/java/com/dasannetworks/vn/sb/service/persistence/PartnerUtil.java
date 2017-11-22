package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.Partner;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the partner service. This utility wraps {@link PartnerPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PartnerPersistence
 * @see PartnerPersistenceImpl
 * @generated
 */
public class PartnerUtil {
    private static PartnerPersistence _persistence;

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
    public static void clearCache(Partner partner) {
        getPersistence().clearCache(partner);
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
    public static List<Partner> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Partner> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Partner> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Partner update(Partner partner) throws SystemException {
        return getPersistence().update(partner);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Partner update(Partner partner, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(partner, serviceContext);
    }

    /**
    * Returns the partner where partnerCode = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchPartnerException} if it could not be found.
    *
    * @param partnerCode the partner code
    * @return the matching partner
    * @throws com.dasannetworks.vn.sb.NoSuchPartnerException if a matching partner could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.Partner findByPartnerCode(
        java.lang.String partnerCode)
        throws com.dasannetworks.vn.sb.NoSuchPartnerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPartnerCode(partnerCode);
    }

    /**
    * Returns the partner where partnerCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param partnerCode the partner code
    * @return the matching partner, or <code>null</code> if a matching partner could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.Partner fetchByPartnerCode(
        java.lang.String partnerCode)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPartnerCode(partnerCode);
    }

    /**
    * Returns the partner where partnerCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param partnerCode the partner code
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching partner, or <code>null</code> if a matching partner could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.Partner fetchByPartnerCode(
        java.lang.String partnerCode, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByPartnerCode(partnerCode, retrieveFromCache);
    }

    /**
    * Removes the partner where partnerCode = &#63; from the database.
    *
    * @param partnerCode the partner code
    * @return the partner that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.Partner removeByPartnerCode(
        java.lang.String partnerCode)
        throws com.dasannetworks.vn.sb.NoSuchPartnerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().removeByPartnerCode(partnerCode);
    }

    /**
    * Returns the number of partners where partnerCode = &#63;.
    *
    * @param partnerCode the partner code
    * @return the number of matching partners
    * @throws SystemException if a system exception occurred
    */
    public static int countByPartnerCode(java.lang.String partnerCode)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByPartnerCode(partnerCode);
    }

    /**
    * Caches the partner in the entity cache if it is enabled.
    *
    * @param partner the partner
    */
    public static void cacheResult(
        com.dasannetworks.vn.sb.model.Partner partner) {
        getPersistence().cacheResult(partner);
    }

    /**
    * Caches the partners in the entity cache if it is enabled.
    *
    * @param partners the partners
    */
    public static void cacheResult(
        java.util.List<com.dasannetworks.vn.sb.model.Partner> partners) {
        getPersistence().cacheResult(partners);
    }

    /**
    * Creates a new partner with the primary key. Does not add the partner to the database.
    *
    * @param partnerId the primary key for the new partner
    * @return the new partner
    */
    public static com.dasannetworks.vn.sb.model.Partner create(long partnerId) {
        return getPersistence().create(partnerId);
    }

    /**
    * Removes the partner with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param partnerId the primary key of the partner
    * @return the partner that was removed
    * @throws com.dasannetworks.vn.sb.NoSuchPartnerException if a partner with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.Partner remove(long partnerId)
        throws com.dasannetworks.vn.sb.NoSuchPartnerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(partnerId);
    }

    public static com.dasannetworks.vn.sb.model.Partner updateImpl(
        com.dasannetworks.vn.sb.model.Partner partner)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(partner);
    }

    /**
    * Returns the partner with the primary key or throws a {@link com.dasannetworks.vn.sb.NoSuchPartnerException} if it could not be found.
    *
    * @param partnerId the primary key of the partner
    * @return the partner
    * @throws com.dasannetworks.vn.sb.NoSuchPartnerException if a partner with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.Partner findByPrimaryKey(
        long partnerId)
        throws com.dasannetworks.vn.sb.NoSuchPartnerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(partnerId);
    }

    /**
    * Returns the partner with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param partnerId the primary key of the partner
    * @return the partner, or <code>null</code> if a partner with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.Partner fetchByPrimaryKey(
        long partnerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(partnerId);
    }

    /**
    * Returns all the partners.
    *
    * @return the partners
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.Partner> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

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
    public static java.util.List<com.dasannetworks.vn.sb.model.Partner> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<com.dasannetworks.vn.sb.model.Partner> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the partners from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of partners.
    *
    * @return the number of partners
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static PartnerPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (PartnerPersistence) PortletBeanLocatorUtil.locate(com.dasannetworks.vn.sb.service.ClpSerializer.getServletContextName(),
                    PartnerPersistence.class.getName());

            ReferenceRegistry.registerReference(PartnerUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(PartnerPersistence persistence) {
    }
}
