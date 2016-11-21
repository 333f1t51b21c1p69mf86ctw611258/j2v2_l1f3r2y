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
    <aui:input name="deviceId" type="hidden" value="${device.deviceId}"></aui:input>
    <aui:fieldset label="Device Information">
        <aui:input type="text" name="modelName" label="Product Name" value="${device.modelName}"/>
        <aui:input type="text" name="partNumber" label="Part Number" value="${device.partNumber}"/>
        <aui:input type="text" name="serialNumber" label="Serial Number" value="${device.serialNumber}">
            <aui:validator name="required"/>
        </aui:input>
        <aui:input type="text" name="macAddress" label="Mac Address" value="${device.macAddress}"/>
        <aui:input type="text" name="manufacturerSerial" label="Manufacturer Serial" value="${device.manufacturerSerial}">
            <aui:validator name="required"/>
        </aui:input>
        <label>Warranty Start Date</label>
        <input type="text" id="warrantyStartDate" name="<portlet:namespace/>warrantyStartDate" value="${device.warrantyStartDateFormatted}"/>

        <label>Warranty End Date</label>
        <input type="text" id="warrantyEndDate" name="<portlet:namespace/>warrantyEndDate" value="${device.warrantyEndDateFormatted}"/>

        <aui:button-row>
            <aui:button value="Clear" type="reset"></aui:button>
            <aui:button value="Save" name="save" type="submit"></aui:button>
            <aui:button value="Close" name="close"></aui:button>
        </aui:button-row>
    </aui:fieldset>
</aui:form>

<script>
    jQuery(document).ready(function() {
        var warrantyStartDate = new Pikaday({field: $('#warrantyStartDate')[0], format: 'MM/DD/YYYY'});
        var warrantyEndDate = new Pikaday({field: $('#warrantyEndDate')[0], format: 'MM/DD/YYYY'});
    });

    AUI().use('aui-base', function (A) {
        A.one('#<portlet:namespace />close').on('click', function(event) {
            var data = {};
            Liferay.Util.getOpener().<portlet:namespace/>closeEdit(data, '<portlet:namespace/>dialog');
        });
    });
</script>
