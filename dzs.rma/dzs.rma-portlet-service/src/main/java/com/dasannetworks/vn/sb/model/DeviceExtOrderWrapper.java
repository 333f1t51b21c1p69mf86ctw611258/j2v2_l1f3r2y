package com.dasannetworks.vn.sb.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DeviceExtOrder}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DeviceExtOrder
 * @generated
 */
public class DeviceExtOrderWrapper implements DeviceExtOrder,
    ModelWrapper<DeviceExtOrder> {
    private DeviceExtOrder _deviceExtOrder;

    public DeviceExtOrderWrapper(DeviceExtOrder deviceExtOrder) {
        _deviceExtOrder = deviceExtOrder;
    }

    @Override
    public Class<?> getModelClass() {
        return DeviceExtOrder.class;
    }

    @Override
    public String getModelClassName() {
        return DeviceExtOrder.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("deviceExtOrderId", getDeviceExtOrderId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("deviceExtOrderNumber", getDeviceExtOrderNumber());
        attributes.put("note", getNote());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long deviceExtOrderId = (Long) attributes.get("deviceExtOrderId");

        if (deviceExtOrderId != null) {
            setDeviceExtOrderId(deviceExtOrderId);
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

        String deviceExtOrderNumber = (String) attributes.get(
                "deviceExtOrderNumber");

        if (deviceExtOrderNumber != null) {
            setDeviceExtOrderNumber(deviceExtOrderNumber);
        }

        String note = (String) attributes.get("note");

        if (note != null) {
            setNote(note);
        }
    }

    /**
    * Returns the primary key of this device ext order.
    *
    * @return the primary key of this device ext order
    */
    @Override
    public long getPrimaryKey() {
        return _deviceExtOrder.getPrimaryKey();
    }

    /**
    * Sets the primary key of this device ext order.
    *
    * @param primaryKey the primary key of this device ext order
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _deviceExtOrder.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the device ext order ID of this device ext order.
    *
    * @return the device ext order ID of this device ext order
    */
    @Override
    public long getDeviceExtOrderId() {
        return _deviceExtOrder.getDeviceExtOrderId();
    }

    /**
    * Sets the device ext order ID of this device ext order.
    *
    * @param deviceExtOrderId the device ext order ID of this device ext order
    */
    @Override
    public void setDeviceExtOrderId(long deviceExtOrderId) {
        _deviceExtOrder.setDeviceExtOrderId(deviceExtOrderId);
    }

    /**
    * Returns the company ID of this device ext order.
    *
    * @return the company ID of this device ext order
    */
    @Override
    public long getCompanyId() {
        return _deviceExtOrder.getCompanyId();
    }

    /**
    * Sets the company ID of this device ext order.
    *
    * @param companyId the company ID of this device ext order
    */
    @Override
    public void setCompanyId(long companyId) {
        _deviceExtOrder.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this device ext order.
    *
    * @return the user ID of this device ext order
    */
    @Override
    public long getUserId() {
        return _deviceExtOrder.getUserId();
    }

    /**
    * Sets the user ID of this device ext order.
    *
    * @param userId the user ID of this device ext order
    */
    @Override
    public void setUserId(long userId) {
        _deviceExtOrder.setUserId(userId);
    }

    /**
    * Returns the user uuid of this device ext order.
    *
    * @return the user uuid of this device ext order
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceExtOrder.getUserUuid();
    }

    /**
    * Sets the user uuid of this device ext order.
    *
    * @param userUuid the user uuid of this device ext order
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _deviceExtOrder.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this device ext order.
    *
    * @return the user name of this device ext order
    */
    @Override
    public java.lang.String getUserName() {
        return _deviceExtOrder.getUserName();
    }

    /**
    * Sets the user name of this device ext order.
    *
    * @param userName the user name of this device ext order
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _deviceExtOrder.setUserName(userName);
    }

    /**
    * Returns the create date of this device ext order.
    *
    * @return the create date of this device ext order
    */
    @Override
    public java.util.Date getCreateDate() {
        return _deviceExtOrder.getCreateDate();
    }

    /**
    * Sets the create date of this device ext order.
    *
    * @param createDate the create date of this device ext order
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _deviceExtOrder.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this device ext order.
    *
    * @return the modified date of this device ext order
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _deviceExtOrder.getModifiedDate();
    }

    /**
    * Sets the modified date of this device ext order.
    *
    * @param modifiedDate the modified date of this device ext order
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _deviceExtOrder.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the device ext order number of this device ext order.
    *
    * @return the device ext order number of this device ext order
    */
    @Override
    public java.lang.String getDeviceExtOrderNumber() {
        return _deviceExtOrder.getDeviceExtOrderNumber();
    }

    /**
    * Sets the device ext order number of this device ext order.
    *
    * @param deviceExtOrderNumber the device ext order number of this device ext order
    */
    @Override
    public void setDeviceExtOrderNumber(java.lang.String deviceExtOrderNumber) {
        _deviceExtOrder.setDeviceExtOrderNumber(deviceExtOrderNumber);
    }

    /**
    * Returns the note of this device ext order.
    *
    * @return the note of this device ext order
    */
    @Override
    public java.lang.String getNote() {
        return _deviceExtOrder.getNote();
    }

    /**
    * Sets the note of this device ext order.
    *
    * @param note the note of this device ext order
    */
    @Override
    public void setNote(java.lang.String note) {
        _deviceExtOrder.setNote(note);
    }

    @Override
    public boolean isNew() {
        return _deviceExtOrder.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _deviceExtOrder.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _deviceExtOrder.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _deviceExtOrder.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _deviceExtOrder.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _deviceExtOrder.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _deviceExtOrder.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _deviceExtOrder.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _deviceExtOrder.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _deviceExtOrder.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _deviceExtOrder.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new DeviceExtOrderWrapper((DeviceExtOrder) _deviceExtOrder.clone());
    }

    @Override
    public int compareTo(
        com.dasannetworks.vn.sb.model.DeviceExtOrder deviceExtOrder) {
        return _deviceExtOrder.compareTo(deviceExtOrder);
    }

    @Override
    public int hashCode() {
        return _deviceExtOrder.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.dasannetworks.vn.sb.model.DeviceExtOrder> toCacheModel() {
        return _deviceExtOrder.toCacheModel();
    }

    @Override
    public com.dasannetworks.vn.sb.model.DeviceExtOrder toEscapedModel() {
        return new DeviceExtOrderWrapper(_deviceExtOrder.toEscapedModel());
    }

    @Override
    public com.dasannetworks.vn.sb.model.DeviceExtOrder toUnescapedModel() {
        return new DeviceExtOrderWrapper(_deviceExtOrder.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _deviceExtOrder.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _deviceExtOrder.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _deviceExtOrder.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof DeviceExtOrderWrapper)) {
            return false;
        }

        DeviceExtOrderWrapper deviceExtOrderWrapper = (DeviceExtOrderWrapper) obj;

        if (Validator.equals(_deviceExtOrder,
                    deviceExtOrderWrapper._deviceExtOrder)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public DeviceExtOrder getWrappedDeviceExtOrder() {
        return _deviceExtOrder;
    }

    @Override
    public DeviceExtOrder getWrappedModel() {
        return _deviceExtOrder;
    }

    @Override
    public void resetOriginalValues() {
        _deviceExtOrder.resetOriginalValues();
    }
}
