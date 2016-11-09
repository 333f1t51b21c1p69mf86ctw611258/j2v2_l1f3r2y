package com.dasannetworks.vn.sb.model;

import com.dasannetworks.vn.sb.service.persistence.HandOverDevicePK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.dasannetworks.vn.sb.service.http.HandOverDeviceServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.dasannetworks.vn.sb.service.http.HandOverDeviceServiceSoap
 * @generated
 */
public class HandOverDeviceSoap implements Serializable {
    private long _handOverFormId;
    private long _deviceId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _faultNote;
    private String _status;

    public HandOverDeviceSoap() {
    }

    public static HandOverDeviceSoap toSoapModel(HandOverDevice model) {
        HandOverDeviceSoap soapModel = new HandOverDeviceSoap();

        soapModel.setHandOverFormId(model.getHandOverFormId());
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

    public static HandOverDeviceSoap[] toSoapModels(HandOverDevice[] models) {
        HandOverDeviceSoap[] soapModels = new HandOverDeviceSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static HandOverDeviceSoap[][] toSoapModels(HandOverDevice[][] models) {
        HandOverDeviceSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new HandOverDeviceSoap[models.length][models[0].length];
        } else {
            soapModels = new HandOverDeviceSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static HandOverDeviceSoap[] toSoapModels(List<HandOverDevice> models) {
        List<HandOverDeviceSoap> soapModels = new ArrayList<HandOverDeviceSoap>(models.size());

        for (HandOverDevice model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new HandOverDeviceSoap[soapModels.size()]);
    }

    public HandOverDevicePK getPrimaryKey() {
        return new HandOverDevicePK(_handOverFormId, _deviceId);
    }

    public void setPrimaryKey(HandOverDevicePK pk) {
        setHandOverFormId(pk.handOverFormId);
        setDeviceId(pk.deviceId);
    }

    public long getHandOverFormId() {
        return _handOverFormId;
    }

    public void setHandOverFormId(long handOverFormId) {
        _handOverFormId = handOverFormId;
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