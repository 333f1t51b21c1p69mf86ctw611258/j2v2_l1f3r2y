package com.dasannetworks.vn.sb.model;

import com.dasannetworks.vn.sb.service.ClpSerializer;
import com.dasannetworks.vn.sb.service.PurchaseOrderLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class PurchaseOrderClp extends BaseModelImpl<PurchaseOrder>
    implements PurchaseOrder {
    private long _purchaseOrderId;
    private Date _createDate;
    private Date _modifiedDate;
    private String _customer;
    private Date _signDate;
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
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("customer", getCustomer());
        attributes.put("signDate", getSignDate());
        attributes.put("purchaseOrderNumber", getPurchaseOrderNumber());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long purchaseOrderId = (Long) attributes.get("purchaseOrderId");

        if (purchaseOrderId != null) {
            setPurchaseOrderId(purchaseOrderId);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        String customer = (String) attributes.get("customer");

        if (customer != null) {
            setCustomer(customer);
        }

        Date signDate = (Date) attributes.get("signDate");

        if (signDate != null) {
            setSignDate(signDate);
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
    public String getCustomer() {
        return _customer;
    }

    @Override
    public void setCustomer(String customer) {
        _customer = customer;

        if (_purchaseOrderRemoteModel != null) {
            try {
                Class<?> clazz = _purchaseOrderRemoteModel.getClass();

                Method method = clazz.getMethod("setCustomer", String.class);

                method.invoke(_purchaseOrderRemoteModel, customer);
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
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setCustomer(getCustomer());
        clone.setSignDate(getSignDate());
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
        StringBundler sb = new StringBundler(13);

        sb.append("{purchaseOrderId=");
        sb.append(getPurchaseOrderId());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", customer=");
        sb.append(getCustomer());
        sb.append(", signDate=");
        sb.append(getSignDate());
        sb.append(", purchaseOrderNumber=");
        sb.append(getPurchaseOrderNumber());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(22);

        sb.append("<model><model-name>");
        sb.append("com.dasannetworks.vn.sb.model.PurchaseOrder");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>purchaseOrderId</column-name><column-value><![CDATA[");
        sb.append(getPurchaseOrderId());
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
            "<column><column-name>customer</column-name><column-value><![CDATA[");
        sb.append(getCustomer());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>signDate</column-name><column-value><![CDATA[");
        sb.append(getSignDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>purchaseOrderNumber</column-name><column-value><![CDATA[");
        sb.append(getPurchaseOrderNumber());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
