package com.dasannetworks.vn.sb.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the UploadFile service. Represents a row in the &quot;tms_UploadFile&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.dasannetworks.vn.sb.model.impl.UploadFileModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.dasannetworks.vn.sb.model.impl.UploadFileImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UploadFile
 * @see com.dasannetworks.vn.sb.model.impl.UploadFileImpl
 * @see com.dasannetworks.vn.sb.model.impl.UploadFileModelImpl
 * @generated
 */
public interface UploadFileModel extends BaseModel<UploadFile>, GroupedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a upload file model instance should use the {@link UploadFile} interface instead.
     */

    /**
     * Returns the primary key of this upload file.
     *
     * @return the primary key of this upload file
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this upload file.
     *
     * @param primaryKey the primary key of this upload file
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the upload file ID of this upload file.
     *
     * @return the upload file ID of this upload file
     */
    public long getUploadFileId();

    /**
     * Sets the upload file ID of this upload file.
     *
     * @param uploadFileId the upload file ID of this upload file
     */
    public void setUploadFileId(long uploadFileId);

    /**
     * Returns the group ID of this upload file.
     *
     * @return the group ID of this upload file
     */
    @Override
    public long getGroupId();

    /**
     * Sets the group ID of this upload file.
     *
     * @param groupId the group ID of this upload file
     */
    @Override
    public void setGroupId(long groupId);

    /**
     * Returns the company ID of this upload file.
     *
     * @return the company ID of this upload file
     */
    @Override
    public long getCompanyId();

    /**
     * Sets the company ID of this upload file.
     *
     * @param companyId the company ID of this upload file
     */
    @Override
    public void setCompanyId(long companyId);

    /**
     * Returns the user ID of this upload file.
     *
     * @return the user ID of this upload file
     */
    @Override
    public long getUserId();

    /**
     * Sets the user ID of this upload file.
     *
     * @param userId the user ID of this upload file
     */
    @Override
    public void setUserId(long userId);

    /**
     * Returns the user uuid of this upload file.
     *
     * @return the user uuid of this upload file
     * @throws SystemException if a system exception occurred
     */
    @Override
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this upload file.
     *
     * @param userUuid the user uuid of this upload file
     */
    @Override
    public void setUserUuid(String userUuid);

    /**
     * Returns the user name of this upload file.
     *
     * @return the user name of this upload file
     */
    @AutoEscape
    @Override
    public String getUserName();

    /**
     * Sets the user name of this upload file.
     *
     * @param userName the user name of this upload file
     */
    @Override
    public void setUserName(String userName);

    /**
     * Returns the create date of this upload file.
     *
     * @return the create date of this upload file
     */
    @Override
    public Date getCreateDate();

    /**
     * Sets the create date of this upload file.
     *
     * @param createDate the create date of this upload file
     */
    @Override
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this upload file.
     *
     * @return the modified date of this upload file
     */
    @Override
    public Date getModifiedDate();

    /**
     * Sets the modified date of this upload file.
     *
     * @param modifiedDate the modified date of this upload file
     */
    @Override
    public void setModifiedDate(Date modifiedDate);

    /**
     * Returns the status of this upload file.
     *
     * @return the status of this upload file
     */
    @AutoEscape
    public String getStatus();

    /**
     * Sets the status of this upload file.
     *
     * @param status the status of this upload file
     */
    public void setStatus(String status);

    /**
     * Returns the file name of this upload file.
     *
     * @return the file name of this upload file
     */
    @AutoEscape
    public String getFileName();

    /**
     * Sets the file name of this upload file.
     *
     * @param fileName the file name of this upload file
     */
    public void setFileName(String fileName);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(com.dasannetworks.vn.sb.model.UploadFile uploadFile);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.dasannetworks.vn.sb.model.UploadFile> toCacheModel();

    @Override
    public com.dasannetworks.vn.sb.model.UploadFile toEscapedModel();

    @Override
    public com.dasannetworks.vn.sb.model.UploadFile toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}