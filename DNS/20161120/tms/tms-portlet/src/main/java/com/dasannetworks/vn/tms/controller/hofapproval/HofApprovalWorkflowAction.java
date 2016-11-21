package com.dasannetworks.vn.tms.controller.hofapproval;

import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.dasannetworks.vn.sb.model.HandOverForm;
import com.dasannetworks.vn.sb.service.HandOverFormLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.NoSuchWorkflowDefinitionLinkException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
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

public class HofApprovalWorkflowAction extends MVCPortlet {

	private static final Log LOGGER = LogFactoryUtil.getLog(HofApprovalWorkflowAction.class);

	public void submitHandOverForm(ActionRequest actionRequest,
			ActionResponse actionResponse) throws PortalException, SystemException {

		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

		String hofSubject = ParamUtil.getString(actionRequest, "hofSubject");
		String hofMessage = ParamUtil.getString(actionRequest, "hofMessage");

		ServiceContext serviceContext = ServiceContextFactory.getInstance(HandOverForm.class.getName(), actionRequest);
		try {
			HandOverForm handOverForm = HandOverFormLocalServiceUtil.createHandOverForm(CounterLocalServiceUtil.increment());
			handOverForm.setCompanyId(themeDisplay.getCompanyId());
			handOverForm.setGroupId(themeDisplay.getScopeGroupId());
			handOverForm.setCreateDate(new Date());
			handOverForm.setNote(hofMessage);
			handOverForm.setHandOverFormNumber(hofSubject);
			handOverForm.setStatus(WorkflowConstants.STATUS_DRAFT);
			handOverForm.setUserId(themeDisplay.getUserId());
			handOverForm.setStatusByUserId(themeDisplay.getUserId());

			handOverForm = HandOverFormLocalServiceUtil.addHandOverForm(handOverForm);

			WorkflowDefinitionLink workflowDefinitionLink = null;
			try {
				workflowDefinitionLink = WorkflowDefinitionLinkLocalServiceUtil.getDefaultWorkflowDefinitionLink(themeDisplay.getCompanyId(), HandOverForm.class.getName(), 0, 0);
			} catch (Exception e) {
				if (e instanceof NoSuchWorkflowDefinitionLinkException) {
					SessionMessages.add(actionRequest.getPortletSession(), "workflow-not-enabled");
				}
				e.printStackTrace();
			}
			// checking workflow defintion is enabled to hof asset or not
			if (handOverForm != null && workflowDefinitionLink != null) {
				// add hof asset in asset entry table
				AssetEntryLocalServiceUtil.updateEntry(themeDisplay.getUserId(), handOverForm.getGroupId(),
						HandOverForm.class.getName(), handOverForm.getHandOverFormId(),
						serviceContext.getAssetCategoryIds(),
						serviceContext.getAssetTagNames());
				// start workflow instance to hof.
				WorkflowHandlerRegistryUtil.startWorkflowInstance(
						handOverForm.getCompanyId(), handOverForm.getGroupId(), themeDisplay.getUserId(),
						HandOverForm.class.getName(), handOverForm.getPrimaryKey(), handOverForm,
						serviceContext);
			}
			if (handOverForm == null) {
				SessionErrors.add(actionRequest.getPortletSession(), "hof-submit-failed");
			} else {
				SessionMessages.add(actionRequest.getPortletSession(), "hof-submit-success");
			}
		} catch (Exception e) {
			if (e instanceof NoSuchWorkflowDefinitionLinkException) {
				SessionMessages.add(actionRequest.getPortletSession(), "workflow-not-enabled");
			}
			e.printStackTrace();
		}
		actionResponse.setRenderParameter("mvcPath", "/WEB-INF/jsp/hof-approval/hof.jsp");
	}

}
