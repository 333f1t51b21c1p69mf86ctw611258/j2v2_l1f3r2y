<%@page import="com.liferay.portal.model.BackgroundTask"%>
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
<portlet:renderURL var="updateStudentURL">
<portlet:param name="mvcPath" value="/update_student.jsp"/>
</portlet:renderURL> --%>
<%
PortletURL homeURL = renderResponse.createRenderURL();
PortletURL updateStudentURL = renderResponse.createRenderURL();
updateStudentURL.setParameter("mvcPath", "/update_student.jsp");

%>
<h2>Update Student by  Id Number</h2>
<a href="<%=homeURL.toString() %>">Home</a><br/><br/>
<%
List<Student> students=StudentLocalServiceUtil.getStudents(-1, -1);

%>
<form action="<%=updateStudentURL%>" name="studentForm"  method="POST">

<b>Select Student ID</b><br>

<select name="<portlet:namespace/>studentId" >
<option value="-1">--select--</option>
<% for(Student student:students){%>
  <option value="<%=student.getStudentId()%>" >
<%=student.getStudentId()%></option>
  <%} %>
</select><br>
<%-- <input name="<portlet:namespace/>studentId" value=''  type="text"></input> --%>
 <input type="submit" label=""   value="send"/>
</form>
