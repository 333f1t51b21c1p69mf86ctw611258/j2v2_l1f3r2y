<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>
<%@ taglib prefix="liferay-portlet" uri="http://liferay.com/tld/portlet" %>
<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet_2_0" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="com.dasannetworks.vn.sb.model.Device" %>

    <%
         ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
         Device device = (Device) row.getObject();
     %>

<portlet:actionURL var="deleteDeviceURL" name="edit">
	<portlet:param name="action" value="delete"/>
    <portlet:param name="device_id" value="<%= String.valueOf(device.getDeviceId()) %>"/>
</portlet:actionURL>

<liferay-ui:icon-menu>
     <liferay-ui:icon image="edit" cssClass=".edit_device" message="EDIT" url="#" />
     <liferay-ui:icon image="delete" message="DELETE" url="<%= deleteDeviceURL.toString() %>" />
</liferay-ui:icon-menu>