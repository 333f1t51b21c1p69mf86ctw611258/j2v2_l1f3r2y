package com.dasannetworks.vn.tms.pojo;

import java.io.Serializable;

import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

public class ContactPOJO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String _uuid;
	private String _originalUuid;
	private long _id;
	private String _firstname;
	private String _lastname;
	private String _telephone;
	private String _email;
	private long _columnBitmask;

	public ContactPOJO() {
	}

	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		} else {
			return _uuid;
		}
	}

	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getFirstname() {
		if (_firstname == null) {
			return StringPool.BLANK;
		} else {
			return _firstname;
		}
	}

	public void setFirstname(String firstname) {
		_firstname = firstname;
	}

	public String getLastname() {
		if (_lastname == null) {
			return StringPool.BLANK;
		} else {
			return _lastname;
		}
	}

	public void setLastname(String lastname) {
		_lastname = lastname;
	}

	public String getTelephone() {
		if (_telephone == null) {
			return StringPool.BLANK;
		} else {
			return _telephone;
		}
	}

	public void setTelephone(String telephone) {
		_telephone = telephone;
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

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", id=");
		sb.append(getId());
		sb.append(", firstname=");
		sb.append(getFirstname());
		sb.append(", lastname=");
		sb.append(getLastname());
		sb.append(", telephone=");
		sb.append(getTelephone());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append("}");

		return sb.toString();
	}

}
