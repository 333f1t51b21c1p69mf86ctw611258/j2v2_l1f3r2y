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
    public long createDate;
    public long modifiedDate;
    public String customer;
    public long signDate;
    public String purchaseOrderNumber;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{purchaseOrderId=");
        sb.append(purchaseOrderId);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", customer=");
        sb.append(customer);
        sb.append(", signDate=");
        sb.append(signDate);
        sb.append(", purchaseOrderNumber=");
        sb.append(purchaseOrderNumber);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public PurchaseOrder toEntityModel() {
        PurchaseOrderImpl purchaseOrderImpl = new PurchaseOrderImpl();

        purchaseOrderImpl.setPurchaseOrderId(purchaseOrderId);

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

        if (customer == null) {
            purchaseOrderImpl.setCustomer(StringPool.BLANK);
        } else {
            purchaseOrderImpl.setCustomer(customer);
        }

        if (signDate == Long.MIN_VALUE) {
            purchaseOrderImpl.setSignDate(null);
        } else {
            purchaseOrderImpl.setSignDate(new Date(signDate));
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
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        customer = objectInput.readUTF();
        signDate = objectInput.readLong();
        purchaseOrderNumber = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(purchaseOrderId);
        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        if (customer == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(customer);
        }

        objectOutput.writeLong(signDate);

        if (purchaseOrderNumber == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(purchaseOrderNumber);
        }
    }
}
