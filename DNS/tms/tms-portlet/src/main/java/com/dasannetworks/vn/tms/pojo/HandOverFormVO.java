package com.dasannetworks.vn.tms.pojo;

import java.util.Date;

import com.liferay.portal.kernel.util.StringPool;

public class HandOverFormVO {

	private long _handOverFormId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
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

	public HandOverFormVO() {
	}

	public long getHandOverFormId() {
		return _handOverFormId;
	}

	public void setHandOverFormId(long handOverFormId) {
		_handOverFormId = handOverFormId;
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
		if (_userName == null) {
			return StringPool.BLANK;
		} else {
			return _userName;
		}
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

	public String getCustomerCode() {
		if (_customerCode == null) {
			return StringPool.BLANK;
		} else {
			return _customerCode;
		}
	}

	public void setCustomerCode(String customerCode) {
		_customerCode = customerCode;
	}

	public String getContactPoint() {
		if (_contactPoint == null) {
			return StringPool.BLANK;
		} else {
			return _contactPoint;
		}
	}

	public void setContactPoint(String contactPoint) {
		_contactPoint = contactPoint;
	}

	public String getEmail() {
		if (_email == null) {
			return StringPool.BLANK;
		} else {
			return _email;
		}
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getPhone() {
		if (_phone == null) {
			return StringPool.BLANK;
		} else {
			return _phone;
		}
	}

	public void setPhone(String phone) {
		_phone = phone;
	}

	public String getLocation() {
		if (_location == null) {
			return StringPool.BLANK;
		} else {
			return _location;
		}
	}

	public void setLocation(String location) {
		_location = location;
	}

	public String getPersonInCharge() {
		if (_personInCharge == null) {
			return StringPool.BLANK;
		} else {
			return _personInCharge;
		}
	}

	public void setPersonInCharge(String personInCharge) {
		_personInCharge = personInCharge;
	}

	public String getHandOverFormNumber() {
		if (_handOverFormNumber == null) {
			return StringPool.BLANK;
		} else {
			return _handOverFormNumber;
		}
	}

	public void setHandOverFormNumber(String handOverFormNumber) {

		_handOverFormNumber = handOverFormNumber;
	}

	public String getNote() {
		if (_note == null) {
			return StringPool.BLANK;
		} else {
			return _note;
		}
	}

	public void setNote(String note) {
		_note = note;
	}

	public Date getAssignDate() {
		return _assignDate;
	}

	public void setAssignDate(Date assignDate) {
		_assignDate = assignDate;
	}

	public Date getEstimatedReturnDate() {
		return _estimatedReturnDate;
	}

	public void setEstimatedReturnDate(Date estimatedReturnDate) {
		_estimatedReturnDate = estimatedReturnDate;
	}

}
