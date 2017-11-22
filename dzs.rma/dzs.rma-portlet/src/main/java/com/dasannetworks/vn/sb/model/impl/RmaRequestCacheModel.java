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
    public long rmaRequestId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public long groupId;
    public String rmaRequestNumber;
    public Long customerId;
    public String cusInCharge;
    public String cusEmail;
    public String cusPhone;
    public String cusAddress;
    public long creatingEstReturnDate;
    public long creatingAssignedDate;
    public String creatingNote;
    public String creatingImportedFileName;
    public int status;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(37);

        sb.append("{rmaRequestId=");
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
        sb.append(", customerId=");
        sb.append(customerId);
        sb.append(", cusInCharge=");
        sb.append(cusInCharge);
        sb.append(", cusEmail=");
        sb.append(cusEmail);
        sb.append(", cusPhone=");
        sb.append(cusPhone);
        sb.append(", cusAddress=");
        sb.append(cusAddress);
        sb.append(", creatingEstReturnDate=");
        sb.append(creatingEstReturnDate);
        sb.append(", creatingAssignedDate=");
        sb.append(creatingAssignedDate);
        sb.append(", creatingNote=");
        sb.append(creatingNote);
        sb.append(", creatingImportedFileName=");
        sb.append(creatingImportedFileName);
        sb.append(", status=");
        sb.append(status);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public RmaRequest toEntityModel() {
        RmaRequestImpl rmaRequestImpl = new RmaRequestImpl();

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

        rmaRequestImpl.setCustomerId(customerId);

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

        if (cusAddress == null) {
            rmaRequestImpl.setCusAddress(StringPool.BLANK);
        } else {
            rmaRequestImpl.setCusAddress(cusAddress);
        }

        if (creatingEstReturnDate == Long.MIN_VALUE) {
            rmaRequestImpl.setCreatingEstReturnDate(null);
        } else {
            rmaRequestImpl.setCreatingEstReturnDate(new Date(
                    creatingEstReturnDate));
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

        if (creatingImportedFileName == null) {
            rmaRequestImpl.setCreatingImportedFileName(StringPool.BLANK);
        } else {
            rmaRequestImpl.setCreatingImportedFileName(creatingImportedFileName);
        }

        rmaRequestImpl.setStatus(status);

        rmaRequestImpl.resetOriginalValues();

        return rmaRequestImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        rmaRequestId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        groupId = objectInput.readLong();
        rmaRequestNumber = objectInput.readUTF();
        customerId = objectInput.readLong();
        cusInCharge = objectInput.readUTF();
        cusEmail = objectInput.readUTF();
        cusPhone = objectInput.readUTF();
        cusAddress = objectInput.readUTF();
        creatingEstReturnDate = objectInput.readLong();
        creatingAssignedDate = objectInput.readLong();
        creatingNote = objectInput.readUTF();
        creatingImportedFileName = objectInput.readUTF();
        status = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
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

        objectOutput.writeLong(customerId);

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

        if (cusAddress == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(cusAddress);
        }

        objectOutput.writeLong(creatingEstReturnDate);
        objectOutput.writeLong(creatingAssignedDate);

        if (creatingNote == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(creatingNote);
        }

        if (creatingImportedFileName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(creatingImportedFileName);
        }

        objectOutput.writeInt(status);
    }
}
