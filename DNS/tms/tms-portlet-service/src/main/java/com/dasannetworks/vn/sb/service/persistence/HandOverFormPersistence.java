package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.HandOverForm;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the hand over form service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HandOverFormPersistenceImpl
 * @see HandOverFormUtil
 * @generated
 */
public interface HandOverFormPersistence extends BasePersistence<HandOverForm> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link HandOverFormUtil} to access the hand over form persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns the hand over form where handOverFormNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchHandOverFormException} if it could not be found.
    *
    * @param handOverFormNumber the hand over form number
    * @return the matching hand over form
    * @throws com.dasannetworks.vn.sb.NoSuchHandOverFormException if a matching hand over form could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.HandOverForm findByHandOverFormNumber(
        java.lang.String handOverFormNumber)
        throws com.dasannetworks.vn.sb.NoSuchHandOverFormException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the hand over form where handOverFormNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param handOverFormNumber the hand over form number
    * @return the matching hand over form, or <code>null</code> if a matching hand over form could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.HandOverForm fetchByHandOverFormNumber(
        java.lang.String handOverFormNumber)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the hand over form where handOverFormNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param handOverFormNumber the hand over form number
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching hand over form, or <code>null</code> if a matching hand over form could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.HandOverForm fetchByHandOverFormNumber(
        java.lang.String handOverFormNumber, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the hand over form where handOverFormNumber = &#63; from the database.
    *
    * @param handOverFormNumber the hand over form number
    * @return the hand over form that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.HandOverForm removeByHandOverFormNumber(
        java.lang.String handOverFormNumber)
        throws com.dasannetworks.vn.sb.NoSuchHandOverFormException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of hand over forms where handOverFormNumber = &#63;.
    *
    * @param handOverFormNumber the hand over form number
    * @return the number of matching hand over forms
    * @throws SystemException if a system exception occurred
    */
    public int countByHandOverFormNumber(java.lang.String handOverFormNumber)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the hand over form in the entity cache if it is enabled.
    *
    * @param handOverForm the hand over form
    */
    public void cacheResult(
        com.dasannetworks.vn.sb.model.HandOverForm handOverForm);

    /**
    * Caches the hand over forms in the entity cache if it is enabled.
    *
    * @param handOverForms the hand over forms
    */
    public void cacheResult(
        java.util.List<com.dasannetworks.vn.sb.model.HandOverForm> handOverForms);

    /**
    * Creates a new hand over form with the primary key. Does not add the hand over form to the database.
    *
    * @param handOverFormId the primary key for the new hand over form
    * @return the new hand over form
    */
    public com.dasannetworks.vn.sb.model.HandOverForm create(
        long handOverFormId);

    /**
    * Removes the hand over form with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param handOverFormId the primary key of the hand over form
    * @return the hand over form that was removed
    * @throws com.dasannetworks.vn.sb.NoSuchHandOverFormException if a hand over form with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.HandOverForm remove(
        long handOverFormId)
        throws com.dasannetworks.vn.sb.NoSuchHandOverFormException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.dasannetworks.vn.sb.model.HandOverForm updateImpl(
        com.dasannetworks.vn.sb.model.HandOverForm handOverForm)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the hand over form with the primary key or throws a {@link com.dasannetworks.vn.sb.NoSuchHandOverFormException} if it could not be found.
    *
    * @param handOverFormId the primary key of the hand over form
    * @return the hand over form
    * @throws com.dasannetworks.vn.sb.NoSuchHandOverFormException if a hand over form with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.HandOverForm findByPrimaryKey(
        long handOverFormId)
        throws com.dasannetworks.vn.sb.NoSuchHandOverFormException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the hand over form with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param handOverFormId the primary key of the hand over form
    * @return the hand over form, or <code>null</code> if a hand over form with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.dasannetworks.vn.sb.model.HandOverForm fetchByPrimaryKey(
        long handOverFormId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the hand over forms.
    *
    * @return the hand over forms
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.dasannetworks.vn.sb.model.HandOverForm> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.dasannetworks.vn.sb.model.HandOverForm> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.dasannetworks.vn.sb.model.HandOverForm> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the hand over forms from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of hand over forms.
    *
    * @return the number of hand over forms
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
