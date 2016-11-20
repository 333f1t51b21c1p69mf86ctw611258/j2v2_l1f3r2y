function doc_ready(label_noDataAvailableInTable, //
resourceURL_getAllDevices, //
resourceURL_checkDevices, //
resourceURL_checkDevicesWithExcel) {

	jQuery('#device-datatable').dataTable({
	    "language" : {
		    "emptyTable" : label_noDataAvailableInTable
	    },
	    bAutoWidth : true,
	    bProcessing : true,
	    bFilter : false,
	    sPaginationType : "full_numbers",
	    sAjaxSource : resourceURL_getAllDevices,
	    "aoColumns" : [ {
		    "mData" : "modelName"
	    }, {
		    "mData" : "serialNumber"
	    }, {
		    "mData" : "macAddress"
	    }, {
		    "mData" : "factoryOut"
	    }, {
		    "mData" : "warrantyStartDate"
	    }, {
		    "mData" : "warrantyEndDate"
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

		strData += "serialNumber=" + $('#serialNumber').val() //
		        + "&macAddress=" + $('#macAddress').val() //
		        + "&purchaseOrder=" + $('#purchaseOrder').val() //
		        + "&modelName=" + $('#modelName').val();

		jQuery.ajax({
		    type : "POST",
		    url : resourceURL_checkDevices,
		    data : strData,
		    dataType : "json",
		    success : function(response) {
			    var dataTable = jQuery('#device-datatable').dataTable();

			    dataTable.fnClearTable();

			    if (!$.isEmptyObject(response.deviceList)) {
				    var jsonArr = [];

				    jQuery(response.deviceList).each(function(indx, element) {
					    jsonArr.push({
					        modelName : element.modelName,
					        serialNumber : element.serialNumber,
					        macAddress : element.macAddress,
					        factoryOut : element.factoryOut,
					        warrantyStartDate : element.warrantyStartDate,
					        warrantyEndDate : element.warrantyEndDate,
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
		    type : 'POST',
		    url : resourceURL_checkDevicesWithExcel,
		    data : oMyForm,
		    dataType : 'json',
		    processData : false,
		    contentType : false,
		    success : function(response) {
			    var dataTable = jQuery('#device-datatable').dataTable();

			    dataTable.fnClearTable();

			    if (!$.isEmptyObject(response.deviceList)) {
				    var jsonArr = [];

				    jQuery(response.deviceList).each(function(indx, element) {
					    jsonArr.push({
					        modelName : element.modelName,
					        serialNumber : element.serialNumber,
					        macAddress : element.macAddress,
					        factoryOut : element.factoryOut,
					        warrantyStartDate : element.warrantyStartDate,
					        warrantyEndDate : element.warrantyEndDate,
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
}