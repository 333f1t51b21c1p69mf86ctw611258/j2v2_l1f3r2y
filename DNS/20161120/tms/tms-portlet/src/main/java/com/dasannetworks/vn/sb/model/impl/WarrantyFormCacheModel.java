package com.dasannetworks.vn.sb.model.impl;

import com.dasannetworks.vn.sb.model.WarrantyForm;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing WarrantyForm in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see WarrantyForm
 * @generated
 */
public class WarrantyFormCacheModel implements CacheModel<WarrantyForm>,
    Externalizable {
    public long warrantyFormId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String customerCode;
    public long warrantyStartDate;
    public long warrantyEndDate;
    public long originalDeviceId;
    public long currentDeviceId;
    public String remark;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(25);

        sb.append("{warrantyFormId=");
        sb.append(warrantyFormId);
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
        sb.append(", warrantyStartDate=");
        sb.append(warrantyStartDate);
        sb.append(", warrantyEndDate=");
        sb.append(warrantyEndDate);
        sb.append(", originalDeviceId=");
        sb.append(originalDeviceId);
        sb.append(", currentDeviceId=");
        sb.append(currentDeviceId);
        sb.append(", remark=");
        sb.append(remark);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public WarrantyForm toEntityModel() {
        WarrantyFormImpl warrantyFormImpl = new WarrantyFormImpl();

        warrantyFormImpl.setWarrantyFormId(warrantyFormId);
        warrantyFormImpl.setCompanyId(companyId);
        warrantyFormImpl.setUserId(userId);

        if (userName == null) {
            warrantyFormImpl.setUserName(StringPool.BLANK);
        } else {
            warrantyFormImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            warrantyFormImpl.setCreateDate(null);
        } else {
            warrantyFormImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            warrantyFormImpl.setModifiedDate(null);
        } else {
            warrantyFormImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (customerCode == null) {
            warrantyFormImpl.setCustomerCode(StringPool.BLANK);
        } else {
            warrantyFormImpl.setCustomerCode(customerCode);
        }

        if (warrantyStartDate == Long.MIN_VALUE) {
            warrantyFormImpl.setWarrantyStartDate(null);
        } else {
            warrantyFormImpl.setWarrantyStartDate(new Date(warrantyStartDate));
        }

        if (warrantyEndDate == Long.MIN_VALUE) {
            warrantyFormImpl.setWarrantyEndDate(null);
        } else {
            warrantyFormImpl.setWarrantyEndDate(new Date(warrantyEndDate));
        }

        warrantyFormImpl.setOriginalDeviceId(originalDeviceId);
        warrantyFormImpl.setCurrentDeviceId(currentDeviceId);

        if (remark == null) {
            warrantyFormImpl.setRemark(StringPool.BLANK);
        } else {
            warrantyFormImpl.setRemark(remark);
        }

        warrantyFormImpl.resetOriginalValues();

        return warrantyFormImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        warrantyFormId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        customerCode = objectInput.readUTF();
        warrantyStartDate = objectInput.readLong();
        warrantyEndDate = objectInput.readLong();
        originalDeviceId = objectInput.readLong();
        currentDeviceId = objectInput.readLong();
        remark = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(warrantyFormId);
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

        objectOutput.writeLong(warrantyStartDate);
        objectOutput.writeLong(warrantyEndDate);
        objectOutput.writeLong(originalDeviceId);
        objectOutput.writeLong(currentDeviceId);

        if (remark == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(remark);
        }
    }
}
