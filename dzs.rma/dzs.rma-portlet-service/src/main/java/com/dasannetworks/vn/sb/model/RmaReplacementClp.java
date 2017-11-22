package com.dasannetworks.vn.sb.model;

import com.dasannetworks.vn.sb.service.ClpSerializer;
import com.dasannetworks.vn.sb.service.RmaReplacementLocalServiceUtil;
import com.dasannetworks.vn.sb.service.persistence.RmaReplacementPK;

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


public class RmaReplacementClp extends BaseModelImpl<RmaReplacement>
    implements RmaReplacement {
    private long _rmaRequestId;
    private String _replacedNumber;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private int _status;
    private BaseModel<?> _rmaReplacementRemoteModel;
    private Class<?> _clpSerializerClass = com.dasannetworks.vn.sb.service.ClpSerializer.class;

    public RmaReplacementClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return RmaReplacement.class;
    }

    @Override
    public String getModelClassName() {
        return RmaReplacement.class.getName();
    }

    @Override
    public RmaReplacementPK getPrimaryKey() {
        return new RmaReplacementPK(_rmaRequestId, _replacedNumber);
    }

    @Override
    public void setPrimaryKey(RmaReplacementPK primaryKey) {
        setRmaRequestId(primaryKey.rmaRequestId);
        setReplacedNumber(primaryKey.replacedNumber);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new RmaReplacementPK(_rmaRequestId, _replacedNumber);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((RmaReplacementPK) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("rmaRequestId", getRmaRequestId());
        attributes.put("replacedNumber", getReplacedNumber());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("status", getStatus());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long rmaRequestId = (Long) attributes.get("rmaRequestId");

        if (rmaRequestId != null) {
            setRmaRequestId(rmaRequestId);
        }

        String replacedNumber = (String) attributes.get("replacedNumber");

        if (replacedNumber != null) {
            setReplacedNumber(replacedNumber);
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

        if (_rmaReplacementRemoteModel != null) {
            try {
                Class<?> clazz = _rmaReplacementRemoteModel.getClass();

                Method method = clazz.getMethod("setRmaRequestId", long.class);

                method.invoke(_rmaReplacementRemoteModel, rmaRequestId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getReplacedNumber() {
        return _replacedNumber;
    }

    @Override
    public void setReplacedNumber(String replacedNumber) {
        _replacedNumber = replacedNumber;

        if (_rmaReplacementRemoteModel != null) {
            try {
                Class<?> clazz = _rmaReplacementRemoteModel.getClass();

                Method method = clazz.getMethod("setReplacedNumber",
                        String.class);

                method.invoke(_rmaReplacementRemoteModel, replacedNumber);
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

        if (_rmaReplacementRemoteModel != null) {
            try {
                Class<?> clazz = _rmaReplacementRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_rmaReplacementRemoteModel, companyId);
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

        if (_rmaReplacementRemoteModel != null) {
            try {
                Class<?> clazz = _rmaReplacementRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_rmaReplacementRemoteModel, userId);
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

        if (_rmaReplacementRemoteModel != null) {
            try {
                Class<?> clazz = _rmaReplacementRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_rmaReplacementRemoteModel, userName);
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

        if (_rmaReplacementRemoteModel != null) {
            try {
                Class<?> clazz = _rmaReplacementRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_rmaReplacementRemoteModel, createDate);
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

        if (_rmaReplacementRemoteModel != null) {
            try {
                Class<?> clazz = _rmaReplacementRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_rmaReplacementRemoteModel, modifiedDate);
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

        if (_rmaReplacementRemoteModel != null) {
            try {
                Class<?> clazz = _rmaReplacementRemoteModel.getClass();

                Method method = clazz.getMethod("setStatus", int.class);

                method.invoke(_rmaReplacementRemoteModel, status);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getRmaReplacementRemoteModel() {
        return _rmaReplacementRemoteModel;
    }

    public void setRmaReplacementRemoteModel(
        BaseModel<?> rmaReplacementRemoteModel) {
        _rmaReplacementRemoteModel = rmaReplacementRemoteModel;
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

        Class<?> remoteModelClass = _rmaReplacementRemoteModel.getClass();

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

        Object returnValue = method.invoke(_rmaReplacementRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            RmaReplacementLocalServiceUtil.addRmaReplacement(this);
        } else {
            RmaReplacementLocalServiceUtil.updateRmaReplacement(this);
        }
    }

    @Override
    public RmaReplacement toEscapedModel() {
        return (RmaReplacement) ProxyUtil.newProxyInstance(RmaReplacement.class.getClassLoader(),
            new Class[] { RmaReplacement.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        RmaReplacementClp clone = new RmaReplacementClp();

        clone.setRmaRequestId(getRmaRequestId());
        clone.setReplacedNumber(getReplacedNumber());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setStatus(getStatus());

        return clone;
    }

    @Override
    public int compareTo(RmaReplacement rmaReplacement) {
        RmaReplacementPK primaryKey = rmaReplacement.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof RmaReplacementClp)) {
            return false;
        }

        RmaReplacementClp rmaReplacement = (RmaReplacementClp) obj;

        RmaReplacementPK primaryKey = rmaReplacement.getPrimaryKey();

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
        StringBundler sb = new StringBundler(17);

        sb.append("{rmaRequestId=");
        sb.append(getRmaRequestId());
        sb.append(", replacedNumber=");
        sb.append(getReplacedNumber());
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
        sb.append(", status=");
        sb.append(getStatus());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(28);

        sb.append("<model><model-name>");
        sb.append("com.dasannetworks.vn.sb.model.RmaReplacement");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>rmaRequestId</column-name><column-value><![CDATA[");
        sb.append(getRmaRequestId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>replacedNumber</column-name><column-value><![CDATA[");
        sb.append(getReplacedNumber());
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
            "<column><column-name>status</column-name><column-value><![CDATA[");
        sb.append(getStatus());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
