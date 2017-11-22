package com.dasannetworks.vn.sb.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link RmaReplacement}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RmaReplacement
 * @generated
 */
public class RmaReplacementWrapper implements RmaReplacement,
    ModelWrapper<RmaReplacement> {
    private RmaReplacement _rmaReplacement;

    public RmaReplacementWrapper(RmaReplacement rmaReplacement) {
        _rmaReplacement = rmaReplacement;
    }

    @Override
    public Class<?> getModelClass() {
        return RmaReplacement.class;
    }

    @Override
    public String getModelClassName() {
        return RmaReplacement.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("rmaRequestId", getRmaRequestId());
        attributes.put("replacedNumber", getReplacedNumber());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("status", getStatus());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long rmaRequestId = (Long) attributes.get("rmaRequestId");

        if (rmaRequestId != null) {
            setRmaRequestId(rmaRequestId);
        }

        String replacedNumber = (String) attributes.get("replacedNumber");

        if (replacedNumber != null) {
            setReplacedNumber(replacedNumber);
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

        Integer status = (Integer) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }
    }

    /**
    * Returns the primary key of this rma replacement.
    *
    * @return the primary key of this rma replacement
    */
    @Override
    public com.dasannetworks.vn.sb.service.persistence.RmaReplacementPK getPrimaryKey() {
        return _rmaReplacement.getPrimaryKey();
    }

    /**
    * Sets the primary key of this rma replacement.
    *
    * @param primaryKey the primary key of this rma replacement
    */
    @Override
    public void setPrimaryKey(
        com.dasannetworks.vn.sb.service.persistence.RmaReplacementPK primaryKey) {
        _rmaReplacement.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the rma request ID of this rma replacement.
    *
    * @return the rma request ID of this rma replacement
    */
    @Override
    public long getRmaRequestId() {
        return _rmaReplacement.getRmaRequestId();
    }

    /**
    * Sets the rma request ID of this rma replacement.
    *
    * @param rmaRequestId the rma request ID of this rma replacement
    */
    @Override
    public void setRmaRequestId(long rmaRequestId) {
        _rmaReplacement.setRmaRequestId(rmaRequestId);
    }

    /**
    * Returns the replaced number of this rma replacement.
    *
    * @return the replaced number of this rma replacement
    */
    @Override
    public java.lang.String getReplacedNumber() {
        return _rmaReplacement.getReplacedNumber();
    }

    /**
    * Sets the replaced number of this rma replacement.
    *
    * @param replacedNumber the replaced number of this rma replacement
    */
    @Override
    public void setReplacedNumber(java.lang.String replacedNumber) {
        _rmaReplacement.setReplacedNumber(replacedNumber);
    }

    /**
    * Returns the company ID of this rma replacement.
    *
    * @return the company ID of this rma replacement
    */
    @Override
    public long getCompanyId() {
        return _rmaReplacement.getCompanyId();
    }

    /**
    * Sets the company ID of this rma replacement.
    *
    * @param companyId the company ID of this rma replacement
    */
    @Override
    public void setCompanyId(long companyId) {
        _rmaReplacement.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this rma replacement.
    *
    * @return the user ID of this rma replacement
    */
    @Override
    public long getUserId() {
        return _rmaReplacement.getUserId();
    }

    /**
    * Sets the user ID of this rma replacement.
    *
    * @param userId the user ID of this rma replacement
    */
    @Override
    public void setUserId(long userId) {
        _rmaReplacement.setUserId(userId);
    }

    /**
    * Returns the user uuid of this rma replacement.
    *
    * @return the user uuid of this rma replacement
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rmaReplacement.getUserUuid();
    }

    /**
    * Sets the user uuid of this rma replacement.
    *
    * @param userUuid the user uuid of this rma replacement
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _rmaReplacement.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this rma replacement.
    *
    * @return the user name of this rma replacement
    */
    @Override
    public java.lang.String getUserName() {
        return _rmaReplacement.getUserName();
    }

    /**
    * Sets the user name of this rma replacement.
    *
    * @param userName the user name of this rma replacement
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _rmaReplacement.setUserName(userName);
    }

    /**
    * Returns the create date of this rma replacement.
    *
    * @return the create date of this rma replacement
    */
    @Override
    public java.util.Date getCreateDate() {
        return _rmaReplacement.getCreateDate();
    }

    /**
    * Sets the create date of this rma replacement.
    *
    * @param createDate the create date of this rma replacement
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _rmaReplacement.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this rma replacement.
    *
    * @return the modified date of this rma replacement
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _rmaReplacement.getModifiedDate();
    }

    /**
    * Sets the modified date of this rma replacement.
    *
    * @param modifiedDate the modified date of this rma replacement
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _rmaReplacement.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the status of this rma replacement.
    *
    * @return the status of this rma replacement
    */
    @Override
    public int getStatus() {
        return _rmaReplacement.getStatus();
    }

    /**
    * Sets the status of this rma replacement.
    *
    * @param status the status of this rma replacement
    */
    @Override
    public void setStatus(int status) {
        _rmaReplacement.setStatus(status);
    }

    @Override
    public boolean isNew() {
        return _rmaReplacement.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _rmaReplacement.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _rmaReplacement.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _rmaReplacement.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _rmaReplacement.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _rmaReplacement.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _rmaReplacement.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _rmaReplacement.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _rmaReplacement.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _rmaReplacement.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _rmaReplacement.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new RmaReplacementWrapper((RmaReplacement) _rmaReplacement.clone());
    }

    @Override
    public int compareTo(
        com.dasannetworks.vn.sb.model.RmaReplacement rmaReplacement) {
        return _rmaReplacement.compareTo(rmaReplacement);
    }

    @Override
    public int hashCode() {
        return _rmaReplacement.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.dasannetworks.vn.sb.model.RmaReplacement> toCacheModel() {
        return _rmaReplacement.toCacheModel();
    }

    @Override
    public com.dasannetworks.vn.sb.model.RmaReplacement toEscapedModel() {
        return new RmaReplacementWrapper(_rmaReplacement.toEscapedModel());
    }

    @Override
    public com.dasannetworks.vn.sb.model.RmaReplacement toUnescapedModel() {
        return new RmaReplacementWrapper(_rmaReplacement.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _rmaReplacement.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _rmaReplacement.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _rmaReplacement.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof RmaReplacementWrapper)) {
            return false;
        }

        RmaReplacementWrapper rmaReplacementWrapper = (RmaReplacementWrapper) obj;

        if (Validator.equals(_rmaReplacement,
                    rmaReplacementWrapper._rmaReplacement)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public RmaReplacement getWrappedRmaReplacement() {
        return _rmaReplacement;
    }

    @Override
    public RmaReplacement getWrappedModel() {
        return _rmaReplacement;
    }

    @Override
    public void resetOriginalValues() {
        _rmaReplacement.resetOriginalValues();
    }
}
