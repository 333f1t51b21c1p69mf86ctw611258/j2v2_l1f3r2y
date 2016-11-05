<%@ include file="/jsp/init.jsp" %> 

<portlet:actionURL  var="addCustomField" name="addUserCustomeField"/>

<aui:form action="<%= addCustomField %>" method="post" name="fm">

	<aui:input name="customField" label="Custom Field"/>

	<aui:button type="submit" value="Add Custom Field"/>

</aui:form>