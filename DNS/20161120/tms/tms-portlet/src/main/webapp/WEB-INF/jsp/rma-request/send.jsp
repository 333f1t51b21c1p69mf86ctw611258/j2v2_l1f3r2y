<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet_2_0" %>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib prefix="liferay-theme" uri="http://liferay.com/tld/theme" %>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<portlet:actionURL var="saveRmaRequestURL">
    <portlet:param name="action" value="save"/>
</portlet:actionURL>



<aui:form name="rmaRequest" modelAttribute="rmaRequest" method="post" enctype="multipart/form-data"
          action="${saveRmaRequestURL}">
    <aui:fieldset>
        <aui:input type="hidden" name="rmaRequestId" value="${rmaRequest.rmaRequestId}"/>
        <aui:input name="rmaRequestNumber" label="Hand Over Form Number" value="${rmaRequest.rmaRequestNumber}">
            <aui:validator name="required"/>
        </aui:input>
        <aui:input name="cusCode" label="Customer Code" value="${rmaRequest.cusCode}" />
        <aui:input name="cusInCharge" label="Customer In Charge" value="${rmaRequest.cusInCharge}" />
        <aui:input name="cusEmail" label="Email" value="${rmaRequest.cusEmail}">
            <aui:validator name="email" />
        </aui:input>
        <aui:input name="cusPhone" label="Phone" value="${rmaRequest.cusPhone}"/>
        <aui:input name="cusLocation" label="Location" value="${rmaRequest.cusLocation}"/>
        <aui:input name="provInCharge" label="Person In Charge" value="${rmaRequest.provInCharge}"/>
        <label> Assign Date</label>
        <input type="text" name="creatingAssignedDate" id="creatingAssignedDate" value="${rmaRequest.creatingAssignedDate}"/>

        <label>Estimated Return Date</label>
        <input type="text" name="creatingEstReturnDate" id="creatingEstReturnDate" value="${rmaRequest.creatingEstReturnDate}"/>

        <aui:input type="textarea" name="creatingNote" value="${rmaRequest.creatingNote}" />
        <aui:input type="file" name="deviceListFile" label="Device List File">
            <aui:validator name="acceptFiles">
                'xlsx, xls'
            </aui:validator>
        </aui:input>
        <aui:button-row>
            <aui:button label="Reset" type="reset"/>
            <aui:button label="Save" type="submit"/>
            <aui:button label="Close" type="button"/>
        </aui:button-row>
    </aui:fieldset>
</aui:form>

<script>
    jQuery(document).ready(function() {
        var creatingAssignedDate = new Pikaday({field: jQuery('#creatingAssignedDate')[0], format: 'MM/DD/YYYY'});
        var creatingEstReturnDate = new Pikaday({field: jQuery('#creatingEstReturnDate')[0], format: 'MM/DD/YYYY'});
    });
    AUI().use('aui-base', function (A) {
        A.one('#<portlet:namespace />close').on('click', function(event) {
            var data = {};
            Liferay.Util.getOpener().<portlet:namespace/>closeEdit(data, '<portlet:namespace/>dialog');
        });
    });
</script>