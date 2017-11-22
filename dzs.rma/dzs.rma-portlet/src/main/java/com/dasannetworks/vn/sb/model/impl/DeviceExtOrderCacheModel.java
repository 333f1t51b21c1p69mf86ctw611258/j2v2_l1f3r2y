package com.dasannetworks.vn.sb.model.impl;

import com.dasannetworks.vn.sb.model.DeviceExtOrder;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DeviceExtOrder in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see DeviceExtOrder
 * @generated
 */
public class DeviceExtOrderCacheModel implements CacheModel<DeviceExtOrder>,
    Externalizable {
    public long deviceExtOrderId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String deviceExtOrderNumber;
    public String note;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(17);

        sb.append("{deviceExtOrderId=");
        sb.append(deviceExtOrderId);
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
        sb.append(", deviceExtOrderNumber=");
        sb.append(deviceExtOrderNumber);
        sb.append(", note=");
        sb.append(note);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public DeviceExtOrder toEntityModel() {
        DeviceExtOrderImpl deviceExtOrderImpl = new DeviceExtOrderImpl();

        deviceExtOrderImpl.setDeviceExtOrderId(deviceExtOrderId);
        deviceExtOrderImpl.setCompanyId(companyId);
        deviceExtOrderImpl.setUserId(userId);

        if (userName == null) {
            deviceExtOrderImpl.setUserName(StringPool.BLANK);
        } else {
            deviceExtOrderImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            deviceExtOrderImpl.setCreateDate(null);
        } else {
            deviceExtOrderImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            deviceExtOrderImpl.setModifiedDate(null);
        } else {
            deviceExtOrderImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (deviceExtOrderNumber == null) {
            deviceExtOrderImpl.setDeviceExtOrderNumber(StringPool.BLANK);
        } else {
            deviceExtOrderImpl.setDeviceExtOrderNumber(deviceExtOrderNumber);
        }

        if (note == null) {
            deviceExtOrderImpl.setNote(StringPool.BLANK);
        } else {
            deviceExtOrderImpl.setNote(note);
        }

        deviceExtOrderImpl.resetOriginalValues();

        return deviceExtOrderImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        deviceExtOrderId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        deviceExtOrderNumber = objectInput.readUTF();
        note = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(deviceExtOrderId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        if (deviceExtOrderNumber == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(deviceExtOrderNumber);
        }

        if (note == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(note);
        }
    }
}
