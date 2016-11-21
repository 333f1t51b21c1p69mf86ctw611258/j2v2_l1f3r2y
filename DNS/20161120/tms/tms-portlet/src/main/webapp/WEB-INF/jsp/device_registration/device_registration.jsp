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

<portlet:defineObjects />
<liferay-theme:defineObjects />

<%
	String curTab = "Device"; //set the default tab
	if (request.getAttribute("curTab") != null) {
		curTab = (String) request.getAttribute("curTab");
	}
%>

<liferay-portlet:renderURL varImpl="edit" windowState="<%=LiferayWindowState.POP_UP.toString()%>">
	<portlet:param name="render" value="edit"/>
</liferay-portlet:renderURL>

<portlet:actionURL var="deleteActionURL">
	<portlet:param name="action" value="delete"/>
</portlet:actionURL>

<portlet:resourceURL id="search_container" var="searchContainerURL"/>

<liferay-ui:tabs names="Device,Purchase Order" refresh="false" tabsValues="Device,Purchase Order" value="<%=curTab%>">
	<liferay-ui:section>
		<aui:button-row>
			<aui:button value="Add" name="add_device"/>
			<aui:button value="Delete Selected" name="delete_selected_device"/>
		</aui:button-row>
		<jsp:include page="search_container.jsp"/>
	</liferay-ui:section>
	<liferay-ui:section>
		<jsp:include page="purchase_order_list.jsp"/>
	</liferay-ui:section>
</liferay-ui:tabs>

<script>
	function popupEdit(title, deviceId) {
		Liferay.Util.openWindow({
			dialog: {
				centered: true,
				height: 800,
				modal: true,
				width: 600
			},
			id: '<portlet:namespace/>dialog',
			title: title,
			uri: '<%=edit %>'
		});
	}

	Liferay.provide(window, '<portlet:namespace/>closeEdit',
			function(data, dialogId) {
				var dialog = Liferay.Util.Window.getById(dialogId);
				dialog.destroy();
				Liferay.Portlet.refresh('#p_p_id<portlet:namespace/>', data);
			},
			['liferay-util-window']
	);

	AUI().use('aui-base', 'aui-io-request', 'liferay-util-list-fields', 'liferay-util-window', function(A) {
		A.one('#<portlet:namespace />add_device').on('click', function(event) {
			popupEdit('New Device');
		});

		var deleteDevicesButton = A.one("#<portlet:namespace />delete_selected_device");

		deleteDevicesButton.on("click", function(event) {
			event.preventDefault();
			if (confirm('Delete Selected Device (s) ?')) {
				var selectedDevices = Liferay.Util.listCheckedExcept(document.<portlet:namespace />deviceSearchForm, '<portlet:namespace />allRowIds');
				A.io.request('<%= deleteActionURL %>', {
					method : 'POST',
					data: {<portlet:namespace />device_id_list: selectedDevices},
					on : {
						success : function(data) {
							jQuery("#delete_device_success").css('display', 'block');
							jQuery("#delete_device_success").html('<span>Delete Selected Success</span>');
							Liferay.Portlet.refresh("#p_p_id<portlet:namespace />");
						},
						failure : function(data) {
							console.log(data);
						}
					}
				});
			}
		});
	});

</script>

