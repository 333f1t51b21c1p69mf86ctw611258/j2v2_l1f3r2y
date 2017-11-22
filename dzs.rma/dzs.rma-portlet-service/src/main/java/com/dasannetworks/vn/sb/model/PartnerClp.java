package com.dasannetworks.vn.sb.model;

import com.dasannetworks.vn.sb.service.ClpSerializer;
import com.dasannetworks.vn.sb.service.PartnerLocalServiceUtil;

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


public class PartnerClp extends BaseModelImpl<Partner> implements Partner {
    private long _partnerId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _partnerCode;
    private String _partnerName;
    private String _inCharge;
    private String _email;
    private String _phone;
    private String _address;
    private BaseModel<?> _partnerRemoteModel;
    private Class<?> _clpSerializerClass = com.dasannetworks.vn.sb.service.ClpSerializer.class;

    public PartnerClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Partner.class;
    }

    @Override
    public String getModelClassName() {
        return Partner.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _partnerId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setPartnerId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _partnerId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("partnerId", getPartnerId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("partnerCode", getPartnerCode());
        attributes.put("partnerName", getPartnerName());
        attributes.put("inCharge", getInCharge());
        attributes.put("email", getEmail());
        attributes.put("phone", getPhone());
        attributes.put("address", getAddress());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long partnerId = (Long) attributes.get("partnerId");

        if (partnerId != null) {
            setPartnerId(partnerId);
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

        String partnerCode = (String) attributes.get("partnerCode");

        if (partnerCode != null) {
            setPartnerCode(partnerCode);
        }

        String partnerName = (String) attributes.get("partnerName");

        if (partnerName != null) {
            setPartnerName(partnerName);
        }

        String inCharge = (String) attributes.get("inCharge");

        if (inCharge != null) {
            setInCharge(inCharge);
        }

        String email = (String) attributes.get("email");

        if (email != null) {
            setEmail(email);
        }

        String phone = (String) attributes.get("phone");

        if (phone != null) {
            setPhone(phone);
        }

        String address = (String) attributes.get("address");

        if (address != null) {
            setAddress(address);
        }
    }

    @Override
    public long getPartnerId() {
        return _partnerId;
    }

    @Override
    public void setPartnerId(long partnerId) {
        _partnerId = partnerId;

        if (_partnerRemoteModel != null) {
            try {
                Class<?> clazz = _partnerRemoteModel.getClass();

                Method method = clazz.getMethod("setPartnerId", long.class);

                method.invoke(_partnerRemoteModel, partnerId);
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

        if (_partnerRemoteModel != null) {
            try {
                Class<?> clazz = _partnerRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_partnerRemoteModel, companyId);
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

        if (_partnerRemoteModel != null) {
            try {
                Class<?> clazz = _partnerRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_partnerRemoteModel, userId);
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

        if (_partnerRemoteModel != null) {
            try {
                Class<?> clazz = _partnerRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_partnerRemoteModel, userName);
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

        if (_partnerRemoteModel != null) {
            try {
                Class<?> clazz = _partnerRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_partnerRemoteModel, createDate);
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

        if (_partnerRemoteModel != null) {
            try {
                Class<?> clazz = _partnerRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_partnerRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPartnerCode() {
        return _partnerCode;
    }

    @Override
    public void setPartnerCode(String partnerCode) {
        _partnerCode = partnerCode;

        if (_partnerRemoteModel != null) {
            try {
                Class<?> clazz = _partnerRemoteModel.getClass();

                Method method = clazz.getMethod("setPartnerCode", String.class);

                method.invoke(_partnerRemoteModel, partnerCode);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPartnerName() {
        return _partnerName;
    }

    @Override
    public void setPartnerName(String partnerName) {
        _partnerName = partnerName;

        if (_partnerRemoteModel != null) {
            try {
                Class<?> clazz = _partnerRemoteModel.getClass();

                Method method = clazz.getMethod("setPartnerName", String.class);

                method.invoke(_partnerRemoteModel, partnerName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getInCharge() {
        return _inCharge;
    }

    @Override
    public void setInCharge(String inCharge) {
        _inCharge = inCharge;

        if (_partnerRemoteModel != null) {
            try {
                Class<?> clazz = _partnerRemoteModel.getClass();

                Method method = clazz.getMethod("setInCharge", String.class);

                method.invoke(_partnerRemoteModel, inCharge);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEmail() {
        return _email;
    }

    @Override
    public void setEmail(String email) {
        _email = email;

        if (_partnerRemoteModel != null) {
            try {
                Class<?> clazz = _partnerRemoteModel.getClass();

                Method method = clazz.getMethod("setEmail", String.class);

                method.invoke(_partnerRemoteModel, email);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPhone() {
        return _phone;
    }

    @Override
    public void setPhone(String phone) {
        _phone = phone;

        if (_partnerRemoteModel != null) {
            try {
                Class<?> clazz = _partnerRemoteModel.getClass();

                Method method = clazz.getMethod("setPhone", String.class);

                method.invoke(_partnerRemoteModel, phone);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getAddress() {
        return _address;
    }

    @Override
    public void setAddress(String address) {
        _address = address;

        if (_partnerRemoteModel != null) {
            try {
                Class<?> clazz = _partnerRemoteModel.getClass();

                Method method = clazz.getMethod("setAddress", String.class);

                method.invoke(_partnerRemoteModel, address);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getPartnerRemoteModel() {
        return _partnerRemoteModel;
    }

    public void setPartnerRemoteModel(BaseModel<?> partnerRemoteModel) {
        _partnerRemoteModel = partnerRemoteModel;
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

        Class<?> remoteModelClass = _partnerRemoteModel.getClass();

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

        Object returnValue = method.invoke(_partnerRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PartnerLocalServiceUtil.addPartner(this);
        } else {
            PartnerLocalServiceUtil.updatePartner(this);
        }
    }

    @Override
    public Partner toEscapedModel() {
        return (Partner) ProxyUtil.newProxyInstance(Partner.class.getClassLoader(),
            new Class[] { Partner.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        PartnerClp clone = new PartnerClp();

        clone.setPartnerId(getPartnerId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setPartnerCode(getPartnerCode());
        clone.setPartnerName(getPartnerName());
        clone.setInCharge(getInCharge());
        clone.setEmail(getEmail());
        clone.setPhone(getPhone());
        clone.setAddress(getAddress());

        return clone;
    }

    @Override
    public int compareTo(Partner partner) {
        long primaryKey = partner.getPrimaryKey();

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

        if (!(obj instanceof PartnerClp)) {
            return false;
        }

        PartnerClp partner = (PartnerClp) obj;

        long primaryKey = partner.getPrimaryKey();

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

        sb.append("{partnerId=");
        sb.append(getPartnerId());
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
        sb.append(", partnerCode=");
        sb.append(getPartnerCode());
        sb.append(", partnerName=");
        sb.append(getPartnerName());
        sb.append(", inCharge=");
        sb.append(getInCharge());
        sb.append(", email=");
        sb.append(getEmail());
        sb.append(", phone=");
        sb.append(getPhone());
        sb.append(", address=");
        sb.append(getAddress());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(40);

        sb.append("<model><model-name>");
        sb.append("com.dasannetworks.vn.sb.model.Partner");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>partnerId</column-name><column-value><![CDATA[");
        sb.append(getPartnerId());
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
            "<column><column-name>partnerCode</column-name><column-value><![CDATA[");
        sb.append(getPartnerCode());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>partnerName</column-name><column-value><![CDATA[");
        sb.append(getPartnerName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>inCharge</column-name><column-value><![CDATA[");
        sb.append(getInCharge());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>email</column-name><column-value><![CDATA[");
        sb.append(getEmail());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>phone</column-name><column-value><![CDATA[");
        sb.append(getPhone());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>address</column-name><column-value><![CDATA[");
        sb.append(getAddress());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
