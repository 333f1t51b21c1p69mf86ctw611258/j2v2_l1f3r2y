package com.dasannetworks.vn.sb.model;

import com.dasannetworks.vn.sb.service.ClpSerializer;
import com.dasannetworks.vn.sb.service.HandOverFormLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.DateUtil;
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


public class HandOverFormClp extends BaseModelImpl<HandOverForm>
    implements HandOverForm {
    private String _uuid;
    private long _handOverFormId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private long _groupId;
    private String _customerCode;
    private String _contactPoint;
    private String _email;
    private String _phone;
    private String _location;
    private String _personInCharge;
    private String _handOverFormNumber;
    private String _note;
    private Date _assignDate;
    private Date _estimatedReturnDate;
    private int _status;
    private long _statusByUserId;
    private String _statusByUserUuid;
    private Date _statusDate;
    private long _testId;
    private BaseModel<?> _handOverFormRemoteModel;
    private Class<?> _clpSerializerClass = com.dasannetworks.vn.sb.service.ClpSerializer.class;

    public HandOverFormClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return HandOverForm.class;
    }

    @Override
    public String getModelClassName() {
        return HandOverForm.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _handOverFormId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setHandOverFormId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _handOverFormId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("handOverFormId", getHandOverFormId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("groupId", getGroupId());
        attributes.put("customerCode", getCustomerCode());
        attributes.put("contactPoint", getContactPoint());
        attributes.put("email", getEmail());
        attributes.put("phone", getPhone());
        attributes.put("location", getLocation());
        attributes.put("personInCharge", getPersonInCharge());
        attributes.put("handOverFormNumber", getHandOverFormNumber());
        attributes.put("note", getNote());
        attributes.put("assignDate", getAssignDate());
        attributes.put("estimatedReturnDate", getEstimatedReturnDate());
        attributes.put("status", getStatus());
        attributes.put("statusByUserId", getStatusByUserId());
        attributes.put("statusDate", getStatusDate());
        attributes.put("testId", getTestId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long handOverFormId = (Long) attributes.get("handOverFormId");

        if (handOverFormId != null) {
            setHandOverFormId(handOverFormId);
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

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        String customerCode = (String) attributes.get("customerCode");

        if (customerCode != null) {
            setCustomerCode(customerCode);
        }

        String contactPoint = (String) attributes.get("contactPoint");

        if (contactPoint != null) {
            setContactPoint(contactPoint);
        }

        String email = (String) attributes.get("email");

        if (email != null) {
            setEmail(email);
        }

        String phone = (String) attributes.get("phone");

        if (phone != null) {
            setPhone(phone);
        }

        String location = (String) attributes.get("location");

        if (location != null) {
            setLocation(location);
        }

        String personInCharge = (String) attributes.get("personInCharge");

        if (personInCharge != null) {
            setPersonInCharge(personInCharge);
        }

        String handOverFormNumber = (String) attributes.get(
                "handOverFormNumber");

        if (handOverFormNumber != null) {
            setHandOverFormNumber(handOverFormNumber);
        }

        String note = (String) attributes.get("note");

        if (note != null) {
            setNote(note);
        }

        Date assignDate = (Date) attributes.get("assignDate");

        if (assignDate != null) {
            setAssignDate(assignDate);
        }

        Date estimatedReturnDate = (Date) attributes.get("estimatedReturnDate");

        if (estimatedReturnDate != null) {
            setEstimatedReturnDate(estimatedReturnDate);
        }

        Integer status = (Integer) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }

        Long statusByUserId = (Long) attributes.get("statusByUserId");

        if (statusByUserId != null) {
            setStatusByUserId(statusByUserId);
        }

        Date statusDate = (Date) attributes.get("statusDate");

        if (statusDate != null) {
            setStatusDate(statusDate);
        }

        Long testId = (Long) attributes.get("testId");

        if (testId != null) {
            setTestId(testId);
        }
    }

    @Override
    public String getUuid() {
        return _uuid;
    }

    @Override
    public void setUuid(String uuid) {
        _uuid = uuid;

        if (_handOverFormRemoteModel != null) {
            try {
                Class<?> clazz = _handOverFormRemoteModel.getClass();

                Method method = clazz.getMethod("setUuid", String.class);

                method.invoke(_handOverFormRemoteModel, uuid);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getHandOverFormId() {
        return _handOverFormId;
    }

    @Override
    public void setHandOverFormId(long handOverFormId) {
        _handOverFormId = handOverFormId;

        if (_handOverFormRemoteModel != null) {
            try {
                Class<?> clazz = _handOverFormRemoteModel.getClass();

                Method method = clazz.getMethod("setHandOverFormId", long.class);

                method.invoke(_handOverFormRemoteModel, handOverFormId);
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

        if (_handOverFormRemoteModel != null) {
            try {
                Class<?> clazz = _handOverFormRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_handOverFormRemoteModel, companyId);
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

        if (_handOverFormRemoteModel != null) {
            try {
                Class<?> clazz = _handOverFormRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_handOverFormRemoteModel, userId);
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

        if (_handOverFormRemoteModel != null) {
            try {
                Class<?> clazz = _handOverFormRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_handOverFormRemoteModel, userName);
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

        if (_handOverFormRemoteModel != null) {
            try {
                Class<?> clazz = _handOverFormRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_handOverFormRemoteModel, createDate);
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

        if (_handOverFormRemoteModel != null) {
            try {
                Class<?> clazz = _handOverFormRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_handOverFormRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_handOverFormRemoteModel != null) {
            try {
                Class<?> clazz = _handOverFormRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_handOverFormRemoteModel, groupId);
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

        if (_handOverFormRemoteModel != null) {
            try {
                Class<?> clazz = _handOverFormRemoteModel.getClass();

                Method method = clazz.getMethod("setCustomerCode", String.class);

                method.invoke(_handOverFormRemoteModel, customerCode);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getContactPoint() {
        return _contactPoint;
    }

    @Override
    public void setContactPoint(String contactPoint) {
        _contactPoint = contactPoint;

        if (_handOverFormRemoteModel != null) {
            try {
                Class<?> clazz = _handOverFormRemoteModel.getClass();

                Method method = clazz.getMethod("setContactPoint", String.class);

                method.invoke(_handOverFormRemoteModel, contactPoint);
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

        if (_handOverFormRemoteModel != null) {
            try {
                Class<?> clazz = _handOverFormRemoteModel.getClass();

                Method method = clazz.getMethod("setEmail", String.class);

                method.invoke(_handOverFormRemoteModel, email);
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

        if (_handOverFormRemoteModel != null) {
            try {
                Class<?> clazz = _handOverFormRemoteModel.getClass();

                Method method = clazz.getMethod("setPhone", String.class);

                method.invoke(_handOverFormRemoteModel, phone);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getLocation() {
        return _location;
    }

    @Override
    public void setLocation(String location) {
        _location = location;

        if (_handOverFormRemoteModel != null) {
            try {
                Class<?> clazz = _handOverFormRemoteModel.getClass();

                Method method = clazz.getMethod("setLocation", String.class);

                method.invoke(_handOverFormRemoteModel, location);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPersonInCharge() {
        return _personInCharge;
    }

    @Override
    public void setPersonInCharge(String personInCharge) {
        _personInCharge = personInCharge;

        if (_handOverFormRemoteModel != null) {
            try {
                Class<?> clazz = _handOverFormRemoteModel.getClass();

                Method method = clazz.getMethod("setPersonInCharge",
                        String.class);

                method.invoke(_handOverFormRemoteModel, personInCharge);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getHandOverFormNumber() {
        return _handOverFormNumber;
    }

    @Override
    public void setHandOverFormNumber(String handOverFormNumber) {
        _handOverFormNumber = handOverFormNumber;

        if (_handOverFormRemoteModel != null) {
            try {
                Class<?> clazz = _handOverFormRemoteModel.getClass();

                Method method = clazz.getMethod("setHandOverFormNumber",
                        String.class);

                method.invoke(_handOverFormRemoteModel, handOverFormNumber);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getNote() {
        return _note;
    }

    @Override
    public void setNote(String note) {
        _note = note;

        if (_handOverFormRemoteModel != null) {
            try {
                Class<?> clazz = _handOverFormRemoteModel.getClass();

                Method method = clazz.getMethod("setNote", String.class);

                method.invoke(_handOverFormRemoteModel, note);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getAssignDate() {
        return _assignDate;
    }

    @Override
    public void setAssignDate(Date assignDate) {
        _assignDate = assignDate;

        if (_handOverFormRemoteModel != null) {
            try {
                Class<?> clazz = _handOverFormRemoteModel.getClass();

                Method method = clazz.getMethod("setAssignDate", Date.class);

                method.invoke(_handOverFormRemoteModel, assignDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getEstimatedReturnDate() {
        return _estimatedReturnDate;
    }

    @Override
    public void setEstimatedReturnDate(Date estimatedReturnDate) {
        _estimatedReturnDate = estimatedReturnDate;

        if (_handOverFormRemoteModel != null) {
            try {
                Class<?> clazz = _handOverFormRemoteModel.getClass();

                Method method = clazz.getMethod("setEstimatedReturnDate",
                        Date.class);

                method.invoke(_handOverFormRemoteModel, estimatedReturnDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStatus() {
        return _status;
    }

    @Override
    public void setStatus(int status) {
        _status = status;

        if (_handOverFormRemoteModel != null) {
            try {
                Class<?> clazz = _handOverFormRemoteModel.getClass();

                Method method = clazz.getMethod("setStatus", int.class);

                method.invoke(_handOverFormRemoteModel, status);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getStatusByUserId() {
        return _statusByUserId;
    }

    @Override
    public void setStatusByUserId(long statusByUserId) {
        _statusByUserId = statusByUserId;

        if (_handOverFormRemoteModel != null) {
            try {
                Class<?> clazz = _handOverFormRemoteModel.getClass();

                Method method = clazz.getMethod("setStatusByUserId", long.class);

                method.invoke(_handOverFormRemoteModel, statusByUserId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getStatusByUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getStatusByUserId(), "uuid",
            _statusByUserUuid);
    }

    @Override
    public void setStatusByUserUuid(String statusByUserUuid) {
        _statusByUserUuid = statusByUserUuid;
    }

    @Override
    public Date getStatusDate() {
        return _statusDate;
    }

    @Override
    public void setStatusDate(Date statusDate) {
        _statusDate = statusDate;

        if (_handOverFormRemoteModel != null) {
            try {
                Class<?> clazz = _handOverFormRemoteModel.getClass();

                Method method = clazz.getMethod("setStatusDate", Date.class);

                method.invoke(_handOverFormRemoteModel, statusDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getTestId() {
        return _testId;
    }

    @Override
    public void setTestId(long testId) {
        _testId = testId;

        if (_handOverFormRemoteModel != null) {
            try {
                Class<?> clazz = _handOverFormRemoteModel.getClass();

                Method method = clazz.getMethod("setTestId", long.class);

                method.invoke(_handOverFormRemoteModel, testId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public StagedModelType getStagedModelType() {
        return new StagedModelType(PortalUtil.getClassNameId(
                HandOverForm.class.getName()));
    }

    public BaseModel<?> getHandOverFormRemoteModel() {
        return _handOverFormRemoteModel;
    }

    public void setHandOverFormRemoteModel(BaseModel<?> handOverFormRemoteModel) {
        _handOverFormRemoteModel = handOverFormRemoteModel;
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

        Class<?> remoteModelClass = _handOverFormRemoteModel.getClass();

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

        Object returnValue = method.invoke(_handOverFormRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            HandOverFormLocalServiceUtil.addHandOverForm(this);
        } else {
            HandOverFormLocalServiceUtil.updateHandOverForm(this);
        }
    }

    @Override
    public HandOverForm toEscapedModel() {
        return (HandOverForm) ProxyUtil.newProxyInstance(HandOverForm.class.getClassLoader(),
            new Class[] { HandOverForm.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        HandOverFormClp clone = new HandOverFormClp();

        clone.setUuid(getUuid());
        clone.setHandOverFormId(getHandOverFormId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setGroupId(getGroupId());
        clone.setCustomerCode(getCustomerCode());
        clone.setContactPoint(getContactPoint());
        clone.setEmail(getEmail());
        clone.setPhone(getPhone());
        clone.setLocation(getLocation());
        clone.setPersonInCharge(getPersonInCharge());
        clone.setHandOverFormNumber(getHandOverFormNumber());
        clone.setNote(getNote());
        clone.setAssignDate(getAssignDate());
        clone.setEstimatedReturnDate(getEstimatedReturnDate());
        clone.setStatus(getStatus());
        clone.setStatusByUserId(getStatusByUserId());
        clone.setStatusDate(getStatusDate());
        clone.setTestId(getTestId());

        return clone;
    }

    @Override
    public int compareTo(HandOverForm handOverForm) {
        int value = 0;

        if (getHandOverFormId() < handOverForm.getHandOverFormId()) {
            value = -1;
        } else if (getHandOverFormId() > handOverForm.getHandOverFormId()) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        value = DateUtil.compareTo(getModifiedDate(),
                handOverForm.getModifiedDate());

        value = value * -1;

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof HandOverFormClp)) {
            return false;
        }

        HandOverFormClp handOverForm = (HandOverFormClp) obj;

        long primaryKey = handOverForm.getPrimaryKey();

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
        StringBundler sb = new StringBundler(45);

        sb.append("{uuid=");
        sb.append(getUuid());
        sb.append(", handOverFormId=");
        sb.append(getHandOverFormId());
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
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", customerCode=");
        sb.append(getCustomerCode());
        sb.append(", contactPoint=");
        sb.append(getContactPoint());
        sb.append(", email=");
        sb.append(getEmail());
        sb.append(", phone=");
        sb.append(getPhone());
        sb.append(", location=");
        sb.append(getLocation());
        sb.append(", personInCharge=");
        sb.append(getPersonInCharge());
        sb.append(", handOverFormNumber=");
        sb.append(getHandOverFormNumber());
        sb.append(", note=");
        sb.append(getNote());
        sb.append(", assignDate=");
        sb.append(getAssignDate());
        sb.append(", estimatedReturnDate=");
        sb.append(getEstimatedReturnDate());
        sb.append(", status=");
        sb.append(getStatus());
        sb.append(", statusByUserId=");
        sb.append(getStatusByUserId());
        sb.append(", statusDate=");
        sb.append(getStatusDate());
        sb.append(", testId=");
        sb.append(getTestId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(70);

        sb.append("<model><model-name>");
        sb.append("com.dasannetworks.vn.sb.model.HandOverForm");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>uuid</column-name><column-value><![CDATA[");
        sb.append(getUuid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>handOverFormId</column-name><column-value><![CDATA[");
        sb.append(getHandOverFormId());
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
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>customerCode</column-name><column-value><![CDATA[");
        sb.append(getCustomerCode());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>contactPoint</column-name><column-value><![CDATA[");
        sb.append(getContactPoint());
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
            "<column><column-name>location</column-name><column-value><![CDATA[");
        sb.append(getLocation());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>personInCharge</column-name><column-value><![CDATA[");
        sb.append(getPersonInCharge());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>handOverFormNumber</column-name><column-value><![CDATA[");
        sb.append(getHandOverFormNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>note</column-name><column-value><![CDATA[");
        sb.append(getNote());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>assignDate</column-name><column-value><![CDATA[");
        sb.append(getAssignDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>estimatedReturnDate</column-name><column-value><![CDATA[");
        sb.append(getEstimatedReturnDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>status</column-name><column-value><![CDATA[");
        sb.append(getStatus());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>statusByUserId</column-name><column-value><![CDATA[");
        sb.append(getStatusByUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>statusDate</column-name><column-value><![CDATA[");
        sb.append(getStatusDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>testId</column-name><column-value><![CDATA[");
        sb.append(getTestId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
