package com.dasannetworks.vn.sb.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PurchaseOrderLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PurchaseOrderLocalService
 * @generated
 */
public class PurchaseOrderLocalServiceWrapper
    implements PurchaseOrderLocalService,
        ServiceWrapper<PurchaseOrderLocalService> {
    private PurchaseOrderLocalService _purchaseOrderLocalService;

    public PurchaseOrderLocalServiceWrapper(
        PurchaseOrderLocalService purchaseOrderLocalService) {
        _purchaseOrderLocalService = purchaseOrderLocalService;
    }

    /**
    * Adds the purchase order to the database. Also notifies the appropriate model listeners.
    *
    * @param purchaseOrder the purchase order
    * @return the purchase order that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.PurchaseOrder addPurchaseOrder(
        com.dasannetworks.vn.sb.model.PurchaseOrder purchaseOrder)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _purchaseOrderLocalService.addPurchaseOrder(purchaseOrder);
    }

    /**
    * Creates a new purchase order with the primary key. Does not add the purchase order to the database.
    *
    * @param purchaseOrderId the primary key for the new purchase order
    * @return the new purchase order
    */
    @Override
    public com.dasannetworks.vn.sb.model.PurchaseOrder createPurchaseOrder(
        long purchaseOrderId) {
        return _purchaseOrderLocalService.createPurchaseOrder(purchaseOrderId);
    }

    /**
    * Deletes the purchase order with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param purchaseOrderId the primary key of the purchase order
    * @return the purchase order that was removed
    * @throws PortalException if a purchase order with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.PurchaseOrder deletePurchaseOrder(
        long purchaseOrderId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _purchaseOrderLocalService.deletePurchaseOrder(purchaseOrderId);
    }

    /**
    * Deletes the purchase order from the database. Also notifies the appropriate model listeners.
    *
    * @param purchaseOrder the purchase order
    * @return the purchase order that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.PurchaseOrder deletePurchaseOrder(
        com.dasannetworks.vn.sb.model.PurchaseOrder purchaseOrder)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _purchaseOrderLocalService.deletePurchaseOrder(purchaseOrder);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _purchaseOrderLocalService.dynamicQuery();
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
        return _purchaseOrderLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.PurchaseOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _purchaseOrderLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.PurchaseOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _purchaseOrderLocalService.dynamicQuery(dynamicQuery, start,
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
        return _purchaseOrderLocalService.dynamicQueryCount(dynamicQuery);
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
        return _purchaseOrderLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.dasannetworks.vn.sb.model.PurchaseOrder fetchPurchaseOrder(
        long purchaseOrderId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _purchaseOrderLocalService.fetchPurchaseOrder(purchaseOrderId);
    }

    /**
    * Returns the purchase order with the primary key.
    *
    * @param purchaseOrderId the primary key of the purchase order
    * @return the purchase order
    * @throws PortalException if a purchase order with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.PurchaseOrder getPurchaseOrder(
        long purchaseOrderId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _purchaseOrderLocalService.getPurchaseOrder(purchaseOrderId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _purchaseOrderLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the purchase orders.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.PurchaseOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of purchase orders
    * @param end the upper bound of the range of purchase orders (not inclusive)
    * @return the range of purchase orders
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.dasannetworks.vn.sb.model.PurchaseOrder> getPurchaseOrders(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _purchaseOrderLocalService.getPurchaseOrders(start, end);
    }

    /**
    * Returns the number of purchase orders.
    *
    * @return the number of purchase orders
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getPurchaseOrdersCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _purchaseOrderLocalService.getPurchaseOrdersCount();
    }

    /**
    * Updates the purchase order in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param purchaseOrder the purchase order
    * @return the purchase order that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.vn.sb.model.PurchaseOrder updatePurchaseOrder(
        com.dasannetworks.vn.sb.model.PurchaseOrder purchaseOrder)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _purchaseOrderLocalService.updatePurchaseOrder(purchaseOrder);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _purchaseOrderLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _purchaseOrderLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _purchaseOrderLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public com.dasannetworks.vn.sb.model.PurchaseOrder getByPurchaseOrderNumber(
        java.lang.String purchaseOrderNumber)
        throws com.dasannetworks.vn.sb.NoSuchPurchaseOrderException,
            com.liferay.portal.kernel.exception.SystemException {
        return _purchaseOrderLocalService.getByPurchaseOrderNumber(purchaseOrderNumber);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PurchaseOrderLocalService getWrappedPurchaseOrderLocalService() {
        return _purchaseOrderLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPurchaseOrderLocalService(
        PurchaseOrderLocalService purchaseOrderLocalService) {
        _purchaseOrderLocalService = purchaseOrderLocalService;
    }

    @Override
    public PurchaseOrderLocalService getWrappedService() {
        return _purchaseOrderLocalService;
    }

    @Override
    public void setWrappedService(
        PurchaseOrderLocalService purchaseOrderLocalService) {
        _purchaseOrderLocalService = purchaseOrderLocalService;
    }
}
