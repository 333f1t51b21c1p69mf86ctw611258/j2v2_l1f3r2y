<%@include file="init.jsp"%>

<portlet:renderURL var="backToList" />

<portlet:actionURL var="actionURL_sendRmaRequest">
	<portlet:param name="action" value="sendRmaRequest" />
</portlet:actionURL>

<%
	String backURL = ParamUtil.getString(request, "backURL");
%>
<p>
	<liferay-ui:header title="Send RMA Request To Partner" backURL="<%= backURL %>" backLabel="Back"></liferay-ui:header>
</p>

<style>
label.error {
	color: #FB3A3A;
}
</style>

<form:form id="rmaRequestForm" commandName="rmaRequest" method="post" action="${actionURL_sendRmaRequest}" cssClass="form-horizontal">
	<div id="rootwizard">
		<ul>
			<li><a href="#tab1" data-toggle="tab">Sending Step Information</a></li>
			<li><a href="#tab2" data-toggle="tab">Sending Note</a></li>
		</ul>

		<div class="tab-content">
			<!-- Tab 1 : Basic Information -->
			<div class="tab-pane" id="tab1">
				<div class="control-group">
					<label class="control-label" for="partnerCode"><spring:message code="label.partnerCode" /><span class="required">*</span> </label>
					<div class="controls">
						<form:input path="partnerCode" cssClass="required" />
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="partnerInCharge"> <spring:message code="label.inCharge" /><span class="required">*</span>
					</label>
					<div class="controls">
						<form:input path="partnerInCharge" cssClass="required alpha" />
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="email"> <spring:message code="label.email" /><span class="required">*</span>
					</label>
					<div class="controls">
						<form:input path="partnerEmail" cssClass="required email" />
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="partnerLocation"> <spring:message code="label.location" />
					</label>
					<div class="controls">
						<form:input path="partnerLocation" />
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="sendingEstReturnDate"> <spring:message code="label.estimatedReturnDate" />
					</label>
					<div class="controls">
						<fmt:formatDate value="${rmaRequest.sendingEstReturnDate}"  
			                type="date" 
			                pattern="MM/dd/yyyy"
			                var="valSendingEstReturnDate" />
						<form:input path="sendingEstReturnDate" name="dtpSendingEstReturnDate" id="dtpSendingEstReturnDate" value="${valSendingEstReturnDate}" />
					</div>
				</div>
			</div>
			<!-- Tab 2 : Course Detail -->
			<div class="tab-pane" id="tab2">
				<div class="control-group">
					<label class="control-label" for="partnerCode"><spring:message code="label.partnerCode" /></label>
					<div class="controls">
						<form:textarea path="sendingNote" />
					</div>
				</div>
			</div>
			<div class="well well-large">
				<form:hidden path="rmaRequestId" />
				<a href="javascript:void(0);" class="btn button-previous"><i class="icon-arrow-left"></i> <spring:message code="label.previous" /></a> <a href="javascript:void(0);" class="btn button-next"><spring:message code="label.next" /> <i class="icon-arrow-right"></i></a>
				<button type="submit" class="btn btn-success button-submit">
					<spring:message code="label.submit" />
					<i class="icon-angle-right"></i>
				</button>
			</div>
		</div>
	</div>
</form:form>

<script type="text/javascript">
	$(document).ready(function() {
	    send_rma_request_doc_ready();
    });
</script>