package com.dasannetworks.tms.sb.model;

import com.dasannetworks.tms.sb.service.ClpSerializer;
import com.dasannetworks.tms.sb.service.DeviceLocalServiceUtil;

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


public class DeviceClp extends BaseModelImpl<Device> implements Device {
    private long _deviceId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _modelname;
    private String _serialNumber;
    private String _hardwareRevision;
    private String _softwareRevision;
    private String _manufactureSerial;
    private String _macAddress;
    private String _partNumber;
    private String _specification;
    private Date _factoryOut;
    private long _uploadFileId;
    private BaseModel<?> _deviceRemoteModel;
    private Class<?> _clpSerializerClass = com.dasannetworks.tms.sb.service.ClpSerializer.class;

    public DeviceClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Device.class;
    }

    @Override
    public String getModelClassName() {
        return Device.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _deviceId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setDeviceId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _deviceId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("deviceId", getDeviceId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("modelname", getModelname());
        attributes.put("serialNumber", getSerialNumber());
        attributes.put("hardwareRevision", getHardwareRevision());
        attributes.put("softwareRevision", getSoftwareRevision());
        attributes.put("manufactureSerial", getManufactureSerial());
        attributes.put("macAddress", getMacAddress());
        attributes.put("partNumber", getPartNumber());
        attributes.put("specification", getSpecification());
        attributes.put("factoryOut", getFactoryOut());
        attributes.put("uploadFileId", getUploadFileId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long deviceId = (Long) attributes.get("deviceId");

        if (deviceId != null) {
            setDeviceId(deviceId);
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

        String modelname = (String) attributes.get("modelname");

        if (modelname != null) {
            setModelname(modelname);
        }

        String serialNumber = (String) attributes.get("serialNumber");

        if (serialNumber != null) {
            setSerialNumber(serialNumber);
        }

        String hardwareRevision = (String) attributes.get("hardwareRevision");

        if (hardwareRevision != null) {
            setHardwareRevision(hardwareRevision);
        }

        String softwareRevision = (String) attributes.get("softwareRevision");

        if (softwareRevision != null) {
            setSoftwareRevision(softwareRevision);
        }

        String manufactureSerial = (String) attributes.get("manufactureSerial");

        if (manufactureSerial != null) {
            setManufactureSerial(manufactureSerial);
        }

        String macAddress = (String) attributes.get("macAddress");

        if (macAddress != null) {
            setMacAddress(macAddress);
        }

        String partNumber = (String) attributes.get("partNumber");

        if (partNumber != null) {
            setPartNumber(partNumber);
        }

        String specification = (String) attributes.get("specification");

        if (specification != null) {
            setSpecification(specification);
        }

        Date factoryOut = (Date) attributes.get("factoryOut");

        if (factoryOut != null) {
            setFactoryOut(factoryOut);
        }

        Long uploadFileId = (Long) attributes.get("uploadFileId");

        if (uploadFileId != null) {
            setUploadFileId(uploadFileId);
        }
    }

    @Override
    public long getDeviceId() {
        return _deviceId;
    }

    @Override
    public void setDeviceId(long deviceId) {
        _deviceId = deviceId;

        if (_deviceRemoteModel != null) {
            try {
                Class<?> clazz = _deviceRemoteModel.getClass();

                Method method = clazz.getMethod("setDeviceId", long.class);

                method.invoke(_deviceRemoteModel, deviceId);
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

        if (_deviceRemoteModel != null) {
            try {
                Class<?> clazz = _deviceRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_deviceRemoteModel, groupId);
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

        if (_deviceRemoteModel != null) {
            try {
                Class<?> clazz = _deviceRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_deviceRemoteModel, companyId);
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

        if (_deviceRemoteModel != null) {
            try {
                Class<?> clazz = _deviceRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_deviceRemoteModel, userId);
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

        if (_deviceRemoteModel != null) {
            try {
                Class<?> clazz = _deviceRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_deviceRemoteModel, userName);
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

        if (_deviceRemoteModel != null) {
            try {
                Class<?> clazz = _deviceRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_deviceRemoteModel, createDate);
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

        if (_deviceRemoteModel != null) {
            try {
                Class<?> clazz = _deviceRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_deviceRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getModelname() {
        return _modelname;
    }

    @Override
    public void setModelname(String modelname) {
        _modelname = modelname;

        if (_deviceRemoteModel != null) {
            try {
                Class<?> clazz = _deviceRemoteModel.getClass();

                Method method = clazz.getMethod("setModelname", String.class);

                method.invoke(_deviceRemoteModel, modelname);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getSerialNumber() {
        return _serialNumber;
    }

    @Override
    public void setSerialNumber(String serialNumber) {
        _serialNumber = serialNumber;

        if (_deviceRemoteModel != null) {
            try {
                Class<?> clazz = _deviceRemoteModel.getClass();

                Method method = clazz.getMethod("setSerialNumber", String.class);

                method.invoke(_deviceRemoteModel, serialNumber);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getHardwareRevision() {
        return _hardwareRevision;
    }

    @Override
    public void setHardwareRevision(String hardwareRevision) {
        _hardwareRevision = hardwareRevision;

        if (_deviceRemoteModel != null) {
            try {
                Class<?> clazz = _deviceRemoteModel.getClass();

                Method method = clazz.getMethod("setHardwareRevision",
                        String.class);

                method.invoke(_deviceRemoteModel, hardwareRevision);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getSoftwareRevision() {
        return _softwareRevision;
    }

    @Override
    public void setSoftwareRevision(String softwareRevision) {
        _softwareRevision = softwareRevision;

        if (_deviceRemoteModel != null) {
            try {
                Class<?> clazz = _deviceRemoteModel.getClass();

                Method method = clazz.getMethod("setSoftwareRevision",
                        String.class);

                method.invoke(_deviceRemoteModel, softwareRevision);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getManufactureSerial() {
        return _manufactureSerial;
    }

    @Override
    public void setManufactureSerial(String manufactureSerial) {
        _manufactureSerial = manufactureSerial;

        if (_deviceRemoteModel != null) {
            try {
                Class<?> clazz = _deviceRemoteModel.getClass();

                Method method = clazz.getMethod("setManufactureSerial",
                        String.class);

                method.invoke(_deviceRemoteModel, manufactureSerial);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getMacAddress() {
        return _macAddress;
    }

    @Override
    public void setMacAddress(String macAddress) {
        _macAddress = macAddress;

        if (_deviceRemoteModel != null) {
            try {
                Class<?> clazz = _deviceRemoteModel.getClass();

                Method method = clazz.getMethod("setMacAddress", String.class);

                method.invoke(_deviceRemoteModel, macAddress);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPartNumber() {
        return _partNumber;
    }

    @Override
    public void setPartNumber(String partNumber) {
        _partNumber = partNumber;

        if (_deviceRemoteModel != null) {
            try {
                Class<?> clazz = _deviceRemoteModel.getClass();

                Method method = clazz.getMethod("setPartNumber", String.class);

                method.invoke(_deviceRemoteModel, partNumber);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getSpecification() {
        return _specification;
    }

    @Override
    public void setSpecification(String specification) {
        _specification = specification;

        if (_deviceRemoteModel != null) {
            try {
                Class<?> clazz = _deviceRemoteModel.getClass();

                Method method = clazz.getMethod("setSpecification", String.class);

                method.invoke(_deviceRemoteModel, specification);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getFactoryOut() {
        return _factoryOut;
    }

    @Override
    public void setFactoryOut(Date factoryOut) {
        _factoryOut = factoryOut;

        if (_deviceRemoteModel != null) {
            try {
                Class<?> clazz = _deviceRemoteModel.getClass();

                Method method = clazz.getMethod("setFactoryOut", Date.class);

                method.invoke(_deviceRemoteModel, factoryOut);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getUploadFileId() {
        return _uploadFileId;
    }

    @Override
    public void setUploadFileId(long uploadFileId) {
        _uploadFileId = uploadFileId;

        if (_deviceRemoteModel != null) {
            try {
                Class<?> clazz = _deviceRemoteModel.getClass();

                Method method = clazz.getMethod("setUploadFileId", long.class);

                method.invoke(_deviceRemoteModel, uploadFileId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getDeviceRemoteModel() {
        return _deviceRemoteModel;
    }

    public void setDeviceRemoteModel(BaseModel<?> deviceRemoteModel) {
        _deviceRemoteModel = deviceRemoteModel;
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

        Class<?> remoteModelClass = _deviceRemoteModel.getClass();

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

        Object returnValue = method.invoke(_deviceRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            DeviceLocalServiceUtil.addDevice(this);
        } else {
            DeviceLocalServiceUtil.updateDevice(this);
        }
    }

    @Override
    public Device toEscapedModel() {
        return (Device) ProxyUtil.newProxyInstance(Device.class.getClassLoader(),
            new Class[] { Device.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        DeviceClp clone = new DeviceClp();

        clone.setDeviceId(getDeviceId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setModelname(getModelname());
        clone.setSerialNumber(getSerialNumber());
        clone.setHardwareRevision(getHardwareRevision());
        clone.setSoftwareRevision(getSoftwareRevision());
        clone.setManufactureSerial(getManufactureSerial());
        clone.setMacAddress(getMacAddress());
        clone.setPartNumber(getPartNumber());
        clone.setSpecification(getSpecification());
        clone.setFactoryOut(getFactoryOut());
        clone.setUploadFileId(getUploadFileId());

        return clone;
    }

    @Override
    public int compareTo(Device device) {
        long primaryKey = device.getPrimaryKey();

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

        if (!(obj instanceof DeviceClp)) {
            return false;
        }

        DeviceClp device = (DeviceClp) obj;

        long primaryKey = device.getPrimaryKey();

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
        StringBundler sb = new StringBundler(35);

        sb.append("{deviceId=");
        sb.append(getDeviceId());
        sb.append(", groupId=");
        sb.append(getGroupId());
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
        sb.append(", modelname=");
        sb.append(getModelname());
        sb.append(", serialNumber=");
        sb.append(getSerialNumber());
        sb.append(", hardwareRevision=");
        sb.append(getHardwareRevision());
        sb.append(", softwareRevision=");
        sb.append(getSoftwareRevision());
        sb.append(", manufactureSerial=");
        sb.append(getManufactureSerial());
        sb.append(", macAddress=");
        sb.append(getMacAddress());
        sb.append(", partNumber=");
        sb.append(getPartNumber());
        sb.append(", specification=");
        sb.append(getSpecification());
        sb.append(", factoryOut=");
        sb.append(getFactoryOut());
        sb.append(", uploadFileId=");
        sb.append(getUploadFileId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(55);

        sb.append("<model><model-name>");
        sb.append("com.dasannetworks.tms.sb.model.Device");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>deviceId</column-name><column-value><![CDATA[");
        sb.append(getDeviceId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
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
            "<column><column-name>modelname</column-name><column-value><![CDATA[");
        sb.append(getModelname());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serialNumber</column-name><column-value><![CDATA[");
        sb.append(getSerialNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>hardwareRevision</column-name><column-value><![CDATA[");
        sb.append(getHardwareRevision());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>softwareRevision</column-name><column-value><![CDATA[");
        sb.append(getSoftwareRevision());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>manufactureSerial</column-name><column-value><![CDATA[");
        sb.append(getManufactureSerial());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>macAddress</column-name><column-value><![CDATA[");
        sb.append(getMacAddress());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>partNumber</column-name><column-value><![CDATA[");
        sb.append(getPartNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>specification</column-name><column-value><![CDATA[");
        sb.append(getSpecification());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>factoryOut</column-name><column-value><![CDATA[");
        sb.append(getFactoryOut());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>uploadFileId</column-name><column-value><![CDATA[");
        sb.append(getUploadFileId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
