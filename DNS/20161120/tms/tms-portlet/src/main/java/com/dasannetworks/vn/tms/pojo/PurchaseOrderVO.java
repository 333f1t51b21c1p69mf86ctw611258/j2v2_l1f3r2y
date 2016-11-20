package com.dasannetworks.vn.tms.pojo;

import com.dasannetworks.vn.sb.model.PurchaseOrder;
import com.dasannetworks.vn.tms.util.DateFormatUtil;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 */
@Data
public class PurchaseOrderVO implements Serializable {
    private Long purchaseOrderId;
    private String purchaseOrderNumber;
    private String customerCode;
    private Date signDate;
    private Date warrantyStartDate;
    private Date warrantyEndDate;
    private List<DeviceVO> deviceList;

    public static PurchaseOrderVO create(PurchaseOrder purchaseOrder) {
        PurchaseOrderVO value = new PurchaseOrderVO();
        value.setPurchaseOrderNumber(purchaseOrder.getPurchaseOrderNumber());
        value.setWarrantyStartDate(purchaseOrder.getWarrantyStartDate());
        value.setWarrantyEndDate(purchaseOrder.getWarrantyEndDate());
        value.setSignDate(purchaseOrder.getSignDate());
        value.setCustomerCode(purchaseOrder.getCustomerCode());
        value.setPurchaseOrderId(purchaseOrder.getPurchaseOrderId());
        return value;
    }

    public void update(PurchaseOrder purchaseOrder) {
        purchaseOrder.setPurchaseOrderNumber(this.getPurchaseOrderNumber());
        purchaseOrder.setWarrantyStartDate(this.getWarrantyStartDate());
        purchaseOrder.setWarrantyEndDate(this.getWarrantyEndDate());
        purchaseOrder.setSignDate(this.getSignDate());
        purchaseOrder.setCustomerCode(this.getCustomerCode());
    }

    public String getWarrantyStartDateFormatted() {
        return DateFormatUtil.format(this.warrantyStartDate);
    }

    public String getWarrantyEndDateFormatted() {
        return DateFormatUtil.format(this.warrantyEndDate);
    }

    public String getSignDateFormatted() {
        return DateFormatUtil.format(this.signDate);
    }
}
