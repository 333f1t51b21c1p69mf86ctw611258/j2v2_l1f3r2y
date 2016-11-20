package com.dasannetworks.vn.sb.model.impl;

import com.dasannetworks.vn.sb.model.HandOverDevice;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing HandOverDevice in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see HandOverDevice
 * @generated
 */
public class HandOverDeviceCacheModel implements CacheModel<HandOverDevice>,
    Externalizable {
    public long handOverFormId;
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

        sb.append("{handOverFormId=");
        sb.append(handOverFormId);
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
    public HandOverDevice toEntityModel() {
        HandOverDeviceImpl handOverDeviceImpl = new HandOverDeviceImpl();

        handOverDeviceImpl.setHandOverFormId(handOverFormId);
        handOverDeviceImpl.setDeviceId(deviceId);
        handOverDeviceImpl.setCompanyId(companyId);
        handOverDeviceImpl.setUserId(userId);

        if (userName == null) {
            handOverDeviceImpl.setUserName(StringPool.BLANK);
        } else {
            handOverDeviceImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            handOverDeviceImpl.setCreateDate(null);
        } else {
            handOverDeviceImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            handOverDeviceImpl.setModifiedDate(null);
        } else {
            handOverDeviceImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (faultNote == null) {
            handOverDeviceImpl.setFaultNote(StringPool.BLANK);
        } else {
            handOverDeviceImpl.setFaultNote(faultNote);
        }

        if (status == null) {
            handOverDeviceImpl.setStatus(StringPool.BLANK);
        } else {
            handOverDeviceImpl.setStatus(status);
        }

        handOverDeviceImpl.resetOriginalValues();

        return handOverDeviceImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        handOverFormId = objectInput.readLong();
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
        objectOutput.writeLong(handOverFormId);
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
