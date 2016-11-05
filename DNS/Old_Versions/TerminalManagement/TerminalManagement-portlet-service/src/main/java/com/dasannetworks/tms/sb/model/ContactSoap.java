package com.dasannetworks.tms.sb.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.dasannetworks.tms.sb.service.http.ContactServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.dasannetworks.tms.sb.service.http.ContactServiceSoap
 * @generated
 */
public class ContactSoap implements Serializable {
    private String _uuid;
    private long _id;
    private String _firstname;
    private String _lastname;
    private String _telephone;
    private String _email;

    public ContactSoap() {
    }

    public static ContactSoap toSoapModel(Contact model) {
        ContactSoap soapModel = new ContactSoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setId(model.getId());
        soapModel.setFirstname(model.getFirstname());
        soapModel.setLastname(model.getLastname());
        soapModel.setTelephone(model.getTelephone());
        soapModel.setEmail(model.getEmail());

        return soapModel;
    }

    public static ContactSoap[] toSoapModels(Contact[] models) {
        ContactSoap[] soapModels = new ContactSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static ContactSoap[][] toSoapModels(Contact[][] models) {
        ContactSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new ContactSoap[models.length][models[0].length];
        } else {
            soapModels = new ContactSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static ContactSoap[] toSoapModels(List<Contact> models) {
        List<ContactSoap> soapModels = new ArrayList<ContactSoap>(models.size());

        for (Contact model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new ContactSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _id;
    }

    public void setPrimaryKey(long pk) {
        setId(pk);
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getId() {
        return _id;
    }

    public void setId(long id) {
        _id = id;
    }

    public String getFirstname() {
        return _firstname;
    }

    public void setFirstname(String firstname) {
        _firstname = firstname;
    }

    public String getLastname() {
        return _lastname;
    }

    public void setLastname(String lastname) {
        _lastname = lastname;
    }

    public String getTelephone() {
        return _telephone;
    }

    public void setTelephone(String telephone) {
        _telephone = telephone;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String email) {
        _email = email;
    }
}
