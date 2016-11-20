package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.HandOverForm;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the hand over form service. This utility wraps {@link HandOverFormPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HandOverFormPersistence
 * @see HandOverFormPersistenceImpl
 * @generated
 */
public class HandOverFormUtil {
    private static HandOverFormPersistence _persistence;

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
    public static void clearCache(HandOverForm handOverForm) {
        getPersistence().clearCache(handOverForm);
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
    public static List<HandOverForm> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<HandOverForm> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<HandOverForm> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static HandOverForm update(HandOverForm handOverForm)
        throws SystemException {
        return getPersistence().update(handOverForm);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static HandOverForm update(HandOverForm handOverForm,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(handOverForm, serviceContext);
    }

    /**
    * Returns the hand over form where handOverFormNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchHandOverFormException} if it could not be found.
    *
    * @param handOverFormNumber the hand over form number
    * @return the matching hand over form
    * @throws com.dasannetworks.vn.sb.NoSuchHandOverFormException if a matching hand over form could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.HandOverForm findByHandOverFormNumber(
        java.lang.String handOverFormNumber)
        throws com.dasannetworks.vn.sb.NoSuchHandOverFormException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByHandOverFormNumber(handOverFormNumber);
    }

    /**
    * Returns the hand over form where handOverFormNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param handOverFormNumber the hand over form number
    * @return the matching hand over form, or <code>null</code> if a matching hand over form could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.HandOverForm fetchByHandOverFormNumber(
        java.lang.String handOverFormNumber)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByHandOverFormNumber(handOverFormNumber);
    }

    /**
    * Returns the hand over form where handOverFormNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param handOverFormNumber the hand over form number
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching hand over form, or <code>null</code> if a matching hand over form could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.HandOverForm fetchByHandOverFormNumber(
        java.lang.String handOverFormNumber, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByHandOverFormNumber(handOverFormNumber,
            retrieveFromCache);
    }

    /**
    * Removes the hand over form where handOverFormNumber = &#63; from the database.
    *
    * @param handOverFormNumber the hand over form number
    * @return the hand over form that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.HandOverForm removeByHandOverFormNumber(
        java.lang.String handOverFormNumber)
        throws com.dasannetworks.vn.sb.NoSuchHandOverFormException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().removeByHandOverFormNumber(handOverFormNumber);
    }

    /**
    * Returns the number of hand over forms where handOverFormNumber = &#63;.
    *
    * @param handOverFormNumber the hand over form number
    * @return the number of matching hand over forms
    * @throws SystemException if a system exception occurred
    */
    public static int countByHandOverFormNumber(
        java.lang.String handOverFormNumber)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByHandOverFormNumber(handOverFormNumber);
    }

    /**
    * Caches the hand over form in the entity cache if it is enabled.
    *
    * @param handOverForm the hand over form
    */
    public static void cacheResult(
        com.dasannetworks.vn.sb.model.HandOverForm handOverForm) {
        getPersistence().cacheResult(handOverForm);
    }

    /**
    * Caches the hand over forms in the entity cache if it is enabled.
    *
    * @param handOverForms the hand over forms
    */
    public static void cacheResult(
        java.util.List<com.dasannetworks.vn.sb.model.HandOverForm> handOverForms) {
        getPersistence().cacheResult(handOverForms);
    }

    /**
    * Creates a new hand over form with the primary key. Does not add the hand over form to the database.
    *
    * @param handOverFormId the primary key for the new hand over form
    * @return the new hand over form
    */
    public static com.dasannetworks.vn.sb.model.HandOverForm create(
        long handOverFormId) {
        return getPersistence().create(handOverFormId);
    }

    /**
    * Removes the hand over form with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param handOverFormId the primary key of the hand over form
    * @return the hand over form that was removed
    * @throws com.dasannetworks.vn.sb.NoSuchHandOverFormException if a hand over form with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.HandOverForm remove(
        long handOverFormId)
        throws com.dasannetworks.vn.sb.NoSuchHandOverFormException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(handOverFormId);
    }

    public static com.dasannetworks.vn.sb.model.HandOverForm updateImpl(
        com.dasannetworks.vn.sb.model.HandOverForm handOverForm)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(handOverForm);
    }

    /**
    * Returns the hand over form with the primary key or throws a {@link com.dasannetworks.vn.sb.NoSuchHandOverFormException} if it could not be found.
    *
    * @param handOverFormId the primary key of the hand over form
    * @return the hand over form
    * @throws com.dasannetworks.vn.sb.NoSuchHandOverFormException if a hand over form with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.HandOverForm findByPrimaryKey(
        long handOverFormId)
        throws com.dasannetworks.vn.sb.NoSuchHandOverFormException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(handOverFormId);
    }

    /**
    * Returns the hand over form with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param handOverFormId the primary key of the hand over form
    * @return the hand over form, or <code>null</code> if a hand over form with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.HandOverForm fetchByPrimaryKey(
        long handOverFormId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(handOverFormId);
    }

    /**
    * Returns all the hand over forms.
    *
    * @return the hand over forms
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.HandOverForm> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the hand over forms.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.HandOverFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of hand over forms
    * @param end the upper bound of the range of hand over forms (not inclusive)
    * @return the range of hand over forms
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.HandOverForm> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the hand over forms.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.HandOverFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of hand over forms
    * @param end the upper bound of the range of hand over forms (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of hand over forms
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.HandOverForm> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the hand over forms from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of hand over forms.
    *
    * @return the number of hand over forms
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static HandOverFormPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (HandOverFormPersistence) PortletBeanLocatorUtil.locate(com.dasannetworks.vn.sb.service.ClpSerializer.getServletContextName(),
                    HandOverFormPersistence.class.getName());

            ReferenceRegistry.registerReference(HandOverFormUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(HandOverFormPersistence persistence) {
    }
}
