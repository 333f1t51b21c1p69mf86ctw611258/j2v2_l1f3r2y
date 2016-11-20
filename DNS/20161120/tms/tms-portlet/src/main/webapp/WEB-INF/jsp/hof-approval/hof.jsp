<%@page import="com.liferay.portal.kernel.servlet.SessionErrors"%>
<%@page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@ include file="init.jsp"%>
<portlet:actionURL var="submitHandOverForm" windowState="<%=LiferayWindowState.NORMAL.toString()%>" name="submitHandOverForm">
</portlet:actionURL>
<a href="<portlet:renderURL />">&laquo;Home</a>
<div class="separator"></div>
<fieldset>
	<legend>HandOverForm Form</legend>
	<c:if test='<%=SessionMessages.contains(renderRequest.getPortletSession(), "hof-submit-success")%>'>
		<liferay-ui:success key="hof-submit-success" message="HandOverForm has been submited successfully." />
	</c:if>
	<c:if test='<%=SessionMessages.contains(renderRequest.getPortletSession(), "workflow-not-enabled")%>'>
		<liferay-ui:success key="workflow-not-enabled" message="HandOverForm not enabled with workflow please enable workflow." />
	</c:if>
	<c:if test='<%=SessionErrors.contains(renderRequest.getPortletSession(), "hof-submit-failed")%>'>
		<liferay-ui:success key="hof-submit-failed" message="There is problem of submit hof please try again.." />
	</c:if>
	<aui:form action="<%=submitHandOverForm%>" method="post" name="hofForm">
		<aui:layout>
			<aui:column>
				<aui:input label="HandOverForm Subject" name="hofSubject" id="hofSubject" type="text" style="width:600px;height:20px;">
					<aui:validator name="required" />
				</aui:input>
			</aui:column>
		</aui:layout>

		<aui:layout>
			<aui:input name="hofMessage" id="hofMessage" label="HandOverForm Message" type="textarea" style="width:600px;height:100px;">
				<aui:validator name="required" />
			</aui:input>
			<span style="float: left;">Characters Left&nbsp;</span>
			<p id="<portlet:namespace/>textCounter"></p>
		</aui:layout>
		<aui:layout>
			<aui:column>
			&nbsp;
		</aui:column>
		</aui:layout>
		<aui:layout>
			<aui:column>
				<aui:button type="submit" value="Submit HandOverForm" name="submit"></aui:button>
			</aui:column>
		</aui:layout>
	</aui:form>
</fieldset>
<aui:script>
	AUI().use('aui-char-counter', function(A) {
		new A.CharCounter({
			counter : '#<portlet:namespace/>textCounter',
			input : '#<portlet:namespace/>hofMessage',
			maxLength : 75,
			on : {
				maxLength : function(event) {
					alert('The max length limit was reached');
				}
			}
		});
	});
</aui:script>
	


