<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.liferay.docs.eventlisting.model.Bank" %>
<%@ page import="com.liferay.docs.eventlisting.service.BankLocalServiceUtil" %>
<%@ page import="com.liferay.docs.eventlisting.model.OfficialPosition" %>
<%@ page import="com.liferay.docs.eventlisting.service.OfficialPositionLocalServiceUtil" %>
<%@ page import="com.liferay.docs.eventlisting.NoSuchWorkerException" %>
<%@ page import="com.liferay.portal.kernel.exception.SystemException" %>
<%@ page import="Wrappers.Worker.TextPresentationWorker" %>
<%@ page import="Wrappers.Worker.DataWorkerClass" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 23.04.2021
  Time: 12:42
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<portlet:defineObjects/>

<portlet:renderURL var="viewURL">
    <portlet:param name="jspPage" value="/views/view2.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="addEntry" var="addEntryURL"/>
<%
    TextPresentationWorker textPresentationWorker = new DataWorkerClass();
    long workerId = ParamUtil.getLong(request, "workerId");
    textPresentationWorker.trySetDataFromExitWorker(workerId);
%>

<aui:form action="<%= addEntryURL %>" name="<portlet:namespace />fm">

    <aui:fieldset>
        <aui:input name="workerId" type="hidden" value="<%= textPresentationWorker.getId() %>"/>
        <aui:input name="name" label="Name" value="<%= textPresentationWorker.getName() %>"/>

        <aui:input name="lastname" label="Lastname" value="<%= textPresentationWorker.getLastname() %>"/>
        <aui:input name="patronymic" label="Patronymic"
                   value="<%= textPresentationWorker.getPatronymic() %>"/>
        <aui:input name="is_man" label="I is man" checked="<%= textPresentationWorker.isMan() %>" type="checkbox"/>
        <aui:input name="date_of_birth" label="Date of birth" type="date"
                   value="<%= textPresentationWorker.getDateBirthText() %>"/>
        <aui:input name="position" label="Position" type="text" value="<%= textPresentationWorker.getPosition() %>"/>
        <aui:input name="date_of_employment" label="Date of employment" type="date"
                   value="<%= textPresentationWorker.getDateEmploymentText() %>"/>
        <aui:input name="salary_level" label="Salary level" type="number"
                   value="<%= textPresentationWorker.getSalaryLevelText() %>"/>
        <aui:input name="work_number" label="Work number" type="tel"
                   value="<%= textPresentationWorker.getWorkNumberText() %>"/>
        <aui:input name="telephone_number" label="Telephone number" type="tel"
                   value="<%= textPresentationWorker.getTelephoneNumberText() %>"/>
        <aui:select name="bankId" label="Banking organization">
            <%
                ArrayList<Bank> banks = BankLocalServiceUtil.findAll();
                for (Bank bank : banks) {%>
            <aui:option value="<%= bank.getBankId() %>"
                        selected="<%= textPresentationWorker.isCurrentBankThisWorker(bank.getBankId()) %>"><%= bank.getName() %>
            </aui:option>
            <%}%>
        </aui:select>

          <aui:select name="officialPositionId" label="Official position">
             <%
                 ArrayList<OfficialPosition> officialPositions = OfficialPositionLocalServiceUtil.findAll();
                 assert officialPositions != null;
                 for (OfficialPosition officialPosition : officialPositions) {%>
             <aui:option value="<%= officialPosition.getOfficialPositionId() %>"
                         selected="<%= textPresentationWorker.isCurrentBankThisWorker(officialPosition.getOfficialPositionId()) %>"
             ><%= officialPosition.getName() %>
             </aui:option>
             <%}%>
         </aui:select>
         <aui:input name="archival_status" label="Archival status" type="checkbox"
                    checked="<%= textPresentationWorker.isArchived() %>"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"/>
        <aui:button type="cancel" onClick="<%= viewURL.toString() %>"/>
    </aui:button-row>
</aui:form>
