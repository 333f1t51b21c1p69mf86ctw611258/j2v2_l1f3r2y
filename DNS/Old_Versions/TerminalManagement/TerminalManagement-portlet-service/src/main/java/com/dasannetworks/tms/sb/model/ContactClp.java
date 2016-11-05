package com.dasannetworks.tms.sb.model;

import com.dasannetworks.tms.sb.service.ClpSerializer;
import com.dasannetworks.tms.sb.service.ContactLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class ContactClp extends BaseModelImpl<Contact> implements Contact {
    private String _uuid;
    private long _id;
    private String _firstname;
    private String _lastname;
    private String _telephone;
    private String _email;
    private BaseModel<?> _contactRemoteModel;
    private Class<?> _clpSerializerClass = com.dasannetworks.tms.sb.service.ClpSerializer.class;

    public ContactClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Contact.class;
    }

    @Override
    public String getModelClassName() {
        return Contact.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("id", getId());
        attributes.put("firstname", getFirstname());
        attributes.put("lastname", getLastname());
        attributes.put("telephone", getTelephone());
        attributes.put("email", getEmail());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String firstname = (String) attributes.get("firstname");

        if (firstname != null) {
            setFirstname(firstname);
        }

        String lastname = (String) attributes.get("lastname");

        if (lastname != null) {
            setLastname(lastname);
        }

        String telephone = (String) attributes.get("telephone");

        if (telephone != null) {
            setTelephone(telephone);
        }

        String email = (String) attributes.get("email");

        if (email != null) {
            setEmail(email);
        }
    }

    @Override
    public String getUuid() {
        return _uuid;
    }

    @Override
    public void setUuid(String uuid) {
        _uuid = uuid;

        if (_contactRemoteModel != null) {
            try {
                Class<?> clazz = _contactRemoteModel.getClass();

                Method method = clazz.getMethod("setUuid", String.class);

                method.invoke(_contactRemoteModel, uuid);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;

        if (_contactRemoteModel != null) {
            try {
                Class<?> clazz = _contactRemoteModel.getClass();

                Method method = clazz.getMethod("setId", long.class);

                method.invoke(_contactRemoteModel, id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getFirstname() {
        return _firstname;
    }

    @Override
    public void setFirstname(String firstname) {
        _firstname = firstname;

        if (_contactRemoteModel != null) {
            try {
                Class<?> clazz = _contactRemoteModel.getClass();

                Method method = clazz.getMethod("setFirstname", String.class);

                method.invoke(_contactRemoteModel, firstname);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getLastname() {
        return _lastname;
    }

    @Override
    public void setLastname(String lastname) {
        _lastname = lastname;

        if (_contactRemoteModel != null) {
            try {
                Class<?> clazz = _contactRemoteModel.getClass();

                Method method = clazz.getMethod("setLastname", String.class);

                method.invoke(_contactRemoteModel, lastname);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getTelephone() {
        return _telephone;
    }

    @Override
    public void setTelephone(String telephone) {
        _telephone = telephone;

        if (_contactRemoteModel != null) {
            try {
                Class<?> clazz = _contactRemoteModel.getClass();

                Method method = clazz.getMethod("setTelephone", String.class);

                method.invoke(_contactRemoteModel, telephone);
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

        if (_contactRemoteModel != null) {
            try {
                Class<?> clazz = _contactRemoteModel.getClass();

                Method method = clazz.getMethod("setEmail", String.class);

                method.invoke(_contactRemoteModel, email);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getContactRemoteModel() {
        return _contactRemoteModel;
    }

    public void setContactRemoteModel(BaseModel<?> contactRemoteModel) {
        _contactRemoteModel = contactRemoteModel;
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

        Class<?> remoteModelClass = _contactRemoteModel.getClass();

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

        Object returnValue = method.invoke(_contactRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            ContactLocalServiceUtil.addContact(this);
        } else {
            ContactLocalServiceUtil.updateContact(this);
        }
    }

    @Override
    public Contact toEscapedModel() {
        return (Contact) ProxyUtil.newProxyInstance(Contact.class.getClassLoader(),
            new Class[] { Contact.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        ContactClp clone = new ContactClp();

        clone.setUuid(getUuid());
        clone.setId(getId());
        clone.setFirstname(getFirstname());
        clone.setLastname(getLastname());
        clone.setTelephone(getTelephone());
        clone.setEmail(getEmail());

        return clone;
    }

    @Override
    public int compareTo(Contact contact) {
        long primaryKey = contact.getPrimaryKey();

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

        if (!(obj instanceof ContactClp)) {
            return false;
        }

        ContactClp contact = (ContactClp) obj;

        long primaryKey = contact.getPrimaryKey();

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

        sb.append("{uuid=");
        sb.append(getUuid());
        sb.append(", id=");
        sb.append(getId());
        sb.append(", firstname=");
        sb.append(getFirstname());
        sb.append(", lastname=");
        sb.append(getLastname());
        sb.append(", telephone=");
        sb.append(getTelephone());
        sb.append(", email=");
        sb.append(getEmail());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(22);

        sb.append("<model><model-name>");
        sb.append("com.dasannetworks.tms.sb.model.Contact");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>uuid</column-name><column-value><![CDATA[");
        sb.append(getUuid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>firstname</column-name><column-value><![CDATA[");
        sb.append(getFirstname());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lastname</column-name><column-value><![CDATA[");
        sb.append(getLastname());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>telephone</column-name><column-value><![CDATA[");
        sb.append(getTelephone());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>email</column-name><column-value><![CDATA[");
        sb.append(getEmail());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
