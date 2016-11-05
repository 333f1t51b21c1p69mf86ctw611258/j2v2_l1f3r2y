package com.dasannetworks.vn.tms.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Required;

import java.util.Date;

/**
 *
 */
@Data
public class PurchaseOrderVO {
    private String purchaseOrder;
    private String customer;
    private Date signDate;
    private Date warrantyStartDate;
    private Date warrantyEndDate;
}
