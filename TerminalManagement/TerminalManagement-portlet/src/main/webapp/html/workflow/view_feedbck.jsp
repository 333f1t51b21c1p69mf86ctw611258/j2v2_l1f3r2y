<%@page import="com.dasannetworks.tms.model.impl.FeedbackBaseImpl"%>
<%@page import="com.dasannetworks.tms.service.FeedbackLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="com.dasannetworks.tms.model.Feedback"%>
<%@ include file="init.jsp"%>

<%
	Feedback feedback = null;
	if (request.getAttribute("feedBackObject") != null)
		feedback = (Feedback) request.getAttribute("feedBackObject");
%>

<c:if test='<%=feedback != null%>'>
	<h2><%=feedback.getFeedbackSubject()%></h2>	
	<br />
	Message:
	<div>
		<%=feedback.getFeedbackText()%>
	</div>
</c:if>