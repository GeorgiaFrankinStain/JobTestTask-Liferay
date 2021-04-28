<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.docs.eventlisting.model.Bank" %>
<%@ page import="com.liferay.docs.eventlisting.service.BankLocalServiceUtil" %><%--
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


<%
    String nameBank = "";
    String bicBank = "";
    String addressBank = "";
    Bank bank = null;

    long id = ParamUtil.getLong(request, "BankId");
    boolean isBankExist;
    if (id == 0) {
        isBankExist = false;
    } else {
        bank = BankLocalServiceUtil.findById(id);
        isBankExist = bank != null;
    }
    if (isBankExist) {
        nameBank = bank.getName();
        bicBank = bank.getBic();
        addressBank = bank.getAddress();
    }
%>

<portlet:actionURL name="addBank" var="addEntryURL"></portlet:actionURL>
<aui:form action="<%= addEntryURL %>" name="<portlet:namespace />fm">
    <aui:fieldset>
        <aui:input name="name" label="Name" value="<%= nameBank %>"></aui:input>
        <aui:input name="bic" label="bic" value="<%= bicBank %>"></aui:input>
        <aui:input name="address" label="address" value="<%= addressBank %>"></aui:input>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"></aui:button>
        <aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>
    </aui:button-row>
</aui:form>
