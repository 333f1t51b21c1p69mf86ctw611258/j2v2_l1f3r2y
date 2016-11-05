package com.dasannetworks.vn.sb.service.impl;

import com.dasannetworks.vn.sb.NoSuchDeviceException;
import com.dasannetworks.vn.sb.model.Device;
import com.dasannetworks.vn.sb.service.DeviceLocalServiceUtil;
import com.dasannetworks.vn.sb.service.base.DeviceLocalServiceBaseImpl;
import com.dasannetworks.vn.sb.service.persistence.DeviceUtil;
import com.dasannetworks.vn.tms.service.DeviceSearchInput;
import com.liferay.portal.kernel.dao.orm.*;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;

import java.util.List;

/**
 * The implementation of the device local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.dasannetworks.vn.sb.service.DeviceLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.dasannetworks.vn.sb.service.base.DeviceLocalServiceBaseImpl
 * @see com.dasannetworks.vn.sb.service.DeviceLocalServiceUtil
 */
public class DeviceLocalServiceImpl extends DeviceLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link
	 * com.dasannetworks.vn.sb.service.DeviceLocalServiceUtil} to access the
	 * device local service.
	 */
	public Device getBySerialNumber(String serialNumber) throws SystemException, NoSuchDeviceException {
		return DeviceUtil.findBySerialNumber(serialNumber);
	}

	public List<Device> search(DeviceSearchInput searchInput) throws SystemException {
		DynamicQuery dynamicQuery = buildSearchDynamicQuery(searchInput);
		return DeviceLocalServiceUtil.dynamicQuery(dynamicQuery, searchInput.getStart(), searchInput.getEnd());
	}

	public long searchCount(DeviceSearchInput searchInput) throws SystemException {
		DynamicQuery dynamicQuery = buildSearchDynamicQuery(searchInput);
		return DeviceLocalServiceUtil.dynamicQueryCount(dynamicQuery);
	}

	private DynamicQuery buildSearchDynamicQuery(DeviceSearchInput searchInput) {
		Junction junction = null;
		if (searchInput.isAndSearchCondition()) {
			junction = RestrictionsFactoryUtil.conjunction();
		} else {
			junction = RestrictionsFactoryUtil.disjunction();
		}

		if (Validator.isNotNull(searchInput.getSerialNumber())) {
			Property property = PropertyFactoryUtil.forName("serialNumber");
			junction.add(property.like(String.format("%%%s%%", searchInput.getSerialNumber())));
		}

		if (Validator.isNotNull(searchInput.getMacAddress())) {
			Property property = PropertyFactoryUtil.forName("macAddress");
			junction.add(property.like(String.format("%%%s%%", searchInput.getMacAddress())));
		}

		if (Validator.isNotNull(searchInput.getManufacturerSerial())) {
			Property property = PropertyFactoryUtil.forName("manufacturerSerial");
			junction.add(property.like(String.format("%%%s%%", searchInput.getManufacturerSerial())));
		}

		if (Validator.isNotNull(searchInput.getProductName())) {
			Property property = PropertyFactoryUtil.forName("modelName");
			junction.add(property.like(String.format("%%%s%%", searchInput.getProductName())));
		}

		if (Validator.isNotNull(searchInput.getPartNumber())) {
			Property property = PropertyFactoryUtil.forName("partNumber");
			junction.add(property.like(String.format("%%%s%%", searchInput.getProductName())));
		}

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Device.class, getClassLoader());
		return dynamicQuery.add(junction);
	}

	public List<Device> findByCheckWarrantyInfo(String serialNumber, String macAddress) throws com.liferay.portal.kernel.exception.SystemException {

		return DeviceUtil.findByCheckWarrantyInfo(serialNumber, macAddress);
	}
}
