<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
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

<%
//    String name = ParamUtil.getString(request, "name");
    String nameOfficialPosition = "";
    boolean isArchivedOfficialPosition = false;
    OfficialPosition officialPosition = null;

    long id = ParamUtil.getLong(request, "OfficialPositionId");
    boolean isOfficialPositionExist;
    if (id == 0) {
        isOfficialPositionExist = false;
    } else {
        officialPosition = OfficialPositionLocalServiceUtil.findById(id);
        isOfficialPositionExist = officialPosition != null;
    }
    if (isOfficialPositionExist) {
        nameOfficialPosition = officialPosition.getName();
        isArchivedOfficialPosition = officialPosition.getIs_archived();
    }
%>

<portlet:actionURL name="addOfficialPosition" var="addEntryURL"></portlet:actionURL>
<aui:form action="<%= addEntryURL %>" name="<portlet:namespace />fm">

    <aui:fieldset>
        <aui:input name="name" label="Name" value="<%= nameOfficialPosition %>"></aui:input>
        <aui:input name="is_archived" label="Is arvhived" type="checkbox" checked="<%= isArchivedOfficialPosition %>" />
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"></aui:button>
        <aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>
    </aui:button-row>
</aui:form>
