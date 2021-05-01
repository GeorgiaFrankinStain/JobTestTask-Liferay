<%@ page import="com.liferay.docs.eventlisting.model.Worker" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.liferay.docs.eventlisting.service.WorkerLocalServiceUtil" %>
<%@ page import="com.liferay.portal.kernel.exception.SystemException" %><%--
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


<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib prefix="liferay-util" uri="http://liferay.com/tld/util" %>

<portlet:defineObjects />

<%
    ArrayList<Worker> entries = WorkerLocalServiceUtil.findAll();
    request.setAttribute("entries", entries);
%>

<liferay-util:include page="/views/simple_list_employees.jsp" servletContext="<%= application%>" />



<aui:button-row cssClass="guestbook-buttons">

    <portlet:renderURL var="addEntryURL">
        <portlet:param name="jspPage" value="/views/edit_entry.jsp" />
    </portlet:renderURL>

    <aui:button onClick="<%= addEntryURL.toString() %>" value="Add Entry" />

</aui:button-row>




This is the <b>List employees</b>