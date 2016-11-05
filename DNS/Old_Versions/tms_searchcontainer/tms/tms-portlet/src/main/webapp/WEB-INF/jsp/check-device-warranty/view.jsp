<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.dasannetworks.vn.sb.service.DeviceLocalServiceUtil" %>

<%@page import="com.liferay.portal.kernel.dao.search.RowChecker"%>
<%@ page import="com.dasannetworks.vn.sb.service.DeviceLocalServiceUtil" %>
<%@ page import="com.liferay.portal.kernel.dao.search.DisplayTerms" %>
<%@ page import="com.dasannetworks.vn.tms.service.DeviceSearchInput" %>
<%@ page import="com.liferay.portal.kernel.portlet.LiferayWindowState" %>
<%@ page import="com.liferay.portal.theme.PortletDisplay" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ page import="com.liferay.portal.theme.ThemeDisplay" %>
<%@ page import="com.dasannetworks.vn.tms.util.DateFormatUtil" %>

<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui"%>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<portlet:actionURL var="checkDeviceURL">
	<portlet:param name="action" value="checkDevice"></portlet:param>
</portlet:actionURL>

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

<aui:form method="POST" action="<%= checkDeviceURL %>" name="frmFilterDetail" id="frmFilterDetail">
	<table>
		<tr>
			<td>
				<aui:input type="text" name="serialNumber" value="${device.serialNumber}" label="Serial Number" />	
			</td>
			<td>
				<aui:input type="text" name="macAddress" value="${device.macAddress}" label="MAC Address" />
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<div style="float: right;">
					<aui:button value="Check" name="check" type="submit"></aui:button>	
				</div>
			</td>
		</tr>
	</table>
</aui:form>


<h3>Device List</h3>

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


<c:if test="${!empty deviceList}">
	<table class="table">
		<thead>
			<tr>
				<th>Serial Number</th>
				<th>MAC Address</th>
				<th>Factory Out</th>
				<th>Warranty Start Date</th>
				<th>Warranty End Date</th>
				<!-- <th>#</th> -->
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${deviceList}" var="device">
				<tr>
					<td>${device.serialNumber}</td>
					<td>${device.macAddress}</td>
					<td>${device.factoryOut}</td>
					<td>${device.warrantyStartDate}</td>
					<td>${device.warrantyEndDate}</td>
					<%-- <td><a href="${viewDeviceURL}&deviceId=${device.deviceId}">view</a></td> --%>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</c:if>

</body>
</html>
