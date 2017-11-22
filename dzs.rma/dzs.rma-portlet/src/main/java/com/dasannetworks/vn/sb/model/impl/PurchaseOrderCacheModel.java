package com.dasannetworks.vn.sb.model.impl;

import com.dasannetworks.vn.sb.model.PurchaseOrder;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PurchaseOrder in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see PurchaseOrder
 * @generated
 */
public class PurchaseOrderCacheModel implements CacheModel<PurchaseOrder>,
    Externalizable {
    public long purchaseOrderId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public Long customerId;
    public long signDate;
    public long warrantyStartDate;
    public long warrantyEndDate;
    public String purchaseOrderNumber;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(23);

        sb.append("{purchaseOrderId=");
        sb.append(purchaseOrderId);
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
        sb.append(", customerId=");
        sb.append(customerId);
        sb.append(", signDate=");
        sb.append(signDate);
        sb.append(", warrantyStartDate=");
        sb.append(warrantyStartDate);
        sb.append(", warrantyEndDate=");
        sb.append(warrantyEndDate);
        sb.append(", purchaseOrderNumber=");
        sb.append(purchaseOrderNumber);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public PurchaseOrder toEntityModel() {
        PurchaseOrderImpl purchaseOrderImpl = new PurchaseOrderImpl();

        purchaseOrderImpl.setPurchaseOrderId(purchaseOrderId);
        purchaseOrderImpl.setCompanyId(companyId);
        purchaseOrderImpl.setUserId(userId);

        if (userName == null) {
            purchaseOrderImpl.setUserName(StringPool.BLANK);
        } else {
            purchaseOrderImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            purchaseOrderImpl.setCreateDate(null);
        } else {
            purchaseOrderImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            purchaseOrderImpl.setModifiedDate(null);
        } else {
            purchaseOrderImpl.setModifiedDate(new Date(modifiedDate));
        }

        purchaseOrderImpl.setCustomerId(customerId);

        if (signDate == Long.MIN_VALUE) {
            purchaseOrderImpl.setSignDate(null);
        } else {
            purchaseOrderImpl.setSignDate(new Date(signDate));
        }

        if (warrantyStartDate == Long.MIN_VALUE) {
            purchaseOrderImpl.setWarrantyStartDate(null);
        } else {
            purchaseOrderImpl.setWarrantyStartDate(new Date(warrantyStartDate));
        }

        if (warrantyEndDate == Long.MIN_VALUE) {
            purchaseOrderImpl.setWarrantyEndDate(null);
        } else {
            purchaseOrderImpl.setWarrantyEndDate(new Date(warrantyEndDate));
        }

        if (purchaseOrderNumber == null) {
            purchaseOrderImpl.setPurchaseOrderNumber(StringPool.BLANK);
        } else {
            purchaseOrderImpl.setPurchaseOrderNumber(purchaseOrderNumber);
        }

        purchaseOrderImpl.resetOriginalValues();

        return purchaseOrderImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        purchaseOrderId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        customerId = objectInput.readLong();
        signDate = objectInput.readLong();
        warrantyStartDate = objectInput.readLong();
        warrantyEndDate = objectInput.readLong();
        purchaseOrderNumber = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(purchaseOrderId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);
        objectOutput.writeLong(customerId);
        objectOutput.writeLong(signDate);
        objectOutput.writeLong(warrantyStartDate);
        objectOutput.writeLong(warrantyEndDate);

        if (purchaseOrderNumber == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(purchaseOrderNumber);
        }
    }
}
