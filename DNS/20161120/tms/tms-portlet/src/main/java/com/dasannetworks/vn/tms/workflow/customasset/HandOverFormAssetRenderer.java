package com.dasannetworks.vn.tms.workflow.customasset;

import java.util.Locale;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.dasannetworks.vn.sb.model.HandOverForm;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portlet.asset.model.BaseAssetRenderer;

public class HandOverFormAssetRenderer extends BaseAssetRenderer {

	private HandOverForm _handOverForm;

	public HandOverFormAssetRenderer(HandOverForm handOverForm) {
		this._handOverForm = handOverForm;
	}

	@Override
	public String getClassName() {
		return HandOverForm.class.getName();
	}

	@Override
	public long getClassPK() {
		return _handOverForm.getHandOverFormId();
	}

	@Override
	public long getGroupId() {
		return _handOverForm.getGroupId();
	}

	@Override
	public String getSummary(Locale locale) {
		return _handOverForm.getCustomerCode() + " | " + _handOverForm.getNote() + " | " + _handOverForm.getStatus();
	}

	@Override
	public String getTitle(Locale locale) {
		return _handOverForm.getCustomerCode() + " | " + _handOverForm.getNote() + " | " + _handOverForm.getStatus();
	}

	@Override
	public long getUserId() {
		return _handOverForm.getUserId();
	}

	@Override
	public String getUserName() {
		String userName = null;
		try {
			userName = UserLocalServiceUtil.getUser(_handOverForm.getUserId()).getFullName();
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
			return userName;
		}
		return userName;
	}

	@Override
	public String getUuid() {
		return _handOverForm.getUuid();
	}

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse, String template) throws Exception {
		if (template.equals(TEMPLATE_FULL_CONTENT)) {
			System.out.println("=====temaple full content====");
			renderRequest.setAttribute("feedBackObject", _handOverForm);
			return "/WEB-INF/jsp/hof-approval/view_feedbck.jsp";
		} else {
			return null;
		}
	}

}
