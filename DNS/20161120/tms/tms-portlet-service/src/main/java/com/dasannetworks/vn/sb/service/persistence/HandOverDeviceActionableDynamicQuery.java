package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.HandOverDevice;
import com.dasannetworks.vn.sb.service.HandOverDeviceLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class HandOverDeviceActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public HandOverDeviceActionableDynamicQuery() throws SystemException {
        setBaseLocalService(HandOverDeviceLocalServiceUtil.getService());
        setClass(HandOverDevice.class);

        setClassLoader(com.dasannetworks.vn.sb.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("primaryKey.handOverFormId");
    }
}
