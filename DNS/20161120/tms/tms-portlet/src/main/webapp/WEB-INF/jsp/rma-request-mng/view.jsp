<%@page import="org.springframework.util.StringUtils"%>
<%@include file="init.jsp"%>

<portlet:renderURL var="renderURL_newRmaRequest_ForCreating">
	<portlet:param name="render" value="newRmaRequest_ForCreating" />
	<portlet:param name="backURL" value="<%= themeDisplay.getURLCurrent() %>"></portlet:param>
</portlet:renderURL>

<portlet:renderURL var="tabURL"/>

<liferay-ui:success key="send_rma_request_success" message="We send RMA Request successfully!" />
<liferay-ui:error key="send_rma_request_error" message="Sorry, an error prevented sending RMA Request!" />

<liferay-ui:success key="receive_rma_request_success" message="We receive RMA Request successfully!" />
<liferay-ui:error key="receive_rma_request_error" message="Sorry, an error prevented receiving RMA Request!" />

<liferay-ui:success key="return_rma_request_success" message="We return RMA Request successfully!" />
<liferay-ui:error key="return_rma_request_error" message="Sorry, an error prevented returning RMA Request!" />

<div style="clear: both;">
	<p class="pull-left">
		<a href="${renderURL_newRmaRequest_ForCreating}" class="btn btn-primary"> <i class="icon-plus"></i> <spring:message code="label.createRmaRequest" /></a>
	</p>
</div>

<div id="divTab" style="clear: both;">
	
	<%
	    String tab = ParamUtil.getString(request, "selectedTab", "Created RMA Requests");
	%>

	<liferay-ui:tabs names="Created RMA Requests,Sent RMA Requests,Received From Partners,Returned To Customers" url="<%=tabURL.toString()%>" param="selectedTab" >
		<c:if test='<%= tab.equalsIgnoreCase("Created RMA Requests")%>' >      
	        <liferay-util:include page="/WEB-INF/jsp/rma-request-mng/dt_created.jsp" servletContext="<%=application%>" />
	    </c:if>
	     
	    <c:if test='<%= tab.equalsIgnoreCase("Sent RMA Requests")%>' >     
	        <liferay-util:include page="/WEB-INF/jsp/rma-request-mng/dt_sent.jsp" servletContext="<%=application%>" />
	    </c:if>
	     
	    <c:if test='<%= tab.equalsIgnoreCase("Received From Partners")%>' >     
	        <liferay-util:include page="/WEB-INF/jsp/rma-request-mng/dt_received.jsp" servletContext="<%=application%>" />
	    </c:if>
	    
	    <c:if test='<%= tab.equalsIgnoreCase("Returned To Customers")%>' >     
	        <liferay-util:include page="/WEB-INF/jsp/rma-request-mng/dt_received.jsp" servletContext="<%=application%>" />
	    </c:if>
	</liferay-ui:tabs>
</div>
