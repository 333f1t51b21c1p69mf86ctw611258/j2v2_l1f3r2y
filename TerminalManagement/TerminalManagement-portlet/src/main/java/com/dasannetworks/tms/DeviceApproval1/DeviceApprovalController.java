/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.dasannetworks.tms.DeviceApproval1;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.dasannetworks.tms.sb.model.Contact;
import com.dasannetworks.tms.sb.service.ContactLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.ReleaseInfo;

@Controller("deviceApprovalController")
@RequestMapping("VIEW")
public class DeviceApprovalController {

	@RenderMapping
	public String question(Model model) throws SystemException {
		model.addAttribute("releaseInfo", ReleaseInfo.getReleaseInfo());

		model.addAttribute("contactList", ContactLocalServiceUtil.getContacts(-1, -1));

		return "DeviceApproval1/view";
	}

	@RenderMapping(params = "action=renderOne")
	public String renderOneMethod(RenderRequest request, RenderResponse response, Model model)
			throws NumberFormatException, PortalException, SystemException {
		Long contactId = ParamUtil.getLong(request, "contactId");
		System.out.println("#######Value##############" + contactId);
		System.out.println("#######Calling some process action##############");

		Contact contact = ContactLocalServiceUtil.deleteContact(contactId);

		return "DeviceApproval1/view";
	}

}