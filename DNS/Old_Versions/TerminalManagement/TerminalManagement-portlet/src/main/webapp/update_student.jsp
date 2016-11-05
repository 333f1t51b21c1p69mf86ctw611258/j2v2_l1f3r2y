<%@page import="java.util.List"%>
<%@page import="com.dasannetworks.tms.model.Student"%>
<%@page import="com.dasannetworks.tms.service.StudentLocalServiceUtil"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayPortletMode"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<portlet:defineObjects />
<%
PortletURL homeURL = renderResponse.createRenderURL();
PortletURL updateStudentActionURL = renderResponse.createActionURL();
updateStudentActionURL.setParameter(ActionRequest.ACTION_NAME, "updateStudent");

%>
<h2>Update Student Form</h2>
<a href="<%=homeURL.toString()%>">Home</a>
<br />
<br />
<%
List<Student> students=StudentLocalServiceUtil.getStudents(-1, -1);
  
   String studentId=request.getParameter("studentId");
   Student student=StudentLocalServiceUtil.getStudent(Long.parseLong(studentId));
  

%>
<form action="<%=updateStudentActionURL%>" name="studentForm"	method="POST">
	 <input name="<portlet:namespace/>studentId" value="<%=studentId%>" type="hidden" />
	 
	 <b>First Name</b> 
	 <input name="<portlet:namespace/>firstName" value="<%=student.getFirstname()%>" type="text"/> <br>
	 <b>Last Name</b> 
	 <input name="<portlet:namespace/>lastName" value="<%=student.getLastName()%>" type="text"/></br>
     <b>Branch</b>
	 <input name="<portlet:namespace/>branch" value="<%=student.getBranch() %>" type="text"/></br>
	<b>Age</b> <input name="<portlet:namespace/>age" value="<%=student.getAge()%>" type="text"/><br/>
   <b>Email</b> <input name="<portlet:namespace/>email" value="<%=student.getEmail()%>" type="text"/><br/>
	<%-- <aui:input name="verifyUrl" type="hidden" label=""
		 value="<%=verifyURL.toString()%>" id="verifyUrl"></aui:input>  --%>
	<input type="submit" value="send" />
</form>