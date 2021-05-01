<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.docs.eventlisting.model.Bank" %>
<%@ page import="com.liferay.docs.eventlisting.service.BankLocalServiceUtil" %>
<%@ page import="Wrappers.Bank.TextPresentationBank" %>
<%@ page import="Wrappers.Bank.DataBankClass" %>
<%@ page import="com.liferay.docs.eventlisting.model.Worker" %>
<%@ page import="com.liferay.docs.eventlisting.service.WorkerLocalServiceUtil" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Arrays" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 23.04.2021
  Time: 12:42
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib prefix="liferay-util" uri="http://liferay.com/tld/util" %>
<portlet:defineObjects />

<portlet:renderURL var="viewURL">
    <portlet:param name="jspPage" value="/views/view2.jsp" />
</portlet:renderURL>


<%
    TextPresentationBank textPresentationBank = new DataBankClass();
    long bankId = ParamUtil.getLong(request, "bankId");
    textPresentationBank.trySetDataFromExitBank(bankId);


    ArrayList<Worker> entries = WorkerLocalServiceUtil.findWorkerWithBank(bankId);
    request.setAttribute("entries", entries);
%>

<portlet:actionURL name="addBank" var="addEntryURL" />
<aui:form action="<%= addEntryURL %>" name="<portlet:namespace />fm">
    <aui:fieldset>
        <aui:input name="bankId" type="hidden" value="<%= textPresentationBank.getId() %>"/>
        <aui:input name="name" label="Name" value="<%= textPresentationBank.getName() %>" />
        <aui:input name="bic" label="bic" value="<%= textPresentationBank.getBic() %>" />
        <aui:input name="address" label="address" value="<%= textPresentationBank.getAddress() %>" />
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" />
        <aui:button type="cancel" onClick="<%= viewURL.toString() %>" />
    </aui:button-row>
</aui:form>



<liferay-util:include page="/views/simple_list_employees.jsp" servletContext="<%= application%>" />

