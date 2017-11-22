package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.RmaRequestDevice;
import com.dasannetworks.vn.sb.service.RmaRequestDeviceLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class RmaRequestDeviceActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public RmaRequestDeviceActionableDynamicQuery() throws SystemException {
        setBaseLocalService(RmaRequestDeviceLocalServiceUtil.getService());
        setClass(RmaRequestDevice.class);

        setClassLoader(com.dasannetworks.vn.sb.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("primaryKey.rmaRequestId");
    }
}
