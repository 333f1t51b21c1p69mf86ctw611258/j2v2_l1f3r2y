<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:actionURL var="checkDeviceURL">
	<portlet:param name="action" value="checkDevice"></portlet:param>
</portlet:actionURL>

<style type="text/css">
	.inner_table {
		
	}

	.first_lable_width {
		width: 120px;
	}
</style>

<form id="frmParticular" class="form-inline">
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
					<td class="first_lable_width">
						<div class="checkbox">
							<label><input id="chkExactly1" type="checkbox">Check Exactly</label>
					    </div>
					</td>
					<td>
						<button id="btnCheck1"  type="submit" class="btn btn-primary">
							<i class="icon-ok icon-white"></i> Check
						</button>
					</td>
				</tr>
			</table>
		</div>
	</div>
</form>
	
<form id="frmExcel" enctype="multipart/form-data" action='<portlet:actionURL><portlet:param name="action" value="checkDevicesWithExcel" /></portlet:actionURL>' class="form-inline">
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
					<td class="first_lable_width">
<!-- 						<div class="checkbox"> -->
<!-- 							<label><input id="chkExactly2" type="checkbox">Check Exactly</label> -->
<!-- 					    </div> -->
					</td>
					<td>
						<button id="btnCheck2"  type="submit" class="btn btn-primary">
							<i class="icon-ok icon-white"></i> Check
						</button>
					</td>
				</tr>
			</table>
	    </div>
	</div>
	
	<div id="result"></div>
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
				<th><spring:message code="label.factoryOut" /></th>
				<th><spring:message code="label.warrantyStartDate" /></th>
				<th><spring:message code="label.warrantyEndDate" /></th>
				<th>Warranty Status</th>
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
				<th>Warranty Status</th>
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
			}, {
				"mData" : "expired",
				"bSortable" : false,
				"bSearchable" : false,
				"mRender" : function(data, type, full) {
					if (data == false) {
						return "<div style='text-align: center;'><a href='#' class='bs-tooltip'><i class='icon-ok'></i></a></div>";	
					} else {
						return "<div style='text-align: center;'><i class='icon-remove'></i></div>";
					}
				}
			} ]
		});
		
		jQuery("#btnCheck1").click(function(e) {
			event.preventDefault();
			
			var strData = '';
			if ($('#chkExactly1').is(":checked")) {
				strData = "exactly=true&";
			} else {
				strData = "exactly=false&";
			}
			
			strData += "serialNumber=" + $('#serialNumber').val() 
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
								_warrantyEndDate : element._warrantyEndDate,
								expired : element.expired
							});
						});
						
						dataTable.fnAddData(jsonArr);
					}
				},
				error : function(e) {
					alert('Ajax Error: ' + e);
				}
			});
		});
		
		jQuery("#btnCheck2").click(function(e) {
			event.preventDefault();
			
			var oMyForm = new FormData();
			oMyForm.append("fileExcel", fExcel.files[0]);
			
			$.ajax({
				type: 'POST',
				url : "<portlet:resourceURL id='checkDevicesWithExcel' />", 
				data: oMyForm,
				dataType: 'json',
				processData: false,
				contentType: false,
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
								_warrantyEndDate : element._warrantyEndDate,
								expired : element.expired
							});
						});
						
						dataTable.fnAddData(jsonArr);
					}
				},
				error : function(e) {
					alert('Ajax Error: ' + e);
				}
			});
		});
	});
</script>
