package com.dasannetworks.vn.sb.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DeviceExtHis}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DeviceExtHis
 * @generated
 */
public class DeviceExtHisWrapper implements DeviceExtHis,
    ModelWrapper<DeviceExtHis> {
    private DeviceExtHis _deviceExtHis;

    public DeviceExtHisWrapper(DeviceExtHis deviceExtHis) {
        _deviceExtHis = deviceExtHis;
    }

    @Override
    public Class<?> getModelClass() {
        return DeviceExtHis.class;
    }

    @Override
    public String getModelClassName() {
        return DeviceExtHis.class.getName();
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
    * Returns the primary key of this device ext his.
    *
    * @return the primary key of this device ext his
    */
    @Override
    public long getPrimaryKey() {
        return _deviceExtHis.getPrimaryKey();
    }

    /**
    * Sets the primary key of this device ext his.
    *
    * @param primaryKey the primary key of this device ext his
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _deviceExtHis.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the device ext ID of this device ext his.
    *
    * @return the device ext ID of this device ext his
    */
    @Override
    public long getDeviceExtId() {
        return _deviceExtHis.getDeviceExtId();
    }

    /**
    * Sets the device ext ID of this device ext his.
    *
    * @param deviceExtId the device ext ID of this device ext his
    */
    @Override
    public void setDeviceExtId(long deviceExtId) {
        _deviceExtHis.setDeviceExtId(deviceExtId);
    }

    /**
    * Returns the group ID of this device ext his.
    *
    * @return the group ID of this device ext his
    */
    @Override
    public long getGroupId() {
        return _deviceExtHis.getGroupId();
    }

    /**
    * Sets the group ID of this device ext his.
    *
    * @param groupId the group ID of this device ext his
    */
    @Override
    public void setGroupId(long groupId) {
        _deviceExtHis.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this device ext his.
    *
    * @return the company ID of this device ext his
    */
    @Override
    public long getCompanyId() {
        return _deviceExtHis.getCompanyId();
    }

    /**
    * Sets the company ID of this device ext his.
    *
    * @param companyId the company ID of this device ext his
    */
    @Override
    public void setCompanyId(long companyId) {
        _deviceExtHis.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this device ext his.
    *
    * @return the user ID of this device ext his
    */
    @Override
    public long getUserId() {
        return _deviceExtHis.getUserId();
    }

    /**
    * Sets the user ID of this device ext his.
    *
    * @param userId the user ID of this device ext his
    */
    @Override
    public void setUserId(long userId) {
        _deviceExtHis.setUserId(userId);
    }

    /**
    * Returns the user uuid of this device ext his.
    *
    * @return the user uuid of this device ext his
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceExtHis.getUserUuid();
    }

    /**
    * Sets the user uuid of this device ext his.
    *
    * @param userUuid the user uuid of this device ext his
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _deviceExtHis.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this device ext his.
    *
    * @return the user name of this device ext his
    */
    @Override
    public java.lang.String getUserName() {
        return _deviceExtHis.getUserName();
    }

    /**
    * Sets the user name of this device ext his.
    *
    * @param userName the user name of this device ext his
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _deviceExtHis.setUserName(userName);
    }

    /**
    * Returns the create date of this device ext his.
    *
    * @return the create date of this device ext his
    */
    @Override
    public java.util.Date getCreateDate() {
        return _deviceExtHis.getCreateDate();
    }

    /**
    * Sets the create date of this device ext his.
    *
    * @param createDate the create date of this device ext his
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _deviceExtHis.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this device ext his.
    *
    * @return the modified date of this device ext his
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _deviceExtHis.getModifiedDate();
    }

    /**
    * Sets the modified date of this device ext his.
    *
    * @param modifiedDate the modified date of this device ext his
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _deviceExtHis.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the model name of this device ext his.
    *
    * @return the model name of this device ext his
    */
    @Override
    public java.lang.String getModelName() {
        return _deviceExtHis.getModelName();
    }

    /**
    * Sets the model name of this device ext his.
    *
    * @param modelName the model name of this device ext his
    */
    @Override
    public void setModelName(java.lang.String modelName) {
        _deviceExtHis.setModelName(modelName);
    }

    /**
    * Returns the serial number of this device ext his.
    *
    * @return the serial number of this device ext his
    */
    @Override
    public java.lang.String getSerialNumber() {
        return _deviceExtHis.getSerialNumber();
    }

    /**
    * Sets the serial number of this device ext his.
    *
    * @param serialNumber the serial number of this device ext his
    */
    @Override
    public void setSerialNumber(java.lang.String serialNumber) {
        _deviceExtHis.setSerialNumber(serialNumber);
    }

    /**
    * Returns the gpon serial number of this device ext his.
    *
    * @return the gpon serial number of this device ext his
    */
    @Override
    public java.lang.String getGponSerialNumber() {
        return _deviceExtHis.getGponSerialNumber();
    }

    /**
    * Sets the gpon serial number of this device ext his.
    *
    * @param gponSerialNumber the gpon serial number of this device ext his
    */
    @Override
    public void setGponSerialNumber(java.lang.String gponSerialNumber) {
        _deviceExtHis.setGponSerialNumber(gponSerialNumber);
    }

    /**
    * Returns the box serial number of this device ext his.
    *
    * @return the box serial number of this device ext his
    */
    @Override
    public java.lang.String getBoxSerialNumber() {
        return _deviceExtHis.getBoxSerialNumber();
    }

    /**
    * Sets the box serial number of this device ext his.
    *
    * @param boxSerialNumber the box serial number of this device ext his
    */
    @Override
    public void setBoxSerialNumber(java.lang.String boxSerialNumber) {
        _deviceExtHis.setBoxSerialNumber(boxSerialNumber);
    }

    /**
    * Returns the customer serial number of this device ext his.
    *
    * @return the customer serial number of this device ext his
    */
    @Override
    public java.lang.String getCustomerSerialNumber() {
        return _deviceExtHis.getCustomerSerialNumber();
    }

    /**
    * Sets the customer serial number of this device ext his.
    *
    * @param customerSerialNumber the customer serial number of this device ext his
    */
    @Override
    public void setCustomerSerialNumber(java.lang.String customerSerialNumber) {
        _deviceExtHis.setCustomerSerialNumber(customerSerialNumber);
    }

    /**
    * Returns the manufacturer serial number of this device ext his.
    *
    * @return the manufacturer serial number of this device ext his
    */
    @Override
    public java.lang.String getManufacturerSerialNumber() {
        return _deviceExtHis.getManufacturerSerialNumber();
    }

    /**
    * Sets the manufacturer serial number of this device ext his.
    *
    * @param manufacturerSerialNumber the manufacturer serial number of this device ext his
    */
    @Override
    public void setManufacturerSerialNumber(
        java.lang.String manufacturerSerialNumber) {
        _deviceExtHis.setManufacturerSerialNumber(manufacturerSerialNumber);
    }

    /**
    * Returns the hardware revision of this device ext his.
    *
    * @return the hardware revision of this device ext his
    */
    @Override
    public java.lang.String getHardwareRevision() {
        return _deviceExtHis.getHardwareRevision();
    }

    /**
    * Sets the hardware revision of this device ext his.
    *
    * @param hardwareRevision the hardware revision of this device ext his
    */
    @Override
    public void setHardwareRevision(java.lang.String hardwareRevision) {
        _deviceExtHis.setHardwareRevision(hardwareRevision);
    }

    /**
    * Returns the software revision of this device ext his.
    *
    * @return the software revision of this device ext his
    */
    @Override
    public java.lang.String getSoftwareRevision() {
        return _deviceExtHis.getSoftwareRevision();
    }

    /**
    * Sets the software revision of this device ext his.
    *
    * @param softwareRevision the software revision of this device ext his
    */
    @Override
    public void setSoftwareRevision(java.lang.String softwareRevision) {
        _deviceExtHis.setSoftwareRevision(softwareRevision);
    }

    /**
    * Returns the mac address of this device ext his.
    *
    * @return the mac address of this device ext his
    */
    @Override
    public java.lang.String getMacAddress() {
        return _deviceExtHis.getMacAddress();
    }

    /**
    * Sets the mac address of this device ext his.
    *
    * @param macAddress the mac address of this device ext his
    */
    @Override
    public void setMacAddress(java.lang.String macAddress) {
        _deviceExtHis.setMacAddress(macAddress);
    }

    /**
    * Returns the part number of this device ext his.
    *
    * @return the part number of this device ext his
    */
    @Override
    public java.lang.String getPartNumber() {
        return _deviceExtHis.getPartNumber();
    }

    /**
    * Sets the part number of this device ext his.
    *
    * @param partNumber the part number of this device ext his
    */
    @Override
    public void setPartNumber(java.lang.String partNumber) {
        _deviceExtHis.setPartNumber(partNumber);
    }

    /**
    * Returns the specification of this device ext his.
    *
    * @return the specification of this device ext his
    */
    @Override
    public java.lang.String getSpecification() {
        return _deviceExtHis.getSpecification();
    }

    /**
    * Sets the specification of this device ext his.
    *
    * @param specification the specification of this device ext his
    */
    @Override
    public void setSpecification(java.lang.String specification) {
        _deviceExtHis.setSpecification(specification);
    }

    /**
    * Returns the factory out of this device ext his.
    *
    * @return the factory out of this device ext his
    */
    @Override
    public java.util.Date getFactoryOut() {
        return _deviceExtHis.getFactoryOut();
    }

    /**
    * Sets the factory out of this device ext his.
    *
    * @param factoryOut the factory out of this device ext his
    */
    @Override
    public void setFactoryOut(java.util.Date factoryOut) {
        _deviceExtHis.setFactoryOut(factoryOut);
    }

    /**
    * Returns the status of this device ext his.
    *
    * @return the status of this device ext his
    */
    @Override
    public int getStatus() {
        return _deviceExtHis.getStatus();
    }

    /**
    * Sets the status of this device ext his.
    *
    * @param status the status of this device ext his
    */
    @Override
    public void setStatus(int status) {
        _deviceExtHis.setStatus(status);
    }

    /**
    * Returns the ost status changed date of this device ext his.
    *
    * @return the ost status changed date of this device ext his
    */
    @Override
    public java.util.Date getOstStatusChangedDate() {
        return _deviceExtHis.getOstStatusChangedDate();
    }

    /**
    * Sets the ost status changed date of this device ext his.
    *
    * @param ostStatusChangedDate the ost status changed date of this device ext his
    */
    @Override
    public void setOstStatusChangedDate(java.util.Date ostStatusChangedDate) {
        _deviceExtHis.setOstStatusChangedDate(ostStatusChangedDate);
    }

    /**
    * Returns the device ext order ID of this device ext his.
    *
    * @return the device ext order ID of this device ext his
    */
    @Override
    public java.lang.Long getDeviceExtOrderId() {
        return _deviceExtHis.getDeviceExtOrderId();
    }

    /**
    * Sets the device ext order ID of this device ext his.
    *
    * @param deviceExtOrderId the device ext order ID of this device ext his
    */
    @Override
    public void setDeviceExtOrderId(java.lang.Long deviceExtOrderId) {
        _deviceExtHis.setDeviceExtOrderId(deviceExtOrderId);
    }

    @Override
    public boolean isNew() {
        return _deviceExtHis.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _deviceExtHis.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _deviceExtHis.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _deviceExtHis.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _deviceExtHis.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _deviceExtHis.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _deviceExtHis.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _deviceExtHis.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _deviceExtHis.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _deviceExtHis.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _deviceExtHis.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new DeviceExtHisWrapper((DeviceExtHis) _deviceExtHis.clone());
    }

    @Override
    public int compareTo(
        com.dasannetworks.vn.sb.model.DeviceExtHis deviceExtHis) {
        return _deviceExtHis.compareTo(deviceExtHis);
    }

    @Override
    public int hashCode() {
        return _deviceExtHis.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.dasannetworks.vn.sb.model.DeviceExtHis> toCacheModel() {
        return _deviceExtHis.toCacheModel();
    }

    @Override
    public com.dasannetworks.vn.sb.model.DeviceExtHis toEscapedModel() {
        return new DeviceExtHisWrapper(_deviceExtHis.toEscapedModel());
    }

    @Override
    public com.dasannetworks.vn.sb.model.DeviceExtHis toUnescapedModel() {
        return new DeviceExtHisWrapper(_deviceExtHis.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _deviceExtHis.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _deviceExtHis.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _deviceExtHis.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof DeviceExtHisWrapper)) {
            return false;
        }

        DeviceExtHisWrapper deviceExtHisWrapper = (DeviceExtHisWrapper) obj;

        if (Validator.equals(_deviceExtHis, deviceExtHisWrapper._deviceExtHis)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public DeviceExtHis getWrappedDeviceExtHis() {
        return _deviceExtHis;
    }

    @Override
    public DeviceExtHis getWrappedModel() {
        return _deviceExtHis;
    }

    @Override
    public void resetOriginalValues() {
        _deviceExtHis.resetOriginalValues();
    }
}
