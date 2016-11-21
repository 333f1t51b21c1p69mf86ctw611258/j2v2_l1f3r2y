package com.meera.workflow.customasset;

import java.util.Locale;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portlet.asset.model.BaseAssetRenderer;
import com.meera.workflow.db.model.Feedback;

/**
 * Portlet implementation class FeedbackAction
 */
public class FeedbackAssetRenderer extends BaseAssetRenderer{
 
    private Feedback _feedback;
     
    public FeedbackAssetRenderer(Feedback feedback) {
        _feedback = feedback;
    }
 
    public long getClassPK() {
        return _feedback.getFeedbackId();
    }
 
    public long getGroupId() {
        return _feedback.getGroupId();
    }
 
    public String getSummary(Locale arg0) {
        return _feedback.getFeedbackText();
    }
 
    public String getTitle(Locale arg0) {
        return _feedback.getFeedbackSubject();
    }
 
    public long getUserId() {
        return _feedback.getUserId();
    }
 
    public String getUuid() {
        return _feedback.getUuid();
    }
 
    public String render(RenderRequest request, RenderResponse response, String template)
        throws Exception 
    {
        if (template.equals(TEMPLATE_FULL_CONTENT)) {
        	System.out.println("=====temaple full content====");
        	request.setAttribute("feedBackObject",_feedback);
            return "/html/workflow/view_feedbck.jsp";
        }
        else
        {
            return null;
        }
    }
 
    @Override
    public String getUserName() {
        // TODO Auto-generated method stub
    	String userName=null;
        try {
        	userName= UserLocalServiceUtil.getUser(_feedback.getUserId()).getFullName();
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return userName;
		}
        return userName;
    }

	@Override
	public String getClassName() {
		// TODO Auto-generated method stub
		return Feedback.class.getName();
	}
 

}
