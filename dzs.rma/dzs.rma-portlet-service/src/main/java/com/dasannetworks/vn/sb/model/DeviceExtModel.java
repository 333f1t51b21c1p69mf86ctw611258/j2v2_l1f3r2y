package com.dasannetworks.vn.sb.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the DeviceExt service. Represents a row in the &quot;tms_DeviceExt&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.dasannetworks.vn.sb.model.impl.DeviceExtModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.dasannetworks.vn.sb.model.impl.DeviceExtImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DeviceExt
 * @see com.dasannetworks.vn.sb.model.impl.DeviceExtImpl
 * @see com.dasannetworks.vn.sb.model.impl.DeviceExtModelImpl
 * @generated
 */
public interface DeviceExtModel extends BaseModel<DeviceExt>, GroupedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a device ext model instance should use the {@link DeviceExt} interface instead.
     */

    /**
     * Returns the primary key of this device ext.
     *
     * @return the primary key of this device ext
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this device ext.
     *
     * @param primaryKey the primary key of this device ext
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the device ext ID of this device ext.
     *
     * @return the device ext ID of this device ext
     */
    public long getDeviceExtId();

    /**
     * Sets the device ext ID of this device ext.
     *
     * @param deviceExtId the device ext ID of this device ext
     */
    public void setDeviceExtId(long deviceExtId);

    /**
     * Returns the group ID of this device ext.
     *
     * @return the group ID of this device ext
     */
    @Override
    public long getGroupId();

    /**
     * Sets the group ID of this device ext.
     *
     * @param groupId the group ID of this device ext
     */
    @Override
    public void setGroupId(long groupId);

    /**
     * Returns the company ID of this device ext.
     *
     * @return the company ID of this device ext
     */
    @Override
    public long getCompanyId();

    /**
     * Sets the company ID of this device ext.
     *
     * @param companyId the company ID of this device ext
     */
    @Override
    public void setCompanyId(long companyId);

    /**
     * Returns the user ID of this device ext.
     *
     * @return the user ID of this device ext
     */
    @Override
    public long getUserId();

    /**
     * Sets the user ID of this device ext.
     *
     * @param userId the user ID of this device ext
     */
    @Override
    public void setUserId(long userId);

    /**
     * Returns the user uuid of this device ext.
     *
     * @return the user uuid of this device ext
     * @throws SystemException if a system exception occurred
     */
    @Override
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this device ext.
     *
     * @param userUuid the user uuid of this device ext
     */
    @Override
    public void setUserUuid(String userUuid);

    /**
     * Returns the user name of this device ext.
     *
     * @return the user name of this device ext
     */
    @AutoEscape
    @Override
    public String getUserName();

    /**
     * Sets the user name of this device ext.
     *
     * @param userName the user name of this device ext
     */
    @Override
    public void setUserName(String userName);

    /**
     * Returns the create date of this device ext.
     *
     * @return the create date of this device ext
     */
    @Override
    public Date getCreateDate();

    /**
     * Sets the create date of this device ext.
     *
     * @param createDate the create date of this device ext
     */
    @Override
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this device ext.
     *
     * @return the modified date of this device ext
     */
    @Override
    public Date getModifiedDate();

    /**
     * Sets the modified date of this device ext.
     *
     * @param modifiedDate the modified date of this device ext
     */
    @Override
    public void setModifiedDate(Date modifiedDate);

    /**
     * Returns the model name of this device ext.
     *
     * @return the model name of this device ext
     */
    @AutoEscape
    public String getModelName();

    /**
     * Sets the model name of this device ext.
     *
     * @param modelName the model name of this device ext
     */
    public void setModelName(String modelName);

    /**
     * Returns the serial number of this device ext.
     *
     * @return the serial number of this device ext
     */
    @AutoEscape
    public String getSerialNumber();

    /**
     * Sets the serial number of this device ext.
     *
     * @param serialNumber the serial number of this device ext
     */
    public void setSerialNumber(String serialNumber);

    /**
     * Returns the gpon serial number of this device ext.
     *
     * @return the gpon serial number of this device ext
     */
    @AutoEscape
    public String getGponSerialNumber();

    /**
     * Sets the gpon serial number of this device ext.
     *
     * @param gponSerialNumber the gpon serial number of this device ext
     */
    public void setGponSerialNumber(String gponSerialNumber);

    /**
     * Returns the box serial number of this device ext.
     *
     * @return the box serial number of this device ext
     */
    @AutoEscape
    public String getBoxSerialNumber();

    /**
     * Sets the box serial number of this device ext.
     *
     * @param boxSerialNumber the box serial number of this device ext
     */
    public void setBoxSerialNumber(String boxSerialNumber);

    /**
     * Returns the customer serial number of this device ext.
     *
     * @return the customer serial number of this device ext
     */
    @AutoEscape
    public String getCustomerSerialNumber();

    /**
     * Sets the customer serial number of this device ext.
     *
     * @param customerSerialNumber the customer serial number of this device ext
     */
    public void setCustomerSerialNumber(String customerSerialNumber);

    /**
     * Returns the manufacturer serial number of this device ext.
     *
     * @return the manufacturer serial number of this device ext
     */
    @AutoEscape
    public String getManufacturerSerialNumber();

    /**
     * Sets the manufacturer serial number of this device ext.
     *
     * @param manufacturerSerialNumber the manufacturer serial number of this device ext
     */
    public void setManufacturerSerialNumber(String manufacturerSerialNumber);

    /**
     * Returns the hardware revision of this device ext.
     *
     * @return the hardware revision of this device ext
     */
    @AutoEscape
    public String getHardwareRevision();

    /**
     * Sets the hardware revision of this device ext.
     *
     * @param hardwareRevision the hardware revision of this device ext
     */
    public void setHardwareRevision(String hardwareRevision);

    /**
     * Returns the software revision of this device ext.
     *
     * @return the software revision of this device ext
     */
    @AutoEscape
    public String getSoftwareRevision();

    /**
     * Sets the software revision of this device ext.
     *
     * @param softwareRevision the software revision of this device ext
     */
    public void setSoftwareRevision(String softwareRevision);

    /**
     * Returns the mac address of this device ext.
     *
     * @return the mac address of this device ext
     */
    @AutoEscape
    public String getMacAddress();

    /**
     * Sets the mac address of this device ext.
     *
     * @param macAddress the mac address of this device ext
     */
    public void setMacAddress(String macAddress);

    /**
     * Returns the part number of this device ext.
     *
     * @return the part number of this device ext
     */
    @AutoEscape
    public String getPartNumber();

    /**
     * Sets the part number of this device ext.
     *
     * @param partNumber the part number of this device ext
     */
    public void setPartNumber(String partNumber);

    /**
     * Returns the specification of this device ext.
     *
     * @return the specification of this device ext
     */
    @AutoEscape
    public String getSpecification();

    /**
     * Sets the specification of this device ext.
     *
     * @param specification the specification of this device ext
     */
    public void setSpecification(String specification);

    /**
     * Returns the factory out of this device ext.
     *
     * @return the factory out of this device ext
     */
    public Date getFactoryOut();

    /**
     * Sets the factory out of this device ext.
     *
     * @param factoryOut the factory out of this device ext
     */
    public void setFactoryOut(Date factoryOut);

    /**
     * Returns the status of this device ext.
     *
     * @return the status of this device ext
     */
    public int getStatus();

    /**
     * Sets the status of this device ext.
     *
     * @param status the status of this device ext
     */
    public void setStatus(int status);

    /**
     * Returns the ost status changed date of this device ext.
     *
     * @return the ost status changed date of this device ext
     */
    public Date getOstStatusChangedDate();

    /**
     * Sets the ost status changed date of this device ext.
     *
     * @param ostStatusChangedDate the ost status changed date of this device ext
     */
    public void setOstStatusChangedDate(Date ostStatusChangedDate);

    /**
     * Returns the device ext order ID of this device ext.
     *
     * @return the device ext order ID of this device ext
     */
    public Long getDeviceExtOrderId();

    /**
     * Sets the device ext order ID of this device ext.
     *
     * @param deviceExtOrderId the device ext order ID of this device ext
     */
    public void setDeviceExtOrderId(Long deviceExtOrderId);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(com.dasannetworks.vn.sb.model.DeviceExt deviceExt);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.dasannetworks.vn.sb.model.DeviceExt> toCacheModel();

    @Override
    public com.dasannetworks.vn.sb.model.DeviceExt toEscapedModel();

    @Override
    public com.dasannetworks.vn.sb.model.DeviceExt toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
