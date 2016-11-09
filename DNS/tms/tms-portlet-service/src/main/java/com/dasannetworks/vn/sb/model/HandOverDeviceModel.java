package com.dasannetworks.vn.sb.model;

import com.dasannetworks.vn.sb.service.persistence.HandOverDevicePK;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.AuditedModel;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the HandOverDevice service. Represents a row in the &quot;tms_HandOverDevice&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.dasannetworks.vn.sb.model.impl.HandOverDeviceModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.dasannetworks.vn.sb.model.impl.HandOverDeviceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HandOverDevice
 * @see com.dasannetworks.vn.sb.model.impl.HandOverDeviceImpl
 * @see com.dasannetworks.vn.sb.model.impl.HandOverDeviceModelImpl
 * @generated
 */
public interface HandOverDeviceModel extends AuditedModel,
    BaseModel<HandOverDevice> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a hand over device model instance should use the {@link HandOverDevice} interface instead.
     */

    /**
     * Returns the primary key of this hand over device.
     *
     * @return the primary key of this hand over device
     */
    public HandOverDevicePK getPrimaryKey();

    /**
     * Sets the primary key of this hand over device.
     *
     * @param primaryKey the primary key of this hand over device
     */
    public void setPrimaryKey(HandOverDevicePK primaryKey);

    /**
     * Returns the hand over form ID of this hand over device.
     *
     * @return the hand over form ID of this hand over device
     */
    public long getHandOverFormId();

    /**
     * Sets the hand over form ID of this hand over device.
     *
     * @param handOverFormId the hand over form ID of this hand over device
     */
    public void setHandOverFormId(long handOverFormId);

    /**
     * Returns the device ID of this hand over device.
     *
     * @return the device ID of this hand over device
     */
    public long getDeviceId();

    /**
     * Sets the device ID of this hand over device.
     *
     * @param deviceId the device ID of this hand over device
     */
    public void setDeviceId(long deviceId);

    /**
     * Returns the company ID of this hand over device.
     *
     * @return the company ID of this hand over device
     */
    @Override
    public long getCompanyId();

    /**
     * Sets the company ID of this hand over device.
     *
     * @param companyId the company ID of this hand over device
     */
    @Override
    public void setCompanyId(long companyId);

    /**
     * Returns the user ID of this hand over device.
     *
     * @return the user ID of this hand over device
     */
    @Override
    public long getUserId();

    /**
     * Sets the user ID of this hand over device.
     *
     * @param userId the user ID of this hand over device
     */
    @Override
    public void setUserId(long userId);

    /**
     * Returns the user uuid of this hand over device.
     *
     * @return the user uuid of this hand over device
     * @throws SystemException if a system exception occurred
     */
    @Override
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this hand over device.
     *
     * @param userUuid the user uuid of this hand over device
     */
    @Override
    public void setUserUuid(String userUuid);

    /**
     * Returns the user name of this hand over device.
     *
     * @return the user name of this hand over device
     */
    @AutoEscape
    @Override
    public String getUserName();

    /**
     * Sets the user name of this hand over device.
     *
     * @param userName the user name of this hand over device
     */
    @Override
    public void setUserName(String userName);

    /**
     * Returns the create date of this hand over device.
     *
     * @return the create date of this hand over device
     */
    @Override
    public Date getCreateDate();

    /**
     * Sets the create date of this hand over device.
     *
     * @param createDate the create date of this hand over device
     */
    @Override
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this hand over device.
     *
     * @return the modified date of this hand over device
     */
    @Override
    public Date getModifiedDate();

    /**
     * Sets the modified date of this hand over device.
     *
     * @param modifiedDate the modified date of this hand over device
     */
    @Override
    public void setModifiedDate(Date modifiedDate);

    /**
     * Returns the fault note of this hand over device.
     *
     * @return the fault note of this hand over device
     */
    @AutoEscape
    public String getFaultNote();

    /**
     * Sets the fault note of this hand over device.
     *
     * @param faultNote the fault note of this hand over device
     */
    public void setFaultNote(String faultNote);

    /**
     * Returns the status of this hand over device.
     *
     * @return the status of this hand over device
     */
    @AutoEscape
    public String getStatus();

    /**
     * Sets the status of this hand over device.
     *
     * @param status the status of this hand over device
     */
    public void setStatus(String status);

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
    public int compareTo(
        com.dasannetworks.vn.sb.model.HandOverDevice handOverDevice);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.dasannetworks.vn.sb.model.HandOverDevice> toCacheModel();

    @Override
    public com.dasannetworks.vn.sb.model.HandOverDevice toEscapedModel();

    @Override
    public com.dasannetworks.vn.sb.model.HandOverDevice toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}