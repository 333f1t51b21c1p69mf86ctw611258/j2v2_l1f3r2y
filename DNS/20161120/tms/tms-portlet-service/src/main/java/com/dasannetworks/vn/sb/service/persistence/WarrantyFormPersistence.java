package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.WarrantyForm;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the warranty form service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WarrantyFormPersistenceImpl
 * @see WarrantyFormUtil
 * @generated
 */
public interface WarrantyFormPersistence extends BasePersistence<WarrantyForm> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link WarrantyFormUtil} to access the warranty form persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the warranty form in the entity cache if it is enabled.
    *
    * @param warrantyForm the warranty form
    */
    public void cacheResult(
        com.dasannetworks.vn.sb.model.WarrantyForm warrantyForm);

    /**
    * Caches the warranty forms in the entity cache if it is enabled.
    *
    * @param warrantyForms the warranty forms
    */
    public void cacheResult(
        java.util.List<com.dasannetworks.vn.sb.model.WarrantyForm> warrantyForms);

    /**
    * Creates a new warranty form with the primary key. Does not add the warranty form to the database.
    *
    * @param warrantyFormId the primary key for the new warranty form
    * @return the new warranty form
    */
    public com.dasannetworks.vn.sb.model.WarrantyForm create(
        long warrantyFormId);

    /**
    * Removes the warranty form with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param warrantyFormId the primary key of the warranty form
    * @return the warranty form that was removed
    * @throws com.dasannetworks.vn.sb.NoSuchWarrantyFormException if a warranty form with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.WarrantyForm remove(
        long warrantyFormId)
        throws com.dasannetworks.vn.sb.NoSuchWarrantyFormException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.dasannetworks.vn.sb.model.WarrantyForm updateImpl(
        com.dasannetworks.vn.sb.model.WarrantyForm warrantyForm)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the warranty form with the primary key or throws a {@link com.dasannetworks.vn.sb.NoSuchWarrantyFormException} if it could not be found.
    *
    * @param warrantyFormId the primary key of the warranty form
    * @return the warranty form
    * @throws com.dasannetworks.vn.sb.NoSuchWarrantyFormException if a warranty form with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.WarrantyForm findByPrimaryKey(
        long warrantyFormId)
        throws com.dasannetworks.vn.sb.NoSuchWarrantyFormException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the warranty form with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param warrantyFormId the primary key of the warranty form
    * @return the warranty form, or <code>null</code> if a warranty form with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.WarrantyForm fetchByPrimaryKey(
        long warrantyFormId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the warranty forms.
    *
    * @return the warranty forms
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.WarrantyForm> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.dasannetworks.vn.sb.model.WarrantyForm> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.dasannetworks.vn.sb.model.WarrantyForm> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the warranty forms from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of warranty forms.
    *
    * @return the number of warranty forms
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
