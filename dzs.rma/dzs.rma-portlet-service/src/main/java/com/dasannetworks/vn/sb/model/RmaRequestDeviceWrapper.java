package com.dasannetworks.vn.sb.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link RmaRequestDevice}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RmaRequestDevice
 * @generated
 */
public class RmaRequestDeviceWrapper implements RmaRequestDevice,
    ModelWrapper<RmaRequestDevice> {
    private RmaRequestDevice _rmaRequestDevice;

    public RmaRequestDeviceWrapper(RmaRequestDevice rmaRequestDevice) {
        _rmaRequestDevice = rmaRequestDevice;
    }

    @Override
    public Class<?> getModelClass() {
        return RmaRequestDevice.class;
    }

    @Override
    public String getModelClassName() {
        return RmaRequestDevice.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("rmaRequestId", getRmaRequestId());
        attributes.put("deviceId", getDeviceId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("originalSerialNumber", getOriginalSerialNumber());
        attributes.put("faultyDate", getFaultyDate());
        attributes.put("faultyNote", getFaultyNote());
        attributes.put("action", getAction());
        attributes.put("partnerId", getPartnerId());
        attributes.put("partnerInCharge", getPartnerInCharge());
        attributes.put("partnerEmail", getPartnerEmail());
        attributes.put("partnerPhone", getPartnerPhone());
        attributes.put("partnerAddress", getPartnerAddress());
        attributes.put("sendingEstReturnDate", getSendingEstReturnDate());
        attributes.put("sendingReturnedDate", getSendingReturnedDate());
        attributes.put("sendingAssignedDate", getSendingAssignedDate());
        attributes.put("sendingNote", getSendingNote());
        attributes.put("receivingReturnedDate", getReceivingReturnedDate());
        attributes.put("receivingNote", getReceivingNote());
        attributes.put("returningReturnedDate", getReturningReturnedDate());
        attributes.put("returningNote", getReturningNote());
        attributes.put("duplicatedRmaRequestId", getDuplicatedRmaRequestId());
        attributes.put("deniedDate", getDeniedDate());
        attributes.put("deniedNote", getDeniedNote());
        attributes.put("replacedDate", getReplacedDate());
        attributes.put("replacedNote", getReplacedNote());
        attributes.put("replacedNumber", getReplacedNumber());
        attributes.put("replacedOldDeviceId", getReplacedOldDeviceId());
        attributes.put("replacedOldDeviceExtId", getReplacedOldDeviceExtId());
        attributes.put("replacedNewDeviceId", getReplacedNewDeviceId());
        attributes.put("replacedNewDeviceExtId", getReplacedNewDeviceExtId());
        attributes.put("oldStatus", getOldStatus());
        attributes.put("status", getStatus());
        attributes.put("statusByUserId", getStatusByUserId());
        attributes.put("statusDate", getStatusDate());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long rmaRequestId = (Long) attributes.get("rmaRequestId");

        if (rmaRequestId != null) {
            setRmaRequestId(rmaRequestId);
        }

        Long deviceId = (Long) attributes.get("deviceId");

        if (deviceId != null) {
            setDeviceId(deviceId);
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

        String originalSerialNumber = (String) attributes.get(
                "originalSerialNumber");

        if (originalSerialNumber != null) {
            setOriginalSerialNumber(originalSerialNumber);
        }

        Date faultyDate = (Date) attributes.get("faultyDate");

        if (faultyDate != null) {
            setFaultyDate(faultyDate);
        }

        String faultyNote = (String) attributes.get("faultyNote");

        if (faultyNote != null) {
            setFaultyNote(faultyNote);
        }

        String action = (String) attributes.get("action");

        if (action != null) {
            setAction(action);
        }

        Long partnerId = (Long) attributes.get("partnerId");

        if (partnerId != null) {
            setPartnerId(partnerId);
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

        String partnerAddress = (String) attributes.get("partnerAddress");

        if (partnerAddress != null) {
            setPartnerAddress(partnerAddress);
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

        Long duplicatedRmaRequestId = (Long) attributes.get(
                "duplicatedRmaRequestId");

        if (duplicatedRmaRequestId != null) {
            setDuplicatedRmaRequestId(duplicatedRmaRequestId);
        }

        Date deniedDate = (Date) attributes.get("deniedDate");

        if (deniedDate != null) {
            setDeniedDate(deniedDate);
        }

        String deniedNote = (String) attributes.get("deniedNote");

        if (deniedNote != null) {
            setDeniedNote(deniedNote);
        }

        Date replacedDate = (Date) attributes.get("replacedDate");

        if (replacedDate != null) {
            setReplacedDate(replacedDate);
        }

        String replacedNote = (String) attributes.get("replacedNote");

        if (replacedNote != null) {
            setReplacedNote(replacedNote);
        }

        String replacedNumber = (String) attributes.get("replacedNumber");

        if (replacedNumber != null) {
            setReplacedNumber(replacedNumber);
        }

        Long replacedOldDeviceId = (Long) attributes.get("replacedOldDeviceId");

        if (replacedOldDeviceId != null) {
            setReplacedOldDeviceId(replacedOldDeviceId);
        }

        Long replacedOldDeviceExtId = (Long) attributes.get(
                "replacedOldDeviceExtId");

        if (replacedOldDeviceExtId != null) {
            setReplacedOldDeviceExtId(replacedOldDeviceExtId);
        }

        Long replacedNewDeviceId = (Long) attributes.get("replacedNewDeviceId");

        if (replacedNewDeviceId != null) {
            setReplacedNewDeviceId(replacedNewDeviceId);
        }

        Long replacedNewDeviceExtId = (Long) attributes.get(
                "replacedNewDeviceExtId");

        if (replacedNewDeviceExtId != null) {
            setReplacedNewDeviceExtId(replacedNewDeviceExtId);
        }

        Integer oldStatus = (Integer) attributes.get("oldStatus");

        if (oldStatus != null) {
            setOldStatus(oldStatus);
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
    * Returns the primary key of this rma request device.
    *
    * @return the primary key of this rma request device
    */
    @Override
    public com.dasannetworks.vn.sb.service.persistence.RmaRequestDevicePK getPrimaryKey() {
        return _rmaRequestDevice.getPrimaryKey();
    }

    /**
    * Sets the primary key of this rma request device.
    *
    * @param primaryKey the primary key of this rma request device
    */
    @Override
    public void setPrimaryKey(
        com.dasannetworks.vn.sb.service.persistence.RmaRequestDevicePK primaryKey) {
        _rmaRequestDevice.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the rma request ID of this rma request device.
    *
    * @return the rma request ID of this rma request device
    */
    @Override
    public long getRmaRequestId() {
        return _rmaRequestDevice.getRmaRequestId();
    }

    /**
    * Sets the rma request ID of this rma request device.
    *
    * @param rmaRequestId the rma request ID of this rma request device
    */
    @Override
    public void setRmaRequestId(long rmaRequestId) {
        _rmaRequestDevice.setRmaRequestId(rmaRequestId);
    }

    /**
    * Returns the device ID of this rma request device.
    *
    * @return the device ID of this rma request device
    */
    @Override
    public long getDeviceId() {
        return _rmaRequestDevice.getDeviceId();
    }

    /**
    * Sets the device ID of this rma request device.
    *
    * @param deviceId the device ID of this rma request device
    */
    @Override
    public void setDeviceId(long deviceId) {
        _rmaRequestDevice.setDeviceId(deviceId);
    }

    /**
    * Returns the company ID of this rma request device.
    *
    * @return the company ID of this rma request device
    */
    @Override
    public long getCompanyId() {
        return _rmaRequestDevice.getCompanyId();
    }

    /**
    * Sets the company ID of this rma request device.
    *
    * @param companyId the company ID of this rma request device
    */
    @Override
    public void setCompanyId(long companyId) {
        _rmaRequestDevice.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this rma request device.
    *
    * @return the user ID of this rma request device
    */
    @Override
    public long getUserId() {
        return _rmaRequestDevice.getUserId();
    }

    /**
    * Sets the user ID of this rma request device.
    *
    * @param userId the user ID of this rma request device
    */
    @Override
    public void setUserId(long userId) {
        _rmaRequestDevice.setUserId(userId);
    }

    /**
    * Returns the user uuid of this rma request device.
    *
    * @return the user uuid of this rma request device
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rmaRequestDevice.getUserUuid();
    }

    /**
    * Sets the user uuid of this rma request device.
    *
    * @param userUuid the user uuid of this rma request device
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _rmaRequestDevice.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this rma request device.
    *
    * @return the user name of this rma request device
    */
    @Override
    public java.lang.String getUserName() {
        return _rmaRequestDevice.getUserName();
    }

    /**
    * Sets the user name of this rma request device.
    *
    * @param userName the user name of this rma request device
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _rmaRequestDevice.setUserName(userName);
    }

    /**
    * Returns the create date of this rma request device.
    *
    * @return the create date of this rma request device
    */
    @Override
    public java.util.Date getCreateDate() {
        return _rmaRequestDevice.getCreateDate();
    }

    /**
    * Sets the create date of this rma request device.
    *
    * @param createDate the create date of this rma request device
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _rmaRequestDevice.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this rma request device.
    *
    * @return the modified date of this rma request device
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _rmaRequestDevice.getModifiedDate();
    }

    /**
    * Sets the modified date of this rma request device.
    *
    * @param modifiedDate the modified date of this rma request device
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _rmaRequestDevice.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the original serial number of this rma request device.
    *
    * @return the original serial number of this rma request device
    */
    @Override
    public java.lang.String getOriginalSerialNumber() {
        return _rmaRequestDevice.getOriginalSerialNumber();
    }

    /**
    * Sets the original serial number of this rma request device.
    *
    * @param originalSerialNumber the original serial number of this rma request device
    */
    @Override
    public void setOriginalSerialNumber(java.lang.String originalSerialNumber) {
        _rmaRequestDevice.setOriginalSerialNumber(originalSerialNumber);
    }

    /**
    * Returns the faulty date of this rma request device.
    *
    * @return the faulty date of this rma request device
    */
    @Override
    public java.util.Date getFaultyDate() {
        return _rmaRequestDevice.getFaultyDate();
    }

    /**
    * Sets the faulty date of this rma request device.
    *
    * @param faultyDate the faulty date of this rma request device
    */
    @Override
    public void setFaultyDate(java.util.Date faultyDate) {
        _rmaRequestDevice.setFaultyDate(faultyDate);
    }

    /**
    * Returns the faulty note of this rma request device.
    *
    * @return the faulty note of this rma request device
    */
    @Override
    public java.lang.String getFaultyNote() {
        return _rmaRequestDevice.getFaultyNote();
    }

    /**
    * Sets the faulty note of this rma request device.
    *
    * @param faultyNote the faulty note of this rma request device
    */
    @Override
    public void setFaultyNote(java.lang.String faultyNote) {
        _rmaRequestDevice.setFaultyNote(faultyNote);
    }

    /**
    * Returns the action of this rma request device.
    *
    * @return the action of this rma request device
    */
    @Override
    public java.lang.String getAction() {
        return _rmaRequestDevice.getAction();
    }

    /**
    * Sets the action of this rma request device.
    *
    * @param action the action of this rma request device
    */
    @Override
    public void setAction(java.lang.String action) {
        _rmaRequestDevice.setAction(action);
    }

    /**
    * Returns the partner ID of this rma request device.
    *
    * @return the partner ID of this rma request device
    */
    @Override
    public java.lang.Long getPartnerId() {
        return _rmaRequestDevice.getPartnerId();
    }

    /**
    * Sets the partner ID of this rma request device.
    *
    * @param partnerId the partner ID of this rma request device
    */
    @Override
    public void setPartnerId(java.lang.Long partnerId) {
        _rmaRequestDevice.setPartnerId(partnerId);
    }

    /**
    * Returns the partner in charge of this rma request device.
    *
    * @return the partner in charge of this rma request device
    */
    @Override
    public java.lang.String getPartnerInCharge() {
        return _rmaRequestDevice.getPartnerInCharge();
    }

    /**
    * Sets the partner in charge of this rma request device.
    *
    * @param partnerInCharge the partner in charge of this rma request device
    */
    @Override
    public void setPartnerInCharge(java.lang.String partnerInCharge) {
        _rmaRequestDevice.setPartnerInCharge(partnerInCharge);
    }

    /**
    * Returns the partner email of this rma request device.
    *
    * @return the partner email of this rma request device
    */
    @Override
    public java.lang.String getPartnerEmail() {
        return _rmaRequestDevice.getPartnerEmail();
    }

    /**
    * Sets the partner email of this rma request device.
    *
    * @param partnerEmail the partner email of this rma request device
    */
    @Override
    public void setPartnerEmail(java.lang.String partnerEmail) {
        _rmaRequestDevice.setPartnerEmail(partnerEmail);
    }

    /**
    * Returns the partner phone of this rma request device.
    *
    * @return the partner phone of this rma request device
    */
    @Override
    public java.lang.String getPartnerPhone() {
        return _rmaRequestDevice.getPartnerPhone();
    }

    /**
    * Sets the partner phone of this rma request device.
    *
    * @param partnerPhone the partner phone of this rma request device
    */
    @Override
    public void setPartnerPhone(java.lang.String partnerPhone) {
        _rmaRequestDevice.setPartnerPhone(partnerPhone);
    }

    /**
    * Returns the partner address of this rma request device.
    *
    * @return the partner address of this rma request device
    */
    @Override
    public java.lang.String getPartnerAddress() {
        return _rmaRequestDevice.getPartnerAddress();
    }

    /**
    * Sets the partner address of this rma request device.
    *
    * @param partnerAddress the partner address of this rma request device
    */
    @Override
    public void setPartnerAddress(java.lang.String partnerAddress) {
        _rmaRequestDevice.setPartnerAddress(partnerAddress);
    }

    /**
    * Returns the sending est return date of this rma request device.
    *
    * @return the sending est return date of this rma request device
    */
    @Override
    public java.util.Date getSendingEstReturnDate() {
        return _rmaRequestDevice.getSendingEstReturnDate();
    }

    /**
    * Sets the sending est return date of this rma request device.
    *
    * @param sendingEstReturnDate the sending est return date of this rma request device
    */
    @Override
    public void setSendingEstReturnDate(java.util.Date sendingEstReturnDate) {
        _rmaRequestDevice.setSendingEstReturnDate(sendingEstReturnDate);
    }

    /**
    * Returns the sending returned date of this rma request device.
    *
    * @return the sending returned date of this rma request device
    */
    @Override
    public java.util.Date getSendingReturnedDate() {
        return _rmaRequestDevice.getSendingReturnedDate();
    }

    /**
    * Sets the sending returned date of this rma request device.
    *
    * @param sendingReturnedDate the sending returned date of this rma request device
    */
    @Override
    public void setSendingReturnedDate(java.util.Date sendingReturnedDate) {
        _rmaRequestDevice.setSendingReturnedDate(sendingReturnedDate);
    }

    /**
    * Returns the sending assigned date of this rma request device.
    *
    * @return the sending assigned date of this rma request device
    */
    @Override
    public java.util.Date getSendingAssignedDate() {
        return _rmaRequestDevice.getSendingAssignedDate();
    }

    /**
    * Sets the sending assigned date of this rma request device.
    *
    * @param sendingAssignedDate the sending assigned date of this rma request device
    */
    @Override
    public void setSendingAssignedDate(java.util.Date sendingAssignedDate) {
        _rmaRequestDevice.setSendingAssignedDate(sendingAssignedDate);
    }

    /**
    * Returns the sending note of this rma request device.
    *
    * @return the sending note of this rma request device
    */
    @Override
    public java.lang.String getSendingNote() {
        return _rmaRequestDevice.getSendingNote();
    }

    /**
    * Sets the sending note of this rma request device.
    *
    * @param sendingNote the sending note of this rma request device
    */
    @Override
    public void setSendingNote(java.lang.String sendingNote) {
        _rmaRequestDevice.setSendingNote(sendingNote);
    }

    /**
    * Returns the receiving returned date of this rma request device.
    *
    * @return the receiving returned date of this rma request device
    */
    @Override
    public java.util.Date getReceivingReturnedDate() {
        return _rmaRequestDevice.getReceivingReturnedDate();
    }

    /**
    * Sets the receiving returned date of this rma request device.
    *
    * @param receivingReturnedDate the receiving returned date of this rma request device
    */
    @Override
    public void setReceivingReturnedDate(java.util.Date receivingReturnedDate) {
        _rmaRequestDevice.setReceivingReturnedDate(receivingReturnedDate);
    }

    /**
    * Returns the receiving note of this rma request device.
    *
    * @return the receiving note of this rma request device
    */
    @Override
    public java.lang.String getReceivingNote() {
        return _rmaRequestDevice.getReceivingNote();
    }

    /**
    * Sets the receiving note of this rma request device.
    *
    * @param receivingNote the receiving note of this rma request device
    */
    @Override
    public void setReceivingNote(java.lang.String receivingNote) {
        _rmaRequestDevice.setReceivingNote(receivingNote);
    }

    /**
    * Returns the returning returned date of this rma request device.
    *
    * @return the returning returned date of this rma request device
    */
    @Override
    public java.util.Date getReturningReturnedDate() {
        return _rmaRequestDevice.getReturningReturnedDate();
    }

    /**
    * Sets the returning returned date of this rma request device.
    *
    * @param returningReturnedDate the returning returned date of this rma request device
    */
    @Override
    public void setReturningReturnedDate(java.util.Date returningReturnedDate) {
        _rmaRequestDevice.setReturningReturnedDate(returningReturnedDate);
    }

    /**
    * Returns the returning note of this rma request device.
    *
    * @return the returning note of this rma request device
    */
    @Override
    public java.lang.String getReturningNote() {
        return _rmaRequestDevice.getReturningNote();
    }

    /**
    * Sets the returning note of this rma request device.
    *
    * @param returningNote the returning note of this rma request device
    */
    @Override
    public void setReturningNote(java.lang.String returningNote) {
        _rmaRequestDevice.setReturningNote(returningNote);
    }

    /**
    * Returns the duplicated rma request ID of this rma request device.
    *
    * @return the duplicated rma request ID of this rma request device
    */
    @Override
    public java.lang.Long getDuplicatedRmaRequestId() {
        return _rmaRequestDevice.getDuplicatedRmaRequestId();
    }

    /**
    * Sets the duplicated rma request ID of this rma request device.
    *
    * @param duplicatedRmaRequestId the duplicated rma request ID of this rma request device
    */
    @Override
    public void setDuplicatedRmaRequestId(java.lang.Long duplicatedRmaRequestId) {
        _rmaRequestDevice.setDuplicatedRmaRequestId(duplicatedRmaRequestId);
    }

    /**
    * Returns the denied date of this rma request device.
    *
    * @return the denied date of this rma request device
    */
    @Override
    public java.util.Date getDeniedDate() {
        return _rmaRequestDevice.getDeniedDate();
    }

    /**
    * Sets the denied date of this rma request device.
    *
    * @param deniedDate the denied date of this rma request device
    */
    @Override
    public void setDeniedDate(java.util.Date deniedDate) {
        _rmaRequestDevice.setDeniedDate(deniedDate);
    }

    /**
    * Returns the denied note of this rma request device.
    *
    * @return the denied note of this rma request device
    */
    @Override
    public java.lang.String getDeniedNote() {
        return _rmaRequestDevice.getDeniedNote();
    }

    /**
    * Sets the denied note of this rma request device.
    *
    * @param deniedNote the denied note of this rma request device
    */
    @Override
    public void setDeniedNote(java.lang.String deniedNote) {
        _rmaRequestDevice.setDeniedNote(deniedNote);
    }

    /**
    * Returns the replaced date of this rma request device.
    *
    * @return the replaced date of this rma request device
    */
    @Override
    public java.util.Date getReplacedDate() {
        return _rmaRequestDevice.getReplacedDate();
    }

    /**
    * Sets the replaced date of this rma request device.
    *
    * @param replacedDate the replaced date of this rma request device
    */
    @Override
    public void setReplacedDate(java.util.Date replacedDate) {
        _rmaRequestDevice.setReplacedDate(replacedDate);
    }

    /**
    * Returns the replaced note of this rma request device.
    *
    * @return the replaced note of this rma request device
    */
    @Override
    public java.lang.String getReplacedNote() {
        return _rmaRequestDevice.getReplacedNote();
    }

    /**
    * Sets the replaced note of this rma request device.
    *
    * @param replacedNote the replaced note of this rma request device
    */
    @Override
    public void setReplacedNote(java.lang.String replacedNote) {
        _rmaRequestDevice.setReplacedNote(replacedNote);
    }

    /**
    * Returns the replaced number of this rma request device.
    *
    * @return the replaced number of this rma request device
    */
    @Override
    public java.lang.String getReplacedNumber() {
        return _rmaRequestDevice.getReplacedNumber();
    }

    /**
    * Sets the replaced number of this rma request device.
    *
    * @param replacedNumber the replaced number of this rma request device
    */
    @Override
    public void setReplacedNumber(java.lang.String replacedNumber) {
        _rmaRequestDevice.setReplacedNumber(replacedNumber);
    }

    /**
    * Returns the replaced old device ID of this rma request device.
    *
    * @return the replaced old device ID of this rma request device
    */
    @Override
    public java.lang.Long getReplacedOldDeviceId() {
        return _rmaRequestDevice.getReplacedOldDeviceId();
    }

    /**
    * Sets the replaced old device ID of this rma request device.
    *
    * @param replacedOldDeviceId the replaced old device ID of this rma request device
    */
    @Override
    public void setReplacedOldDeviceId(java.lang.Long replacedOldDeviceId) {
        _rmaRequestDevice.setReplacedOldDeviceId(replacedOldDeviceId);
    }

    /**
    * Returns the replaced old device ext ID of this rma request device.
    *
    * @return the replaced old device ext ID of this rma request device
    */
    @Override
    public java.lang.Long getReplacedOldDeviceExtId() {
        return _rmaRequestDevice.getReplacedOldDeviceExtId();
    }

    /**
    * Sets the replaced old device ext ID of this rma request device.
    *
    * @param replacedOldDeviceExtId the replaced old device ext ID of this rma request device
    */
    @Override
    public void setReplacedOldDeviceExtId(java.lang.Long replacedOldDeviceExtId) {
        _rmaRequestDevice.setReplacedOldDeviceExtId(replacedOldDeviceExtId);
    }

    /**
    * Returns the replaced new device ID of this rma request device.
    *
    * @return the replaced new device ID of this rma request device
    */
    @Override
    public java.lang.Long getReplacedNewDeviceId() {
        return _rmaRequestDevice.getReplacedNewDeviceId();
    }

    /**
    * Sets the replaced new device ID of this rma request device.
    *
    * @param replacedNewDeviceId the replaced new device ID of this rma request device
    */
    @Override
    public void setReplacedNewDeviceId(java.lang.Long replacedNewDeviceId) {
        _rmaRequestDevice.setReplacedNewDeviceId(replacedNewDeviceId);
    }

    /**
    * Returns the replaced new device ext ID of this rma request device.
    *
    * @return the replaced new device ext ID of this rma request device
    */
    @Override
    public java.lang.Long getReplacedNewDeviceExtId() {
        return _rmaRequestDevice.getReplacedNewDeviceExtId();
    }

    /**
    * Sets the replaced new device ext ID of this rma request device.
    *
    * @param replacedNewDeviceExtId the replaced new device ext ID of this rma request device
    */
    @Override
    public void setReplacedNewDeviceExtId(java.lang.Long replacedNewDeviceExtId) {
        _rmaRequestDevice.setReplacedNewDeviceExtId(replacedNewDeviceExtId);
    }

    /**
    * Returns the old status of this rma request device.
    *
    * @return the old status of this rma request device
    */
    @Override
    public int getOldStatus() {
        return _rmaRequestDevice.getOldStatus();
    }

    /**
    * Sets the old status of this rma request device.
    *
    * @param oldStatus the old status of this rma request device
    */
    @Override
    public void setOldStatus(int oldStatus) {
        _rmaRequestDevice.setOldStatus(oldStatus);
    }

    /**
    * Returns the status of this rma request device.
    *
    * @return the status of this rma request device
    */
    @Override
    public int getStatus() {
        return _rmaRequestDevice.getStatus();
    }

    /**
    * Sets the status of this rma request device.
    *
    * @param status the status of this rma request device
    */
    @Override
    public void setStatus(int status) {
        _rmaRequestDevice.setStatus(status);
    }

    /**
    * Returns the status by user ID of this rma request device.
    *
    * @return the status by user ID of this rma request device
    */
    @Override
    public long getStatusByUserId() {
        return _rmaRequestDevice.getStatusByUserId();
    }

    /**
    * Sets the status by user ID of this rma request device.
    *
    * @param statusByUserId the status by user ID of this rma request device
    */
    @Override
    public void setStatusByUserId(long statusByUserId) {
        _rmaRequestDevice.setStatusByUserId(statusByUserId);
    }

    /**
    * Returns the status by user uuid of this rma request device.
    *
    * @return the status by user uuid of this rma request device
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getStatusByUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _rmaRequestDevice.getStatusByUserUuid();
    }

    /**
    * Sets the status by user uuid of this rma request device.
    *
    * @param statusByUserUuid the status by user uuid of this rma request device
    */
    @Override
    public void setStatusByUserUuid(java.lang.String statusByUserUuid) {
        _rmaRequestDevice.setStatusByUserUuid(statusByUserUuid);
    }

    /**
    * Returns the status date of this rma request device.
    *
    * @return the status date of this rma request device
    */
    @Override
    public java.util.Date getStatusDate() {
        return _rmaRequestDevice.getStatusDate();
    }

    /**
    * Sets the status date of this rma request device.
    *
    * @param statusDate the status date of this rma request device
    */
    @Override
    public void setStatusDate(java.util.Date statusDate) {
        _rmaRequestDevice.setStatusDate(statusDate);
    }

    @Override
    public boolean isNew() {
        return _rmaRequestDevice.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _rmaRequestDevice.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _rmaRequestDevice.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _rmaRequestDevice.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _rmaRequestDevice.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _rmaRequestDevice.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _rmaRequestDevice.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _rmaRequestDevice.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _rmaRequestDevice.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _rmaRequestDevice.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _rmaRequestDevice.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new RmaRequestDeviceWrapper((RmaRequestDevice) _rmaRequestDevice.clone());
    }

    @Override
    public int compareTo(
        com.dasannetworks.vn.sb.model.RmaRequestDevice rmaRequestDevice) {
        return _rmaRequestDevice.compareTo(rmaRequestDevice);
    }

    @Override
    public int hashCode() {
        return _rmaRequestDevice.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.dasannetworks.vn.sb.model.RmaRequestDevice> toCacheModel() {
        return _rmaRequestDevice.toCacheModel();
    }

    @Override
    public com.dasannetworks.vn.sb.model.RmaRequestDevice toEscapedModel() {
        return new RmaRequestDeviceWrapper(_rmaRequestDevice.toEscapedModel());
    }

    @Override
    public com.dasannetworks.vn.sb.model.RmaRequestDevice toUnescapedModel() {
        return new RmaRequestDeviceWrapper(_rmaRequestDevice.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _rmaRequestDevice.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _rmaRequestDevice.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _rmaRequestDevice.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof RmaRequestDeviceWrapper)) {
            return false;
        }

        RmaRequestDeviceWrapper rmaRequestDeviceWrapper = (RmaRequestDeviceWrapper) obj;

        if (Validator.equals(_rmaRequestDevice,
                    rmaRequestDeviceWrapper._rmaRequestDevice)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public RmaRequestDevice getWrappedRmaRequestDevice() {
        return _rmaRequestDevice;
    }

    @Override
    public RmaRequestDevice getWrappedModel() {
        return _rmaRequestDevice;
    }

    @Override
    public void resetOriginalValues() {
        _rmaRequestDevice.resetOriginalValues();
    }
}
