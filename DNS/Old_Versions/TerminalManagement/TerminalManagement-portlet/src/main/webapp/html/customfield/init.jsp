<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %> 
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@page import="com.liferay.portlet.expando.model.ExpandoBridge"%>
<%@page import="com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil"%>
<%@page import="com.dasannetworks.tms.sb.model.impl.BookImpl"%>
<%@page import="com.dasannetworks.tms.sb.model.Book"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Collections"%>
<%@page import="com.dasannetworks.tms.customfield.util.WebKeys"%>
<%@page import="com.dasannetworks.tms.sb.model.Book"%>
<%@page import="com.dasannetworks.tms.sb.service.BookLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>


<portlet:defineObjects />
<theme:defineObjects/>