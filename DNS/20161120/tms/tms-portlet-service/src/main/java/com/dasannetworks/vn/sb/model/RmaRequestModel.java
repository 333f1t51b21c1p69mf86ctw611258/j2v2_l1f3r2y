package com.dasannetworks.vn.sb.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedGroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the RmaRequest service. Represents a row in the &quot;tms_RmaRequest&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.dasannetworks.vn.sb.model.impl.RmaRequestModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.dasannetworks.vn.sb.model.impl.RmaRequestImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RmaRequest
 * @see com.dasannetworks.vn.sb.model.impl.RmaRequestImpl
 * @see com.dasannetworks.vn.sb.model.impl.RmaRequestModelImpl
 * @generated
 */
public interface RmaRequestModel extends BaseModel<RmaRequest>,
    StagedGroupedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a rma request model instance should use the {@link RmaRequest} interface instead.
     */

    /**
     * Returns the primary key of this rma request.
     *
     * @return the primary key of this rma request
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this rma request.
     *
     * @param primaryKey the primary key of this rma request
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the uuid of this rma request.
     *
     * @return the uuid of this rma request
     */
    @AutoEscape
    @Override
    public String getUuid();

    /**
     * Sets the uuid of this rma request.
     *
     * @param uuid the uuid of this rma request
     */
    @Override
    public void setUuid(String uuid);

    /**
     * Returns the rma request ID of this rma request.
     *
     * @return the rma request ID of this rma request
     */
    public long getRmaRequestId();

    /**
     * Sets the rma request ID of this rma request.
     *
     * @param rmaRequestId the rma request ID of this rma request
     */
    public void setRmaRequestId(long rmaRequestId);

    /**
     * Returns the company ID of this rma request.
     *
     * @return the company ID of this rma request
     */
    @Override
    public long getCompanyId();

    /**
     * Sets the company ID of this rma request.
     *
     * @param companyId the company ID of this rma request
     */
    @Override
    public void setCompanyId(long companyId);

    /**
     * Returns the user ID of this rma request.
     *
     * @return the user ID of this rma request
     */
    @Override
    public long getUserId();

    /**
     * Sets the user ID of this rma request.
     *
     * @param userId the user ID of this rma request
     */
    @Override
    public void setUserId(long userId);

    /**
     * Returns the user uuid of this rma request.
     *
     * @return the user uuid of this rma request
     * @throws SystemException if a system exception occurred
     */
    @Override
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this rma request.
     *
     * @param userUuid the user uuid of this rma request
     */
    @Override
    public void setUserUuid(String userUuid);

    /**
     * Returns the user name of this rma request.
     *
     * @return the user name of this rma request
     */
    @AutoEscape
    @Override
    public String getUserName();

    /**
     * Sets the user name of this rma request.
     *
     * @param userName the user name of this rma request
     */
    @Override
    public void setUserName(String userName);

    /**
     * Returns the create date of this rma request.
     *
     * @return the create date of this rma request
     */
    @Override
    public Date getCreateDate();

    /**
     * Sets the create date of this rma request.
     *
     * @param createDate the create date of this rma request
     */
    @Override
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this rma request.
     *
     * @return the modified date of this rma request
     */
    @Override
    public Date getModifiedDate();

    /**
     * Sets the modified date of this rma request.
     *
     * @param modifiedDate the modified date of this rma request
     */
    @Override
    public void setModifiedDate(Date modifiedDate);

    /**
     * Returns the group ID of this rma request.
     *
     * @return the group ID of this rma request
     */
    @Override
    public long getGroupId();

    /**
     * Sets the group ID of this rma request.
     *
     * @param groupId the group ID of this rma request
     */
    @Override
    public void setGroupId(long groupId);

    /**
     * Returns the rma request number of this rma request.
     *
     * @return the rma request number of this rma request
     */
    @AutoEscape
    public String getRmaRequestNumber();

    /**
     * Sets the rma request number of this rma request.
     *
     * @param rmaRequestNumber the rma request number of this rma request
     */
    public void setRmaRequestNumber(String rmaRequestNumber);

    /**
     * Returns the cus code of this rma request.
     *
     * @return the cus code of this rma request
     */
    @AutoEscape
    public String getCusCode();

    /**
     * Sets the cus code of this rma request.
     *
     * @param cusCode the cus code of this rma request
     */
    public void setCusCode(String cusCode);

    /**
     * Returns the cus in charge of this rma request.
     *
     * @return the cus in charge of this rma request
     */
    @AutoEscape
    public String getCusInCharge();

    /**
     * Sets the cus in charge of this rma request.
     *
     * @param cusInCharge the cus in charge of this rma request
     */
    public void setCusInCharge(String cusInCharge);

    /**
     * Returns the cus email of this rma request.
     *
     * @return the cus email of this rma request
     */
    @AutoEscape
    public String getCusEmail();

    /**
     * Sets the cus email of this rma request.
     *
     * @param cusEmail the cus email of this rma request
     */
    public void setCusEmail(String cusEmail);

    /**
     * Returns the cus phone of this rma request.
     *
     * @return the cus phone of this rma request
     */
    @AutoEscape
    public String getCusPhone();

    /**
     * Sets the cus phone of this rma request.
     *
     * @param cusPhone the cus phone of this rma request
     */
    public void setCusPhone(String cusPhone);

    /**
     * Returns the cus location of this rma request.
     *
     * @return the cus location of this rma request
     */
    @AutoEscape
    public String getCusLocation();

    /**
     * Sets the cus location of this rma request.
     *
     * @param cusLocation the cus location of this rma request
     */
    public void setCusLocation(String cusLocation);

    /**
     * Returns the prov in charge of this rma request.
     *
     * @return the prov in charge of this rma request
     */
    @AutoEscape
    public String getProvInCharge();

    /**
     * Sets the prov in charge of this rma request.
     *
     * @param provInCharge the prov in charge of this rma request
     */
    public void setProvInCharge(String provInCharge);

    /**
     * Returns the creating est return date of this rma request.
     *
     * @return the creating est return date of this rma request
     */
    public Date getCreatingEstReturnDate();

    /**
     * Sets the creating est return date of this rma request.
     *
     * @param creatingEstReturnDate the creating est return date of this rma request
     */
    public void setCreatingEstReturnDate(Date creatingEstReturnDate);

    /**
     * Returns the creating returned date of this rma request.
     *
     * @return the creating returned date of this rma request
     */
    public Date getCreatingReturnedDate();

    /**
     * Sets the creating returned date of this rma request.
     *
     * @param creatingReturnedDate the creating returned date of this rma request
     */
    public void setCreatingReturnedDate(Date creatingReturnedDate);

    /**
     * Returns the creating assigned date of this rma request.
     *
     * @return the creating assigned date of this rma request
     */
    public Date getCreatingAssignedDate();

    /**
     * Sets the creating assigned date of this rma request.
     *
     * @param creatingAssignedDate the creating assigned date of this rma request
     */
    public void setCreatingAssignedDate(Date creatingAssignedDate);

    /**
     * Returns the creating note of this rma request.
     *
     * @return the creating note of this rma request
     */
    @AutoEscape
    public String getCreatingNote();

    /**
     * Sets the creating note of this rma request.
     *
     * @param creatingNote the creating note of this rma request
     */
    public void setCreatingNote(String creatingNote);

    /**
     * Returns the partner code of this rma request.
     *
     * @return the partner code of this rma request
     */
    @AutoEscape
    public String getPartnerCode();

    /**
     * Sets the partner code of this rma request.
     *
     * @param partnerCode the partner code of this rma request
     */
    public void setPartnerCode(String partnerCode);

    /**
     * Returns the partner in charge of this rma request.
     *
     * @return the partner in charge of this rma request
     */
    @AutoEscape
    public String getPartnerInCharge();

    /**
     * Sets the partner in charge of this rma request.
     *
     * @param partnerInCharge the partner in charge of this rma request
     */
    public void setPartnerInCharge(String partnerInCharge);

    /**
     * Returns the partner email of this rma request.
     *
     * @return the partner email of this rma request
     */
    @AutoEscape
    public String getPartnerEmail();

    /**
     * Sets the partner email of this rma request.
     *
     * @param partnerEmail the partner email of this rma request
     */
    public void setPartnerEmail(String partnerEmail);

    /**
     * Returns the partner phone of this rma request.
     *
     * @return the partner phone of this rma request
     */
    @AutoEscape
    public String getPartnerPhone();

    /**
     * Sets the partner phone of this rma request.
     *
     * @param partnerPhone the partner phone of this rma request
     */
    public void setPartnerPhone(String partnerPhone);

    /**
     * Returns the partner location of this rma request.
     *
     * @return the partner location of this rma request
     */
    @AutoEscape
    public String getPartnerLocation();

    /**
     * Sets the partner location of this rma request.
     *
     * @param partnerLocation the partner location of this rma request
     */
    public void setPartnerLocation(String partnerLocation);

    /**
     * Returns the sending est return date of this rma request.
     *
     * @return the sending est return date of this rma request
     */
    public Date getSendingEstReturnDate();

    /**
     * Sets the sending est return date of this rma request.
     *
     * @param sendingEstReturnDate the sending est return date of this rma request
     */
    public void setSendingEstReturnDate(Date sendingEstReturnDate);

    /**
     * Returns the sending returned date of this rma request.
     *
     * @return the sending returned date of this rma request
     */
    public Date getSendingReturnedDate();

    /**
     * Sets the sending returned date of this rma request.
     *
     * @param sendingReturnedDate the sending returned date of this rma request
     */
    public void setSendingReturnedDate(Date sendingReturnedDate);

    /**
     * Returns the sending assigned date of this rma request.
     *
     * @return the sending assigned date of this rma request
     */
    public Date getSendingAssignedDate();

    /**
     * Sets the sending assigned date of this rma request.
     *
     * @param sendingAssignedDate the sending assigned date of this rma request
     */
    public void setSendingAssignedDate(Date sendingAssignedDate);

    /**
     * Returns the sending note of this rma request.
     *
     * @return the sending note of this rma request
     */
    @AutoEscape
    public String getSendingNote();

    /**
     * Sets the sending note of this rma request.
     *
     * @param sendingNote the sending note of this rma request
     */
    public void setSendingNote(String sendingNote);

    /**
     * Returns the receiving returned date of this rma request.
     *
     * @return the receiving returned date of this rma request
     */
    public Date getReceivingReturnedDate();

    /**
     * Sets the receiving returned date of this rma request.
     *
     * @param receivingReturnedDate the receiving returned date of this rma request
     */
    public void setReceivingReturnedDate(Date receivingReturnedDate);

    /**
     * Returns the receiving note of this rma request.
     *
     * @return the receiving note of this rma request
     */
    @AutoEscape
    public String getReceivingNote();

    /**
     * Sets the receiving note of this rma request.
     *
     * @param receivingNote the receiving note of this rma request
     */
    public void setReceivingNote(String receivingNote);

    /**
     * Returns the returning returned date of this rma request.
     *
     * @return the returning returned date of this rma request
     */
    public Date getReturningReturnedDate();

    /**
     * Sets the returning returned date of this rma request.
     *
     * @param returningReturnedDate the returning returned date of this rma request
     */
    public void setReturningReturnedDate(Date returningReturnedDate);

    /**
     * Returns the returning note of this rma request.
     *
     * @return the returning note of this rma request
     */
    @AutoEscape
    public String getReturningNote();

    /**
     * Sets the returning note of this rma request.
     *
     * @param returningNote the returning note of this rma request
     */
    public void setReturningNote(String returningNote);

    /**
     * Returns the status of this rma request.
     *
     * @return the status of this rma request
     */
    public int getStatus();

    /**
     * Sets the status of this rma request.
     *
     * @param status the status of this rma request
     */
    public void setStatus(int status);

    /**
     * Returns the status by user ID of this rma request.
     *
     * @return the status by user ID of this rma request
     */
    public long getStatusByUserId();

    /**
     * Sets the status by user ID of this rma request.
     *
     * @param statusByUserId the status by user ID of this rma request
     */
    public void setStatusByUserId(long statusByUserId);

    /**
     * Returns the status by user uuid of this rma request.
     *
     * @return the status by user uuid of this rma request
     * @throws SystemException if a system exception occurred
     */
    public String getStatusByUserUuid() throws SystemException;

    /**
     * Sets the status by user uuid of this rma request.
     *
     * @param statusByUserUuid the status by user uuid of this rma request
     */
    public void setStatusByUserUuid(String statusByUserUuid);

    /**
     * Returns the status date of this rma request.
     *
     * @return the status date of this rma request
     */
    public Date getStatusDate();

    /**
     * Sets the status date of this rma request.
     *
     * @param statusDate the status date of this rma request
     */
    public void setStatusDate(Date statusDate);

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
    public int compareTo(com.dasannetworks.vn.sb.model.RmaRequest rmaRequest);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.dasannetworks.vn.sb.model.RmaRequest> toCacheModel();

    @Override
    public com.dasannetworks.vn.sb.model.RmaRequest toEscapedModel();

    @Override
    public com.dasannetworks.vn.sb.model.RmaRequest toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
