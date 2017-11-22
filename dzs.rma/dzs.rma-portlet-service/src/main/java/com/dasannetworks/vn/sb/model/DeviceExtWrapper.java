package com.dasannetworks.vn.sb.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DeviceExt}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DeviceExt
 * @generated
 */
public class DeviceExtWrapper implements DeviceExt, ModelWrapper<DeviceExt> {
    private DeviceExt _deviceExt;

    public DeviceExtWrapper(DeviceExt deviceExt) {
        _deviceExt = deviceExt;
    }

    @Override
    public Class<?> getModelClass() {
        return DeviceExt.class;
    }

    @Override
    public String getModelClassName() {
        return DeviceExt.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("deviceExtId", getDeviceExtId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("modelName", getModelName());
        attributes.put("serialNumber", getSerialNumber());
        attributes.put("gponSerialNumber", getGponSerialNumber());
        attributes.put("boxSerialNumber", getBoxSerialNumber());
        attributes.put("customerSerialNumber", getCustomerSerialNumber());
        attributes.put("manufacturerSerialNumber", getManufacturerSerialNumber());
        attributes.put("hardwareRevision", getHardwareRevision());
        attributes.put("softwareRevision", getSoftwareRevision());
        attributes.put("macAddress", getMacAddress());
        attributes.put("partNumber", getPartNumber());
        attributes.put("specification", getSpecification());
        attributes.put("factoryOut", getFactoryOut());
        attributes.put("status", getStatus());
        attributes.put("ostStatusChangedDate", getOstStatusChangedDate());
        attributes.put("deviceExtOrderId", getDeviceExtOrderId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long deviceExtId = (Long) attributes.get("deviceExtId");

        if (deviceExtId != null) {
            setDeviceExtId(deviceExtId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
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

        String modelName = (String) attributes.get("modelName");

        if (modelName != null) {
            setModelName(modelName);
        }

        String serialNumber = (String) attributes.get("serialNumber");

        if (serialNumber != null) {
            setSerialNumber(serialNumber);
        }

        String gponSerialNumber = (String) attributes.get("gponSerialNumber");

        if (gponSerialNumber != null) {
            setGponSerialNumber(gponSerialNumber);
        }

        String boxSerialNumber = (String) attributes.get("boxSerialNumber");

        if (boxSerialNumber != null) {
            setBoxSerialNumber(boxSerialNumber);
        }

        String customerSerialNumber = (String) attributes.get(
                "customerSerialNumber");

        if (customerSerialNumber != null) {
            setCustomerSerialNumber(customerSerialNumber);
        }

        String manufacturerSerialNumber = (String) attributes.get(
                "manufacturerSerialNumber");

        if (manufacturerSerialNumber != null) {
            setManufacturerSerialNumber(manufacturerSerialNumber);
        }

        String hardwareRevision = (String) attributes.get("hardwareRevision");

        if (hardwareRevision != null) {
            setHardwareRevision(hardwareRevision);
        }

        String softwareRevision = (String) attributes.get("softwareRevision");

        if (softwareRevision != null) {
            setSoftwareRevision(softwareRevision);
        }

        String macAddress = (String) attributes.get("macAddress");

        if (macAddress != null) {
            setMacAddress(macAddress);
        }

        String partNumber = (String) attributes.get("partNumber");

        if (partNumber != null) {
            setPartNumber(partNumber);
        }

        String specification = (String) attributes.get("specification");

        if (specification != null) {
            setSpecification(specification);
        }

        Date factoryOut = (Date) attributes.get("factoryOut");

        if (factoryOut != null) {
            setFactoryOut(factoryOut);
        }

        Integer status = (Integer) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }

        Date ostStatusChangedDate = (Date) attributes.get(
                "ostStatusChangedDate");

        if (ostStatusChangedDate != null) {
            setOstStatusChangedDate(ostStatusChangedDate);
        }

        Long deviceExtOrderId = (Long) attributes.get("deviceExtOrderId");

        if (deviceExtOrderId != null) {
            setDeviceExtOrderId(deviceExtOrderId);
        }
    }

    /**
    * Returns the primary key of this device ext.
    *
    * @return the primary key of this device ext
    */
    @Override
    public long getPrimaryKey() {
        return _deviceExt.getPrimaryKey();
    }

    /**
    * Sets the primary key of this device ext.
    *
    * @param primaryKey the primary key of this device ext
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _deviceExt.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the device ext ID of this device ext.
    *
    * @return the device ext ID of this device ext
    */
    @Override
    public long getDeviceExtId() {
        return _deviceExt.getDeviceExtId();
    }

    /**
    * Sets the device ext ID of this device ext.
    *
    * @param deviceExtId the device ext ID of this device ext
    */
    @Override
    public void setDeviceExtId(long deviceExtId) {
        _deviceExt.setDeviceExtId(deviceExtId);
    }

    /**
    * Returns the group ID of this device ext.
    *
    * @return the group ID of this device ext
    */
    @Override
    public long getGroupId() {
        return _deviceExt.getGroupId();
    }

    /**
    * Sets the group ID of this device ext.
    *
    * @param groupId the group ID of this device ext
    */
    @Override
    public void setGroupId(long groupId) {
        _deviceExt.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this device ext.
    *
    * @return the company ID of this device ext
    */
    @Override
    public long getCompanyId() {
        return _deviceExt.getCompanyId();
    }

    /**
    * Sets the company ID of this device ext.
    *
    * @param companyId the company ID of this device ext
    */
    @Override
    public void setCompanyId(long companyId) {
        _deviceExt.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this device ext.
    *
    * @return the user ID of this device ext
    */
    @Override
    public long getUserId() {
        return _deviceExt.getUserId();
    }

    /**
    * Sets the user ID of this device ext.
    *
    * @param userId the user ID of this device ext
    */
    @Override
    public void setUserId(long userId) {
        _deviceExt.setUserId(userId);
    }

    /**
    * Returns the user uuid of this device ext.
    *
    * @return the user uuid of this device ext
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceExt.getUserUuid();
    }

    /**
    * Sets the user uuid of this device ext.
    *
    * @param userUuid the user uuid of this device ext
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _deviceExt.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this device ext.
    *
    * @return the user name of this device ext
    */
    @Override
    public java.lang.String getUserName() {
        return _deviceExt.getUserName();
    }

    /**
    * Sets the user name of this device ext.
    *
    * @param userName the user name of this device ext
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _deviceExt.setUserName(userName);
    }

    /**
    * Returns the create date of this device ext.
    *
    * @return the create date of this device ext
    */
    @Override
    public java.util.Date getCreateDate() {
        return _deviceExt.getCreateDate();
    }

    /**
    * Sets the create date of this device ext.
    *
    * @param createDate the create date of this device ext
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _deviceExt.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this device ext.
    *
    * @return the modified date of this device ext
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _deviceExt.getModifiedDate();
    }

    /**
    * Sets the modified date of this device ext.
    *
    * @param modifiedDate the modified date of this device ext
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _deviceExt.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the model name of this device ext.
    *
    * @return the model name of this device ext
    */
    @Override
    public java.lang.String getModelName() {
        return _deviceExt.getModelName();
    }

    /**
    * Sets the model name of this device ext.
    *
    * @param modelName the model name of this device ext
    */
    @Override
    public void setModelName(java.lang.String modelName) {
        _deviceExt.setModelName(modelName);
    }

    /**
    * Returns the serial number of this device ext.
    *
    * @return the serial number of this device ext
    */
    @Override
    public java.lang.String getSerialNumber() {
        return _deviceExt.getSerialNumber();
    }

    /**
    * Sets the serial number of this device ext.
    *
    * @param serialNumber the serial number of this device ext
    */
    @Override
    public void setSerialNumber(java.lang.String serialNumber) {
        _deviceExt.setSerialNumber(serialNumber);
    }

    /**
    * Returns the gpon serial number of this device ext.
    *
    * @return the gpon serial number of this device ext
    */
    @Override
    public java.lang.String getGponSerialNumber() {
        return _deviceExt.getGponSerialNumber();
    }

    /**
    * Sets the gpon serial number of this device ext.
    *
    * @param gponSerialNumber the gpon serial number of this device ext
    */
    @Override
    public void setGponSerialNumber(java.lang.String gponSerialNumber) {
        _deviceExt.setGponSerialNumber(gponSerialNumber);
    }

    /**
    * Returns the box serial number of this device ext.
    *
    * @return the box serial number of this device ext
    */
    @Override
    public java.lang.String getBoxSerialNumber() {
        return _deviceExt.getBoxSerialNumber();
    }

    /**
    * Sets the box serial number of this device ext.
    *
    * @param boxSerialNumber the box serial number of this device ext
    */
    @Override
    public void setBoxSerialNumber(java.lang.String boxSerialNumber) {
        _deviceExt.setBoxSerialNumber(boxSerialNumber);
    }

    /**
    * Returns the customer serial number of this device ext.
    *
    * @return the customer serial number of this device ext
    */
    @Override
    public java.lang.String getCustomerSerialNumber() {
        return _deviceExt.getCustomerSerialNumber();
    }

    /**
    * Sets the customer serial number of this device ext.
    *
    * @param customerSerialNumber the customer serial number of this device ext
    */
    @Override
    public void setCustomerSerialNumber(java.lang.String customerSerialNumber) {
        _deviceExt.setCustomerSerialNumber(customerSerialNumber);
    }

    /**
    * Returns the manufacturer serial number of this device ext.
    *
    * @return the manufacturer serial number of this device ext
    */
    @Override
    public java.lang.String getManufacturerSerialNumber() {
        return _deviceExt.getManufacturerSerialNumber();
    }

    /**
    * Sets the manufacturer serial number of this device ext.
    *
    * @param manufacturerSerialNumber the manufacturer serial number of this device ext
    */
    @Override
    public void setManufacturerSerialNumber(
        java.lang.String manufacturerSerialNumber) {
        _deviceExt.setManufacturerSerialNumber(manufacturerSerialNumber);
    }

    /**
    * Returns the hardware revision of this device ext.
    *
    * @return the hardware revision of this device ext
    */
    @Override
    public java.lang.String getHardwareRevision() {
        return _deviceExt.getHardwareRevision();
    }

    /**
    * Sets the hardware revision of this device ext.
    *
    * @param hardwareRevision the hardware revision of this device ext
    */
    @Override
    public void setHardwareRevision(java.lang.String hardwareRevision) {
        _deviceExt.setHardwareRevision(hardwareRevision);
    }

    /**
    * Returns the software revision of this device ext.
    *
    * @return the software revision of this device ext
    */
    @Override
    public java.lang.String getSoftwareRevision() {
        return _deviceExt.getSoftwareRevision();
    }

    /**
    * Sets the software revision of this device ext.
    *
    * @param softwareRevision the software revision of this device ext
    */
    @Override
    public void setSoftwareRevision(java.lang.String softwareRevision) {
        _deviceExt.setSoftwareRevision(softwareRevision);
    }

    /**
    * Returns the mac address of this device ext.
    *
    * @return the mac address of this device ext
    */
    @Override
    public java.lang.String getMacAddress() {
        return _deviceExt.getMacAddress();
    }

    /**
    * Sets the mac address of this device ext.
    *
    * @param macAddress the mac address of this device ext
    */
    @Override
    public void setMacAddress(java.lang.String macAddress) {
        _deviceExt.setMacAddress(macAddress);
    }

    /**
    * Returns the part number of this device ext.
    *
    * @return the part number of this device ext
    */
    @Override
    public java.lang.String getPartNumber() {
        return _deviceExt.getPartNumber();
    }

    /**
    * Sets the part number of this device ext.
    *
    * @param partNumber the part number of this device ext
    */
    @Override
    public void setPartNumber(java.lang.String partNumber) {
        _deviceExt.setPartNumber(partNumber);
    }

    /**
    * Returns the specification of this device ext.
    *
    * @return the specification of this device ext
    */
    @Override
    public java.lang.String getSpecification() {
        return _deviceExt.getSpecification();
    }

    /**
    * Sets the specification of this device ext.
    *
    * @param specification the specification of this device ext
    */
    @Override
    public void setSpecification(java.lang.String specification) {
        _deviceExt.setSpecification(specification);
    }

    /**
    * Returns the factory out of this device ext.
    *
    * @return the factory out of this device ext
    */
    @Override
    public java.util.Date getFactoryOut() {
        return _deviceExt.getFactoryOut();
    }

    /**
    * Sets the factory out of this device ext.
    *
    * @param factoryOut the factory out of this device ext
    */
    @Override
    public void setFactoryOut(java.util.Date factoryOut) {
        _deviceExt.setFactoryOut(factoryOut);
    }

    /**
    * Returns the status of this device ext.
    *
    * @return the status of this device ext
    */
    @Override
    public int getStatus() {
        return _deviceExt.getStatus();
    }

    /**
    * Sets the status of this device ext.
    *
    * @param status the status of this device ext
    */
    @Override
    public void setStatus(int status) {
        _deviceExt.setStatus(status);
    }

    /**
    * Returns the ost status changed date of this device ext.
    *
    * @return the ost status changed date of this device ext
    */
    @Override
    public java.util.Date getOstStatusChangedDate() {
        return _deviceExt.getOstStatusChangedDate();
    }

    /**
    * Sets the ost status changed date of this device ext.
    *
    * @param ostStatusChangedDate the ost status changed date of this device ext
    */
    @Override
    public void setOstStatusChangedDate(java.util.Date ostStatusChangedDate) {
        _deviceExt.setOstStatusChangedDate(ostStatusChangedDate);
    }

    /**
    * Returns the device ext order ID of this device ext.
    *
    * @return the device ext order ID of this device ext
    */
    @Override
    public java.lang.Long getDeviceExtOrderId() {
        return _deviceExt.getDeviceExtOrderId();
    }

    /**
    * Sets the device ext order ID of this device ext.
    *
    * @param deviceExtOrderId the device ext order ID of this device ext
    */
    @Override
    public void setDeviceExtOrderId(java.lang.Long deviceExtOrderId) {
        _deviceExt.setDeviceExtOrderId(deviceExtOrderId);
    }

    @Override
    public boolean isNew() {
        return _deviceExt.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _deviceExt.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _deviceExt.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _deviceExt.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _deviceExt.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _deviceExt.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _deviceExt.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _deviceExt.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _deviceExt.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _deviceExt.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _deviceExt.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new DeviceExtWrapper((DeviceExt) _deviceExt.clone());
    }

    @Override
    public int compareTo(com.dasannetworks.vn.sb.model.DeviceExt deviceExt) {
        return _deviceExt.compareTo(deviceExt);
    }

    @Override
    public int hashCode() {
        return _deviceExt.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.dasannetworks.vn.sb.model.DeviceExt> toCacheModel() {
        return _deviceExt.toCacheModel();
    }

    @Override
    public com.dasannetworks.vn.sb.model.DeviceExt toEscapedModel() {
        return new DeviceExtWrapper(_deviceExt.toEscapedModel());
    }

    @Override
    public com.dasannetworks.vn.sb.model.DeviceExt toUnescapedModel() {
        return new DeviceExtWrapper(_deviceExt.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _deviceExt.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _deviceExt.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _deviceExt.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof DeviceExtWrapper)) {
            return false;
        }

        DeviceExtWrapper deviceExtWrapper = (DeviceExtWrapper) obj;

        if (Validator.equals(_deviceExt, deviceExtWrapper._deviceExt)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public DeviceExt getWrappedDeviceExt() {
        return _deviceExt;
    }

    @Override
    public DeviceExt getWrappedModel() {
        return _deviceExt;
    }

    @Override
    public void resetOriginalValues() {
        _deviceExt.resetOriginalValues();
    }
}
