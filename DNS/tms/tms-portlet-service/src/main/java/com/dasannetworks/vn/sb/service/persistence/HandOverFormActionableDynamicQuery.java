package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.HandOverForm;
import com.dasannetworks.vn.sb.service.HandOverFormLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class HandOverFormActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public HandOverFormActionableDynamicQuery() throws SystemException {
        setBaseLocalService(HandOverFormLocalServiceUtil.getService());
        setClass(HandOverForm.class);

        setClassLoader(com.dasannetworks.vn.sb.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("handOverFormId");
    }
}
