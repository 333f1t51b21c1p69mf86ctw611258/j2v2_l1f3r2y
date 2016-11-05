package com.dasannetworks.vn.sb.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.dasannetworks.vn.sb.service.http.PurchaseOrderServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.dasannetworks.vn.sb.service.http.PurchaseOrderServiceSoap
 * @generated
 */
public class PurchaseOrderSoap implements Serializable {
    private long _purchaseOrderId;
    private Date _createDate;
    private Date _modifiedDate;
    private String _customer;
    private Date _signDate;
    private String _purchaseOrderNumber;

    public PurchaseOrderSoap() {
    }

    public static PurchaseOrderSoap toSoapModel(PurchaseOrder model) {
        PurchaseOrderSoap soapModel = new PurchaseOrderSoap();

        soapModel.setPurchaseOrderId(model.getPurchaseOrderId());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setCustomer(model.getCustomer());
        soapModel.setSignDate(model.getSignDate());
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

    public String getCustomer() {
        return _customer;
    }

    public void setCustomer(String customer) {
        _customer = customer;
    }

    public Date getSignDate() {
        return _signDate;
    }

    public void setSignDate(Date signDate) {
        _signDate = signDate;
    }

    public String getPurchaseOrderNumber() {
        return _purchaseOrderNumber;
    }

    public void setPurchaseOrderNumber(String purchaseOrderNumber) {
        _purchaseOrderNumber = purchaseOrderNumber;
    }
}
