<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet_2_0" %>
<%@ taglib prefix="liferay-theme" uri="http://java.sun.com/portlet_2_0" %>
<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<portlet:resourceURL id="upload_device_list_file" var="saveURL" />

<liferay-ui:success key="save_purchase_order_success" message="Purchase Order ${poSaved.purchaseOrderNumber} saved successfully!" />
<liferay-ui:error key="edit_purchase_order_error" message="Error edit purchase order" />

<aui:form name="upload_device_file" action="<%=saveURL %>" enctype="multipart/form-data">
    <aui:input name="purchaseOrderId" type="hidden" value="${po.purchaseOrderId}"/>
    <aui:fieldset>
        <aui:input name="purchaseOrderNumber" type="text" value="${po.purchaseOrderNumber}" label="Purchase Order Number"/>
        <aui:input name="customerCode" type="text" value="${po.customerCode}" label="Customer Code"/>
        <label>Sign Date</label>
        <input type="text" id="signDate" name="<portlet:namespace/>signDate" value="${po.signDateFormatted}"/>
        <label>Warranty Start Date</label>
        <input type="text" id="warrantyStartDate" name="<portlet:namespace/>warrantyStartDate" value="${po.warrantyStartDateFormatted}"/>
        <label>Warranty End Date</label>
        <input type="text" id="warrantyEndDate" name="<portlet:namespace/>warrantyEndDate" value="${po.warrantyEndDateFormatted}"/>

        <aui:input type="file" name="deviceListFile" label="Device List File">
            <aui:validator name="acceptFiles">
                'xlsx, xls'
            </aui:validator>
        </aui:input>
        <aui:button-row>
            <aui:button type="reset" value="Clear"></aui:button>
            <aui:button type="submit" name="btnUploadFile" value="Save"></aui:button>
            <aui:button type="button" name="close" value="Close"></aui:button>
        </aui:button-row>
    </aui:fieldset>
</aui:form>
<script>
    jQuery(document).ready(function() {
        var signDate = new Pikaday({field: $('#signDate')[0], format: 'MM/DD/YYYY'});
        var warrantyStartDate = new Pikaday({field: $('#warrantyStartDate')[0], format: 'MM/DD/YYYY'});
        var warrantyEndDate = new Pikaday({field: $('#warrantyEndDate')[0], format: 'MM/DD/YYYY'});
    });

    AUI().use('aui-base', function (A) {
        A.one('#<portlet:namespace />close').on('click', function(event) {
            var data = {};
            Liferay.Util.getOpener().<portlet:namespace/>closeEdit(data, '<portlet:namespace/>close_edit_purchase_order_dialog');
        });
    });
</script>
