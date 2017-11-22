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
    private long _rmaRequestId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private long _groupId;
    private String _rmaRequestNumber;
    private Long _customerId;
    private String _cusInCharge;
    private String _cusEmail;
    private String _cusPhone;
    private String _cusAddress;
    private Date _creatingEstReturnDate;
    private Date _creatingAssignedDate;
    private String _creatingNote;
    private String _creatingImportedFileName;
    private int _status;

    public RmaRequestSoap() {
    }

    public static RmaRequestSoap toSoapModel(RmaRequest model) {
        RmaRequestSoap soapModel = new RmaRequestSoap();

        soapModel.setRmaRequestId(model.getRmaRequestId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setRmaRequestNumber(model.getRmaRequestNumber());
        soapModel.setCustomerId(model.getCustomerId());
        soapModel.setCusInCharge(model.getCusInCharge());
        soapModel.setCusEmail(model.getCusEmail());
        soapModel.setCusPhone(model.getCusPhone());
        soapModel.setCusAddress(model.getCusAddress());
        soapModel.setCreatingEstReturnDate(model.getCreatingEstReturnDate());
        soapModel.setCreatingAssignedDate(model.getCreatingAssignedDate());
        soapModel.setCreatingNote(model.getCreatingNote());
        soapModel.setCreatingImportedFileName(model.getCreatingImportedFileName());
        soapModel.setStatus(model.getStatus());

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

    public Long getCustomerId() {
        return _customerId;
    }

    public void setCustomerId(Long customerId) {
        _customerId = customerId;
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

    public String getCusAddress() {
        return _cusAddress;
    }

    public void setCusAddress(String cusAddress) {
        _cusAddress = cusAddress;
    }

    public Date getCreatingEstReturnDate() {
        return _creatingEstReturnDate;
    }

    public void setCreatingEstReturnDate(Date creatingEstReturnDate) {
        _creatingEstReturnDate = creatingEstReturnDate;
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

    public String getCreatingImportedFileName() {
        return _creatingImportedFileName;
    }

    public void setCreatingImportedFileName(String creatingImportedFileName) {
        _creatingImportedFileName = creatingImportedFileName;
    }

    public int getStatus() {
        return _status;
    }

    public void setStatus(int status) {
        _status = status;
    }
}
