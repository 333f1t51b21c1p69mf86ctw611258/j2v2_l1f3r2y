package com.dasannetworks.vn.sb.model.impl;

import com.dasannetworks.vn.sb.model.RmaRequestDevice;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing RmaRequestDevice in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see RmaRequestDevice
 * @generated
 */
public class RmaRequestDeviceCacheModel implements CacheModel<RmaRequestDevice>,
    Externalizable {
    public long rmaRequestId;
    public long deviceId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String originalSerialNumber;
    public long faultyDate;
    public String faultyNote;
    public String action;
    public Long partnerId;
    public String partnerInCharge;
    public String partnerEmail;
    public String partnerPhone;
    public String partnerAddress;
    public long sendingEstReturnDate;
    public long sendingReturnedDate;
    public long sendingAssignedDate;
    public String sendingNote;
    public long receivingReturnedDate;
    public String receivingNote;
    public long returningReturnedDate;
    public String returningNote;
    public Long duplicatedRmaRequestId;
    public long deniedDate;
    public String deniedNote;
    public long replacedDate;
    public String replacedNote;
    public String replacedNumber;
    public Long replacedOldDeviceId;
    public Long replacedOldDeviceExtId;
    public Long replacedNewDeviceId;
    public Long replacedNewDeviceExtId;
    public int oldStatus;
    public int status;
    public long statusByUserId;
    public long statusDate;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(77);

        sb.append("{rmaRequestId=");
        sb.append(rmaRequestId);
        sb.append(", deviceId=");
        sb.append(deviceId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", userName=");
        sb.append(userName);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", originalSerialNumber=");
        sb.append(originalSerialNumber);
        sb.append(", faultyDate=");
        sb.append(faultyDate);
        sb.append(", faultyNote=");
        sb.append(faultyNote);
        sb.append(", action=");
        sb.append(action);
        sb.append(", partnerId=");
        sb.append(partnerId);
        sb.append(", partnerInCharge=");
        sb.append(partnerInCharge);
        sb.append(", partnerEmail=");
        sb.append(partnerEmail);
        sb.append(", partnerPhone=");
        sb.append(partnerPhone);
        sb.append(", partnerAddress=");
        sb.append(partnerAddress);
        sb.append(", sendingEstReturnDate=");
        sb.append(sendingEstReturnDate);
        sb.append(", sendingReturnedDate=");
        sb.append(sendingReturnedDate);
        sb.append(", sendingAssignedDate=");
        sb.append(sendingAssignedDate);
        sb.append(", sendingNote=");
        sb.append(sendingNote);
        sb.append(", receivingReturnedDate=");
        sb.append(receivingReturnedDate);
        sb.append(", receivingNote=");
        sb.append(receivingNote);
        sb.append(", returningReturnedDate=");
        sb.append(returningReturnedDate);
        sb.append(", returningNote=");
        sb.append(returningNote);
        sb.append(", duplicatedRmaRequestId=");
        sb.append(duplicatedRmaRequestId);
        sb.append(", deniedDate=");
        sb.append(deniedDate);
        sb.append(", deniedNote=");
        sb.append(deniedNote);
        sb.append(", replacedDate=");
        sb.append(replacedDate);
        sb.append(", replacedNote=");
        sb.append(replacedNote);
        sb.append(", replacedNumber=");
        sb.append(replacedNumber);
        sb.append(", replacedOldDeviceId=");
        sb.append(replacedOldDeviceId);
        sb.append(", replacedOldDeviceExtId=");
        sb.append(replacedOldDeviceExtId);
        sb.append(", replacedNewDeviceId=");
        sb.append(replacedNewDeviceId);
        sb.append(", replacedNewDeviceExtId=");
        sb.append(replacedNewDeviceExtId);
        sb.append(", oldStatus=");
        sb.append(oldStatus);
        sb.append(", status=");
        sb.append(status);
        sb.append(", statusByUserId=");
        sb.append(statusByUserId);
        sb.append(", statusDate=");
        sb.append(statusDate);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public RmaRequestDevice toEntityModel() {
        RmaRequestDeviceImpl rmaRequestDeviceImpl = new RmaRequestDeviceImpl();

        rmaRequestDeviceImpl.setRmaRequestId(rmaRequestId);
        rmaRequestDeviceImpl.setDeviceId(deviceId);
        rmaRequestDeviceImpl.setCompanyId(companyId);
        rmaRequestDeviceImpl.setUserId(userId);

        if (userName == null) {
            rmaRequestDeviceImpl.setUserName(StringPool.BLANK);
        } else {
            rmaRequestDeviceImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            rmaRequestDeviceImpl.setCreateDate(null);
        } else {
            rmaRequestDeviceImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            rmaRequestDeviceImpl.setModifiedDate(null);
        } else {
            rmaRequestDeviceImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (originalSerialNumber == null) {
            rmaRequestDeviceImpl.setOriginalSerialNumber(StringPool.BLANK);
        } else {
            rmaRequestDeviceImpl.setOriginalSerialNumber(originalSerialNumber);
        }

        if (faultyDate == Long.MIN_VALUE) {
            rmaRequestDeviceImpl.setFaultyDate(null);
        } else {
            rmaRequestDeviceImpl.setFaultyDate(new Date(faultyDate));
        }

        if (faultyNote == null) {
            rmaRequestDeviceImpl.setFaultyNote(StringPool.BLANK);
        } else {
            rmaRequestDeviceImpl.setFaultyNote(faultyNote);
        }

        if (action == null) {
            rmaRequestDeviceImpl.setAction(StringPool.BLANK);
        } else {
            rmaRequestDeviceImpl.setAction(action);
        }

        rmaRequestDeviceImpl.setPartnerId(partnerId);

        if (partnerInCharge == null) {
            rmaRequestDeviceImpl.setPartnerInCharge(StringPool.BLANK);
        } else {
            rmaRequestDeviceImpl.setPartnerInCharge(partnerInCharge);
        }

        if (partnerEmail == null) {
            rmaRequestDeviceImpl.setPartnerEmail(StringPool.BLANK);
        } else {
            rmaRequestDeviceImpl.setPartnerEmail(partnerEmail);
        }

        if (partnerPhone == null) {
            rmaRequestDeviceImpl.setPartnerPhone(StringPool.BLANK);
        } else {
            rmaRequestDeviceImpl.setPartnerPhone(partnerPhone);
        }

        if (partnerAddress == null) {
            rmaRequestDeviceImpl.setPartnerAddress(StringPool.BLANK);
        } else {
            rmaRequestDeviceImpl.setPartnerAddress(partnerAddress);
        }

        if (sendingEstReturnDate == Long.MIN_VALUE) {
            rmaRequestDeviceImpl.setSendingEstReturnDate(null);
        } else {
            rmaRequestDeviceImpl.setSendingEstReturnDate(new Date(
                    sendingEstReturnDate));
        }

        if (sendingReturnedDate == Long.MIN_VALUE) {
            rmaRequestDeviceImpl.setSendingReturnedDate(null);
        } else {
            rmaRequestDeviceImpl.setSendingReturnedDate(new Date(
                    sendingReturnedDate));
        }

        if (sendingAssignedDate == Long.MIN_VALUE) {
            rmaRequestDeviceImpl.setSendingAssignedDate(null);
        } else {
            rmaRequestDeviceImpl.setSendingAssignedDate(new Date(
                    sendingAssignedDate));
        }

        if (sendingNote == null) {
            rmaRequestDeviceImpl.setSendingNote(StringPool.BLANK);
        } else {
            rmaRequestDeviceImpl.setSendingNote(sendingNote);
        }

        if (receivingReturnedDate == Long.MIN_VALUE) {
            rmaRequestDeviceImpl.setReceivingReturnedDate(null);
        } else {
            rmaRequestDeviceImpl.setReceivingReturnedDate(new Date(
                    receivingReturnedDate));
        }

        if (receivingNote == null) {
            rmaRequestDeviceImpl.setReceivingNote(StringPool.BLANK);
        } else {
            rmaRequestDeviceImpl.setReceivingNote(receivingNote);
        }

        if (returningReturnedDate == Long.MIN_VALUE) {
            rmaRequestDeviceImpl.setReturningReturnedDate(null);
        } else {
            rmaRequestDeviceImpl.setReturningReturnedDate(new Date(
                    returningReturnedDate));
        }

        if (returningNote == null) {
            rmaRequestDeviceImpl.setReturningNote(StringPool.BLANK);
        } else {
            rmaRequestDeviceImpl.setReturningNote(returningNote);
        }

        rmaRequestDeviceImpl.setDuplicatedRmaRequestId(duplicatedRmaRequestId);

        if (deniedDate == Long.MIN_VALUE) {
            rmaRequestDeviceImpl.setDeniedDate(null);
        } else {
            rmaRequestDeviceImpl.setDeniedDate(new Date(deniedDate));
        }

        if (deniedNote == null) {
            rmaRequestDeviceImpl.setDeniedNote(StringPool.BLANK);
        } else {
            rmaRequestDeviceImpl.setDeniedNote(deniedNote);
        }

        if (replacedDate == Long.MIN_VALUE) {
            rmaRequestDeviceImpl.setReplacedDate(null);
        } else {
            rmaRequestDeviceImpl.setReplacedDate(new Date(replacedDate));
        }

        if (replacedNote == null) {
            rmaRequestDeviceImpl.setReplacedNote(StringPool.BLANK);
        } else {
            rmaRequestDeviceImpl.setReplacedNote(replacedNote);
        }

        if (replacedNumber == null) {
            rmaRequestDeviceImpl.setReplacedNumber(StringPool.BLANK);
        } else {
            rmaRequestDeviceImpl.setReplacedNumber(replacedNumber);
        }

        rmaRequestDeviceImpl.setReplacedOldDeviceId(replacedOldDeviceId);
        rmaRequestDeviceImpl.setReplacedOldDeviceExtId(replacedOldDeviceExtId);
        rmaRequestDeviceImpl.setReplacedNewDeviceId(replacedNewDeviceId);
        rmaRequestDeviceImpl.setReplacedNewDeviceExtId(replacedNewDeviceExtId);
        rmaRequestDeviceImpl.setOldStatus(oldStatus);
        rmaRequestDeviceImpl.setStatus(status);
        rmaRequestDeviceImpl.setStatusByUserId(statusByUserId);

        if (statusDate == Long.MIN_VALUE) {
            rmaRequestDeviceImpl.setStatusDate(null);
        } else {
            rmaRequestDeviceImpl.setStatusDate(new Date(statusDate));
        }

        rmaRequestDeviceImpl.resetOriginalValues();

        return rmaRequestDeviceImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        rmaRequestId = objectInput.readLong();
        deviceId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        originalSerialNumber = objectInput.readUTF();
        faultyDate = objectInput.readLong();
        faultyNote = objectInput.readUTF();
        action = objectInput.readUTF();
        partnerId = objectInput.readLong();
        partnerInCharge = objectInput.readUTF();
        partnerEmail = objectInput.readUTF();
        partnerPhone = objectInput.readUTF();
        partnerAddress = objectInput.readUTF();
        sendingEstReturnDate = objectInput.readLong();
        sendingReturnedDate = objectInput.readLong();
        sendingAssignedDate = objectInput.readLong();
        sendingNote = objectInput.readUTF();
        receivingReturnedDate = objectInput.readLong();
        receivingNote = objectInput.readUTF();
        returningReturnedDate = objectInput.readLong();
        returningNote = objectInput.readUTF();
        duplicatedRmaRequestId = objectInput.readLong();
        deniedDate = objectInput.readLong();
        deniedNote = objectInput.readUTF();
        replacedDate = objectInput.readLong();
        replacedNote = objectInput.readUTF();
        replacedNumber = objectInput.readUTF();
        replacedOldDeviceId = objectInput.readLong();
        replacedOldDeviceExtId = objectInput.readLong();
        replacedNewDeviceId = objectInput.readLong();
        replacedNewDeviceExtId = objectInput.readLong();
        oldStatus = objectInput.readInt();
        status = objectInput.readInt();
        statusByUserId = objectInput.readLong();
        statusDate = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(rmaRequestId);
        objectOutput.writeLong(deviceId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        if (originalSerialNumber == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(originalSerialNumber);
        }

        objectOutput.writeLong(faultyDate);

        if (faultyNote == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(faultyNote);
        }

        if (action == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(action);
        }

        objectOutput.writeLong(partnerId);

        if (partnerInCharge == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(partnerInCharge);
        }

        if (partnerEmail == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(partnerEmail);
        }

        if (partnerPhone == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(partnerPhone);
        }

        if (partnerAddress == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(partnerAddress);
        }

        objectOutput.writeLong(sendingEstReturnDate);
        objectOutput.writeLong(sendingReturnedDate);
        objectOutput.writeLong(sendingAssignedDate);

        if (sendingNote == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(sendingNote);
        }

        objectOutput.writeLong(receivingReturnedDate);

        if (receivingNote == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(receivingNote);
        }

        objectOutput.writeLong(returningReturnedDate);

        if (returningNote == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(returningNote);
        }

        objectOutput.writeLong(duplicatedRmaRequestId);
        objectOutput.writeLong(deniedDate);

        if (deniedNote == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(deniedNote);
        }

        objectOutput.writeLong(replacedDate);

        if (replacedNote == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(replacedNote);
        }

        if (replacedNumber == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(replacedNumber);
        }

        objectOutput.writeLong(replacedOldDeviceId);
        objectOutput.writeLong(replacedOldDeviceExtId);
        objectOutput.writeLong(replacedNewDeviceId);
        objectOutput.writeLong(replacedNewDeviceExtId);
        objectOutput.writeInt(oldStatus);
        objectOutput.writeInt(status);
        objectOutput.writeLong(statusByUserId);
        objectOutput.writeLong(statusDate);
    }
}
