<%@include file="init.jsp"%>

<portlet:renderURL var="backToList" />

<portlet:actionURL var="actionURL_receiveRmaRequest">
	<portlet:param name="action" value="receiveRmaRequest" />
</portlet:actionURL>

<%
	String backURL = ParamUtil.getString(request, "backURL");
%>
<p>
	<liferay-ui:header title="Receive RMA Request" backURL="<%=backURL%>" backLabel="Back"></liferay-ui:header>
</p>

<style>
label.error {
	color: #FB3A3A;
}
</style>

<form:form id="rmaRequestForm" commandName="rmaRequest" method="post" action="${actionURL_receiveRmaRequest}" cssClass="form-horizontal">

	<div class="control-group">
		<label class="control-label" for="receivingReturnedDate"> <spring:message code="label.estimatedReturnDate" />
		</label>
		<div class="controls">
			<fmt:formatDate value="${rmaRequest.receivingReturnedDate}" type="date" pattern="MM/dd/yyyy" var="valReceivingReturnedDate" />
			<form:input path="receivingReturnedDate" name="dtpReceivingReturnedDate" id="dtpReceivingReturnedDate" value="${valReceivingReturnedDate}" />
		</div>
	</div>
	<div class="control-group">
		<label class="control-label" for="partnerCode"><spring:message code="label.partnerCode" /></label>
		<div class="controls">
			<form:textarea path="receivingNote" />
		</div>
	</div>

	<div class="well well-large">
		<form:hidden path="rmaRequestId" />
		<button type="submit" class="btn btn-success button-submit">
			<spring:message code="label.submit" />
			<i class="icon-angle-right"></i>
		</button>
	</div>
</form:form>

<script type="text/javascript">
	$(document).ready(function() {
		receive_rma_request_doc_ready();
    });
</script>