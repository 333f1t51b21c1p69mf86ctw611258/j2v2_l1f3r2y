package com.dasannetworks.tms.sb.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.dasannetworks.tms.sb.service.http.StudentServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.dasannetworks.tms.sb.service.http.StudentServiceSoap
 * @generated
 */
public class StudentSoap implements Serializable {
    private String _uuid;
    private long _studentId;
    private String _firstname;
    private String _lastName;
    private String _branch;
    private int _age;
    private String _email;

    public StudentSoap() {
    }

    public static StudentSoap toSoapModel(Student model) {
        StudentSoap soapModel = new StudentSoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setStudentId(model.getStudentId());
        soapModel.setFirstname(model.getFirstname());
        soapModel.setLastName(model.getLastName());
        soapModel.setBranch(model.getBranch());
        soapModel.setAge(model.getAge());
        soapModel.setEmail(model.getEmail());

        return soapModel;
    }

    public static StudentSoap[] toSoapModels(Student[] models) {
        StudentSoap[] soapModels = new StudentSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static StudentSoap[][] toSoapModels(Student[][] models) {
        StudentSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new StudentSoap[models.length][models[0].length];
        } else {
            soapModels = new StudentSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static StudentSoap[] toSoapModels(List<Student> models) {
        List<StudentSoap> soapModels = new ArrayList<StudentSoap>(models.size());

        for (Student model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new StudentSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _studentId;
    }

    public void setPrimaryKey(long pk) {
        setStudentId(pk);
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getStudentId() {
        return _studentId;
    }

    public void setStudentId(long studentId) {
        _studentId = studentId;
    }

    public String getFirstname() {
        return _firstname;
    }

    public void setFirstname(String firstname) {
        _firstname = firstname;
    }

    public String getLastName() {
        return _lastName;
    }

    public void setLastName(String lastName) {
        _lastName = lastName;
    }

    public String getBranch() {
        return _branch;
    }

    public void setBranch(String branch) {
        _branch = branch;
    }

    public int getAge() {
        return _age;
    }

    public void setAge(int age) {
        _age = age;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String email) {
        _email = email;
    }
}
