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

<portlet:defineObjects />

<%
    ArrayList<Worker> listWorker = null;
    try {
        listWorker = WorkerLocalServiceUtil.findAll();
    } catch (SystemException e) {
        e.printStackTrace();
    }
    ArrayList<Worker> entries = listWorker;
%>

<%--<jsp:useBean id="entries" class="java.util.ArrayList" scope="request"/>--%>

<liferay-ui:search-container>
    <liferay-ui:search-container-results
            results="<%= entries %>"
    />

    <liferay-ui:search-container-row
            className="com.liferay.docs.eventlisting.model.Worker"
            modelVar="worker"
    >


        <liferay-ui:search-container-column-text value="<%= String.valueOf(worker.getWorkerId()) %>" />
        <liferay-ui:search-container-column-text property="name" name="Name" />
        <liferay-ui:search-container-column-text property="lastname" name="Lastname" />
        <liferay-ui:search-container-column-text property="patronymic" name="Patronymic" />

        <liferay-ui:search-container-column-text property="gender" name="Gender"/>
        <liferay-ui:search-container-column-date property="date_of_birth" name="Date of birth"/>
        <liferay-ui:search-container-column-text property="position" name="Position"/>
        <liferay-ui:search-container-column-date property="date_of_employment" name="Date of employment"/>
        <liferay-ui:search-container-column-text property="salary_level" name="Salary level"/>
        <liferay-ui:search-container-column-text property="work_number" name="Work number"/>
        <liferay-ui:search-container-column-text property="telephone_number" name="Telephone number"/>
        <liferay-ui:search-container-column-text property="bankId" name="Banking organization"/>
        <liferay-ui:search-container-column-text property="officialPositionId" name="Official position"/>
        <liferay-ui:search-container-column-text property="archival_status" name="Archival status"/>
        <liferay-ui:search-container-column-text>
            <portlet:renderURL var="viewEditPage">
                <portlet:param name="workerId" value='<%= String.valueOf(worker.getWorkerId()) %>'/>
                <portlet:param name="jspPage" value="/views/edit_entry.jsp"></portlet:param>
            </portlet:renderURL>
            <portlet:actionURL name="deleteEmployee" var="deleteEntryURL">
                <portlet:param name="workerId" value='<%= String.valueOf(worker.getWorkerId()) %>'/>
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
        <portlet:param name="jspPage" value="/views/edit_entry.jsp"></portlet:param>
    </portlet:renderURL>

    <aui:button onClick="<%= addEntryURL.toString() %>" value="Add Entry"></aui:button>

</aui:button-row>




This is the <b>List employees</b>