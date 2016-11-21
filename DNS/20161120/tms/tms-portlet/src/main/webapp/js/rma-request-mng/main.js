function created_doc_ready(label_noDataAvailableInTable, //
resourceURL_getAllRmaRequests_Created, //
renderURL_createdRmaRequest_ForSending) {

	jQuery('#rmaRequest-datatable').dataTable({
	    "language" : {
		    "emptyTable" : label_noDataAvailableInTable
	    },
	    bAutoWidth : true,
	    bProcessing : true,
	    bFilter : true,
	    sPaginationType : "full_numbers",
	    sAjaxSource : resourceURL_getAllRmaRequests_Created,
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
		        var aSend = "<a href='" + renderURL_createdRmaRequest_ForSending + "&rmaRequestId=" + data + "' class='bs-tooltip' data-placement='top' data-original-title='Edit' title='Send To Partners'><i class='icon-envelope'></i></a>";

		        return "<div style='text-align: center;'>" + aSend + "</div>";
	        }
	    } ]
	});

}

function sent_doc_ready(label_noDataAvailableInTable, //
resourceURL_getAllRmaRequests_Sent, //
renderURL_sentRmaRequest_ForReceiving) {

	jQuery('#rmaRequest-datatable').dataTable({
	    "language" : {
		    "emptyTable" : label_noDataAvailableInTable
	    },
	    bAutoWidth : true,
	    bProcessing : true,
	    bFilter : true,
	    sPaginationType : "full_numbers",
	    sAjaxSource : resourceURL_getAllRmaRequests_Sent,
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
		        var aReceive = "<a href='" + renderURL_sentRmaRequest_ForReceiving + "&rmaRequestId=" + data + "' class='bs-tooltip' data-placement='top' data-original-title='Edit' title='Receive From Partners'><i class='icon-retweet'></i></a>";

		        return "<div style='text-align: center;'>" + aReceive + "</div>";
	        }
	    } ]
	});

}

function received_doc_ready(label_noDataAvailableInTable, //
resourceURL_getAllRmaRequests_Received, //
renderURL_receivedRmaRequest_ForReturning) {

	jQuery('#rmaRequest-datatable').dataTable({
	    "language" : {
		    "emptyTable" : label_noDataAvailableInTable
	    },
	    bAutoWidth : true,
	    bProcessing : true,
	    bFilter : true,
	    sPaginationType : "full_numbers",
	    sAjaxSource : resourceURL_getAllRmaRequests_Received,
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
		        var aReturn = "<a href='" + renderURL_receivedRmaRequest_ForReturning + "&rmaRequestId=" + data + "' class='bs-tooltip' data-placement='top' data-original-title='Edit' title='Return To Customers'><i class='icon-repeat'></i></a>";

		        return "<div style='text-align: center;'>" + aReturn + "</div>";
	        }
	    } ]
	});

}

function returned_doc_ready(label_noDataAvailableInTable, //
resourceURL_getAllRmaRequests_Returned) {

	jQuery('#rmaRequest-datatable').dataTable({
	    "language" : {
		    "emptyTable" : label_noDataAvailableInTable
	    },
	    bAutoWidth : true,
	    bProcessing : true,
	    bFilter : true,
	    sPaginationType : "full_numbers",
	    sAjaxSource : resourceURL_getAllRmaRequests_Returned,
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
		        return "<div style='text-align: center;'></div>";
	        }
	    } ]
	});

}

function send_rma_request_doc_ready() {
	var form = $("#rmaRequestForm");
	var wizard = $("#rootwizard");

	var $validator = $("#rmaRequestForm").validate();

	$.validator.addMethod("alpha", function(value, element) {
		return this.optional(element) || /^[a-zA-Z]+$/i.test(value);
	}, "Please enter alphabets only");

	var handleTitle = function(tab, navigation, index) {
		var total = navigation.find('li').length;
		var current = index + 1;
		if (current == 1) {
			wizard.find('.button-previous').hide();
		} else {
			wizard.find('.button-previous').show();
		}

		if (current >= total) {
			wizard.find('.button-next').hide();
			wizard.find('.button-submit').show();
		} else {
			wizard.find('.button-next').show();
			wizard.find('.button-submit').hide();
		}
	};

	// Form wizard example
	wizard.bootstrapWizard({
	    'nextSelector' : '.button-next',
	    'previousSelector' : '.button-previous',
	    onTabClick : function(tab, navigation, index, clickedIndex) {

		    if (form.valid() == false) {
			    return false;
		    }
		    handleTitle(tab, navigation, clickedIndex);
	    },
	    onNext : function(tab, navigation, index) {

		    if (form.valid() == false) {
			    return false;
		    }
		    handleTitle(tab, navigation, index);
	    },
	    onPrevious : function(tab, navigation, index) {
		    handleTitle(tab, navigation, index);
	    }
	});

	wizard.find('.button-previous').hide();
	$('#rmaRequestForm .button-submit').hide();
	
	/// PicaDate
	var sendingEstReturnDate = new Pikaday({
        field : jQuery('#dtpSendingEstReturnDate')[0],
        format : 'MM/DD/YYYY'
    });
}

function receive_rma_request_doc_ready() {
	/// PicaDate
	var receivingReturnedDate = new Pikaday({
        field : jQuery('#dtpReceivingReturnedDate')[0],
        format : 'MM/DD/YYYY'
    });
}