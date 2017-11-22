package com.dasannetworks.vn.sb.model;

import com.dasannetworks.vn.sb.service.persistence.RmaReplacementPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RmaReplacementSoap implements Serializable {
    private long _rmaRequestId;
    private String _replacedNumber;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private int _status;

    public RmaReplacementSoap() {
    }

    public static RmaReplacementSoap toSoapModel(RmaReplacement model) {
        RmaReplacementSoap soapModel = new RmaReplacementSoap();

        soapModel.setRmaRequestId(model.getRmaRequestId());
        soapModel.setReplacedNumber(model.getReplacedNumber());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setStatus(model.getStatus());

        return soapModel;
    }

    public static RmaReplacementSoap[] toSoapModels(RmaReplacement[] models) {
        RmaReplacementSoap[] soapModels = new RmaReplacementSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static RmaReplacementSoap[][] toSoapModels(RmaReplacement[][] models) {
        RmaReplacementSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new RmaReplacementSoap[models.length][models[0].length];
        } else {
            soapModels = new RmaReplacementSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static RmaReplacementSoap[] toSoapModels(List<RmaReplacement> models) {
        List<RmaReplacementSoap> soapModels = new ArrayList<RmaReplacementSoap>(models.size());

        for (RmaReplacement model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new RmaReplacementSoap[soapModels.size()]);
    }

    public RmaReplacementPK getPrimaryKey() {
        return new RmaReplacementPK(_rmaRequestId, _replacedNumber);
    }

    public void setPrimaryKey(RmaReplacementPK pk) {
        setRmaRequestId(pk.rmaRequestId);
        setReplacedNumber(pk.replacedNumber);
    }

    public long getRmaRequestId() {
        return _rmaRequestId;
    }

    public void setRmaRequestId(long rmaRequestId) {
        _rmaRequestId = rmaRequestId;
    }

    public String getReplacedNumber() {
        return _replacedNumber;
    }

    public void setReplacedNumber(String replacedNumber) {
        _replacedNumber = replacedNumber;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public String getUserName() {
        return _userName;
    }

    public void setUserName(String userName) {
        _userName = userName;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public int getStatus() {
        return _status;
    }

    public void setStatus(int status) {
        _status = status;
    }
}
