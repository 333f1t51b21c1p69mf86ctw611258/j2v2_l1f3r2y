package com.dasannetworks.vn.sb.model;

import com.dasannetworks.vn.sb.service.persistence.RmaReplacementPK;

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
 * The base model interface for the RmaReplacement service. Represents a row in the &quot;tms_RmaReplacement&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.dasannetworks.vn.sb.model.impl.RmaReplacementModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.dasannetworks.vn.sb.model.impl.RmaReplacementImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RmaReplacement
 * @see com.dasannetworks.vn.sb.model.impl.RmaReplacementImpl
 * @see com.dasannetworks.vn.sb.model.impl.RmaReplacementModelImpl
 * @generated
 */
public interface RmaReplacementModel extends AuditedModel,
    BaseModel<RmaReplacement> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a rma replacement model instance should use the {@link RmaReplacement} interface instead.
     */

    /**
     * Returns the primary key of this rma replacement.
     *
     * @return the primary key of this rma replacement
     */
    public RmaReplacementPK getPrimaryKey();

    /**
     * Sets the primary key of this rma replacement.
     *
     * @param primaryKey the primary key of this rma replacement
     */
    public void setPrimaryKey(RmaReplacementPK primaryKey);

    /**
     * Returns the rma request ID of this rma replacement.
     *
     * @return the rma request ID of this rma replacement
     */
    public long getRmaRequestId();

    /**
     * Sets the rma request ID of this rma replacement.
     *
     * @param rmaRequestId the rma request ID of this rma replacement
     */
    public void setRmaRequestId(long rmaRequestId);

    /**
     * Returns the replaced number of this rma replacement.
     *
     * @return the replaced number of this rma replacement
     */
    @AutoEscape
    public String getReplacedNumber();

    /**
     * Sets the replaced number of this rma replacement.
     *
     * @param replacedNumber the replaced number of this rma replacement
     */
    public void setReplacedNumber(String replacedNumber);

    /**
     * Returns the company ID of this rma replacement.
     *
     * @return the company ID of this rma replacement
     */
    @Override
    public long getCompanyId();

    /**
     * Sets the company ID of this rma replacement.
     *
     * @param companyId the company ID of this rma replacement
     */
    @Override
    public void setCompanyId(long companyId);

    /**
     * Returns the user ID of this rma replacement.
     *
     * @return the user ID of this rma replacement
     */
    @Override
    public long getUserId();

    /**
     * Sets the user ID of this rma replacement.
     *
     * @param userId the user ID of this rma replacement
     */
    @Override
    public void setUserId(long userId);

    /**
     * Returns the user uuid of this rma replacement.
     *
     * @return the user uuid of this rma replacement
     * @throws SystemException if a system exception occurred
     */
    @Override
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this rma replacement.
     *
     * @param userUuid the user uuid of this rma replacement
     */
    @Override
    public void setUserUuid(String userUuid);

    /**
     * Returns the user name of this rma replacement.
     *
     * @return the user name of this rma replacement
     */
    @AutoEscape
    @Override
    public String getUserName();

    /**
     * Sets the user name of this rma replacement.
     *
     * @param userName the user name of this rma replacement
     */
    @Override
    public void setUserName(String userName);

    /**
     * Returns the create date of this rma replacement.
     *
     * @return the create date of this rma replacement
     */
    @Override
    public Date getCreateDate();

    /**
     * Sets the create date of this rma replacement.
     *
     * @param createDate the create date of this rma replacement
     */
    @Override
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this rma replacement.
     *
     * @return the modified date of this rma replacement
     */
    @Override
    public Date getModifiedDate();

    /**
     * Sets the modified date of this rma replacement.
     *
     * @param modifiedDate the modified date of this rma replacement
     */
    @Override
    public void setModifiedDate(Date modifiedDate);

    /**
     * Returns the status of this rma replacement.
     *
     * @return the status of this rma replacement
     */
    public int getStatus();

    /**
     * Sets the status of this rma replacement.
     *
     * @param status the status of this rma replacement
     */
    public void setStatus(int status);

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
        com.dasannetworks.vn.sb.model.RmaReplacement rmaReplacement);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.dasannetworks.vn.sb.model.RmaReplacement> toCacheModel();

    @Override
    public com.dasannetworks.vn.sb.model.RmaReplacement toEscapedModel();

    @Override
    public com.dasannetworks.vn.sb.model.RmaReplacement toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
