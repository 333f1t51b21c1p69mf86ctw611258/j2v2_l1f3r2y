package com.dasannetworks.vn.tms.controller;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;

import com.dasannetworks.vn.sb.model.Device;
import com.dasannetworks.vn.sb.service.DeviceLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class CustomFieldDemo extends MVCPortlet {

	@ProcessAction(name = "updateUserCustomeField")
	public void updateUserCustomeField(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException,
			PortletException, PortalException, SystemException {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(User.class.getName(), actionRequest);

		User user = PortalUtil.getUser(actionRequest);

		user.setExpandoBridgeAttributes(serviceContext);

		UserLocalServiceUtil.updateUser(user);
	}

	@ProcessAction(name = "addUserCustomeField")
	public void addUserCustomeField(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException,
			PortletException, PortalException, SystemException {

		String customField = ParamUtil.getString(actionRequest, "customField", "");
		User user = PortalUtil.getUser(actionRequest);
		
		Device device = null;
		device = DeviceLocalServiceUtil.createDevice(100);
		
		user.getExpandoBridge().addAttribute(customField, 5);
		
	}

}
