package com.dasannetworks.tms.sb.model.impl;

import com.dasannetworks.tms.sb.model.Feedback;
import com.dasannetworks.tms.sb.service.FeedbackLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the Feedback service. Represents a row in the &quot;tms_Feedback&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FeedbackImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FeedbackImpl
 * @see com.dasannetworks.tms.sb.model.Feedback
 * @generated
 */
public abstract class FeedbackBaseImpl extends FeedbackModelImpl
    implements Feedback {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a feedback model instance should use the {@link Feedback} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            FeedbackLocalServiceUtil.addFeedback(this);
        } else {
            FeedbackLocalServiceUtil.updateFeedback(this);
        }
    }
}