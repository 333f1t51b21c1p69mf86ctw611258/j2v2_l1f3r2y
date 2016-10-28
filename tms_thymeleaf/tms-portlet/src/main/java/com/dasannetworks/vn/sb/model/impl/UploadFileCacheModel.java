package com.dasannetworks.vn.sb.model.impl;

import com.dasannetworks.vn.sb.model.UploadFile;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing UploadFile in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see UploadFile
 * @generated
 */
public class UploadFileCacheModel implements CacheModel<UploadFile>,
    Externalizable {
    public long uploadFileId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String status;
    public String fileName;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{uploadFileId=");
        sb.append(uploadFileId);
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
        sb.append(", status=");
        sb.append(status);
        sb.append(", fileName=");
        sb.append(fileName);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public UploadFile toEntityModel() {
        UploadFileImpl uploadFileImpl = new UploadFileImpl();

        uploadFileImpl.setUploadFileId(uploadFileId);
        uploadFileImpl.setGroupId(groupId);
        uploadFileImpl.setCompanyId(companyId);
        uploadFileImpl.setUserId(userId);

        if (userName == null) {
            uploadFileImpl.setUserName(StringPool.BLANK);
        } else {
            uploadFileImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            uploadFileImpl.setCreateDate(null);
        } else {
            uploadFileImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            uploadFileImpl.setModifiedDate(null);
        } else {
            uploadFileImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (status == null) {
            uploadFileImpl.setStatus(StringPool.BLANK);
        } else {
            uploadFileImpl.setStatus(status);
        }

        if (fileName == null) {
            uploadFileImpl.setFileName(StringPool.BLANK);
        } else {
            uploadFileImpl.setFileName(fileName);
        }

        uploadFileImpl.resetOriginalValues();

        return uploadFileImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uploadFileId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        status = objectInput.readUTF();
        fileName = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(uploadFileId);
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

        if (status == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(status);
        }

        if (fileName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(fileName);
        }
    }
}
