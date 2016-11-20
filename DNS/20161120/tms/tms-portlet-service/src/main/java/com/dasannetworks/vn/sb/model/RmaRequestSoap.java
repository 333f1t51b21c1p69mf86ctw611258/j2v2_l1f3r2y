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
public class RmaRequestSoap implements Serializable {
    private String _uuid;
    private long _rmaRequestId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private long _groupId;
    private String _rmaRequestNumber;
    private String _cusCode;
    private String _cusInCharge;
    private String _cusEmail;
    private String _cusPhone;
    private String _cusLocation;
    private String _provInCharge;
    private Date _creatingEstReturnDate;
    private Date _creatingReturnedDate;
    private Date _creatingAssignedDate;
    private String _creatingNote;
    private String _partnerCode;
    private String _partnerInCharge;
    private String _partnerEmail;
    private String _partnerPhone;
    private String _partnerLocation;
    private Date _sendingEstReturnDate;
    private Date _sendingReturnedDate;
    private Date _sendingAssignedDate;
    private String _sendingNote;
    private Date _receivingReturnedDate;
    private String _receivingNote;
    private Date _returningReturnedDate;
    private String _returningNote;
    private int _status;
    private long _statusByUserId;
    private Date _statusDate;

    public RmaRequestSoap() {
    }

    public static RmaRequestSoap toSoapModel(RmaRequest model) {
        RmaRequestSoap soapModel = new RmaRequestSoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setRmaRequestId(model.getRmaRequestId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setRmaRequestNumber(model.getRmaRequestNumber());
        soapModel.setCusCode(model.getCusCode());
        soapModel.setCusInCharge(model.getCusInCharge());
        soapModel.setCusEmail(model.getCusEmail());
        soapModel.setCusPhone(model.getCusPhone());
        soapModel.setCusLocation(model.getCusLocation());
        soapModel.setProvInCharge(model.getProvInCharge());
        soapModel.setCreatingEstReturnDate(model.getCreatingEstReturnDate());
        soapModel.setCreatingReturnedDate(model.getCreatingReturnedDate());
        soapModel.setCreatingAssignedDate(model.getCreatingAssignedDate());
        soapModel.setCreatingNote(model.getCreatingNote());
        soapModel.setPartnerCode(model.getPartnerCode());
        soapModel.setPartnerInCharge(model.getPartnerInCharge());
        soapModel.setPartnerEmail(model.getPartnerEmail());
        soapModel.setPartnerPhone(model.getPartnerPhone());
        soapModel.setPartnerLocation(model.getPartnerLocation());
        soapModel.setSendingEstReturnDate(model.getSendingEstReturnDate());
        soapModel.setSendingReturnedDate(model.getSendingReturnedDate());
        soapModel.setSendingAssignedDate(model.getSendingAssignedDate());
        soapModel.setSendingNote(model.getSendingNote());
        soapModel.setReceivingReturnedDate(model.getReceivingReturnedDate());
        soapModel.setReceivingNote(model.getReceivingNote());
        soapModel.setReturningReturnedDate(model.getReturningReturnedDate());
        soapModel.setReturningNote(model.getReturningNote());
        soapModel.setStatus(model.getStatus());
        soapModel.setStatusByUserId(model.getStatusByUserId());
        soapModel.setStatusDate(model.getStatusDate());

        return soapModel;
    }

    public static RmaRequestSoap[] toSoapModels(RmaRequest[] models) {
        RmaRequestSoap[] soapModels = new RmaRequestSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static RmaRequestSoap[][] toSoapModels(RmaRequest[][] models) {
        RmaRequestSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new RmaRequestSoap[models.length][models[0].length];
        } else {
            soapModels = new RmaRequestSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static RmaRequestSoap[] toSoapModels(List<RmaRequest> models) {
        List<RmaRequestSoap> soapModels = new ArrayList<RmaRequestSoap>(models.size());

        for (RmaRequest model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new RmaRequestSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _rmaRequestId;
    }

    public void setPrimaryKey(long pk) {
        setRmaRequestId(pk);
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getRmaRequestId() {
        return _rmaRequestId;
    }

    public void setRmaRequestId(long rmaRequestId) {
        _rmaRequestId = rmaRequestId;
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

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public String getRmaRequestNumber() {
        return _rmaRequestNumber;
    }

    public void setRmaRequestNumber(String rmaRequestNumber) {
        _rmaRequestNumber = rmaRequestNumber;
    }

    public String getCusCode() {
        return _cusCode;
    }

    public void setCusCode(String cusCode) {
        _cusCode = cusCode;
    }

    public String getCusInCharge() {
        return _cusInCharge;
    }

    public void setCusInCharge(String cusInCharge) {
        _cusInCharge = cusInCharge;
    }

    public String getCusEmail() {
        return _cusEmail;
    }

    public void setCusEmail(String cusEmail) {
        _cusEmail = cusEmail;
    }

    public String getCusPhone() {
        return _cusPhone;
    }

    public void setCusPhone(String cusPhone) {
        _cusPhone = cusPhone;
    }

    public String getCusLocation() {
        return _cusLocation;
    }

    public void setCusLocation(String cusLocation) {
        _cusLocation = cusLocation;
    }

    public String getProvInCharge() {
        return _provInCharge;
    }

    public void setProvInCharge(String provInCharge) {
        _provInCharge = provInCharge;
    }

    public Date getCreatingEstReturnDate() {
        return _creatingEstReturnDate;
    }

    public void setCreatingEstReturnDate(Date creatingEstReturnDate) {
        _creatingEstReturnDate = creatingEstReturnDate;
    }

    public Date getCreatingReturnedDate() {
        return _creatingReturnedDate;
    }

    public void setCreatingReturnedDate(Date creatingReturnedDate) {
        _creatingReturnedDate = creatingReturnedDate;
    }

    public Date getCreatingAssignedDate() {
        return _creatingAssignedDate;
    }

    public void setCreatingAssignedDate(Date creatingAssignedDate) {
        _creatingAssignedDate = creatingAssignedDate;
    }

    public String getCreatingNote() {
        return _creatingNote;
    }

    public void setCreatingNote(String creatingNote) {
        _creatingNote = creatingNote;
    }

    public String getPartnerCode() {
        return _partnerCode;
    }

    public void setPartnerCode(String partnerCode) {
        _partnerCode = partnerCode;
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

    public String getPartnerLocation() {
        return _partnerLocation;
    }

    public void setPartnerLocation(String partnerLocation) {
        _partnerLocation = partnerLocation;
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
