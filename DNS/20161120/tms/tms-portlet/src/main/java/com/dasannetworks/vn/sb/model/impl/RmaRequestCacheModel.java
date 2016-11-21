package com.dasannetworks.vn.sb.model.impl;

import com.dasannetworks.vn.sb.model.RmaRequest;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing RmaRequest in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see RmaRequest
 * @generated
 */
public class RmaRequestCacheModel implements CacheModel<RmaRequest>,
    Externalizable {
    public String uuid;
    public long rmaRequestId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public long groupId;
    public String rmaRequestNumber;
    public String cusCode;
    public String cusInCharge;
    public String cusEmail;
    public String cusPhone;
    public String cusLocation;
    public String provInCharge;
    public long creatingEstReturnDate;
    public long creatingReturnedDate;
    public long creatingAssignedDate;
    public String creatingNote;
    public String partnerCode;
    public String partnerInCharge;
    public String partnerEmail;
    public String partnerPhone;
    public String partnerLocation;
    public long sendingEstReturnDate;
    public long sendingReturnedDate;
    public long sendingAssignedDate;
    public String sendingNote;
    public long receivingReturnedDate;
    public String receivingNote;
    public long returningReturnedDate;
    public String returningNote;
    public int status;
    public long statusByUserId;
    public long statusDate;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(71);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", rmaRequestId=");
        sb.append(rmaRequestId);
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
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", rmaRequestNumber=");
        sb.append(rmaRequestNumber);
        sb.append(", cusCode=");
        sb.append(cusCode);
        sb.append(", cusInCharge=");
        sb.append(cusInCharge);
        sb.append(", cusEmail=");
        sb.append(cusEmail);
        sb.append(", cusPhone=");
        sb.append(cusPhone);
        sb.append(", cusLocation=");
        sb.append(cusLocation);
        sb.append(", provInCharge=");
        sb.append(provInCharge);
        sb.append(", creatingEstReturnDate=");
        sb.append(creatingEstReturnDate);
        sb.append(", creatingReturnedDate=");
        sb.append(creatingReturnedDate);
        sb.append(", creatingAssignedDate=");
        sb.append(creatingAssignedDate);
        sb.append(", creatingNote=");
        sb.append(creatingNote);
        sb.append(", partnerCode=");
        sb.append(partnerCode);
        sb.append(", partnerInCharge=");
        sb.append(partnerInCharge);
        sb.append(", partnerEmail=");
        sb.append(partnerEmail);
        sb.append(", partnerPhone=");
        sb.append(partnerPhone);
        sb.append(", partnerLocation=");
        sb.append(partnerLocation);
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
    public RmaRequest toEntityModel() {
        RmaRequestImpl rmaRequestImpl = new RmaRequestImpl();

        if (uuid == null) {
            rmaRequestImpl.setUuid(StringPool.BLANK);
        } else {
            rmaRequestImpl.setUuid(uuid);
        }

        rmaRequestImpl.setRmaRequestId(rmaRequestId);
        rmaRequestImpl.setCompanyId(companyId);
        rmaRequestImpl.setUserId(userId);

        if (userName == null) {
            rmaRequestImpl.setUserName(StringPool.BLANK);
        } else {
            rmaRequestImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            rmaRequestImpl.setCreateDate(null);
        } else {
            rmaRequestImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            rmaRequestImpl.setModifiedDate(null);
        } else {
            rmaRequestImpl.setModifiedDate(new Date(modifiedDate));
        }

        rmaRequestImpl.setGroupId(groupId);

        if (rmaRequestNumber == null) {
            rmaRequestImpl.setRmaRequestNumber(StringPool.BLANK);
        } else {
            rmaRequestImpl.setRmaRequestNumber(rmaRequestNumber);
        }

        if (cusCode == null) {
            rmaRequestImpl.setCusCode(StringPool.BLANK);
        } else {
            rmaRequestImpl.setCusCode(cusCode);
        }

        if (cusInCharge == null) {
            rmaRequestImpl.setCusInCharge(StringPool.BLANK);
        } else {
            rmaRequestImpl.setCusInCharge(cusInCharge);
        }

        if (cusEmail == null) {
            rmaRequestImpl.setCusEmail(StringPool.BLANK);
        } else {
            rmaRequestImpl.setCusEmail(cusEmail);
        }

        if (cusPhone == null) {
            rmaRequestImpl.setCusPhone(StringPool.BLANK);
        } else {
            rmaRequestImpl.setCusPhone(cusPhone);
        }

        if (cusLocation == null) {
            rmaRequestImpl.setCusLocation(StringPool.BLANK);
        } else {
            rmaRequestImpl.setCusLocation(cusLocation);
        }

        if (provInCharge == null) {
            rmaRequestImpl.setProvInCharge(StringPool.BLANK);
        } else {
            rmaRequestImpl.setProvInCharge(provInCharge);
        }

        if (creatingEstReturnDate == Long.MIN_VALUE) {
            rmaRequestImpl.setCreatingEstReturnDate(null);
        } else {
            rmaRequestImpl.setCreatingEstReturnDate(new Date(
                    creatingEstReturnDate));
        }

        if (creatingReturnedDate == Long.MIN_VALUE) {
            rmaRequestImpl.setCreatingReturnedDate(null);
        } else {
            rmaRequestImpl.setCreatingReturnedDate(new Date(
                    creatingReturnedDate));
        }

        if (creatingAssignedDate == Long.MIN_VALUE) {
            rmaRequestImpl.setCreatingAssignedDate(null);
        } else {
            rmaRequestImpl.setCreatingAssignedDate(new Date(
                    creatingAssignedDate));
        }

        if (creatingNote == null) {
            rmaRequestImpl.setCreatingNote(StringPool.BLANK);
        } else {
            rmaRequestImpl.setCreatingNote(creatingNote);
        }

        if (partnerCode == null) {
            rmaRequestImpl.setPartnerCode(StringPool.BLANK);
        } else {
            rmaRequestImpl.setPartnerCode(partnerCode);
        }

        if (partnerInCharge == null) {
            rmaRequestImpl.setPartnerInCharge(StringPool.BLANK);
        } else {
            rmaRequestImpl.setPartnerInCharge(partnerInCharge);
        }

        if (partnerEmail == null) {
            rmaRequestImpl.setPartnerEmail(StringPool.BLANK);
        } else {
            rmaRequestImpl.setPartnerEmail(partnerEmail);
        }

        if (partnerPhone == null) {
            rmaRequestImpl.setPartnerPhone(StringPool.BLANK);
        } else {
            rmaRequestImpl.setPartnerPhone(partnerPhone);
        }

        if (partnerLocation == null) {
            rmaRequestImpl.setPartnerLocation(StringPool.BLANK);
        } else {
            rmaRequestImpl.setPartnerLocation(partnerLocation);
        }

        if (sendingEstReturnDate == Long.MIN_VALUE) {
            rmaRequestImpl.setSendingEstReturnDate(null);
        } else {
            rmaRequestImpl.setSendingEstReturnDate(new Date(
                    sendingEstReturnDate));
        }

        if (sendingReturnedDate == Long.MIN_VALUE) {
            rmaRequestImpl.setSendingReturnedDate(null);
        } else {
            rmaRequestImpl.setSendingReturnedDate(new Date(sendingReturnedDate));
        }

        if (sendingAssignedDate == Long.MIN_VALUE) {
            rmaRequestImpl.setSendingAssignedDate(null);
        } else {
            rmaRequestImpl.setSendingAssignedDate(new Date(sendingAssignedDate));
        }

        if (sendingNote == null) {
            rmaRequestImpl.setSendingNote(StringPool.BLANK);
        } else {
            rmaRequestImpl.setSendingNote(sendingNote);
        }

        if (receivingReturnedDate == Long.MIN_VALUE) {
            rmaRequestImpl.setReceivingReturnedDate(null);
        } else {
            rmaRequestImpl.setReceivingReturnedDate(new Date(
                    receivingReturnedDate));
        }

        if (receivingNote == null) {
            rmaRequestImpl.setReceivingNote(StringPool.BLANK);
        } else {
            rmaRequestImpl.setReceivingNote(receivingNote);
        }

        if (returningReturnedDate == Long.MIN_VALUE) {
            rmaRequestImpl.setReturningReturnedDate(null);
        } else {
            rmaRequestImpl.setReturningReturnedDate(new Date(
                    returningReturnedDate));
        }

        if (returningNote == null) {
            rmaRequestImpl.setReturningNote(StringPool.BLANK);
        } else {
            rmaRequestImpl.setReturningNote(returningNote);
        }

        rmaRequestImpl.setStatus(status);
        rmaRequestImpl.setStatusByUserId(statusByUserId);

        if (statusDate == Long.MIN_VALUE) {
            rmaRequestImpl.setStatusDate(null);
        } else {
            rmaRequestImpl.setStatusDate(new Date(statusDate));
        }

        rmaRequestImpl.resetOriginalValues();

        return rmaRequestImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        rmaRequestId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        groupId = objectInput.readLong();
        rmaRequestNumber = objectInput.readUTF();
        cusCode = objectInput.readUTF();
        cusInCharge = objectInput.readUTF();
        cusEmail = objectInput.readUTF();
        cusPhone = objectInput.readUTF();
        cusLocation = objectInput.readUTF();
        provInCharge = objectInput.readUTF();
        creatingEstReturnDate = objectInput.readLong();
        creatingReturnedDate = objectInput.readLong();
        creatingAssignedDate = objectInput.readLong();
        creatingNote = objectInput.readUTF();
        partnerCode = objectInput.readUTF();
        partnerInCharge = objectInput.readUTF();
        partnerEmail = objectInput.readUTF();
        partnerPhone = objectInput.readUTF();
        partnerLocation = objectInput.readUTF();
        sendingEstReturnDate = objectInput.readLong();
        sendingReturnedDate = objectInput.readLong();
        sendingAssignedDate = objectInput.readLong();
        sendingNote = objectInput.readUTF();
        receivingReturnedDate = objectInput.readLong();
        receivingNote = objectInput.readUTF();
        returningReturnedDate = objectInput.readLong();
        returningNote = objectInput.readUTF();
        status = objectInput.readInt();
        statusByUserId = objectInput.readLong();
        statusDate = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(rmaRequestId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);
        objectOutput.writeLong(groupId);

        if (rmaRequestNumber == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(rmaRequestNumber);
        }

        if (cusCode == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(cusCode);
        }

        if (cusInCharge == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(cusInCharge);
        }

        if (cusEmail == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(cusEmail);
        }

        if (cusPhone == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(cusPhone);
        }

        if (cusLocation == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(cusLocation);
        }

        if (provInCharge == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(provInCharge);
        }

        objectOutput.writeLong(creatingEstReturnDate);
        objectOutput.writeLong(creatingReturnedDate);
        objectOutput.writeLong(creatingAssignedDate);

        if (creatingNote == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(creatingNote);
        }

        if (partnerCode == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(partnerCode);
        }

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

        if (partnerLocation == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(partnerLocation);
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

        objectOutput.writeInt(status);
        objectOutput.writeLong(statusByUserId);
        objectOutput.writeLong(statusDate);
    }
}
