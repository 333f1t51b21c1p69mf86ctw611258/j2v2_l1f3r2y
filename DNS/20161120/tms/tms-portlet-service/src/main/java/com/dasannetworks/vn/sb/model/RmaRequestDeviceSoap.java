package com.dasannetworks.vn.sb.model;

import com.dasannetworks.vn.sb.service.persistence.RmaRequestDevicePK;

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
public class RmaRequestDeviceSoap implements Serializable {
    private long _rmaRequestId;
    private long _deviceId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _faultNote;
    private String _status;

    public RmaRequestDeviceSoap() {
    }

    public static RmaRequestDeviceSoap toSoapModel(RmaRequestDevice model) {
        RmaRequestDeviceSoap soapModel = new RmaRequestDeviceSoap();

        soapModel.setRmaRequestId(model.getRmaRequestId());
        soapModel.setDeviceId(model.getDeviceId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setFaultNote(model.getFaultNote());
        soapModel.setStatus(model.getStatus());

        return soapModel;
    }

    public static RmaRequestDeviceSoap[] toSoapModels(RmaRequestDevice[] models) {
        RmaRequestDeviceSoap[] soapModels = new RmaRequestDeviceSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static RmaRequestDeviceSoap[][] toSoapModels(
        RmaRequestDevice[][] models) {
        RmaRequestDeviceSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new RmaRequestDeviceSoap[models.length][models[0].length];
        } else {
            soapModels = new RmaRequestDeviceSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static RmaRequestDeviceSoap[] toSoapModels(
        List<RmaRequestDevice> models) {
        List<RmaRequestDeviceSoap> soapModels = new ArrayList<RmaRequestDeviceSoap>(models.size());

        for (RmaRequestDevice model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new RmaRequestDeviceSoap[soapModels.size()]);
    }

    public RmaRequestDevicePK getPrimaryKey() {
        return new RmaRequestDevicePK(_rmaRequestId, _deviceId);
    }

    public void setPrimaryKey(RmaRequestDevicePK pk) {
        setRmaRequestId(pk.rmaRequestId);
        setDeviceId(pk.deviceId);
    }

    public long getRmaRequestId() {
        return _rmaRequestId;
    }

    public void setRmaRequestId(long rmaRequestId) {
        _rmaRequestId = rmaRequestId;
    }

    public long getDeviceId() {
        return _deviceId;
    }

    public void setDeviceId(long deviceId) {
        _deviceId = deviceId;
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

    public String getFaultNote() {
        return _faultNote;
    }

    public void setFaultNote(String faultNote) {
        _faultNote = faultNote;
    }

    public String getStatus() {
        return _status;
    }

    public void setStatus(String status) {
        _status = status;
    }
}
