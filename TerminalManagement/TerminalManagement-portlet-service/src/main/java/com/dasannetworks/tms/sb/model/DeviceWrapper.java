package com.dasannetworks.tms.sb.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Device}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Device
 * @generated
 */
public class DeviceWrapper implements Device, ModelWrapper<Device> {
    private Device _device;

    public DeviceWrapper(Device device) {
        _device = device;
    }

    @Override
    public Class<?> getModelClass() {
        return Device.class;
    }

    @Override
    public String getModelClassName() {
        return Device.class.getName();
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
        attributes.put("modelname", getModelname());
        attributes.put("serialNumber", getSerialNumber());
        attributes.put("hardwareRevision", getHardwareRevision());
        attributes.put("softwareRevision", getSoftwareRevision());
        attributes.put("manufactureSerial", getManufactureSerial());
        attributes.put("macAddress", getMacAddress());
        attributes.put("partNumber", getPartNumber());
        attributes.put("specification", getSpecification());
        attributes.put("factoryOut", getFactoryOut());
        attributes.put("uploadFileId", getUploadFileId());

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

        String modelname = (String) attributes.get("modelname");

        if (modelname != null) {
            setModelname(modelname);
        }

        String serialNumber = (String) attributes.get("serialNumber");

        if (serialNumber != null) {
            setSerialNumber(serialNumber);
        }

        String hardwareRevision = (String) attributes.get("hardwareRevision");

        if (hardwareRevision != null) {
            setHardwareRevision(hardwareRevision);
        }

        String softwareRevision = (String) attributes.get("softwareRevision");

        if (softwareRevision != null) {
            setSoftwareRevision(softwareRevision);
        }

        String manufactureSerial = (String) attributes.get("manufactureSerial");

        if (manufactureSerial != null) {
            setManufactureSerial(manufactureSerial);
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

        Long uploadFileId = (Long) attributes.get("uploadFileId");

        if (uploadFileId != null) {
            setUploadFileId(uploadFileId);
        }
    }

    /**
    * Returns the primary key of this device.
    *
    * @return the primary key of this device
    */
    @Override
    public long getPrimaryKey() {
        return _device.getPrimaryKey();
    }

    /**
    * Sets the primary key of this device.
    *
    * @param primaryKey the primary key of this device
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _device.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the device ID of this device.
    *
    * @return the device ID of this device
    */
    @Override
    public long getDeviceId() {
        return _device.getDeviceId();
    }

    /**
    * Sets the device ID of this device.
    *
    * @param deviceId the device ID of this device
    */
    @Override
    public void setDeviceId(long deviceId) {
        _device.setDeviceId(deviceId);
    }

    /**
    * Returns the group ID of this device.
    *
    * @return the group ID of this device
    */
    @Override
    public long getGroupId() {
        return _device.getGroupId();
    }

    /**
    * Sets the group ID of this device.
    *
    * @param groupId the group ID of this device
    */
    @Override
    public void setGroupId(long groupId) {
        _device.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this device.
    *
    * @return the company ID of this device
    */
    @Override
    public long getCompanyId() {
        return _device.getCompanyId();
    }

    /**
    * Sets the company ID of this device.
    *
    * @param companyId the company ID of this device
    */
    @Override
    public void setCompanyId(long companyId) {
        _device.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this device.
    *
    * @return the user ID of this device
    */
    @Override
    public long getUserId() {
        return _device.getUserId();
    }

    /**
    * Sets the user ID of this device.
    *
    * @param userId the user ID of this device
    */
    @Override
    public void setUserId(long userId) {
        _device.setUserId(userId);
    }

    /**
    * Returns the user uuid of this device.
    *
    * @return the user uuid of this device
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _device.getUserUuid();
    }

    /**
    * Sets the user uuid of this device.
    *
    * @param userUuid the user uuid of this device
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _device.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this device.
    *
    * @return the user name of this device
    */
    @Override
    public java.lang.String getUserName() {
        return _device.getUserName();
    }

    /**
    * Sets the user name of this device.
    *
    * @param userName the user name of this device
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _device.setUserName(userName);
    }

    /**
    * Returns the create date of this device.
    *
    * @return the create date of this device
    */
    @Override
    public java.util.Date getCreateDate() {
        return _device.getCreateDate();
    }

    /**
    * Sets the create date of this device.
    *
    * @param createDate the create date of this device
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _device.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this device.
    *
    * @return the modified date of this device
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _device.getModifiedDate();
    }

    /**
    * Sets the modified date of this device.
    *
    * @param modifiedDate the modified date of this device
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _device.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the modelname of this device.
    *
    * @return the modelname of this device
    */
    @Override
    public java.lang.String getModelname() {
        return _device.getModelname();
    }

    /**
    * Sets the modelname of this device.
    *
    * @param modelname the modelname of this device
    */
    @Override
    public void setModelname(java.lang.String modelname) {
        _device.setModelname(modelname);
    }

    /**
    * Returns the serial number of this device.
    *
    * @return the serial number of this device
    */
    @Override
    public java.lang.String getSerialNumber() {
        return _device.getSerialNumber();
    }

    /**
    * Sets the serial number of this device.
    *
    * @param serialNumber the serial number of this device
    */
    @Override
    public void setSerialNumber(java.lang.String serialNumber) {
        _device.setSerialNumber(serialNumber);
    }

    /**
    * Returns the hardware revision of this device.
    *
    * @return the hardware revision of this device
    */
    @Override
    public java.lang.String getHardwareRevision() {
        return _device.getHardwareRevision();
    }

    /**
    * Sets the hardware revision of this device.
    *
    * @param hardwareRevision the hardware revision of this device
    */
    @Override
    public void setHardwareRevision(java.lang.String hardwareRevision) {
        _device.setHardwareRevision(hardwareRevision);
    }

    /**
    * Returns the software revision of this device.
    *
    * @return the software revision of this device
    */
    @Override
    public java.lang.String getSoftwareRevision() {
        return _device.getSoftwareRevision();
    }

    /**
    * Sets the software revision of this device.
    *
    * @param softwareRevision the software revision of this device
    */
    @Override
    public void setSoftwareRevision(java.lang.String softwareRevision) {
        _device.setSoftwareRevision(softwareRevision);
    }

    /**
    * Returns the manufacture serial of this device.
    *
    * @return the manufacture serial of this device
    */
    @Override
    public java.lang.String getManufactureSerial() {
        return _device.getManufactureSerial();
    }

    /**
    * Sets the manufacture serial of this device.
    *
    * @param manufactureSerial the manufacture serial of this device
    */
    @Override
    public void setManufactureSerial(java.lang.String manufactureSerial) {
        _device.setManufactureSerial(manufactureSerial);
    }

    /**
    * Returns the mac address of this device.
    *
    * @return the mac address of this device
    */
    @Override
    public java.lang.String getMacAddress() {
        return _device.getMacAddress();
    }

    /**
    * Sets the mac address of this device.
    *
    * @param macAddress the mac address of this device
    */
    @Override
    public void setMacAddress(java.lang.String macAddress) {
        _device.setMacAddress(macAddress);
    }

    /**
    * Returns the part number of this device.
    *
    * @return the part number of this device
    */
    @Override
    public java.lang.String getPartNumber() {
        return _device.getPartNumber();
    }

    /**
    * Sets the part number of this device.
    *
    * @param partNumber the part number of this device
    */
    @Override
    public void setPartNumber(java.lang.String partNumber) {
        _device.setPartNumber(partNumber);
    }

    /**
    * Returns the specification of this device.
    *
    * @return the specification of this device
    */
    @Override
    public java.lang.String getSpecification() {
        return _device.getSpecification();
    }

    /**
    * Sets the specification of this device.
    *
    * @param specification the specification of this device
    */
    @Override
    public void setSpecification(java.lang.String specification) {
        _device.setSpecification(specification);
    }

    /**
    * Returns the factory out of this device.
    *
    * @return the factory out of this device
    */
    @Override
    public java.util.Date getFactoryOut() {
        return _device.getFactoryOut();
    }

    /**
    * Sets the factory out of this device.
    *
    * @param factoryOut the factory out of this device
    */
    @Override
    public void setFactoryOut(java.util.Date factoryOut) {
        _device.setFactoryOut(factoryOut);
    }

    /**
    * Returns the upload file ID of this device.
    *
    * @return the upload file ID of this device
    */
    @Override
    public long getUploadFileId() {
        return _device.getUploadFileId();
    }

    /**
    * Sets the upload file ID of this device.
    *
    * @param uploadFileId the upload file ID of this device
    */
    @Override
    public void setUploadFileId(long uploadFileId) {
        _device.setUploadFileId(uploadFileId);
    }

    @Override
    public boolean isNew() {
        return _device.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _device.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _device.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _device.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _device.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _device.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _device.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _device.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _device.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _device.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _device.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new DeviceWrapper((Device) _device.clone());
    }

    @Override
    public int compareTo(com.dasannetworks.tms.sb.model.Device device) {
        return _device.compareTo(device);
    }

    @Override
    public int hashCode() {
        return _device.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.dasannetworks.tms.sb.model.Device> toCacheModel() {
        return _device.toCacheModel();
    }

    @Override
    public com.dasannetworks.tms.sb.model.Device toEscapedModel() {
        return new DeviceWrapper(_device.toEscapedModel());
    }

    @Override
    public com.dasannetworks.tms.sb.model.Device toUnescapedModel() {
        return new DeviceWrapper(_device.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _device.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _device.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _device.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof DeviceWrapper)) {
            return false;
        }

        DeviceWrapper deviceWrapper = (DeviceWrapper) obj;

        if (Validator.equals(_device, deviceWrapper._device)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Device getWrappedDevice() {
        return _device;
    }

    @Override
    public Device getWrappedModel() {
        return _device;
    }

    @Override
    public void resetOriginalValues() {
        _device.resetOriginalValues();
    }
}
