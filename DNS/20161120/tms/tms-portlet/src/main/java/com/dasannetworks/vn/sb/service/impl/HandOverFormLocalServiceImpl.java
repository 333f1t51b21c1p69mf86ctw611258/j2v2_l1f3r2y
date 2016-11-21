package com.dasannetworks.vn.sb.service.impl;

import java.util.List;

import com.dasannetworks.vn.sb.model.HandOverForm;
import com.dasannetworks.vn.sb.service.HandOverFormLocalServiceUtil;
import com.dasannetworks.vn.sb.service.base.HandOverFormLocalServiceBaseImpl;
import com.dasannetworks.vn.sb.service.persistence.HandOverFormUtil;
import com.dasannetworks.vn.tms.service.HandOverFormSearchInput;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Junction;
import com.liferay.portal.kernel.dao.orm.Property;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;

/**
 * The implementation of the hand over form local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.dasannetworks.vn.sb.service.HandOverFormLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.dasannetworks.vn.sb.service.base.HandOverFormLocalServiceBaseImpl
 * @see com.dasannetworks.vn.sb.service.HandOverFormLocalServiceUtil
 */
public class HandOverFormLocalServiceImpl
		extends HandOverFormLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.dasannetworks.vn.sb.service.HandOverFormLocalServiceUtil} to access the hand over form local service.
	 */
	public java.util.List<HandOverForm> findByG_S(long groupId, int status) throws com.liferay.portal.kernel.exception.SystemException {
		return HandOverFormUtil.findByG_S(groupId, status);
	}

	public List<HandOverForm> search(HandOverFormSearchInput searchInput) throws SystemException {
		DynamicQuery dynamicQuery = buildSearchDynamicQuery(searchInput);
		return HandOverFormLocalServiceUtil.dynamicQuery(dynamicQuery, searchInput.getStart(), searchInput.getEnd());
	}

	public long searchCount(HandOverFormSearchInput searchInput) throws SystemException {
		DynamicQuery dynamicQuery = buildSearchDynamicQuery(searchInput);
		return HandOverFormLocalServiceUtil.dynamicQueryCount(dynamicQuery);
	}

	private DynamicQuery buildSearchDynamicQuery(HandOverFormSearchInput searchInput) {
		Junction junction = null;
		if (searchInput.isAndSearchCondition()) {
			junction = RestrictionsFactoryUtil.conjunction();
		} else {
			junction = RestrictionsFactoryUtil.disjunction();
		}

		if (Validator.isNotNull(searchInput.getCustomerCode())) {
			Property property = PropertyFactoryUtil.forName("customerCode");

			if (searchInput.isExactly()) {
				junction.add(property.eq(searchInput.getCustomerCode()));
			} else {
				junction.add(property.like(String.format("%%%s%%", searchInput.getCustomerCode())));
			}
		}

		if (Validator.isNotNull(searchInput.getEmail())) {
			Property property = PropertyFactoryUtil.forName("email");

			if (searchInput.isExactly()) {
				junction.add(property.eq(searchInput.getEmail()));
			} else {
				junction.add(property.like(String.format("%%%s%%", searchInput.getEmail())));
			}
		}

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(HandOverForm.class, getClassLoader());
		return dynamicQuery.add(junction);
	}
}
