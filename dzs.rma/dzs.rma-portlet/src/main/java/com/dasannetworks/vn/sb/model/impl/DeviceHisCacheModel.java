package com.dasannetworks.vn.sb.model.impl;

import com.dasannetworks.vn.sb.model.DeviceHis;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DeviceHis in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see DeviceHis
 * @generated
 */
public class DeviceHisCacheModel implements CacheModel<DeviceHis>,
    Externalizable {
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
    public DeviceHis toEntityModel() {
        DeviceHisImpl deviceHisImpl = new DeviceHisImpl();

        deviceHisImpl.setDeviceId(deviceId);
        deviceHisImpl.setGroupId(groupId);
        deviceHisImpl.setCompanyId(companyId);
        deviceHisImpl.setUserId(userId);

        if (userName == null) {
            deviceHisImpl.setUserName(StringPool.BLANK);
        } else {
            deviceHisImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            deviceHisImpl.setCreateDate(null);
        } else {
            deviceHisImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            deviceHisImpl.setModifiedDate(null);
        } else {
            deviceHisImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (modelName == null) {
            deviceHisImpl.setModelName(StringPool.BLANK);
        } else {
            deviceHisImpl.setModelName(modelName);
        }

        if (serialNumber == null) {
            deviceHisImpl.setSerialNumber(StringPool.BLANK);
        } else {
            deviceHisImpl.setSerialNumber(serialNumber);
        }

        if (gponSerialNumber == null) {
            deviceHisImpl.setGponSerialNumber(StringPool.BLANK);
        } else {
            deviceHisImpl.setGponSerialNumber(gponSerialNumber);
        }

        if (boxSerialNumber == null) {
            deviceHisImpl.setBoxSerialNumber(StringPool.BLANK);
        } else {
            deviceHisImpl.setBoxSerialNumber(boxSerialNumber);
        }

        if (customerSerialNumber == null) {
            deviceHisImpl.setCustomerSerialNumber(StringPool.BLANK);
        } else {
            deviceHisImpl.setCustomerSerialNumber(customerSerialNumber);
        }

        if (manufacturerSerialNumber == null) {
            deviceHisImpl.setManufacturerSerialNumber(StringPool.BLANK);
        } else {
            deviceHisImpl.setManufacturerSerialNumber(manufacturerSerialNumber);
        }

        if (hardwareRevision == null) {
            deviceHisImpl.setHardwareRevision(StringPool.BLANK);
        } else {
            deviceHisImpl.setHardwareRevision(hardwareRevision);
        }

        if (softwareRevision == null) {
            deviceHisImpl.setSoftwareRevision(StringPool.BLANK);
        } else {
            deviceHisImpl.setSoftwareRevision(softwareRevision);
        }

        if (macAddress == null) {
            deviceHisImpl.setMacAddress(StringPool.BLANK);
        } else {
            deviceHisImpl.setMacAddress(macAddress);
        }

        if (partNumber == null) {
            deviceHisImpl.setPartNumber(StringPool.BLANK);
        } else {
            deviceHisImpl.setPartNumber(partNumber);
        }

        if (specification == null) {
            deviceHisImpl.setSpecification(StringPool.BLANK);
        } else {
            deviceHisImpl.setSpecification(specification);
        }

        if (factoryOut == Long.MIN_VALUE) {
            deviceHisImpl.setFactoryOut(null);
        } else {
            deviceHisImpl.setFactoryOut(new Date(factoryOut));
        }

        deviceHisImpl.setPurchaseOrderId(purchaseOrderId);
        deviceHisImpl.setWarrantyFormId(warrantyFormId);
        deviceHisImpl.setStatus(status);

        deviceHisImpl.resetOriginalValues();

        return deviceHisImpl;
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
