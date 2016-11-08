package com.dasannetworks.vn.tms.pojo;

import java.util.Date;

import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

public class DevicePOJO {

	private long _deviceId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _modelName;
	private String _serialNumber;
	private String _originalSerialNumber;
	private String _hardwareRevision;
	private String _softwareRevision;
	private String _manufacturerSerial;
	private String _macAddress;
	private String _partNumber;
	private String _specification;
	private Date _factoryOut;
	private Date _warrantyStartDate;
	private Date _warrantyEndDate;
	private long _purchaseOrderId;
	
	private boolean expired = false;	

	public boolean isExpired() {
		return expired;
	}

	public void setExpired(boolean expired) {
		this.expired = expired;
	}

	public DevicePOJO() {
	}

	public long getDeviceId() {
		return _deviceId;
	}

	public void setDeviceId(long deviceId) {
		_deviceId = deviceId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		} else {
			return _userName;
		}
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getModelName() {
		if (_modelName == null) {
			return StringPool.BLANK;
		} else {
			return _modelName;
		}
	}

	public void setModelName(String modelName) {
		_modelName = modelName;
	}

	public String getSerialNumber() {
		if (_serialNumber == null) {
			return StringPool.BLANK;
		} else {
			return _serialNumber;
		}
	}

	public void setSerialNumber(String serialNumber) {
		_serialNumber = serialNumber;
	}

	public String getOriginalSerialNumber() {
		return GetterUtil.getString(_originalSerialNumber);
	}

	public String getHardwareRevision() {
		if (_hardwareRevision == null) {
			return StringPool.BLANK;
		} else {
			return _hardwareRevision;
		}
	}

	public void setHardwareRevision(String hardwareRevision) {
		_hardwareRevision = hardwareRevision;
	}

	public String getSoftwareRevision() {
		if (_softwareRevision == null) {
			return StringPool.BLANK;
		} else {
			return _softwareRevision;
		}
	}

	public void setSoftwareRevision(String softwareRevision) {
		_softwareRevision = softwareRevision;
	}

	public String getManufacturerSerial() {
		if (_manufacturerSerial == null) {
			return StringPool.BLANK;
		} else {
			return _manufacturerSerial;
		}
	}

	public void setManufacturerSerial(String manufacturerSerial) {
		_manufacturerSerial = manufacturerSerial;
	}

	public String getMacAddress() {
		if (_macAddress == null) {
			return StringPool.BLANK;
		} else {
			return _macAddress;
		}
	}

	public void setMacAddress(String macAddress) {
		_macAddress = macAddress;
	}

	public String getPartNumber() {
		if (_partNumber == null) {
			return StringPool.BLANK;
		} else {
			return _partNumber;
		}
	}

	public void setPartNumber(String partNumber) {
		_partNumber = partNumber;
	}

	public String getSpecification() {
		if (_specification == null) {
			return StringPool.BLANK;
		} else {
			return _specification;
		}
	}

	public void setSpecification(String specification) {
		_specification = specification;
	}

	public Date getFactoryOut() {
		return _factoryOut;
	}

	public void setFactoryOut(Date factoryOut) {
		_factoryOut = factoryOut;
	}

	public Date getWarrantyStartDate() {
		return _warrantyStartDate;
	}

	public void setWarrantyStartDate(Date warrantyStartDate) {
		_warrantyStartDate = warrantyStartDate;
	}

	public Date getWarrantyEndDate() {
		return _warrantyEndDate;
	}

	public void setWarrantyEndDate(Date warrantyEndDate) {
		_warrantyEndDate = warrantyEndDate;
	}

	public long getPurchaseOrderId() {
		return _purchaseOrderId;
	}

	public void setPurchaseOrderId(long purchaseOrderId) {
		_purchaseOrderId = purchaseOrderId;
	}

	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{deviceId=");
		sb.append(getDeviceId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", modelName=");
		sb.append(getModelName());
		sb.append(", serialNumber=");
		sb.append(getSerialNumber());
		sb.append(", hardwareRevision=");
		sb.append(getHardwareRevision());
		sb.append(", softwareRevision=");
		sb.append(getSoftwareRevision());
		sb.append(", manufacturerSerial=");
		sb.append(getManufacturerSerial());
		sb.append(", macAddress=");
		sb.append(getMacAddress());
		sb.append(", partNumber=");
		sb.append(getPartNumber());
		sb.append(", specification=");
		sb.append(getSpecification());
		sb.append(", factoryOut=");
		sb.append(getFactoryOut());
		sb.append(", warrantyStartDate=");
		sb.append(getWarrantyStartDate());
		sb.append(", warrantyEndDate=");
		sb.append(getWarrantyEndDate());
		sb.append(", purchaseOrderId=");
		sb.append(getPurchaseOrderId());
		sb.append("}");

		return sb.toString();
	}

}
