package com.dasannetworks.vn.tms.service;

import com.dasannetworks.vn.sb.NoSuchPurchaseOrderException;
import com.dasannetworks.vn.sb.model.PurchaseOrder;
import com.dasannetworks.vn.sb.service.PurchaseOrderLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import org.springframework.stereotype.Service;

import java.util.Calendar;

/**
 *
 */
@Service
public class PurchaseOrderService {
    public PurchaseOrder get(long purchaseOrderId) throws SystemException, PortalException {
        return PurchaseOrderLocalServiceUtil.getPurchaseOrder(purchaseOrderId);
    }

    public PurchaseOrder get(String purchaseOrderNumber) throws SystemException, NoSuchPurchaseOrderException {
        return PurchaseOrderLocalServiceUtil.getByPurchaseOrderNumber(purchaseOrderNumber);
    }

    public PurchaseOrder updatePurchaseOrder(PurchaseOrder purchaseOrder) throws SystemException {
        return PurchaseOrderLocalServiceUtil.updatePurchaseOrder(purchaseOrder);
    }

    public PurchaseOrder deletePurchaseOrder(PurchaseOrder purchaseOrder) throws SystemException {
        return PurchaseOrderLocalServiceUtil.deletePurchaseOrder(purchaseOrder);
    }

    public PurchaseOrder createPurchaseOrder() throws SystemException {
        long purchaseOrderId = CounterLocalServiceUtil.increment(PurchaseOrder.class.getName());
        PurchaseOrder purchaseOrder = PurchaseOrderLocalServiceUtil.createPurchaseOrder(purchaseOrderId);
        purchaseOrder.setCreateDate(Calendar.getInstance().getTime());
        return purchaseOrder;
    }
}
