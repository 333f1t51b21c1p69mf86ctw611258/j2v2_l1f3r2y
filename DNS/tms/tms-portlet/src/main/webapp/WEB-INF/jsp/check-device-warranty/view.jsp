<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:actionURL var="checkDeviceURL">
	<portlet:param name="action" value="checkDevice"></portlet:param>
</portlet:actionURL>

<form class="form-inline">
	<div class="panel panel-default">
	    <div class="panel-heading">Check with particular informations</div>
	    <div class="panel-body">
			<table cellpadding="2">
				<tr>
					<td>			
						<label for="serialNumber">Serial Number:</label>
					</td>
					<td>
						<input type="text" class="form-control" id="serialNumber">				
					</td>
					<td>
						<label for="macAddress">MAC Address:</label>
					</td>
					<td> 
						<input type="text" class="form-control" id="macAddress">		
					</td>
				</tr>
				<tr>
					<td>
						<label for="purchaseOrder">Purchase Order:</label>
					</td>
					<td>
						<input type="text" class="form-control" id="purchaseOrder">		
					</td>
					<td>
						<label for="modelName">Model Name:</label>
					</td>
					<td> 
						<input type="text" class="form-control" id="modelName">		
					</td>
				</tr>
				<tr>
					<td>
						<div class="checkbox">
							<label><input id="chkExactly1" type="checkbox">Check Exactly</label>
					    </div>
					</td>
					<td>
						<button id="btnCheck1" type="submit" class="btn btn-default">Check</button>
					</td>
				</tr>
			</table>
		</div>
	</div>
	
	<div class="panel panel-default">
	    <div class="panel-heading">Check with inputted excel file</div>
	    <div class="panel-body">
			<table cellpadding="2">
				<tr>
					<td>
						<label for="fExcel">File Upload:</label>
					</td>
					<td>
						<input name="fExcel" id="fExcel" type="file" />
					</td>
				</tr>
				<tr>
					<td>
						<div class="checkbox">
							<label><input id="chkExactly2" type="checkbox">Check Exactly</label>
					    </div>
					</td>
					<td>
						<button id="btnCheck2" type="submit" class="btn btn-default">Check</button>
					</td>
				</tr>
			</table>
	    </div>
	</div>
</form>



<h3>Results</h3>

<div>
	<table id="device-datatable"
		class="display" cellspacing="0">
		<thead>
			<tr>
				<th><spring:message code="label.modelName" /></th>
				<th><spring:message code="label.serialNumber" /></th>
				<th><spring:message code="label.macAddress" /></th>
				<th>Factory Out</th>
				<th>Warranty Start Date</th>
				<th>Warranty End Date</th>
			</tr>
		</thead>
		<tfoot>
			<tr>
				<th><spring:message code="label.modelName" /></th>
				<th><spring:message code="label.serialNumber" /></th>
				<th><spring:message code="label.macAddress" /></th>
				<th>Factory Out</th>
				<th>Warranty Start Date</th>
				<th>Warranty End Date</th>
			</tr>
		</tfoot>
		<tbody>
		</tbody>
	</table>
</div>

<script type="text/javascript">
	jQuery(document).ready(function() {
		jQuery('#device-datatable').dataTable({
			"language" : {
				"emptyTable" : "No data available in table"
			},
			bAutoWidth : true,
			bProcessing : true,
			bFilter : false,
			sPaginationType : "full_numbers",
			sAjaxSource : "<portlet:resourceURL id='getAllDevices'/>",
			"aoColumns" : [ {
				"mData" : "_modelName"
			}, {
				"mData" : "_serialNumber"
			}, {
				"mData" : "_macAddress"
			}, {
				"mData" : "_factoryOut"
			}, {
				"mData" : "_warrantyStartDate"
			}, {
				"mData" : "_warrantyEndDate"
			} ]
		});
		
		jQuery("#btnCheck1").click(function(e) {
			checkDevice();
			
			event.preventDefault();
		});
		
		function checkDevice() {
			var strData = "serialNumber=" + $('#serialNumber').val() 
			+ "&macAddress=" + $('#macAddress').val()
			+ "&purchaseOrder=" + $('#purchaseOrder').val()
			+ "&modelName=" + $('#modelName').val();
			
			jQuery.ajax({
				type : "POST",
				url : "<portlet:resourceURL id='checkDevices' />",
				data : strData,
				dataType : "json",
				success : function(response) {
					var dataTable = jQuery('#device-datatable').dataTable();
					
					dataTable.fnClearTable();
					
					if (!$.isEmptyObject(response.deviceList)) {
						var jsonArr = [];
						
						jQuery(response.deviceList).each(function(indx, element) {
							jsonArr.push({
								_modelName : element._modelName,
								_serialNumber : element._serialNumber,
								_macAddress : element._macAddress,
								_factoryOut : element._factoryOut,
								_warrantyStartDate : element._warrantyStartDate,
								_warrantyEndDate : element._warrantyEndDate
							});
						});
						
						dataTable.fnAddData(jsonArr);
					}
				},
				error : function(e) {
					alert('Ajax Error: ' + e);
				}
			});
		}
	});
</script>
