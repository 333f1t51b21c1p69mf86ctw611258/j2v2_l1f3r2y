<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ page import="com.liferay.portal.kernel.portlet.LiferayWindowState" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<portlet:actionURL var="saveRmaRequestURL">
    <portlet:param name="action" value="save"/>
</portlet:actionURL>
<liferay-ui:success key="save_success" message="Save successed." />
<liferay-ui:error key="save_failure" />

<aui:button-row>
    <aui:button value="Add" name="add_rma_request"/>
    <aui:button value="Send" name="send_rma_request"/>
</aui:button-row>

<h3>RMA Request List</h3>

<div>
    <table
            id="rmaRequest-datatable"
            class="display"
            cellspacing="0">
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

<portlet:renderURL var="editRmaRequestURL" windowState="<%=LiferayWindowState.POP_UP.toString()%>">
    <portlet:param name="render" value="edit"/>
</portlet:renderURL>

<portlet:renderURL var="sendRmaRequestURL" windowState="<%=LiferayWindowState.POP_UP.toString()%>">
    <portlet:param name="render" value="send"/>
</portlet:renderURL>

<portlet:renderURL var="viewRmaRequestURL">
    <portlet:param name="render" value="view"/>
</portlet:renderURL>
<portlet:actionURL var="deleteRmaRequestURL">
    <portlet:param name="action" value="delete"/>
</portlet:actionURL>

<script type="text/javascript">
	AUI().use('aui-base', 'aui-io-request', 'liferay-util-list-fields', 'liferay-util-window', function(A) {
	    A.one('#<portlet:namespace />add_rma_request').on('click', function(event) {
	        Liferay.Util.openWindow({
	            dialog: {
	                centered: true,
	                height: 800,
	                modal: true,
	                width: 600
	            },
	            id: '<portlet:namespace/>dialog',
	            title: 'Add/Edit RMA Request',
	            uri: '<%=editRmaRequestURL.toString() %>'
	        });
	    });
	    A.one('#<portlet:namespace />send_rma_request').on('click', function(event) {
	        Liferay.Util.openWindow({
	            dialog: {
	                centered: true,
	                height: 800,
	                modal: true,
	                width: 600
	            },
	            id: '<portlet:namespace/>dialog',
	            title: 'Send RMA Request To Warranty Partner',
	            uri: '<%=sendRmaRequestURL.toString() %>'
	        });
	    });
    Liferay.provide(window, '<portlet:namespace/>closeEdit',
			function(data, dialogId) {
				var dialog = Liferay.Util.Window.getById(dialogId);
				dialog.destroy();
				Liferay.Portlet.refresh('#p_p_id<portlet:namespace/>', data);
			},
			['liferay-util-window']
	);
	});

    jQuery(document).ready(function() {
        jQuery('#rmaRequest-datatable').dataTable({
            "language" : {
                "emptyTable" : "No data available in table"
            },
            "initComplete": function(settings, json) {
                jQuery('.delete-rma-request-action').click(function (event){
                	event.preventDefault();
                    if( !confirm('Are you sure you want to delete RMA Request?')) {
                        return false;
                    }
                    var id = jQuery(event.target).data('id');
                    jQuery.ajax({
                        type: "POST",
                        url: "<%=deleteRmaRequestURL.toString()%>",
                        data: {rma_request_id: id},
                        complete: function (response) {
                            Liferay.Portlet.refresh("#p_p_id<portlet:namespace />");
                        }
                    });
                });

                jQuery('.edit-rma-request-action').click(function (event){
                    event.preventDefault();
                    var $this = jQuery(event.target);
                    var id = $this.data('id');
                    var url = "<%=editRmaRequestURL.toString()%>";
                    Liferay.Util.openWindow({
                        dialog: {
                            centered: true,
                            height: 800,
                            modal: true,
                            width: 600
                        },
                        id: '<portlet:namespace/>dialog',
                        title: 'Add/Edit RMA Request',
                        uri: url + '&<portlet:namespace />rma_request_id=' + id
                    });
                });

            },
            bAutoWidth : true,
            bProcessing : true,
            bFilter : false,
            sPaginationType : "full_numbers",
            sAjaxSource : "<portlet:resourceURL id='getAllRmaRequests'/>",
            "aoColumns" : [ 
            {
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
            },{
                "mData" : "rmaRequestId",
                "bSortable" : false,
                "bSearchable" : false,
                "mRender" : function(data, type, full) {
                    return "<div style='text-align: center;'>" +
                            "<a href='<%=viewRmaRequestURL.toString() %>&<portlet:namespace />rma_request_id=" + data + "' data-id='" + data + "' class='view-rma-request-action'>View</a>" +
                            " | <a href='#' data-id='" + data + "' class='edit-rma-request-action'>Edit</a>" +
                            " | <a href='#' data-id='" + data + "' class='delete-rma-request-action'>Delete</a>" +
                            "</div>";
                }
            } ]
        });

    });
</script>

