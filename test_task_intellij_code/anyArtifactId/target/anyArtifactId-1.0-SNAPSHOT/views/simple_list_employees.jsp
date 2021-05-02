<%@ page import="com.liferay.docs.eventlisting.model.Worker" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.liferay.docs.eventlisting.service.WorkerLocalServiceUtil" %>
<%@ page import="org.omg.CORBA.SystemException" %>
<%@ page import="Wrappers.Worker.TextPresentationWorker" %>
<%@ page import="Wrappers.Worker.DataWorkerClass" %>
<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>
<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 01.05.2021
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<jsp:useBean id="entries" class="java.util.ArrayList" scope="request"/>


<liferay-ui:search-container>
    <liferay-ui:search-container-results
            results="<%= entries %>"
    />

    <liferay-ui:search-container-row
            className="com.liferay.docs.eventlisting.model.Worker"
            modelVar="worker"
    >
        <%
            TextPresentationWorker textPresentationWorker = new DataWorkerClass();
            textPresentationWorker.trySetDataFromExitWorker(worker.getWorkerId());
        %>

        <liferay-ui:search-container-column-text value="<%= String.valueOf(worker.getWorkerId()) %>"/>
        <liferay-ui:search-container-column-text property="lastname" name="Lastname"/>
        <liferay-ui:search-container-column-text property="name" name="Name"/>
        <liferay-ui:search-container-column-text property="patronymic" name="Patronymic"/>

        <liferay-ui:search-container-column-text property="gender" name="Gender"/>
        <liferay-ui:search-container-column-date property="date_of_birth" name="Date of birth"/>
        <liferay-ui:search-container-column-text property="position" name="Position"/>
        <liferay-ui:search-container-column-date property="date_of_employment" name="Date of employment"/>
        <liferay-ui:search-container-column-text property="salary_level" name="Salary level"/>
        <liferay-ui:search-container-column-text property="work_number" name="Work number"/>
        <liferay-ui:search-container-column-text property="telephone_number" name="Telephone number"/>
        <liferay-ui:search-container-column-text value="<%= textPresentationWorker.getBankTitle() %>"
                                                 name="Banking organization"/>
        <liferay-ui:search-container-column-text value="<%= textPresentationWorker.getOfficialPositionTitle() %>"
                                                 name="Official position"/>
        <liferay-ui:search-container-column-text property="archival_status" name="Archival status"/>
        <liferay-ui:search-container-column-text>
            <portlet:renderURL var="viewEditPage">
                <portlet:param name="workerId" value='<%= String.valueOf(worker.getWorkerId()) %>'/>
                <portlet:param name="jspPage" value="/views/edit_entry.jsp"/>
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

    <liferay-ui:search-iterator/>
</liferay-ui:search-container>

