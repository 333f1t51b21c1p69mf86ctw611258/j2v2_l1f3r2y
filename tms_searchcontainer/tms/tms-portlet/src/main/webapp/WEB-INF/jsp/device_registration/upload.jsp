<%@ page import="javax.portlet.ActionRequest" %>
<%@ page import="javax.portlet.PortletURL" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet_2_0" %>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<aui:form name="upload_device_file" enctype="multipart/form-data">
	<aui:fieldset>
		<table>
			<tr>
				<td><aui:input name="purchaseOrder" type="text" value="${po.purchaseOrder}" label="Purchase Order"/></td>
				<td><label>
					Sign Date
					<liferay-ui:input-date nullable="true" name="signDate">${po.signDate}</liferay-ui:input-date>
				</label></td>
			</tr>
			<tr>
				<td><label>
					Warranty Start Date
					<liferay-ui:input-date nullable="true" name="warrantyStartDate">${po.warrantyStartDate}</liferay-ui:input-date>
				</label></td>
				<td><label>
					Warranty End Date
					<liferay-ui:input-date name="warrantyEndDate" nullable="true" >${po.warrantyEndDate}</liferay-ui:input-date>
				</label></td>
			</tr>
			<tr>
				<td><aui:input type="file" name="deviceListFile" label="Device File">
					<aui:validator name="acceptFiles">
						'xlsx, xls'
					</aui:validator>
				</aui:input></td>
				<td><aui:button type="button" name="btnUploadFile" value="Upload File"></aui:button></td>
			</tr>
		</table>
	</aui:fieldset>
</aui:form>

<aui:script>
	AUI().use('aui-base', 'aui-io-request', function(A) {
		var btnUploadFile = A.one("#<portlet:namespace />btnUploadFile");
		btnUploadFile.on("click", function(event) {
			event.preventDefault();
			var form = A.one("#<portlet:namespace/>upload_device_file");
			var ajaxURL = "<portlet:resourceURL id='UPLOAD_FILE'/>";
			var file = A.one("#<portlet:namespace/>device_file");
			var configs = {
				method : 'POST',
				form : {
					id : form,
					upload : true
				},
				sync : true,
				on : {
					complete : function() {
						console.log("File Upload Complete!");
					}
				}
			};

			A.io.request(ajaxURL, configs);
		});
	});
</aui:script>