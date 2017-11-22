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
public class WarrantyFormSoap implements Serializable {
    private long _warrantyFormId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _agentCode;
    private Date _warrantyStartDate;
    private Date _warrantyEndDate;
    private String _originalSerialNumber;
    private String _hisSerialNumbers;
    private String _latestSerialNumber;
    private String _remark;

    public WarrantyFormSoap() {
    }

    public static WarrantyFormSoap toSoapModel(WarrantyForm model) {
        WarrantyFormSoap soapModel = new WarrantyFormSoap();

        soapModel.setWarrantyFormId(model.getWarrantyFormId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setAgentCode(model.getAgentCode());
        soapModel.setWarrantyStartDate(model.getWarrantyStartDate());
        soapModel.setWarrantyEndDate(model.getWarrantyEndDate());
        soapModel.setOriginalSerialNumber(model.getOriginalSerialNumber());
        soapModel.setHisSerialNumbers(model.getHisSerialNumbers());
        soapModel.setLatestSerialNumber(model.getLatestSerialNumber());
        soapModel.setRemark(model.getRemark());

        return soapModel;
    }

    public static WarrantyFormSoap[] toSoapModels(WarrantyForm[] models) {
        WarrantyFormSoap[] soapModels = new WarrantyFormSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static WarrantyFormSoap[][] toSoapModels(WarrantyForm[][] models) {
        WarrantyFormSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new WarrantyFormSoap[models.length][models[0].length];
        } else {
            soapModels = new WarrantyFormSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static WarrantyFormSoap[] toSoapModels(List<WarrantyForm> models) {
        List<WarrantyFormSoap> soapModels = new ArrayList<WarrantyFormSoap>(models.size());

        for (WarrantyForm model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new WarrantyFormSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _warrantyFormId;
    }

    public void setPrimaryKey(long pk) {
        setWarrantyFormId(pk);
    }

    public long getWarrantyFormId() {
        return _warrantyFormId;
    }

    public void setWarrantyFormId(long warrantyFormId) {
        _warrantyFormId = warrantyFormId;
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

    public String getAgentCode() {
        return _agentCode;
    }

    public void setAgentCode(String agentCode) {
        _agentCode = agentCode;
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

    public String getOriginalSerialNumber() {
        return _originalSerialNumber;
    }

    public void setOriginalSerialNumber(String originalSerialNumber) {
        _originalSerialNumber = originalSerialNumber;
    }

    public String getHisSerialNumbers() {
        return _hisSerialNumbers;
    }

    public void setHisSerialNumbers(String hisSerialNumbers) {
        _hisSerialNumbers = hisSerialNumbers;
    }

    public String getLatestSerialNumber() {
        return _latestSerialNumber;
    }

    public void setLatestSerialNumber(String latestSerialNumber) {
        _latestSerialNumber = latestSerialNumber;
    }

    public String getRemark() {
        return _remark;
    }

    public void setRemark(String remark) {
        _remark = remark;
    }
}
