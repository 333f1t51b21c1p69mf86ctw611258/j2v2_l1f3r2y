package com.dasannetworks.vn.tms.pojo;

import java.io.Serializable;
import java.util.Date;

import com.dasannetworks.vn.sb.model.Device;
import com.dasannetworks.vn.tms.util.DateFormatUtil;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class DeviceVO implements Serializable {

	private Long deviceId;
	private long groupId;
	private long companyId;
	private long userId;
	private String userName;
	private Date createDate;
	private Date modifiedDate;
	private String modelName;
	private String serialNumber;
	private String originalSerialNumber;
	private String hardwareRevision;
	private String softwareRevision;
	private String manufacturerSerial;
	private String macAddress;
	private String partNumber;
	private String specification;
	private Date factoryOut;
	private Long purchaseOrderId;

	private Date warrantyStartDate;
    private Date warrantyEndDate;

	private boolean expired = false;

	public static DeviceVO create(Device device) {
        DeviceVO deviceVO = new DeviceVO();

        return deviceVO;
	}
	private WarrantyFormVO warrantyForm;
	private PurchaseOrderVO purchaseOrder;

	public String getWarrantyStartDateFormatted() {
		return DateFormatUtil.format(this.warrantyStartDate);
	}

	public String getWarrantyEndDateFormatted() {
		return DateFormatUtil.format(this.warrantyEndDate);
	}

	public void update(Device device) {
		if (device.getCreateDate() == null) {
			device.setCreateDate(new Date());
		}else {
			device.setModifiedDate(new Date());
		}

		device.setSerialNumber(this.getSerialNumber());
		device.setMacAddress(this.getMacAddress());
		device.setManufacturerSerial(this.getManufacturerSerial());
		device.setModelName(this.getModelName());
		device.setPartNumber(this.getPartNumber());
		device.setFactoryOut(this.getFactoryOut());
	}
}

