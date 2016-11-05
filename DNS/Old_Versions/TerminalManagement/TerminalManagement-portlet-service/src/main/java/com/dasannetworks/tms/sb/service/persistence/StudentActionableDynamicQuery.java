package com.dasannetworks.tms.sb.service.persistence;

import com.dasannetworks.tms.sb.model.Student;
import com.dasannetworks.tms.sb.service.StudentLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class StudentActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public StudentActionableDynamicQuery() throws SystemException {
        setBaseLocalService(StudentLocalServiceUtil.getService());
        setClass(Student.class);

        setClassLoader(com.dasannetworks.tms.sb.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("studentId");
    }
}
