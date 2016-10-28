<%@ include file="/jsp/init.jsp" %> 
<%@page import="com.liferay.portal.model.User"%> 

<%
	User currentUser = themeDisplay.getUser();
%>

View / Edit Custom Field<br/>

<portlet:actionURL  var="updateCustomField" name="updateUserCustomeField"/>

<aui:form action="<%= updateCustomField %>" method="post" name="fm">

	<liferay-ui:custom-attribute-list
		className="<%= User.class.getName() %>"
		classPK="<%= currentUser != null ? currentUser.getUserId() : 0 %>"
		editable="<%= true %>" label="true"/>

	<aui:button type="submit" value="update"/>

</aui:form> 

<br/>

<portlet:renderURL var="addCustomFieldPage">
	<portlet:param name="jspPage" value="/jsp/customfielddemo/addCustomField.jsp"/> 
</portlet:renderURL>

<a href="<%=addCustomFieldPage.toString()%>">Add Custom Field</a>

<br/> 

<b>Show all the custom Fields </b>

<liferay-ui:custom-attribute-list
	className="<%= User.class.getName() %>"
	classPK="<%= currentUser != null ? currentUser.getUserId() : 0 %>"
	editable="<%= false %>" label="true"/>
<br/>

<b>Show specific Custom Field Value</b>

<liferay-ui:custom-attribute
 	className="<%= User.class.getName() %>"
	classPK="<%= currentUser != null ? currentUser.getUserId() : 0 %>"
	editable="<%= false %>"
	name="secondary-email" label="true"/>