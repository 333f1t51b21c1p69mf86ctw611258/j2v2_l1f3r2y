package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.Customer;
import com.dasannetworks.vn.sb.service.CustomerLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class CustomerActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public CustomerActionableDynamicQuery() throws SystemException {
        setBaseLocalService(CustomerLocalServiceUtil.getService());
        setClass(Customer.class);

        setClassLoader(com.dasannetworks.vn.sb.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("customerId");
    }
}
