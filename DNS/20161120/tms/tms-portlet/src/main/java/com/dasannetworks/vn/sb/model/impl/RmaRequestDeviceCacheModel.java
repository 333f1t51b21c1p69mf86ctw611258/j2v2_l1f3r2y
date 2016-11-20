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
    public String faultNote;
    public String status;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

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
        sb.append(", faultNote=");
        sb.append(faultNote);
        sb.append(", status=");
        sb.append(status);
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

        if (faultNote == null) {
            rmaRequestDeviceImpl.setFaultNote(StringPool.BLANK);
        } else {
            rmaRequestDeviceImpl.setFaultNote(faultNote);
        }

        if (status == null) {
            rmaRequestDeviceImpl.setStatus(StringPool.BLANK);
        } else {
            rmaRequestDeviceImpl.setStatus(status);
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
        faultNote = objectInput.readUTF();
        status = objectInput.readUTF();
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

        if (faultNote == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(faultNote);
        }

        if (status == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(status);
        }
    }
}
