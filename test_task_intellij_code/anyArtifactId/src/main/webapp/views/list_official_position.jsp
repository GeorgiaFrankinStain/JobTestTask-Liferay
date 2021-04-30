<%@ page import="com.liferay.docs.eventlisting.model.OfficialPosition" %>
<%@ page import="com.liferay.docs.eventlisting.service.OfficialPositionLocalServiceUtil" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.omg.CORBA.SystemException" %><%--
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
<%
    ArrayList<OfficialPosition> listOfficialPosition = null;
    try {
        listOfficialPosition = OfficialPositionLocalServiceUtil.findAll();
    } catch (SystemException e) {
        e.printStackTrace();
    }
    ArrayList<OfficialPosition> entries = listOfficialPosition;
%>

<liferay-ui:search-container>
    <liferay-ui:search-container-results
            results="<%= entries %>"
    />

    <liferay-ui:search-container-row
            className="com.liferay.docs.eventlisting.model.OfficialPosition"
            modelVar="officialPosition"
    >


        <liferay-ui:search-container-column-text property="name" name="Name" />
        <liferay-ui:search-container-column-text property="is_archived" name="Is archieved" />
        <liferay-ui:search-container-column-text>
            <portlet:renderURL var="viewEditPage">
                <portlet:param name="officialPositionId" value='<%=String.valueOf(officialPosition.getOfficialPositionId()) %>'/>
                <portlet:param name="jspPage" value="/views/edit_official_position.jsp"></portlet:param>
            </portlet:renderURL>
            <portlet:actionURL name="deleteOfficialPosition" var="deleteEntryURL">
                <portlet:param name="officialPositionId" value='<%=String.valueOf(officialPosition.getOfficialPositionId()) %>'/>
            </portlet:actionURL>
            <liferay-ui:icon-menu>
                <liferay-ui:icon iconCssClass="icon-edit" message="Change" url='<%=viewEditPage%>'/>
                <liferay-ui:icon iconCssClass="icon-trash" message="Delete" url="<%=deleteEntryURL%>"/>
            </liferay-ui:icon-menu>
        </liferay-ui:search-container-column-text>
    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
</liferay-ui:search-container>




<aui:button-row cssClass="guestbook-buttons">

    <portlet:renderURL var="addEntryURL">
        <portlet:param name="jspPage" value="/views/edit_official_position.jsp"></portlet:param>
    </portlet:renderURL>

    <aui:button onClick="<%= addEntryURL.toString() %>" value="Add Entry"></aui:button>

</aui:button-row>




This is the <b>List official positions</b>