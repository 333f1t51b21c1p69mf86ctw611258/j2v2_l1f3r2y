package com.dasannetworks.vn.sb.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RmaReplacementLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see RmaReplacementLocalService
 * @generated
 */
public class RmaReplacementLocalServiceWrapper
    implements RmaReplacementLocalService,
        ServiceWrapper<RmaReplacementLocalService> {
    private RmaReplacementLocalService _rmaReplacementLocalService;

    public RmaReplacementLocalServiceWrapper(
        RmaReplacementLocalService rmaReplacementLocalService) {
        _rmaReplacementLocalService = rmaReplacementLocalService;
    }

    /**
    * Adds the rma replacement to the database. Also notifies the appropriate model listeners.
    *
    * @param rmaReplacement the rma replacement
    * @return the rma replacement that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.RmaReplacement addRmaReplacement(
        com.dasannetworks.vn.sb.model.RmaReplacement rmaReplacement)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rmaReplacementLocalService.addRmaReplacement(rmaReplacement);
    }

    /**
    * Creates a new rma replacement with the primary key. Does not add the rma replacement to the database.
    *
    * @param rmaReplacementPK the primary key for the new rma replacement
    * @return the new rma replacement
    */
    @Override
    public com.dasannetworks.vn.sb.model.RmaReplacement createRmaReplacement(
        com.dasannetworks.vn.sb.service.persistence.RmaReplacementPK rmaReplacementPK) {
        return _rmaReplacementLocalService.createRmaReplacement(rmaReplacementPK);
    }

    /**
    * Deletes the rma replacement with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param rmaReplacementPK the primary key of the rma replacement
    * @return the rma replacement that was removed
    * @throws PortalException if a rma replacement with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.RmaReplacement deleteRmaReplacement(
        com.dasannetworks.vn.sb.service.persistence.RmaReplacementPK rmaReplacementPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _rmaReplacementLocalService.deleteRmaReplacement(rmaReplacementPK);
    }

    /**
    * Deletes the rma replacement from the database. Also notifies the appropriate model listeners.
    *
    * @param rmaReplacement the rma replacement
    * @return the rma replacement that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.RmaReplacement deleteRmaReplacement(
        com.dasannetworks.vn.sb.model.RmaReplacement rmaReplacement)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rmaReplacementLocalService.deleteRmaReplacement(rmaReplacement);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _rmaReplacementLocalService.dynamicQuery();
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
        return _rmaReplacementLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaReplacementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _rmaReplacementLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.RmaReplacementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _rmaReplacementLocalService.dynamicQuery(dynamicQuery, start,
            end, orderByComparator);
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
        return _rmaReplacementLocalService.dynamicQueryCount(dynamicQuery);
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
        return _rmaReplacementLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.dasannetworks.vn.sb.model.RmaReplacement fetchRmaReplacement(
        com.dasannetworks.vn.sb.service.persistence.RmaReplacementPK rmaReplacementPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rmaReplacementLocalService.fetchRmaReplacement(rmaReplacementPK);
    }

    /**
    * Returns the rma replacement with the primary key.
    *
    * @param rmaReplacementPK the primary key of the rma replacement
    * @return the rma replacement
    * @throws PortalException if a rma replacement with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.RmaReplacement getRmaReplacement(
        com.dasannetworks.vn.sb.service.persistence.RmaReplacementPK rmaReplacementPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _rmaReplacementLocalService.getRmaReplacement(rmaReplacementPK);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _rmaReplacementLocalService.getPersistedModel(primaryKeyObj);
    }

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
    @Override
    public java.util.List<com.dasannetworks.vn.sb.model.RmaReplacement> getRmaReplacements(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rmaReplacementLocalService.getRmaReplacements(start, end);
    }

    /**
    * Returns the number of rma replacements.
    *
    * @return the number of rma replacements
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getRmaReplacementsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rmaReplacementLocalService.getRmaReplacementsCount();
    }

    /**
    * Updates the rma replacement in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param rmaReplacement the rma replacement
    * @return the rma replacement that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.RmaReplacement updateRmaReplacement(
        com.dasannetworks.vn.sb.model.RmaReplacement rmaReplacement)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rmaReplacementLocalService.updateRmaReplacement(rmaReplacement);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _rmaReplacementLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _rmaReplacementLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _rmaReplacementLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public RmaReplacementLocalService getWrappedRmaReplacementLocalService() {
        return _rmaReplacementLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedRmaReplacementLocalService(
        RmaReplacementLocalService rmaReplacementLocalService) {
        _rmaReplacementLocalService = rmaReplacementLocalService;
    }

    @Override
    public RmaReplacementLocalService getWrappedService() {
        return _rmaReplacementLocalService;
    }

    @Override
    public void setWrappedService(
        RmaReplacementLocalService rmaReplacementLocalService) {
        _rmaReplacementLocalService = rmaReplacementLocalService;
    }
}
