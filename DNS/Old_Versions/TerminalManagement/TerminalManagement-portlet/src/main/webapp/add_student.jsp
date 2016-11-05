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
<%-- <portlet:renderURL var="homeURL"></portlet:renderURL>
<portlet:actionURL var="addStudentActionURL" windowState="normal"
	name="addStudent">
</portlet:actionURL> --%>

<%
	PortletURL homeURL = renderResponse.createRenderURL();

	PortletURL addStudentActionURL = renderResponse.createActionURL();
	addStudentActionURL.setParameter(ActionRequest.ACTION_NAME, "addStudent");
%>
<h2>Add Student Form here !</h2>
<a href="<%=homeURL.toString()%>">Home</a>
<br />
<br />
<aui:form action="<%=addStudentActionURL.toString()%>"
	name="studentForm" method="POST">

	<aui:input name="firstName">
		<aui:validator name="required" />
		<aui:validator name="alpha" />
	</aui:input>

	<aui:input name="lastName">
		<aui:validator name="required" />
		<aui:validator name="alpha" />
	</aui:input>

	<aui:input name="branch">
		<aui:validator name="required" />
		<aui:validator name="alpha" />
	</aui:input>

	<aui:input name="age">
		<aui:validator name="required" />
		<aui:validator name="alpha" />
	</aui:input>

	<aui:input name="email">
		<aui:validator name="required" />
		<aui:validator name="alpha" />
	</aui:input>

	<aui:button type="submit" name="" value="Submit"></aui:button>

</aui:form>

