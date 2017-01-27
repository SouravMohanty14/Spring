<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
<spring:form action="processProductData" commandName="product" > 
<table>
<tr>
<td>PRODUCT NAME: </td>
<td><spring:input type="text" path="productName"></spring:input></td>
</tr>
<tr>
<td>PRODUCT PRICE: </td>
<td><spring:input type="text" path="price"></spring:input></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="Add Product"></td>
</tr>
</table>
</spring:form>
</body>
</html>