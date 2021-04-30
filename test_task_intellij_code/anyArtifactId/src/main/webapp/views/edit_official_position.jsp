<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.docs.eventlisting.model.OfficialPosition" %>
<%@ page import="com.liferay.docs.eventlisting.service.OfficialPositionLocalServiceUtil" %>
<%@ page import="Wrappers.OfficialPosition.TextPresentationOfficialPosition" %>
<%@ page import="Wrappers.OfficialPosition.DataOfficialPositionClass" %><%--
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
    <portlet:param name="jspPage" value="/views/view2.jsp"></portlet:param>
</portlet:renderURL>

<%
    TextPresentationOfficialPosition textPresentationOfficialPosition = new DataOfficialPositionClass();
    long officialPositionId = ParamUtil.getLong(request, "officialPositionId");
    textPresentationOfficialPosition.trySetDataFromExitOfficialPosition(officialPositionId);
%>

<portlet:actionURL name="addOfficialPosition" var="addEntryURL"></portlet:actionURL>
<aui:form action="<%= addEntryURL %>" name="<portlet:namespace />fm">

    <aui:fieldset>
        <aui:input name="officialPositionId" type="hidden" value="<%= textPresentationOfficialPosition.getIdText() %>"/>
        <aui:input name="name" label="Name" value="<%= textPresentationOfficialPosition.getName() %>"></aui:input>
        <aui:input name="isArchived" label="Is arvhived" type="checkbox"
                   checked="<%= textPresentationOfficialPosition.isArchived() %>"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"></aui:button>
        <aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>
    </aui:button-row>
</aui:form>
