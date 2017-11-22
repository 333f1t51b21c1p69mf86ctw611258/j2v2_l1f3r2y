package com.dasannetworks.vn.sb.service.persistence;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import com.dasannetworks.vn.sb.model.Device;
import com.dasannetworks.vn.sb.model.impl.DeviceImpl;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class DeviceFinderImpl extends BasePersistenceImpl<Device> implements DeviceFinder {

	private static final String STRING_AND = " AND ";
	private static final String STRING_SPACE = " ";
	private static Log LOGGER = LogFactoryUtil.getLog(DeviceFinderImpl.class);

	private String getListBySerialNumberAndPO_GetQueryString(boolean counting, //
			List<String> serialNumbers, //
			List<String> gponSerialNumbers, //
			List<String> customerSerialNumbers, //
			Long purchaseOrderId) {

		String strSerialNumbers = StringUtils.EMPTY;
		for (String serialNumber : serialNumbers) {
			if (!serialNumber.trim().equals(StringUtils.EMPTY)) {
				if (!StringUtils.isEmpty(strSerialNumbers)) {
					strSerialNumbers += ",";
				}

				strSerialNumbers += "'" + serialNumber.trim() + "'";
			}
		}

		String strGponSerialNumbers = StringUtils.EMPTY;
		for (String gponSerialNumber : gponSerialNumbers) {
			if (!gponSerialNumber.trim().equals(StringUtils.EMPTY)) {
				if (!StringUtils.isEmpty(strGponSerialNumbers)) {
					strGponSerialNumbers += ",";
				}

				strGponSerialNumbers += "'" + gponSerialNumber.trim() + "'";
			}
		}

		String strCustomerSerialNumbers = StringUtils.EMPTY;
		for (String customerSerialNumber : customerSerialNumbers) {
			if (!customerSerialNumber.trim().equals(StringUtils.EMPTY)) {
				if (!StringUtils.isEmpty(strCustomerSerialNumbers)) {
					strCustomerSerialNumbers += ",";
				}

				strCustomerSerialNumbers += "'" + customerSerialNumber.trim() + "'";
			}
		}

		String where = StringUtils.EMPTY;
		String whereSerialNumber = StringUtils.EMPTY;

		if (StringUtils.isNotEmpty(strSerialNumbers) //
				|| StringUtils.isNotEmpty(strGponSerialNumbers) //
				|| StringUtils.isNotEmpty(strCustomerSerialNumbers)) {

			whereSerialNumber += StringUtils.isNotEmpty(strSerialNumbers) ? //
					"t1.serialNumber IN (" + strSerialNumbers + ") " //
					: StringUtils.EMPTY;

			if (StringUtils.isNotEmpty(strGponSerialNumbers)) {
				if (StringUtils.isNotEmpty(whereSerialNumber)) {
					whereSerialNumber += " OR ";
				}
				whereSerialNumber += "t1.gponSerialNumber IN (" + strGponSerialNumbers + ") ";
			}

			if (StringUtils.isNotEmpty(strCustomerSerialNumbers)) {
				if (StringUtils.isNotEmpty(whereSerialNumber)) {
					whereSerialNumber += " OR ";
				}
				whereSerialNumber += "t1.customerSerialNumber IN (" + strCustomerSerialNumbers + ")";
			}

			if (StringUtils.isNotEmpty(whereSerialNumber)) {
				whereSerialNumber = " (" + whereSerialNumber + ") ";
			}
		}

		String wherePurchaseOrder = purchaseOrderId != null
				? " t1.purchaseOrderId = " + purchaseOrderId.longValue() + STRING_AND : StringUtils.EMPTY;

		if (!whereSerialNumber.isEmpty() || !wherePurchaseOrder.isEmpty()) {
			where += " WHERE " + wherePurchaseOrder + whereSerialNumber;

			if (where.endsWith(STRING_AND)) {
				where = where.substring(0, where.length() - STRING_AND.length());
			}
		}

		String query = " SELECT " + (counting ? "COUNT(1)" : "t1.*") + STRING_SPACE + " FROM tms_Device t1 " //
				+ where;

		return query;
	}

	public List<Device> getListBySerialNumberAndPO(List<String> serialNumbers, //
			List<String> gponSerialNumbers, //
			List<String> customerSerialNumbers, //
			Long purchaseOrderId, String orderColumn, String orderDirection, //
			int begin, int end) {

		Session session = openSession();

		String query = getListBySerialNumberAndPO_GetQueryString(false, serialNumbers, gponSerialNumbers,
				customerSerialNumbers, purchaseOrderId);
		query = String.format(" %s %s %s %s ", query, "ORDER BY", orderColumn, orderDirection);

		LOGGER.info("### QUERYSTRING DeviceFinder.getListBySerialNumberAndPO: " + query);

		SQLQuery sqlQuery = session.createSQLQuery(query);
		sqlQuery.setCacheable(false);
		sqlQuery.addEntity("Device", DeviceImpl.class);

		// QueryPos pos = QueryPos.getInstance(sqlQuery);

		return (List<Device>) QueryUtil.list(sqlQuery, getDialect(), begin, end);
	}

	public long getListBySerialNumberAndPO_GetTotalCount(List<String> serialNumbers, //
			List<String> gponSerialNumbers, //
			List<String> customerSerialNumbers, //
			Long purchaseOrderId) {

		Session session = openSession();

		String query = getListBySerialNumberAndPO_GetQueryString(true, serialNumbers, gponSerialNumbers,
				customerSerialNumbers, purchaseOrderId);

		LOGGER.info("### QUERYSTRING DeviceFinder.getListBySerialNumberAndPO_GetTotalCount: " + query);

		SQLQuery sqlQuery = session.createSQLQuery(query);
		sqlQuery.setCacheable(false);

		return Long.parseLong(sqlQuery.uniqueResult().toString());
	}

}
