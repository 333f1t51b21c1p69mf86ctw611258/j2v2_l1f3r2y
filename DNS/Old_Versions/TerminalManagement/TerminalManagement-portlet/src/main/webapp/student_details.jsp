<%@page import="com.dasannetworks.tms.service.StudentLocalServiceUtil"%>
<%@page import="com.dasannetworks.tms.model.Student"%>
<%@page import="java.util.List"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayPortletMode"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<liferay-theme:defineObjects />
<portlet:defineObjects />

<%-- <portlet:renderURL var="homeURL"></portlet:renderURL>
<portlet:renderURL var="displayStudent">
	<portlet:param name="mvcPath"
		value="/html/studentdetails/display_student.jsp" />
</portlet:renderURL>
 --%>
 <%
 PortletURL homeURL = renderResponse.createRenderURL();
PortletURL backStudentURL = renderResponse.createRenderURL();
backStudentURL.setParameter("mvcPath", "/display_student.jsp");
%>
<a href="<%=homeURL.toString()%>">Home</a>
<a href="<%=backStudentURL.toString()%>">Back</a>
<%
   String studentId=request.getParameter("studentId");
Student student=StudentLocalServiceUtil.getStudent(Long.parseLong(studentId));
%>
</br>Student info:<br><br>
<b>First Name:</b><%=student.getFirstname()%> </br>
<b>Last Name:</b> <%=student.getLastName() %></br>
<b>Branch:</b>    <%=student.getBranch() %></br>
<b>Age:</b>       <%=student.getAge() %></br>
<b>Email:</b>       <%=student.getEmail() %></br>

