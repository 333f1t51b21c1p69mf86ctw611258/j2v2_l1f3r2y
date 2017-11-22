package com.dasannetworks.vn.sb.model;

import com.dasannetworks.vn.sb.service.ClpSerializer;
import com.dasannetworks.vn.sb.service.DeviceExtOrderLocalServiceUtil;

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


public class DeviceExtOrderClp extends BaseModelImpl<DeviceExtOrder>
    implements DeviceExtOrder {
    private long _deviceExtOrderId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _deviceExtOrderNumber;
    private String _note;
    private BaseModel<?> _deviceExtOrderRemoteModel;
    private Class<?> _clpSerializerClass = com.dasannetworks.vn.sb.service.ClpSerializer.class;

    public DeviceExtOrderClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return DeviceExtOrder.class;
    }

    @Override
    public String getModelClassName() {
        return DeviceExtOrder.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _deviceExtOrderId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setDeviceExtOrderId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _deviceExtOrderId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("deviceExtOrderId", getDeviceExtOrderId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("deviceExtOrderNumber", getDeviceExtOrderNumber());
        attributes.put("note", getNote());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long deviceExtOrderId = (Long) attributes.get("deviceExtOrderId");

        if (deviceExtOrderId != null) {
            setDeviceExtOrderId(deviceExtOrderId);
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

        String deviceExtOrderNumber = (String) attributes.get(
                "deviceExtOrderNumber");

        if (deviceExtOrderNumber != null) {
            setDeviceExtOrderNumber(deviceExtOrderNumber);
        }

        String note = (String) attributes.get("note");

        if (note != null) {
            setNote(note);
        }
    }

    @Override
    public long getDeviceExtOrderId() {
        return _deviceExtOrderId;
    }

    @Override
    public void setDeviceExtOrderId(long deviceExtOrderId) {
        _deviceExtOrderId = deviceExtOrderId;

        if (_deviceExtOrderRemoteModel != null) {
            try {
                Class<?> clazz = _deviceExtOrderRemoteModel.getClass();

                Method method = clazz.getMethod("setDeviceExtOrderId",
                        long.class);

                method.invoke(_deviceExtOrderRemoteModel, deviceExtOrderId);
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

        if (_deviceExtOrderRemoteModel != null) {
            try {
                Class<?> clazz = _deviceExtOrderRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_deviceExtOrderRemoteModel, companyId);
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

        if (_deviceExtOrderRemoteModel != null) {
            try {
                Class<?> clazz = _deviceExtOrderRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_deviceExtOrderRemoteModel, userId);
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

        if (_deviceExtOrderRemoteModel != null) {
            try {
                Class<?> clazz = _deviceExtOrderRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_deviceExtOrderRemoteModel, userName);
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

        if (_deviceExtOrderRemoteModel != null) {
            try {
                Class<?> clazz = _deviceExtOrderRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_deviceExtOrderRemoteModel, createDate);
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

        if (_deviceExtOrderRemoteModel != null) {
            try {
                Class<?> clazz = _deviceExtOrderRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_deviceExtOrderRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDeviceExtOrderNumber() {
        return _deviceExtOrderNumber;
    }

    @Override
    public void setDeviceExtOrderNumber(String deviceExtOrderNumber) {
        _deviceExtOrderNumber = deviceExtOrderNumber;

        if (_deviceExtOrderRemoteModel != null) {
            try {
                Class<?> clazz = _deviceExtOrderRemoteModel.getClass();

                Method method = clazz.getMethod("setDeviceExtOrderNumber",
                        String.class);

                method.invoke(_deviceExtOrderRemoteModel, deviceExtOrderNumber);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getNote() {
        return _note;
    }

    @Override
    public void setNote(String note) {
        _note = note;

        if (_deviceExtOrderRemoteModel != null) {
            try {
                Class<?> clazz = _deviceExtOrderRemoteModel.getClass();

                Method method = clazz.getMethod("setNote", String.class);

                method.invoke(_deviceExtOrderRemoteModel, note);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getDeviceExtOrderRemoteModel() {
        return _deviceExtOrderRemoteModel;
    }

    public void setDeviceExtOrderRemoteModel(
        BaseModel<?> deviceExtOrderRemoteModel) {
        _deviceExtOrderRemoteModel = deviceExtOrderRemoteModel;
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

        Class<?> remoteModelClass = _deviceExtOrderRemoteModel.getClass();

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

        Object returnValue = method.invoke(_deviceExtOrderRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            DeviceExtOrderLocalServiceUtil.addDeviceExtOrder(this);
        } else {
            DeviceExtOrderLocalServiceUtil.updateDeviceExtOrder(this);
        }
    }

    @Override
    public DeviceExtOrder toEscapedModel() {
        return (DeviceExtOrder) ProxyUtil.newProxyInstance(DeviceExtOrder.class.getClassLoader(),
            new Class[] { DeviceExtOrder.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        DeviceExtOrderClp clone = new DeviceExtOrderClp();

        clone.setDeviceExtOrderId(getDeviceExtOrderId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setDeviceExtOrderNumber(getDeviceExtOrderNumber());
        clone.setNote(getNote());

        return clone;
    }

    @Override
    public int compareTo(DeviceExtOrder deviceExtOrder) {
        long primaryKey = deviceExtOrder.getPrimaryKey();

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

        if (!(obj instanceof DeviceExtOrderClp)) {
            return false;
        }

        DeviceExtOrderClp deviceExtOrder = (DeviceExtOrderClp) obj;

        long primaryKey = deviceExtOrder.getPrimaryKey();

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
        StringBundler sb = new StringBundler(17);

        sb.append("{deviceExtOrderId=");
        sb.append(getDeviceExtOrderId());
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
        sb.append(", deviceExtOrderNumber=");
        sb.append(getDeviceExtOrderNumber());
        sb.append(", note=");
        sb.append(getNote());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(28);

        sb.append("<model><model-name>");
        sb.append("com.dasannetworks.vn.sb.model.DeviceExtOrder");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>deviceExtOrderId</column-name><column-value><![CDATA[");
        sb.append(getDeviceExtOrderId());
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
            "<column><column-name>deviceExtOrderNumber</column-name><column-value><![CDATA[");
        sb.append(getDeviceExtOrderNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>note</column-name><column-value><![CDATA[");
        sb.append(getNote());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
