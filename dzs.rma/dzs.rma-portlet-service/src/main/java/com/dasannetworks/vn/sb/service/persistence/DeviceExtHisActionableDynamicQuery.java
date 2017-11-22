package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.DeviceExtHis;
import com.dasannetworks.vn.sb.service.DeviceExtHisLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class DeviceExtHisActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public DeviceExtHisActionableDynamicQuery() throws SystemException {
        setBaseLocalService(DeviceExtHisLocalServiceUtil.getService());
        setClass(DeviceExtHis.class);

        setClassLoader(com.dasannetworks.vn.sb.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("deviceExtId");
    }
}
