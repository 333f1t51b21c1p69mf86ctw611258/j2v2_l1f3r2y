package com.dasannetworks.vn.sb.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DeviceHis}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DeviceHis
 * @generated
 */
public class DeviceHisWrapper implements DeviceHis, ModelWrapper<DeviceHis> {
    private DeviceHis _deviceHis;

    public DeviceHisWrapper(DeviceHis deviceHis) {
        _deviceHis = deviceHis;
    }

    @Override
    public Class<?> getModelClass() {
        return DeviceHis.class;
    }

    @Override
    public String getModelClassName() {
        return DeviceHis.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("deviceId", getDeviceId());
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
        attributes.put("purchaseOrderId", getPurchaseOrderId());
        attributes.put("warrantyFormId", getWarrantyFormId());
        attributes.put("status", getStatus());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long deviceId = (Long) attributes.get("deviceId");

        if (deviceId != null) {
            setDeviceId(deviceId);
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

        Long purchaseOrderId = (Long) attributes.get("purchaseOrderId");

        if (purchaseOrderId != null) {
            setPurchaseOrderId(purchaseOrderId);
        }

        Long warrantyFormId = (Long) attributes.get("warrantyFormId");

        if (warrantyFormId != null) {
            setWarrantyFormId(warrantyFormId);
        }

        Integer status = (Integer) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }
    }

    /**
    * Returns the primary key of this device his.
    *
    * @return the primary key of this device his
    */
    @Override
    public long getPrimaryKey() {
        return _deviceHis.getPrimaryKey();
    }

    /**
    * Sets the primary key of this device his.
    *
    * @param primaryKey the primary key of this device his
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _deviceHis.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the device ID of this device his.
    *
    * @return the device ID of this device his
    */
    @Override
    public long getDeviceId() {
        return _deviceHis.getDeviceId();
    }

    /**
    * Sets the device ID of this device his.
    *
    * @param deviceId the device ID of this device his
    */
    @Override
    public void setDeviceId(long deviceId) {
        _deviceHis.setDeviceId(deviceId);
    }

    /**
    * Returns the group ID of this device his.
    *
    * @return the group ID of this device his
    */
    @Override
    public long getGroupId() {
        return _deviceHis.getGroupId();
    }

    /**
    * Sets the group ID of this device his.
    *
    * @param groupId the group ID of this device his
    */
    @Override
    public void setGroupId(long groupId) {
        _deviceHis.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this device his.
    *
    * @return the company ID of this device his
    */
    @Override
    public long getCompanyId() {
        return _deviceHis.getCompanyId();
    }

    /**
    * Sets the company ID of this device his.
    *
    * @param companyId the company ID of this device his
    */
    @Override
    public void setCompanyId(long companyId) {
        _deviceHis.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this device his.
    *
    * @return the user ID of this device his
    */
    @Override
    public long getUserId() {
        return _deviceHis.getUserId();
    }

    /**
    * Sets the user ID of this device his.
    *
    * @param userId the user ID of this device his
    */
    @Override
    public void setUserId(long userId) {
        _deviceHis.setUserId(userId);
    }

    /**
    * Returns the user uuid of this device his.
    *
    * @return the user uuid of this device his
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceHis.getUserUuid();
    }

    /**
    * Sets the user uuid of this device his.
    *
    * @param userUuid the user uuid of this device his
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _deviceHis.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this device his.
    *
    * @return the user name of this device his
    */
    @Override
    public java.lang.String getUserName() {
        return _deviceHis.getUserName();
    }

    /**
    * Sets the user name of this device his.
    *
    * @param userName the user name of this device his
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _deviceHis.setUserName(userName);
    }

    /**
    * Returns the create date of this device his.
    *
    * @return the create date of this device his
    */
    @Override
    public java.util.Date getCreateDate() {
        return _deviceHis.getCreateDate();
    }

    /**
    * Sets the create date of this device his.
    *
    * @param createDate the create date of this device his
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _deviceHis.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this device his.
    *
    * @return the modified date of this device his
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _deviceHis.getModifiedDate();
    }

    /**
    * Sets the modified date of this device his.
    *
    * @param modifiedDate the modified date of this device his
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _deviceHis.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the model name of this device his.
    *
    * @return the model name of this device his
    */
    @Override
    public java.lang.String getModelName() {
        return _deviceHis.getModelName();
    }

    /**
    * Sets the model name of this device his.
    *
    * @param modelName the model name of this device his
    */
    @Override
    public void setModelName(java.lang.String modelName) {
        _deviceHis.setModelName(modelName);
    }

    /**
    * Returns the serial number of this device his.
    *
    * @return the serial number of this device his
    */
    @Override
    public java.lang.String getSerialNumber() {
        return _deviceHis.getSerialNumber();
    }

    /**
    * Sets the serial number of this device his.
    *
    * @param serialNumber the serial number of this device his
    */
    @Override
    public void setSerialNumber(java.lang.String serialNumber) {
        _deviceHis.setSerialNumber(serialNumber);
    }

    /**
    * Returns the gpon serial number of this device his.
    *
    * @return the gpon serial number of this device his
    */
    @Override
    public java.lang.String getGponSerialNumber() {
        return _deviceHis.getGponSerialNumber();
    }

    /**
    * Sets the gpon serial number of this device his.
    *
    * @param gponSerialNumber the gpon serial number of this device his
    */
    @Override
    public void setGponSerialNumber(java.lang.String gponSerialNumber) {
        _deviceHis.setGponSerialNumber(gponSerialNumber);
    }

    /**
    * Returns the box serial number of this device his.
    *
    * @return the box serial number of this device his
    */
    @Override
    public java.lang.String getBoxSerialNumber() {
        return _deviceHis.getBoxSerialNumber();
    }

    /**
    * Sets the box serial number of this device his.
    *
    * @param boxSerialNumber the box serial number of this device his
    */
    @Override
    public void setBoxSerialNumber(java.lang.String boxSerialNumber) {
        _deviceHis.setBoxSerialNumber(boxSerialNumber);
    }

    /**
    * Returns the customer serial number of this device his.
    *
    * @return the customer serial number of this device his
    */
    @Override
    public java.lang.String getCustomerSerialNumber() {
        return _deviceHis.getCustomerSerialNumber();
    }

    /**
    * Sets the customer serial number of this device his.
    *
    * @param customerSerialNumber the customer serial number of this device his
    */
    @Override
    public void setCustomerSerialNumber(java.lang.String customerSerialNumber) {
        _deviceHis.setCustomerSerialNumber(customerSerialNumber);
    }

    /**
    * Returns the manufacturer serial number of this device his.
    *
    * @return the manufacturer serial number of this device his
    */
    @Override
    public java.lang.String getManufacturerSerialNumber() {
        return _deviceHis.getManufacturerSerialNumber();
    }

    /**
    * Sets the manufacturer serial number of this device his.
    *
    * @param manufacturerSerialNumber the manufacturer serial number of this device his
    */
    @Override
    public void setManufacturerSerialNumber(
        java.lang.String manufacturerSerialNumber) {
        _deviceHis.setManufacturerSerialNumber(manufacturerSerialNumber);
    }

    /**
    * Returns the hardware revision of this device his.
    *
    * @return the hardware revision of this device his
    */
    @Override
    public java.lang.String getHardwareRevision() {
        return _deviceHis.getHardwareRevision();
    }

    /**
    * Sets the hardware revision of this device his.
    *
    * @param hardwareRevision the hardware revision of this device his
    */
    @Override
    public void setHardwareRevision(java.lang.String hardwareRevision) {
        _deviceHis.setHardwareRevision(hardwareRevision);
    }

    /**
    * Returns the software revision of this device his.
    *
    * @return the software revision of this device his
    */
    @Override
    public java.lang.String getSoftwareRevision() {
        return _deviceHis.getSoftwareRevision();
    }

    /**
    * Sets the software revision of this device his.
    *
    * @param softwareRevision the software revision of this device his
    */
    @Override
    public void setSoftwareRevision(java.lang.String softwareRevision) {
        _deviceHis.setSoftwareRevision(softwareRevision);
    }

    /**
    * Returns the mac address of this device his.
    *
    * @return the mac address of this device his
    */
    @Override
    public java.lang.String getMacAddress() {
        return _deviceHis.getMacAddress();
    }

    /**
    * Sets the mac address of this device his.
    *
    * @param macAddress the mac address of this device his
    */
    @Override
    public void setMacAddress(java.lang.String macAddress) {
        _deviceHis.setMacAddress(macAddress);
    }

    /**
    * Returns the part number of this device his.
    *
    * @return the part number of this device his
    */
    @Override
    public java.lang.String getPartNumber() {
        return _deviceHis.getPartNumber();
    }

    /**
    * Sets the part number of this device his.
    *
    * @param partNumber the part number of this device his
    */
    @Override
    public void setPartNumber(java.lang.String partNumber) {
        _deviceHis.setPartNumber(partNumber);
    }

    /**
    * Returns the specification of this device his.
    *
    * @return the specification of this device his
    */
    @Override
    public java.lang.String getSpecification() {
        return _deviceHis.getSpecification();
    }

    /**
    * Sets the specification of this device his.
    *
    * @param specification the specification of this device his
    */
    @Override
    public void setSpecification(java.lang.String specification) {
        _deviceHis.setSpecification(specification);
    }

    /**
    * Returns the factory out of this device his.
    *
    * @return the factory out of this device his
    */
    @Override
    public java.util.Date getFactoryOut() {
        return _deviceHis.getFactoryOut();
    }

    /**
    * Sets the factory out of this device his.
    *
    * @param factoryOut the factory out of this device his
    */
    @Override
    public void setFactoryOut(java.util.Date factoryOut) {
        _deviceHis.setFactoryOut(factoryOut);
    }

    /**
    * Returns the purchase order ID of this device his.
    *
    * @return the purchase order ID of this device his
    */
    @Override
    public java.lang.Long getPurchaseOrderId() {
        return _deviceHis.getPurchaseOrderId();
    }

    /**
    * Sets the purchase order ID of this device his.
    *
    * @param purchaseOrderId the purchase order ID of this device his
    */
    @Override
    public void setPurchaseOrderId(java.lang.Long purchaseOrderId) {
        _deviceHis.setPurchaseOrderId(purchaseOrderId);
    }

    /**
    * Returns the warranty form ID of this device his.
    *
    * @return the warranty form ID of this device his
    */
    @Override
    public java.lang.Long getWarrantyFormId() {
        return _deviceHis.getWarrantyFormId();
    }

    /**
    * Sets the warranty form ID of this device his.
    *
    * @param warrantyFormId the warranty form ID of this device his
    */
    @Override
    public void setWarrantyFormId(java.lang.Long warrantyFormId) {
        _deviceHis.setWarrantyFormId(warrantyFormId);
    }

    /**
    * Returns the status of this device his.
    *
    * @return the status of this device his
    */
    @Override
    public int getStatus() {
        return _deviceHis.getStatus();
    }

    /**
    * Sets the status of this device his.
    *
    * @param status the status of this device his
    */
    @Override
    public void setStatus(int status) {
        _deviceHis.setStatus(status);
    }

    @Override
    public boolean isNew() {
        return _deviceHis.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _deviceHis.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _deviceHis.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _deviceHis.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _deviceHis.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _deviceHis.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _deviceHis.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _deviceHis.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _deviceHis.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _deviceHis.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _deviceHis.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new DeviceHisWrapper((DeviceHis) _deviceHis.clone());
    }

    @Override
    public int compareTo(com.dasannetworks.vn.sb.model.DeviceHis deviceHis) {
        return _deviceHis.compareTo(deviceHis);
    }

    @Override
    public int hashCode() {
        return _deviceHis.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.dasannetworks.vn.sb.model.DeviceHis> toCacheModel() {
        return _deviceHis.toCacheModel();
    }

    @Override
    public com.dasannetworks.vn.sb.model.DeviceHis toEscapedModel() {
        return new DeviceHisWrapper(_deviceHis.toEscapedModel());
    }

    @Override
    public com.dasannetworks.vn.sb.model.DeviceHis toUnescapedModel() {
        return new DeviceHisWrapper(_deviceHis.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _deviceHis.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _deviceHis.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _deviceHis.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof DeviceHisWrapper)) {
            return false;
        }

        DeviceHisWrapper deviceHisWrapper = (DeviceHisWrapper) obj;

        if (Validator.equals(_deviceHis, deviceHisWrapper._deviceHis)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public DeviceHis getWrappedDeviceHis() {
        return _deviceHis;
    }

    @Override
    public DeviceHis getWrappedModel() {
        return _deviceHis;
    }

    @Override
    public void resetOriginalValues() {
        _deviceHis.resetOriginalValues();
    }
}
