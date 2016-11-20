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
    private String _customerCode;
    private Date _warrantyStartDate;
    private Date _warrantyEndDate;
    private long _originalDeviceId;
    private long _currentDeviceId;
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
        attributes.put("customerCode", getCustomerCode());
        attributes.put("warrantyStartDate", getWarrantyStartDate());
        attributes.put("warrantyEndDate", getWarrantyEndDate());
        attributes.put("originalDeviceId", getOriginalDeviceId());
        attributes.put("currentDeviceId", getCurrentDeviceId());
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

        String customerCode = (String) attributes.get("customerCode");

        if (customerCode != null) {
            setCustomerCode(customerCode);
        }

        Date warrantyStartDate = (Date) attributes.get("warrantyStartDate");

        if (warrantyStartDate != null) {
            setWarrantyStartDate(warrantyStartDate);
        }

        Date warrantyEndDate = (Date) attributes.get("warrantyEndDate");

        if (warrantyEndDate != null) {
            setWarrantyEndDate(warrantyEndDate);
        }

        Long originalDeviceId = (Long) attributes.get("originalDeviceId");

        if (originalDeviceId != null) {
            setOriginalDeviceId(originalDeviceId);
        }

        Long currentDeviceId = (Long) attributes.get("currentDeviceId");

        if (currentDeviceId != null) {
            setCurrentDeviceId(currentDeviceId);
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
    public String getCustomerCode() {
        return _customerCode;
    }

    @Override
    public void setCustomerCode(String customerCode) {
        _customerCode = customerCode;

        if (_warrantyFormRemoteModel != null) {
            try {
                Class<?> clazz = _warrantyFormRemoteModel.getClass();

                Method method = clazz.getMethod("setCustomerCode", String.class);

                method.invoke(_warrantyFormRemoteModel, customerCode);
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
    public long getOriginalDeviceId() {
        return _originalDeviceId;
    }

    @Override
    public void setOriginalDeviceId(long originalDeviceId) {
        _originalDeviceId = originalDeviceId;

        if (_warrantyFormRemoteModel != null) {
            try {
                Class<?> clazz = _warrantyFormRemoteModel.getClass();

                Method method = clazz.getMethod("setOriginalDeviceId",
                        long.class);

                method.invoke(_warrantyFormRemoteModel, originalDeviceId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCurrentDeviceId() {
        return _currentDeviceId;
    }

    @Override
    public void setCurrentDeviceId(long currentDeviceId) {
        _currentDeviceId = currentDeviceId;

        if (_warrantyFormRemoteModel != null) {
            try {
                Class<?> clazz = _warrantyFormRemoteModel.getClass();

                Method method = clazz.getMethod("setCurrentDeviceId", long.class);

                method.invoke(_warrantyFormRemoteModel, currentDeviceId);
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
        clone.setCustomerCode(getCustomerCode());
        clone.setWarrantyStartDate(getWarrantyStartDate());
        clone.setWarrantyEndDate(getWarrantyEndDate());
        clone.setOriginalDeviceId(getOriginalDeviceId());
        clone.setCurrentDeviceId(getCurrentDeviceId());
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
        StringBundler sb = new StringBundler(25);

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
        sb.append(", customerCode=");
        sb.append(getCustomerCode());
        sb.append(", warrantyStartDate=");
        sb.append(getWarrantyStartDate());
        sb.append(", warrantyEndDate=");
        sb.append(getWarrantyEndDate());
        sb.append(", originalDeviceId=");
        sb.append(getOriginalDeviceId());
        sb.append(", currentDeviceId=");
        sb.append(getCurrentDeviceId());
        sb.append(", remark=");
        sb.append(getRemark());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(40);

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
            "<column><column-name>customerCode</column-name><column-value><![CDATA[");
        sb.append(getCustomerCode());
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
            "<column><column-name>originalDeviceId</column-name><column-value><![CDATA[");
        sb.append(getOriginalDeviceId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>currentDeviceId</column-name><column-value><![CDATA[");
        sb.append(getCurrentDeviceId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>remark</column-name><column-value><![CDATA[");
        sb.append(getRemark());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
