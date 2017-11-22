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
public class CustomerSoap implements Serializable {
    private long _customerId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _customerCode;
    private String _customerName;
    private String _inCharge;
    private String _email;
    private String _phone;
    private String _address;
    private Long _parentId;

    public CustomerSoap() {
    }

    public static CustomerSoap toSoapModel(Customer model) {
        CustomerSoap soapModel = new CustomerSoap();

        soapModel.setCustomerId(model.getCustomerId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setCustomerCode(model.getCustomerCode());
        soapModel.setCustomerName(model.getCustomerName());
        soapModel.setInCharge(model.getInCharge());
        soapModel.setEmail(model.getEmail());
        soapModel.setPhone(model.getPhone());
        soapModel.setAddress(model.getAddress());
        soapModel.setParentId(model.getParentId());

        return soapModel;
    }

    public static CustomerSoap[] toSoapModels(Customer[] models) {
        CustomerSoap[] soapModels = new CustomerSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static CustomerSoap[][] toSoapModels(Customer[][] models) {
        CustomerSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new CustomerSoap[models.length][models[0].length];
        } else {
            soapModels = new CustomerSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static CustomerSoap[] toSoapModels(List<Customer> models) {
        List<CustomerSoap> soapModels = new ArrayList<CustomerSoap>(models.size());

        for (Customer model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new CustomerSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _customerId;
    }

    public void setPrimaryKey(long pk) {
        setCustomerId(pk);
    }

    public long getCustomerId() {
        return _customerId;
    }

    public void setCustomerId(long customerId) {
        _customerId = customerId;
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

    public String getCustomerName() {
        return _customerName;
    }

    public void setCustomerName(String customerName) {
        _customerName = customerName;
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

    public Long getParentId() {
        return _parentId;
    }

    public void setParentId(Long parentId) {
        _parentId = parentId;
    }
}
