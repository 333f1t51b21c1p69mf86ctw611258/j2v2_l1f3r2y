package com.dasannetworks.vn.sb.model.impl;

import com.dasannetworks.vn.sb.model.HandOverForm;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing HandOverForm in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see HandOverForm
 * @generated
 */
public class HandOverFormCacheModel implements CacheModel<HandOverForm>,
    Externalizable {
    public long handOverFormId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String customerCode;
    public String contactPoint;
    public String email;
    public String phone;
    public String location;
    public String personInCharge;
    public String handOverFormNumber;
    public String note;
    public long assignDate;
    public long estimatedReturnDate;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(33);

        sb.append("{handOverFormId=");
        sb.append(handOverFormId);
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
        sb.append(", customerCode=");
        sb.append(customerCode);
        sb.append(", contactPoint=");
        sb.append(contactPoint);
        sb.append(", email=");
        sb.append(email);
        sb.append(", phone=");
        sb.append(phone);
        sb.append(", location=");
        sb.append(location);
        sb.append(", personInCharge=");
        sb.append(personInCharge);
        sb.append(", handOverFormNumber=");
        sb.append(handOverFormNumber);
        sb.append(", note=");
        sb.append(note);
        sb.append(", assignDate=");
        sb.append(assignDate);
        sb.append(", estimatedReturnDate=");
        sb.append(estimatedReturnDate);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public HandOverForm toEntityModel() {
        HandOverFormImpl handOverFormImpl = new HandOverFormImpl();

        handOverFormImpl.setHandOverFormId(handOverFormId);
        handOverFormImpl.setCompanyId(companyId);
        handOverFormImpl.setUserId(userId);

        if (userName == null) {
            handOverFormImpl.setUserName(StringPool.BLANK);
        } else {
            handOverFormImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            handOverFormImpl.setCreateDate(null);
        } else {
            handOverFormImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            handOverFormImpl.setModifiedDate(null);
        } else {
            handOverFormImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (customerCode == null) {
            handOverFormImpl.setCustomerCode(StringPool.BLANK);
        } else {
            handOverFormImpl.setCustomerCode(customerCode);
        }

        if (contactPoint == null) {
            handOverFormImpl.setContactPoint(StringPool.BLANK);
        } else {
            handOverFormImpl.setContactPoint(contactPoint);
        }

        if (email == null) {
            handOverFormImpl.setEmail(StringPool.BLANK);
        } else {
            handOverFormImpl.setEmail(email);
        }

        if (phone == null) {
            handOverFormImpl.setPhone(StringPool.BLANK);
        } else {
            handOverFormImpl.setPhone(phone);
        }

        if (location == null) {
            handOverFormImpl.setLocation(StringPool.BLANK);
        } else {
            handOverFormImpl.setLocation(location);
        }

        if (personInCharge == null) {
            handOverFormImpl.setPersonInCharge(StringPool.BLANK);
        } else {
            handOverFormImpl.setPersonInCharge(personInCharge);
        }

        if (handOverFormNumber == null) {
            handOverFormImpl.setHandOverFormNumber(StringPool.BLANK);
        } else {
            handOverFormImpl.setHandOverFormNumber(handOverFormNumber);
        }

        if (note == null) {
            handOverFormImpl.setNote(StringPool.BLANK);
        } else {
            handOverFormImpl.setNote(note);
        }

        if (assignDate == Long.MIN_VALUE) {
            handOverFormImpl.setAssignDate(null);
        } else {
            handOverFormImpl.setAssignDate(new Date(assignDate));
        }

        if (estimatedReturnDate == Long.MIN_VALUE) {
            handOverFormImpl.setEstimatedReturnDate(null);
        } else {
            handOverFormImpl.setEstimatedReturnDate(new Date(
                    estimatedReturnDate));
        }

        handOverFormImpl.resetOriginalValues();

        return handOverFormImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        handOverFormId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        customerCode = objectInput.readUTF();
        contactPoint = objectInput.readUTF();
        email = objectInput.readUTF();
        phone = objectInput.readUTF();
        location = objectInput.readUTF();
        personInCharge = objectInput.readUTF();
        handOverFormNumber = objectInput.readUTF();
        note = objectInput.readUTF();
        assignDate = objectInput.readLong();
        estimatedReturnDate = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(handOverFormId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        if (customerCode == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(customerCode);
        }

        if (contactPoint == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(contactPoint);
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

        if (location == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(location);
        }

        if (personInCharge == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(personInCharge);
        }

        if (handOverFormNumber == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(handOverFormNumber);
        }

        if (note == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(note);
        }

        objectOutput.writeLong(assignDate);
        objectOutput.writeLong(estimatedReturnDate);
    }
}
