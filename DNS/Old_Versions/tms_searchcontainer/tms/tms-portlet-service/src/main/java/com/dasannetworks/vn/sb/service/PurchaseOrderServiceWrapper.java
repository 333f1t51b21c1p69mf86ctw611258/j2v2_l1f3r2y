package com.dasannetworks.vn.sb.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PurchaseOrderService}.
 *
 * @author Brian Wing Shun Chan
 * @see PurchaseOrderService
 * @generated
 */
public class PurchaseOrderServiceWrapper implements PurchaseOrderService,
    ServiceWrapper<PurchaseOrderService> {
    private PurchaseOrderService _purchaseOrderService;

    public PurchaseOrderServiceWrapper(
        PurchaseOrderService purchaseOrderService) {
        _purchaseOrderService = purchaseOrderService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _purchaseOrderService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _purchaseOrderService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _purchaseOrderService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PurchaseOrderService getWrappedPurchaseOrderService() {
        return _purchaseOrderService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPurchaseOrderService(
        PurchaseOrderService purchaseOrderService) {
        _purchaseOrderService = purchaseOrderService;
    }

    @Override
    public PurchaseOrderService getWrappedService() {
        return _purchaseOrderService;
    }

    @Override
    public void setWrappedService(PurchaseOrderService purchaseOrderService) {
        _purchaseOrderService = purchaseOrderService;
    }
}
