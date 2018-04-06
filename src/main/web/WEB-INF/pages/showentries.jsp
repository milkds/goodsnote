<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<html>
<head>
</head>
<body>
<c:url var="updateAction" value="/entry/update"/>

<table>
    <c:forEach items="${listEntries}" var="entry">
        <form:form action="${updateAction}" modelAttribute="modelEntry">
        <tr>
            <td>
                <form:label path="field.name">
                    <spring:message text="${entry.field.name}"/>
                </form:label>
            </td>
            <td>
                <form:input path="fieldValue" value="${entry.fieldValue}" onchange="submit()"/>
            </td>
            <td>
                <form:input type="hidden" path="id" value="${entry.id}"/>
            </td>
            <%--<td>
                <form:input type="hidden" path="fieldOrder" value="${entry.fieldOrder}"/>
            </td>
            <td>
                <form:input type="hidden" path="fieldType" value="${entry.fieldType}"/>
            </td>--%>
            <td>
                <form:input type="hidden" path="field.id" value="${entry.field.id}"/>
            </td>
            <td>
                <form:input type="hidden" path="itemID" value="${entry.itemID}"/>
            </td>
            <%--<td>
                <form:input type="hidden" path="fieldName" value="${entry.fieldName}"/>
            </td>--%>
        <tr>
        </form:form>
    </c:forEach>
</table>

</body>
</html>
