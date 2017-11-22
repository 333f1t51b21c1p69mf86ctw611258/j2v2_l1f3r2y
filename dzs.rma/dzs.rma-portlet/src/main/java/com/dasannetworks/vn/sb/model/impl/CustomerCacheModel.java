package com.dasannetworks.vn.sb.model.impl;

import com.dasannetworks.vn.sb.model.Customer;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Customer in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Customer
 * @generated
 */
public class CustomerCacheModel implements CacheModel<Customer>, Externalizable {
    public long customerId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String customerCode;
    public String customerName;
    public String inCharge;
    public String email;
    public String phone;
    public String address;
    public Long parentId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(27);

        sb.append("{customerId=");
        sb.append(customerId);
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
        sb.append(", customerName=");
        sb.append(customerName);
        sb.append(", inCharge=");
        sb.append(inCharge);
        sb.append(", email=");
        sb.append(email);
        sb.append(", phone=");
        sb.append(phone);
        sb.append(", address=");
        sb.append(address);
        sb.append(", parentId=");
        sb.append(parentId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Customer toEntityModel() {
        CustomerImpl customerImpl = new CustomerImpl();

        customerImpl.setCustomerId(customerId);
        customerImpl.setCompanyId(companyId);
        customerImpl.setUserId(userId);

        if (userName == null) {
            customerImpl.setUserName(StringPool.BLANK);
        } else {
            customerImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            customerImpl.setCreateDate(null);
        } else {
            customerImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            customerImpl.setModifiedDate(null);
        } else {
            customerImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (customerCode == null) {
            customerImpl.setCustomerCode(StringPool.BLANK);
        } else {
            customerImpl.setCustomerCode(customerCode);
        }

        if (customerName == null) {
            customerImpl.setCustomerName(StringPool.BLANK);
        } else {
            customerImpl.setCustomerName(customerName);
        }

        if (inCharge == null) {
            customerImpl.setInCharge(StringPool.BLANK);
        } else {
            customerImpl.setInCharge(inCharge);
        }

        if (email == null) {
            customerImpl.setEmail(StringPool.BLANK);
        } else {
            customerImpl.setEmail(email);
        }

        if (phone == null) {
            customerImpl.setPhone(StringPool.BLANK);
        } else {
            customerImpl.setPhone(phone);
        }

        if (address == null) {
            customerImpl.setAddress(StringPool.BLANK);
        } else {
            customerImpl.setAddress(address);
        }

        customerImpl.setParentId(parentId);

        customerImpl.resetOriginalValues();

        return customerImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        customerId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        customerCode = objectInput.readUTF();
        customerName = objectInput.readUTF();
        inCharge = objectInput.readUTF();
        email = objectInput.readUTF();
        phone = objectInput.readUTF();
        address = objectInput.readUTF();
        parentId = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(customerId);
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

        if (customerName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(customerName);
        }

        if (inCharge == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(inCharge);
        }

        if (email == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(email);
        }

        if (phone == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(phone);
        }

        if (address == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(address);
        }

        objectOutput.writeLong(parentId);
    }
}
