package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.RmaReplacement;
import com.dasannetworks.vn.sb.service.RmaReplacementLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class RmaReplacementActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public RmaReplacementActionableDynamicQuery() throws SystemException {
        setBaseLocalService(RmaReplacementLocalServiceUtil.getService());
        setClass(RmaReplacement.class);

        setClassLoader(com.dasannetworks.vn.sb.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("primaryKey.rmaRequestId");
    }
}
