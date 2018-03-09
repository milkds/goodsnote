<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<%@ page import="goodsnote.model.util.MeasurementUnits" %>

<html>
<head>
    <title>Item</title>
</head>
<body>
<c:url var="updateAction" value="/showitem/update"/>
<form:form action="${updateAction}" commandName="Item">
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
                <form:label path="article">
                    <spring:message text="Article"/>
                </form:label>
            </td>
            <td>
                <form:input path="article" onchange="submit()"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="name">
                    <spring:message text="Name"/>
                </form:label>
            </td>
            <td>
                <form:input path="name" onchange="submit()"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="creationDate">
                    <spring:message text="Date created"/>
                </form:label>
            </td>
            <td>
                <form:input path="creationDate" readonly="true"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:input type="hidden" path="updateDate"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="price">
                    <spring:message text="Price"/>
                </form:label>
            </td>
            <td>
                <form:input path="price" onchange="submit()"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="quantity">
                    <spring:message text="Quantity"/>
                </form:label>
            </td>
            <td>
                <form:input path="quantity" onchange="submit()"/>
            </td>
            <td>
                <form:select path="measurementUnit" onchange="submit()">
                    <form:option value="" label="${Item.measurementUnit}"/>
                    <form:options items="${MeasurementUnits.values()}" />
                </form:select>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="description">
                    <spring:message text="Description"/>
                </form:label>
            </td>
            <td>
                <form:input path="description" onchange="submit()"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
