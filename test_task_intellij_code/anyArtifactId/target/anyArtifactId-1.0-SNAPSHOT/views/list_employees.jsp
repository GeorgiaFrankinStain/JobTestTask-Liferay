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
    ArrayList<Worker> inputEntries = (ArrayList<Worker>) request.getAttribute("entries");

    String dateStartText = "";
    String dateEndText = "";
    String foundName = "";
    ArrayList<Worker> entries = null;
    if (inputEntries == null) {
        entries = WorkerLocalServiceUtil.findAll();
        request.setAttribute("entries", entries);
    } else {
        request.setAttribute("entries", inputEntries);
        dateStartText = (String) request.getAttribute("dateStart");
        dateEndText = (String) request.getAttribute("dateEnd");
        foundName = (String) request.getAttribute("foundName");
    }
%>


<portlet:actionURL name="findWorkerFromCriteries" var="addEntryURL">
    <portlet:param name="jspPage" value="/views/list_employees.jsp" />
</portlet:actionURL>
<aui:form action="<%= addEntryURL %>" name="<portlet:namespace />fm">
    <aui:fieldset>
        <aui:input name="dateStart" label="from birthday" type="date"
                   value="<%= dateStartText %>"/>
        <aui:input name="dateEnd" label="to birthday" type="date"
                   value="<%= dateEndText %>"/>
        <aui:input name="foundName" label="Found name" value="<%= foundName %>" />
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"  />
    </aui:button-row>
</aui:form>


<liferay-util:include page="/views/simple_list_employees.jsp" servletContext="<%= application%>" />



<aui:button-row cssClass="guestbook-buttons">

    <portlet:renderURL var="addEntryURL">
        <portlet:param name="jspPage" value="/views/edit_entry.jsp" />
    </portlet:renderURL>

    <aui:button onClick="<%= addEntryURL.toString() %>" value="Add Entry" />

</aui:button-row>




This is the <b>List employees</b>