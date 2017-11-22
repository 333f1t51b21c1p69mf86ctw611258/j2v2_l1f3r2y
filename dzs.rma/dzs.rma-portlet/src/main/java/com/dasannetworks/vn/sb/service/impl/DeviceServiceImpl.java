package com.dasannetworks.vn.sb.service.impl;

import java.util.Arrays;
import java.util.List;

import com.dasannetworks.vn.sb.model.Device;
import com.dasannetworks.vn.sb.service.base.DeviceServiceBaseImpl;
import com.dasannetworks.vn.sb.service.persistence.DeviceFinderUtil;
import com.dasannetworks.vn.tms.common.Filpagort;
import com.liferay.portal.security.ac.AccessControlled;

/**
 * The implementation of the device remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.dasannetworks.vn.sb.service.DeviceService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have
 * security checks based on the propagated JAAS credentials because this service
 * can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.dasannetworks.vn.sb.service.base.DeviceServiceBaseImpl
 * @see com.dasannetworks.vn.sb.service.DeviceServiceUtil
 */
public class DeviceServiceImpl extends DeviceServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link
	 * com.dasannetworks.vn.sb.service.DeviceServiceUtil} to access the device
	 * remote service.
	 */
	@AccessControlled(guestAccessEnabled = true)
	public Filpagort<Device> getListBySerialNumbersAndPO(String serialNumbers, String gponSerialNumbers,
			String customerSerialNumbers, java.lang.Long purchaseOrderId, java.lang.String orderColumn,
			java.lang.String orderDirection, int begin, int end) {

		java.util.List<java.lang.String> lstSerialNumbers = Arrays.asList(serialNumbers.split(","));
		java.util.List<java.lang.String> lstGponSerialNumbers = Arrays.asList(gponSerialNumbers.split(","));
		java.util.List<java.lang.String> lstCustomerSerialNumbers = Arrays.asList(customerSerialNumbers.split(","));

		Filpagort<Device> filpagort = new Filpagort<Device>();

		List<Device> data = DeviceFinderUtil.getListBySerialNumberAndPO(lstSerialNumbers, lstGponSerialNumbers, lstCustomerSerialNumbers, null, orderColumn, orderDirection, begin, end);

		filpagort.setData(data);

		int total = (int) DeviceFinderUtil.getListBySerialNumberAndPO_GetTotalCount(lstSerialNumbers, lstGponSerialNumbers, lstCustomerSerialNumbers, null);
		filpagort.setTotal(total);

		filpagort.setOffset(begin);
		filpagort.setLimit(end - begin);

		return filpagort;
	}

}
