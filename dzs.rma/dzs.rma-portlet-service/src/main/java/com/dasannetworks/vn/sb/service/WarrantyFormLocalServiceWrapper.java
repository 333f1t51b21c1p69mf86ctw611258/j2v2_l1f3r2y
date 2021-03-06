package com.dasannetworks.vn.sb.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link WarrantyFormLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see WarrantyFormLocalService
 * @generated
 */
public class WarrantyFormLocalServiceWrapper implements WarrantyFormLocalService,
    ServiceWrapper<WarrantyFormLocalService> {
    private WarrantyFormLocalService _warrantyFormLocalService;

    public WarrantyFormLocalServiceWrapper(
        WarrantyFormLocalService warrantyFormLocalService) {
        _warrantyFormLocalService = warrantyFormLocalService;
    }

    /**
    * Adds the warranty form to the database. Also notifies the appropriate model listeners.
    *
    * @param warrantyForm the warranty form
    * @return the warranty form that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.WarrantyForm addWarrantyForm(
        com.dasannetworks.vn.sb.model.WarrantyForm warrantyForm)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _warrantyFormLocalService.addWarrantyForm(warrantyForm);
    }

    /**
    * Creates a new warranty form with the primary key. Does not add the warranty form to the database.
    *
    * @param warrantyFormId the primary key for the new warranty form
    * @return the new warranty form
    */
    @Override
    public com.dasannetworks.vn.sb.model.WarrantyForm createWarrantyForm(
        long warrantyFormId) {
        return _warrantyFormLocalService.createWarrantyForm(warrantyFormId);
    }

    /**
    * Deletes the warranty form with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param warrantyFormId the primary key of the warranty form
    * @return the warranty form that was removed
    * @throws PortalException if a warranty form with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.WarrantyForm deleteWarrantyForm(
        long warrantyFormId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _warrantyFormLocalService.deleteWarrantyForm(warrantyFormId);
    }

    /**
    * Deletes the warranty form from the database. Also notifies the appropriate model listeners.
    *
    * @param warrantyForm the warranty form
    * @return the warranty form that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.WarrantyForm deleteWarrantyForm(
        com.dasannetworks.vn.sb.model.WarrantyForm warrantyForm)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _warrantyFormLocalService.deleteWarrantyForm(warrantyForm);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _warrantyFormLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _warrantyFormLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.WarrantyFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _warrantyFormLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.WarrantyFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _warrantyFormLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _warrantyFormLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _warrantyFormLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.dasannetworks.vn.sb.model.WarrantyForm fetchWarrantyForm(
        long warrantyFormId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _warrantyFormLocalService.fetchWarrantyForm(warrantyFormId);
    }

    /**
    * Returns the warranty form with the primary key.
    *
    * @param warrantyFormId the primary key of the warranty form
    * @return the warranty form
    * @throws PortalException if a warranty form with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.WarrantyForm getWarrantyForm(
        long warrantyFormId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _warrantyFormLocalService.getWarrantyForm(warrantyFormId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _warrantyFormLocalService.getPersistedModel(primaryKeyObj);
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
    @Override
    public java.util.List<com.dasannetworks.vn.sb.model.WarrantyForm> getWarrantyForms(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _warrantyFormLocalService.getWarrantyForms(start, end);
    }

    /**
    * Returns the number of warranty forms.
    *
    * @return the number of warranty forms
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getWarrantyFormsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _warrantyFormLocalService.getWarrantyFormsCount();
    }

    /**
    * Updates the warranty form in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param warrantyForm the warranty form
    * @return the warranty form that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.WarrantyForm updateWarrantyForm(
        com.dasannetworks.vn.sb.model.WarrantyForm warrantyForm)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _warrantyFormLocalService.updateWarrantyForm(warrantyForm);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _warrantyFormLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _warrantyFormLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _warrantyFormLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public WarrantyFormLocalService getWrappedWarrantyFormLocalService() {
        return _warrantyFormLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedWarrantyFormLocalService(
        WarrantyFormLocalService warrantyFormLocalService) {
        _warrantyFormLocalService = warrantyFormLocalService;
    }

    @Override
    public WarrantyFormLocalService getWrappedService() {
        return _warrantyFormLocalService;
    }

    @Override
    public void setWrappedService(
        WarrantyFormLocalService warrantyFormLocalService) {
        _warrantyFormLocalService = warrantyFormLocalService;
    }
}
