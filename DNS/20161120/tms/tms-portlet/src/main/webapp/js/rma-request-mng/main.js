function doc_ready(label_noDataAvailableInTable, //
resourceURL_getAllRmaRequests, //
renderURL_sendRmaRequest) {

	jQuery('#rmaRequest-datatable').dataTable({
	    "language" : {
		    "emptyTable" : label_noDataAvailableInTable
	    },
	    bAutoWidth : true,
	    bProcessing : true,
	    bFilter : true,
	    sPaginationType : "full_numbers",
	    sAjaxSource : resourceURL_getAllRmaRequests,
	    "aoColumns" : [ {
		    "mData" : "rmaRequestNumber"
	    }, {
		    "mData" : "cusCode"
	    }, {
		    "mData" : "cusInCharge"
	    }, {
		    "mData" : "cusEmail"
	    }, {
		    "mData" : "cusPhone"
	    }, {
		    "mData" : "cusLocation"
	    }, {
		    "mData" : "provInCharge"
	    }, {
		    "mData" : "creatingAssignedDate"
	    }, {
		    "mData" : "creatingEstReturnDate"
	    }, {
	        "mData" : "rmaRequestId",
	        "bSortable" : false,
	        "bSearchable" : false,
	        "mRender" : function(data, type, full) {
		        var aSend = "<a href='" + renderURL_sendRmaRequest + "&rmaRequestId=" + data + "' class='bs-tooltip' data-placement='top' data-original-title='Edit' title='Edit'><i class='icon-pencil'></i></a>";
		        
		        return "<div style='text-align: center;'>" + aSend + "</div>";
	        }
	    } ]
	});

}