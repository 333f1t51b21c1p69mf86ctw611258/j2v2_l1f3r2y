<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:actionURL var="checkDeviceURL">
	<portlet:param name="action" value="checkDevice"></portlet:param>
</portlet:actionURL>

<h3>Device Information To Check</h3>

<form:form name="device" modelAttribute="device" method="post" action="${checkDeviceURL}" >
	<table>
		<tr>
			<td><form:label path="serialNumber"><spring:message code="label.serialNumber"/></form:label></td>
			<td><form:input path="serialNumber" /></td>
			<td style="width: 10px;" />
			<td><form:label path="macAddress"><spring:message code="label.macAddress"/></form:label></td>
			<td><form:input path="macAddress" /></td>
		</tr>
		<tr>
			<td colspan="5">
				<div style="float: right;">
					<input type="submit" value="<spring:message code="label.addcontact"/>"/>
				</div>
			</td>
		</tr>
	</table>	
</form:form>

<h3>Results</h3>

<c:if test="${!empty deviceList}">
	<table class="table">
		<thead>
			<tr>
				<th>Model Name</th>
				<th>Serial Number</th>
				<th>MAC Address</th>
				<th>Factory Out</th>
				<th>Warranty Start Date</th>
				<th>Warranty End Date</th>
				<!-- <th>#</th> -->
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${deviceList}" var="device">
				<tr>
					<td>${device.modelName}</td>
					<td>${device.serialNumber}</td>
					<td>${device.macAddress}</td>
					<td>${device.factoryOut}</td>
					<td>${device.warrantyStartDate}</td>
					<td>${device.warrantyEndDate}</td>
					<%-- <td><a href="${viewDeviceURL}&deviceId=${device.deviceId}">view</a></td> --%>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</c:if>
