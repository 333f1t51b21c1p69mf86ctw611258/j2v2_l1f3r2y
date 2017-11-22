package com.dasannetworks.vn.sb.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DeviceHisSoap implements Serializable {
    private long _deviceId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _modelName;
    private String _serialNumber;
    private String _gponSerialNumber;
    private String _boxSerialNumber;
    private String _customerSerialNumber;
    private String _manufacturerSerialNumber;
    private String _hardwareRevision;
    private String _softwareRevision;
    private String _macAddress;
    private String _partNumber;
    private String _specification;
    private Date _factoryOut;
    private Long _purchaseOrderId;
    private Long _warrantyFormId;
    private int _status;

    public DeviceHisSoap() {
    }

    public static DeviceHisSoap toSoapModel(DeviceHis model) {
        DeviceHisSoap soapModel = new DeviceHisSoap();

        soapModel.setDeviceId(model.getDeviceId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setModelName(model.getModelName());
        soapModel.setSerialNumber(model.getSerialNumber());
        soapModel.setGponSerialNumber(model.getGponSerialNumber());
        soapModel.setBoxSerialNumber(model.getBoxSerialNumber());
        soapModel.setCustomerSerialNumber(model.getCustomerSerialNumber());
        soapModel.setManufacturerSerialNumber(model.getManufacturerSerialNumber());
        soapModel.setHardwareRevision(model.getHardwareRevision());
        soapModel.setSoftwareRevision(model.getSoftwareRevision());
        soapModel.setMacAddress(model.getMacAddress());
        soapModel.setPartNumber(model.getPartNumber());
        soapModel.setSpecification(model.getSpecification());
        soapModel.setFactoryOut(model.getFactoryOut());
        soapModel.setPurchaseOrderId(model.getPurchaseOrderId());
        soapModel.setWarrantyFormId(model.getWarrantyFormId());
        soapModel.setStatus(model.getStatus());

        return soapModel;
    }

    public static DeviceHisSoap[] toSoapModels(DeviceHis[] models) {
        DeviceHisSoap[] soapModels = new DeviceHisSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static DeviceHisSoap[][] toSoapModels(DeviceHis[][] models) {
        DeviceHisSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new DeviceHisSoap[models.length][models[0].length];
        } else {
            soapModels = new DeviceHisSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static DeviceHisSoap[] toSoapModels(List<DeviceHis> models) {
        List<DeviceHisSoap> soapModels = new ArrayList<DeviceHisSoap>(models.size());

        for (DeviceHis model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new DeviceHisSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _deviceId;
    }

    public void setPrimaryKey(long pk) {
        setDeviceId(pk);
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
        return _userName;
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
        return _modelName;
    }

    public void setModelName(String modelName) {
        _modelName = modelName;
    }

    public String getSerialNumber() {
        return _serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        _serialNumber = serialNumber;
    }

    public String getGponSerialNumber() {
        return _gponSerialNumber;
    }

    public void setGponSerialNumber(String gponSerialNumber) {
        _gponSerialNumber = gponSerialNumber;
    }

    public String getBoxSerialNumber() {
        return _boxSerialNumber;
    }

    public void setBoxSerialNumber(String boxSerialNumber) {
        _boxSerialNumber = boxSerialNumber;
    }

    public String getCustomerSerialNumber() {
        return _customerSerialNumber;
    }

    public void setCustomerSerialNumber(String customerSerialNumber) {
        _customerSerialNumber = customerSerialNumber;
    }

    public String getManufacturerSerialNumber() {
        return _manufacturerSerialNumber;
    }

    public void setManufacturerSerialNumber(String manufacturerSerialNumber) {
        _manufacturerSerialNumber = manufacturerSerialNumber;
    }

    public String getHardwareRevision() {
        return _hardwareRevision;
    }

    public void setHardwareRevision(String hardwareRevision) {
        _hardwareRevision = hardwareRevision;
    }

    public String getSoftwareRevision() {
        return _softwareRevision;
    }

    public void setSoftwareRevision(String softwareRevision) {
        _softwareRevision = softwareRevision;
    }

    public String getMacAddress() {
        return _macAddress;
    }

    public void setMacAddress(String macAddress) {
        _macAddress = macAddress;
    }

    public String getPartNumber() {
        return _partNumber;
    }

    public void setPartNumber(String partNumber) {
        _partNumber = partNumber;
    }

    public String getSpecification() {
        return _specification;
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

    public Long getPurchaseOrderId() {
        return _purchaseOrderId;
    }

    public void setPurchaseOrderId(Long purchaseOrderId) {
        _purchaseOrderId = purchaseOrderId;
    }

    public Long getWarrantyFormId() {
        return _warrantyFormId;
    }

    public void setWarrantyFormId(Long warrantyFormId) {
        _warrantyFormId = warrantyFormId;
    }

    public int getStatus() {
        return _status;
    }

    public void setStatus(int status) {
        _status = status;
    }
}
