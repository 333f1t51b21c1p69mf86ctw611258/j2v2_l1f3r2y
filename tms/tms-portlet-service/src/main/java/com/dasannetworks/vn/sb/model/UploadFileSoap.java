package com.dasannetworks.vn.sb.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.dasannetworks.vn.sb.service.http.UploadFileServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.dasannetworks.vn.sb.service.http.UploadFileServiceSoap
 * @generated
 */
public class UploadFileSoap implements Serializable {
    private long _uploadFileId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _status;
    private String _fileName;

    public UploadFileSoap() {
    }

    public static UploadFileSoap toSoapModel(UploadFile model) {
        UploadFileSoap soapModel = new UploadFileSoap();

        soapModel.setUploadFileId(model.getUploadFileId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setStatus(model.getStatus());
        soapModel.setFileName(model.getFileName());

        return soapModel;
    }

    public static UploadFileSoap[] toSoapModels(UploadFile[] models) {
        UploadFileSoap[] soapModels = new UploadFileSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static UploadFileSoap[][] toSoapModels(UploadFile[][] models) {
        UploadFileSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new UploadFileSoap[models.length][models[0].length];
        } else {
            soapModels = new UploadFileSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static UploadFileSoap[] toSoapModels(List<UploadFile> models) {
        List<UploadFileSoap> soapModels = new ArrayList<UploadFileSoap>(models.size());

        for (UploadFile model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new UploadFileSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _uploadFileId;
    }

    public void setPrimaryKey(long pk) {
        setUploadFileId(pk);
    }

    public long getUploadFileId() {
        return _uploadFileId;
    }

    public void setUploadFileId(long uploadFileId) {
        _uploadFileId = uploadFileId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public String getUserName() {
        return _userName;
    }

    public void setUserName(String userName) {
        _userName = userName;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public String getStatus() {
        return _status;
    }

    public void setStatus(String status) {
        _status = status;
    }

    public String getFileName() {
        return _fileName;
    }

    public void setFileName(String fileName) {
        _fileName = fileName;
    }
}
