<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ page import="com.dasannetworks.vn.sb.service.DeviceLocalServiceUtil" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<%
	PortletURL homeURL = renderResponse.createRenderURL();
	PortletURL searchActionURL = renderResponse.createActionURL();
	searchActionURL.setParameter(ActionRequest.ACTION_NAME, "search");

	String curTab = ParamUtil.getString(request, "curTab", "search"); //set the default tab
	request.setAttribute("curTab", curTab);
%>
<liferay-ui:tabs names="Device,Up Load Purchase Order" refresh="false" tabsValues="Device,Up Load Purchase Order" value="Device">
	<liferay-ui:section>
		<jsp:include page="search_container.jsp"/>
	</liferay-ui:section>
	<liferay-ui:section>
		<jsp:include page="upload.jsp"/>
	</liferay-ui:section>
</liferay-ui:tabs>

