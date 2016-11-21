package com.dasannetworks.vn.tms.pojo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class WarrantyFormVO implements Serializable {
    
    private long warrantyFormId;
    private long companyId;
    private long userId;
    private String userName;
    private Date createDate;
    private Date modifiedDate;
    private String customerCode;
    private Date warrantyStartDate;
    private Date warrantyEndDate;
    private String originalDeviceId;
    private String currentDeviceId;
	private String remark;
    
}
