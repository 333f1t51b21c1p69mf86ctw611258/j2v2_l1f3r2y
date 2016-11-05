<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet_2_0" %>
<%@ taglib prefix="liferay-portlet" uri="http://liferay.com/tld/portlet" %>
<%@ taglib prefix="aui" uri="http://alloy.liferay.com/tld/aui" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<portlet:defineObjects />
<liferay-theme:defineObjects />
<portlet:actionURL var="saveURL">
	<portlet:param name="action" value="save"/>
</portlet:actionURL>

<liferay-ui:success key="save_success" message="Device Serial Number ${device.serialNumber} saved successfully!" />

<aui:form method="POST" action="<%=saveURL %>" name="addItemForm" id="addItemForm">
    <aui:input name="device_id" type="hidden" value="${device.deviceId}"></aui:input>
        <aui:fieldset>
            <aui:input type="text" name="model_name" value="${device.modelName}">
                <aui:validator name="required"/>
            </aui:input>
            <aui:input type="text" name="serial_number" value="${device.serialNumber }"></aui:input>
        </aui:fieldset>
        <aui:fieldset>
        	<aui:button-row>
            	<aui:button value="Clear" type="reset"></aui:button>
            	<aui:button value="Save" name="save" type="submit"></aui:button>
            	<aui:button value="Save & Close" name="saveAndClose"></aui:button>
            	<aui:button value="Close" name="close"></aui:button>
        	</aui:button-row>
        </aui:fieldset>
</aui:form>

<aui:script>
    AUI().use('aui-base',
            function(A) {
                A.one('#<portlet:namespace />close').on('click', function(event) {
                	var data = {};
                	Liferay.Util.getOpener().<portlet:namespace/>closeEdit(data, '<portlet:namespace/>dialog');

                });

                A.one('#<portlet:namespace />saveAndClose').on('click', function(event) {


                });


            });
</aui:script>


