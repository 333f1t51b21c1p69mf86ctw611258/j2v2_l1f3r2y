package com.dasannetworks.vn.sb.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link RmaRequest}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RmaRequest
 * @generated
 */
public class RmaRequestWrapper implements RmaRequest, ModelWrapper<RmaRequest> {
    private RmaRequest _rmaRequest;

    public RmaRequestWrapper(RmaRequest rmaRequest) {
        _rmaRequest = rmaRequest;
    }

    @Override
    public Class<?> getModelClass() {
        return RmaRequest.class;
    }

    @Override
    public String getModelClassName() {
        return RmaRequest.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("rmaRequestId", getRmaRequestId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("groupId", getGroupId());
        attributes.put("rmaRequestNumber", getRmaRequestNumber());
        attributes.put("customerId", getCustomerId());
        attributes.put("cusInCharge", getCusInCharge());
        attributes.put("cusEmail", getCusEmail());
        attributes.put("cusPhone", getCusPhone());
        attributes.put("cusAddress", getCusAddress());
        attributes.put("creatingEstReturnDate", getCreatingEstReturnDate());
        attributes.put("creatingAssignedDate", getCreatingAssignedDate());
        attributes.put("creatingNote", getCreatingNote());
        attributes.put("creatingImportedFileName", getCreatingImportedFileName());
        attributes.put("status", getStatus());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long rmaRequestId = (Long) attributes.get("rmaRequestId");

        if (rmaRequestId != null) {
            setRmaRequestId(rmaRequestId);
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

        String rmaRequestNumber = (String) attributes.get("rmaRequestNumber");

        if (rmaRequestNumber != null) {
            setRmaRequestNumber(rmaRequestNumber);
        }

        Long customerId = (Long) attributes.get("customerId");

        if (customerId != null) {
            setCustomerId(customerId);
        }

        String cusInCharge = (String) attributes.get("cusInCharge");

        if (cusInCharge != null) {
            setCusInCharge(cusInCharge);
        }

        String cusEmail = (String) attributes.get("cusEmail");

        if (cusEmail != null) {
            setCusEmail(cusEmail);
        }

        String cusPhone = (String) attributes.get("cusPhone");

        if (cusPhone != null) {
            setCusPhone(cusPhone);
        }

        String cusAddress = (String) attributes.get("cusAddress");

        if (cusAddress != null) {
            setCusAddress(cusAddress);
        }

        Date creatingEstReturnDate = (Date) attributes.get(
                "creatingEstReturnDate");

        if (creatingEstReturnDate != null) {
            setCreatingEstReturnDate(creatingEstReturnDate);
        }

        Date creatingAssignedDate = (Date) attributes.get(
                "creatingAssignedDate");

        if (creatingAssignedDate != null) {
            setCreatingAssignedDate(creatingAssignedDate);
        }

        String creatingNote = (String) attributes.get("creatingNote");

        if (creatingNote != null) {
            setCreatingNote(creatingNote);
        }

        String creatingImportedFileName = (String) attributes.get(
                "creatingImportedFileName");

        if (creatingImportedFileName != null) {
            setCreatingImportedFileName(creatingImportedFileName);
        }

        Integer status = (Integer) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }
    }

    /**
    * Returns the primary key of this rma request.
    *
    * @return the primary key of this rma request
    */
    @Override
    public long getPrimaryKey() {
        return _rmaRequest.getPrimaryKey();
    }

    /**
    * Sets the primary key of this rma request.
    *
    * @param primaryKey the primary key of this rma request
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _rmaRequest.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the rma request ID of this rma request.
    *
    * @return the rma request ID of this rma request
    */
    @Override
    public long getRmaRequestId() {
        return _rmaRequest.getRmaRequestId();
    }

    /**
    * Sets the rma request ID of this rma request.
    *
    * @param rmaRequestId the rma request ID of this rma request
    */
    @Override
    public void setRmaRequestId(long rmaRequestId) {
        _rmaRequest.setRmaRequestId(rmaRequestId);
    }

    /**
    * Returns the company ID of this rma request.
    *
    * @return the company ID of this rma request
    */
    @Override
    public long getCompanyId() {
        return _rmaRequest.getCompanyId();
    }

    /**
    * Sets the company ID of this rma request.
    *
    * @param companyId the company ID of this rma request
    */
    @Override
    public void setCompanyId(long companyId) {
        _rmaRequest.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this rma request.
    *
    * @return the user ID of this rma request
    */
    @Override
    public long getUserId() {
        return _rmaRequest.getUserId();
    }

    /**
    * Sets the user ID of this rma request.
    *
    * @param userId the user ID of this rma request
    */
    @Override
    public void setUserId(long userId) {
        _rmaRequest.setUserId(userId);
    }

    /**
    * Returns the user uuid of this rma request.
    *
    * @return the user uuid of this rma request
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rmaRequest.getUserUuid();
    }

    /**
    * Sets the user uuid of this rma request.
    *
    * @param userUuid the user uuid of this rma request
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _rmaRequest.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this rma request.
    *
    * @return the user name of this rma request
    */
    @Override
    public java.lang.String getUserName() {
        return _rmaRequest.getUserName();
    }

    /**
    * Sets the user name of this rma request.
    *
    * @param userName the user name of this rma request
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _rmaRequest.setUserName(userName);
    }

    /**
    * Returns the create date of this rma request.
    *
    * @return the create date of this rma request
    */
    @Override
    public java.util.Date getCreateDate() {
        return _rmaRequest.getCreateDate();
    }

    /**
    * Sets the create date of this rma request.
    *
    * @param createDate the create date of this rma request
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _rmaRequest.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this rma request.
    *
    * @return the modified date of this rma request
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _rmaRequest.getModifiedDate();
    }

    /**
    * Sets the modified date of this rma request.
    *
    * @param modifiedDate the modified date of this rma request
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _rmaRequest.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the group ID of this rma request.
    *
    * @return the group ID of this rma request
    */
    @Override
    public long getGroupId() {
        return _rmaRequest.getGroupId();
    }

    /**
    * Sets the group ID of this rma request.
    *
    * @param groupId the group ID of this rma request
    */
    @Override
    public void setGroupId(long groupId) {
        _rmaRequest.setGroupId(groupId);
    }

    /**
    * Returns the rma request number of this rma request.
    *
    * @return the rma request number of this rma request
    */
    @Override
    public java.lang.String getRmaRequestNumber() {
        return _rmaRequest.getRmaRequestNumber();
    }

    /**
    * Sets the rma request number of this rma request.
    *
    * @param rmaRequestNumber the rma request number of this rma request
    */
    @Override
    public void setRmaRequestNumber(java.lang.String rmaRequestNumber) {
        _rmaRequest.setRmaRequestNumber(rmaRequestNumber);
    }

    /**
    * Returns the customer ID of this rma request.
    *
    * @return the customer ID of this rma request
    */
    @Override
    public java.lang.Long getCustomerId() {
        return _rmaRequest.getCustomerId();
    }

    /**
    * Sets the customer ID of this rma request.
    *
    * @param customerId the customer ID of this rma request
    */
    @Override
    public void setCustomerId(java.lang.Long customerId) {
        _rmaRequest.setCustomerId(customerId);
    }

    /**
    * Returns the cus in charge of this rma request.
    *
    * @return the cus in charge of this rma request
    */
    @Override
    public java.lang.String getCusInCharge() {
        return _rmaRequest.getCusInCharge();
    }

    /**
    * Sets the cus in charge of this rma request.
    *
    * @param cusInCharge the cus in charge of this rma request
    */
    @Override
    public void setCusInCharge(java.lang.String cusInCharge) {
        _rmaRequest.setCusInCharge(cusInCharge);
    }

    /**
    * Returns the cus email of this rma request.
    *
    * @return the cus email of this rma request
    */
    @Override
    public java.lang.String getCusEmail() {
        return _rmaRequest.getCusEmail();
    }

    /**
    * Sets the cus email of this rma request.
    *
    * @param cusEmail the cus email of this rma request
    */
    @Override
    public void setCusEmail(java.lang.String cusEmail) {
        _rmaRequest.setCusEmail(cusEmail);
    }

    /**
    * Returns the cus phone of this rma request.
    *
    * @return the cus phone of this rma request
    */
    @Override
    public java.lang.String getCusPhone() {
        return _rmaRequest.getCusPhone();
    }

    /**
    * Sets the cus phone of this rma request.
    *
    * @param cusPhone the cus phone of this rma request
    */
    @Override
    public void setCusPhone(java.lang.String cusPhone) {
        _rmaRequest.setCusPhone(cusPhone);
    }

    /**
    * Returns the cus address of this rma request.
    *
    * @return the cus address of this rma request
    */
    @Override
    public java.lang.String getCusAddress() {
        return _rmaRequest.getCusAddress();
    }

    /**
    * Sets the cus address of this rma request.
    *
    * @param cusAddress the cus address of this rma request
    */
    @Override
    public void setCusAddress(java.lang.String cusAddress) {
        _rmaRequest.setCusAddress(cusAddress);
    }

    /**
    * Returns the creating est return date of this rma request.
    *
    * @return the creating est return date of this rma request
    */
    @Override
    public java.util.Date getCreatingEstReturnDate() {
        return _rmaRequest.getCreatingEstReturnDate();
    }

    /**
    * Sets the creating est return date of this rma request.
    *
    * @param creatingEstReturnDate the creating est return date of this rma request
    */
    @Override
    public void setCreatingEstReturnDate(java.util.Date creatingEstReturnDate) {
        _rmaRequest.setCreatingEstReturnDate(creatingEstReturnDate);
    }

    /**
    * Returns the creating assigned date of this rma request.
    *
    * @return the creating assigned date of this rma request
    */
    @Override
    public java.util.Date getCreatingAssignedDate() {
        return _rmaRequest.getCreatingAssignedDate();
    }

    /**
    * Sets the creating assigned date of this rma request.
    *
    * @param creatingAssignedDate the creating assigned date of this rma request
    */
    @Override
    public void setCreatingAssignedDate(java.util.Date creatingAssignedDate) {
        _rmaRequest.setCreatingAssignedDate(creatingAssignedDate);
    }

    /**
    * Returns the creating note of this rma request.
    *
    * @return the creating note of this rma request
    */
    @Override
    public java.lang.String getCreatingNote() {
        return _rmaRequest.getCreatingNote();
    }

    /**
    * Sets the creating note of this rma request.
    *
    * @param creatingNote the creating note of this rma request
    */
    @Override
    public void setCreatingNote(java.lang.String creatingNote) {
        _rmaRequest.setCreatingNote(creatingNote);
    }

    /**
    * Returns the creating imported file name of this rma request.
    *
    * @return the creating imported file name of this rma request
    */
    @Override
    public java.lang.String getCreatingImportedFileName() {
        return _rmaRequest.getCreatingImportedFileName();
    }

    /**
    * Sets the creating imported file name of this rma request.
    *
    * @param creatingImportedFileName the creating imported file name of this rma request
    */
    @Override
    public void setCreatingImportedFileName(
        java.lang.String creatingImportedFileName) {
        _rmaRequest.setCreatingImportedFileName(creatingImportedFileName);
    }

    /**
    * Returns the status of this rma request.
    *
    * @return the status of this rma request
    */
    @Override
    public int getStatus() {
        return _rmaRequest.getStatus();
    }

    /**
    * Sets the status of this rma request.
    *
    * @param status the status of this rma request
    */
    @Override
    public void setStatus(int status) {
        _rmaRequest.setStatus(status);
    }

    @Override
    public boolean isNew() {
        return _rmaRequest.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _rmaRequest.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _rmaRequest.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _rmaRequest.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _rmaRequest.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _rmaRequest.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _rmaRequest.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _rmaRequest.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _rmaRequest.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _rmaRequest.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _rmaRequest.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new RmaRequestWrapper((RmaRequest) _rmaRequest.clone());
    }

    @Override
    public int compareTo(com.dasannetworks.vn.sb.model.RmaRequest rmaRequest) {
        return _rmaRequest.compareTo(rmaRequest);
    }

    @Override
    public int hashCode() {
        return _rmaRequest.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.dasannetworks.vn.sb.model.RmaRequest> toCacheModel() {
        return _rmaRequest.toCacheModel();
    }

    @Override
    public com.dasannetworks.vn.sb.model.RmaRequest toEscapedModel() {
        return new RmaRequestWrapper(_rmaRequest.toEscapedModel());
    }

    @Override
    public com.dasannetworks.vn.sb.model.RmaRequest toUnescapedModel() {
        return new RmaRequestWrapper(_rmaRequest.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _rmaRequest.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _rmaRequest.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _rmaRequest.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof RmaRequestWrapper)) {
            return false;
        }

        RmaRequestWrapper rmaRequestWrapper = (RmaRequestWrapper) obj;

        if (Validator.equals(_rmaRequest, rmaRequestWrapper._rmaRequest)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public RmaRequest getWrappedRmaRequest() {
        return _rmaRequest;
    }

    @Override
    public RmaRequest getWrappedModel() {
        return _rmaRequest;
    }

    @Override
    public void resetOriginalValues() {
        _rmaRequest.resetOriginalValues();
    }
}
