package com.dasannetworks.tms.sb.service.persistence;

import com.dasannetworks.tms.sb.model.Book;
import com.dasannetworks.tms.sb.service.BookLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class BookActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public BookActionableDynamicQuery() throws SystemException {
        setBaseLocalService(BookLocalServiceUtil.getService());
        setClass(Book.class);

        setClassLoader(com.dasannetworks.tms.sb.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("bookId");
    }
}
