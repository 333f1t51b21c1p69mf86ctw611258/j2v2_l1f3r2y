package com.dasannetworks.vn.sb.model;

import com.dasannetworks.vn.sb.service.ClpSerializer;
import com.dasannetworks.vn.sb.service.RmaRequestLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class RmaRequestClp extends BaseModelImpl<RmaRequest>
    implements RmaRequest {
    private long _rmaRequestId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private long _groupId;
    private String _rmaRequestNumber;
    private Long _customerId;
    private String _cusInCharge;
    private String _cusEmail;
    private String _cusPhone;
    private String _cusAddress;
    private Date _creatingEstReturnDate;
    private Date _creatingAssignedDate;
    private String _creatingNote;
    private String _creatingImportedFileName;
    private int _status;
    private BaseModel<?> _rmaRequestRemoteModel;
    private Class<?> _clpSerializerClass = com.dasannetworks.vn.sb.service.ClpSerializer.class;

    public RmaRequestClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return RmaRequest.class;
    }

    @Override
    public String getModelClassName() {
        return RmaRequest.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _rmaRequestId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setRmaRequestId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _rmaRequestId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("rmaRequestId", getRmaRequestId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("groupId", getGroupId());
        attributes.put("rmaRequestNumber", getRmaRequestNumber());
        attributes.put("customerId", getCustomerId());
        attributes.put("cusInCharge", getCusInCharge());
        attributes.put("cusEmail", getCusEmail());
        attributes.put("cusPhone", getCusPhone());
        attributes.put("cusAddress", getCusAddress());
        attributes.put("creatingEstReturnDate", getCreatingEstReturnDate());
        attributes.put("creatingAssignedDate", getCreatingAssignedDate());
        attributes.put("creatingNote", getCreatingNote());
        attributes.put("creatingImportedFileName", getCreatingImportedFileName());
        attributes.put("status", getStatus());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long rmaRequestId = (Long) attributes.get("rmaRequestId");

        if (rmaRequestId != null) {
            setRmaRequestId(rmaRequestId);
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

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        String rmaRequestNumber = (String) attributes.get("rmaRequestNumber");

        if (rmaRequestNumber != null) {
            setRmaRequestNumber(rmaRequestNumber);
        }

        Long customerId = (Long) attributes.get("customerId");

        if (customerId != null) {
            setCustomerId(customerId);
        }

        String cusInCharge = (String) attributes.get("cusInCharge");

        if (cusInCharge != null) {
            setCusInCharge(cusInCharge);
        }

        String cusEmail = (String) attributes.get("cusEmail");

        if (cusEmail != null) {
            setCusEmail(cusEmail);
        }

        String cusPhone = (String) attributes.get("cusPhone");

        if (cusPhone != null) {
            setCusPhone(cusPhone);
        }

        String cusAddress = (String) attributes.get("cusAddress");

        if (cusAddress != null) {
            setCusAddress(cusAddress);
        }

        Date creatingEstReturnDate = (Date) attributes.get(
                "creatingEstReturnDate");

        if (creatingEstReturnDate != null) {
            setCreatingEstReturnDate(creatingEstReturnDate);
        }

        Date creatingAssignedDate = (Date) attributes.get(
                "creatingAssignedDate");

        if (creatingAssignedDate != null) {
            setCreatingAssignedDate(creatingAssignedDate);
        }

        String creatingNote = (String) attributes.get("creatingNote");

        if (creatingNote != null) {
            setCreatingNote(creatingNote);
        }

        String creatingImportedFileName = (String) attributes.get(
                "creatingImportedFileName");

        if (creatingImportedFileName != null) {
            setCreatingImportedFileName(creatingImportedFileName);
        }

        Integer status = (Integer) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }
    }

    @Override
    public long getRmaRequestId() {
        return _rmaRequestId;
    }

    @Override
    public void setRmaRequestId(long rmaRequestId) {
        _rmaRequestId = rmaRequestId;

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setRmaRequestId", long.class);

                method.invoke(_rmaRequestRemoteModel, rmaRequestId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_rmaRequestRemoteModel, companyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_rmaRequestRemoteModel, userId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public String getUserName() {
        return _userName;
    }

    @Override
    public void setUserName(String userName) {
        _userName = userName;

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_rmaRequestRemoteModel, userName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_rmaRequestRemoteModel, createDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_rmaRequestRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_rmaRequestRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getRmaRequestNumber() {
        return _rmaRequestNumber;
    }

    @Override
    public void setRmaRequestNumber(String rmaRequestNumber) {
        _rmaRequestNumber = rmaRequestNumber;

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setRmaRequestNumber",
                        String.class);

                method.invoke(_rmaRequestRemoteModel, rmaRequestNumber);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Long getCustomerId() {
        return _customerId;
    }

    @Override
    public void setCustomerId(Long customerId) {
        _customerId = customerId;

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setCustomerId", Long.class);

                method.invoke(_rmaRequestRemoteModel, customerId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCusInCharge() {
        return _cusInCharge;
    }

    @Override
    public void setCusInCharge(String cusInCharge) {
        _cusInCharge = cusInCharge;

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setCusInCharge", String.class);

                method.invoke(_rmaRequestRemoteModel, cusInCharge);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCusEmail() {
        return _cusEmail;
    }

    @Override
    public void setCusEmail(String cusEmail) {
        _cusEmail = cusEmail;

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setCusEmail", String.class);

                method.invoke(_rmaRequestRemoteModel, cusEmail);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCusPhone() {
        return _cusPhone;
    }

    @Override
    public void setCusPhone(String cusPhone) {
        _cusPhone = cusPhone;

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setCusPhone", String.class);

                method.invoke(_rmaRequestRemoteModel, cusPhone);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCusAddress() {
        return _cusAddress;
    }

    @Override
    public void setCusAddress(String cusAddress) {
        _cusAddress = cusAddress;

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setCusAddress", String.class);

                method.invoke(_rmaRequestRemoteModel, cusAddress);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getCreatingEstReturnDate() {
        return _creatingEstReturnDate;
    }

    @Override
    public void setCreatingEstReturnDate(Date creatingEstReturnDate) {
        _creatingEstReturnDate = creatingEstReturnDate;

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setCreatingEstReturnDate",
                        Date.class);

                method.invoke(_rmaRequestRemoteModel, creatingEstReturnDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getCreatingAssignedDate() {
        return _creatingAssignedDate;
    }

    @Override
    public void setCreatingAssignedDate(Date creatingAssignedDate) {
        _creatingAssignedDate = creatingAssignedDate;

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setCreatingAssignedDate",
                        Date.class);

                method.invoke(_rmaRequestRemoteModel, creatingAssignedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCreatingNote() {
        return _creatingNote;
    }

    @Override
    public void setCreatingNote(String creatingNote) {
        _creatingNote = creatingNote;

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setCreatingNote", String.class);

                method.invoke(_rmaRequestRemoteModel, creatingNote);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCreatingImportedFileName() {
        return _creatingImportedFileName;
    }

    @Override
    public void setCreatingImportedFileName(String creatingImportedFileName) {
        _creatingImportedFileName = creatingImportedFileName;

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setCreatingImportedFileName",
                        String.class);

                method.invoke(_rmaRequestRemoteModel, creatingImportedFileName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStatus() {
        return _status;
    }

    @Override
    public void setStatus(int status) {
        _status = status;

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setStatus", int.class);

                method.invoke(_rmaRequestRemoteModel, status);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getRmaRequestRemoteModel() {
        return _rmaRequestRemoteModel;
    }

    public void setRmaRequestRemoteModel(BaseModel<?> rmaRequestRemoteModel) {
        _rmaRequestRemoteModel = rmaRequestRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _rmaRequestRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_rmaRequestRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            RmaRequestLocalServiceUtil.addRmaRequest(this);
        } else {
            RmaRequestLocalServiceUtil.updateRmaRequest(this);
        }
    }

    @Override
    public RmaRequest toEscapedModel() {
        return (RmaRequest) ProxyUtil.newProxyInstance(RmaRequest.class.getClassLoader(),
            new Class[] { RmaRequest.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        RmaRequestClp clone = new RmaRequestClp();

        clone.setRmaRequestId(getRmaRequestId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setGroupId(getGroupId());
        clone.setRmaRequestNumber(getRmaRequestNumber());
        clone.setCustomerId(getCustomerId());
        clone.setCusInCharge(getCusInCharge());
        clone.setCusEmail(getCusEmail());
        clone.setCusPhone(getCusPhone());
        clone.setCusAddress(getCusAddress());
        clone.setCreatingEstReturnDate(getCreatingEstReturnDate());
        clone.setCreatingAssignedDate(getCreatingAssignedDate());
        clone.setCreatingNote(getCreatingNote());
        clone.setCreatingImportedFileName(getCreatingImportedFileName());
        clone.setStatus(getStatus());

        return clone;
    }

    @Override
    public int compareTo(RmaRequest rmaRequest) {
        long primaryKey = rmaRequest.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof RmaRequestClp)) {
            return false;
        }

        RmaRequestClp rmaRequest = (RmaRequestClp) obj;

        long primaryKey = rmaRequest.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(37);

        sb.append("{rmaRequestId=");
        sb.append(getRmaRequestId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", userName=");
        sb.append(getUserName());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", rmaRequestNumber=");
        sb.append(getRmaRequestNumber());
        sb.append(", customerId=");
        sb.append(getCustomerId());
        sb.append(", cusInCharge=");
        sb.append(getCusInCharge());
        sb.append(", cusEmail=");
        sb.append(getCusEmail());
        sb.append(", cusPhone=");
        sb.append(getCusPhone());
        sb.append(", cusAddress=");
        sb.append(getCusAddress());
        sb.append(", creatingEstReturnDate=");
        sb.append(getCreatingEstReturnDate());
        sb.append(", creatingAssignedDate=");
        sb.append(getCreatingAssignedDate());
        sb.append(", creatingNote=");
        sb.append(getCreatingNote());
        sb.append(", creatingImportedFileName=");
        sb.append(getCreatingImportedFileName());
        sb.append(", status=");
        sb.append(getStatus());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(58);

        sb.append("<model><model-name>");
        sb.append("com.dasannetworks.vn.sb.model.RmaRequest");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>rmaRequestId</column-name><column-value><![CDATA[");
        sb.append(getRmaRequestId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userName</column-name><column-value><![CDATA[");
        sb.append(getUserName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>rmaRequestNumber</column-name><column-value><![CDATA[");
        sb.append(getRmaRequestNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>customerId</column-name><column-value><![CDATA[");
        sb.append(getCustomerId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>cusInCharge</column-name><column-value><![CDATA[");
        sb.append(getCusInCharge());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>cusEmail</column-name><column-value><![CDATA[");
        sb.append(getCusEmail());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>cusPhone</column-name><column-value><![CDATA[");
        sb.append(getCusPhone());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>cusAddress</column-name><column-value><![CDATA[");
        sb.append(getCusAddress());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>creatingEstReturnDate</column-name><column-value><![CDATA[");
        sb.append(getCreatingEstReturnDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>creatingAssignedDate</column-name><column-value><![CDATA[");
        sb.append(getCreatingAssignedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>creatingNote</column-name><column-value><![CDATA[");
        sb.append(getCreatingNote());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>creatingImportedFileName</column-name><column-value><![CDATA[");
        sb.append(getCreatingImportedFileName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>status</column-name><column-value><![CDATA[");
        sb.append(getStatus());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
