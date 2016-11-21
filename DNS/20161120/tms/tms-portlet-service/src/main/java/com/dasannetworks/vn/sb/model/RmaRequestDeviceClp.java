package com.dasannetworks.vn.sb.model;

import com.dasannetworks.vn.sb.service.ClpSerializer;
import com.dasannetworks.vn.sb.service.RmaRequestDeviceLocalServiceUtil;
import com.dasannetworks.vn.sb.service.persistence.RmaRequestDevicePK;

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


public class RmaRequestDeviceClp extends BaseModelImpl<RmaRequestDevice>
    implements RmaRequestDevice {
    private long _rmaRequestId;
    private long _deviceId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _faultNote;
    private String _status;
    private BaseModel<?> _rmaRequestDeviceRemoteModel;
    private Class<?> _clpSerializerClass = com.dasannetworks.vn.sb.service.ClpSerializer.class;

    public RmaRequestDeviceClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return RmaRequestDevice.class;
    }

    @Override
    public String getModelClassName() {
        return RmaRequestDevice.class.getName();
    }

    @Override
    public RmaRequestDevicePK getPrimaryKey() {
        return new RmaRequestDevicePK(_rmaRequestId, _deviceId);
    }

    @Override
    public void setPrimaryKey(RmaRequestDevicePK primaryKey) {
        setRmaRequestId(primaryKey.rmaRequestId);
        setDeviceId(primaryKey.deviceId);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new RmaRequestDevicePK(_rmaRequestId, _deviceId);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((RmaRequestDevicePK) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("rmaRequestId", getRmaRequestId());
        attributes.put("deviceId", getDeviceId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("faultNote", getFaultNote());
        attributes.put("status", getStatus());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long rmaRequestId = (Long) attributes.get("rmaRequestId");

        if (rmaRequestId != null) {
            setRmaRequestId(rmaRequestId);
        }

        Long deviceId = (Long) attributes.get("deviceId");

        if (deviceId != null) {
            setDeviceId(deviceId);
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

        String faultNote = (String) attributes.get("faultNote");

        if (faultNote != null) {
            setFaultNote(faultNote);
        }

        String status = (String) attributes.get("status");

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

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setRmaRequestId", long.class);

                method.invoke(_rmaRequestDeviceRemoteModel, rmaRequestId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getDeviceId() {
        return _deviceId;
    }

    @Override
    public void setDeviceId(long deviceId) {
        _deviceId = deviceId;

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setDeviceId", long.class);

                method.invoke(_rmaRequestDeviceRemoteModel, deviceId);
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

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_rmaRequestDeviceRemoteModel, companyId);
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

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_rmaRequestDeviceRemoteModel, userId);
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

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_rmaRequestDeviceRemoteModel, userName);
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

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_rmaRequestDeviceRemoteModel, createDate);
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

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_rmaRequestDeviceRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getFaultNote() {
        return _faultNote;
    }

    @Override
    public void setFaultNote(String faultNote) {
        _faultNote = faultNote;

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setFaultNote", String.class);

                method.invoke(_rmaRequestDeviceRemoteModel, faultNote);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getStatus() {
        return _status;
    }

    @Override
    public void setStatus(String status) {
        _status = status;

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setStatus", String.class);

                method.invoke(_rmaRequestDeviceRemoteModel, status);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getRmaRequestDeviceRemoteModel() {
        return _rmaRequestDeviceRemoteModel;
    }

    public void setRmaRequestDeviceRemoteModel(
        BaseModel<?> rmaRequestDeviceRemoteModel) {
        _rmaRequestDeviceRemoteModel = rmaRequestDeviceRemoteModel;
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

        Class<?> remoteModelClass = _rmaRequestDeviceRemoteModel.getClass();

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

        Object returnValue = method.invoke(_rmaRequestDeviceRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            RmaRequestDeviceLocalServiceUtil.addRmaRequestDevice(this);
        } else {
            RmaRequestDeviceLocalServiceUtil.updateRmaRequestDevice(this);
        }
    }

    @Override
    public RmaRequestDevice toEscapedModel() {
        return (RmaRequestDevice) ProxyUtil.newProxyInstance(RmaRequestDevice.class.getClassLoader(),
            new Class[] { RmaRequestDevice.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        RmaRequestDeviceClp clone = new RmaRequestDeviceClp();

        clone.setRmaRequestId(getRmaRequestId());
        clone.setDeviceId(getDeviceId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setFaultNote(getFaultNote());
        clone.setStatus(getStatus());

        return clone;
    }

    @Override
    public int compareTo(RmaRequestDevice rmaRequestDevice) {
        RmaRequestDevicePK primaryKey = rmaRequestDevice.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof RmaRequestDeviceClp)) {
            return false;
        }

        RmaRequestDeviceClp rmaRequestDevice = (RmaRequestDeviceClp) obj;

        RmaRequestDevicePK primaryKey = rmaRequestDevice.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
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
        return getPrimaryKey().hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{rmaRequestId=");
        sb.append(getRmaRequestId());
        sb.append(", deviceId=");
        sb.append(getDeviceId());
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
        sb.append(", faultNote=");
        sb.append(getFaultNote());
        sb.append(", status=");
        sb.append(getStatus());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(31);

        sb.append("<model><model-name>");
        sb.append("com.dasannetworks.vn.sb.model.RmaRequestDevice");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>rmaRequestId</column-name><column-value><![CDATA[");
        sb.append(getRmaRequestId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>deviceId</column-name><column-value><![CDATA[");
        sb.append(getDeviceId());
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
            "<column><column-name>faultNote</column-name><column-value><![CDATA[");
        sb.append(getFaultNote());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>status</column-name><column-value><![CDATA[");
        sb.append(getStatus());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
