package com.dasannetworks.vn.sb.model.impl;

import com.dasannetworks.vn.sb.model.Partner;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Partner in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Partner
 * @generated
 */
public class PartnerCacheModel implements CacheModel<Partner>, Externalizable {
    public long partnerId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String partnerCode;
    public String partnerName;
    public String inCharge;
    public String email;
    public String phone;
    public String address;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(25);

        sb.append("{partnerId=");
        sb.append(partnerId);
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
        sb.append(", partnerCode=");
        sb.append(partnerCode);
        sb.append(", partnerName=");
        sb.append(partnerName);
        sb.append(", inCharge=");
        sb.append(inCharge);
        sb.append(", email=");
        sb.append(email);
        sb.append(", phone=");
        sb.append(phone);
        sb.append(", address=");
        sb.append(address);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Partner toEntityModel() {
        PartnerImpl partnerImpl = new PartnerImpl();

        partnerImpl.setPartnerId(partnerId);
        partnerImpl.setCompanyId(companyId);
        partnerImpl.setUserId(userId);

        if (userName == null) {
            partnerImpl.setUserName(StringPool.BLANK);
        } else {
            partnerImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            partnerImpl.setCreateDate(null);
        } else {
            partnerImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            partnerImpl.setModifiedDate(null);
        } else {
            partnerImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (partnerCode == null) {
            partnerImpl.setPartnerCode(StringPool.BLANK);
        } else {
            partnerImpl.setPartnerCode(partnerCode);
        }

        if (partnerName == null) {
            partnerImpl.setPartnerName(StringPool.BLANK);
        } else {
            partnerImpl.setPartnerName(partnerName);
        }

        if (inCharge == null) {
            partnerImpl.setInCharge(StringPool.BLANK);
        } else {
            partnerImpl.setInCharge(inCharge);
        }

        if (email == null) {
            partnerImpl.setEmail(StringPool.BLANK);
        } else {
            partnerImpl.setEmail(email);
        }

        if (phone == null) {
            partnerImpl.setPhone(StringPool.BLANK);
        } else {
            partnerImpl.setPhone(phone);
        }

        if (address == null) {
            partnerImpl.setAddress(StringPool.BLANK);
        } else {
            partnerImpl.setAddress(address);
        }

        partnerImpl.resetOriginalValues();

        return partnerImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        partnerId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        partnerCode = objectInput.readUTF();
        partnerName = objectInput.readUTF();
        inCharge = objectInput.readUTF();
        email = objectInput.readUTF();
        phone = objectInput.readUTF();
        address = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(partnerId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        if (partnerCode == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(partnerCode);
        }

        if (partnerName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(partnerName);
        }

        if (inCharge == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(inCharge);
        }

        if (email == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(email);
        }

        if (phone == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(phone);
        }

        if (address == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(address);
        }
    }
}
