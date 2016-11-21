package com.dasannetworks.vn.tms.workflow.customasset;

import java.io.Serializable;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import com.dasannetworks.vn.sb.model.HandOverForm;
import com.dasannetworks.vn.sb.service.HandOverFormLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.workflow.BaseWorkflowHandler;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portlet.asset.service.AssetEntryLocalServiceUtil;

public class HandOverFormWorkflowHandler extends BaseWorkflowHandler {

	public static final String CLASS_NAME = HandOverForm.class.getName();

	@Override
	public String getClassName() {
		return CLASS_NAME;
	}

	@Override
	public String getType(Locale locale) {
		return "HandOverForm";
	}

	@Override
	public HandOverForm updateStatus(int status, Map<String, Serializable> workflowContext) throws PortalException, SystemException {

		long userId = GetterUtil.getLong(workflowContext.get(WorkflowConstants.CONTEXT_USER_ID));
		long resourcePrimKey = GetterUtil.getLong(workflowContext.get(WorkflowConstants.CONTEXT_ENTRY_CLASS_PK));
		HandOverForm handOverForm = HandOverFormLocalServiceUtil.getHandOverForm(resourcePrimKey);
		handOverForm.setStatus(status);
		handOverForm.setStatusByUserId(userId);
		handOverForm.setStatusDate(new Date());
		handOverForm = HandOverFormLocalServiceUtil.updateHandOverForm(handOverForm);
		if (status == WorkflowConstants.STATUS_APPROVED) {
			AssetEntryLocalServiceUtil.updateVisible(HandOverForm.class.getName(),
					resourcePrimKey, true);
		} else {
			AssetEntryLocalServiceUtil.updateVisible(HandOverForm.class.getName(),
					resourcePrimKey, false);
		}
		return handOverForm;
	}

}
