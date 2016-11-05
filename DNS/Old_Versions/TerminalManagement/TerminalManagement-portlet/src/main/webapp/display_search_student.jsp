
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
 PortletURL homeURL = renderResponse.createRenderURL();
//PortletURL searchByName = renderResponse.createRenderURL();
//searchByName.setParameter("mvcPath", "/search_by_name.jsp");
  

String backURL=request.getParameter("backURL");

%>
<a href="<%=homeURL.toString()%>">Home</a>
<a href="<%=backURL%>">Back</a>
</br>
<%
String firstName=request.getParameter("firstName");
List<Student> students=StudentLocalServiceUtil.getStudents(-1, -1);

  boolean studentFound=false;
for (Student student: students)

   {
       if (student.getFirstname().equals(firstName))
       { studentFound=true;
       %>
<b>First Name:</b>
<%=student.getFirstname() %>
</br>
<b>Last Name:</b>
<%=student.getLastName() %></br>
<b>Branch:</b>
<%=student.getBranch() %></br>
<b>Age:</b>
<%=student.getAge() %></br>
<b>Email:</b>
<b><%=student.getEmail() %></b>

<% 
break;
       }
   }
if(!studentFound)
out.println("no results");

%>





