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
    public String hardwareRevision;
    public String softwareRevision;
    public String manufacturerSerial;
    public String macAddress;
    public String partNumber;
    public String specification;
    public long factoryOut;
    public long warrantyStartDate;
    public long warrantyEndDate;
    public long purchaseOrderId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(39);

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
        sb.append(", hardwareRevision=");
        sb.append(hardwareRevision);
        sb.append(", softwareRevision=");
        sb.append(softwareRevision);
        sb.append(", manufacturerSerial=");
        sb.append(manufacturerSerial);
        sb.append(", macAddress=");
        sb.append(macAddress);
        sb.append(", partNumber=");
        sb.append(partNumber);
        sb.append(", specification=");
        sb.append(specification);
        sb.append(", factoryOut=");
        sb.append(factoryOut);
        sb.append(", warrantyStartDate=");
        sb.append(warrantyStartDate);
        sb.append(", warrantyEndDate=");
        sb.append(warrantyEndDate);
        sb.append(", purchaseOrderId=");
        sb.append(purchaseOrderId);
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

        if (manufacturerSerial == null) {
            deviceImpl.setManufacturerSerial(StringPool.BLANK);
        } else {
            deviceImpl.setManufacturerSerial(manufacturerSerial);
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

        if (warrantyStartDate == Long.MIN_VALUE) {
            deviceImpl.setWarrantyStartDate(null);
        } else {
            deviceImpl.setWarrantyStartDate(new Date(warrantyStartDate));
        }

        if (warrantyEndDate == Long.MIN_VALUE) {
            deviceImpl.setWarrantyEndDate(null);
        } else {
            deviceImpl.setWarrantyEndDate(new Date(warrantyEndDate));
        }

        deviceImpl.setPurchaseOrderId(purchaseOrderId);

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
        hardwareRevision = objectInput.readUTF();
        softwareRevision = objectInput.readUTF();
        manufacturerSerial = objectInput.readUTF();
        macAddress = objectInput.readUTF();
        partNumber = objectInput.readUTF();
        specification = objectInput.readUTF();
        factoryOut = objectInput.readLong();
        warrantyStartDate = objectInput.readLong();
        warrantyEndDate = objectInput.readLong();
        purchaseOrderId = objectInput.readLong();
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

        if (manufacturerSerial == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(manufacturerSerial);
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
        objectOutput.writeLong(warrantyStartDate);
        objectOutput.writeLong(warrantyEndDate);
        objectOutput.writeLong(purchaseOrderId);
    }
}
