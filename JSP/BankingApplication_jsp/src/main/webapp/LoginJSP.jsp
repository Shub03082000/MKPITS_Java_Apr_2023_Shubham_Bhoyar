<%@ page import="BankingServices.ServiceClass" %><%--
  Created by IntelliJ IDEA.
  User: shubh
  Date: 03-11-2023
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean class="com.example.banking_application_jsp.BankAccount_details" scope="application" id="bank">
    <jsp:setProperty name="bank" property="username" param="username" />
    <jsp:setProperty name="bank" property="password" param="password" />
    <jsp:setProperty name="bank" property=""></jsp:setProperty>


<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
