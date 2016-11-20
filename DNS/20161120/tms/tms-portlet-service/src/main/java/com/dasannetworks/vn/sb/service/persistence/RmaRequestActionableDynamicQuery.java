package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.RmaRequest;
import com.dasannetworks.vn.sb.service.RmaRequestLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class RmaRequestActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public RmaRequestActionableDynamicQuery() throws SystemException {
        setBaseLocalService(RmaRequestLocalServiceUtil.getService());
        setClass(RmaRequest.class);

        setClassLoader(com.dasannetworks.vn.sb.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("rmaRequestId");
    }
}
