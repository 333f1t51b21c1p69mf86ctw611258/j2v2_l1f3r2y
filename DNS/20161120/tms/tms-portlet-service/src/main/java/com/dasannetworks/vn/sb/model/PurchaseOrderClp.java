package com.dasannetworks.vn.sb.model;

import com.dasannetworks.vn.sb.service.ClpSerializer;
import com.dasannetworks.vn.sb.service.PurchaseOrderLocalServiceUtil;

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


public class PurchaseOrderClp extends BaseModelImpl<PurchaseOrder>
    implements PurchaseOrder {
    private long _purchaseOrderId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _customerCode;
    private Date _signDate;
    private Date _warrantyStartDate;
    private Date _warrantyEndDate;
    private String _purchaseOrderNumber;
    private BaseModel<?> _purchaseOrderRemoteModel;
    private Class<?> _clpSerializerClass = com.dasannetworks.vn.sb.service.ClpSerializer.class;

    public PurchaseOrderClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return PurchaseOrder.class;
    }

    @Override
    public String getModelClassName() {
        return PurchaseOrder.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _purchaseOrderId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setPurchaseOrderId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _purchaseOrderId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("purchaseOrderId", getPurchaseOrderId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("customerCode", getCustomerCode());
        attributes.put("signDate", getSignDate());
        attributes.put("warrantyStartDate", getWarrantyStartDate());
        attributes.put("warrantyEndDate", getWarrantyEndDate());
        attributes.put("purchaseOrderNumber", getPurchaseOrderNumber());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long purchaseOrderId = (Long) attributes.get("purchaseOrderId");

        if (purchaseOrderId != null) {
            setPurchaseOrderId(purchaseOrderId);
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

        Date signDate = (Date) attributes.get("signDate");

        if (signDate != null) {
            setSignDate(signDate);
        }

        Date warrantyStartDate = (Date) attributes.get("warrantyStartDate");

        if (warrantyStartDate != null) {
            setWarrantyStartDate(warrantyStartDate);
        }

        Date warrantyEndDate = (Date) attributes.get("warrantyEndDate");

        if (warrantyEndDate != null) {
            setWarrantyEndDate(warrantyEndDate);
        }

        String purchaseOrderNumber = (String) attributes.get(
                "purchaseOrderNumber");

        if (purchaseOrderNumber != null) {
            setPurchaseOrderNumber(purchaseOrderNumber);
        }
    }

    @Override
    public long getPurchaseOrderId() {
        return _purchaseOrderId;
    }

    @Override
    public void setPurchaseOrderId(long purchaseOrderId) {
        _purchaseOrderId = purchaseOrderId;

        if (_purchaseOrderRemoteModel != null) {
            try {
                Class<?> clazz = _purchaseOrderRemoteModel.getClass();

                Method method = clazz.getMethod("setPurchaseOrderId", long.class);

                method.invoke(_purchaseOrderRemoteModel, purchaseOrderId);
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

        if (_purchaseOrderRemoteModel != null) {
            try {
                Class<?> clazz = _purchaseOrderRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_purchaseOrderRemoteModel, companyId);
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

        if (_purchaseOrderRemoteModel != null) {
            try {
                Class<?> clazz = _purchaseOrderRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_purchaseOrderRemoteModel, userId);
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

        if (_purchaseOrderRemoteModel != null) {
            try {
                Class<?> clazz = _purchaseOrderRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_purchaseOrderRemoteModel, userName);
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

        if (_purchaseOrderRemoteModel != null) {
            try {
                Class<?> clazz = _purchaseOrderRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_purchaseOrderRemoteModel, createDate);
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

        if (_purchaseOrderRemoteModel != null) {
            try {
                Class<?> clazz = _purchaseOrderRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_purchaseOrderRemoteModel, modifiedDate);
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

        if (_purchaseOrderRemoteModel != null) {
            try {
                Class<?> clazz = _purchaseOrderRemoteModel.getClass();

                Method method = clazz.getMethod("setCustomerCode", String.class);

                method.invoke(_purchaseOrderRemoteModel, customerCode);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getSignDate() {
        return _signDate;
    }

    @Override
    public void setSignDate(Date signDate) {
        _signDate = signDate;

        if (_purchaseOrderRemoteModel != null) {
            try {
                Class<?> clazz = _purchaseOrderRemoteModel.getClass();

                Method method = clazz.getMethod("setSignDate", Date.class);

                method.invoke(_purchaseOrderRemoteModel, signDate);
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

        if (_purchaseOrderRemoteModel != null) {
            try {
                Class<?> clazz = _purchaseOrderRemoteModel.getClass();

                Method method = clazz.getMethod("setWarrantyStartDate",
                        Date.class);

                method.invoke(_purchaseOrderRemoteModel, warrantyStartDate);
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

        if (_purchaseOrderRemoteModel != null) {
            try {
                Class<?> clazz = _purchaseOrderRemoteModel.getClass();

                Method method = clazz.getMethod("setWarrantyEndDate", Date.class);

                method.invoke(_purchaseOrderRemoteModel, warrantyEndDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPurchaseOrderNumber() {
        return _purchaseOrderNumber;
    }

    @Override
    public void setPurchaseOrderNumber(String purchaseOrderNumber) {
        _purchaseOrderNumber = purchaseOrderNumber;

        if (_purchaseOrderRemoteModel != null) {
            try {
                Class<?> clazz = _purchaseOrderRemoteModel.getClass();

                Method method = clazz.getMethod("setPurchaseOrderNumber",
                        String.class);

                method.invoke(_purchaseOrderRemoteModel, purchaseOrderNumber);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getPurchaseOrderRemoteModel() {
        return _purchaseOrderRemoteModel;
    }

    public void setPurchaseOrderRemoteModel(
        BaseModel<?> purchaseOrderRemoteModel) {
        _purchaseOrderRemoteModel = purchaseOrderRemoteModel;
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

        Class<?> remoteModelClass = _purchaseOrderRemoteModel.getClass();

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

        Object returnValue = method.invoke(_purchaseOrderRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PurchaseOrderLocalServiceUtil.addPurchaseOrder(this);
        } else {
            PurchaseOrderLocalServiceUtil.updatePurchaseOrder(this);
        }
    }

    @Override
    public PurchaseOrder toEscapedModel() {
        return (PurchaseOrder) ProxyUtil.newProxyInstance(PurchaseOrder.class.getClassLoader(),
            new Class[] { PurchaseOrder.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        PurchaseOrderClp clone = new PurchaseOrderClp();

        clone.setPurchaseOrderId(getPurchaseOrderId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setCustomerCode(getCustomerCode());
        clone.setSignDate(getSignDate());
        clone.setWarrantyStartDate(getWarrantyStartDate());
        clone.setWarrantyEndDate(getWarrantyEndDate());
        clone.setPurchaseOrderNumber(getPurchaseOrderNumber());

        return clone;
    }

    @Override
    public int compareTo(PurchaseOrder purchaseOrder) {
        long primaryKey = purchaseOrder.getPrimaryKey();

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

        if (!(obj instanceof PurchaseOrderClp)) {
            return false;
        }

        PurchaseOrderClp purchaseOrder = (PurchaseOrderClp) obj;

        long primaryKey = purchaseOrder.getPrimaryKey();

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
        StringBundler sb = new StringBundler(23);

        sb.append("{purchaseOrderId=");
        sb.append(getPurchaseOrderId());
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
        sb.append(", signDate=");
        sb.append(getSignDate());
        sb.append(", warrantyStartDate=");
        sb.append(getWarrantyStartDate());
        sb.append(", warrantyEndDate=");
        sb.append(getWarrantyEndDate());
        sb.append(", purchaseOrderNumber=");
        sb.append(getPurchaseOrderNumber());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(37);

        sb.append("<model><model-name>");
        sb.append("com.dasannetworks.vn.sb.model.PurchaseOrder");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>purchaseOrderId</column-name><column-value><![CDATA[");
        sb.append(getPurchaseOrderId());
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
            "<column><column-name>signDate</column-name><column-value><![CDATA[");
        sb.append(getSignDate());
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
            "<column><column-name>purchaseOrderNumber</column-name><column-value><![CDATA[");
        sb.append(getPurchaseOrderNumber());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
