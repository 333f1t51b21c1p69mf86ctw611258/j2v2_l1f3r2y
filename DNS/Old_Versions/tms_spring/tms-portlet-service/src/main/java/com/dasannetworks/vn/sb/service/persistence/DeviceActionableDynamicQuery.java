package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.Device;
import com.dasannetworks.vn.sb.service.DeviceLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class DeviceActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public DeviceActionableDynamicQuery() throws SystemException {
        setBaseLocalService(DeviceLocalServiceUtil.getService());
        setClass(Device.class);

        setClassLoader(com.dasannetworks.vn.sb.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("deviceId");
    }
}
