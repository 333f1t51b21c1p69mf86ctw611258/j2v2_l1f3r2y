package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.DeviceExtOrder;
import com.dasannetworks.vn.sb.service.DeviceExtOrderLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class DeviceExtOrderActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public DeviceExtOrderActionableDynamicQuery() throws SystemException {
        setBaseLocalService(DeviceExtOrderLocalServiceUtil.getService());
        setClass(DeviceExtOrder.class);

        setClassLoader(com.dasannetworks.vn.sb.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("deviceExtOrderId");
    }
}
