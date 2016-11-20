package com.dasannetworks.vn.sb.model;

import com.dasannetworks.vn.sb.service.ClpSerializer;
import com.dasannetworks.vn.sb.service.persistence.HandOverDevicePK;

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


public class HandOverDeviceClp extends BaseModelImpl<HandOverDevice>
    implements HandOverDevice {
    private long _handOverFormId;
    private long _deviceId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _faultNote;
    private String _status;
    private BaseModel<?> _handOverDeviceRemoteModel;
    private Class<?> _clpSerializerClass = com.dasannetworks.vn.sb.service.ClpSerializer.class;

    public HandOverDeviceClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return HandOverDevice.class;
    }

    @Override
    public String getModelClassName() {
        return HandOverDevice.class.getName();
    }

    @Override
    public HandOverDevicePK getPrimaryKey() {
        return new HandOverDevicePK(_handOverFormId, _deviceId);
    }

    @Override
    public void setPrimaryKey(HandOverDevicePK primaryKey) {
        setHandOverFormId(primaryKey.handOverFormId);
        setDeviceId(primaryKey.deviceId);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new HandOverDevicePK(_handOverFormId, _deviceId);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((HandOverDevicePK) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("handOverFormId", getHandOverFormId());
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
        Long handOverFormId = (Long) attributes.get("handOverFormId");

        if (handOverFormId != null) {
            setHandOverFormId(handOverFormId);
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
    public long getHandOverFormId() {
        return _handOverFormId;
    }

    @Override
    public void setHandOverFormId(long handOverFormId) {
        _handOverFormId = handOverFormId;

        if (_handOverDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _handOverDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setHandOverFormId", long.class);

                method.invoke(_handOverDeviceRemoteModel, handOverFormId);
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

        if (_handOverDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _handOverDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setDeviceId", long.class);

                method.invoke(_handOverDeviceRemoteModel, deviceId);
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

        if (_handOverDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _handOverDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_handOverDeviceRemoteModel, companyId);
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

        if (_handOverDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _handOverDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_handOverDeviceRemoteModel, userId);
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

        if (_handOverDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _handOverDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_handOverDeviceRemoteModel, userName);
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

        if (_handOverDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _handOverDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_handOverDeviceRemoteModel, createDate);
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

        if (_handOverDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _handOverDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_handOverDeviceRemoteModel, modifiedDate);
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

        if (_handOverDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _handOverDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setFaultNote", String.class);

                method.invoke(_handOverDeviceRemoteModel, faultNote);
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

        if (_handOverDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _handOverDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setStatus", String.class);

                method.invoke(_handOverDeviceRemoteModel, status);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getHandOverDeviceRemoteModel() {
        return _handOverDeviceRemoteModel;
    }

    public void setHandOverDeviceRemoteModel(
        BaseModel<?> handOverDeviceRemoteModel) {
        _handOverDeviceRemoteModel = handOverDeviceRemoteModel;
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

        Class<?> remoteModelClass = _handOverDeviceRemoteModel.getClass();

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

        Object returnValue = method.invoke(_handOverDeviceRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public HandOverDevice toEscapedModel() {
        return (HandOverDevice) ProxyUtil.newProxyInstance(HandOverDevice.class.getClassLoader(),
            new Class[] { HandOverDevice.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        HandOverDeviceClp clone = new HandOverDeviceClp();

        clone.setHandOverFormId(getHandOverFormId());
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
    public int compareTo(HandOverDevice handOverDevice) {
        HandOverDevicePK primaryKey = handOverDevice.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof HandOverDeviceClp)) {
            return false;
        }

        HandOverDeviceClp handOverDevice = (HandOverDeviceClp) obj;

        HandOverDevicePK primaryKey = handOverDevice.getPrimaryKey();

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

        sb.append("{handOverFormId=");
        sb.append(getHandOverFormId());
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
        sb.append("com.dasannetworks.vn.sb.model.HandOverDevice");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>handOverFormId</column-name><column-value><![CDATA[");
        sb.append(getHandOverFormId());
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
