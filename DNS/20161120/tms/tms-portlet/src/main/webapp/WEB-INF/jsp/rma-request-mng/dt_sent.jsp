<%@ include file="init.jsp"%>

<portlet:resourceURL id='getAllRmaRequests_Sent' var="resourceURL_getAllRmaRequests_Sent" />

<portlet:renderURL var="renderURL_sentRmaRequest_ForReceiving">
	<portlet:param name="render" value="sentRmaRequest_ForReceiving" />
	<portlet:param name="backURL" value="<%= themeDisplay.getURLCurrent() %>"></portlet:param>
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
		sent_doc_ready("<spring:message code='label.noDataAvailableInTable' />", // 
	    "${resourceURL_getAllRmaRequests_Sent}", //
	    "${renderURL_sentRmaRequest_ForReceiving}");

    });
</script>