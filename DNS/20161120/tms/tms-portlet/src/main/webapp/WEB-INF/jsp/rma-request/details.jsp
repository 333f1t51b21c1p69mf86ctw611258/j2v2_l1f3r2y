<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<portlet:actionURL var="submitRmaRequestURL">
    <portlet:param name="action" value="submit"/>
</portlet:actionURL>
<portlet:renderURL var="viewRmaRequestListURL">
    
</portlet:renderURL>
<portlet:resourceURL id="download_excel" var="downloadExcelURL" />

<h3>RMA Request Details </h3>
<aui:button-row>
    <aui:button value="Back" name="view_rma_request_list" onClick="<%= viewRmaRequestListURL %>"/>
    <aui:button value="Submit" name="submit_rma_request"/>
    <aui:button value="Download Excel" name="download_excel"/>
</aui:button-row>

<script>
    AUI().use('aui-base', 'aui-io-request', 'liferay-util-list-fields', 'liferay-util-window', function(A) {
        A.one('#<portlet:namespace />submit_rma_request').on('click', function(event) {
            jQuery.ajax({
                type: "POST",
                url: "<%=submitRmaRequestURL.toString()%>",
                data: {rma_request_id: id},
                complete: function (response) {
                    console.log("Submit success.");
                }
            });
        });

        A.one('#<portlet:namespace />download_excel').on('click', function(event) {
            window.location ='${downloadExcelURL}' + '&rma_request_id=${rmaRequest.rmaRequestId}';
        });
    });
</script>

<table>
    <tbody>
        <tr>
            <td>RMA Request Number</td>
            <td colspan="3">${rmaRequest.rmaRequestNumber}</td>
        </tr>
        <tr>
            <td>Customer Code</td>
            <td>${rmaRequest.cusCode}</td>
            <td>Contact Point</td>
            <td>${rmaRequest.cusInCharge}</td>
            <td>Email</td>
            <td>${rmaRequest.cusEmail}</td>
        </tr>
        <tr>
            <td>Phone</td>
            <td>${rmaRequest.cusPhone}</td>
            <td>Location</td>
            <td>${rmaRequest.cusLocation}</td>
            <td>Person In Charge</td>
            <td>${rmaRequest.provInCharge}</td>
        </tr>
        <tr>
            <td>Assign Date</td>
            <td>${rmaRequest.creatingAssignedDate}</td>
            <td>Estimated Return Date</td>
            <td>${rmaRequest.creatingEstReturnDate}</td>
        </tr>
        <tr>
            <td>Note</td>
            <td>${rmaRequest.creatingNote}</td>
        </tr>
    </tbody>
</table>
<h4>Device List</h4>

<table>
    <thead>
        <tr>
            <th>Serial Number</th>
            <th>Note</th>
            <th>Status</th>
            <th>Actions</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${rmaRequest.rmaRequestDeviceVOList}" var="rmaRequestDevice">
            <tr>
                <td>${rmaRequestDevice.device.serialNumber}</td>
                <td>${rmaRequestDevice.faultNote}</td>
                <td>${rmaRequestDevice.status}</td>
                <td></td>
            </tr>
        </c:forEach>
    </tbody>
</table>