<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<portlet:actionURL var="actionURL_checkDevicesWithExcel">
	<portlet:param name="action" value="checkDevicesWithExcel" />
</portlet:actionURL>

<portlet:resourceURL id='getAllDevices' var="resourceURL_getAllDevices" />
<portlet:resourceURL id='checkDevices' var="resourceURL_checkDevices" />
<portlet:resourceURL id='checkDevicesWithExcel' var="resourceURL_checkDevicesWithExcel" />

<style type="text/css">
.first_lable_width {
	width: 120px;
}
</style>

<form id="frmParticular">
	<div class="panel panel-default">
		<div class="panel-heading">Check with particular informations</div>
		<div class="panel-body">
			<table cellpadding="2">
				<tr>
					<td><label for="serialNumber">Serial Number:</label></td>
					<td><input type="text" class="form-control" id="serialNumber" /></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label for="macAddress">MAC Address:</label></td>
					<td><input type="text" class="form-control" id="macAddress" /></td>
				</tr>
				<tr>
					<td><label for="purchaseOrder">Purchase Order:</label></td>
					<td><input type="text" class="form-control" id="purchaseOrder" /></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label for="modelName">Model Name:</label></td>
					<td><input type="text" class="form-control" id="modelName" /></td>
				</tr>
				<tr>
					<td class="first_lable_width">
						<div class="checkbox">
							<label><input id="chkExactly1" type="checkbox">Check Exactly</label>
						</div>
					</td>
					<td>
						<button id="btnCheck1" type="submit" class="btn btn-primary">
							<i class="icon-ok icon-white"></i> Check
						</button>
					</td>
				</tr>
			</table>
		</div>
	</div>
</form>

<form id="frmExcel" enctype="multipart/form-data" action='${actionURL_checkDevicesWithExcel}'>
	<div class="panel panel-default">
		<div class="panel-heading">Check with inputted excel file</div>
		<div class="panel-body">
			<table cellpadding="2">
				<tr>
					<td><label for="fExcel">File Upload:</label></td>
					<td><input name="fExcel" id="fExcel" type="file" /></td>
				</tr>
				<tr>
					<td class="first_lable_width"></td>
					<td>
						<button id="btnCheck2" type="submit" class="btn btn-primary">
							<i class="icon-ok icon-white"></i> Check
						</button>
					</td>
				</tr>
			</table>
		</div>
	</div>

	<div id="result"></div>
</form>

<legend>Results</legend>
<div>
	<table id="device-datatable" class="display" cellspacing="0">
		<thead>
			<tr>
				<th><spring:message code="label.modelName" /></th>
				<th><spring:message code="label.serialNumber" /></th>
				<th><spring:message code="label.macAddress" /></th>
				<th><spring:message code="label.factoryOut" /></th>
				<th><spring:message code="label.warrantyStartDate" /></th>
				<th><spring:message code="label.warrantyEndDate" /></th>
				<th><spring:message code="label.warrantyStatus" /></th>
			</tr>
		</thead>
		<tfoot>
			<tr>
				<th><spring:message code="label.modelName" /></th>
				<th><spring:message code="label.serialNumber" /></th>
				<th><spring:message code="label.macAddress" /></th>
				<th><spring:message code="label.factoryOut" /></th>
				<th><spring:message code="label.warrantyStartDate" /></th>
				<th><spring:message code="label.warrantyEndDate" /></th>
				<th><spring:message code="label.warrantyStatus" /></th>
			</tr>
		</tfoot>
		<tbody>
		</tbody>
	</table>
</div>

<script type="text/javascript">
	jQuery(document).ready(function() {
	    doc_ready("<spring:message code='label.noDataAvailableInTable' />", // 
	    "${resourceURL_getAllDevices}", //
	    "${resourceURL_checkDevices}", //
	    "${resourceURL_checkDevicesWithExcel}");
    });
</script>