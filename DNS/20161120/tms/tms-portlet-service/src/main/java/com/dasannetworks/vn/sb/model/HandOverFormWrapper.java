package com.dasannetworks.vn.sb.model;

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link HandOverForm}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HandOverForm
 * @generated
 */
public class HandOverFormWrapper implements HandOverForm,
    ModelWrapper<HandOverForm> {
    private HandOverForm _handOverForm;

    public HandOverFormWrapper(HandOverForm handOverForm) {
        _handOverForm = handOverForm;
    }

    @Override
    public Class<?> getModelClass() {
        return HandOverForm.class;
    }

    @Override
    public String getModelClassName() {
        return HandOverForm.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("handOverFormId", getHandOverFormId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("groupId", getGroupId());
        attributes.put("customerCode", getCustomerCode());
        attributes.put("contactPoint", getContactPoint());
        attributes.put("email", getEmail());
        attributes.put("phone", getPhone());
        attributes.put("location", getLocation());
        attributes.put("personInCharge", getPersonInCharge());
        attributes.put("handOverFormNumber", getHandOverFormNumber());
        attributes.put("note", getNote());
        attributes.put("assignDate", getAssignDate());
        attributes.put("estimatedReturnDate", getEstimatedReturnDate());
        attributes.put("status", getStatus());
        attributes.put("statusByUserId", getStatusByUserId());
        attributes.put("statusDate", getStatusDate());
        attributes.put("testId", getTestId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long handOverFormId = (Long) attributes.get("handOverFormId");

        if (handOverFormId != null) {
            setHandOverFormId(handOverFormId);
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

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        String customerCode = (String) attributes.get("customerCode");

        if (customerCode != null) {
            setCustomerCode(customerCode);
        }

        String contactPoint = (String) attributes.get("contactPoint");

        if (contactPoint != null) {
            setContactPoint(contactPoint);
        }

        String email = (String) attributes.get("email");

        if (email != null) {
            setEmail(email);
        }

        String phone = (String) attributes.get("phone");

        if (phone != null) {
            setPhone(phone);
        }

        String location = (String) attributes.get("location");

        if (location != null) {
            setLocation(location);
        }

        String personInCharge = (String) attributes.get("personInCharge");

        if (personInCharge != null) {
            setPersonInCharge(personInCharge);
        }

        String handOverFormNumber = (String) attributes.get(
                "handOverFormNumber");

        if (handOverFormNumber != null) {
            setHandOverFormNumber(handOverFormNumber);
        }

        String note = (String) attributes.get("note");

        if (note != null) {
            setNote(note);
        }

        Date assignDate = (Date) attributes.get("assignDate");

        if (assignDate != null) {
            setAssignDate(assignDate);
        }

        Date estimatedReturnDate = (Date) attributes.get("estimatedReturnDate");

        if (estimatedReturnDate != null) {
            setEstimatedReturnDate(estimatedReturnDate);
        }

        Integer status = (Integer) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }

        Long statusByUserId = (Long) attributes.get("statusByUserId");

        if (statusByUserId != null) {
            setStatusByUserId(statusByUserId);
        }

        Date statusDate = (Date) attributes.get("statusDate");

        if (statusDate != null) {
            setStatusDate(statusDate);
        }

        Long testId = (Long) attributes.get("testId");

        if (testId != null) {
            setTestId(testId);
        }
    }

    /**
    * Returns the primary key of this hand over form.
    *
    * @return the primary key of this hand over form
    */
    @Override
    public long getPrimaryKey() {
        return _handOverForm.getPrimaryKey();
    }

    /**
    * Sets the primary key of this hand over form.
    *
    * @param primaryKey the primary key of this hand over form
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _handOverForm.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the uuid of this hand over form.
    *
    * @return the uuid of this hand over form
    */
    @Override
    public java.lang.String getUuid() {
        return _handOverForm.getUuid();
    }

    /**
    * Sets the uuid of this hand over form.
    *
    * @param uuid the uuid of this hand over form
    */
    @Override
    public void setUuid(java.lang.String uuid) {
        _handOverForm.setUuid(uuid);
    }

    /**
    * Returns the hand over form ID of this hand over form.
    *
    * @return the hand over form ID of this hand over form
    */
    @Override
    public long getHandOverFormId() {
        return _handOverForm.getHandOverFormId();
    }

    /**
    * Sets the hand over form ID of this hand over form.
    *
    * @param handOverFormId the hand over form ID of this hand over form
    */
    @Override
    public void setHandOverFormId(long handOverFormId) {
        _handOverForm.setHandOverFormId(handOverFormId);
    }

    /**
    * Returns the company ID of this hand over form.
    *
    * @return the company ID of this hand over form
    */
    @Override
    public long getCompanyId() {
        return _handOverForm.getCompanyId();
    }

    /**
    * Sets the company ID of this hand over form.
    *
    * @param companyId the company ID of this hand over form
    */
    @Override
    public void setCompanyId(long companyId) {
        _handOverForm.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this hand over form.
    *
    * @return the user ID of this hand over form
    */
    @Override
    public long getUserId() {
        return _handOverForm.getUserId();
    }

    /**
    * Sets the user ID of this hand over form.
    *
    * @param userId the user ID of this hand over form
    */
    @Override
    public void setUserId(long userId) {
        _handOverForm.setUserId(userId);
    }

    /**
    * Returns the user uuid of this hand over form.
    *
    * @return the user uuid of this hand over form
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _handOverForm.getUserUuid();
    }

    /**
    * Sets the user uuid of this hand over form.
    *
    * @param userUuid the user uuid of this hand over form
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _handOverForm.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this hand over form.
    *
    * @return the user name of this hand over form
    */
    @Override
    public java.lang.String getUserName() {
        return _handOverForm.getUserName();
    }

    /**
    * Sets the user name of this hand over form.
    *
    * @param userName the user name of this hand over form
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _handOverForm.setUserName(userName);
    }

    /**
    * Returns the create date of this hand over form.
    *
    * @return the create date of this hand over form
    */
    @Override
    public java.util.Date getCreateDate() {
        return _handOverForm.getCreateDate();
    }

    /**
    * Sets the create date of this hand over form.
    *
    * @param createDate the create date of this hand over form
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _handOverForm.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this hand over form.
    *
    * @return the modified date of this hand over form
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _handOverForm.getModifiedDate();
    }

    /**
    * Sets the modified date of this hand over form.
    *
    * @param modifiedDate the modified date of this hand over form
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _handOverForm.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the group ID of this hand over form.
    *
    * @return the group ID of this hand over form
    */
    @Override
    public long getGroupId() {
        return _handOverForm.getGroupId();
    }

    /**
    * Sets the group ID of this hand over form.
    *
    * @param groupId the group ID of this hand over form
    */
    @Override
    public void setGroupId(long groupId) {
        _handOverForm.setGroupId(groupId);
    }

    /**
    * Returns the customer code of this hand over form.
    *
    * @return the customer code of this hand over form
    */
    @Override
    public java.lang.String getCustomerCode() {
        return _handOverForm.getCustomerCode();
    }

    /**
    * Sets the customer code of this hand over form.
    *
    * @param customerCode the customer code of this hand over form
    */
    @Override
    public void setCustomerCode(java.lang.String customerCode) {
        _handOverForm.setCustomerCode(customerCode);
    }

    /**
    * Returns the contact point of this hand over form.
    *
    * @return the contact point of this hand over form
    */
    @Override
    public java.lang.String getContactPoint() {
        return _handOverForm.getContactPoint();
    }

    /**
    * Sets the contact point of this hand over form.
    *
    * @param contactPoint the contact point of this hand over form
    */
    @Override
    public void setContactPoint(java.lang.String contactPoint) {
        _handOverForm.setContactPoint(contactPoint);
    }

    /**
    * Returns the email of this hand over form.
    *
    * @return the email of this hand over form
    */
    @Override
    public java.lang.String getEmail() {
        return _handOverForm.getEmail();
    }

    /**
    * Sets the email of this hand over form.
    *
    * @param email the email of this hand over form
    */
    @Override
    public void setEmail(java.lang.String email) {
        _handOverForm.setEmail(email);
    }

    /**
    * Returns the phone of this hand over form.
    *
    * @return the phone of this hand over form
    */
    @Override
    public java.lang.String getPhone() {
        return _handOverForm.getPhone();
    }

    /**
    * Sets the phone of this hand over form.
    *
    * @param phone the phone of this hand over form
    */
    @Override
    public void setPhone(java.lang.String phone) {
        _handOverForm.setPhone(phone);
    }

    /**
    * Returns the location of this hand over form.
    *
    * @return the location of this hand over form
    */
    @Override
    public java.lang.String getLocation() {
        return _handOverForm.getLocation();
    }

    /**
    * Sets the location of this hand over form.
    *
    * @param location the location of this hand over form
    */
    @Override
    public void setLocation(java.lang.String location) {
        _handOverForm.setLocation(location);
    }

    /**
    * Returns the person in charge of this hand over form.
    *
    * @return the person in charge of this hand over form
    */
    @Override
    public java.lang.String getPersonInCharge() {
        return _handOverForm.getPersonInCharge();
    }

    /**
    * Sets the person in charge of this hand over form.
    *
    * @param personInCharge the person in charge of this hand over form
    */
    @Override
    public void setPersonInCharge(java.lang.String personInCharge) {
        _handOverForm.setPersonInCharge(personInCharge);
    }

    /**
    * Returns the hand over form number of this hand over form.
    *
    * @return the hand over form number of this hand over form
    */
    @Override
    public java.lang.String getHandOverFormNumber() {
        return _handOverForm.getHandOverFormNumber();
    }

    /**
    * Sets the hand over form number of this hand over form.
    *
    * @param handOverFormNumber the hand over form number of this hand over form
    */
    @Override
    public void setHandOverFormNumber(java.lang.String handOverFormNumber) {
        _handOverForm.setHandOverFormNumber(handOverFormNumber);
    }

    /**
    * Returns the note of this hand over form.
    *
    * @return the note of this hand over form
    */
    @Override
    public java.lang.String getNote() {
        return _handOverForm.getNote();
    }

    /**
    * Sets the note of this hand over form.
    *
    * @param note the note of this hand over form
    */
    @Override
    public void setNote(java.lang.String note) {
        _handOverForm.setNote(note);
    }

    /**
    * Returns the assign date of this hand over form.
    *
    * @return the assign date of this hand over form
    */
    @Override
    public java.util.Date getAssignDate() {
        return _handOverForm.getAssignDate();
    }

    /**
    * Sets the assign date of this hand over form.
    *
    * @param assignDate the assign date of this hand over form
    */
    @Override
    public void setAssignDate(java.util.Date assignDate) {
        _handOverForm.setAssignDate(assignDate);
    }

    /**
    * Returns the estimated return date of this hand over form.
    *
    * @return the estimated return date of this hand over form
    */
    @Override
    public java.util.Date getEstimatedReturnDate() {
        return _handOverForm.getEstimatedReturnDate();
    }

    /**
    * Sets the estimated return date of this hand over form.
    *
    * @param estimatedReturnDate the estimated return date of this hand over form
    */
    @Override
    public void setEstimatedReturnDate(java.util.Date estimatedReturnDate) {
        _handOverForm.setEstimatedReturnDate(estimatedReturnDate);
    }

    /**
    * Returns the status of this hand over form.
    *
    * @return the status of this hand over form
    */
    @Override
    public int getStatus() {
        return _handOverForm.getStatus();
    }

    /**
    * Sets the status of this hand over form.
    *
    * @param status the status of this hand over form
    */
    @Override
    public void setStatus(int status) {
        _handOverForm.setStatus(status);
    }

    /**
    * Returns the status by user ID of this hand over form.
    *
    * @return the status by user ID of this hand over form
    */
    @Override
    public long getStatusByUserId() {
        return _handOverForm.getStatusByUserId();
    }

    /**
    * Sets the status by user ID of this hand over form.
    *
    * @param statusByUserId the status by user ID of this hand over form
    */
    @Override
    public void setStatusByUserId(long statusByUserId) {
        _handOverForm.setStatusByUserId(statusByUserId);
    }

    /**
    * Returns the status by user uuid of this hand over form.
    *
    * @return the status by user uuid of this hand over form
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getStatusByUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _handOverForm.getStatusByUserUuid();
    }

    /**
    * Sets the status by user uuid of this hand over form.
    *
    * @param statusByUserUuid the status by user uuid of this hand over form
    */
    @Override
    public void setStatusByUserUuid(java.lang.String statusByUserUuid) {
        _handOverForm.setStatusByUserUuid(statusByUserUuid);
    }

    /**
    * Returns the status date of this hand over form.
    *
    * @return the status date of this hand over form
    */
    @Override
    public java.util.Date getStatusDate() {
        return _handOverForm.getStatusDate();
    }

    /**
    * Sets the status date of this hand over form.
    *
    * @param statusDate the status date of this hand over form
    */
    @Override
    public void setStatusDate(java.util.Date statusDate) {
        _handOverForm.setStatusDate(statusDate);
    }

    /**
    * Returns the test ID of this hand over form.
    *
    * @return the test ID of this hand over form
    */
    @Override
    public long getTestId() {
        return _handOverForm.getTestId();
    }

    /**
    * Sets the test ID of this hand over form.
    *
    * @param testId the test ID of this hand over form
    */
    @Override
    public void setTestId(long testId) {
        _handOverForm.setTestId(testId);
    }

    @Override
    public boolean isNew() {
        return _handOverForm.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _handOverForm.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _handOverForm.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _handOverForm.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _handOverForm.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _handOverForm.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _handOverForm.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _handOverForm.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _handOverForm.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _handOverForm.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _handOverForm.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new HandOverFormWrapper((HandOverForm) _handOverForm.clone());
    }

    @Override
    public int compareTo(
        com.dasannetworks.vn.sb.model.HandOverForm handOverForm) {
        return _handOverForm.compareTo(handOverForm);
    }

    @Override
    public int hashCode() {
        return _handOverForm.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.dasannetworks.vn.sb.model.HandOverForm> toCacheModel() {
        return _handOverForm.toCacheModel();
    }

    @Override
    public com.dasannetworks.vn.sb.model.HandOverForm toEscapedModel() {
        return new HandOverFormWrapper(_handOverForm.toEscapedModel());
    }

    @Override
    public com.dasannetworks.vn.sb.model.HandOverForm toUnescapedModel() {
        return new HandOverFormWrapper(_handOverForm.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _handOverForm.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _handOverForm.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _handOverForm.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof HandOverFormWrapper)) {
            return false;
        }

        HandOverFormWrapper handOverFormWrapper = (HandOverFormWrapper) obj;

        if (Validator.equals(_handOverForm, handOverFormWrapper._handOverForm)) {
            return true;
        }

        return false;
    }

    @Override
    public StagedModelType getStagedModelType() {
        return _handOverForm.getStagedModelType();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public HandOverForm getWrappedHandOverForm() {
        return _handOverForm;
    }

    @Override
    public HandOverForm getWrappedModel() {
        return _handOverForm;
    }

    @Override
    public void resetOriginalValues() {
        _handOverForm.resetOriginalValues();
    }
}
