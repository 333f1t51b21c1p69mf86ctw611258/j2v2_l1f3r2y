package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.DeviceExt;
import com.dasannetworks.vn.sb.service.DeviceExtLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class DeviceExtActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public DeviceExtActionableDynamicQuery() throws SystemException {
        setBaseLocalService(DeviceExtLocalServiceUtil.getService());
        setClass(DeviceExt.class);

        setClassLoader(com.dasannetworks.vn.sb.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("deviceExtId");
    }
}
