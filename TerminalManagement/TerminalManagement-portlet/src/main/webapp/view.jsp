<%@page import="javax.portlet.PortletURL"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:defineObjects />
<liferay-theme:defineObjects />
<h1>Registration form submission</h1>
<%--
 <portlet:renderURL var="addStudent">
<portlet:param name="mvcPath" value="/add_student.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="updateStudent">
<portlet:param name="mvcPath" value="/update_by_id.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="updateStudentURL">
	<portlet:param name="mvcPath"
		value="/update_student.jsp" />
</portlet:renderURL>

<portlet:renderURL var="dislayStudent">
<portlet:param name="mvcPath" value="/display_student.jsp"/>
</portlet:renderURL> --%>

<%
PortletURL addStudent = renderResponse.createRenderURL();
addStudent.setParameter("mvcPath", "/add_student.jsp");
PortletURL updateStudent = renderResponse.createRenderURL();
updateStudent.setParameter("mvcPath", "/update_by_id.jsp");
PortletURL dislayStudent = renderResponse.createRenderURL();
dislayStudent.setParameter("mvcPath", "/display_student.jsp");
PortletURL updateStudentURL=renderResponse.createRenderURL();
updateStudentURL.setParameter("mvcPath", "/update_student.jsp");
PortletURL searchByName=renderResponse.createRenderURL();
searchByName.setParameter("mvcPath", "/search_by_name.jsp");
%>
<br/>

<a href="<%=addStudent.toString()%>">Add Student</a><br/>
<a href="<%=updateStudent.toString()%>">Update Student</a><br/>
<a href="<%=dislayStudent.toString()%>">Display Student</a><br/>
<a href="<%=searchByName.toString()%>">Search</a>