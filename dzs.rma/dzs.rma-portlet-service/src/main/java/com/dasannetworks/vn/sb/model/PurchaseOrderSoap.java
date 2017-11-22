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
public class PurchaseOrderSoap implements Serializable {
    private long _purchaseOrderId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private Long _customerId;
    private Date _signDate;
    private Date _warrantyStartDate;
    private Date _warrantyEndDate;
    private String _purchaseOrderNumber;

    public PurchaseOrderSoap() {
    }

    public static PurchaseOrderSoap toSoapModel(PurchaseOrder model) {
        PurchaseOrderSoap soapModel = new PurchaseOrderSoap();

        soapModel.setPurchaseOrderId(model.getPurchaseOrderId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setCustomerId(model.getCustomerId());
        soapModel.setSignDate(model.getSignDate());
        soapModel.setWarrantyStartDate(model.getWarrantyStartDate());
        soapModel.setWarrantyEndDate(model.getWarrantyEndDate());
        soapModel.setPurchaseOrderNumber(model.getPurchaseOrderNumber());

        return soapModel;
    }

    public static PurchaseOrderSoap[] toSoapModels(PurchaseOrder[] models) {
        PurchaseOrderSoap[] soapModels = new PurchaseOrderSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static PurchaseOrderSoap[][] toSoapModels(PurchaseOrder[][] models) {
        PurchaseOrderSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new PurchaseOrderSoap[models.length][models[0].length];
        } else {
            soapModels = new PurchaseOrderSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static PurchaseOrderSoap[] toSoapModels(List<PurchaseOrder> models) {
        List<PurchaseOrderSoap> soapModels = new ArrayList<PurchaseOrderSoap>(models.size());

        for (PurchaseOrder model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new PurchaseOrderSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _purchaseOrderId;
    }

    public void setPrimaryKey(long pk) {
        setPurchaseOrderId(pk);
    }

    public long getPurchaseOrderId() {
        return _purchaseOrderId;
    }

    public void setPurchaseOrderId(long purchaseOrderId) {
        _purchaseOrderId = purchaseOrderId;
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

    public Long getCustomerId() {
        return _customerId;
    }

    public void setCustomerId(Long customerId) {
        _customerId = customerId;
    }

    public Date getSignDate() {
        return _signDate;
    }

    public void setSignDate(Date signDate) {
        _signDate = signDate;
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

    public String getPurchaseOrderNumber() {
        return _purchaseOrderNumber;
    }

    public void setPurchaseOrderNumber(String purchaseOrderNumber) {
        _purchaseOrderNumber = purchaseOrderNumber;
    }
}
