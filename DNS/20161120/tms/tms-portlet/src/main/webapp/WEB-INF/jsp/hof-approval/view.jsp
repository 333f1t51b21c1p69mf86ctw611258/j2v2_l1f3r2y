<%@ include file="init.jsp"%>
<%
	String tabs1 = ParamUtil.getString(request, "tabs1", "Aproved HandOverForm");
	PortletURL portletURL = renderResponse.createRenderURL();
	portletURL.setParameter("tabs1", tabs1);
%>

<portlet:renderURL var="addFeedBackURL">
	<portlet:param name="mvcPath" value="/WEB-INF/jsp/hof-approval/hof.jsp" />
</portlet:renderURL>

<h4>Kaleo workflow for custom Assets</h4>
<a href="<%=addFeedBackURL%>" style="font-weight: bold; font-size: 18px;">Add New FeedBack</a>

<br />
<br />

<liferay-ui:tabs names="Aproved HandOverForm,Pending HandOverForm" portletURL="<%=portletURL%>" />

<c:choose>
	<c:when test='<%=tabs1.equals("Pending HandOverForm")%>'>
		<liferay-util:include page="/WEB-INF/jsp/hof-approval/view_pending_hof.jsp" servletContext="<%=application%>" />
	</c:when>

	<c:otherwise>
		<liferay-util:include page="/WEB-INF/jsp/hof-approval/view_approved_hof.jsp" servletContext="<%=application%>" />
	</c:otherwise>
</c:choose>