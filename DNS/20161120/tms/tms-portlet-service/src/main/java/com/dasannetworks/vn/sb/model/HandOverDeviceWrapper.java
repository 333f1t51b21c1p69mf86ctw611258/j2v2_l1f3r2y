package com.dasannetworks.vn.sb.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link HandOverDevice}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HandOverDevice
 * @generated
 */
public class HandOverDeviceWrapper implements HandOverDevice,
    ModelWrapper<HandOverDevice> {
    private HandOverDevice _handOverDevice;

    public HandOverDeviceWrapper(HandOverDevice handOverDevice) {
        _handOverDevice = handOverDevice;
    }

    @Override
    public Class<?> getModelClass() {
        return HandOverDevice.class;
    }

    @Override
    public String getModelClassName() {
        return HandOverDevice.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("handOverFormId", getHandOverFormId());
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
        Long handOverFormId = (Long) attributes.get("handOverFormId");

        if (handOverFormId != null) {
            setHandOverFormId(handOverFormId);
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
    * Returns the primary key of this hand over device.
    *
    * @return the primary key of this hand over device
    */
    @Override
    public com.dasannetworks.vn.sb.service.persistence.HandOverDevicePK getPrimaryKey() {
        return _handOverDevice.getPrimaryKey();
    }

    /**
    * Sets the primary key of this hand over device.
    *
    * @param primaryKey the primary key of this hand over device
    */
    @Override
    public void setPrimaryKey(
        com.dasannetworks.vn.sb.service.persistence.HandOverDevicePK primaryKey) {
        _handOverDevice.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the hand over form ID of this hand over device.
    *
    * @return the hand over form ID of this hand over device
    */
    @Override
    public long getHandOverFormId() {
        return _handOverDevice.getHandOverFormId();
    }

    /**
    * Sets the hand over form ID of this hand over device.
    *
    * @param handOverFormId the hand over form ID of this hand over device
    */
    @Override
    public void setHandOverFormId(long handOverFormId) {
        _handOverDevice.setHandOverFormId(handOverFormId);
    }

    /**
    * Returns the device ID of this hand over device.
    *
    * @return the device ID of this hand over device
    */
    @Override
    public long getDeviceId() {
        return _handOverDevice.getDeviceId();
    }

    /**
    * Sets the device ID of this hand over device.
    *
    * @param deviceId the device ID of this hand over device
    */
    @Override
    public void setDeviceId(long deviceId) {
        _handOverDevice.setDeviceId(deviceId);
    }

    /**
    * Returns the company ID of this hand over device.
    *
    * @return the company ID of this hand over device
    */
    @Override
    public long getCompanyId() {
        return _handOverDevice.getCompanyId();
    }

    /**
    * Sets the company ID of this hand over device.
    *
    * @param companyId the company ID of this hand over device
    */
    @Override
    public void setCompanyId(long companyId) {
        _handOverDevice.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this hand over device.
    *
    * @return the user ID of this hand over device
    */
    @Override
    public long getUserId() {
        return _handOverDevice.getUserId();
    }

    /**
    * Sets the user ID of this hand over device.
    *
    * @param userId the user ID of this hand over device
    */
    @Override
    public void setUserId(long userId) {
        _handOverDevice.setUserId(userId);
    }

    /**
    * Returns the user uuid of this hand over device.
    *
    * @return the user uuid of this hand over device
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _handOverDevice.getUserUuid();
    }

    /**
    * Sets the user uuid of this hand over device.
    *
    * @param userUuid the user uuid of this hand over device
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _handOverDevice.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this hand over device.
    *
    * @return the user name of this hand over device
    */
    @Override
    public java.lang.String getUserName() {
        return _handOverDevice.getUserName();
    }

    /**
    * Sets the user name of this hand over device.
    *
    * @param userName the user name of this hand over device
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _handOverDevice.setUserName(userName);
    }

    /**
    * Returns the create date of this hand over device.
    *
    * @return the create date of this hand over device
    */
    @Override
    public java.util.Date getCreateDate() {
        return _handOverDevice.getCreateDate();
    }

    /**
    * Sets the create date of this hand over device.
    *
    * @param createDate the create date of this hand over device
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _handOverDevice.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this hand over device.
    *
    * @return the modified date of this hand over device
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _handOverDevice.getModifiedDate();
    }

    /**
    * Sets the modified date of this hand over device.
    *
    * @param modifiedDate the modified date of this hand over device
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _handOverDevice.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the fault note of this hand over device.
    *
    * @return the fault note of this hand over device
    */
    @Override
    public java.lang.String getFaultNote() {
        return _handOverDevice.getFaultNote();
    }

    /**
    * Sets the fault note of this hand over device.
    *
    * @param faultNote the fault note of this hand over device
    */
    @Override
    public void setFaultNote(java.lang.String faultNote) {
        _handOverDevice.setFaultNote(faultNote);
    }

    /**
    * Returns the status of this hand over device.
    *
    * @return the status of this hand over device
    */
    @Override
    public java.lang.String getStatus() {
        return _handOverDevice.getStatus();
    }

    /**
    * Sets the status of this hand over device.
    *
    * @param status the status of this hand over device
    */
    @Override
    public void setStatus(java.lang.String status) {
        _handOverDevice.setStatus(status);
    }

    @Override
    public boolean isNew() {
        return _handOverDevice.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _handOverDevice.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _handOverDevice.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _handOverDevice.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _handOverDevice.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _handOverDevice.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _handOverDevice.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _handOverDevice.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _handOverDevice.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _handOverDevice.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _handOverDevice.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new HandOverDeviceWrapper((HandOverDevice) _handOverDevice.clone());
    }

    @Override
    public int compareTo(
        com.dasannetworks.vn.sb.model.HandOverDevice handOverDevice) {
        return _handOverDevice.compareTo(handOverDevice);
    }

    @Override
    public int hashCode() {
        return _handOverDevice.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.dasannetworks.vn.sb.model.HandOverDevice> toCacheModel() {
        return _handOverDevice.toCacheModel();
    }

    @Override
    public com.dasannetworks.vn.sb.model.HandOverDevice toEscapedModel() {
        return new HandOverDeviceWrapper(_handOverDevice.toEscapedModel());
    }

    @Override
    public com.dasannetworks.vn.sb.model.HandOverDevice toUnescapedModel() {
        return new HandOverDeviceWrapper(_handOverDevice.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _handOverDevice.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _handOverDevice.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _handOverDevice.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof HandOverDeviceWrapper)) {
            return false;
        }

        HandOverDeviceWrapper handOverDeviceWrapper = (HandOverDeviceWrapper) obj;

        if (Validator.equals(_handOverDevice,
                    handOverDeviceWrapper._handOverDevice)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public HandOverDevice getWrappedHandOverDevice() {
        return _handOverDevice;
    }

    @Override
    public HandOverDevice getWrappedModel() {
        return _handOverDevice;
    }

    @Override
    public void resetOriginalValues() {
        _handOverDevice.resetOriginalValues();
    }
}
