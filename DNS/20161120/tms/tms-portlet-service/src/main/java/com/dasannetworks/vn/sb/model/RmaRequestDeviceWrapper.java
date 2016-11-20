package com.dasannetworks.vn.sb.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link RmaRequestDevice}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RmaRequestDevice
 * @generated
 */
public class RmaRequestDeviceWrapper implements RmaRequestDevice,
    ModelWrapper<RmaRequestDevice> {
    private RmaRequestDevice _rmaRequestDevice;

    public RmaRequestDeviceWrapper(RmaRequestDevice rmaRequestDevice) {
        _rmaRequestDevice = rmaRequestDevice;
    }

    @Override
    public Class<?> getModelClass() {
        return RmaRequestDevice.class;
    }

    @Override
    public String getModelClassName() {
        return RmaRequestDevice.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("rmaRequestId", getRmaRequestId());
        attributes.put("deviceId", getDeviceId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("faultNote", getFaultNote());
        attributes.put("status", getStatus());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long rmaRequestId = (Long) attributes.get("rmaRequestId");

        if (rmaRequestId != null) {
            setRmaRequestId(rmaRequestId);
        }

        Long deviceId = (Long) attributes.get("deviceId");

        if (deviceId != null) {
            setDeviceId(deviceId);
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

        String faultNote = (String) attributes.get("faultNote");

        if (faultNote != null) {
            setFaultNote(faultNote);
        }

        String status = (String) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }
    }

    /**
    * Returns the primary key of this rma request device.
    *
    * @return the primary key of this rma request device
    */
    @Override
    public com.dasannetworks.vn.sb.service.persistence.RmaRequestDevicePK getPrimaryKey() {
        return _rmaRequestDevice.getPrimaryKey();
    }

    /**
    * Sets the primary key of this rma request device.
    *
    * @param primaryKey the primary key of this rma request device
    */
    @Override
    public void setPrimaryKey(
        com.dasannetworks.vn.sb.service.persistence.RmaRequestDevicePK primaryKey) {
        _rmaRequestDevice.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the rma request ID of this rma request device.
    *
    * @return the rma request ID of this rma request device
    */
    @Override
    public long getRmaRequestId() {
        return _rmaRequestDevice.getRmaRequestId();
    }

    /**
    * Sets the rma request ID of this rma request device.
    *
    * @param rmaRequestId the rma request ID of this rma request device
    */
    @Override
    public void setRmaRequestId(long rmaRequestId) {
        _rmaRequestDevice.setRmaRequestId(rmaRequestId);
    }

    /**
    * Returns the device ID of this rma request device.
    *
    * @return the device ID of this rma request device
    */
    @Override
    public long getDeviceId() {
        return _rmaRequestDevice.getDeviceId();
    }

    /**
    * Sets the device ID of this rma request device.
    *
    * @param deviceId the device ID of this rma request device
    */
    @Override
    public void setDeviceId(long deviceId) {
        _rmaRequestDevice.setDeviceId(deviceId);
    }

    /**
    * Returns the company ID of this rma request device.
    *
    * @return the company ID of this rma request device
    */
    @Override
    public long getCompanyId() {
        return _rmaRequestDevice.getCompanyId();
    }

    /**
    * Sets the company ID of this rma request device.
    *
    * @param companyId the company ID of this rma request device
    */
    @Override
    public void setCompanyId(long companyId) {
        _rmaRequestDevice.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this rma request device.
    *
    * @return the user ID of this rma request device
    */
    @Override
    public long getUserId() {
        return _rmaRequestDevice.getUserId();
    }

    /**
    * Sets the user ID of this rma request device.
    *
    * @param userId the user ID of this rma request device
    */
    @Override
    public void setUserId(long userId) {
        _rmaRequestDevice.setUserId(userId);
    }

    /**
    * Returns the user uuid of this rma request device.
    *
    * @return the user uuid of this rma request device
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rmaRequestDevice.getUserUuid();
    }

    /**
    * Sets the user uuid of this rma request device.
    *
    * @param userUuid the user uuid of this rma request device
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _rmaRequestDevice.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this rma request device.
    *
    * @return the user name of this rma request device
    */
    @Override
    public java.lang.String getUserName() {
        return _rmaRequestDevice.getUserName();
    }

    /**
    * Sets the user name of this rma request device.
    *
    * @param userName the user name of this rma request device
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _rmaRequestDevice.setUserName(userName);
    }

    /**
    * Returns the create date of this rma request device.
    *
    * @return the create date of this rma request device
    */
    @Override
    public java.util.Date getCreateDate() {
        return _rmaRequestDevice.getCreateDate();
    }

    /**
    * Sets the create date of this rma request device.
    *
    * @param createDate the create date of this rma request device
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _rmaRequestDevice.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this rma request device.
    *
    * @return the modified date of this rma request device
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _rmaRequestDevice.getModifiedDate();
    }

    /**
    * Sets the modified date of this rma request device.
    *
    * @param modifiedDate the modified date of this rma request device
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _rmaRequestDevice.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the fault note of this rma request device.
    *
    * @return the fault note of this rma request device
    */
    @Override
    public java.lang.String getFaultNote() {
        return _rmaRequestDevice.getFaultNote();
    }

    /**
    * Sets the fault note of this rma request device.
    *
    * @param faultNote the fault note of this rma request device
    */
    @Override
    public void setFaultNote(java.lang.String faultNote) {
        _rmaRequestDevice.setFaultNote(faultNote);
    }

    /**
    * Returns the status of this rma request device.
    *
    * @return the status of this rma request device
    */
    @Override
    public java.lang.String getStatus() {
        return _rmaRequestDevice.getStatus();
    }

    /**
    * Sets the status of this rma request device.
    *
    * @param status the status of this rma request device
    */
    @Override
    public void setStatus(java.lang.String status) {
        _rmaRequestDevice.setStatus(status);
    }

    @Override
    public boolean isNew() {
        return _rmaRequestDevice.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _rmaRequestDevice.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _rmaRequestDevice.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _rmaRequestDevice.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _rmaRequestDevice.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _rmaRequestDevice.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _rmaRequestDevice.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _rmaRequestDevice.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _rmaRequestDevice.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _rmaRequestDevice.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _rmaRequestDevice.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new RmaRequestDeviceWrapper((RmaRequestDevice) _rmaRequestDevice.clone());
    }

    @Override
    public int compareTo(
        com.dasannetworks.vn.sb.model.RmaRequestDevice rmaRequestDevice) {
        return _rmaRequestDevice.compareTo(rmaRequestDevice);
    }

    @Override
    public int hashCode() {
        return _rmaRequestDevice.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.dasannetworks.vn.sb.model.RmaRequestDevice> toCacheModel() {
        return _rmaRequestDevice.toCacheModel();
    }

    @Override
    public com.dasannetworks.vn.sb.model.RmaRequestDevice toEscapedModel() {
        return new RmaRequestDeviceWrapper(_rmaRequestDevice.toEscapedModel());
    }

    @Override
    public com.dasannetworks.vn.sb.model.RmaRequestDevice toUnescapedModel() {
        return new RmaRequestDeviceWrapper(_rmaRequestDevice.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _rmaRequestDevice.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _rmaRequestDevice.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _rmaRequestDevice.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof RmaRequestDeviceWrapper)) {
            return false;
        }

        RmaRequestDeviceWrapper rmaRequestDeviceWrapper = (RmaRequestDeviceWrapper) obj;

        if (Validator.equals(_rmaRequestDevice,
                    rmaRequestDeviceWrapper._rmaRequestDevice)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public RmaRequestDevice getWrappedRmaRequestDevice() {
        return _rmaRequestDevice;
    }

    @Override
    public RmaRequestDevice getWrappedModel() {
        return _rmaRequestDevice;
    }

    @Override
    public void resetOriginalValues() {
        _rmaRequestDevice.resetOriginalValues();
    }
}
