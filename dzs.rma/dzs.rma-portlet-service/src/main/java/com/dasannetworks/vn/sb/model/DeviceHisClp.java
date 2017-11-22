package com.dasannetworks.vn.sb.model;

import com.dasannetworks.vn.sb.service.ClpSerializer;
import com.dasannetworks.vn.sb.service.DeviceHisLocalServiceUtil;

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


public class DeviceHisClp extends BaseModelImpl<DeviceHis> implements DeviceHis {
    private long _deviceId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _modelName;
    private String _serialNumber;
    private String _gponSerialNumber;
    private String _boxSerialNumber;
    private String _customerSerialNumber;
    private String _manufacturerSerialNumber;
    private String _hardwareRevision;
    private String _softwareRevision;
    private String _macAddress;
    private String _partNumber;
    private String _specification;
    private Date _factoryOut;
    private Long _purchaseOrderId;
    private Long _warrantyFormId;
    private int _status;
    private BaseModel<?> _deviceHisRemoteModel;
    private Class<?> _clpSerializerClass = com.dasannetworks.vn.sb.service.ClpSerializer.class;

    public DeviceHisClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return DeviceHis.class;
    }

    @Override
    public String getModelClassName() {
        return DeviceHis.class.getName();
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
        attributes.put("modelName", getModelName());
        attributes.put("serialNumber", getSerialNumber());
        attributes.put("gponSerialNumber", getGponSerialNumber());
        attributes.put("boxSerialNumber", getBoxSerialNumber());
        attributes.put("customerSerialNumber", getCustomerSerialNumber());
        attributes.put("manufacturerSerialNumber", getManufacturerSerialNumber());
        attributes.put("hardwareRevision", getHardwareRevision());
        attributes.put("softwareRevision", getSoftwareRevision());
        attributes.put("macAddress", getMacAddress());
        attributes.put("partNumber", getPartNumber());
        attributes.put("specification", getSpecification());
        attributes.put("factoryOut", getFactoryOut());
        attributes.put("purchaseOrderId", getPurchaseOrderId());
        attributes.put("warrantyFormId", getWarrantyFormId());
        attributes.put("status", getStatus());

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

        String modelName = (String) attributes.get("modelName");

        if (modelName != null) {
            setModelName(modelName);
        }

        String serialNumber = (String) attributes.get("serialNumber");

        if (serialNumber != null) {
            setSerialNumber(serialNumber);
        }

        String gponSerialNumber = (String) attributes.get("gponSerialNumber");

        if (gponSerialNumber != null) {
            setGponSerialNumber(gponSerialNumber);
        }

        String boxSerialNumber = (String) attributes.get("boxSerialNumber");

        if (boxSerialNumber != null) {
            setBoxSerialNumber(boxSerialNumber);
        }

        String customerSerialNumber = (String) attributes.get(
                "customerSerialNumber");

        if (customerSerialNumber != null) {
            setCustomerSerialNumber(customerSerialNumber);
        }

        String manufacturerSerialNumber = (String) attributes.get(
                "manufacturerSerialNumber");

        if (manufacturerSerialNumber != null) {
            setManufacturerSerialNumber(manufacturerSerialNumber);
        }

        String hardwareRevision = (String) attributes.get("hardwareRevision");

        if (hardwareRevision != null) {
            setHardwareRevision(hardwareRevision);
        }

        String softwareRevision = (String) attributes.get("softwareRevision");

        if (softwareRevision != null) {
            setSoftwareRevision(softwareRevision);
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

        Long purchaseOrderId = (Long) attributes.get("purchaseOrderId");

        if (purchaseOrderId != null) {
            setPurchaseOrderId(purchaseOrderId);
        }

        Long warrantyFormId = (Long) attributes.get("warrantyFormId");

        if (warrantyFormId != null) {
            setWarrantyFormId(warrantyFormId);
        }

        Integer status = (Integer) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }
    }

    @Override
    public long getDeviceId() {
        return _deviceId;
    }

    @Override
    public void setDeviceId(long deviceId) {
        _deviceId = deviceId;

        if (_deviceHisRemoteModel != null) {
            try {
                Class<?> clazz = _deviceHisRemoteModel.getClass();

                Method method = clazz.getMethod("setDeviceId", long.class);

                method.invoke(_deviceHisRemoteModel, deviceId);
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

        if (_deviceHisRemoteModel != null) {
            try {
                Class<?> clazz = _deviceHisRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_deviceHisRemoteModel, groupId);
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

        if (_deviceHisRemoteModel != null) {
            try {
                Class<?> clazz = _deviceHisRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_deviceHisRemoteModel, companyId);
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

        if (_deviceHisRemoteModel != null) {
            try {
                Class<?> clazz = _deviceHisRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_deviceHisRemoteModel, userId);
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

        if (_deviceHisRemoteModel != null) {
            try {
                Class<?> clazz = _deviceHisRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_deviceHisRemoteModel, userName);
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

        if (_deviceHisRemoteModel != null) {
            try {
                Class<?> clazz = _deviceHisRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_deviceHisRemoteModel, createDate);
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

        if (_deviceHisRemoteModel != null) {
            try {
                Class<?> clazz = _deviceHisRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_deviceHisRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getModelName() {
        return _modelName;
    }

    @Override
    public void setModelName(String modelName) {
        _modelName = modelName;

        if (_deviceHisRemoteModel != null) {
            try {
                Class<?> clazz = _deviceHisRemoteModel.getClass();

                Method method = clazz.getMethod("setModelName", String.class);

                method.invoke(_deviceHisRemoteModel, modelName);
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

        if (_deviceHisRemoteModel != null) {
            try {
                Class<?> clazz = _deviceHisRemoteModel.getClass();

                Method method = clazz.getMethod("setSerialNumber", String.class);

                method.invoke(_deviceHisRemoteModel, serialNumber);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getGponSerialNumber() {
        return _gponSerialNumber;
    }

    @Override
    public void setGponSerialNumber(String gponSerialNumber) {
        _gponSerialNumber = gponSerialNumber;

        if (_deviceHisRemoteModel != null) {
            try {
                Class<?> clazz = _deviceHisRemoteModel.getClass();

                Method method = clazz.getMethod("setGponSerialNumber",
                        String.class);

                method.invoke(_deviceHisRemoteModel, gponSerialNumber);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getBoxSerialNumber() {
        return _boxSerialNumber;
    }

    @Override
    public void setBoxSerialNumber(String boxSerialNumber) {
        _boxSerialNumber = boxSerialNumber;

        if (_deviceHisRemoteModel != null) {
            try {
                Class<?> clazz = _deviceHisRemoteModel.getClass();

                Method method = clazz.getMethod("setBoxSerialNumber",
                        String.class);

                method.invoke(_deviceHisRemoteModel, boxSerialNumber);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCustomerSerialNumber() {
        return _customerSerialNumber;
    }

    @Override
    public void setCustomerSerialNumber(String customerSerialNumber) {
        _customerSerialNumber = customerSerialNumber;

        if (_deviceHisRemoteModel != null) {
            try {
                Class<?> clazz = _deviceHisRemoteModel.getClass();

                Method method = clazz.getMethod("setCustomerSerialNumber",
                        String.class);

                method.invoke(_deviceHisRemoteModel, customerSerialNumber);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getManufacturerSerialNumber() {
        return _manufacturerSerialNumber;
    }

    @Override
    public void setManufacturerSerialNumber(String manufacturerSerialNumber) {
        _manufacturerSerialNumber = manufacturerSerialNumber;

        if (_deviceHisRemoteModel != null) {
            try {
                Class<?> clazz = _deviceHisRemoteModel.getClass();

                Method method = clazz.getMethod("setManufacturerSerialNumber",
                        String.class);

                method.invoke(_deviceHisRemoteModel, manufacturerSerialNumber);
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

        if (_deviceHisRemoteModel != null) {
            try {
                Class<?> clazz = _deviceHisRemoteModel.getClass();

                Method method = clazz.getMethod("setHardwareRevision",
                        String.class);

                method.invoke(_deviceHisRemoteModel, hardwareRevision);
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

        if (_deviceHisRemoteModel != null) {
            try {
                Class<?> clazz = _deviceHisRemoteModel.getClass();

                Method method = clazz.getMethod("setSoftwareRevision",
                        String.class);

                method.invoke(_deviceHisRemoteModel, softwareRevision);
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

        if (_deviceHisRemoteModel != null) {
            try {
                Class<?> clazz = _deviceHisRemoteModel.getClass();

                Method method = clazz.getMethod("setMacAddress", String.class);

                method.invoke(_deviceHisRemoteModel, macAddress);
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

        if (_deviceHisRemoteModel != null) {
            try {
                Class<?> clazz = _deviceHisRemoteModel.getClass();

                Method method = clazz.getMethod("setPartNumber", String.class);

                method.invoke(_deviceHisRemoteModel, partNumber);
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

        if (_deviceHisRemoteModel != null) {
            try {
                Class<?> clazz = _deviceHisRemoteModel.getClass();

                Method method = clazz.getMethod("setSpecification", String.class);

                method.invoke(_deviceHisRemoteModel, specification);
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

        if (_deviceHisRemoteModel != null) {
            try {
                Class<?> clazz = _deviceHisRemoteModel.getClass();

                Method method = clazz.getMethod("setFactoryOut", Date.class);

                method.invoke(_deviceHisRemoteModel, factoryOut);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Long getPurchaseOrderId() {
        return _purchaseOrderId;
    }

    @Override
    public void setPurchaseOrderId(Long purchaseOrderId) {
        _purchaseOrderId = purchaseOrderId;

        if (_deviceHisRemoteModel != null) {
            try {
                Class<?> clazz = _deviceHisRemoteModel.getClass();

                Method method = clazz.getMethod("setPurchaseOrderId", Long.class);

                method.invoke(_deviceHisRemoteModel, purchaseOrderId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Long getWarrantyFormId() {
        return _warrantyFormId;
    }

    @Override
    public void setWarrantyFormId(Long warrantyFormId) {
        _warrantyFormId = warrantyFormId;

        if (_deviceHisRemoteModel != null) {
            try {
                Class<?> clazz = _deviceHisRemoteModel.getClass();

                Method method = clazz.getMethod("setWarrantyFormId", Long.class);

                method.invoke(_deviceHisRemoteModel, warrantyFormId);
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

        if (_deviceHisRemoteModel != null) {
            try {
                Class<?> clazz = _deviceHisRemoteModel.getClass();

                Method method = clazz.getMethod("setStatus", int.class);

                method.invoke(_deviceHisRemoteModel, status);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getDeviceHisRemoteModel() {
        return _deviceHisRemoteModel;
    }

    public void setDeviceHisRemoteModel(BaseModel<?> deviceHisRemoteModel) {
        _deviceHisRemoteModel = deviceHisRemoteModel;
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

        Class<?> remoteModelClass = _deviceHisRemoteModel.getClass();

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

        Object returnValue = method.invoke(_deviceHisRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            DeviceHisLocalServiceUtil.addDeviceHis(this);
        } else {
            DeviceHisLocalServiceUtil.updateDeviceHis(this);
        }
    }

    @Override
    public DeviceHis toEscapedModel() {
        return (DeviceHis) ProxyUtil.newProxyInstance(DeviceHis.class.getClassLoader(),
            new Class[] { DeviceHis.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        DeviceHisClp clone = new DeviceHisClp();

        clone.setDeviceId(getDeviceId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setModelName(getModelName());
        clone.setSerialNumber(getSerialNumber());
        clone.setGponSerialNumber(getGponSerialNumber());
        clone.setBoxSerialNumber(getBoxSerialNumber());
        clone.setCustomerSerialNumber(getCustomerSerialNumber());
        clone.setManufacturerSerialNumber(getManufacturerSerialNumber());
        clone.setHardwareRevision(getHardwareRevision());
        clone.setSoftwareRevision(getSoftwareRevision());
        clone.setMacAddress(getMacAddress());
        clone.setPartNumber(getPartNumber());
        clone.setSpecification(getSpecification());
        clone.setFactoryOut(getFactoryOut());
        clone.setPurchaseOrderId(getPurchaseOrderId());
        clone.setWarrantyFormId(getWarrantyFormId());
        clone.setStatus(getStatus());

        return clone;
    }

    @Override
    public int compareTo(DeviceHis deviceHis) {
        long primaryKey = deviceHis.getPrimaryKey();

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

        if (!(obj instanceof DeviceHisClp)) {
            return false;
        }

        DeviceHisClp deviceHis = (DeviceHisClp) obj;

        long primaryKey = deviceHis.getPrimaryKey();

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
        StringBundler sb = new StringBundler(45);

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
        sb.append(", modelName=");
        sb.append(getModelName());
        sb.append(", serialNumber=");
        sb.append(getSerialNumber());
        sb.append(", gponSerialNumber=");
        sb.append(getGponSerialNumber());
        sb.append(", boxSerialNumber=");
        sb.append(getBoxSerialNumber());
        sb.append(", customerSerialNumber=");
        sb.append(getCustomerSerialNumber());
        sb.append(", manufacturerSerialNumber=");
        sb.append(getManufacturerSerialNumber());
        sb.append(", hardwareRevision=");
        sb.append(getHardwareRevision());
        sb.append(", softwareRevision=");
        sb.append(getSoftwareRevision());
        sb.append(", macAddress=");
        sb.append(getMacAddress());
        sb.append(", partNumber=");
        sb.append(getPartNumber());
        sb.append(", specification=");
        sb.append(getSpecification());
        sb.append(", factoryOut=");
        sb.append(getFactoryOut());
        sb.append(", purchaseOrderId=");
        sb.append(getPurchaseOrderId());
        sb.append(", warrantyFormId=");
        sb.append(getWarrantyFormId());
        sb.append(", status=");
        sb.append(getStatus());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(70);

        sb.append("<model><model-name>");
        sb.append("com.dasannetworks.vn.sb.model.DeviceHis");
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
            "<column><column-name>modelName</column-name><column-value><![CDATA[");
        sb.append(getModelName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serialNumber</column-name><column-value><![CDATA[");
        sb.append(getSerialNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>gponSerialNumber</column-name><column-value><![CDATA[");
        sb.append(getGponSerialNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>boxSerialNumber</column-name><column-value><![CDATA[");
        sb.append(getBoxSerialNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>customerSerialNumber</column-name><column-value><![CDATA[");
        sb.append(getCustomerSerialNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>manufacturerSerialNumber</column-name><column-value><![CDATA[");
        sb.append(getManufacturerSerialNumber());
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
            "<column><column-name>purchaseOrderId</column-name><column-value><![CDATA[");
        sb.append(getPurchaseOrderId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>warrantyFormId</column-name><column-value><![CDATA[");
        sb.append(getWarrantyFormId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>status</column-name><column-value><![CDATA[");
        sb.append(getStatus());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
