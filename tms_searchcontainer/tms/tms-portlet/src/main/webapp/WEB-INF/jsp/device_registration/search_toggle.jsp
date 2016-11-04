<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>
<%@ page import="com.liferay.portal.kernel.dao.search.SearchContainer" %>
<%@ page import="com.liferay.portal.kernel.dao.search.DisplayTerms" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>

<%
    SearchContainer searchContainer = (SearchContainer)request.getAttribute("liferay-ui:search:searchContainer");
    DisplayTerms displayTerms = searchContainer.getDisplayTerms();
    String serialNumber = ParamUtil.getString(request, "serialNumber");
    String productName = ParamUtil.getString(request, "productName");
    String partNumber = ParamUtil.getString(request, "partNumber");
    String macAddress = ParamUtil.getString(request, "macAddress");
    String manufacturerSerial = ParamUtil.getString(request, "manufacturerSerial");
%>

<liferay-ui:search-toggle
        buttonLabel="Device Search"
        displayTerms="<%= displayTerms %>"
        id="toggle_id_device_search">
    <aui:input label="Product Name" name="productName" value="<%= productName %>" />
    <aui:input label="Part Number" name="partNumber" value="<%= partNumber %>" />
    <aui:input label="Serial Number" name="serialNumber" value="<%= serialNumber %>" />
    <aui:input label="MAC Address" name="macAddress" value="<%= macAddress %>" />
    <aui:input label="Manufacturer Serial" name="manufacturerSerial" value="<%= manufacturerSerial %>" />
</liferay-ui:search-toggle>