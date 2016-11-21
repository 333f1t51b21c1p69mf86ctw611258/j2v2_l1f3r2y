<%@ include file="init.jsp"%>

<portlet:resourceURL id='getAllRmaRequests_Returned' var="resourceURL_getAllRmaRequests_Returned" />

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
		returned_doc_ready("<spring:message code='label.noDataAvailableInTable' />", // 
	    "${resourceURL_getAllRmaRequests_Returned}");

    });
</script>