package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.Partner;
import com.dasannetworks.vn.sb.service.PartnerLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class PartnerActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PartnerActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PartnerLocalServiceUtil.getService());
        setClass(Partner.class);

        setClassLoader(com.dasannetworks.vn.sb.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("partnerId");
    }
}
