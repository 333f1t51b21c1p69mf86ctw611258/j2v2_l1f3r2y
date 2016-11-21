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
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("customerCode", getCustomerCode());
        attributes.put("signDate", getSignDate());
        attributes.put("warrantyStartDate", getWarrantyStartDate());
        attributes.put("warrantyEndDate", getWarrantyEndDate());
        attributes.put("purchaseOrderNumber", getPurchaseOrderNumber());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long purchaseOrderId = (Long) attributes.get("purchaseOrderId");

        if (purchaseOrderId != null) {
            setPurchaseOrderId(purchaseOrderId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        String customerCode = (String) attributes.get("customerCode");

        if (customerCode != null) {
            setCustomerCode(customerCode);
        }

        Date signDate = (Date) attributes.get("signDate");

        if (signDate != null) {
            setSignDate(signDate);
        }

        Date warrantyStartDate = (Date) attributes.get("warrantyStartDate");

        if (warrantyStartDate != null) {
            setWarrantyStartDate(warrantyStartDate);
        }

        Date warrantyEndDate = (Date) attributes.get("warrantyEndDate");

        if (warrantyEndDate != null) {
            setWarrantyEndDate(warrantyEndDate);
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
    * Returns the company ID of this purchase order.
    *
    * @return the company ID of this purchase order
    */
    @Override
    public long getCompanyId() {
        return _purchaseOrder.getCompanyId();
    }

    /**
    * Sets the company ID of this purchase order.
    *
    * @param companyId the company ID of this purchase order
    */
    @Override
    public void setCompanyId(long companyId) {
        _purchaseOrder.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this purchase order.
    *
    * @return the user ID of this purchase order
    */
    @Override
    public long getUserId() {
        return _purchaseOrder.getUserId();
    }

    /**
    * Sets the user ID of this purchase order.
    *
    * @param userId the user ID of this purchase order
    */
    @Override
    public void setUserId(long userId) {
        _purchaseOrder.setUserId(userId);
    }

    /**
    * Returns the user uuid of this purchase order.
    *
    * @return the user uuid of this purchase order
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _purchaseOrder.getUserUuid();
    }

    /**
    * Sets the user uuid of this purchase order.
    *
    * @param userUuid the user uuid of this purchase order
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _purchaseOrder.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this purchase order.
    *
    * @return the user name of this purchase order
    */
    @Override
    public java.lang.String getUserName() {
        return _purchaseOrder.getUserName();
    }

    /**
    * Sets the user name of this purchase order.
    *
    * @param userName the user name of this purchase order
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _purchaseOrder.setUserName(userName);
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
    * Returns the customer code of this purchase order.
    *
    * @return the customer code of this purchase order
    */
    @Override
    public java.lang.String getCustomerCode() {
        return _purchaseOrder.getCustomerCode();
    }

    /**
    * Sets the customer code of this purchase order.
    *
    * @param customerCode the customer code of this purchase order
    */
    @Override
    public void setCustomerCode(java.lang.String customerCode) {
        _purchaseOrder.setCustomerCode(customerCode);
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
    * Returns the warranty start date of this purchase order.
    *
    * @return the warranty start date of this purchase order
    */
    @Override
    public java.util.Date getWarrantyStartDate() {
        return _purchaseOrder.getWarrantyStartDate();
    }

    /**
    * Sets the warranty start date of this purchase order.
    *
    * @param warrantyStartDate the warranty start date of this purchase order
    */
    @Override
    public void setWarrantyStartDate(java.util.Date warrantyStartDate) {
        _purchaseOrder.setWarrantyStartDate(warrantyStartDate);
    }

    /**
    * Returns the warranty end date of this purchase order.
    *
    * @return the warranty end date of this purchase order
    */
    @Override
    public java.util.Date getWarrantyEndDate() {
        return _purchaseOrder.getWarrantyEndDate();
    }

    /**
    * Sets the warranty end date of this purchase order.
    *
    * @param warrantyEndDate the warranty end date of this purchase order
    */
    @Override
    public void setWarrantyEndDate(java.util.Date warrantyEndDate) {
        _purchaseOrder.setWarrantyEndDate(warrantyEndDate);
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
