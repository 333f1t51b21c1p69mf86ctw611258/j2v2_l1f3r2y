package com.dasannetworks.vn.sb.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Partner}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Partner
 * @generated
 */
public class PartnerWrapper implements Partner, ModelWrapper<Partner> {
    private Partner _partner;

    public PartnerWrapper(Partner partner) {
        _partner = partner;
    }

    @Override
    public Class<?> getModelClass() {
        return Partner.class;
    }

    @Override
    public String getModelClassName() {
        return Partner.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("partnerId", getPartnerId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("partnerCode", getPartnerCode());
        attributes.put("partnerName", getPartnerName());
        attributes.put("inCharge", getInCharge());
        attributes.put("email", getEmail());
        attributes.put("phone", getPhone());
        attributes.put("address", getAddress());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long partnerId = (Long) attributes.get("partnerId");

        if (partnerId != null) {
            setPartnerId(partnerId);
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

        String partnerCode = (String) attributes.get("partnerCode");

        if (partnerCode != null) {
            setPartnerCode(partnerCode);
        }

        String partnerName = (String) attributes.get("partnerName");

        if (partnerName != null) {
            setPartnerName(partnerName);
        }

        String inCharge = (String) attributes.get("inCharge");

        if (inCharge != null) {
            setInCharge(inCharge);
        }

        String email = (String) attributes.get("email");

        if (email != null) {
            setEmail(email);
        }

        String phone = (String) attributes.get("phone");

        if (phone != null) {
            setPhone(phone);
        }

        String address = (String) attributes.get("address");

        if (address != null) {
            setAddress(address);
        }
    }

    /**
    * Returns the primary key of this partner.
    *
    * @return the primary key of this partner
    */
    @Override
    public long getPrimaryKey() {
        return _partner.getPrimaryKey();
    }

    /**
    * Sets the primary key of this partner.
    *
    * @param primaryKey the primary key of this partner
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _partner.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the partner ID of this partner.
    *
    * @return the partner ID of this partner
    */
    @Override
    public long getPartnerId() {
        return _partner.getPartnerId();
    }

    /**
    * Sets the partner ID of this partner.
    *
    * @param partnerId the partner ID of this partner
    */
    @Override
    public void setPartnerId(long partnerId) {
        _partner.setPartnerId(partnerId);
    }

    /**
    * Returns the company ID of this partner.
    *
    * @return the company ID of this partner
    */
    @Override
    public long getCompanyId() {
        return _partner.getCompanyId();
    }

    /**
    * Sets the company ID of this partner.
    *
    * @param companyId the company ID of this partner
    */
    @Override
    public void setCompanyId(long companyId) {
        _partner.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this partner.
    *
    * @return the user ID of this partner
    */
    @Override
    public long getUserId() {
        return _partner.getUserId();
    }

    /**
    * Sets the user ID of this partner.
    *
    * @param userId the user ID of this partner
    */
    @Override
    public void setUserId(long userId) {
        _partner.setUserId(userId);
    }

    /**
    * Returns the user uuid of this partner.
    *
    * @return the user uuid of this partner
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _partner.getUserUuid();
    }

    /**
    * Sets the user uuid of this partner.
    *
    * @param userUuid the user uuid of this partner
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _partner.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this partner.
    *
    * @return the user name of this partner
    */
    @Override
    public java.lang.String getUserName() {
        return _partner.getUserName();
    }

    /**
    * Sets the user name of this partner.
    *
    * @param userName the user name of this partner
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _partner.setUserName(userName);
    }

    /**
    * Returns the create date of this partner.
    *
    * @return the create date of this partner
    */
    @Override
    public java.util.Date getCreateDate() {
        return _partner.getCreateDate();
    }

    /**
    * Sets the create date of this partner.
    *
    * @param createDate the create date of this partner
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _partner.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this partner.
    *
    * @return the modified date of this partner
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _partner.getModifiedDate();
    }

    /**
    * Sets the modified date of this partner.
    *
    * @param modifiedDate the modified date of this partner
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _partner.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the partner code of this partner.
    *
    * @return the partner code of this partner
    */
    @Override
    public java.lang.String getPartnerCode() {
        return _partner.getPartnerCode();
    }

    /**
    * Sets the partner code of this partner.
    *
    * @param partnerCode the partner code of this partner
    */
    @Override
    public void setPartnerCode(java.lang.String partnerCode) {
        _partner.setPartnerCode(partnerCode);
    }

    /**
    * Returns the partner name of this partner.
    *
    * @return the partner name of this partner
    */
    @Override
    public java.lang.String getPartnerName() {
        return _partner.getPartnerName();
    }

    /**
    * Sets the partner name of this partner.
    *
    * @param partnerName the partner name of this partner
    */
    @Override
    public void setPartnerName(java.lang.String partnerName) {
        _partner.setPartnerName(partnerName);
    }

    /**
    * Returns the in charge of this partner.
    *
    * @return the in charge of this partner
    */
    @Override
    public java.lang.String getInCharge() {
        return _partner.getInCharge();
    }

    /**
    * Sets the in charge of this partner.
    *
    * @param inCharge the in charge of this partner
    */
    @Override
    public void setInCharge(java.lang.String inCharge) {
        _partner.setInCharge(inCharge);
    }

    /**
    * Returns the email of this partner.
    *
    * @return the email of this partner
    */
    @Override
    public java.lang.String getEmail() {
        return _partner.getEmail();
    }

    /**
    * Sets the email of this partner.
    *
    * @param email the email of this partner
    */
    @Override
    public void setEmail(java.lang.String email) {
        _partner.setEmail(email);
    }

    /**
    * Returns the phone of this partner.
    *
    * @return the phone of this partner
    */
    @Override
    public java.lang.String getPhone() {
        return _partner.getPhone();
    }

    /**
    * Sets the phone of this partner.
    *
    * @param phone the phone of this partner
    */
    @Override
    public void setPhone(java.lang.String phone) {
        _partner.setPhone(phone);
    }

    /**
    * Returns the address of this partner.
    *
    * @return the address of this partner
    */
    @Override
    public java.lang.String getAddress() {
        return _partner.getAddress();
    }

    /**
    * Sets the address of this partner.
    *
    * @param address the address of this partner
    */
    @Override
    public void setAddress(java.lang.String address) {
        _partner.setAddress(address);
    }

    @Override
    public boolean isNew() {
        return _partner.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _partner.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _partner.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _partner.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _partner.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _partner.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _partner.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _partner.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _partner.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _partner.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _partner.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new PartnerWrapper((Partner) _partner.clone());
    }

    @Override
    public int compareTo(com.dasannetworks.vn.sb.model.Partner partner) {
        return _partner.compareTo(partner);
    }

    @Override
    public int hashCode() {
        return _partner.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.dasannetworks.vn.sb.model.Partner> toCacheModel() {
        return _partner.toCacheModel();
    }

    @Override
    public com.dasannetworks.vn.sb.model.Partner toEscapedModel() {
        return new PartnerWrapper(_partner.toEscapedModel());
    }

    @Override
    public com.dasannetworks.vn.sb.model.Partner toUnescapedModel() {
        return new PartnerWrapper(_partner.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _partner.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _partner.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _partner.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PartnerWrapper)) {
            return false;
        }

        PartnerWrapper partnerWrapper = (PartnerWrapper) obj;

        if (Validator.equals(_partner, partnerWrapper._partner)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Partner getWrappedPartner() {
        return _partner;
    }

    @Override
    public Partner getWrappedModel() {
        return _partner;
    }

    @Override
    public void resetOriginalValues() {
        _partner.resetOriginalValues();
    }
}
