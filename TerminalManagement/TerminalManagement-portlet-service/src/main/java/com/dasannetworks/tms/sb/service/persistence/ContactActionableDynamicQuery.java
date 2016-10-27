package com.dasannetworks.tms.sb.service.persistence;

import com.dasannetworks.tms.sb.model.Contact;
import com.dasannetworks.tms.sb.service.ContactLocalServiceUtil;

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

        setClassLoader(com.dasannetworks.tms.sb.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
