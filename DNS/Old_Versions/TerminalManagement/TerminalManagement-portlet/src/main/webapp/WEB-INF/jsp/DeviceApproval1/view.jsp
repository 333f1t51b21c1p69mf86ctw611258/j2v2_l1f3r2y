<%--
/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>

<%@ page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<style type="text/css">
.data, .data td {
	border-collapse: collapse;
	width: 100%;
	border: 1px solid #aaa;
	margin: 2px;
	padding: 2px;
}

.data th {
	font-weight: bold;
	background-color: #5C82FF;
	color: white;
}
</style>

<h2>Contact Manager</h2>

<portlet:actionURL var="deleteContactURL">
	<portlet:param name="action" value="delete"></portlet:param>
</portlet:actionURL>

<portlet:renderURL var="renderOneMethodURL">
	<portlet:param name="action" value="renderOne" />
</portlet:renderURL>


This is the
<b>DeviceApproval1</b>
portlet.
<br />

<c:out escapeXml="true" value="${releaseInfo}" />
.

<h3>Contacts</h3>

<c:if test="${!empty contactList}">
	<table class="data">
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Telephone</th>
			<th>#</th>
		</tr>
		<c:forEach items="${contactList}" var="contact">
			<tr>
				<td>${contact.lastname},${contact.firstname}</td>
				<td>${contact.email}</td>
				<td>${contact.telephone}</td>

				<td><a
					href="${renderOneMethodURL}&<portlet:namespace/>contactId=${contact.id}">delete</a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>