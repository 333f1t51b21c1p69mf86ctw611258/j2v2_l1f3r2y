<%@include file="init.jsp"%>

<portlet:resourceURL id='getAllRmaRequests' var="resourceURL_getAllRmaRequests" />

<portlet:renderURL var="renderURL_newRmaRequest">
	<portlet:param name="render" value="newRmaRequest" />
</portlet:renderURL>
<portlet:renderURL var="renderURL_createdRmaRequest">
	<portlet:param name="render" value="createdRmaRequest" />
</portlet:renderURL>

<p class="pull-left">
	<a href="${renderURL_createRmaRequest }" class="btn btn-primary"> <i class="icon-plus"></i> <spring:message code="label.createRmaRequest" /></a>
</p>

<legend>RMA Requests</legend>
<div>
	<table id="rmaRequest-datatable" class="display" cellspacing="0">
		<thead>
			<tr>
				<th><spring:message code="label.rmaRequestNumber" /></th>
				<th><spring:message code="label.customerCode" /></th>
				<th><spring:message code="label.contactPoint" /></th>
				<th><spring:message code="label.email" /></th>
				<th><spring:message code="label.phone" /></th>
				<th><spring:message code="label.location" /></th>
				<th><spring:message code="label.personInCharge" /></th>
				<th><spring:message code="label.assignDate" /></th>
				<th><spring:message code="label.estimatedReturnDate" /></th>
				<th></th>
			</tr>
		</thead>
		<tfoot>
			<tr>
				<th><spring:message code="label.rmaRequestNumber" /></th>
				<th><spring:message code="label.customerCode" /></th>
				<th><spring:message code="label.contactPoint" /></th>
				<th><spring:message code="label.email" /></th>
				<th><spring:message code="label.phone" /></th>
				<th><spring:message code="label.location" /></th>
				<th><spring:message code="label.personInCharge" /></th>
				<th><spring:message code="label.assignDate" /></th>
				<th><spring:message code="label.estimatedReturnDate" /></th>
				<th></th>
			</tr>
		</tfoot>
		<tbody>
		</tbody>
	</table>
</div>

<script type="text/javascript">
	jQuery(document).ready(function() {
	    doc_ready("<spring:message code='label.noDataAvailableInTable' />", // 
	    "${resourceURL_getAllRmaRequests}", //
	    "${renderURL_createdRmaRequest}");

    });
</script>
