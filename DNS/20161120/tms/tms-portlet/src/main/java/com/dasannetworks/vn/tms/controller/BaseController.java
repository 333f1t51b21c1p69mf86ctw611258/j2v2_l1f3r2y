package com.dasannetworks.vn.tms.controller;

import java.util.Map;

import javax.portlet.PortletRequest;

import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.util.PortalUtil;

public abstract class BaseController {

	protected void cleanDefaultErrorMessage(PortletRequest portletRequest) {
		if (!SessionErrors.isEmpty(portletRequest)) {
			SessionMessages.add(portletRequest, PortalUtil.getPortletId(portletRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		}
	}
	
	@RenderMapping
	public abstract String defaultHandler(Map<String, Object> map) throws SystemException;
}
