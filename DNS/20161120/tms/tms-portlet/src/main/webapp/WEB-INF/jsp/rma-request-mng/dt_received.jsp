<%@ include file="init.jsp"%>

<portlet:resourceURL id='getAllRmaRequests_Received' var="resourceURL_getAllRmaRequests_Received" />

<portlet:renderURL var="renderURL_receivedRmaRequest_ForReturning">
	<portlet:param name="render" value="receivedRmaRequest_ForReturning" />
</portlet:renderURL>

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
		received_doc_ready("<spring:message code='label.noDataAvailableInTable' />", // 
	    "${resourceURL_getAllRmaRequests_Received}", //
	    "${renderURL_receivedRmaRequest_ForReturning}");

    });
</script>