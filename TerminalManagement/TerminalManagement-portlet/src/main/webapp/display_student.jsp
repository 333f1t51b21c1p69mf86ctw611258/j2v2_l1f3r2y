
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.dasannetworks.tms.model.Student"%>
<%@page import="com.dasannetworks.tms.service.StudentLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib prefix="liferay-portlet" uri="http://liferay.com/tld/portlet"%>

<liferay-theme:defineObjects />
<portlet:defineObjects />

<%
	PortletURL homeURL = renderResponse.createRenderURL();

	PortletURL backURL = renderResponse.createRenderURL();
	backURL.setParameter("mvcPath", "/display_student.jsp");

	PortletURL addStudent = renderResponse.createRenderURL();
	addStudent.setParameter("mvcPath", "/add_student.jsp");

	PortletURL studentDetailsURL = renderResponse.createRenderURL();
	studentDetailsURL.setParameter("mvcPath", "/student_details.jsp");

	PortletURL displaySearchStudent = renderResponse.createRenderURL();
	displaySearchStudent.setParameter("mvcPath", "/display_search_student.jsp");
	displaySearchStudent.setParameter("backURL", backURL.toString());

	PortletURL deleteStudentActionURL = renderResponse.createActionURL();
	deleteStudentActionURL.setParameter(ActionRequest.ACTION_NAME, "deleteStudent");
%>

<%
	List<Student> students = StudentLocalServiceUtil.getStudents(-1, -1);
%>

<table border="1">
	<tr>
		<th>Student Id</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Branch</th>
		<th>Age</th>
		<th>Email</th>
		<th>Delete</th>
	</tr>
	
	<%
		for (Student student : students) {
	%>
	<tr>
		<td><a
			href="<%=studentDetailsURL.toString() + "&" + renderResponse.getNamespace() + "studentId="
						+ student.getStudentId()%>"><%=student.getStudentId()%></a></td>
		<td><a
			href="<%=displaySearchStudent.toString() + "&" + renderResponse.getNamespace() + "firstName="
						+ student.getFirstname()%>"><%=student.getFirstname()%></a></td>

		<td><%=student.getFirstname()%></td>
		<td><%=student.getLastName()%></td>
		<td><%=student.getBranch()%></td>
		<td><%=student.getAge()%></td>
		<td><%=student.getEmail()%></td>
		<td><a
			href="<%=deleteStudentActionURL + "&" + renderResponse.getNamespace() + "studentId="
						+ student.getStudentId()%>">Delete</a></td>
	</tr>
	<%
		}
	%>
</table>
