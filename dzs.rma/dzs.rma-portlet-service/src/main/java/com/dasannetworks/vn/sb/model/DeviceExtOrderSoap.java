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
public class DeviceExtOrderSoap implements Serializable {
    private long _deviceExtOrderId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _deviceExtOrderNumber;
    private String _note;

    public DeviceExtOrderSoap() {
    }

    public static DeviceExtOrderSoap toSoapModel(DeviceExtOrder model) {
        DeviceExtOrderSoap soapModel = new DeviceExtOrderSoap();

        soapModel.setDeviceExtOrderId(model.getDeviceExtOrderId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setDeviceExtOrderNumber(model.getDeviceExtOrderNumber());
        soapModel.setNote(model.getNote());

        return soapModel;
    }

    public static DeviceExtOrderSoap[] toSoapModels(DeviceExtOrder[] models) {
        DeviceExtOrderSoap[] soapModels = new DeviceExtOrderSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static DeviceExtOrderSoap[][] toSoapModels(DeviceExtOrder[][] models) {
        DeviceExtOrderSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new DeviceExtOrderSoap[models.length][models[0].length];
        } else {
            soapModels = new DeviceExtOrderSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static DeviceExtOrderSoap[] toSoapModels(List<DeviceExtOrder> models) {
        List<DeviceExtOrderSoap> soapModels = new ArrayList<DeviceExtOrderSoap>(models.size());

        for (DeviceExtOrder model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new DeviceExtOrderSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _deviceExtOrderId;
    }

    public void setPrimaryKey(long pk) {
        setDeviceExtOrderId(pk);
    }

    public long getDeviceExtOrderId() {
        return _deviceExtOrderId;
    }

    public void setDeviceExtOrderId(long deviceExtOrderId) {
        _deviceExtOrderId = deviceExtOrderId;
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

    public String getDeviceExtOrderNumber() {
        return _deviceExtOrderNumber;
    }

    public void setDeviceExtOrderNumber(String deviceExtOrderNumber) {
        _deviceExtOrderNumber = deviceExtOrderNumber;
    }

    public String getNote() {
        return _note;
    }

    public void setNote(String note) {
        _note = note;
    }
}
