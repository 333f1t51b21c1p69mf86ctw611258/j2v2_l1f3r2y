package com.dasannetworks.vn.tms.service;

import com.dasannetworks.vn.sb.NoSuchPurchaseOrderException;
import com.dasannetworks.vn.sb.model.Device;
import com.dasannetworks.vn.sb.model.PurchaseOrder;
import com.dasannetworks.vn.sb.model.WarrantyForm;
import com.dasannetworks.vn.sb.service.PurchaseOrderLocalServiceUtil;
import com.dasannetworks.vn.tms.pojo.PurchaseOrderVO;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 */
@Service
public class PurchaseOrderService {
    private final DeviceService deviceService;
    private final WarrantyFormService warrantyFormService;

    @Autowired
    public PurchaseOrderService(DeviceService deviceService, WarrantyFormService warrantyFormService) {
        this.deviceService = deviceService;
        this.warrantyFormService = warrantyFormService;
    }

    public PurchaseOrder get(long purchaseOrderId) throws SystemException, PortalException {
        return PurchaseOrderLocalServiceUtil.getPurchaseOrder(purchaseOrderId);
    }

    public PurchaseOrder get(String purchaseOrderNumber) throws SystemException, NoSuchPurchaseOrderException {
        return PurchaseOrderLocalServiceUtil.getByPurchaseOrderNumber(purchaseOrderNumber);
    }

    public PurchaseOrder updatePurchaseOrder(PurchaseOrder purchaseOrder) throws SystemException {
        return PurchaseOrderLocalServiceUtil.updatePurchaseOrder(purchaseOrder);
    }

    public PurchaseOrder deletePurchaseOrder(PurchaseOrder purchaseOrder) throws SystemException, PortalException {
        List<Device> deviceList = deviceService.getByPurchaseOrderNumber(purchaseOrder.getPurchaseOrderId());
        if (deviceList != null) {
	        for (Device device : deviceList) {
	            if (device.getWarrantyFormId() != null) {
	                warrantyFormService.deleteWarrantyForm(device.getWarrantyFormId());
	            }
	            deviceService.deleteDevice(device.getDeviceId());
	        }
        }
        return PurchaseOrderLocalServiceUtil.deletePurchaseOrder(purchaseOrder);
    }

    public PurchaseOrder createPurchaseOrder() throws SystemException {
        long purchaseOrderId = CounterLocalServiceUtil.increment(PurchaseOrder.class.getName());
        PurchaseOrder purchaseOrder = PurchaseOrderLocalServiceUtil.createPurchaseOrder(purchaseOrderId);
        purchaseOrder.setCreateDate(Calendar.getInstance().getTime());
        return purchaseOrder;
    }

    public List<PurchaseOrderVO> getAll() throws SystemException {
        List<PurchaseOrder> purchaseOrders = PurchaseOrderLocalServiceUtil.getPurchaseOrders(0, 999);

        return purchaseOrders.stream().map(PurchaseOrderVO::create).collect(Collectors.toList());
    }
}
