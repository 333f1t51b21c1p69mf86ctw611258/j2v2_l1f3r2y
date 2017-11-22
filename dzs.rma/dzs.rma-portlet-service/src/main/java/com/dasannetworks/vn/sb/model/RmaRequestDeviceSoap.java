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
    private String _originalSerialNumber;
    private Date _faultyDate;
    private String _faultyNote;
    private String _action;
    private Long _partnerId;
    private String _partnerInCharge;
    private String _partnerEmail;
    private String _partnerPhone;
    private String _partnerAddress;
    private Date _sendingEstReturnDate;
    private Date _sendingReturnedDate;
    private Date _sendingAssignedDate;
    private String _sendingNote;
    private Date _receivingReturnedDate;
    private String _receivingNote;
    private Date _returningReturnedDate;
    private String _returningNote;
    private Long _duplicatedRmaRequestId;
    private Date _deniedDate;
    private String _deniedNote;
    private Date _replacedDate;
    private String _replacedNote;
    private String _replacedNumber;
    private Long _replacedOldDeviceId;
    private Long _replacedOldDeviceExtId;
    private Long _replacedNewDeviceId;
    private Long _replacedNewDeviceExtId;
    private int _oldStatus;
    private int _status;
    private long _statusByUserId;
    private Date _statusDate;

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
        soapModel.setOriginalSerialNumber(model.getOriginalSerialNumber());
        soapModel.setFaultyDate(model.getFaultyDate());
        soapModel.setFaultyNote(model.getFaultyNote());
        soapModel.setAction(model.getAction());
        soapModel.setPartnerId(model.getPartnerId());
        soapModel.setPartnerInCharge(model.getPartnerInCharge());
        soapModel.setPartnerEmail(model.getPartnerEmail());
        soapModel.setPartnerPhone(model.getPartnerPhone());
        soapModel.setPartnerAddress(model.getPartnerAddress());
        soapModel.setSendingEstReturnDate(model.getSendingEstReturnDate());
        soapModel.setSendingReturnedDate(model.getSendingReturnedDate());
        soapModel.setSendingAssignedDate(model.getSendingAssignedDate());
        soapModel.setSendingNote(model.getSendingNote());
        soapModel.setReceivingReturnedDate(model.getReceivingReturnedDate());
        soapModel.setReceivingNote(model.getReceivingNote());
        soapModel.setReturningReturnedDate(model.getReturningReturnedDate());
        soapModel.setReturningNote(model.getReturningNote());
        soapModel.setDuplicatedRmaRequestId(model.getDuplicatedRmaRequestId());
        soapModel.setDeniedDate(model.getDeniedDate());
        soapModel.setDeniedNote(model.getDeniedNote());
        soapModel.setReplacedDate(model.getReplacedDate());
        soapModel.setReplacedNote(model.getReplacedNote());
        soapModel.setReplacedNumber(model.getReplacedNumber());
        soapModel.setReplacedOldDeviceId(model.getReplacedOldDeviceId());
        soapModel.setReplacedOldDeviceExtId(model.getReplacedOldDeviceExtId());
        soapModel.setReplacedNewDeviceId(model.getReplacedNewDeviceId());
        soapModel.setReplacedNewDeviceExtId(model.getReplacedNewDeviceExtId());
        soapModel.setOldStatus(model.getOldStatus());
        soapModel.setStatus(model.getStatus());
        soapModel.setStatusByUserId(model.getStatusByUserId());
        soapModel.setStatusDate(model.getStatusDate());

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

    public String getOriginalSerialNumber() {
        return _originalSerialNumber;
    }

    public void setOriginalSerialNumber(String originalSerialNumber) {
        _originalSerialNumber = originalSerialNumber;
    }

    public Date getFaultyDate() {
        return _faultyDate;
    }

    public void setFaultyDate(Date faultyDate) {
        _faultyDate = faultyDate;
    }

    public String getFaultyNote() {
        return _faultyNote;
    }

    public void setFaultyNote(String faultyNote) {
        _faultyNote = faultyNote;
    }

    public String getAction() {
        return _action;
    }

    public void setAction(String action) {
        _action = action;
    }

    public Long getPartnerId() {
        return _partnerId;
    }

    public void setPartnerId(Long partnerId) {
        _partnerId = partnerId;
    }

    public String getPartnerInCharge() {
        return _partnerInCharge;
    }

    public void setPartnerInCharge(String partnerInCharge) {
        _partnerInCharge = partnerInCharge;
    }

    public String getPartnerEmail() {
        return _partnerEmail;
    }

    public void setPartnerEmail(String partnerEmail) {
        _partnerEmail = partnerEmail;
    }

    public String getPartnerPhone() {
        return _partnerPhone;
    }

    public void setPartnerPhone(String partnerPhone) {
        _partnerPhone = partnerPhone;
    }

    public String getPartnerAddress() {
        return _partnerAddress;
    }

    public void setPartnerAddress(String partnerAddress) {
        _partnerAddress = partnerAddress;
    }

    public Date getSendingEstReturnDate() {
        return _sendingEstReturnDate;
    }

    public void setSendingEstReturnDate(Date sendingEstReturnDate) {
        _sendingEstReturnDate = sendingEstReturnDate;
    }

    public Date getSendingReturnedDate() {
        return _sendingReturnedDate;
    }

    public void setSendingReturnedDate(Date sendingReturnedDate) {
        _sendingReturnedDate = sendingReturnedDate;
    }

    public Date getSendingAssignedDate() {
        return _sendingAssignedDate;
    }

    public void setSendingAssignedDate(Date sendingAssignedDate) {
        _sendingAssignedDate = sendingAssignedDate;
    }

    public String getSendingNote() {
        return _sendingNote;
    }

    public void setSendingNote(String sendingNote) {
        _sendingNote = sendingNote;
    }

    public Date getReceivingReturnedDate() {
        return _receivingReturnedDate;
    }

    public void setReceivingReturnedDate(Date receivingReturnedDate) {
        _receivingReturnedDate = receivingReturnedDate;
    }

    public String getReceivingNote() {
        return _receivingNote;
    }

    public void setReceivingNote(String receivingNote) {
        _receivingNote = receivingNote;
    }

    public Date getReturningReturnedDate() {
        return _returningReturnedDate;
    }

    public void setReturningReturnedDate(Date returningReturnedDate) {
        _returningReturnedDate = returningReturnedDate;
    }

    public String getReturningNote() {
        return _returningNote;
    }

    public void setReturningNote(String returningNote) {
        _returningNote = returningNote;
    }

    public Long getDuplicatedRmaRequestId() {
        return _duplicatedRmaRequestId;
    }

    public void setDuplicatedRmaRequestId(Long duplicatedRmaRequestId) {
        _duplicatedRmaRequestId = duplicatedRmaRequestId;
    }

    public Date getDeniedDate() {
        return _deniedDate;
    }

    public void setDeniedDate(Date deniedDate) {
        _deniedDate = deniedDate;
    }

    public String getDeniedNote() {
        return _deniedNote;
    }

    public void setDeniedNote(String deniedNote) {
        _deniedNote = deniedNote;
    }

    public Date getReplacedDate() {
        return _replacedDate;
    }

    public void setReplacedDate(Date replacedDate) {
        _replacedDate = replacedDate;
    }

    public String getReplacedNote() {
        return _replacedNote;
    }

    public void setReplacedNote(String replacedNote) {
        _replacedNote = replacedNote;
    }

    public String getReplacedNumber() {
        return _replacedNumber;
    }

    public void setReplacedNumber(String replacedNumber) {
        _replacedNumber = replacedNumber;
    }

    public Long getReplacedOldDeviceId() {
        return _replacedOldDeviceId;
    }

    public void setReplacedOldDeviceId(Long replacedOldDeviceId) {
        _replacedOldDeviceId = replacedOldDeviceId;
    }

    public Long getReplacedOldDeviceExtId() {
        return _replacedOldDeviceExtId;
    }

    public void setReplacedOldDeviceExtId(Long replacedOldDeviceExtId) {
        _replacedOldDeviceExtId = replacedOldDeviceExtId;
    }

    public Long getReplacedNewDeviceId() {
        return _replacedNewDeviceId;
    }

    public void setReplacedNewDeviceId(Long replacedNewDeviceId) {
        _replacedNewDeviceId = replacedNewDeviceId;
    }

    public Long getReplacedNewDeviceExtId() {
        return _replacedNewDeviceExtId;
    }

    public void setReplacedNewDeviceExtId(Long replacedNewDeviceExtId) {
        _replacedNewDeviceExtId = replacedNewDeviceExtId;
    }

    public int getOldStatus() {
        return _oldStatus;
    }

    public void setOldStatus(int oldStatus) {
        _oldStatus = oldStatus;
    }

    public int getStatus() {
        return _status;
    }

    public void setStatus(int status) {
        _status = status;
    }

    public long getStatusByUserId() {
        return _statusByUserId;
    }

    public void setStatusByUserId(long statusByUserId) {
        _statusByUserId = statusByUserId;
    }

    public Date getStatusDate() {
        return _statusDate;
    }

    public void setStatusDate(Date statusDate) {
        _statusDate = statusDate;
    }
}
