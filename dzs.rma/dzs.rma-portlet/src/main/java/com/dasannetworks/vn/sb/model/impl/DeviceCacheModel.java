package com.dasannetworks.vn.sb.model.impl;

import com.dasannetworks.vn.sb.model.Device;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Device in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Device
 * @generated
 */
public class DeviceCacheModel implements CacheModel<Device>, Externalizable {
    public long deviceId;
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
    public Long purchaseOrderId;
    public Long warrantyFormId;
    public int status;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(45);

        sb.append("{deviceId=");
        sb.append(deviceId);
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
        sb.append(", purchaseOrderId=");
        sb.append(purchaseOrderId);
        sb.append(", warrantyFormId=");
        sb.append(warrantyFormId);
        sb.append(", status=");
        sb.append(status);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Device toEntityModel() {
        DeviceImpl deviceImpl = new DeviceImpl();

        deviceImpl.setDeviceId(deviceId);
        deviceImpl.setGroupId(groupId);
        deviceImpl.setCompanyId(companyId);
        deviceImpl.setUserId(userId);

        if (userName == null) {
            deviceImpl.setUserName(StringPool.BLANK);
        } else {
            deviceImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            deviceImpl.setCreateDate(null);
        } else {
            deviceImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            deviceImpl.setModifiedDate(null);
        } else {
            deviceImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (modelName == null) {
            deviceImpl.setModelName(StringPool.BLANK);
        } else {
            deviceImpl.setModelName(modelName);
        }

        if (serialNumber == null) {
            deviceImpl.setSerialNumber(StringPool.BLANK);
        } else {
            deviceImpl.setSerialNumber(serialNumber);
        }

        if (gponSerialNumber == null) {
            deviceImpl.setGponSerialNumber(StringPool.BLANK);
        } else {
            deviceImpl.setGponSerialNumber(gponSerialNumber);
        }

        if (boxSerialNumber == null) {
            deviceImpl.setBoxSerialNumber(StringPool.BLANK);
        } else {
            deviceImpl.setBoxSerialNumber(boxSerialNumber);
        }

        if (customerSerialNumber == null) {
            deviceImpl.setCustomerSerialNumber(StringPool.BLANK);
        } else {
            deviceImpl.setCustomerSerialNumber(customerSerialNumber);
        }

        if (manufacturerSerialNumber == null) {
            deviceImpl.setManufacturerSerialNumber(StringPool.BLANK);
        } else {
            deviceImpl.setManufacturerSerialNumber(manufacturerSerialNumber);
        }

        if (hardwareRevision == null) {
            deviceImpl.setHardwareRevision(StringPool.BLANK);
        } else {
            deviceImpl.setHardwareRevision(hardwareRevision);
        }

        if (softwareRevision == null) {
            deviceImpl.setSoftwareRevision(StringPool.BLANK);
        } else {
            deviceImpl.setSoftwareRevision(softwareRevision);
        }

        if (macAddress == null) {
            deviceImpl.setMacAddress(StringPool.BLANK);
        } else {
            deviceImpl.setMacAddress(macAddress);
        }

        if (partNumber == null) {
            deviceImpl.setPartNumber(StringPool.BLANK);
        } else {
            deviceImpl.setPartNumber(partNumber);
        }

        if (specification == null) {
            deviceImpl.setSpecification(StringPool.BLANK);
        } else {
            deviceImpl.setSpecification(specification);
        }

        if (factoryOut == Long.MIN_VALUE) {
            deviceImpl.setFactoryOut(null);
        } else {
            deviceImpl.setFactoryOut(new Date(factoryOut));
        }

        deviceImpl.setPurchaseOrderId(purchaseOrderId);
        deviceImpl.setWarrantyFormId(warrantyFormId);
        deviceImpl.setStatus(status);

        deviceImpl.resetOriginalValues();

        return deviceImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        deviceId = objectInput.readLong();
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
        purchaseOrderId = objectInput.readLong();
        warrantyFormId = objectInput.readLong();
        status = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(deviceId);
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
        objectOutput.writeLong(purchaseOrderId);
        objectOutput.writeLong(warrantyFormId);
        objectOutput.writeInt(status);
    }
}
