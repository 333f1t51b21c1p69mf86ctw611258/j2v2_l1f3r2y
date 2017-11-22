package com.dasannetworks.vn.sb.model;

import com.dasannetworks.vn.sb.service.ClpSerializer;
import com.dasannetworks.vn.sb.service.WarrantyFormLocalServiceUtil;

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


public class WarrantyFormClp extends BaseModelImpl<WarrantyForm>
    implements WarrantyForm {
    private long _warrantyFormId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _agentCode;
    private Date _warrantyStartDate;
    private Date _warrantyEndDate;
    private String _originalSerialNumber;
    private String _hisSerialNumbers;
    private String _latestSerialNumber;
    private String _remark;
    private BaseModel<?> _warrantyFormRemoteModel;
    private Class<?> _clpSerializerClass = com.dasannetworks.vn.sb.service.ClpSerializer.class;

    public WarrantyFormClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return WarrantyForm.class;
    }

    @Override
    public String getModelClassName() {
        return WarrantyForm.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _warrantyFormId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setWarrantyFormId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _warrantyFormId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("warrantyFormId", getWarrantyFormId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("agentCode", getAgentCode());
        attributes.put("warrantyStartDate", getWarrantyStartDate());
        attributes.put("warrantyEndDate", getWarrantyEndDate());
        attributes.put("originalSerialNumber", getOriginalSerialNumber());
        attributes.put("hisSerialNumbers", getHisSerialNumbers());
        attributes.put("latestSerialNumber", getLatestSerialNumber());
        attributes.put("remark", getRemark());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long warrantyFormId = (Long) attributes.get("warrantyFormId");

        if (warrantyFormId != null) {
            setWarrantyFormId(warrantyFormId);
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

        String agentCode = (String) attributes.get("agentCode");

        if (agentCode != null) {
            setAgentCode(agentCode);
        }

        Date warrantyStartDate = (Date) attributes.get("warrantyStartDate");

        if (warrantyStartDate != null) {
            setWarrantyStartDate(warrantyStartDate);
        }

        Date warrantyEndDate = (Date) attributes.get("warrantyEndDate");

        if (warrantyEndDate != null) {
            setWarrantyEndDate(warrantyEndDate);
        }

        String originalSerialNumber = (String) attributes.get(
                "originalSerialNumber");

        if (originalSerialNumber != null) {
            setOriginalSerialNumber(originalSerialNumber);
        }

        String hisSerialNumbers = (String) attributes.get("hisSerialNumbers");

        if (hisSerialNumbers != null) {
            setHisSerialNumbers(hisSerialNumbers);
        }

        String latestSerialNumber = (String) attributes.get(
                "latestSerialNumber");

        if (latestSerialNumber != null) {
            setLatestSerialNumber(latestSerialNumber);
        }

        String remark = (String) attributes.get("remark");

        if (remark != null) {
            setRemark(remark);
        }
    }

    @Override
    public long getWarrantyFormId() {
        return _warrantyFormId;
    }

    @Override
    public void setWarrantyFormId(long warrantyFormId) {
        _warrantyFormId = warrantyFormId;

        if (_warrantyFormRemoteModel != null) {
            try {
                Class<?> clazz = _warrantyFormRemoteModel.getClass();

                Method method = clazz.getMethod("setWarrantyFormId", long.class);

                method.invoke(_warrantyFormRemoteModel, warrantyFormId);
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

        if (_warrantyFormRemoteModel != null) {
            try {
                Class<?> clazz = _warrantyFormRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_warrantyFormRemoteModel, companyId);
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

        if (_warrantyFormRemoteModel != null) {
            try {
                Class<?> clazz = _warrantyFormRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_warrantyFormRemoteModel, userId);
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

        if (_warrantyFormRemoteModel != null) {
            try {
                Class<?> clazz = _warrantyFormRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_warrantyFormRemoteModel, userName);
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

        if (_warrantyFormRemoteModel != null) {
            try {
                Class<?> clazz = _warrantyFormRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_warrantyFormRemoteModel, createDate);
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

        if (_warrantyFormRemoteModel != null) {
            try {
                Class<?> clazz = _warrantyFormRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_warrantyFormRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getAgentCode() {
        return _agentCode;
    }

    @Override
    public void setAgentCode(String agentCode) {
        _agentCode = agentCode;

        if (_warrantyFormRemoteModel != null) {
            try {
                Class<?> clazz = _warrantyFormRemoteModel.getClass();

                Method method = clazz.getMethod("setAgentCode", String.class);

                method.invoke(_warrantyFormRemoteModel, agentCode);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getWarrantyStartDate() {
        return _warrantyStartDate;
    }

    @Override
    public void setWarrantyStartDate(Date warrantyStartDate) {
        _warrantyStartDate = warrantyStartDate;

        if (_warrantyFormRemoteModel != null) {
            try {
                Class<?> clazz = _warrantyFormRemoteModel.getClass();

                Method method = clazz.getMethod("setWarrantyStartDate",
                        Date.class);

                method.invoke(_warrantyFormRemoteModel, warrantyStartDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getWarrantyEndDate() {
        return _warrantyEndDate;
    }

    @Override
    public void setWarrantyEndDate(Date warrantyEndDate) {
        _warrantyEndDate = warrantyEndDate;

        if (_warrantyFormRemoteModel != null) {
            try {
                Class<?> clazz = _warrantyFormRemoteModel.getClass();

                Method method = clazz.getMethod("setWarrantyEndDate", Date.class);

                method.invoke(_warrantyFormRemoteModel, warrantyEndDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getOriginalSerialNumber() {
        return _originalSerialNumber;
    }

    @Override
    public void setOriginalSerialNumber(String originalSerialNumber) {
        _originalSerialNumber = originalSerialNumber;

        if (_warrantyFormRemoteModel != null) {
            try {
                Class<?> clazz = _warrantyFormRemoteModel.getClass();

                Method method = clazz.getMethod("setOriginalSerialNumber",
                        String.class);

                method.invoke(_warrantyFormRemoteModel, originalSerialNumber);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getHisSerialNumbers() {
        return _hisSerialNumbers;
    }

    @Override
    public void setHisSerialNumbers(String hisSerialNumbers) {
        _hisSerialNumbers = hisSerialNumbers;

        if (_warrantyFormRemoteModel != null) {
            try {
                Class<?> clazz = _warrantyFormRemoteModel.getClass();

                Method method = clazz.getMethod("setHisSerialNumbers",
                        String.class);

                method.invoke(_warrantyFormRemoteModel, hisSerialNumbers);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getLatestSerialNumber() {
        return _latestSerialNumber;
    }

    @Override
    public void setLatestSerialNumber(String latestSerialNumber) {
        _latestSerialNumber = latestSerialNumber;

        if (_warrantyFormRemoteModel != null) {
            try {
                Class<?> clazz = _warrantyFormRemoteModel.getClass();

                Method method = clazz.getMethod("setLatestSerialNumber",
                        String.class);

                method.invoke(_warrantyFormRemoteModel, latestSerialNumber);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getRemark() {
        return _remark;
    }

    @Override
    public void setRemark(String remark) {
        _remark = remark;

        if (_warrantyFormRemoteModel != null) {
            try {
                Class<?> clazz = _warrantyFormRemoteModel.getClass();

                Method method = clazz.getMethod("setRemark", String.class);

                method.invoke(_warrantyFormRemoteModel, remark);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getWarrantyFormRemoteModel() {
        return _warrantyFormRemoteModel;
    }

    public void setWarrantyFormRemoteModel(BaseModel<?> warrantyFormRemoteModel) {
        _warrantyFormRemoteModel = warrantyFormRemoteModel;
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

        Class<?> remoteModelClass = _warrantyFormRemoteModel.getClass();

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

        Object returnValue = method.invoke(_warrantyFormRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            WarrantyFormLocalServiceUtil.addWarrantyForm(this);
        } else {
            WarrantyFormLocalServiceUtil.updateWarrantyForm(this);
        }
    }

    @Override
    public WarrantyForm toEscapedModel() {
        return (WarrantyForm) ProxyUtil.newProxyInstance(WarrantyForm.class.getClassLoader(),
            new Class[] { WarrantyForm.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        WarrantyFormClp clone = new WarrantyFormClp();

        clone.setWarrantyFormId(getWarrantyFormId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setAgentCode(getAgentCode());
        clone.setWarrantyStartDate(getWarrantyStartDate());
        clone.setWarrantyEndDate(getWarrantyEndDate());
        clone.setOriginalSerialNumber(getOriginalSerialNumber());
        clone.setHisSerialNumbers(getHisSerialNumbers());
        clone.setLatestSerialNumber(getLatestSerialNumber());
        clone.setRemark(getRemark());

        return clone;
    }

    @Override
    public int compareTo(WarrantyForm warrantyForm) {
        long primaryKey = warrantyForm.getPrimaryKey();

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

        if (!(obj instanceof WarrantyFormClp)) {
            return false;
        }

        WarrantyFormClp warrantyForm = (WarrantyFormClp) obj;

        long primaryKey = warrantyForm.getPrimaryKey();

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
        StringBundler sb = new StringBundler(27);

        sb.append("{warrantyFormId=");
        sb.append(getWarrantyFormId());
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
        sb.append(", agentCode=");
        sb.append(getAgentCode());
        sb.append(", warrantyStartDate=");
        sb.append(getWarrantyStartDate());
        sb.append(", warrantyEndDate=");
        sb.append(getWarrantyEndDate());
        sb.append(", originalSerialNumber=");
        sb.append(getOriginalSerialNumber());
        sb.append(", hisSerialNumbers=");
        sb.append(getHisSerialNumbers());
        sb.append(", latestSerialNumber=");
        sb.append(getLatestSerialNumber());
        sb.append(", remark=");
        sb.append(getRemark());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(43);

        sb.append("<model><model-name>");
        sb.append("com.dasannetworks.vn.sb.model.WarrantyForm");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>warrantyFormId</column-name><column-value><![CDATA[");
        sb.append(getWarrantyFormId());
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
            "<column><column-name>agentCode</column-name><column-value><![CDATA[");
        sb.append(getAgentCode());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>warrantyStartDate</column-name><column-value><![CDATA[");
        sb.append(getWarrantyStartDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>warrantyEndDate</column-name><column-value><![CDATA[");
        sb.append(getWarrantyEndDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>originalSerialNumber</column-name><column-value><![CDATA[");
        sb.append(getOriginalSerialNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>hisSerialNumbers</column-name><column-value><![CDATA[");
        sb.append(getHisSerialNumbers());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>latestSerialNumber</column-name><column-value><![CDATA[");
        sb.append(getLatestSerialNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>remark</column-name><column-value><![CDATA[");
        sb.append(getRemark());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
