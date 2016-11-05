package com.dasannetworks.vn.tms.controller.contact;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.dasannetworks.vn.sb.model.Contact;
import com.dasannetworks.vn.sb.model.impl.ContactImpl;
import com.dasannetworks.vn.sb.service.ContactLocalServiceUtil;
import com.dasannetworks.vn.tms.pojo.ContactPOJO;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;

@Controller("contactController")
@RequestMapping("VIEW")
public class ContactController {

	@RenderMapping
	public String listContacts(Map<String, Object> map) throws SystemException {

		ContactPOJO pojoContact = new ContactPOJO();
		map.put("contact", pojoContact);

		List<Contact> contactList = ContactLocalServiceUtil.getContacts(0, ContactLocalServiceUtil.getContactsCount());

		map.put("contactList", contactList);

		return "contact/view";

	}

	@ActionMapping(params = "action=add")
	public void addContact(ActionRequest actionRequest, ActionResponse actionResponse, Model model,
			@ModelAttribute("contact") ContactPOJO pojoContact, BindingResult result) throws IOException,
			PortletException, SystemException {
		
		System.out.println("result " + ParamUtil.getString(actionRequest, "firstname"));
		System.out.println("contact " + pojoContact.getFirstname());

		Contact contact = new ContactImpl();

		BeanUtils.copyProperties(pojoContact, contact);
		long contactId = CounterLocalServiceUtil.increment();
		contact.setId(contactId);

		ContactLocalServiceUtil.addContact(contact);

		// return "contact";

	}

	@ActionMapping(params = "action=delete")
	public void deleteContact(@RequestParam("contactId") Integer contactId, ActionRequest actionRequest,
			ActionResponse actionResponse, Model model) throws IOException,
			PortletException, PortalException, SystemException {
		
		System.out.println("resul344444444444444t");

		ContactLocalServiceUtil.deleteContact(contactId);

		// return "contact";

	}

}