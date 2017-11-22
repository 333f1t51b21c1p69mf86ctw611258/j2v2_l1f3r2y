package com.dasannetworks.vn.sb.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Customer}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Customer
 * @generated
 */
public class CustomerWrapper implements Customer, ModelWrapper<Customer> {
    private Customer _customer;

    public CustomerWrapper(Customer customer) {
        _customer = customer;
    }

    @Override
    public Class<?> getModelClass() {
        return Customer.class;
    }

    @Override
    public String getModelClassName() {
        return Customer.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("customerId", getCustomerId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("customerCode", getCustomerCode());
        attributes.put("customerName", getCustomerName());
        attributes.put("inCharge", getInCharge());
        attributes.put("email", getEmail());
        attributes.put("phone", getPhone());
        attributes.put("address", getAddress());
        attributes.put("parentId", getParentId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long customerId = (Long) attributes.get("customerId");

        if (customerId != null) {
            setCustomerId(customerId);
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

        String customerCode = (String) attributes.get("customerCode");

        if (customerCode != null) {
            setCustomerCode(customerCode);
        }

        String customerName = (String) attributes.get("customerName");

        if (customerName != null) {
            setCustomerName(customerName);
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

        Long parentId = (Long) attributes.get("parentId");

        if (parentId != null) {
            setParentId(parentId);
        }
    }

    /**
    * Returns the primary key of this customer.
    *
    * @return the primary key of this customer
    */
    @Override
    public long getPrimaryKey() {
        return _customer.getPrimaryKey();
    }

    /**
    * Sets the primary key of this customer.
    *
    * @param primaryKey the primary key of this customer
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _customer.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the customer ID of this customer.
    *
    * @return the customer ID of this customer
    */
    @Override
    public long getCustomerId() {
        return _customer.getCustomerId();
    }

    /**
    * Sets the customer ID of this customer.
    *
    * @param customerId the customer ID of this customer
    */
    @Override
    public void setCustomerId(long customerId) {
        _customer.setCustomerId(customerId);
    }

    /**
    * Returns the company ID of this customer.
    *
    * @return the company ID of this customer
    */
    @Override
    public long getCompanyId() {
        return _customer.getCompanyId();
    }

    /**
    * Sets the company ID of this customer.
    *
    * @param companyId the company ID of this customer
    */
    @Override
    public void setCompanyId(long companyId) {
        _customer.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this customer.
    *
    * @return the user ID of this customer
    */
    @Override
    public long getUserId() {
        return _customer.getUserId();
    }

    /**
    * Sets the user ID of this customer.
    *
    * @param userId the user ID of this customer
    */
    @Override
    public void setUserId(long userId) {
        _customer.setUserId(userId);
    }

    /**
    * Returns the user uuid of this customer.
    *
    * @return the user uuid of this customer
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _customer.getUserUuid();
    }

    /**
    * Sets the user uuid of this customer.
    *
    * @param userUuid the user uuid of this customer
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _customer.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this customer.
    *
    * @return the user name of this customer
    */
    @Override
    public java.lang.String getUserName() {
        return _customer.getUserName();
    }

    /**
    * Sets the user name of this customer.
    *
    * @param userName the user name of this customer
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _customer.setUserName(userName);
    }

    /**
    * Returns the create date of this customer.
    *
    * @return the create date of this customer
    */
    @Override
    public java.util.Date getCreateDate() {
        return _customer.getCreateDate();
    }

    /**
    * Sets the create date of this customer.
    *
    * @param createDate the create date of this customer
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _customer.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this customer.
    *
    * @return the modified date of this customer
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _customer.getModifiedDate();
    }

    /**
    * Sets the modified date of this customer.
    *
    * @param modifiedDate the modified date of this customer
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _customer.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the customer code of this customer.
    *
    * @return the customer code of this customer
    */
    @Override
    public java.lang.String getCustomerCode() {
        return _customer.getCustomerCode();
    }

    /**
    * Sets the customer code of this customer.
    *
    * @param customerCode the customer code of this customer
    */
    @Override
    public void setCustomerCode(java.lang.String customerCode) {
        _customer.setCustomerCode(customerCode);
    }

    /**
    * Returns the customer name of this customer.
    *
    * @return the customer name of this customer
    */
    @Override
    public java.lang.String getCustomerName() {
        return _customer.getCustomerName();
    }

    /**
    * Sets the customer name of this customer.
    *
    * @param customerName the customer name of this customer
    */
    @Override
    public void setCustomerName(java.lang.String customerName) {
        _customer.setCustomerName(customerName);
    }

    /**
    * Returns the in charge of this customer.
    *
    * @return the in charge of this customer
    */
    @Override
    public java.lang.String getInCharge() {
        return _customer.getInCharge();
    }

    /**
    * Sets the in charge of this customer.
    *
    * @param inCharge the in charge of this customer
    */
    @Override
    public void setInCharge(java.lang.String inCharge) {
        _customer.setInCharge(inCharge);
    }

    /**
    * Returns the email of this customer.
    *
    * @return the email of this customer
    */
    @Override
    public java.lang.String getEmail() {
        return _customer.getEmail();
    }

    /**
    * Sets the email of this customer.
    *
    * @param email the email of this customer
    */
    @Override
    public void setEmail(java.lang.String email) {
        _customer.setEmail(email);
    }

    /**
    * Returns the phone of this customer.
    *
    * @return the phone of this customer
    */
    @Override
    public java.lang.String getPhone() {
        return _customer.getPhone();
    }

    /**
    * Sets the phone of this customer.
    *
    * @param phone the phone of this customer
    */
    @Override
    public void setPhone(java.lang.String phone) {
        _customer.setPhone(phone);
    }

    /**
    * Returns the address of this customer.
    *
    * @return the address of this customer
    */
    @Override
    public java.lang.String getAddress() {
        return _customer.getAddress();
    }

    /**
    * Sets the address of this customer.
    *
    * @param address the address of this customer
    */
    @Override
    public void setAddress(java.lang.String address) {
        _customer.setAddress(address);
    }

    /**
    * Returns the parent ID of this customer.
    *
    * @return the parent ID of this customer
    */
    @Override
    public java.lang.Long getParentId() {
        return _customer.getParentId();
    }

    /**
    * Sets the parent ID of this customer.
    *
    * @param parentId the parent ID of this customer
    */
    @Override
    public void setParentId(java.lang.Long parentId) {
        _customer.setParentId(parentId);
    }

    @Override
    public boolean isNew() {
        return _customer.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _customer.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _customer.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _customer.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _customer.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _customer.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _customer.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _customer.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _customer.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _customer.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _customer.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new CustomerWrapper((Customer) _customer.clone());
    }

    @Override
    public int compareTo(com.dasannetworks.vn.sb.model.Customer customer) {
        return _customer.compareTo(customer);
    }

    @Override
    public int hashCode() {
        return _customer.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.dasannetworks.vn.sb.model.Customer> toCacheModel() {
        return _customer.toCacheModel();
    }

    @Override
    public com.dasannetworks.vn.sb.model.Customer toEscapedModel() {
        return new CustomerWrapper(_customer.toEscapedModel());
    }

    @Override
    public com.dasannetworks.vn.sb.model.Customer toUnescapedModel() {
        return new CustomerWrapper(_customer.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _customer.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _customer.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _customer.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof CustomerWrapper)) {
            return false;
        }

        CustomerWrapper customerWrapper = (CustomerWrapper) obj;

        if (Validator.equals(_customer, customerWrapper._customer)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Customer getWrappedCustomer() {
        return _customer;
    }

    @Override
    public Customer getWrappedModel() {
        return _customer;
    }

    @Override
    public void resetOriginalValues() {
        _customer.resetOriginalValues();
    }
}
