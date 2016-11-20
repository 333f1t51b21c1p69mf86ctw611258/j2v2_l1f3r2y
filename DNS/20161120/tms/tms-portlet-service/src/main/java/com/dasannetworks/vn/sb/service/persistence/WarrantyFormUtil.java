package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.WarrantyForm;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the warranty form service. This utility wraps {@link WarrantyFormPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WarrantyFormPersistence
 * @see WarrantyFormPersistenceImpl
 * @generated
 */
public class WarrantyFormUtil {
    private static WarrantyFormPersistence _persistence;

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
    public static void clearCache(WarrantyForm warrantyForm) {
        getPersistence().clearCache(warrantyForm);
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
    public static List<WarrantyForm> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<WarrantyForm> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<WarrantyForm> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static WarrantyForm update(WarrantyForm warrantyForm)
        throws SystemException {
        return getPersistence().update(warrantyForm);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static WarrantyForm update(WarrantyForm warrantyForm,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(warrantyForm, serviceContext);
    }

    /**
    * Caches the warranty form in the entity cache if it is enabled.
    *
    * @param warrantyForm the warranty form
    */
    public static void cacheResult(
        com.dasannetworks.vn.sb.model.WarrantyForm warrantyForm) {
        getPersistence().cacheResult(warrantyForm);
    }

    /**
    * Caches the warranty forms in the entity cache if it is enabled.
    *
    * @param warrantyForms the warranty forms
    */
    public static void cacheResult(
        java.util.List<com.dasannetworks.vn.sb.model.WarrantyForm> warrantyForms) {
        getPersistence().cacheResult(warrantyForms);
    }

    /**
    * Creates a new warranty form with the primary key. Does not add the warranty form to the database.
    *
    * @param warrantyFormId the primary key for the new warranty form
    * @return the new warranty form
    */
    public static com.dasannetworks.vn.sb.model.WarrantyForm create(
        long warrantyFormId) {
        return getPersistence().create(warrantyFormId);
    }

    /**
    * Removes the warranty form with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param warrantyFormId the primary key of the warranty form
    * @return the warranty form that was removed
    * @throws com.dasannetworks.vn.sb.NoSuchWarrantyFormException if a warranty form with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.WarrantyForm remove(
        long warrantyFormId)
        throws com.dasannetworks.vn.sb.NoSuchWarrantyFormException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(warrantyFormId);
    }

    public static com.dasannetworks.vn.sb.model.WarrantyForm updateImpl(
        com.dasannetworks.vn.sb.model.WarrantyForm warrantyForm)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(warrantyForm);
    }

    /**
    * Returns the warranty form with the primary key or throws a {@link com.dasannetworks.vn.sb.NoSuchWarrantyFormException} if it could not be found.
    *
    * @param warrantyFormId the primary key of the warranty form
    * @return the warranty form
    * @throws com.dasannetworks.vn.sb.NoSuchWarrantyFormException if a warranty form with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.WarrantyForm findByPrimaryKey(
        long warrantyFormId)
        throws com.dasannetworks.vn.sb.NoSuchWarrantyFormException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(warrantyFormId);
    }

    /**
    * Returns the warranty form with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param warrantyFormId the primary key of the warranty form
    * @return the warranty form, or <code>null</code> if a warranty form with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.WarrantyForm fetchByPrimaryKey(
        long warrantyFormId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(warrantyFormId);
    }

    /**
    * Returns all the warranty forms.
    *
    * @return the warranty forms
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.WarrantyForm> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the warranty forms.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.WarrantyFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of warranty forms
    * @param end the upper bound of the range of warranty forms (not inclusive)
    * @return the range of warranty forms
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.WarrantyForm> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the warranty forms.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.WarrantyFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of warranty forms
    * @param end the upper bound of the range of warranty forms (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of warranty forms
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.WarrantyForm> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the warranty forms from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of warranty forms.
    *
    * @return the number of warranty forms
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static WarrantyFormPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (WarrantyFormPersistence) PortletBeanLocatorUtil.locate(com.dasannetworks.vn.sb.service.ClpSerializer.getServletContextName(),
                    WarrantyFormPersistence.class.getName());

            ReferenceRegistry.registerReference(WarrantyFormUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(WarrantyFormPersistence persistence) {
    }
}
