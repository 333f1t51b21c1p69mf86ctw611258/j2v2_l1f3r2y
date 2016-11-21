package com.dasannetworks.vn.sb.model;

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link RmaRequest}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RmaRequest
 * @generated
 */
public class RmaRequestWrapper implements RmaRequest, ModelWrapper<RmaRequest> {
    private RmaRequest _rmaRequest;

    public RmaRequestWrapper(RmaRequest rmaRequest) {
        _rmaRequest = rmaRequest;
    }

    @Override
    public Class<?> getModelClass() {
        return RmaRequest.class;
    }

    @Override
    public String getModelClassName() {
        return RmaRequest.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("rmaRequestId", getRmaRequestId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("groupId", getGroupId());
        attributes.put("rmaRequestNumber", getRmaRequestNumber());
        attributes.put("cusCode", getCusCode());
        attributes.put("cusInCharge", getCusInCharge());
        attributes.put("cusEmail", getCusEmail());
        attributes.put("cusPhone", getCusPhone());
        attributes.put("cusLocation", getCusLocation());
        attributes.put("provInCharge", getProvInCharge());
        attributes.put("creatingEstReturnDate", getCreatingEstReturnDate());
        attributes.put("creatingReturnedDate", getCreatingReturnedDate());
        attributes.put("creatingAssignedDate", getCreatingAssignedDate());
        attributes.put("creatingNote", getCreatingNote());
        attributes.put("partnerCode", getPartnerCode());
        attributes.put("partnerInCharge", getPartnerInCharge());
        attributes.put("partnerEmail", getPartnerEmail());
        attributes.put("partnerPhone", getPartnerPhone());
        attributes.put("partnerLocation", getPartnerLocation());
        attributes.put("sendingEstReturnDate", getSendingEstReturnDate());
        attributes.put("sendingReturnedDate", getSendingReturnedDate());
        attributes.put("sendingAssignedDate", getSendingAssignedDate());
        attributes.put("sendingNote", getSendingNote());
        attributes.put("receivingReturnedDate", getReceivingReturnedDate());
        attributes.put("receivingNote", getReceivingNote());
        attributes.put("returningReturnedDate", getReturningReturnedDate());
        attributes.put("returningNote", getReturningNote());
        attributes.put("status", getStatus());
        attributes.put("statusByUserId", getStatusByUserId());
        attributes.put("statusDate", getStatusDate());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long rmaRequestId = (Long) attributes.get("rmaRequestId");

        if (rmaRequestId != null) {
            setRmaRequestId(rmaRequestId);
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

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        String rmaRequestNumber = (String) attributes.get("rmaRequestNumber");

        if (rmaRequestNumber != null) {
            setRmaRequestNumber(rmaRequestNumber);
        }

        String cusCode = (String) attributes.get("cusCode");

        if (cusCode != null) {
            setCusCode(cusCode);
        }

        String cusInCharge = (String) attributes.get("cusInCharge");

        if (cusInCharge != null) {
            setCusInCharge(cusInCharge);
        }

        String cusEmail = (String) attributes.get("cusEmail");

        if (cusEmail != null) {
            setCusEmail(cusEmail);
        }

        String cusPhone = (String) attributes.get("cusPhone");

        if (cusPhone != null) {
            setCusPhone(cusPhone);
        }

        String cusLocation = (String) attributes.get("cusLocation");

        if (cusLocation != null) {
            setCusLocation(cusLocation);
        }

        String provInCharge = (String) attributes.get("provInCharge");

        if (provInCharge != null) {
            setProvInCharge(provInCharge);
        }

        Date creatingEstReturnDate = (Date) attributes.get(
                "creatingEstReturnDate");

        if (creatingEstReturnDate != null) {
            setCreatingEstReturnDate(creatingEstReturnDate);
        }

        Date creatingReturnedDate = (Date) attributes.get(
                "creatingReturnedDate");

        if (creatingReturnedDate != null) {
            setCreatingReturnedDate(creatingReturnedDate);
        }

        Date creatingAssignedDate = (Date) attributes.get(
                "creatingAssignedDate");

        if (creatingAssignedDate != null) {
            setCreatingAssignedDate(creatingAssignedDate);
        }

        String creatingNote = (String) attributes.get("creatingNote");

        if (creatingNote != null) {
            setCreatingNote(creatingNote);
        }

        String partnerCode = (String) attributes.get("partnerCode");

        if (partnerCode != null) {
            setPartnerCode(partnerCode);
        }

        String partnerInCharge = (String) attributes.get("partnerInCharge");

        if (partnerInCharge != null) {
            setPartnerInCharge(partnerInCharge);
        }

        String partnerEmail = (String) attributes.get("partnerEmail");

        if (partnerEmail != null) {
            setPartnerEmail(partnerEmail);
        }

        String partnerPhone = (String) attributes.get("partnerPhone");

        if (partnerPhone != null) {
            setPartnerPhone(partnerPhone);
        }

        String partnerLocation = (String) attributes.get("partnerLocation");

        if (partnerLocation != null) {
            setPartnerLocation(partnerLocation);
        }

        Date sendingEstReturnDate = (Date) attributes.get(
                "sendingEstReturnDate");

        if (sendingEstReturnDate != null) {
            setSendingEstReturnDate(sendingEstReturnDate);
        }

        Date sendingReturnedDate = (Date) attributes.get("sendingReturnedDate");

        if (sendingReturnedDate != null) {
            setSendingReturnedDate(sendingReturnedDate);
        }

        Date sendingAssignedDate = (Date) attributes.get("sendingAssignedDate");

        if (sendingAssignedDate != null) {
            setSendingAssignedDate(sendingAssignedDate);
        }

        String sendingNote = (String) attributes.get("sendingNote");

        if (sendingNote != null) {
            setSendingNote(sendingNote);
        }

        Date receivingReturnedDate = (Date) attributes.get(
                "receivingReturnedDate");

        if (receivingReturnedDate != null) {
            setReceivingReturnedDate(receivingReturnedDate);
        }

        String receivingNote = (String) attributes.get("receivingNote");

        if (receivingNote != null) {
            setReceivingNote(receivingNote);
        }

        Date returningReturnedDate = (Date) attributes.get(
                "returningReturnedDate");

        if (returningReturnedDate != null) {
            setReturningReturnedDate(returningReturnedDate);
        }

        String returningNote = (String) attributes.get("returningNote");

        if (returningNote != null) {
            setReturningNote(returningNote);
        }

        Integer status = (Integer) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }

        Long statusByUserId = (Long) attributes.get("statusByUserId");

        if (statusByUserId != null) {
            setStatusByUserId(statusByUserId);
        }

        Date statusDate = (Date) attributes.get("statusDate");

        if (statusDate != null) {
            setStatusDate(statusDate);
        }
    }

    /**
    * Returns the primary key of this rma request.
    *
    * @return the primary key of this rma request
    */
    @Override
    public long getPrimaryKey() {
        return _rmaRequest.getPrimaryKey();
    }

    /**
    * Sets the primary key of this rma request.
    *
    * @param primaryKey the primary key of this rma request
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _rmaRequest.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the uuid of this rma request.
    *
    * @return the uuid of this rma request
    */
    @Override
    public java.lang.String getUuid() {
        return _rmaRequest.getUuid();
    }

    /**
    * Sets the uuid of this rma request.
    *
    * @param uuid the uuid of this rma request
    */
    @Override
    public void setUuid(java.lang.String uuid) {
        _rmaRequest.setUuid(uuid);
    }

    /**
    * Returns the rma request ID of this rma request.
    *
    * @return the rma request ID of this rma request
    */
    @Override
    public long getRmaRequestId() {
        return _rmaRequest.getRmaRequestId();
    }

    /**
    * Sets the rma request ID of this rma request.
    *
    * @param rmaRequestId the rma request ID of this rma request
    */
    @Override
    public void setRmaRequestId(long rmaRequestId) {
        _rmaRequest.setRmaRequestId(rmaRequestId);
    }

    /**
    * Returns the company ID of this rma request.
    *
    * @return the company ID of this rma request
    */
    @Override
    public long getCompanyId() {
        return _rmaRequest.getCompanyId();
    }

    /**
    * Sets the company ID of this rma request.
    *
    * @param companyId the company ID of this rma request
    */
    @Override
    public void setCompanyId(long companyId) {
        _rmaRequest.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this rma request.
    *
    * @return the user ID of this rma request
    */
    @Override
    public long getUserId() {
        return _rmaRequest.getUserId();
    }

    /**
    * Sets the user ID of this rma request.
    *
    * @param userId the user ID of this rma request
    */
    @Override
    public void setUserId(long userId) {
        _rmaRequest.setUserId(userId);
    }

    /**
    * Returns the user uuid of this rma request.
    *
    * @return the user uuid of this rma request
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rmaRequest.getUserUuid();
    }

    /**
    * Sets the user uuid of this rma request.
    *
    * @param userUuid the user uuid of this rma request
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _rmaRequest.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this rma request.
    *
    * @return the user name of this rma request
    */
    @Override
    public java.lang.String getUserName() {
        return _rmaRequest.getUserName();
    }

    /**
    * Sets the user name of this rma request.
    *
    * @param userName the user name of this rma request
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _rmaRequest.setUserName(userName);
    }

    /**
    * Returns the create date of this rma request.
    *
    * @return the create date of this rma request
    */
    @Override
    public java.util.Date getCreateDate() {
        return _rmaRequest.getCreateDate();
    }

    /**
    * Sets the create date of this rma request.
    *
    * @param createDate the create date of this rma request
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _rmaRequest.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this rma request.
    *
    * @return the modified date of this rma request
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _rmaRequest.getModifiedDate();
    }

    /**
    * Sets the modified date of this rma request.
    *
    * @param modifiedDate the modified date of this rma request
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _rmaRequest.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the group ID of this rma request.
    *
    * @return the group ID of this rma request
    */
    @Override
    public long getGroupId() {
        return _rmaRequest.getGroupId();
    }

    /**
    * Sets the group ID of this rma request.
    *
    * @param groupId the group ID of this rma request
    */
    @Override
    public void setGroupId(long groupId) {
        _rmaRequest.setGroupId(groupId);
    }

    /**
    * Returns the rma request number of this rma request.
    *
    * @return the rma request number of this rma request
    */
    @Override
    public java.lang.String getRmaRequestNumber() {
        return _rmaRequest.getRmaRequestNumber();
    }

    /**
    * Sets the rma request number of this rma request.
    *
    * @param rmaRequestNumber the rma request number of this rma request
    */
    @Override
    public void setRmaRequestNumber(java.lang.String rmaRequestNumber) {
        _rmaRequest.setRmaRequestNumber(rmaRequestNumber);
    }

    /**
    * Returns the cus code of this rma request.
    *
    * @return the cus code of this rma request
    */
    @Override
    public java.lang.String getCusCode() {
        return _rmaRequest.getCusCode();
    }

    /**
    * Sets the cus code of this rma request.
    *
    * @param cusCode the cus code of this rma request
    */
    @Override
    public void setCusCode(java.lang.String cusCode) {
        _rmaRequest.setCusCode(cusCode);
    }

    /**
    * Returns the cus in charge of this rma request.
    *
    * @return the cus in charge of this rma request
    */
    @Override
    public java.lang.String getCusInCharge() {
        return _rmaRequest.getCusInCharge();
    }

    /**
    * Sets the cus in charge of this rma request.
    *
    * @param cusInCharge the cus in charge of this rma request
    */
    @Override
    public void setCusInCharge(java.lang.String cusInCharge) {
        _rmaRequest.setCusInCharge(cusInCharge);
    }

    /**
    * Returns the cus email of this rma request.
    *
    * @return the cus email of this rma request
    */
    @Override
    public java.lang.String getCusEmail() {
        return _rmaRequest.getCusEmail();
    }

    /**
    * Sets the cus email of this rma request.
    *
    * @param cusEmail the cus email of this rma request
    */
    @Override
    public void setCusEmail(java.lang.String cusEmail) {
        _rmaRequest.setCusEmail(cusEmail);
    }

    /**
    * Returns the cus phone of this rma request.
    *
    * @return the cus phone of this rma request
    */
    @Override
    public java.lang.String getCusPhone() {
        return _rmaRequest.getCusPhone();
    }

    /**
    * Sets the cus phone of this rma request.
    *
    * @param cusPhone the cus phone of this rma request
    */
    @Override
    public void setCusPhone(java.lang.String cusPhone) {
        _rmaRequest.setCusPhone(cusPhone);
    }

    /**
    * Returns the cus location of this rma request.
    *
    * @return the cus location of this rma request
    */
    @Override
    public java.lang.String getCusLocation() {
        return _rmaRequest.getCusLocation();
    }

    /**
    * Sets the cus location of this rma request.
    *
    * @param cusLocation the cus location of this rma request
    */
    @Override
    public void setCusLocation(java.lang.String cusLocation) {
        _rmaRequest.setCusLocation(cusLocation);
    }

    /**
    * Returns the prov in charge of this rma request.
    *
    * @return the prov in charge of this rma request
    */
    @Override
    public java.lang.String getProvInCharge() {
        return _rmaRequest.getProvInCharge();
    }

    /**
    * Sets the prov in charge of this rma request.
    *
    * @param provInCharge the prov in charge of this rma request
    */
    @Override
    public void setProvInCharge(java.lang.String provInCharge) {
        _rmaRequest.setProvInCharge(provInCharge);
    }

    /**
    * Returns the creating est return date of this rma request.
    *
    * @return the creating est return date of this rma request
    */
    @Override
    public java.util.Date getCreatingEstReturnDate() {
        return _rmaRequest.getCreatingEstReturnDate();
    }

    /**
    * Sets the creating est return date of this rma request.
    *
    * @param creatingEstReturnDate the creating est return date of this rma request
    */
    @Override
    public void setCreatingEstReturnDate(java.util.Date creatingEstReturnDate) {
        _rmaRequest.setCreatingEstReturnDate(creatingEstReturnDate);
    }

    /**
    * Returns the creating returned date of this rma request.
    *
    * @return the creating returned date of this rma request
    */
    @Override
    public java.util.Date getCreatingReturnedDate() {
        return _rmaRequest.getCreatingReturnedDate();
    }

    /**
    * Sets the creating returned date of this rma request.
    *
    * @param creatingReturnedDate the creating returned date of this rma request
    */
    @Override
    public void setCreatingReturnedDate(java.util.Date creatingReturnedDate) {
        _rmaRequest.setCreatingReturnedDate(creatingReturnedDate);
    }

    /**
    * Returns the creating assigned date of this rma request.
    *
    * @return the creating assigned date of this rma request
    */
    @Override
    public java.util.Date getCreatingAssignedDate() {
        return _rmaRequest.getCreatingAssignedDate();
    }

    /**
    * Sets the creating assigned date of this rma request.
    *
    * @param creatingAssignedDate the creating assigned date of this rma request
    */
    @Override
    public void setCreatingAssignedDate(java.util.Date creatingAssignedDate) {
        _rmaRequest.setCreatingAssignedDate(creatingAssignedDate);
    }

    /**
    * Returns the creating note of this rma request.
    *
    * @return the creating note of this rma request
    */
    @Override
    public java.lang.String getCreatingNote() {
        return _rmaRequest.getCreatingNote();
    }

    /**
    * Sets the creating note of this rma request.
    *
    * @param creatingNote the creating note of this rma request
    */
    @Override
    public void setCreatingNote(java.lang.String creatingNote) {
        _rmaRequest.setCreatingNote(creatingNote);
    }

    /**
    * Returns the partner code of this rma request.
    *
    * @return the partner code of this rma request
    */
    @Override
    public java.lang.String getPartnerCode() {
        return _rmaRequest.getPartnerCode();
    }

    /**
    * Sets the partner code of this rma request.
    *
    * @param partnerCode the partner code of this rma request
    */
    @Override
    public void setPartnerCode(java.lang.String partnerCode) {
        _rmaRequest.setPartnerCode(partnerCode);
    }

    /**
    * Returns the partner in charge of this rma request.
    *
    * @return the partner in charge of this rma request
    */
    @Override
    public java.lang.String getPartnerInCharge() {
        return _rmaRequest.getPartnerInCharge();
    }

    /**
    * Sets the partner in charge of this rma request.
    *
    * @param partnerInCharge the partner in charge of this rma request
    */
    @Override
    public void setPartnerInCharge(java.lang.String partnerInCharge) {
        _rmaRequest.setPartnerInCharge(partnerInCharge);
    }

    /**
    * Returns the partner email of this rma request.
    *
    * @return the partner email of this rma request
    */
    @Override
    public java.lang.String getPartnerEmail() {
        return _rmaRequest.getPartnerEmail();
    }

    /**
    * Sets the partner email of this rma request.
    *
    * @param partnerEmail the partner email of this rma request
    */
    @Override
    public void setPartnerEmail(java.lang.String partnerEmail) {
        _rmaRequest.setPartnerEmail(partnerEmail);
    }

    /**
    * Returns the partner phone of this rma request.
    *
    * @return the partner phone of this rma request
    */
    @Override
    public java.lang.String getPartnerPhone() {
        return _rmaRequest.getPartnerPhone();
    }

    /**
    * Sets the partner phone of this rma request.
    *
    * @param partnerPhone the partner phone of this rma request
    */
    @Override
    public void setPartnerPhone(java.lang.String partnerPhone) {
        _rmaRequest.setPartnerPhone(partnerPhone);
    }

    /**
    * Returns the partner location of this rma request.
    *
    * @return the partner location of this rma request
    */
    @Override
    public java.lang.String getPartnerLocation() {
        return _rmaRequest.getPartnerLocation();
    }

    /**
    * Sets the partner location of this rma request.
    *
    * @param partnerLocation the partner location of this rma request
    */
    @Override
    public void setPartnerLocation(java.lang.String partnerLocation) {
        _rmaRequest.setPartnerLocation(partnerLocation);
    }

    /**
    * Returns the sending est return date of this rma request.
    *
    * @return the sending est return date of this rma request
    */
    @Override
    public java.util.Date getSendingEstReturnDate() {
        return _rmaRequest.getSendingEstReturnDate();
    }

    /**
    * Sets the sending est return date of this rma request.
    *
    * @param sendingEstReturnDate the sending est return date of this rma request
    */
    @Override
    public void setSendingEstReturnDate(java.util.Date sendingEstReturnDate) {
        _rmaRequest.setSendingEstReturnDate(sendingEstReturnDate);
    }

    /**
    * Returns the sending returned date of this rma request.
    *
    * @return the sending returned date of this rma request
    */
    @Override
    public java.util.Date getSendingReturnedDate() {
        return _rmaRequest.getSendingReturnedDate();
    }

    /**
    * Sets the sending returned date of this rma request.
    *
    * @param sendingReturnedDate the sending returned date of this rma request
    */
    @Override
    public void setSendingReturnedDate(java.util.Date sendingReturnedDate) {
        _rmaRequest.setSendingReturnedDate(sendingReturnedDate);
    }

    /**
    * Returns the sending assigned date of this rma request.
    *
    * @return the sending assigned date of this rma request
    */
    @Override
    public java.util.Date getSendingAssignedDate() {
        return _rmaRequest.getSendingAssignedDate();
    }

    /**
    * Sets the sending assigned date of this rma request.
    *
    * @param sendingAssignedDate the sending assigned date of this rma request
    */
    @Override
    public void setSendingAssignedDate(java.util.Date sendingAssignedDate) {
        _rmaRequest.setSendingAssignedDate(sendingAssignedDate);
    }

    /**
    * Returns the sending note of this rma request.
    *
    * @return the sending note of this rma request
    */
    @Override
    public java.lang.String getSendingNote() {
        return _rmaRequest.getSendingNote();
    }

    /**
    * Sets the sending note of this rma request.
    *
    * @param sendingNote the sending note of this rma request
    */
    @Override
    public void setSendingNote(java.lang.String sendingNote) {
        _rmaRequest.setSendingNote(sendingNote);
    }

    /**
    * Returns the receiving returned date of this rma request.
    *
    * @return the receiving returned date of this rma request
    */
    @Override
    public java.util.Date getReceivingReturnedDate() {
        return _rmaRequest.getReceivingReturnedDate();
    }

    /**
    * Sets the receiving returned date of this rma request.
    *
    * @param receivingReturnedDate the receiving returned date of this rma request
    */
    @Override
    public void setReceivingReturnedDate(java.util.Date receivingReturnedDate) {
        _rmaRequest.setReceivingReturnedDate(receivingReturnedDate);
    }

    /**
    * Returns the receiving note of this rma request.
    *
    * @return the receiving note of this rma request
    */
    @Override
    public java.lang.String getReceivingNote() {
        return _rmaRequest.getReceivingNote();
    }

    /**
    * Sets the receiving note of this rma request.
    *
    * @param receivingNote the receiving note of this rma request
    */
    @Override
    public void setReceivingNote(java.lang.String receivingNote) {
        _rmaRequest.setReceivingNote(receivingNote);
    }

    /**
    * Returns the returning returned date of this rma request.
    *
    * @return the returning returned date of this rma request
    */
    @Override
    public java.util.Date getReturningReturnedDate() {
        return _rmaRequest.getReturningReturnedDate();
    }

    /**
    * Sets the returning returned date of this rma request.
    *
    * @param returningReturnedDate the returning returned date of this rma request
    */
    @Override
    public void setReturningReturnedDate(java.util.Date returningReturnedDate) {
        _rmaRequest.setReturningReturnedDate(returningReturnedDate);
    }

    /**
    * Returns the returning note of this rma request.
    *
    * @return the returning note of this rma request
    */
    @Override
    public java.lang.String getReturningNote() {
        return _rmaRequest.getReturningNote();
    }

    /**
    * Sets the returning note of this rma request.
    *
    * @param returningNote the returning note of this rma request
    */
    @Override
    public void setReturningNote(java.lang.String returningNote) {
        _rmaRequest.setReturningNote(returningNote);
    }

    /**
    * Returns the status of this rma request.
    *
    * @return the status of this rma request
    */
    @Override
    public int getStatus() {
        return _rmaRequest.getStatus();
    }

    /**
    * Sets the status of this rma request.
    *
    * @param status the status of this rma request
    */
    @Override
    public void setStatus(int status) {
        _rmaRequest.setStatus(status);
    }

    /**
    * Returns the status by user ID of this rma request.
    *
    * @return the status by user ID of this rma request
    */
    @Override
    public long getStatusByUserId() {
        return _rmaRequest.getStatusByUserId();
    }

    /**
    * Sets the status by user ID of this rma request.
    *
    * @param statusByUserId the status by user ID of this rma request
    */
    @Override
    public void setStatusByUserId(long statusByUserId) {
        _rmaRequest.setStatusByUserId(statusByUserId);
    }

    /**
    * Returns the status by user uuid of this rma request.
    *
    * @return the status by user uuid of this rma request
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getStatusByUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rmaRequest.getStatusByUserUuid();
    }

    /**
    * Sets the status by user uuid of this rma request.
    *
    * @param statusByUserUuid the status by user uuid of this rma request
    */
    @Override
    public void setStatusByUserUuid(java.lang.String statusByUserUuid) {
        _rmaRequest.setStatusByUserUuid(statusByUserUuid);
    }

    /**
    * Returns the status date of this rma request.
    *
    * @return the status date of this rma request
    */
    @Override
    public java.util.Date getStatusDate() {
        return _rmaRequest.getStatusDate();
    }

    /**
    * Sets the status date of this rma request.
    *
    * @param statusDate the status date of this rma request
    */
    @Override
    public void setStatusDate(java.util.Date statusDate) {
        _rmaRequest.setStatusDate(statusDate);
    }

    @Override
    public boolean isNew() {
        return _rmaRequest.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _rmaRequest.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _rmaRequest.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _rmaRequest.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _rmaRequest.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _rmaRequest.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _rmaRequest.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _rmaRequest.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _rmaRequest.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _rmaRequest.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _rmaRequest.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new RmaRequestWrapper((RmaRequest) _rmaRequest.clone());
    }

    @Override
    public int compareTo(com.dasannetworks.vn.sb.model.RmaRequest rmaRequest) {
        return _rmaRequest.compareTo(rmaRequest);
    }

    @Override
    public int hashCode() {
        return _rmaRequest.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.dasannetworks.vn.sb.model.RmaRequest> toCacheModel() {
        return _rmaRequest.toCacheModel();
    }

    @Override
    public com.dasannetworks.vn.sb.model.RmaRequest toEscapedModel() {
        return new RmaRequestWrapper(_rmaRequest.toEscapedModel());
    }

    @Override
    public com.dasannetworks.vn.sb.model.RmaRequest toUnescapedModel() {
        return new RmaRequestWrapper(_rmaRequest.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _rmaRequest.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _rmaRequest.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _rmaRequest.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof RmaRequestWrapper)) {
            return false;
        }

        RmaRequestWrapper rmaRequestWrapper = (RmaRequestWrapper) obj;

        if (Validator.equals(_rmaRequest, rmaRequestWrapper._rmaRequest)) {
            return true;
        }

        return false;
    }

    @Override
    public StagedModelType getStagedModelType() {
        return _rmaRequest.getStagedModelType();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public RmaRequest getWrappedRmaRequest() {
        return _rmaRequest;
    }

    @Override
    public RmaRequest getWrappedModel() {
        return _rmaRequest;
    }

    @Override
    public void resetOriginalValues() {
        _rmaRequest.resetOriginalValues();
    }
}
