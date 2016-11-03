package com.dasannetworks.vn.tms.pojo;

import lombok.Data;

import java.util.Date;

/**
 *
 */
@Data
public class DeviceVO {
    private Date factoryOut;
    private String modelName;
    private String partNumber;
    private String serialNumber;
    private String macAddress;
    private String cartonBoxSerial;
    private String manufacturerSerial;
    private String purchaseOrderNumber;
    private String customer;
}
