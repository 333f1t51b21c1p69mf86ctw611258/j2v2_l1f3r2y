package com.dasannetworks.vn.sb.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.dasannetworks.vn.sb.service.http.HandOverFormServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.dasannetworks.vn.sb.service.http.HandOverFormServiceSoap
 * @generated
 */
public class HandOverFormSoap implements Serializable {
    private long _handOverFormId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _customerCode;
    private String _contactPoint;
    private String _email;
    private String _phone;
    private String _location;
    private String _personInCharge;
    private String _handOverFormNumber;
    private String _note;
    private Date _assignDate;
    private Date _estimatedReturnDate;

    public HandOverFormSoap() {
    }

    public static HandOverFormSoap toSoapModel(HandOverForm model) {
        HandOverFormSoap soapModel = new HandOverFormSoap();

        soapModel.setHandOverFormId(model.getHandOverFormId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setCustomerCode(model.getCustomerCode());
        soapModel.setContactPoint(model.getContactPoint());
        soapModel.setEmail(model.getEmail());
        soapModel.setPhone(model.getPhone());
        soapModel.setLocation(model.getLocation());
        soapModel.setPersonInCharge(model.getPersonInCharge());
        soapModel.setHandOverFormNumber(model.getHandOverFormNumber());
        soapModel.setNote(model.getNote());
        soapModel.setAssignDate(model.getAssignDate());
        soapModel.setEstimatedReturnDate(model.getEstimatedReturnDate());

        return soapModel;
    }

    public static HandOverFormSoap[] toSoapModels(HandOverForm[] models) {
        HandOverFormSoap[] soapModels = new HandOverFormSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static HandOverFormSoap[][] toSoapModels(HandOverForm[][] models) {
        HandOverFormSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new HandOverFormSoap[models.length][models[0].length];
        } else {
            soapModels = new HandOverFormSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static HandOverFormSoap[] toSoapModels(List<HandOverForm> models) {
        List<HandOverFormSoap> soapModels = new ArrayList<HandOverFormSoap>(models.size());

        for (HandOverForm model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new HandOverFormSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _handOverFormId;
    }

    public void setPrimaryKey(long pk) {
        setHandOverFormId(pk);
    }

    public long getHandOverFormId() {
        return _handOverFormId;
    }

    public void setHandOverFormId(long handOverFormId) {
        _handOverFormId = handOverFormId;
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

    public String getCustomerCode() {
        return _customerCode;
    }

    public void setCustomerCode(String customerCode) {
        _customerCode = customerCode;
    }

    public String getContactPoint() {
        return _contactPoint;
    }

    public void setContactPoint(String contactPoint) {
        _contactPoint = contactPoint;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String email) {
        _email = email;
    }

    public String getPhone() {
        return _phone;
    }

    public void setPhone(String phone) {
        _phone = phone;
    }

    public String getLocation() {
        return _location;
    }

    public void setLocation(String location) {
        _location = location;
    }

    public String getPersonInCharge() {
        return _personInCharge;
    }

    public void setPersonInCharge(String personInCharge) {
        _personInCharge = personInCharge;
    }

    public String getHandOverFormNumber() {
        return _handOverFormNumber;
    }

    public void setHandOverFormNumber(String handOverFormNumber) {
        _handOverFormNumber = handOverFormNumber;
    }

    public String getNote() {
        return _note;
    }

    public void setNote(String note) {
        _note = note;
    }

    public Date getAssignDate() {
        return _assignDate;
    }

    public void setAssignDate(Date assignDate) {
        _assignDate = assignDate;
    }

    public Date getEstimatedReturnDate() {
        return _estimatedReturnDate;
    }

    public void setEstimatedReturnDate(Date estimatedReturnDate) {
        _estimatedReturnDate = estimatedReturnDate;
    }
}
