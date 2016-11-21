package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.WarrantyForm;
import com.dasannetworks.vn.sb.service.WarrantyFormLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class WarrantyFormActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public WarrantyFormActionableDynamicQuery() throws SystemException {
        setBaseLocalService(WarrantyFormLocalServiceUtil.getService());
        setClass(WarrantyForm.class);

        setClassLoader(com.dasannetworks.vn.sb.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("warrantyFormId");
    }
}
