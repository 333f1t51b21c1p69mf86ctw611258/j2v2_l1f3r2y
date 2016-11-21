<%@page import="com.dasannetworks.vn.sb.model.HandOverForm"%>
<%@page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@ include file="init.jsp"%>
<%
	HandOverForm hof = null;
	if (request.getAttribute("feedBackObject") != null)
		hof = (HandOverForm) request.getAttribute("feedBackObject");
%>
<c:if test='<%=hof != null%>'>
	<h2><%=hof.getHandOverFormSubject()%></h2>
	<br />
Message:
<div>
		<%=hof.getHandOverFormText()%>
	</div>
</c:if>