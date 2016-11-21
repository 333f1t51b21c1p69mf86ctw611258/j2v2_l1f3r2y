package com.dasannetworks.vn.sb.model.impl;

import com.dasannetworks.vn.sb.model.Contact;
import com.dasannetworks.vn.sb.model.ContactModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Contact service. Represents a row in the &quot;tms_Contact&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.dasannetworks.vn.sb.model.ContactModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ContactImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ContactImpl
 * @see com.dasannetworks.vn.sb.model.Contact
 * @see com.dasannetworks.vn.sb.model.ContactModel
 * @generated
 */
public class ContactModelImpl extends BaseModelImpl<Contact>
    implements ContactModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a contact model instance should use the {@link com.dasannetworks.vn.sb.model.Contact} interface instead.
     */
    public static final String TABLE_NAME = "tms_Contact";
    public static final Object[][] TABLE_COLUMNS = {
            { "uuid_", Types.VARCHAR },
            { "id_", Types.BIGINT },
            { "firstname", Types.VARCHAR },
            { "lastname", Types.VARCHAR },
            { "telephone", Types.VARCHAR },
            { "email", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table tms_Contact (uuid_ VARCHAR(75) null,id_ LONG not null primary key,firstname VARCHAR(75) null,lastname VARCHAR(75) null,telephone VARCHAR(75) null,email VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table tms_Contact";
    public static final String ORDER_BY_JPQL = " ORDER BY contact.id ASC";
    public static final String ORDER_BY_SQL = " ORDER BY tms_Contact.id_ ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.dasannetworks.vn.sb.model.Contact"),
            false);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.dasannetworks.vn.sb.model.Contact"),
            false);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.dasannetworks.vn.sb.model.Contact"),
            true);
    public static long UUID_COLUMN_BITMASK = 1L;
    public static long ID_COLUMN_BITMASK = 2L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.dasannetworks.vn.sb.model.Contact"));
    private static ClassLoader _classLoader = Contact.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            Contact.class
        };
    private String _uuid;
    private String _originalUuid;
    private long _id;
    private String _firstname;
    private String _lastname;
    private String _telephone;
    private String _email;
    private long _columnBitmask;
    private Contact _escapedModel;

    public ContactModelImpl() {
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
    public Class<?> getModelClass() {
        return Contact.class;
    }

    @Override
    public String getModelClassName() {
        return Contact.class.getName();
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
        if (_uuid == null) {
            return StringPool.BLANK;
        } else {
            return _uuid;
        }
    }

    @Override
    public void setUuid(String uuid) {
        if (_originalUuid == null) {
            _originalUuid = _uuid;
        }

        _uuid = uuid;
    }

    public String getOriginalUuid() {
        return GetterUtil.getString(_originalUuid);
    }

    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;
    }

    @Override
    public String getFirstname() {
        if (_firstname == null) {
            return StringPool.BLANK;
        } else {
            return _firstname;
        }
    }

    @Override
    public void setFirstname(String firstname) {
        _firstname = firstname;
    }

    @Override
    public String getLastname() {
        if (_lastname == null) {
            return StringPool.BLANK;
        } else {
            return _lastname;
        }
    }

    @Override
    public void setLastname(String lastname) {
        _lastname = lastname;
    }

    @Override
    public String getTelephone() {
        if (_telephone == null) {
            return StringPool.BLANK;
        } else {
            return _telephone;
        }
    }

    @Override
    public void setTelephone(String telephone) {
        _telephone = telephone;
    }

    @Override
    public String getEmail() {
        if (_email == null) {
            return StringPool.BLANK;
        } else {
            return _email;
        }
    }

    @Override
    public void setEmail(String email) {
        _email = email;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            Contact.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Contact toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Contact) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        ContactImpl contactImpl = new ContactImpl();

        contactImpl.setUuid(getUuid());
        contactImpl.setId(getId());
        contactImpl.setFirstname(getFirstname());
        contactImpl.setLastname(getLastname());
        contactImpl.setTelephone(getTelephone());
        contactImpl.setEmail(getEmail());

        contactImpl.resetOriginalValues();

        return contactImpl;
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

        if (!(obj instanceof Contact)) {
            return false;
        }

        Contact contact = (Contact) obj;

        long primaryKey = contact.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
        ContactModelImpl contactModelImpl = this;

        contactModelImpl._originalUuid = contactModelImpl._uuid;

        contactModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<Contact> toCacheModel() {
        ContactCacheModel contactCacheModel = new ContactCacheModel();

        contactCacheModel.uuid = getUuid();

        String uuid = contactCacheModel.uuid;

        if ((uuid != null) && (uuid.length() == 0)) {
            contactCacheModel.uuid = null;
        }

        contactCacheModel.id = getId();

        contactCacheModel.firstname = getFirstname();

        String firstname = contactCacheModel.firstname;

        if ((firstname != null) && (firstname.length() == 0)) {
            contactCacheModel.firstname = null;
        }

        contactCacheModel.lastname = getLastname();

        String lastname = contactCacheModel.lastname;

        if ((lastname != null) && (lastname.length() == 0)) {
            contactCacheModel.lastname = null;
        }

        contactCacheModel.telephone = getTelephone();

        String telephone = contactCacheModel.telephone;

        if ((telephone != null) && (telephone.length() == 0)) {
            contactCacheModel.telephone = null;
        }

        contactCacheModel.email = getEmail();

        String email = contactCacheModel.email;

        if ((email != null) && (email.length() == 0)) {
            contactCacheModel.email = null;
        }

        return contactCacheModel;
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
        sb.append("com.dasannetworks.vn.sb.model.Contact");
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
