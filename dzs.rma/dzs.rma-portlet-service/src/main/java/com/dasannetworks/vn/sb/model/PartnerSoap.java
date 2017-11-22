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
public class PartnerSoap implements Serializable {
    private long _partnerId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _partnerCode;
    private String _partnerName;
    private String _inCharge;
    private String _email;
    private String _phone;
    private String _address;

    public PartnerSoap() {
    }

    public static PartnerSoap toSoapModel(Partner model) {
        PartnerSoap soapModel = new PartnerSoap();

        soapModel.setPartnerId(model.getPartnerId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setPartnerCode(model.getPartnerCode());
        soapModel.setPartnerName(model.getPartnerName());
        soapModel.setInCharge(model.getInCharge());
        soapModel.setEmail(model.getEmail());
        soapModel.setPhone(model.getPhone());
        soapModel.setAddress(model.getAddress());

        return soapModel;
    }

    public static PartnerSoap[] toSoapModels(Partner[] models) {
        PartnerSoap[] soapModels = new PartnerSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static PartnerSoap[][] toSoapModels(Partner[][] models) {
        PartnerSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new PartnerSoap[models.length][models[0].length];
        } else {
            soapModels = new PartnerSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static PartnerSoap[] toSoapModels(List<Partner> models) {
        List<PartnerSoap> soapModels = new ArrayList<PartnerSoap>(models.size());

        for (Partner model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new PartnerSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _partnerId;
    }

    public void setPrimaryKey(long pk) {
        setPartnerId(pk);
    }

    public long getPartnerId() {
        return _partnerId;
    }

    public void setPartnerId(long partnerId) {
        _partnerId = partnerId;
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

    public String getPartnerCode() {
        return _partnerCode;
    }

    public void setPartnerCode(String partnerCode) {
        _partnerCode = partnerCode;
    }

    public String getPartnerName() {
        return _partnerName;
    }

    public void setPartnerName(String partnerName) {
        _partnerName = partnerName;
    }

    public String getInCharge() {
        return _inCharge;
    }

    public void setInCharge(String inCharge) {
        _inCharge = inCharge;
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

    public String getAddress() {
        return _address;
    }

    public void setAddress(String address) {
        _address = address;
    }
}
