package com.dasannetworks.vn.sb.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link WarrantyForm}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WarrantyForm
 * @generated
 */
public class WarrantyFormWrapper implements WarrantyForm,
    ModelWrapper<WarrantyForm> {
    private WarrantyForm _warrantyForm;

    public WarrantyFormWrapper(WarrantyForm warrantyForm) {
        _warrantyForm = warrantyForm;
    }

    @Override
    public Class<?> getModelClass() {
        return WarrantyForm.class;
    }

    @Override
    public String getModelClassName() {
        return WarrantyForm.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("warrantyFormId", getWarrantyFormId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("customerCode", getCustomerCode());
        attributes.put("warrantyStartDate", getWarrantyStartDate());
        attributes.put("warrantyEndDate", getWarrantyEndDate());
        attributes.put("originalDeviceId", getOriginalDeviceId());
        attributes.put("currentDeviceId", getCurrentDeviceId());
        attributes.put("remark", getRemark());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long warrantyFormId = (Long) attributes.get("warrantyFormId");

        if (warrantyFormId != null) {
            setWarrantyFormId(warrantyFormId);
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

        Date warrantyStartDate = (Date) attributes.get("warrantyStartDate");

        if (warrantyStartDate != null) {
            setWarrantyStartDate(warrantyStartDate);
        }

        Date warrantyEndDate = (Date) attributes.get("warrantyEndDate");

        if (warrantyEndDate != null) {
            setWarrantyEndDate(warrantyEndDate);
        }

        Long originalDeviceId = (Long) attributes.get("originalDeviceId");

        if (originalDeviceId != null) {
            setOriginalDeviceId(originalDeviceId);
        }

        Long currentDeviceId = (Long) attributes.get("currentDeviceId");

        if (currentDeviceId != null) {
            setCurrentDeviceId(currentDeviceId);
        }

        String remark = (String) attributes.get("remark");

        if (remark != null) {
            setRemark(remark);
        }
    }

    /**
    * Returns the primary key of this warranty form.
    *
    * @return the primary key of this warranty form
    */
    @Override
    public long getPrimaryKey() {
        return _warrantyForm.getPrimaryKey();
    }

    /**
    * Sets the primary key of this warranty form.
    *
    * @param primaryKey the primary key of this warranty form
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _warrantyForm.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the warranty form ID of this warranty form.
    *
    * @return the warranty form ID of this warranty form
    */
    @Override
    public long getWarrantyFormId() {
        return _warrantyForm.getWarrantyFormId();
    }

    /**
    * Sets the warranty form ID of this warranty form.
    *
    * @param warrantyFormId the warranty form ID of this warranty form
    */
    @Override
    public void setWarrantyFormId(long warrantyFormId) {
        _warrantyForm.setWarrantyFormId(warrantyFormId);
    }

    /**
    * Returns the company ID of this warranty form.
    *
    * @return the company ID of this warranty form
    */
    @Override
    public long getCompanyId() {
        return _warrantyForm.getCompanyId();
    }

    /**
    * Sets the company ID of this warranty form.
    *
    * @param companyId the company ID of this warranty form
    */
    @Override
    public void setCompanyId(long companyId) {
        _warrantyForm.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this warranty form.
    *
    * @return the user ID of this warranty form
    */
    @Override
    public long getUserId() {
        return _warrantyForm.getUserId();
    }

    /**
    * Sets the user ID of this warranty form.
    *
    * @param userId the user ID of this warranty form
    */
    @Override
    public void setUserId(long userId) {
        _warrantyForm.setUserId(userId);
    }

    /**
    * Returns the user uuid of this warranty form.
    *
    * @return the user uuid of this warranty form
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _warrantyForm.getUserUuid();
    }

    /**
    * Sets the user uuid of this warranty form.
    *
    * @param userUuid the user uuid of this warranty form
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _warrantyForm.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this warranty form.
    *
    * @return the user name of this warranty form
    */
    @Override
    public java.lang.String getUserName() {
        return _warrantyForm.getUserName();
    }

    /**
    * Sets the user name of this warranty form.
    *
    * @param userName the user name of this warranty form
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _warrantyForm.setUserName(userName);
    }

    /**
    * Returns the create date of this warranty form.
    *
    * @return the create date of this warranty form
    */
    @Override
    public java.util.Date getCreateDate() {
        return _warrantyForm.getCreateDate();
    }

    /**
    * Sets the create date of this warranty form.
    *
    * @param createDate the create date of this warranty form
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _warrantyForm.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this warranty form.
    *
    * @return the modified date of this warranty form
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _warrantyForm.getModifiedDate();
    }

    /**
    * Sets the modified date of this warranty form.
    *
    * @param modifiedDate the modified date of this warranty form
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _warrantyForm.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the customer code of this warranty form.
    *
    * @return the customer code of this warranty form
    */
    @Override
    public java.lang.String getCustomerCode() {
        return _warrantyForm.getCustomerCode();
    }

    /**
    * Sets the customer code of this warranty form.
    *
    * @param customerCode the customer code of this warranty form
    */
    @Override
    public void setCustomerCode(java.lang.String customerCode) {
        _warrantyForm.setCustomerCode(customerCode);
    }

    /**
    * Returns the warranty start date of this warranty form.
    *
    * @return the warranty start date of this warranty form
    */
    @Override
    public java.util.Date getWarrantyStartDate() {
        return _warrantyForm.getWarrantyStartDate();
    }

    /**
    * Sets the warranty start date of this warranty form.
    *
    * @param warrantyStartDate the warranty start date of this warranty form
    */
    @Override
    public void setWarrantyStartDate(java.util.Date warrantyStartDate) {
        _warrantyForm.setWarrantyStartDate(warrantyStartDate);
    }

    /**
    * Returns the warranty end date of this warranty form.
    *
    * @return the warranty end date of this warranty form
    */
    @Override
    public java.util.Date getWarrantyEndDate() {
        return _warrantyForm.getWarrantyEndDate();
    }

    /**
    * Sets the warranty end date of this warranty form.
    *
    * @param warrantyEndDate the warranty end date of this warranty form
    */
    @Override
    public void setWarrantyEndDate(java.util.Date warrantyEndDate) {
        _warrantyForm.setWarrantyEndDate(warrantyEndDate);
    }

    /**
    * Returns the original device ID of this warranty form.
    *
    * @return the original device ID of this warranty form
    */
    @Override
    public long getOriginalDeviceId() {
        return _warrantyForm.getOriginalDeviceId();
    }

    /**
    * Sets the original device ID of this warranty form.
    *
    * @param originalDeviceId the original device ID of this warranty form
    */
    @Override
    public void setOriginalDeviceId(long originalDeviceId) {
        _warrantyForm.setOriginalDeviceId(originalDeviceId);
    }

    /**
    * Returns the current device ID of this warranty form.
    *
    * @return the current device ID of this warranty form
    */
    @Override
    public long getCurrentDeviceId() {
        return _warrantyForm.getCurrentDeviceId();
    }

    /**
    * Sets the current device ID of this warranty form.
    *
    * @param currentDeviceId the current device ID of this warranty form
    */
    @Override
    public void setCurrentDeviceId(long currentDeviceId) {
        _warrantyForm.setCurrentDeviceId(currentDeviceId);
    }

    /**
    * Returns the remark of this warranty form.
    *
    * @return the remark of this warranty form
    */
    @Override
    public java.lang.String getRemark() {
        return _warrantyForm.getRemark();
    }

    /**
    * Sets the remark of this warranty form.
    *
    * @param remark the remark of this warranty form
    */
    @Override
    public void setRemark(java.lang.String remark) {
        _warrantyForm.setRemark(remark);
    }

    @Override
    public boolean isNew() {
        return _warrantyForm.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _warrantyForm.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _warrantyForm.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _warrantyForm.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _warrantyForm.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _warrantyForm.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _warrantyForm.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _warrantyForm.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _warrantyForm.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _warrantyForm.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _warrantyForm.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new WarrantyFormWrapper((WarrantyForm) _warrantyForm.clone());
    }

    @Override
    public int compareTo(
        com.dasannetworks.vn.sb.model.WarrantyForm warrantyForm) {
        return _warrantyForm.compareTo(warrantyForm);
    }

    @Override
    public int hashCode() {
        return _warrantyForm.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.dasannetworks.vn.sb.model.WarrantyForm> toCacheModel() {
        return _warrantyForm.toCacheModel();
    }

    @Override
    public com.dasannetworks.vn.sb.model.WarrantyForm toEscapedModel() {
        return new WarrantyFormWrapper(_warrantyForm.toEscapedModel());
    }

    @Override
    public com.dasannetworks.vn.sb.model.WarrantyForm toUnescapedModel() {
        return new WarrantyFormWrapper(_warrantyForm.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _warrantyForm.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _warrantyForm.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _warrantyForm.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof WarrantyFormWrapper)) {
            return false;
        }

        WarrantyFormWrapper warrantyFormWrapper = (WarrantyFormWrapper) obj;

        if (Validator.equals(_warrantyForm, warrantyFormWrapper._warrantyForm)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public WarrantyForm getWrappedWarrantyForm() {
        return _warrantyForm;
    }

    @Override
    public WarrantyForm getWrappedModel() {
        return _warrantyForm;
    }

    @Override
    public void resetOriginalValues() {
        _warrantyForm.resetOriginalValues();
    }
}
