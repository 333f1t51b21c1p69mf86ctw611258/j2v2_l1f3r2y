<%@ page import="javax.portlet.ActionRequest" %>
<%@ page import="javax.portlet.PortletURL" %>
<%@ page import="com.dasannetworks.vn.tms.pojo.PurchaseOrderVO" %>
<%@ page import="com.liferay.portal.kernel.portlet.LiferayWindowState" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet_2_0" %>
<%@ taglib prefix="liferay-portlet" uri="http://liferay.com/tld/portlet" %>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<div class="portlet-msg-success" style="display:none;" id="successMsg">
 	<span>Upload Device List File Success!</span>
</div>

<aui:button-row>
	<aui:button value="Add" name="add_purchase_order"/>
</aui:button-row>

<h3>Purchase Order List</h3>

<div>
	<table
			id="purchase-order-datatable"
			class="display"
			cellspacing="0">
		<thead>
		<tr>
			<th>Purchase Order Number</th>
			<th>Customer Code</th>
			<th>Sign Date</th>
			<th>Warranty Start Date</th>
			<th>Warranty End Date</th>
			<th></th>
		</tr>
		</thead>
		<tfoot>
		<tr>
			<th>Purchase Order Number</th>
			<th>Customer Code</th>
			<th>Sign Date</th>
			<th>Warranty Start Date</th>
			<th>Warranty End Date</th>
			<th></th>
		</tr>
		</tfoot>
		<tbody>
		</tbody>
	</table>
</div>

<portlet:actionURL var="deletePurchaseOrderURL">
	<portlet:param name="action" value="delete_purchase_order"/>
</portlet:actionURL>
<portlet:actionURL var="getAllPurchaseOrderURL">
	<portlet:param name="action" value="get_all_purchase_order"/>
</portlet:actionURL>
<liferay-portlet:renderURL varImpl="editPurchaseOrderURL" windowState="<%=LiferayWindowState.POP_UP.toString()%>">
	<portlet:param name="render" value="edit_purchase_order"/>
</liferay-portlet:renderURL>

<script type="text/javascript">
	AUI().use('aui-base', 'aui-io-request', 'liferay-util-list-fields', 'liferay-util-window', function(A) {
		A.one('#<portlet:namespace />add_purchase_order').on('click', function (event) {
			Liferay.Util.openWindow({
				dialog: {
					centered: true,
					height: 800,
					modal: true,
					width: 600
				},
				id: '<portlet:namespace/>close_edit_purchase_order_dialog',
				title: 'Add Purchase Order',
				uri: '<%= editPurchaseOrderURL %>'
			});
		});
	});

	jQuery(document).ready(function() {
		var purchaseOrderDataTable = jQuery('#purchase-order-datatable').dataTable({
			"language" : {
				"emptyTable" : "No Purchase Order In System."
			},
			"initComplete": function(settings, json) {
				jQuery('.delete-purchase-order-action').click(function (event){
					event.preventDefault();
					if( !confirm('Are you sure you want to delete Purchase Order and its Devices?')) {
						return false;
					}

					var id = jQuery(event.target).data('id');
					jQuery.ajax({
						type: "POST",
						url: "<%=deletePurchaseOrderURL.toString()%>",
						data: {<portlet:namespace />purchase_order_id: id},
						complete: function (response) {
							Liferay.Portlet.refresh("#p_p_id<portlet:namespace />");
						}
					});

				});
				
				jQuery('.edit-purchase-order-action').click(function (event){
					event.preventDefault();
					var $this = jQuery(event.target);
					var id = $this.data('id');
					var url = "<%=editPurchaseOrderURL.toString()%>";
					Liferay.Util.openWindow({
						dialog: {
							centered: true,
							height: 800,
							modal: true,
							width: 600
						},
						id: '<portlet:namespace/>close_edit_purchase_order_dialog',
						title: 'Edit Purchase Order',
						uri: url + '&<portlet:namespace />purchase_order_id=' + id
					});
				});
			},
			bAutoWidth : true,
			bProcessing : true,
			bFilter : false,
			sPaginationType : "full_numbers",
			sAjaxSource : "<portlet:resourceURL id='get_all_purchase_order'/>",
			sAjaxDataProp: "result",
			"aoColumns" : [
				{
					"mData" : "purchaseOrderNumber"
				}, {
					"mData" : "customerCode"
				}, {
					"mData" : "signDateFormatted"
				}, {
					"mData" : "warrantyStartDateFormatted"
				}, {
					"mData" : "warrantyEndDateFormatted"
				},{
					"mData" : "purchaseOrderId",
					"bSortable" : false,
					"bSearchable" : false,
					"mRender" : function(data, type, full) {
						return "<div style='text-align: center;'><a href='#' data-id='" + data + "' class='bs-tooltip delete-purchase-order-action'>Delete</a> | " +
								"<a href='#' data-id='" + data + "' class='bs-tooltip edit-purchase-order-action'>Edit</a></div>";
					}
				} ]
		});

	});
</script>