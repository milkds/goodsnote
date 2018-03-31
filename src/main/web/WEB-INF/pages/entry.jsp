<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<html>
<head>
    <title>Entry</title>
</head>
<body>
<c:url var="updateAction" value="/entry/update"/>
<form:form action="${updateAction}" commandName="Entry">
    <table>
        <tr>
            <td>
                <form:label path="id">
                    <spring:message text="ID"/>
                </form:label>
            </td>
            <td>
                <form:input path="id" readonly="true"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="fieldName">
                    <spring:message text="${Entry.fieldName}"/>
                </form:label>
            </td>
            <td>
                <form:input path="fieldValue" readonly="true"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="fieldType">
                    <spring:message text="Type"/>
                </form:label>
            </td>
            <td>
                <form:input path="fieldType" readonly="true"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="fieldOrder">
                    <spring:message text="Order"/>
                </form:label>
            </td>
            <td>
                <form:input path="fieldOrder" readonly="true"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
