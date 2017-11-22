package com.dasannetworks.vn.sb.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PartnerLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PartnerLocalService
 * @generated
 */
public class PartnerLocalServiceWrapper implements PartnerLocalService,
    ServiceWrapper<PartnerLocalService> {
    private PartnerLocalService _partnerLocalService;

    public PartnerLocalServiceWrapper(PartnerLocalService partnerLocalService) {
        _partnerLocalService = partnerLocalService;
    }

    /**
    * Adds the partner to the database. Also notifies the appropriate model listeners.
    *
    * @param partner the partner
    * @return the partner that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.Partner addPartner(
        com.dasannetworks.vn.sb.model.Partner partner)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _partnerLocalService.addPartner(partner);
    }

    /**
    * Creates a new partner with the primary key. Does not add the partner to the database.
    *
    * @param partnerId the primary key for the new partner
    * @return the new partner
    */
    @Override
    public com.dasannetworks.vn.sb.model.Partner createPartner(long partnerId) {
        return _partnerLocalService.createPartner(partnerId);
    }

    /**
    * Deletes the partner with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param partnerId the primary key of the partner
    * @return the partner that was removed
    * @throws PortalException if a partner with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.Partner deletePartner(long partnerId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _partnerLocalService.deletePartner(partnerId);
    }

    /**
    * Deletes the partner from the database. Also notifies the appropriate model listeners.
    *
    * @param partner the partner
    * @return the partner that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.Partner deletePartner(
        com.dasannetworks.vn.sb.model.Partner partner)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _partnerLocalService.deletePartner(partner);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _partnerLocalService.dynamicQuery();
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
        return _partnerLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.PartnerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _partnerLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.PartnerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _partnerLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _partnerLocalService.dynamicQueryCount(dynamicQuery);
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
        return _partnerLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.dasannetworks.vn.sb.model.Partner fetchPartner(long partnerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _partnerLocalService.fetchPartner(partnerId);
    }

    /**
    * Returns the partner with the primary key.
    *
    * @param partnerId the primary key of the partner
    * @return the partner
    * @throws PortalException if a partner with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.Partner getPartner(long partnerId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _partnerLocalService.getPartner(partnerId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _partnerLocalService.getPersistedModel(primaryKeyObj);
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
    @Override
    public java.util.List<com.dasannetworks.vn.sb.model.Partner> getPartners(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _partnerLocalService.getPartners(start, end);
    }

    /**
    * Returns the number of partners.
    *
    * @return the number of partners
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getPartnersCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _partnerLocalService.getPartnersCount();
    }

    /**
    * Updates the partner in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param partner the partner
    * @return the partner that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.Partner updatePartner(
        com.dasannetworks.vn.sb.model.Partner partner)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _partnerLocalService.updatePartner(partner);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _partnerLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _partnerLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _partnerLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PartnerLocalService getWrappedPartnerLocalService() {
        return _partnerLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPartnerLocalService(
        PartnerLocalService partnerLocalService) {
        _partnerLocalService = partnerLocalService;
    }

    @Override
    public PartnerLocalService getWrappedService() {
        return _partnerLocalService;
    }

    @Override
    public void setWrappedService(PartnerLocalService partnerLocalService) {
        _partnerLocalService = partnerLocalService;
    }
}
