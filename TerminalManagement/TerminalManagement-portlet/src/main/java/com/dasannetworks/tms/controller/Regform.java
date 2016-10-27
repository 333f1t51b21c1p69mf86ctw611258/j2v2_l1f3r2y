package com.dasannetworks.tms.controller;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.dasannetworks.tms.sb.model.Student;
import com.dasannetworks.tms.sb.service.StudentLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class Regform
 */
public class Regform extends MVCPortlet {

	public void addStudent(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException, SystemException {

		System.out.println("hello to this page");
		long studentId;

		studentId = CounterLocalServiceUtil.increment();

		String firstName = ParamUtil.getString(actionRequest, "firstName");
		System.out.println(firstName);
		String lastName = ParamUtil.getString(actionRequest, "lastName");
		String branch = ParamUtil.getString(actionRequest, "branch");
		int age = (int) ParamUtil.getLong(actionRequest, "age");
		String email = ParamUtil.getString(actionRequest, "email");
		System.out.println(email + " yes");
		Student student = null;
		student = StudentLocalServiceUtil.createStudent(studentId);
		student.setStudentId(studentId);
		student.setFirstname(firstName);
		student.setLastName(lastName);
		student.setBranch(branch);
		student.setAge(age);
		student.setEmail(email);

		StudentLocalServiceUtil.addStudent(student);

		actionResponse.setRenderParameter("mvcPath", "/display_student.jsp");

	}

	public void updateStudent(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, SystemException, PortalException {
		System.out.println("yes it is progress");
		long studentId = ParamUtil.getLong(actionRequest, "studentId");
		String firstName = ParamUtil.getString(actionRequest, "firstName");
		String lastName = ParamUtil.getString(actionRequest, "lastName");
		String branch = ParamUtil.getString(actionRequest, "branch");
		int age = ParamUtil.getInteger(actionRequest, "age");
		String email = ParamUtil.getString(actionRequest, "email");
		System.out.println("update");

		Student student = StudentLocalServiceUtil.getStudent(studentId);
		if (student != null) {
			// fill update information
			student.setFirstname(firstName);
			student.setLastName(lastName);

			student.setBranch(branch);
			student.setAge(age);
			student.setEmail(email);
			System.out.println("yes");
		}
		student = StudentLocalServiceUtil.updateStudent(student);
		actionResponse.setRenderParameter("mvcPath", "/display_student.jsp");
	}

	public void deleteStudent(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortalException, SystemException {

		long studentId = ParamUtil.getLong(actionRequest, "studentId");
		System.out.println(studentId);
		Student student = StudentLocalServiceUtil.deleteStudent(studentId);
		actionResponse.setRenderParameter("mvcPath", "/display_student.jsp");
	}

	public void getStudent(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortalException, SystemException {
		long studentId = ParamUtil.getLong(actionRequest, "studentId");
		System.out.println(studentId);
		String cmd = ParamUtil.getString(actionRequest, "cmd");
		Student student = StudentLocalServiceUtil.getStudent(studentId);
		actionResponse.setRenderParameter("mvcPath", "/update_student.jsp");
	}
}
