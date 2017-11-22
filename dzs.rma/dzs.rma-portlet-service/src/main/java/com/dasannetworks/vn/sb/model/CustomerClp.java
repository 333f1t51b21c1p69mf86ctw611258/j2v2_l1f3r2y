package com.dasannetworks.vn.sb.model;

import com.dasannetworks.vn.sb.service.ClpSerializer;
import com.dasannetworks.vn.sb.service.CustomerLocalServiceUtil;

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


public class CustomerClp extends BaseModelImpl<Customer> implements Customer {
    private long _customerId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _customerCode;
    private String _customerName;
    private String _inCharge;
    private String _email;
    private String _phone;
    private String _address;
    private Long _parentId;
    private BaseModel<?> _customerRemoteModel;
    private Class<?> _clpSerializerClass = com.dasannetworks.vn.sb.service.ClpSerializer.class;

    public CustomerClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Customer.class;
    }

    @Override
    public String getModelClassName() {
        return Customer.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _customerId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setCustomerId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _customerId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("customerId", getCustomerId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("customerCode", getCustomerCode());
        attributes.put("customerName", getCustomerName());
        attributes.put("inCharge", getInCharge());
        attributes.put("email", getEmail());
        attributes.put("phone", getPhone());
        attributes.put("address", getAddress());
        attributes.put("parentId", getParentId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long customerId = (Long) attributes.get("customerId");

        if (customerId != null) {
            setCustomerId(customerId);
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

        String customerName = (String) attributes.get("customerName");

        if (customerName != null) {
            setCustomerName(customerName);
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

        Long parentId = (Long) attributes.get("parentId");

        if (parentId != null) {
            setParentId(parentId);
        }
    }

    @Override
    public long getCustomerId() {
        return _customerId;
    }

    @Override
    public void setCustomerId(long customerId) {
        _customerId = customerId;

        if (_customerRemoteModel != null) {
            try {
                Class<?> clazz = _customerRemoteModel.getClass();

                Method method = clazz.getMethod("setCustomerId", long.class);

                method.invoke(_customerRemoteModel, customerId);
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

        if (_customerRemoteModel != null) {
            try {
                Class<?> clazz = _customerRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_customerRemoteModel, companyId);
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

        if (_customerRemoteModel != null) {
            try {
                Class<?> clazz = _customerRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_customerRemoteModel, userId);
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

        if (_customerRemoteModel != null) {
            try {
                Class<?> clazz = _customerRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_customerRemoteModel, userName);
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

        if (_customerRemoteModel != null) {
            try {
                Class<?> clazz = _customerRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_customerRemoteModel, createDate);
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

        if (_customerRemoteModel != null) {
            try {
                Class<?> clazz = _customerRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_customerRemoteModel, modifiedDate);
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

        if (_customerRemoteModel != null) {
            try {
                Class<?> clazz = _customerRemoteModel.getClass();

                Method method = clazz.getMethod("setCustomerCode", String.class);

                method.invoke(_customerRemoteModel, customerCode);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCustomerName() {
        return _customerName;
    }

    @Override
    public void setCustomerName(String customerName) {
        _customerName = customerName;

        if (_customerRemoteModel != null) {
            try {
                Class<?> clazz = _customerRemoteModel.getClass();

                Method method = clazz.getMethod("setCustomerName", String.class);

                method.invoke(_customerRemoteModel, customerName);
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

        if (_customerRemoteModel != null) {
            try {
                Class<?> clazz = _customerRemoteModel.getClass();

                Method method = clazz.getMethod("setInCharge", String.class);

                method.invoke(_customerRemoteModel, inCharge);
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

        if (_customerRemoteModel != null) {
            try {
                Class<?> clazz = _customerRemoteModel.getClass();

                Method method = clazz.getMethod("setEmail", String.class);

                method.invoke(_customerRemoteModel, email);
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

        if (_customerRemoteModel != null) {
            try {
                Class<?> clazz = _customerRemoteModel.getClass();

                Method method = clazz.getMethod("setPhone", String.class);

                method.invoke(_customerRemoteModel, phone);
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

        if (_customerRemoteModel != null) {
            try {
                Class<?> clazz = _customerRemoteModel.getClass();

                Method method = clazz.getMethod("setAddress", String.class);

                method.invoke(_customerRemoteModel, address);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Long getParentId() {
        return _parentId;
    }

    @Override
    public void setParentId(Long parentId) {
        _parentId = parentId;

        if (_customerRemoteModel != null) {
            try {
                Class<?> clazz = _customerRemoteModel.getClass();

                Method method = clazz.getMethod("setParentId", Long.class);

                method.invoke(_customerRemoteModel, parentId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getCustomerRemoteModel() {
        return _customerRemoteModel;
    }

    public void setCustomerRemoteModel(BaseModel<?> customerRemoteModel) {
        _customerRemoteModel = customerRemoteModel;
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

        Class<?> remoteModelClass = _customerRemoteModel.getClass();

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

        Object returnValue = method.invoke(_customerRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            CustomerLocalServiceUtil.addCustomer(this);
        } else {
            CustomerLocalServiceUtil.updateCustomer(this);
        }
    }

    @Override
    public Customer toEscapedModel() {
        return (Customer) ProxyUtil.newProxyInstance(Customer.class.getClassLoader(),
            new Class[] { Customer.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        CustomerClp clone = new CustomerClp();

        clone.setCustomerId(getCustomerId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setCustomerCode(getCustomerCode());
        clone.setCustomerName(getCustomerName());
        clone.setInCharge(getInCharge());
        clone.setEmail(getEmail());
        clone.setPhone(getPhone());
        clone.setAddress(getAddress());
        clone.setParentId(getParentId());

        return clone;
    }

    @Override
    public int compareTo(Customer customer) {
        long primaryKey = customer.getPrimaryKey();

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

        if (!(obj instanceof CustomerClp)) {
            return false;
        }

        CustomerClp customer = (CustomerClp) obj;

        long primaryKey = customer.getPrimaryKey();

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

        sb.append("{customerId=");
        sb.append(getCustomerId());
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
        sb.append(", customerName=");
        sb.append(getCustomerName());
        sb.append(", inCharge=");
        sb.append(getInCharge());
        sb.append(", email=");
        sb.append(getEmail());
        sb.append(", phone=");
        sb.append(getPhone());
        sb.append(", address=");
        sb.append(getAddress());
        sb.append(", parentId=");
        sb.append(getParentId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(43);

        sb.append("<model><model-name>");
        sb.append("com.dasannetworks.vn.sb.model.Customer");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>customerId</column-name><column-value><![CDATA[");
        sb.append(getCustomerId());
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
            "<column><column-name>customerName</column-name><column-value><![CDATA[");
        sb.append(getCustomerName());
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
        sb.append(
            "<column><column-name>parentId</column-name><column-value><![CDATA[");
        sb.append(getParentId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
