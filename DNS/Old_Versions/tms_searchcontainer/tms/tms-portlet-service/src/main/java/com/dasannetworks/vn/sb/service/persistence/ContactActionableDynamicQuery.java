package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.Contact;
import com.dasannetworks.vn.sb.service.ContactLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class ContactActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ContactActionableDynamicQuery() throws SystemException {
        setBaseLocalService(ContactLocalServiceUtil.getService());
        setClass(Contact.class);

        setClassLoader(com.dasannetworks.vn.sb.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
