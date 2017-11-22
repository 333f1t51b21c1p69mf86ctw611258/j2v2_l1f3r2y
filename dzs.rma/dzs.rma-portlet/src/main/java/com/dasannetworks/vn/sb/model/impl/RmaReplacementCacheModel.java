package com.dasannetworks.vn.sb.model.impl;

import com.dasannetworks.vn.sb.model.RmaReplacement;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing RmaReplacement in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see RmaReplacement
 * @generated
 */
public class RmaReplacementCacheModel implements CacheModel<RmaReplacement>,
    Externalizable {
    public long rmaRequestId;
    public String replacedNumber;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public int status;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(17);

        sb.append("{rmaRequestId=");
        sb.append(rmaRequestId);
        sb.append(", replacedNumber=");
        sb.append(replacedNumber);
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
        sb.append(", status=");
        sb.append(status);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public RmaReplacement toEntityModel() {
        RmaReplacementImpl rmaReplacementImpl = new RmaReplacementImpl();

        rmaReplacementImpl.setRmaRequestId(rmaRequestId);

        if (replacedNumber == null) {
            rmaReplacementImpl.setReplacedNumber(StringPool.BLANK);
        } else {
            rmaReplacementImpl.setReplacedNumber(replacedNumber);
        }

        rmaReplacementImpl.setCompanyId(companyId);
        rmaReplacementImpl.setUserId(userId);

        if (userName == null) {
            rmaReplacementImpl.setUserName(StringPool.BLANK);
        } else {
            rmaReplacementImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            rmaReplacementImpl.setCreateDate(null);
        } else {
            rmaReplacementImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            rmaReplacementImpl.setModifiedDate(null);
        } else {
            rmaReplacementImpl.setModifiedDate(new Date(modifiedDate));
        }

        rmaReplacementImpl.setStatus(status);

        rmaReplacementImpl.resetOriginalValues();

        return rmaReplacementImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        rmaRequestId = objectInput.readLong();
        replacedNumber = objectInput.readUTF();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        status = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(rmaRequestId);

        if (replacedNumber == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(replacedNumber);
        }

        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);
        objectOutput.writeInt(status);
    }
}
