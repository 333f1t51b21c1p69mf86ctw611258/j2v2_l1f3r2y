package com.dasannetworks.vn.sb.model.impl;

import com.dasannetworks.vn.sb.model.DeviceExt;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DeviceExt in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see DeviceExt
 * @generated
 */
public class DeviceExtCacheModel implements CacheModel<DeviceExt>,
    Externalizable {
    public long deviceExtId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String modelName;
    public String serialNumber;
    public String gponSerialNumber;
    public String boxSerialNumber;
    public String customerSerialNumber;
    public String manufacturerSerialNumber;
    public String hardwareRevision;
    public String softwareRevision;
    public String macAddress;
    public String partNumber;
    public String specification;
    public long factoryOut;
    public int status;
    public long ostStatusChangedDate;
    public Long deviceExtOrderId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(45);

        sb.append("{deviceExtId=");
        sb.append(deviceExtId);
        sb.append(", groupId=");
        sb.append(groupId);
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
        sb.append(", modelName=");
        sb.append(modelName);
        sb.append(", serialNumber=");
        sb.append(serialNumber);
        sb.append(", gponSerialNumber=");
        sb.append(gponSerialNumber);
        sb.append(", boxSerialNumber=");
        sb.append(boxSerialNumber);
        sb.append(", customerSerialNumber=");
        sb.append(customerSerialNumber);
        sb.append(", manufacturerSerialNumber=");
        sb.append(manufacturerSerialNumber);
        sb.append(", hardwareRevision=");
        sb.append(hardwareRevision);
        sb.append(", softwareRevision=");
        sb.append(softwareRevision);
        sb.append(", macAddress=");
        sb.append(macAddress);
        sb.append(", partNumber=");
        sb.append(partNumber);
        sb.append(", specification=");
        sb.append(specification);
        sb.append(", factoryOut=");
        sb.append(factoryOut);
        sb.append(", status=");
        sb.append(status);
        sb.append(", ostStatusChangedDate=");
        sb.append(ostStatusChangedDate);
        sb.append(", deviceExtOrderId=");
        sb.append(deviceExtOrderId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public DeviceExt toEntityModel() {
        DeviceExtImpl deviceExtImpl = new DeviceExtImpl();

        deviceExtImpl.setDeviceExtId(deviceExtId);
        deviceExtImpl.setGroupId(groupId);
        deviceExtImpl.setCompanyId(companyId);
        deviceExtImpl.setUserId(userId);

        if (userName == null) {
            deviceExtImpl.setUserName(StringPool.BLANK);
        } else {
            deviceExtImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            deviceExtImpl.setCreateDate(null);
        } else {
            deviceExtImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            deviceExtImpl.setModifiedDate(null);
        } else {
            deviceExtImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (modelName == null) {
            deviceExtImpl.setModelName(StringPool.BLANK);
        } else {
            deviceExtImpl.setModelName(modelName);
        }

        if (serialNumber == null) {
            deviceExtImpl.setSerialNumber(StringPool.BLANK);
        } else {
            deviceExtImpl.setSerialNumber(serialNumber);
        }

        if (gponSerialNumber == null) {
            deviceExtImpl.setGponSerialNumber(StringPool.BLANK);
        } else {
            deviceExtImpl.setGponSerialNumber(gponSerialNumber);
        }

        if (boxSerialNumber == null) {
            deviceExtImpl.setBoxSerialNumber(StringPool.BLANK);
        } else {
            deviceExtImpl.setBoxSerialNumber(boxSerialNumber);
        }

        if (customerSerialNumber == null) {
            deviceExtImpl.setCustomerSerialNumber(StringPool.BLANK);
        } else {
            deviceExtImpl.setCustomerSerialNumber(customerSerialNumber);
        }

        if (manufacturerSerialNumber == null) {
            deviceExtImpl.setManufacturerSerialNumber(StringPool.BLANK);
        } else {
            deviceExtImpl.setManufacturerSerialNumber(manufacturerSerialNumber);
        }

        if (hardwareRevision == null) {
            deviceExtImpl.setHardwareRevision(StringPool.BLANK);
        } else {
            deviceExtImpl.setHardwareRevision(hardwareRevision);
        }

        if (softwareRevision == null) {
            deviceExtImpl.setSoftwareRevision(StringPool.BLANK);
        } else {
            deviceExtImpl.setSoftwareRevision(softwareRevision);
        }

        if (macAddress == null) {
            deviceExtImpl.setMacAddress(StringPool.BLANK);
        } else {
            deviceExtImpl.setMacAddress(macAddress);
        }

        if (partNumber == null) {
            deviceExtImpl.setPartNumber(StringPool.BLANK);
        } else {
            deviceExtImpl.setPartNumber(partNumber);
        }

        if (specification == null) {
            deviceExtImpl.setSpecification(StringPool.BLANK);
        } else {
            deviceExtImpl.setSpecification(specification);
        }

        if (factoryOut == Long.MIN_VALUE) {
            deviceExtImpl.setFactoryOut(null);
        } else {
            deviceExtImpl.setFactoryOut(new Date(factoryOut));
        }

        deviceExtImpl.setStatus(status);

        if (ostStatusChangedDate == Long.MIN_VALUE) {
            deviceExtImpl.setOstStatusChangedDate(null);
        } else {
            deviceExtImpl.setOstStatusChangedDate(new Date(ostStatusChangedDate));
        }

        deviceExtImpl.setDeviceExtOrderId(deviceExtOrderId);

        deviceExtImpl.resetOriginalValues();

        return deviceExtImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        deviceExtId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        modelName = objectInput.readUTF();
        serialNumber = objectInput.readUTF();
        gponSerialNumber = objectInput.readUTF();
        boxSerialNumber = objectInput.readUTF();
        customerSerialNumber = objectInput.readUTF();
        manufacturerSerialNumber = objectInput.readUTF();
        hardwareRevision = objectInput.readUTF();
        softwareRevision = objectInput.readUTF();
        macAddress = objectInput.readUTF();
        partNumber = objectInput.readUTF();
        specification = objectInput.readUTF();
        factoryOut = objectInput.readLong();
        status = objectInput.readInt();
        ostStatusChangedDate = objectInput.readLong();
        deviceExtOrderId = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(deviceExtId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        if (modelName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(modelName);
        }

        if (serialNumber == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(serialNumber);
        }

        if (gponSerialNumber == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(gponSerialNumber);
        }

        if (boxSerialNumber == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(boxSerialNumber);
        }

        if (customerSerialNumber == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(customerSerialNumber);
        }

        if (manufacturerSerialNumber == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(manufacturerSerialNumber);
        }

        if (hardwareRevision == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(hardwareRevision);
        }

        if (softwareRevision == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(softwareRevision);
        }

        if (macAddress == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(macAddress);
        }

        if (partNumber == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(partNumber);
        }

        if (specification == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(specification);
        }

        objectOutput.writeLong(factoryOut);
        objectOutput.writeInt(status);
        objectOutput.writeLong(ostStatusChangedDate);
        objectOutput.writeLong(deviceExtOrderId);
    }
}
