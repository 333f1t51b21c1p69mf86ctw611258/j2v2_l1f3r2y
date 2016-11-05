<%@page import="com.liferay.portal.kernel.dao.search.RowChecker"%>
<%@ page import="com.dasannetworks.vn.sb.service.DeviceLocalServiceUtil" %>
<%@ page import="com.liferay.portal.kernel.dao.search.DisplayTerms" %>
<%@ page import="com.dasannetworks.vn.tms.service.DeviceSearchInput" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.portlet.LiferayWindowState" %>
<%@ page import="com.liferay.portal.theme.PortletDisplay" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ page import="com.liferay.portal.theme.ThemeDisplay" %>
<%@ page import="com.dasannetworks.vn.tms.util.DateFormatUtil" %>

<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet_2_0" %>
<%@ taglib prefix="liferay-portlet" uri="http://liferay.com/tld/portlet" %>
<%@ taglib prefix="aui" uri="http://alloy.liferay.com/tld/aui" %>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<liferay-portlet:renderURL varImpl="deviceSearchURL">
    <portlet:param name="mvcPath" value="device_registration/search_container" />
</liferay-portlet:renderURL>
<%
    DeviceSearchInput searchInput = new DeviceSearchInput();
    searchInput.setSerialNumber(ParamUtil.getString(request, "serialNumber"));
    searchInput.setProductName(ParamUtil.getString(request, "productName"));
    searchInput.setMacAddress(ParamUtil.getString(request, "macAddress"));
    searchInput.setManufacturerSerial(ParamUtil.getString(request, "manufacturerSerial"));
    searchInput.setPartNumber(ParamUtil.getString(request, "partNumber"));
%>
<liferay-portlet:renderURL varImpl="edit" windowState="<%=LiferayWindowState.POP_UP.toString()%>">
	<portlet:param name="render" value="edit"/>
</liferay-portlet:renderURL>

<liferay-ui:success key="delete_success" message="Device Serial Number ${device.serialNumber} deleted successfully!" />

<aui:button-row>
    <aui:button value="Add" name="add_device"/>
    <aui:button value="Delete Selected" name="delete_selected_device"/>
</aui:button-row>
<aui:script>
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
	AUI().use('aui-base',
			'liferay-util-window',
			function(A) {
				A.one('#<portlet:namespace />add_device').on('click', function(event) {
					popupEdit('New Device');
				});


			});

	Liferay.provide(
			window,
			'<portlet:namespace/>closeEdit',
			function(data, dialogId) {
				var A = AUI();
				// Closing the dialog
				var dialog = Liferay.Util.Window.getById(dialogId);
				dialog.destroy();
				//refresh search portlet
				var data = {'render':null};
            	Liferay.Portlet.refresh('#p_p_id<portlet:namespace/>', data);
			},
			['liferay-util-window']
		);

</aui:script>

<aui:form action="<%=deviceSearchURL %>" method="get" name="deviceSearchForm">
    <liferay-portlet:renderURLParams varImpl="deviceSearchURL" />
    <liferay-portlet:renderURL varImpl="iteratorURL">
        <portlet:param name="serialNumber" value="<%= searchInput.getSerialNumber() %>" />
        <portlet:param name="productName" value="<%= searchInput.getProductName() %>" />
        <portlet:param name="partNumber" value="<%= searchInput.getPartNumber() %>" />
        <portlet:param name="macAddress" value="<%= searchInput.getMacAddress() %>" />
        <portlet:param name="manufacturerSerial" value="<%= searchInput.getManufacturerSerial() %>" />
        <portlet:param name="mvcPath" value="device_registration/search_container" />
    </liferay-portlet:renderURL>

    <liferay-ui:search-container
        displayTerms="<%= new DisplayTerms(liferayPortletRequest)%>"
        rowChecker="<%= new RowChecker(renderResponse) %>"
        iteratorURL="<%= iteratorURL %>"

        headerNames="productName,partNumber,serialNumber,macAddress"
        delta="10"
        emptyResultsMessage="No Device Were Found 23333">

    	<liferay-ui:search-form
            page="/WEB-INF/jsp/device_registration/search_toggle.jsp"
            servletContext="<%= application %>"/>

        <liferay-ui:search-container-results>
        <%
            DisplayTerms displayTerms = searchContainer.getDisplayTerms();

            searchInput.setStart(searchContainer.getStart());
            searchInput.setEnd(searchContainer.getEnd());
            searchInput.setAndSearchCondition(displayTerms.isAndOperator());
            searchInput.advanceSearch(displayTerms.isAdvancedSearch(), displayTerms.getKeywords());
            total = Math.toIntExact(DeviceLocalServiceUtil.searchCount(searchInput));
            results = DeviceLocalServiceUtil.search(searchInput);

            searchContainer.setTotal(total);
            searchContainer.setResults(results);
        %>
        </liferay-ui:search-container-results>

        <liferay-ui:search-container-row
            className="com.dasannetworks.vn.sb.model.Device"
            keyProperty="deviceId"
            modelVar="device">

            <liferay-ui:search-container-column-text name="Factory Out" value="<%= DateFormatUtil.format(device.getFactoryOut()) %>" />
            <liferay-ui:search-container-column-text name="Product Name" value="<%= device.getModelName() %>" />
            <liferay-ui:search-container-column-text name="Part Number" value="<%= device.getPartNumber() %>" />
            <liferay-ui:search-container-column-text name="Serial Number" value="<%= device.getSerialNumber() %>" />
            <liferay-ui:search-container-column-text name="Mac Address" value="<%= device.getMacAddress() %>" />
            <%--<liferay-ui:search-container-column-text name="Carton Box Serial" value="<%= device.getSerialNumber() %>" />--%>
            <liferay-ui:search-container-column-text name="Manufacturer Serial" value="<%= device.getManufacturerSerial() %>" />
            <liferay-ui:search-container-column-text name="End Date" value="<%= DateFormatUtil.format(device.getWarrantyEndDate()) %>" />
            <liferay-ui:search-container-column-jsp name="Actions" path="/WEB-INF/jsp/device_registration/action_button.jsp" />

        </liferay-ui:search-container-row>
        <liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
    </liferay-ui:search-container>
</aui:form>