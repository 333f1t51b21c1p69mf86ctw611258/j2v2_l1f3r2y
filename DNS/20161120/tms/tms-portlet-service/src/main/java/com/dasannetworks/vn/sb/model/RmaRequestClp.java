package com.dasannetworks.vn.sb.model;

import com.dasannetworks.vn.sb.service.ClpSerializer;
import com.dasannetworks.vn.sb.service.RmaRequestLocalServiceUtil;

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


public class RmaRequestClp extends BaseModelImpl<RmaRequest>
    implements RmaRequest {
    private String _uuid;
    private long _rmaRequestId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private long _groupId;
    private String _rmaRequestNumber;
    private String _cusCode;
    private String _cusInCharge;
    private String _cusEmail;
    private String _cusPhone;
    private String _cusLocation;
    private String _provInCharge;
    private Date _creatingEstReturnDate;
    private Date _creatingReturnedDate;
    private Date _creatingAssignedDate;
    private String _creatingNote;
    private String _partnerCode;
    private String _partnerInCharge;
    private String _partnerEmail;
    private String _partnerPhone;
    private String _partnerLocation;
    private Date _sendingEstReturnDate;
    private Date _sendingReturnedDate;
    private Date _sendingAssignedDate;
    private String _sendingNote;
    private Date _receivingReturnedDate;
    private String _receivingNote;
    private Date _returningReturnedDate;
    private String _returningNote;
    private int _status;
    private long _statusByUserId;
    private String _statusByUserUuid;
    private Date _statusDate;
    private BaseModel<?> _rmaRequestRemoteModel;
    private Class<?> _clpSerializerClass = com.dasannetworks.vn.sb.service.ClpSerializer.class;

    public RmaRequestClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return RmaRequest.class;
    }

    @Override
    public String getModelClassName() {
        return RmaRequest.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _rmaRequestId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setRmaRequestId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _rmaRequestId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("rmaRequestId", getRmaRequestId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("groupId", getGroupId());
        attributes.put("rmaRequestNumber", getRmaRequestNumber());
        attributes.put("cusCode", getCusCode());
        attributes.put("cusInCharge", getCusInCharge());
        attributes.put("cusEmail", getCusEmail());
        attributes.put("cusPhone", getCusPhone());
        attributes.put("cusLocation", getCusLocation());
        attributes.put("provInCharge", getProvInCharge());
        attributes.put("creatingEstReturnDate", getCreatingEstReturnDate());
        attributes.put("creatingReturnedDate", getCreatingReturnedDate());
        attributes.put("creatingAssignedDate", getCreatingAssignedDate());
        attributes.put("creatingNote", getCreatingNote());
        attributes.put("partnerCode", getPartnerCode());
        attributes.put("partnerInCharge", getPartnerInCharge());
        attributes.put("partnerEmail", getPartnerEmail());
        attributes.put("partnerPhone", getPartnerPhone());
        attributes.put("partnerLocation", getPartnerLocation());
        attributes.put("sendingEstReturnDate", getSendingEstReturnDate());
        attributes.put("sendingReturnedDate", getSendingReturnedDate());
        attributes.put("sendingAssignedDate", getSendingAssignedDate());
        attributes.put("sendingNote", getSendingNote());
        attributes.put("receivingReturnedDate", getReceivingReturnedDate());
        attributes.put("receivingNote", getReceivingNote());
        attributes.put("returningReturnedDate", getReturningReturnedDate());
        attributes.put("returningNote", getReturningNote());
        attributes.put("status", getStatus());
        attributes.put("statusByUserId", getStatusByUserId());
        attributes.put("statusDate", getStatusDate());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long rmaRequestId = (Long) attributes.get("rmaRequestId");

        if (rmaRequestId != null) {
            setRmaRequestId(rmaRequestId);
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

        String rmaRequestNumber = (String) attributes.get("rmaRequestNumber");

        if (rmaRequestNumber != null) {
            setRmaRequestNumber(rmaRequestNumber);
        }

        String cusCode = (String) attributes.get("cusCode");

        if (cusCode != null) {
            setCusCode(cusCode);
        }

        String cusInCharge = (String) attributes.get("cusInCharge");

        if (cusInCharge != null) {
            setCusInCharge(cusInCharge);
        }

        String cusEmail = (String) attributes.get("cusEmail");

        if (cusEmail != null) {
            setCusEmail(cusEmail);
        }

        String cusPhone = (String) attributes.get("cusPhone");

        if (cusPhone != null) {
            setCusPhone(cusPhone);
        }

        String cusLocation = (String) attributes.get("cusLocation");

        if (cusLocation != null) {
            setCusLocation(cusLocation);
        }

        String provInCharge = (String) attributes.get("provInCharge");

        if (provInCharge != null) {
            setProvInCharge(provInCharge);
        }

        Date creatingEstReturnDate = (Date) attributes.get(
                "creatingEstReturnDate");

        if (creatingEstReturnDate != null) {
            setCreatingEstReturnDate(creatingEstReturnDate);
        }

        Date creatingReturnedDate = (Date) attributes.get(
                "creatingReturnedDate");

        if (creatingReturnedDate != null) {
            setCreatingReturnedDate(creatingReturnedDate);
        }

        Date creatingAssignedDate = (Date) attributes.get(
                "creatingAssignedDate");

        if (creatingAssignedDate != null) {
            setCreatingAssignedDate(creatingAssignedDate);
        }

        String creatingNote = (String) attributes.get("creatingNote");

        if (creatingNote != null) {
            setCreatingNote(creatingNote);
        }

        String partnerCode = (String) attributes.get("partnerCode");

        if (partnerCode != null) {
            setPartnerCode(partnerCode);
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

        String partnerLocation = (String) attributes.get("partnerLocation");

        if (partnerLocation != null) {
            setPartnerLocation(partnerLocation);
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
    public String getUuid() {
        return _uuid;
    }

    @Override
    public void setUuid(String uuid) {
        _uuid = uuid;

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setUuid", String.class);

                method.invoke(_rmaRequestRemoteModel, uuid);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getRmaRequestId() {
        return _rmaRequestId;
    }

    @Override
    public void setRmaRequestId(long rmaRequestId) {
        _rmaRequestId = rmaRequestId;

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setRmaRequestId", long.class);

                method.invoke(_rmaRequestRemoteModel, rmaRequestId);
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

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_rmaRequestRemoteModel, companyId);
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

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_rmaRequestRemoteModel, userId);
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

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_rmaRequestRemoteModel, userName);
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

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_rmaRequestRemoteModel, createDate);
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

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_rmaRequestRemoteModel, modifiedDate);
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

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_rmaRequestRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getRmaRequestNumber() {
        return _rmaRequestNumber;
    }

    @Override
    public void setRmaRequestNumber(String rmaRequestNumber) {
        _rmaRequestNumber = rmaRequestNumber;

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setRmaRequestNumber",
                        String.class);

                method.invoke(_rmaRequestRemoteModel, rmaRequestNumber);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCusCode() {
        return _cusCode;
    }

    @Override
    public void setCusCode(String cusCode) {
        _cusCode = cusCode;

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setCusCode", String.class);

                method.invoke(_rmaRequestRemoteModel, cusCode);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCusInCharge() {
        return _cusInCharge;
    }

    @Override
    public void setCusInCharge(String cusInCharge) {
        _cusInCharge = cusInCharge;

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setCusInCharge", String.class);

                method.invoke(_rmaRequestRemoteModel, cusInCharge);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCusEmail() {
        return _cusEmail;
    }

    @Override
    public void setCusEmail(String cusEmail) {
        _cusEmail = cusEmail;

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setCusEmail", String.class);

                method.invoke(_rmaRequestRemoteModel, cusEmail);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCusPhone() {
        return _cusPhone;
    }

    @Override
    public void setCusPhone(String cusPhone) {
        _cusPhone = cusPhone;

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setCusPhone", String.class);

                method.invoke(_rmaRequestRemoteModel, cusPhone);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCusLocation() {
        return _cusLocation;
    }

    @Override
    public void setCusLocation(String cusLocation) {
        _cusLocation = cusLocation;

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setCusLocation", String.class);

                method.invoke(_rmaRequestRemoteModel, cusLocation);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getProvInCharge() {
        return _provInCharge;
    }

    @Override
    public void setProvInCharge(String provInCharge) {
        _provInCharge = provInCharge;

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setProvInCharge", String.class);

                method.invoke(_rmaRequestRemoteModel, provInCharge);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getCreatingEstReturnDate() {
        return _creatingEstReturnDate;
    }

    @Override
    public void setCreatingEstReturnDate(Date creatingEstReturnDate) {
        _creatingEstReturnDate = creatingEstReturnDate;

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setCreatingEstReturnDate",
                        Date.class);

                method.invoke(_rmaRequestRemoteModel, creatingEstReturnDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getCreatingReturnedDate() {
        return _creatingReturnedDate;
    }

    @Override
    public void setCreatingReturnedDate(Date creatingReturnedDate) {
        _creatingReturnedDate = creatingReturnedDate;

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setCreatingReturnedDate",
                        Date.class);

                method.invoke(_rmaRequestRemoteModel, creatingReturnedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getCreatingAssignedDate() {
        return _creatingAssignedDate;
    }

    @Override
    public void setCreatingAssignedDate(Date creatingAssignedDate) {
        _creatingAssignedDate = creatingAssignedDate;

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setCreatingAssignedDate",
                        Date.class);

                method.invoke(_rmaRequestRemoteModel, creatingAssignedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCreatingNote() {
        return _creatingNote;
    }

    @Override
    public void setCreatingNote(String creatingNote) {
        _creatingNote = creatingNote;

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setCreatingNote", String.class);

                method.invoke(_rmaRequestRemoteModel, creatingNote);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPartnerCode() {
        return _partnerCode;
    }

    @Override
    public void setPartnerCode(String partnerCode) {
        _partnerCode = partnerCode;

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setPartnerCode", String.class);

                method.invoke(_rmaRequestRemoteModel, partnerCode);
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

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setPartnerInCharge",
                        String.class);

                method.invoke(_rmaRequestRemoteModel, partnerInCharge);
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

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setPartnerEmail", String.class);

                method.invoke(_rmaRequestRemoteModel, partnerEmail);
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

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setPartnerPhone", String.class);

                method.invoke(_rmaRequestRemoteModel, partnerPhone);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPartnerLocation() {
        return _partnerLocation;
    }

    @Override
    public void setPartnerLocation(String partnerLocation) {
        _partnerLocation = partnerLocation;

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setPartnerLocation",
                        String.class);

                method.invoke(_rmaRequestRemoteModel, partnerLocation);
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

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setSendingEstReturnDate",
                        Date.class);

                method.invoke(_rmaRequestRemoteModel, sendingEstReturnDate);
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

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setSendingReturnedDate",
                        Date.class);

                method.invoke(_rmaRequestRemoteModel, sendingReturnedDate);
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

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setSendingAssignedDate",
                        Date.class);

                method.invoke(_rmaRequestRemoteModel, sendingAssignedDate);
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

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setSendingNote", String.class);

                method.invoke(_rmaRequestRemoteModel, sendingNote);
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

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setReceivingReturnedDate",
                        Date.class);

                method.invoke(_rmaRequestRemoteModel, receivingReturnedDate);
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

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setReceivingNote", String.class);

                method.invoke(_rmaRequestRemoteModel, receivingNote);
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

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setReturningReturnedDate",
                        Date.class);

                method.invoke(_rmaRequestRemoteModel, returningReturnedDate);
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

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setReturningNote", String.class);

                method.invoke(_rmaRequestRemoteModel, returningNote);
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

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setStatus", int.class);

                method.invoke(_rmaRequestRemoteModel, status);
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

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setStatusByUserId", long.class);

                method.invoke(_rmaRequestRemoteModel, statusByUserId);
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

        if (_rmaRequestRemoteModel != null) {
            try {
                Class<?> clazz = _rmaRequestRemoteModel.getClass();

                Method method = clazz.getMethod("setStatusDate", Date.class);

                method.invoke(_rmaRequestRemoteModel, statusDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public StagedModelType getStagedModelType() {
        return new StagedModelType(PortalUtil.getClassNameId(
                RmaRequest.class.getName()));
    }

    public BaseModel<?> getRmaRequestRemoteModel() {
        return _rmaRequestRemoteModel;
    }

    public void setRmaRequestRemoteModel(BaseModel<?> rmaRequestRemoteModel) {
        _rmaRequestRemoteModel = rmaRequestRemoteModel;
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

        Class<?> remoteModelClass = _rmaRequestRemoteModel.getClass();

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

        Object returnValue = method.invoke(_rmaRequestRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            RmaRequestLocalServiceUtil.addRmaRequest(this);
        } else {
            RmaRequestLocalServiceUtil.updateRmaRequest(this);
        }
    }

    @Override
    public RmaRequest toEscapedModel() {
        return (RmaRequest) ProxyUtil.newProxyInstance(RmaRequest.class.getClassLoader(),
            new Class[] { RmaRequest.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        RmaRequestClp clone = new RmaRequestClp();

        clone.setUuid(getUuid());
        clone.setRmaRequestId(getRmaRequestId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setGroupId(getGroupId());
        clone.setRmaRequestNumber(getRmaRequestNumber());
        clone.setCusCode(getCusCode());
        clone.setCusInCharge(getCusInCharge());
        clone.setCusEmail(getCusEmail());
        clone.setCusPhone(getCusPhone());
        clone.setCusLocation(getCusLocation());
        clone.setProvInCharge(getProvInCharge());
        clone.setCreatingEstReturnDate(getCreatingEstReturnDate());
        clone.setCreatingReturnedDate(getCreatingReturnedDate());
        clone.setCreatingAssignedDate(getCreatingAssignedDate());
        clone.setCreatingNote(getCreatingNote());
        clone.setPartnerCode(getPartnerCode());
        clone.setPartnerInCharge(getPartnerInCharge());
        clone.setPartnerEmail(getPartnerEmail());
        clone.setPartnerPhone(getPartnerPhone());
        clone.setPartnerLocation(getPartnerLocation());
        clone.setSendingEstReturnDate(getSendingEstReturnDate());
        clone.setSendingReturnedDate(getSendingReturnedDate());
        clone.setSendingAssignedDate(getSendingAssignedDate());
        clone.setSendingNote(getSendingNote());
        clone.setReceivingReturnedDate(getReceivingReturnedDate());
        clone.setReceivingNote(getReceivingNote());
        clone.setReturningReturnedDate(getReturningReturnedDate());
        clone.setReturningNote(getReturningNote());
        clone.setStatus(getStatus());
        clone.setStatusByUserId(getStatusByUserId());
        clone.setStatusDate(getStatusDate());

        return clone;
    }

    @Override
    public int compareTo(RmaRequest rmaRequest) {
        int value = 0;

        if (getRmaRequestId() < rmaRequest.getRmaRequestId()) {
            value = -1;
        } else if (getRmaRequestId() > rmaRequest.getRmaRequestId()) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        value = DateUtil.compareTo(getModifiedDate(),
                rmaRequest.getModifiedDate());

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

        if (!(obj instanceof RmaRequestClp)) {
            return false;
        }

        RmaRequestClp rmaRequest = (RmaRequestClp) obj;

        long primaryKey = rmaRequest.getPrimaryKey();

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
        StringBundler sb = new StringBundler(71);

        sb.append("{uuid=");
        sb.append(getUuid());
        sb.append(", rmaRequestId=");
        sb.append(getRmaRequestId());
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
        sb.append(", rmaRequestNumber=");
        sb.append(getRmaRequestNumber());
        sb.append(", cusCode=");
        sb.append(getCusCode());
        sb.append(", cusInCharge=");
        sb.append(getCusInCharge());
        sb.append(", cusEmail=");
        sb.append(getCusEmail());
        sb.append(", cusPhone=");
        sb.append(getCusPhone());
        sb.append(", cusLocation=");
        sb.append(getCusLocation());
        sb.append(", provInCharge=");
        sb.append(getProvInCharge());
        sb.append(", creatingEstReturnDate=");
        sb.append(getCreatingEstReturnDate());
        sb.append(", creatingReturnedDate=");
        sb.append(getCreatingReturnedDate());
        sb.append(", creatingAssignedDate=");
        sb.append(getCreatingAssignedDate());
        sb.append(", creatingNote=");
        sb.append(getCreatingNote());
        sb.append(", partnerCode=");
        sb.append(getPartnerCode());
        sb.append(", partnerInCharge=");
        sb.append(getPartnerInCharge());
        sb.append(", partnerEmail=");
        sb.append(getPartnerEmail());
        sb.append(", partnerPhone=");
        sb.append(getPartnerPhone());
        sb.append(", partnerLocation=");
        sb.append(getPartnerLocation());
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
        StringBundler sb = new StringBundler(109);

        sb.append("<model><model-name>");
        sb.append("com.dasannetworks.vn.sb.model.RmaRequest");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>uuid</column-name><column-value><![CDATA[");
        sb.append(getUuid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>rmaRequestId</column-name><column-value><![CDATA[");
        sb.append(getRmaRequestId());
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
            "<column><column-name>rmaRequestNumber</column-name><column-value><![CDATA[");
        sb.append(getRmaRequestNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>cusCode</column-name><column-value><![CDATA[");
        sb.append(getCusCode());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>cusInCharge</column-name><column-value><![CDATA[");
        sb.append(getCusInCharge());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>cusEmail</column-name><column-value><![CDATA[");
        sb.append(getCusEmail());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>cusPhone</column-name><column-value><![CDATA[");
        sb.append(getCusPhone());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>cusLocation</column-name><column-value><![CDATA[");
        sb.append(getCusLocation());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>provInCharge</column-name><column-value><![CDATA[");
        sb.append(getProvInCharge());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>creatingEstReturnDate</column-name><column-value><![CDATA[");
        sb.append(getCreatingEstReturnDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>creatingReturnedDate</column-name><column-value><![CDATA[");
        sb.append(getCreatingReturnedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>creatingAssignedDate</column-name><column-value><![CDATA[");
        sb.append(getCreatingAssignedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>creatingNote</column-name><column-value><![CDATA[");
        sb.append(getCreatingNote());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>partnerCode</column-name><column-value><![CDATA[");
        sb.append(getPartnerCode());
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
            "<column><column-name>partnerLocation</column-name><column-value><![CDATA[");
        sb.append(getPartnerLocation());
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
