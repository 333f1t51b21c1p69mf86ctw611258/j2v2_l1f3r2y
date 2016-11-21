<%@include file="init.jsp"%>

<portlet:renderURL var="backToList" />

<portlet:actionURL var="actionURL_sendRmaRequest">
	<portlet:param name="action" value="sendRmaRequest" />
</portlet:actionURL>

<p>
	<liferay-ui:header title="Send RMA Request To Partner" backURL="${backToList}" backLabel="Back"></liferay-ui:header>
</p>

<style>
label.error {
	color: #FB3A3A;
}
</style>

<form:form id="rmaRequestForm" commandName="rmaRequest" method="post" action="${actionURL_sendRmaRequest}" cssClass="form-horizontal">
	<c:if test="${not empty message }">
		${message}
	</c:if>
	<div id="rootwizard">
		<ul>
			<li><a href="#tab1" data-toggle="tab">Sending Step Information</a></li>
			<li><a href="#tab2" data-toggle="tab">Sending Note</a></li>
		</ul>

		<column name="partnerCode" type="String"></column>
		<column name="partnerInCharge" type="String"></column>
		<column name="partnerEmail" type="String"></column>
		<column name="partnerPhone" type="String"></column>
		<column name="partnerLocation" type="String"></column>
		<column name="sendingEstReturnDate" type="Date"></column>
		<column name="sendingReturnedDate" type="Date"></column>
		<column name="sendingAssignedDate" type="Date"></column>
		<column name="sendingNote" type="String"></column>

		<div class="tab-content">
			<!-- Tab 1 : Basic Information -->
			<div class="tab-pane" id="tab1">
				<div class="control-group">
					<label class="control-label" for="partnerCode"><spring:message code="label.partnerCode" /><span class="required">*</span> </label>
					<div class="controls">
						<form:input path="partnerCode" cssClass="required alpha" />
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
						<form:input path="sendingEstReturnDate" 
							name="sendingEstReturnDate" 
							id="sendingEstReturnDate" 
							value="${rmaRequest.sendingEstReturnDate}" />
					</div>
				</div>
			</div>
			<!-- Tab 2 : Course Detail -->
			<div class="tab-pane" id="tab2"></div>
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

	    var creatingEstReturnDate = new Pikaday({field: jQuery('#sendingEstReturnDate')[0], format: 'MM/DD/YYYY'});
    });
</script>