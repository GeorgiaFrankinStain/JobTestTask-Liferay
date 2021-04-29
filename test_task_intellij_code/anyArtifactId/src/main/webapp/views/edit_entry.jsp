<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.docs.eventlisting.model.Worker" %>
<%@ page import="com.liferay.docs.eventlisting.service.WorkerLocalServiceUtil" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.liferay.docs.eventlisting.model.Bank" %>
<%@ page import="com.liferay.docs.eventlisting.service.BankLocalServiceUtil" %>
<%@ page import="com.liferay.docs.eventlisting.model.OfficialPosition" %>
<%@ page import="com.liferay.docs.eventlisting.service.OfficialPositionLocalServiceUtil" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 23.04.2021
  Time: 12:42
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<portlet:defineObjects />

<portlet:renderURL var="viewURL">
    <portlet:param name="jspPage" value="/views/view2.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addEntry" var="addEntryURL"></portlet:actionURL>
<%
//    String name = ParamUtil.getString(request, "name");
    String nameWorker = "";
    String lastnameWorker = "";
    String patronymicWorker = "";
    Worker worker = null;

    long id = ParamUtil.getLong(request, "workerId");
    boolean isWorkerExist;
    if (id == 0) {
        isWorkerExist = false;
    } else {
        worker = WorkerLocalServiceUtil.findById(id);
        isWorkerExist = worker != null;
    }
    if (isWorkerExist) {
        nameWorker = worker.getName();
        lastnameWorker = worker.getLastname();
        patronymicWorker = worker.getPatronymic();
    }
%>

<aui:form action="<%= addEntryURL %>" name="<portlet:namespace />fm">

    <aui:fieldset>
        <aui:input name="name" label="Name" value="<%= nameWorker %>"></aui:input>
        <aui:input name="lastname" label="Lastname" value="<%= lastnameWorker %>"></aui:input>
        <aui:input name="patronymic" label="Patronymic" value="<%= patronymicWorker %>"></aui:input>
        <aui:input name="is_man" label="I is man" checked="true" type="checkbox"/>
        <aui:input name="date_of_birth" label="Date of birth" type="date"/>
        <aui:input name="position" label="Position" type="text"/>
        <aui:input name="date_of_employment" label="Date of employment" type="date"/>
        <aui:input name="salary_level" label="Salary level" type="number"/>
        <aui:input name="work_number" label="Work number" type="tel"/>
        <aui:input name="telephone_number" label="Telephone number" type="tel"/>
        <aui:select name="bankId" label="Banking organization">
            <%
                ArrayList<Bank> banks = BankLocalServiceUtil.findAll();
                for (Bank bank : banks) {%>
            <aui:option value="<%= bank.getBankId() %>"><%= bank.getName() %></aui:option>
            <%}%>
        </aui:select>

        <aui:select name="officialPositionId" label="Official position">
            <%
                ArrayList<OfficialPosition> banks = OfficialPositionLocalServiceUtil.findAll();
                for (OfficialPosition bank : banks) {%>
            <aui:option value="<%= bank.getOfficialPositionId() %>"><%= bank.getName() %></aui:option>
            <%}%>
        </aui:select>
        <aui:input name="archival_status" label="Archival status" type="checkbox"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"></aui:button>
        <aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>
    </aui:button-row>
</aui:form>
