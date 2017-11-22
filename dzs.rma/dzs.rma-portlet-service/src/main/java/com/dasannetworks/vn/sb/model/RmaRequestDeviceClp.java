package com.dasannetworks.vn.sb.model;

import com.dasannetworks.vn.sb.service.ClpSerializer;
import com.dasannetworks.vn.sb.service.RmaRequestDeviceLocalServiceUtil;
import com.dasannetworks.vn.sb.service.persistence.RmaRequestDevicePK;

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


public class RmaRequestDeviceClp extends BaseModelImpl<RmaRequestDevice>
    implements RmaRequestDevice {
    private long _rmaRequestId;
    private long _deviceId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _originalSerialNumber;
    private Date _faultyDate;
    private String _faultyNote;
    private String _action;
    private Long _partnerId;
    private String _partnerInCharge;
    private String _partnerEmail;
    private String _partnerPhone;
    private String _partnerAddress;
    private Date _sendingEstReturnDate;
    private Date _sendingReturnedDate;
    private Date _sendingAssignedDate;
    private String _sendingNote;
    private Date _receivingReturnedDate;
    private String _receivingNote;
    private Date _returningReturnedDate;
    private String _returningNote;
    private Long _duplicatedRmaRequestId;
    private Date _deniedDate;
    private String _deniedNote;
    private Date _replacedDate;
    private String _replacedNote;
    private String _replacedNumber;
    private Long _replacedOldDeviceId;
    private Long _replacedOldDeviceExtId;
    private Long _replacedNewDeviceId;
    private Long _replacedNewDeviceExtId;
    private int _oldStatus;
    private int _status;
    private long _statusByUserId;
    private String _statusByUserUuid;
    private Date _statusDate;
    private BaseModel<?> _rmaRequestDeviceRemoteModel;
    private Class<?> _clpSerializerClass = com.dasannetworks.vn.sb.service.ClpSerializer.class;

    public RmaRequestDeviceClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return RmaRequestDevice.class;
    }

    @Override
    public String getModelClassName() {
        return RmaRequestDevice.class.getName();
    }

    @Override
    public RmaRequestDevicePK getPrimaryKey() {
        return new RmaRequestDevicePK(_rmaRequestId, _deviceId);
    }

    @Override
    public void setPrimaryKey(RmaRequestDevicePK primaryKey) {
        setRmaRequestId(primaryKey.rmaRequestId);
        setDeviceId(primaryKey.deviceId);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new RmaRequestDevicePK(_rmaRequestId, _deviceId);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((RmaRequestDevicePK) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("rmaRequestId", getRmaRequestId());
        attributes.put("deviceId", getDeviceId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("originalSerialNumber", getOriginalSerialNumber());
        attributes.put("faultyDate", getFaultyDate());
        attributes.put("faultyNote", getFaultyNote());
        attributes.put("action", getAction());
        attributes.put("partnerId", getPartnerId());
        attributes.put("partnerInCharge", getPartnerInCharge());
        attributes.put("partnerEmail", getPartnerEmail());
        attributes.put("partnerPhone", getPartnerPhone());
        attributes.put("partnerAddress", getPartnerAddress());
        attributes.put("sendingEstReturnDate", getSendingEstReturnDate());
        attributes.put("sendingReturnedDate", getSendingReturnedDate());
        attributes.put("sendingAssignedDate", getSendingAssignedDate());
        attributes.put("sendingNote", getSendingNote());
        attributes.put("receivingReturnedDate", getReceivingReturnedDate());
        attributes.put("receivingNote", getReceivingNote());
        attributes.put("returningReturnedDate", getReturningReturnedDate());
        attributes.put("returningNote", getReturningNote());
        attributes.put("duplicatedRmaRequestId", getDuplicatedRmaRequestId());
        attributes.put("deniedDate", getDeniedDate());
        attributes.put("deniedNote", getDeniedNote());
        attributes.put("replacedDate", getReplacedDate());
        attributes.put("replacedNote", getReplacedNote());
        attributes.put("replacedNumber", getReplacedNumber());
        attributes.put("replacedOldDeviceId", getReplacedOldDeviceId());
        attributes.put("replacedOldDeviceExtId", getReplacedOldDeviceExtId());
        attributes.put("replacedNewDeviceId", getReplacedNewDeviceId());
        attributes.put("replacedNewDeviceExtId", getReplacedNewDeviceExtId());
        attributes.put("oldStatus", getOldStatus());
        attributes.put("status", getStatus());
        attributes.put("statusByUserId", getStatusByUserId());
        attributes.put("statusDate", getStatusDate());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long rmaRequestId = (Long) attributes.get("rmaRequestId");

        if (rmaRequestId != null) {
            setRmaRequestId(rmaRequestId);
        }

        Long deviceId = (Long) attributes.get("deviceId");

        if (deviceId != null) {
            setDeviceId(deviceId);
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

        String originalSerialNumber = (String) attributes.get(
                "originalSerialNumber");

        if (originalSerialNumber != null) {
            setOriginalSerialNumber(originalSerialNumber);
        }

        Date faultyDate = (Date) attributes.get("faultyDate");

        if (faultyDate != null) {
            setFaultyDate(faultyDate);
        }

        String faultyNote = (String) attributes.get("faultyNote");

        if (faultyNote != null) {
            setFaultyNote(faultyNote);
        }

        String action = (String) attributes.get("action");

        if (action != null) {
            setAction(action);
        }

        Long partnerId = (Long) attributes.get("partnerId");

        if (partnerId != null) {
            setPartnerId(partnerId);
        }

        String partnerInCharge = (String) attributes.get("partnerInCharge");

        if (partnerInCharge != null) {
            setPartnerInCharge(partnerInCharge);
        }

        String partnerEmail = (String) attributes.get("partnerEmail");

        if (partnerEmail != null) {
            setPartnerEmail(partnerEmail);
        }

        String partnerPhone = (String) attributes.get("partnerPhone");

        if (partnerPhone != null) {
            setPartnerPhone(partnerPhone);
        }

        String partnerAddress = (String) attributes.get("partnerAddress");

        if (partnerAddress != null) {
            setPartnerAddress(partnerAddress);
        }

        Date sendingEstReturnDate = (Date) attributes.get(
                "sendingEstReturnDate");

        if (sendingEstReturnDate != null) {
            setSendingEstReturnDate(sendingEstReturnDate);
        }

        Date sendingReturnedDate = (Date) attributes.get("sendingReturnedDate");

        if (sendingReturnedDate != null) {
            setSendingReturnedDate(sendingReturnedDate);
        }

        Date sendingAssignedDate = (Date) attributes.get("sendingAssignedDate");

        if (sendingAssignedDate != null) {
            setSendingAssignedDate(sendingAssignedDate);
        }

        String sendingNote = (String) attributes.get("sendingNote");

        if (sendingNote != null) {
            setSendingNote(sendingNote);
        }

        Date receivingReturnedDate = (Date) attributes.get(
                "receivingReturnedDate");

        if (receivingReturnedDate != null) {
            setReceivingReturnedDate(receivingReturnedDate);
        }

        String receivingNote = (String) attributes.get("receivingNote");

        if (receivingNote != null) {
            setReceivingNote(receivingNote);
        }

        Date returningReturnedDate = (Date) attributes.get(
                "returningReturnedDate");

        if (returningReturnedDate != null) {
            setReturningReturnedDate(returningReturnedDate);
        }

        String returningNote = (String) attributes.get("returningNote");

        if (returningNote != null) {
            setReturningNote(returningNote);
        }

        Long duplicatedRmaRequestId = (Long) attributes.get(
                "duplicatedRmaRequestId");

        if (duplicatedRmaRequestId != null) {
            setDuplicatedRmaRequestId(duplicatedRmaRequestId);
        }

        Date deniedDate = (Date) attributes.get("deniedDate");

        if (deniedDate != null) {
            setDeniedDate(deniedDate);
        }

        String deniedNote = (String) attributes.get("deniedNote");

        if (deniedNote != null) {
            setDeniedNote(deniedNote);
        }

        Date replacedDate = (Date) attributes.get("replacedDate");

        if (replacedDate != null) {
            setReplacedDate(replacedDate);
        }

        String replacedNote = (String) attributes.get("replacedNote");

        if (replacedNote != null) {
            setReplacedNote(replacedNote);
        }

        String replacedNumber = (String) attributes.get("replacedNumber");

        if (replacedNumber != null) {
            setReplacedNumber(replacedNumber);
        }

        Long replacedOldDeviceId = (Long) attributes.get("replacedOldDeviceId");

        if (replacedOldDeviceId != null) {
            setReplacedOldDeviceId(replacedOldDeviceId);
        }

        Long replacedOldDeviceExtId = (Long) attributes.get(
                "replacedOldDeviceExtId");

        if (replacedOldDeviceExtId != null) {
            setReplacedOldDeviceExtId(replacedOldDeviceExtId);
        }

        Long replacedNewDeviceId = (Long) attributes.get("replacedNewDeviceId");

        if (replacedNewDeviceId != null) {
            setReplacedNewDeviceId(replacedNewDeviceId);
        }

        Long replacedNewDeviceExtId = (Long) attributes.get(
                "replacedNewDeviceExtId");

        if (replacedNewDeviceExtId != null) {
            setReplacedNewDeviceExtId(replacedNewDeviceExtId);
        }

        Integer oldStatus = (Integer) attributes.get("oldStatus");

        if (oldStatus != null) {
            setOldStatus(oldStatus);
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
    }

    @Override
    public long getRmaRequestId() {
        return _rmaRequestId;
    }

    @Override
    public void setRmaRequestId(long rmaRequestId) {
        _rmaRequestId = rmaRequestId;

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setRmaRequestId", long.class);

                method.invoke(_rmaRequestDeviceRemoteModel, rmaRequestId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getDeviceId() {
        return _deviceId;
    }

    @Override
    public void setDeviceId(long deviceId) {
        _deviceId = deviceId;

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setDeviceId", long.class);

                method.invoke(_rmaRequestDeviceRemoteModel, deviceId);
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

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_rmaRequestDeviceRemoteModel, companyId);
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

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_rmaRequestDeviceRemoteModel, userId);
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

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_rmaRequestDeviceRemoteModel, userName);
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

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_rmaRequestDeviceRemoteModel, createDate);
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

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_rmaRequestDeviceRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getOriginalSerialNumber() {
        return _originalSerialNumber;
    }

    @Override
    public void setOriginalSerialNumber(String originalSerialNumber) {
        _originalSerialNumber = originalSerialNumber;

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setOriginalSerialNumber",
                        String.class);

                method.invoke(_rmaRequestDeviceRemoteModel, originalSerialNumber);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getFaultyDate() {
        return _faultyDate;
    }

    @Override
    public void setFaultyDate(Date faultyDate) {
        _faultyDate = faultyDate;

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setFaultyDate", Date.class);

                method.invoke(_rmaRequestDeviceRemoteModel, faultyDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getFaultyNote() {
        return _faultyNote;
    }

    @Override
    public void setFaultyNote(String faultyNote) {
        _faultyNote = faultyNote;

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setFaultyNote", String.class);

                method.invoke(_rmaRequestDeviceRemoteModel, faultyNote);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getAction() {
        return _action;
    }

    @Override
    public void setAction(String action) {
        _action = action;

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setAction", String.class);

                method.invoke(_rmaRequestDeviceRemoteModel, action);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Long getPartnerId() {
        return _partnerId;
    }

    @Override
    public void setPartnerId(Long partnerId) {
        _partnerId = partnerId;

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setPartnerId", Long.class);

                method.invoke(_rmaRequestDeviceRemoteModel, partnerId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPartnerInCharge() {
        return _partnerInCharge;
    }

    @Override
    public void setPartnerInCharge(String partnerInCharge) {
        _partnerInCharge = partnerInCharge;

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setPartnerInCharge",
                        String.class);

                method.invoke(_rmaRequestDeviceRemoteModel, partnerInCharge);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPartnerEmail() {
        return _partnerEmail;
    }

    @Override
    public void setPartnerEmail(String partnerEmail) {
        _partnerEmail = partnerEmail;

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setPartnerEmail", String.class);

                method.invoke(_rmaRequestDeviceRemoteModel, partnerEmail);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPartnerPhone() {
        return _partnerPhone;
    }

    @Override
    public void setPartnerPhone(String partnerPhone) {
        _partnerPhone = partnerPhone;

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setPartnerPhone", String.class);

                method.invoke(_rmaRequestDeviceRemoteModel, partnerPhone);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPartnerAddress() {
        return _partnerAddress;
    }

    @Override
    public void setPartnerAddress(String partnerAddress) {
        _partnerAddress = partnerAddress;

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setPartnerAddress",
                        String.class);

                method.invoke(_rmaRequestDeviceRemoteModel, partnerAddress);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getSendingEstReturnDate() {
        return _sendingEstReturnDate;
    }

    @Override
    public void setSendingEstReturnDate(Date sendingEstReturnDate) {
        _sendingEstReturnDate = sendingEstReturnDate;

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setSendingEstReturnDate",
                        Date.class);

                method.invoke(_rmaRequestDeviceRemoteModel, sendingEstReturnDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getSendingReturnedDate() {
        return _sendingReturnedDate;
    }

    @Override
    public void setSendingReturnedDate(Date sendingReturnedDate) {
        _sendingReturnedDate = sendingReturnedDate;

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setSendingReturnedDate",
                        Date.class);

                method.invoke(_rmaRequestDeviceRemoteModel, sendingReturnedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getSendingAssignedDate() {
        return _sendingAssignedDate;
    }

    @Override
    public void setSendingAssignedDate(Date sendingAssignedDate) {
        _sendingAssignedDate = sendingAssignedDate;

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setSendingAssignedDate",
                        Date.class);

                method.invoke(_rmaRequestDeviceRemoteModel, sendingAssignedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getSendingNote() {
        return _sendingNote;
    }

    @Override
    public void setSendingNote(String sendingNote) {
        _sendingNote = sendingNote;

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setSendingNote", String.class);

                method.invoke(_rmaRequestDeviceRemoteModel, sendingNote);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getReceivingReturnedDate() {
        return _receivingReturnedDate;
    }

    @Override
    public void setReceivingReturnedDate(Date receivingReturnedDate) {
        _receivingReturnedDate = receivingReturnedDate;

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setReceivingReturnedDate",
                        Date.class);

                method.invoke(_rmaRequestDeviceRemoteModel,
                    receivingReturnedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getReceivingNote() {
        return _receivingNote;
    }

    @Override
    public void setReceivingNote(String receivingNote) {
        _receivingNote = receivingNote;

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setReceivingNote", String.class);

                method.invoke(_rmaRequestDeviceRemoteModel, receivingNote);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getReturningReturnedDate() {
        return _returningReturnedDate;
    }

    @Override
    public void setReturningReturnedDate(Date returningReturnedDate) {
        _returningReturnedDate = returningReturnedDate;

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setReturningReturnedDate",
                        Date.class);

                method.invoke(_rmaRequestDeviceRemoteModel,
                    returningReturnedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getReturningNote() {
        return _returningNote;
    }

    @Override
    public void setReturningNote(String returningNote) {
        _returningNote = returningNote;

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setReturningNote", String.class);

                method.invoke(_rmaRequestDeviceRemoteModel, returningNote);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Long getDuplicatedRmaRequestId() {
        return _duplicatedRmaRequestId;
    }

    @Override
    public void setDuplicatedRmaRequestId(Long duplicatedRmaRequestId) {
        _duplicatedRmaRequestId = duplicatedRmaRequestId;

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setDuplicatedRmaRequestId",
                        Long.class);

                method.invoke(_rmaRequestDeviceRemoteModel,
                    duplicatedRmaRequestId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getDeniedDate() {
        return _deniedDate;
    }

    @Override
    public void setDeniedDate(Date deniedDate) {
        _deniedDate = deniedDate;

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setDeniedDate", Date.class);

                method.invoke(_rmaRequestDeviceRemoteModel, deniedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDeniedNote() {
        return _deniedNote;
    }

    @Override
    public void setDeniedNote(String deniedNote) {
        _deniedNote = deniedNote;

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setDeniedNote", String.class);

                method.invoke(_rmaRequestDeviceRemoteModel, deniedNote);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getReplacedDate() {
        return _replacedDate;
    }

    @Override
    public void setReplacedDate(Date replacedDate) {
        _replacedDate = replacedDate;

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setReplacedDate", Date.class);

                method.invoke(_rmaRequestDeviceRemoteModel, replacedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getReplacedNote() {
        return _replacedNote;
    }

    @Override
    public void setReplacedNote(String replacedNote) {
        _replacedNote = replacedNote;

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setReplacedNote", String.class);

                method.invoke(_rmaRequestDeviceRemoteModel, replacedNote);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getReplacedNumber() {
        return _replacedNumber;
    }

    @Override
    public void setReplacedNumber(String replacedNumber) {
        _replacedNumber = replacedNumber;

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setReplacedNumber",
                        String.class);

                method.invoke(_rmaRequestDeviceRemoteModel, replacedNumber);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Long getReplacedOldDeviceId() {
        return _replacedOldDeviceId;
    }

    @Override
    public void setReplacedOldDeviceId(Long replacedOldDeviceId) {
        _replacedOldDeviceId = replacedOldDeviceId;

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setReplacedOldDeviceId",
                        Long.class);

                method.invoke(_rmaRequestDeviceRemoteModel, replacedOldDeviceId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Long getReplacedOldDeviceExtId() {
        return _replacedOldDeviceExtId;
    }

    @Override
    public void setReplacedOldDeviceExtId(Long replacedOldDeviceExtId) {
        _replacedOldDeviceExtId = replacedOldDeviceExtId;

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setReplacedOldDeviceExtId",
                        Long.class);

                method.invoke(_rmaRequestDeviceRemoteModel,
                    replacedOldDeviceExtId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Long getReplacedNewDeviceId() {
        return _replacedNewDeviceId;
    }

    @Override
    public void setReplacedNewDeviceId(Long replacedNewDeviceId) {
        _replacedNewDeviceId = replacedNewDeviceId;

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setReplacedNewDeviceId",
                        Long.class);

                method.invoke(_rmaRequestDeviceRemoteModel, replacedNewDeviceId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Long getReplacedNewDeviceExtId() {
        return _replacedNewDeviceExtId;
    }

    @Override
    public void setReplacedNewDeviceExtId(Long replacedNewDeviceExtId) {
        _replacedNewDeviceExtId = replacedNewDeviceExtId;

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setReplacedNewDeviceExtId",
                        Long.class);

                method.invoke(_rmaRequestDeviceRemoteModel,
                    replacedNewDeviceExtId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getOldStatus() {
        return _oldStatus;
    }

    @Override
    public void setOldStatus(int oldStatus) {
        _oldStatus = oldStatus;

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setOldStatus", int.class);

                method.invoke(_rmaRequestDeviceRemoteModel, oldStatus);
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

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setStatus", int.class);

                method.invoke(_rmaRequestDeviceRemoteModel, status);
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

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setStatusByUserId", long.class);

                method.invoke(_rmaRequestDeviceRemoteModel, statusByUserId);
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

        if (_rmaRequestDeviceRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestDeviceRemoteModel.getClass();

                Method method = clazz.getMethod("setStatusDate", Date.class);

                method.invoke(_rmaRequestDeviceRemoteModel, statusDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getRmaRequestDeviceRemoteModel() {
        return _rmaRequestDeviceRemoteModel;
    }

    public void setRmaRequestDeviceRemoteModel(
        BaseModel<?> rmaRequestDeviceRemoteModel) {
        _rmaRequestDeviceRemoteModel = rmaRequestDeviceRemoteModel;
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

        Class<?> remoteModelClass = _rmaRequestDeviceRemoteModel.getClass();

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

        Object returnValue = method.invoke(_rmaRequestDeviceRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            RmaRequestDeviceLocalServiceUtil.addRmaRequestDevice(this);
        } else {
            RmaRequestDeviceLocalServiceUtil.updateRmaRequestDevice(this);
        }
    }

    @Override
    public RmaRequestDevice toEscapedModel() {
        return (RmaRequestDevice) ProxyUtil.newProxyInstance(RmaRequestDevice.class.getClassLoader(),
            new Class[] { RmaRequestDevice.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        RmaRequestDeviceClp clone = new RmaRequestDeviceClp();

        clone.setRmaRequestId(getRmaRequestId());
        clone.setDeviceId(getDeviceId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setOriginalSerialNumber(getOriginalSerialNumber());
        clone.setFaultyDate(getFaultyDate());
        clone.setFaultyNote(getFaultyNote());
        clone.setAction(getAction());
        clone.setPartnerId(getPartnerId());
        clone.setPartnerInCharge(getPartnerInCharge());
        clone.setPartnerEmail(getPartnerEmail());
        clone.setPartnerPhone(getPartnerPhone());
        clone.setPartnerAddress(getPartnerAddress());
        clone.setSendingEstReturnDate(getSendingEstReturnDate());
        clone.setSendingReturnedDate(getSendingReturnedDate());
        clone.setSendingAssignedDate(getSendingAssignedDate());
        clone.setSendingNote(getSendingNote());
        clone.setReceivingReturnedDate(getReceivingReturnedDate());
        clone.setReceivingNote(getReceivingNote());
        clone.setReturningReturnedDate(getReturningReturnedDate());
        clone.setReturningNote(getReturningNote());
        clone.setDuplicatedRmaRequestId(getDuplicatedRmaRequestId());
        clone.setDeniedDate(getDeniedDate());
        clone.setDeniedNote(getDeniedNote());
        clone.setReplacedDate(getReplacedDate());
        clone.setReplacedNote(getReplacedNote());
        clone.setReplacedNumber(getReplacedNumber());
        clone.setReplacedOldDeviceId(getReplacedOldDeviceId());
        clone.setReplacedOldDeviceExtId(getReplacedOldDeviceExtId());
        clone.setReplacedNewDeviceId(getReplacedNewDeviceId());
        clone.setReplacedNewDeviceExtId(getReplacedNewDeviceExtId());
        clone.setOldStatus(getOldStatus());
        clone.setStatus(getStatus());
        clone.setStatusByUserId(getStatusByUserId());
        clone.setStatusDate(getStatusDate());

        return clone;
    }

    @Override
    public int compareTo(RmaRequestDevice rmaRequestDevice) {
        RmaRequestDevicePK primaryKey = rmaRequestDevice.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof RmaRequestDeviceClp)) {
            return false;
        }

        RmaRequestDeviceClp rmaRequestDevice = (RmaRequestDeviceClp) obj;

        RmaRequestDevicePK primaryKey = rmaRequestDevice.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
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
        return getPrimaryKey().hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(77);

        sb.append("{rmaRequestId=");
        sb.append(getRmaRequestId());
        sb.append(", deviceId=");
        sb.append(getDeviceId());
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
        sb.append(", originalSerialNumber=");
        sb.append(getOriginalSerialNumber());
        sb.append(", faultyDate=");
        sb.append(getFaultyDate());
        sb.append(", faultyNote=");
        sb.append(getFaultyNote());
        sb.append(", action=");
        sb.append(getAction());
        sb.append(", partnerId=");
        sb.append(getPartnerId());
        sb.append(", partnerInCharge=");
        sb.append(getPartnerInCharge());
        sb.append(", partnerEmail=");
        sb.append(getPartnerEmail());
        sb.append(", partnerPhone=");
        sb.append(getPartnerPhone());
        sb.append(", partnerAddress=");
        sb.append(getPartnerAddress());
        sb.append(", sendingEstReturnDate=");
        sb.append(getSendingEstReturnDate());
        sb.append(", sendingReturnedDate=");
        sb.append(getSendingReturnedDate());
        sb.append(", sendingAssignedDate=");
        sb.append(getSendingAssignedDate());
        sb.append(", sendingNote=");
        sb.append(getSendingNote());
        sb.append(", receivingReturnedDate=");
        sb.append(getReceivingReturnedDate());
        sb.append(", receivingNote=");
        sb.append(getReceivingNote());
        sb.append(", returningReturnedDate=");
        sb.append(getReturningReturnedDate());
        sb.append(", returningNote=");
        sb.append(getReturningNote());
        sb.append(", duplicatedRmaRequestId=");
        sb.append(getDuplicatedRmaRequestId());
        sb.append(", deniedDate=");
        sb.append(getDeniedDate());
        sb.append(", deniedNote=");
        sb.append(getDeniedNote());
        sb.append(", replacedDate=");
        sb.append(getReplacedDate());
        sb.append(", replacedNote=");
        sb.append(getReplacedNote());
        sb.append(", replacedNumber=");
        sb.append(getReplacedNumber());
        sb.append(", replacedOldDeviceId=");
        sb.append(getReplacedOldDeviceId());
        sb.append(", replacedOldDeviceExtId=");
        sb.append(getReplacedOldDeviceExtId());
        sb.append(", replacedNewDeviceId=");
        sb.append(getReplacedNewDeviceId());
        sb.append(", replacedNewDeviceExtId=");
        sb.append(getReplacedNewDeviceExtId());
        sb.append(", oldStatus=");
        sb.append(getOldStatus());
        sb.append(", status=");
        sb.append(getStatus());
        sb.append(", statusByUserId=");
        sb.append(getStatusByUserId());
        sb.append(", statusDate=");
        sb.append(getStatusDate());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(118);

        sb.append("<model><model-name>");
        sb.append("com.dasannetworks.vn.sb.model.RmaRequestDevice");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>rmaRequestId</column-name><column-value><![CDATA[");
        sb.append(getRmaRequestId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>deviceId</column-name><column-value><![CDATA[");
        sb.append(getDeviceId());
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
            "<column><column-name>originalSerialNumber</column-name><column-value><![CDATA[");
        sb.append(getOriginalSerialNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>faultyDate</column-name><column-value><![CDATA[");
        sb.append(getFaultyDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>faultyNote</column-name><column-value><![CDATA[");
        sb.append(getFaultyNote());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>action</column-name><column-value><![CDATA[");
        sb.append(getAction());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>partnerId</column-name><column-value><![CDATA[");
        sb.append(getPartnerId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>partnerInCharge</column-name><column-value><![CDATA[");
        sb.append(getPartnerInCharge());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>partnerEmail</column-name><column-value><![CDATA[");
        sb.append(getPartnerEmail());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>partnerPhone</column-name><column-value><![CDATA[");
        sb.append(getPartnerPhone());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>partnerAddress</column-name><column-value><![CDATA[");
        sb.append(getPartnerAddress());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>sendingEstReturnDate</column-name><column-value><![CDATA[");
        sb.append(getSendingEstReturnDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>sendingReturnedDate</column-name><column-value><![CDATA[");
        sb.append(getSendingReturnedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>sendingAssignedDate</column-name><column-value><![CDATA[");
        sb.append(getSendingAssignedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>sendingNote</column-name><column-value><![CDATA[");
        sb.append(getSendingNote());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>receivingReturnedDate</column-name><column-value><![CDATA[");
        sb.append(getReceivingReturnedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>receivingNote</column-name><column-value><![CDATA[");
        sb.append(getReceivingNote());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>returningReturnedDate</column-name><column-value><![CDATA[");
        sb.append(getReturningReturnedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>returningNote</column-name><column-value><![CDATA[");
        sb.append(getReturningNote());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>duplicatedRmaRequestId</column-name><column-value><![CDATA[");
        sb.append(getDuplicatedRmaRequestId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>deniedDate</column-name><column-value><![CDATA[");
        sb.append(getDeniedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>deniedNote</column-name><column-value><![CDATA[");
        sb.append(getDeniedNote());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>replacedDate</column-name><column-value><![CDATA[");
        sb.append(getReplacedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>replacedNote</column-name><column-value><![CDATA[");
        sb.append(getReplacedNote());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>replacedNumber</column-name><column-value><![CDATA[");
        sb.append(getReplacedNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>replacedOldDeviceId</column-name><column-value><![CDATA[");
        sb.append(getReplacedOldDeviceId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>replacedOldDeviceExtId</column-name><column-value><![CDATA[");
        sb.append(getReplacedOldDeviceExtId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>replacedNewDeviceId</column-name><column-value><![CDATA[");
        sb.append(getReplacedNewDeviceId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>replacedNewDeviceExtId</column-name><column-value><![CDATA[");
        sb.append(getReplacedNewDeviceExtId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>oldStatus</column-name><column-value><![CDATA[");
        sb.append(getOldStatus());
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

        sb.append("</model>");

        return sb.toString();
    }
}
