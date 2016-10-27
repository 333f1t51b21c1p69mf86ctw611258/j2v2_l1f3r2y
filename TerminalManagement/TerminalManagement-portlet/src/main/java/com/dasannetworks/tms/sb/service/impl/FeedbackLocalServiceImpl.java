package com.dasannetworks.tms.sb.service.impl;

import com.dasannetworks.tms.sb.model.Feedback;
import com.dasannetworks.tms.sb.service.base.FeedbackLocalServiceBaseImpl;
import com.dasannetworks.tms.sb.service.persistence.FeedbackUtil;

/**
 * The implementation of the feedback local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.dasannetworks.tms.sb.service.FeedbackLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.dasannetworks.tms.sb.service.base.FeedbackLocalServiceBaseImpl
 * @see com.dasannetworks.tms.sb.service.FeedbackLocalServiceUtil
 */
public class FeedbackLocalServiceImpl extends FeedbackLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.dasannetworks.tms.sb.service.FeedbackLocalServiceUtil} to access the feedback local service.
     */
	
	public java.util.List<Feedback> findByG_S(
			long groupId, int status)
			throws com.liferay.portal.kernel.exception.SystemException {
		
		return FeedbackUtil.findByG_S(groupId, status);
	}
}
