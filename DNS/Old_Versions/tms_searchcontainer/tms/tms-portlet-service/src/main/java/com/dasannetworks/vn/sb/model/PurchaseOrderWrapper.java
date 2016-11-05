package com.dasannetworks.vn.sb.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PurchaseOrder}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PurchaseOrder
 * @generated
 */
public class PurchaseOrderWrapper implements PurchaseOrder,
    ModelWrapper<PurchaseOrder> {
    private PurchaseOrder _purchaseOrder;

    public PurchaseOrderWrapper(PurchaseOrder purchaseOrder) {
        _purchaseOrder = purchaseOrder;
    }

    @Override
    public Class<?> getModelClass() {
        return PurchaseOrder.class;
    }

    @Override
    public String getModelClassName() {
        return PurchaseOrder.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("purchaseOrderId", getPurchaseOrderId());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("customer", getCustomer());
        attributes.put("signDate", getSignDate());
        attributes.put("purchaseOrderNumber", getPurchaseOrderNumber());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long purchaseOrderId = (Long) attributes.get("purchaseOrderId");

        if (purchaseOrderId != null) {
            setPurchaseOrderId(purchaseOrderId);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        String customer = (String) attributes.get("customer");

        if (customer != null) {
            setCustomer(customer);
        }

        Date signDate = (Date) attributes.get("signDate");

        if (signDate != null) {
            setSignDate(signDate);
        }

        String purchaseOrderNumber = (String) attributes.get(
                "purchaseOrderNumber");

        if (purchaseOrderNumber != null) {
            setPurchaseOrderNumber(purchaseOrderNumber);
        }
    }

    /**
    * Returns the primary key of this purchase order.
    *
    * @return the primary key of this purchase order
    */
    @Override
    public long getPrimaryKey() {
        return _purchaseOrder.getPrimaryKey();
    }

    /**
    * Sets the primary key of this purchase order.
    *
    * @param primaryKey the primary key of this purchase order
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _purchaseOrder.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the purchase order ID of this purchase order.
    *
    * @return the purchase order ID of this purchase order
    */
    @Override
    public long getPurchaseOrderId() {
        return _purchaseOrder.getPurchaseOrderId();
    }

    /**
    * Sets the purchase order ID of this purchase order.
    *
    * @param purchaseOrderId the purchase order ID of this purchase order
    */
    @Override
    public void setPurchaseOrderId(long purchaseOrderId) {
        _purchaseOrder.setPurchaseOrderId(purchaseOrderId);
    }

    /**
    * Returns the create date of this purchase order.
    *
    * @return the create date of this purchase order
    */
    @Override
    public java.util.Date getCreateDate() {
        return _purchaseOrder.getCreateDate();
    }

    /**
    * Sets the create date of this purchase order.
    *
    * @param createDate the create date of this purchase order
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _purchaseOrder.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this purchase order.
    *
    * @return the modified date of this purchase order
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _purchaseOrder.getModifiedDate();
    }

    /**
    * Sets the modified date of this purchase order.
    *
    * @param modifiedDate the modified date of this purchase order
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _purchaseOrder.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the customer of this purchase order.
    *
    * @return the customer of this purchase order
    */
    @Override
    public java.lang.String getCustomer() {
        return _purchaseOrder.getCustomer();
    }

    /**
    * Sets the customer of this purchase order.
    *
    * @param customer the customer of this purchase order
    */
    @Override
    public void setCustomer(java.lang.String customer) {
        _purchaseOrder.setCustomer(customer);
    }

    /**
    * Returns the sign date of this purchase order.
    *
    * @return the sign date of this purchase order
    */
    @Override
    public java.util.Date getSignDate() {
        return _purchaseOrder.getSignDate();
    }

    /**
    * Sets the sign date of this purchase order.
    *
    * @param signDate the sign date of this purchase order
    */
    @Override
    public void setSignDate(java.util.Date signDate) {
        _purchaseOrder.setSignDate(signDate);
    }

    /**
    * Returns the purchase order number of this purchase order.
    *
    * @return the purchase order number of this purchase order
    */
    @Override
    public java.lang.String getPurchaseOrderNumber() {
        return _purchaseOrder.getPurchaseOrderNumber();
    }

    /**
    * Sets the purchase order number of this purchase order.
    *
    * @param purchaseOrderNumber the purchase order number of this purchase order
    */
    @Override
    public void setPurchaseOrderNumber(java.lang.String purchaseOrderNumber) {
        _purchaseOrder.setPurchaseOrderNumber(purchaseOrderNumber);
    }

    @Override
    public boolean isNew() {
        return _purchaseOrder.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _purchaseOrder.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _purchaseOrder.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _purchaseOrder.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _purchaseOrder.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _purchaseOrder.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _purchaseOrder.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _purchaseOrder.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _purchaseOrder.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _purchaseOrder.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _purchaseOrder.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new PurchaseOrderWrapper((PurchaseOrder) _purchaseOrder.clone());
    }

    @Override
    public int compareTo(
        com.dasannetworks.vn.sb.model.PurchaseOrder purchaseOrder) {
        return _purchaseOrder.compareTo(purchaseOrder);
    }

    @Override
    public int hashCode() {
        return _purchaseOrder.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.dasannetworks.vn.sb.model.PurchaseOrder> toCacheModel() {
        return _purchaseOrder.toCacheModel();
    }

    @Override
    public com.dasannetworks.vn.sb.model.PurchaseOrder toEscapedModel() {
        return new PurchaseOrderWrapper(_purchaseOrder.toEscapedModel());
    }

    @Override
    public com.dasannetworks.vn.sb.model.PurchaseOrder toUnescapedModel() {
        return new PurchaseOrderWrapper(_purchaseOrder.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _purchaseOrder.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _purchaseOrder.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _purchaseOrder.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PurchaseOrderWrapper)) {
            return false;
        }

        PurchaseOrderWrapper purchaseOrderWrapper = (PurchaseOrderWrapper) obj;

        if (Validator.equals(_purchaseOrder, purchaseOrderWrapper._purchaseOrder)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public PurchaseOrder getWrappedPurchaseOrder() {
        return _purchaseOrder;
    }

    @Override
    public PurchaseOrder getWrappedModel() {
        return _purchaseOrder;
    }

    @Override
    public void resetOriginalValues() {
        _purchaseOrder.resetOriginalValues();
    }
}
