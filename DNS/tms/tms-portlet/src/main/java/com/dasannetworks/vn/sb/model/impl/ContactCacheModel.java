package com.dasannetworks.vn.sb.model.impl;

import com.dasannetworks.vn.sb.model.Contact;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Contact in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Contact
 * @generated
 */
public class ContactCacheModel implements CacheModel<Contact>, Externalizable {
    public String uuid;
    public long id;
    public String firstname;
    public String lastname;
    public String telephone;
    public String email;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", id=");
        sb.append(id);
        sb.append(", firstname=");
        sb.append(firstname);
        sb.append(", lastname=");
        sb.append(lastname);
        sb.append(", telephone=");
        sb.append(telephone);
        sb.append(", email=");
        sb.append(email);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Contact toEntityModel() {
        ContactImpl contactImpl = new ContactImpl();

        if (uuid == null) {
            contactImpl.setUuid(StringPool.BLANK);
        } else {
            contactImpl.setUuid(uuid);
        }

        contactImpl.setId(id);

        if (firstname == null) {
            contactImpl.setFirstname(StringPool.BLANK);
        } else {
            contactImpl.setFirstname(firstname);
        }

        if (lastname == null) {
            contactImpl.setLastname(StringPool.BLANK);
        } else {
            contactImpl.setLastname(lastname);
        }

        if (telephone == null) {
            contactImpl.setTelephone(StringPool.BLANK);
        } else {
            contactImpl.setTelephone(telephone);
        }

        if (email == null) {
            contactImpl.setEmail(StringPool.BLANK);
        } else {
            contactImpl.setEmail(email);
        }

        contactImpl.resetOriginalValues();

        return contactImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        id = objectInput.readLong();
        firstname = objectInput.readUTF();
        lastname = objectInput.readUTF();
        telephone = objectInput.readUTF();
        email = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(id);

        if (firstname == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(firstname);
        }

        if (lastname == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(lastname);
        }

        if (telephone == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(telephone);
        }

        if (email == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(email);
        }
    }
}
