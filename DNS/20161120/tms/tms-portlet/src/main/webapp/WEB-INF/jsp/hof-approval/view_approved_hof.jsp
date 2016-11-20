<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.dasannetworks.vn.sb.model.HandOverForm"%>
<%@page import="com.dasannetworks.vn.sb.service.HandOverFormLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.workflow.WorkflowConstants"%>
<%@page import="javax.portlet.PortletURL"%>

<%@ include file="init.jsp"%>

<liferay-portlet:renderURL varImpl="iteratorURL">
	<portlet:param name="mvcPath" value="/WEB-INF/jsp/hof-approval/view_approved_hof.jsp" />
</liferay-portlet:renderURL>

<liferay-ui:search-container emptyResultsMessage="there-are-no-students" headerNames="HandOverForm Subject,Message, Status" iteratorURL="<%=iteratorURL%>" delta="10" deltaConfigurable="true">
	<liferay-ui:search-container-results>
		<%
			List<HandOverForm> handOverFormList = HandOverFormLocalServiceUtil.findByG_S(themeDisplay.getScopeGroupId(), WorkflowConstants.STATUS_APPROVED);
					results = ListUtil.subList(handOverFormList, searchContainer.getStart(), searchContainer.getEnd());
					searchContainer.setTotal(handOverFormList.size());
					searchContainer.setResults(results);
		%>
	</liferay-ui:search-container-results>
	<liferay-ui:search-container-row className="HandOverForm" keyProperty="handOverFormId" modelVar="currentHandOverForm">
		<liferay-ui:search-container-column-text name="HandOverForm Subject" property="handOverFormSubject" />
		<liferay-ui:search-container-column-text name="Message" property="handOverFormText" />
		<liferay-ui:search-container-column-text name="status"><%=WorkflowConstants.LABEL_APPROVED%></liferay-ui:search-container-column-text>
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
</liferay-ui:search-container>