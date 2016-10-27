<%@page import="com.dasannetworks.tms.model.Student"%>
<%@page import="com.dasannetworks.tms.service.StudentLocalServiceUtil"%>
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

<%
PortletURL backURL=renderResponse.createRenderURL();
backURL.setParameter("mvcPath", "/search_by_name.jsp");


PortletURL homeURL = renderResponse.createRenderURL();
PortletURL displaySearchStudent = renderResponse.createRenderURL();
displaySearchStudent.setParameter("mvcPath", "/display_search_student.jsp");
displaySearchStudent.setParameter("backURL", backURL.toString());

%>
<a href="<%=homeURL.toString() %>">Home</a><br/><br/>

<%
List<Student> students=StudentLocalServiceUtil.getStudents(-1, -1);
%>
<form action="<%=displaySearchStudent%>" name="studentForm"  method="POST">


<b>Search Student By Name</b><br>
<input name="<portlet:namespace/>firstName" value=''  type="text"></input> 
 <input type="submit" label=""   value="send"/>
</form>
