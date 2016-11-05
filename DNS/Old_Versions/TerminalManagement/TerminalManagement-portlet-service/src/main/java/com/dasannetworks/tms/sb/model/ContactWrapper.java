package com.dasannetworks.tms.sb.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Contact}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Contact
 * @generated
 */
public class ContactWrapper implements Contact, ModelWrapper<Contact> {
    private Contact _contact;

    public ContactWrapper(Contact contact) {
        _contact = contact;
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

    /**
    * Returns the primary key of this contact.
    *
    * @return the primary key of this contact
    */
    @Override
    public long getPrimaryKey() {
        return _contact.getPrimaryKey();
    }

    /**
    * Sets the primary key of this contact.
    *
    * @param primaryKey the primary key of this contact
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _contact.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the uuid of this contact.
    *
    * @return the uuid of this contact
    */
    @Override
    public java.lang.String getUuid() {
        return _contact.getUuid();
    }

    /**
    * Sets the uuid of this contact.
    *
    * @param uuid the uuid of this contact
    */
    @Override
    public void setUuid(java.lang.String uuid) {
        _contact.setUuid(uuid);
    }

    /**
    * Returns the ID of this contact.
    *
    * @return the ID of this contact
    */
    @Override
    public long getId() {
        return _contact.getId();
    }

    /**
    * Sets the ID of this contact.
    *
    * @param id the ID of this contact
    */
    @Override
    public void setId(long id) {
        _contact.setId(id);
    }

    /**
    * Returns the firstname of this contact.
    *
    * @return the firstname of this contact
    */
    @Override
    public java.lang.String getFirstname() {
        return _contact.getFirstname();
    }

    /**
    * Sets the firstname of this contact.
    *
    * @param firstname the firstname of this contact
    */
    @Override
    public void setFirstname(java.lang.String firstname) {
        _contact.setFirstname(firstname);
    }

    /**
    * Returns the lastname of this contact.
    *
    * @return the lastname of this contact
    */
    @Override
    public java.lang.String getLastname() {
        return _contact.getLastname();
    }

    /**
    * Sets the lastname of this contact.
    *
    * @param lastname the lastname of this contact
    */
    @Override
    public void setLastname(java.lang.String lastname) {
        _contact.setLastname(lastname);
    }

    /**
    * Returns the telephone of this contact.
    *
    * @return the telephone of this contact
    */
    @Override
    public java.lang.String getTelephone() {
        return _contact.getTelephone();
    }

    /**
    * Sets the telephone of this contact.
    *
    * @param telephone the telephone of this contact
    */
    @Override
    public void setTelephone(java.lang.String telephone) {
        _contact.setTelephone(telephone);
    }

    /**
    * Returns the email of this contact.
    *
    * @return the email of this contact
    */
    @Override
    public java.lang.String getEmail() {
        return _contact.getEmail();
    }

    /**
    * Sets the email of this contact.
    *
    * @param email the email of this contact
    */
    @Override
    public void setEmail(java.lang.String email) {
        _contact.setEmail(email);
    }

    @Override
    public boolean isNew() {
        return _contact.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _contact.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _contact.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _contact.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _contact.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _contact.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _contact.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _contact.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _contact.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _contact.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _contact.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new ContactWrapper((Contact) _contact.clone());
    }

    @Override
    public int compareTo(com.dasannetworks.tms.sb.model.Contact contact) {
        return _contact.compareTo(contact);
    }

    @Override
    public int hashCode() {
        return _contact.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.dasannetworks.tms.sb.model.Contact> toCacheModel() {
        return _contact.toCacheModel();
    }

    @Override
    public com.dasannetworks.tms.sb.model.Contact toEscapedModel() {
        return new ContactWrapper(_contact.toEscapedModel());
    }

    @Override
    public com.dasannetworks.tms.sb.model.Contact toUnescapedModel() {
        return new ContactWrapper(_contact.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _contact.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _contact.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _contact.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof ContactWrapper)) {
            return false;
        }

        ContactWrapper contactWrapper = (ContactWrapper) obj;

        if (Validator.equals(_contact, contactWrapper._contact)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Contact getWrappedContact() {
        return _contact;
    }

    @Override
    public Contact getWrappedModel() {
        return _contact;
    }

    @Override
    public void resetOriginalValues() {
        _contact.resetOriginalValues();
    }
}
