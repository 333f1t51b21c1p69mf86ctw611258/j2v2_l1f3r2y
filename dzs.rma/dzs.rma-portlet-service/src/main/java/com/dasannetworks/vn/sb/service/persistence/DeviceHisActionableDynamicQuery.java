package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.DeviceHis;
import com.dasannetworks.vn.sb.service.DeviceHisLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class DeviceHisActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public DeviceHisActionableDynamicQuery() throws SystemException {
        setBaseLocalService(DeviceHisLocalServiceUtil.getService());
        setClass(DeviceHis.class);

        setClassLoader(com.dasannetworks.vn.sb.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("deviceId");
    }
}
