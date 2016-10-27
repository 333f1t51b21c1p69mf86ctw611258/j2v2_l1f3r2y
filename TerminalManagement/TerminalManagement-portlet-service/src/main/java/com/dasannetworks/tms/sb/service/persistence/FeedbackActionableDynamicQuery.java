package com.dasannetworks.tms.sb.service.persistence;

import com.dasannetworks.tms.sb.model.Feedback;
import com.dasannetworks.tms.sb.service.FeedbackLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class FeedbackActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public FeedbackActionableDynamicQuery() throws SystemException {
        setBaseLocalService(FeedbackLocalServiceUtil.getService());
        setClass(Feedback.class);

        setClassLoader(com.dasannetworks.tms.sb.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("feedbackId");
    }
}
