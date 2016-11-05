package com.dasannetworks.vn.sb.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link UploadFile}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UploadFile
 * @generated
 */
public class UploadFileWrapper implements UploadFile, ModelWrapper<UploadFile> {
    private UploadFile _uploadFile;

    public UploadFileWrapper(UploadFile uploadFile) {
        _uploadFile = uploadFile;
    }

    @Override
    public Class<?> getModelClass() {
        return UploadFile.class;
    }

    @Override
    public String getModelClassName() {
        return UploadFile.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uploadFileId", getUploadFileId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("status", getStatus());
        attributes.put("fileName", getFileName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long uploadFileId = (Long) attributes.get("uploadFileId");

        if (uploadFileId != null) {
            setUploadFileId(uploadFileId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        String status = (String) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }

        String fileName = (String) attributes.get("fileName");

        if (fileName != null) {
            setFileName(fileName);
        }
    }

    /**
    * Returns the primary key of this upload file.
    *
    * @return the primary key of this upload file
    */
    @Override
    public long getPrimaryKey() {
        return _uploadFile.getPrimaryKey();
    }

    /**
    * Sets the primary key of this upload file.
    *
    * @param primaryKey the primary key of this upload file
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _uploadFile.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the upload file ID of this upload file.
    *
    * @return the upload file ID of this upload file
    */
    @Override
    public long getUploadFileId() {
        return _uploadFile.getUploadFileId();
    }

    /**
    * Sets the upload file ID of this upload file.
    *
    * @param uploadFileId the upload file ID of this upload file
    */
    @Override
    public void setUploadFileId(long uploadFileId) {
        _uploadFile.setUploadFileId(uploadFileId);
    }

    /**
    * Returns the group ID of this upload file.
    *
    * @return the group ID of this upload file
    */
    @Override
    public long getGroupId() {
        return _uploadFile.getGroupId();
    }

    /**
    * Sets the group ID of this upload file.
    *
    * @param groupId the group ID of this upload file
    */
    @Override
    public void setGroupId(long groupId) {
        _uploadFile.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this upload file.
    *
    * @return the company ID of this upload file
    */
    @Override
    public long getCompanyId() {
        return _uploadFile.getCompanyId();
    }

    /**
    * Sets the company ID of this upload file.
    *
    * @param companyId the company ID of this upload file
    */
    @Override
    public void setCompanyId(long companyId) {
        _uploadFile.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this upload file.
    *
    * @return the user ID of this upload file
    */
    @Override
    public long getUserId() {
        return _uploadFile.getUserId();
    }

    /**
    * Sets the user ID of this upload file.
    *
    * @param userId the user ID of this upload file
    */
    @Override
    public void setUserId(long userId) {
        _uploadFile.setUserId(userId);
    }

    /**
    * Returns the user uuid of this upload file.
    *
    * @return the user uuid of this upload file
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _uploadFile.getUserUuid();
    }

    /**
    * Sets the user uuid of this upload file.
    *
    * @param userUuid the user uuid of this upload file
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _uploadFile.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this upload file.
    *
    * @return the user name of this upload file
    */
    @Override
    public java.lang.String getUserName() {
        return _uploadFile.getUserName();
    }

    /**
    * Sets the user name of this upload file.
    *
    * @param userName the user name of this upload file
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _uploadFile.setUserName(userName);
    }

    /**
    * Returns the create date of this upload file.
    *
    * @return the create date of this upload file
    */
    @Override
    public java.util.Date getCreateDate() {
        return _uploadFile.getCreateDate();
    }

    /**
    * Sets the create date of this upload file.
    *
    * @param createDate the create date of this upload file
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _uploadFile.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this upload file.
    *
    * @return the modified date of this upload file
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _uploadFile.getModifiedDate();
    }

    /**
    * Sets the modified date of this upload file.
    *
    * @param modifiedDate the modified date of this upload file
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _uploadFile.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the status of this upload file.
    *
    * @return the status of this upload file
    */
    @Override
    public java.lang.String getStatus() {
        return _uploadFile.getStatus();
    }

    /**
    * Sets the status of this upload file.
    *
    * @param status the status of this upload file
    */
    @Override
    public void setStatus(java.lang.String status) {
        _uploadFile.setStatus(status);
    }

    /**
    * Returns the file name of this upload file.
    *
    * @return the file name of this upload file
    */
    @Override
    public java.lang.String getFileName() {
        return _uploadFile.getFileName();
    }

    /**
    * Sets the file name of this upload file.
    *
    * @param fileName the file name of this upload file
    */
    @Override
    public void setFileName(java.lang.String fileName) {
        _uploadFile.setFileName(fileName);
    }

    @Override
    public boolean isNew() {
        return _uploadFile.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _uploadFile.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _uploadFile.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _uploadFile.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _uploadFile.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _uploadFile.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _uploadFile.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _uploadFile.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _uploadFile.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _uploadFile.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _uploadFile.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new UploadFileWrapper((UploadFile) _uploadFile.clone());
    }

    @Override
    public int compareTo(com.dasannetworks.vn.sb.model.UploadFile uploadFile) {
        return _uploadFile.compareTo(uploadFile);
    }

    @Override
    public int hashCode() {
        return _uploadFile.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.dasannetworks.vn.sb.model.UploadFile> toCacheModel() {
        return _uploadFile.toCacheModel();
    }

    @Override
    public com.dasannetworks.vn.sb.model.UploadFile toEscapedModel() {
        return new UploadFileWrapper(_uploadFile.toEscapedModel());
    }

    @Override
    public com.dasannetworks.vn.sb.model.UploadFile toUnescapedModel() {
        return new UploadFileWrapper(_uploadFile.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _uploadFile.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _uploadFile.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _uploadFile.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof UploadFileWrapper)) {
            return false;
        }

        UploadFileWrapper uploadFileWrapper = (UploadFileWrapper) obj;

        if (Validator.equals(_uploadFile, uploadFileWrapper._uploadFile)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public UploadFile getWrappedUploadFile() {
        return _uploadFile;
    }

    @Override
    public UploadFile getWrappedModel() {
        return _uploadFile;
    }

    @Override
    public void resetOriginalValues() {
        _uploadFile.resetOriginalValues();
    }
}
