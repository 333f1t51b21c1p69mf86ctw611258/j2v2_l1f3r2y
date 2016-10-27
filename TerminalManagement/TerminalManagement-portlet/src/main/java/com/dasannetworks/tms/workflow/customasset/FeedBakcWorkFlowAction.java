package com.dasannetworks.tms.workflow.customasset;

import java.io.IOException;
import java.util.Date;

import javax.mail.internet.AddressException;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.dasannetworks.tms.sb.model.Feedback;
import com.dasannetworks.tms.sb.service.FeedbackLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.NoSuchWorkflowDefinitionLinkException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowHandlerRegistryUtil;
import com.liferay.portal.model.WorkflowDefinitionLink;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.service.WorkflowDefinitionLinkLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.asset.service.AssetEntryLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class FeedBakcWorkFlowAction
 */
public class FeedBakcWorkFlowAction extends MVCPortlet {

	public void submitFeedback(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException,
			AddressException, com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String feedBackMessage = ParamUtil.getString(actionRequest, "feedbackMessage");
		String feedbackSubject = ParamUtil.getString(actionRequest, "feedbackSubject");
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Feedback.class.getName(), actionRequest);
		
		try {
			Feedback feedback = FeedbackLocalServiceUtil.createFeedback(CounterLocalServiceUtil.increment());
			feedback.setCompanyId(themeDisplay.getCompanyId());
			feedback.setGroupId(themeDisplay.getScopeGroupId());
			feedback.setFeedbackDate(new Date());
			feedback.setFeedbackText(feedBackMessage);
			feedback.setFeedbackSubject(feedbackSubject);
			feedback.setFeedBackStatus(WorkflowConstants.STATUS_DRAFT);
			feedback.setUserId(themeDisplay.getUserId());
			feedback.setStatusByUserId(themeDisplay.getUserId());
			feedback = FeedbackLocalServiceUtil.addFeedback(feedback);
			
			WorkflowDefinitionLink workflowDefinitionLink = null;
			
			try {
				workflowDefinitionLink = WorkflowDefinitionLinkLocalServiceUtil
						.getDefaultWorkflowDefinitionLink(themeDisplay.getCompanyId(), Feedback.class.getName(), 0, 0);
			} catch (Exception e) {
				if (e instanceof NoSuchWorkflowDefinitionLinkException) {
					SessionMessages.add(actionRequest.getPortletSession(), "workflow-not-enabled");
				}
				e.printStackTrace();
			}
			
			// checking workflow defintion is enabled to feedback asset or not
			if (feedback != null && workflowDefinitionLink != null) {
				// add feedback asset in asset entry table
				AssetEntryLocalServiceUtil.updateEntry(themeDisplay.getUserId(), feedback.getGroupId(),
						Feedback.class.getName(), feedback.getFeedbackId(),
						serviceContext.getAssetCategoryIds(),
						serviceContext.getAssetTagNames());
				// start workflow instance to feedback.
				WorkflowHandlerRegistryUtil.startWorkflowInstance(
						feedback.getCompanyId(), feedback.getGroupId(), themeDisplay.getUserId(),
						Feedback.class.getName(), feedback.getPrimaryKey(), feedback,
						serviceContext);
			}
			
			if (feedback == null) {
				SessionErrors.add(actionRequest.getPortletSession(), "feedback-submit-failed");
			} else {
				SessionMessages.add(actionRequest.getPortletSession(), "feedback-submit-success");
			}
		} catch (Exception e) {
			if (e instanceof NoSuchWorkflowDefinitionLinkException) {
				SessionMessages.add(actionRequest.getPortletSession(), "workflow-not-enabled");
			}
			e.printStackTrace();
		}

		actionResponse.setRenderParameter("mvcPath", "/html/workflow/feedback.jsp");
	}
}
