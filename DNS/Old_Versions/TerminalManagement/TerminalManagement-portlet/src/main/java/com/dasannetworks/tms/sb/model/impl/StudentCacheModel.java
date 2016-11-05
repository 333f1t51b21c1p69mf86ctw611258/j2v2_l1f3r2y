package com.dasannetworks.tms.sb.model.impl;

import com.dasannetworks.tms.sb.model.Student;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Student in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Student
 * @generated
 */
public class StudentCacheModel implements CacheModel<Student>, Externalizable {
    public String uuid;
    public long studentId;
    public String firstname;
    public String lastName;
    public String branch;
    public int age;
    public String email;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(15);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", studentId=");
        sb.append(studentId);
        sb.append(", firstname=");
        sb.append(firstname);
        sb.append(", lastName=");
        sb.append(lastName);
        sb.append(", branch=");
        sb.append(branch);
        sb.append(", age=");
        sb.append(age);
        sb.append(", email=");
        sb.append(email);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Student toEntityModel() {
        StudentImpl studentImpl = new StudentImpl();

        if (uuid == null) {
            studentImpl.setUuid(StringPool.BLANK);
        } else {
            studentImpl.setUuid(uuid);
        }

        studentImpl.setStudentId(studentId);

        if (firstname == null) {
            studentImpl.setFirstname(StringPool.BLANK);
        } else {
            studentImpl.setFirstname(firstname);
        }

        if (lastName == null) {
            studentImpl.setLastName(StringPool.BLANK);
        } else {
            studentImpl.setLastName(lastName);
        }

        if (branch == null) {
            studentImpl.setBranch(StringPool.BLANK);
        } else {
            studentImpl.setBranch(branch);
        }

        studentImpl.setAge(age);

        if (email == null) {
            studentImpl.setEmail(StringPool.BLANK);
        } else {
            studentImpl.setEmail(email);
        }

        studentImpl.resetOriginalValues();

        return studentImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        studentId = objectInput.readLong();
        firstname = objectInput.readUTF();
        lastName = objectInput.readUTF();
        branch = objectInput.readUTF();
        age = objectInput.readInt();
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

        objectOutput.writeLong(studentId);

        if (firstname == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(firstname);
        }

        if (lastName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(lastName);
        }

        if (branch == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(branch);
        }

        objectOutput.writeInt(age);

        if (email == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(email);
        }
    }
}
