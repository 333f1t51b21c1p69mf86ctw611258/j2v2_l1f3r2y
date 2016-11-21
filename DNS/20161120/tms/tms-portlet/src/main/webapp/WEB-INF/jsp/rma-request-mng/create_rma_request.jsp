<%@include file="init.jsp"%>

<portlet:renderURL var="backToList" />

<portlet:actionURL var="actionURL_createRmaRequest">
	<portlet:param name="action" value="createRmaRequest" />
</portlet:actionURL>

<%
	String backURL = ParamUtil.getString(request, "backURL");
%>
<p>
	<liferay-ui:header title="Create RMA Request" backURL="<%=backURL%>" backLabel="Back"></liferay-ui:header>
</p>

<style>
label.error {
	color: #FB3A3A;
}
</style>

<form:form id="rmaRequestForm" commandName="rmaRequest" method="post" action="${actionURL_createRmaRequest}" cssClass="form-horizontal">
	This is "Create" form
</form:form>

<script type="text/javascript">
	$(document).ready(function() {

    });
</script>