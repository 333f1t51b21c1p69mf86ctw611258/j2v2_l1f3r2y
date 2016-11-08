<%@taglib
	uri="http://www.springframework.org/tags"
	prefix="spring"%>
<%@taglib
	uri="http://www.springframework.org/tags/form"
	prefix="form"%>
<%@taglib
	uri="http://java.sun.com/jsp/jstl/core"
	prefix="c"%>
<%@taglib
	uri="http://java.sun.com/portlet_2_0"
	prefix="portlet"%>

<div>
	<table
		id="handOverForm-datatable"
		class="display"
		cellspacing="0">
		<thead>
			<tr>
				<th><spring:message code="label.handOverFormNumber" /></th>
				<th><spring:message code="label.customerCode" /></th>
				<th><spring:message code="label.contactPoint" /></th>
				<th><spring:message code="label.email" /></th>
				<th><spring:message code="label.phone" /></th>
				<th><spring:message code="label.location" /></th>
				<th><spring:message code="label.personInCharge" /></th>
				<th><spring:message code="label.assignDate" /></th>
				<th><spring:message code="label.estimatedReturnDate" /></th>
			</tr>
		</thead>
		<tfoot>
			<tr>
				<th><spring:message code="label.handOverFormNumber" /></th>
				<th><spring:message code="label.customerCode" /></th>
				<th><spring:message code="label.contactPoint" /></th>
				<th><spring:message code="label.email" /></th>
				<th><spring:message code="label.phone" /></th>
				<th><spring:message code="label.location" /></th>
				<th><spring:message code="label.personInCharge" /></th>
				<th><spring:message code="label.assignDate" /></th>
				<th><spring:message code="label.estimatedReturnDate" /></th>
			</tr>
		</tfoot>
		<tbody>
		</tbody>
	</table>
</div>

<script type="text/javascript">
	jQuery(document).ready(function() {
		jQuery('#handOverForm-datatable').dataTable({
			"language" : {
				"emptyTable" : "No data available in table"
			},
			bAutoWidth : true,
			bProcessing : true,
			bFilter : false,
			sPaginationType : "full_numbers",
			sAjaxSource : "<portlet:resourceURL id='getAllHandOverForms'/>",
			"aoColumns" : [ {
				"mData" : "_handOverFormNumber"
			}, {
				"mData" : "_customerCode"
			}, {
				"mData" : "_contactPoint"
			}, {
				"mData" : "_email"
			}, {
				"mData" : "_phone"
			}, {
				"mData" : "_location"
			}, {
				"mData" : "_personInCharge"
			}, {
				"mData" : "_assignDate"
			}, {
				"mData" : "_estimatedReturnDate"
			} ]
		});

	});
</script>