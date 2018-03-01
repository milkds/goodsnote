<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<html>
<head>
    <title>Item</title>
    <table class="tg">
        <tr>
            <td width="80">Article: </td>
            <td width="180">${Item.article}</td>
        </tr>
        <tr>
            <td width="80">Name: </td>
            <td width="180">${Item.name}</td>
        </tr>
        <tr>
            <td width="80">Created: </td>
            <td width="280">${Item.creationDate}</td>
        </tr>
        <tr>
            <td width="80">Price: </td>
            <td width="180">${Item.price}</td>
        </tr>
        <tr>
            <td width="80">Quantity: </td>
            <td width="180">${Item.quantity}</td>
            <td width="20">${Item.quantityMeasure}</td>
        </tr>
        <tr>
            <td width="80">Description: </td>
            <td width="280">${Item.description}</td>
        </tr>
    </table>

</head>
<body>
</body>
</html>
