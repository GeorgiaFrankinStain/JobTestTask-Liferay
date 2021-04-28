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


<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<portlet:defineObjects />
<jsp:useBean id="entries" class="java.util.ArrayList" scope="request"/>


<aui:button-row cssClass="guestbook-buttons">

    <portlet:renderURL var="listOfficialPositions">
        <portlet:param name="jspPage" value="/views/list_official_position.jsp"></portlet:param>
    </portlet:renderURL>
    <aui:button onClick="<%= listOfficialPositions.toString() %>" value="List official positions"></aui:button>

    <portlet:renderURL var="listBanks">
        <portlet:param name="jspPage" value="/views/list_bank.jsp"></portlet:param>
    </portlet:renderURL>
    <aui:button onClick="<%= listBanks.toString() %>" value="List banks"></aui:button>

    <portlet:renderURL var="listEmployees">
        <portlet:param name="jspPage" value="/views/list_employees.jsp"></portlet:param>
    </portlet:renderURL>
    <aui:button onClick="<%= listEmployees.toString() %>" value="List employees"></aui:button>

</aui:button-row>




This is the <b>WIEW 334567890</b>