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
    public String agentCode;
    public long warrantyStartDate;
    public long warrantyEndDate;
    public String originalSerialNumber;
    public String hisSerialNumbers;
    public String latestSerialNumber;
    public String remark;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(27);

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
        sb.append(", agentCode=");
        sb.append(agentCode);
        sb.append(", warrantyStartDate=");
        sb.append(warrantyStartDate);
        sb.append(", warrantyEndDate=");
        sb.append(warrantyEndDate);
        sb.append(", originalSerialNumber=");
        sb.append(originalSerialNumber);
        sb.append(", hisSerialNumbers=");
        sb.append(hisSerialNumbers);
        sb.append(", latestSerialNumber=");
        sb.append(latestSerialNumber);
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

        if (agentCode == null) {
            warrantyFormImpl.setAgentCode(StringPool.BLANK);
        } else {
            warrantyFormImpl.setAgentCode(agentCode);
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

        if (originalSerialNumber == null) {
            warrantyFormImpl.setOriginalSerialNumber(StringPool.BLANK);
        } else {
            warrantyFormImpl.setOriginalSerialNumber(originalSerialNumber);
        }

        if (hisSerialNumbers == null) {
            warrantyFormImpl.setHisSerialNumbers(StringPool.BLANK);
        } else {
            warrantyFormImpl.setHisSerialNumbers(hisSerialNumbers);
        }

        if (latestSerialNumber == null) {
            warrantyFormImpl.setLatestSerialNumber(StringPool.BLANK);
        } else {
            warrantyFormImpl.setLatestSerialNumber(latestSerialNumber);
        }

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
        agentCode = objectInput.readUTF();
        warrantyStartDate = objectInput.readLong();
        warrantyEndDate = objectInput.readLong();
        originalSerialNumber = objectInput.readUTF();
        hisSerialNumbers = objectInput.readUTF();
        latestSerialNumber = objectInput.readUTF();
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

        if (agentCode == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(agentCode);
        }

        objectOutput.writeLong(warrantyStartDate);
        objectOutput.writeLong(warrantyEndDate);

        if (originalSerialNumber == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(originalSerialNumber);
        }

        if (hisSerialNumbers == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(hisSerialNumbers);
        }

        if (latestSerialNumber == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(latestSerialNumber);
        }

        if (remark == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(remark);
        }
    }
}
