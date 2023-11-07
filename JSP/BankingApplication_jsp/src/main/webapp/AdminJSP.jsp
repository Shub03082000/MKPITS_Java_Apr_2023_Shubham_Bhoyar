<%@ page import="com.example.banking_application_jsp.Admin" %>
<%@ page import="BankingServices.ServiceClass" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.ResultSetMetaData" %>
<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: shubh
  Date: 07-11-2023
  Time: 12:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="admin" class="com.example.banking_application_jsp.Admin" scope="application"/>
<jsp:setProperty name="admin" property="adminUsername" param="adminUser_id"/>
<jsp:setProperty name="admin" property="adminPassword" param="adminPassword"/>
<jsp:useBean id="bank" class="com.example.banking_application_jsp.BankAccount_details" scope="application"/>
<%
    ServiceClass serviceClass = new ServiceClass();
    ResultSet resultSet = serviceClass.adminLogin(admin);
    if(resultSet.next())
    {
        ResultSet resultSet1 = serviceClass.displayRecord(bank);
        ResultSetMetaData resultSetMetaData = resultSet1.getMetaData();
    %>
<%--    <tr>--%>
<%--        <th><%=resultSetMetaData.%></th>--%>
<%--        <th><%=resultSetMetaData.getColumnName(2)%></th>--%>
<%--        <th><%=resultSetMetaData.getColumnName(3)%></th>--%>
<%--    </tr>--%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" >
    <style>
        body{
            /*background: rgb(131,58,180);*/
            /*background: linear-gradient(90deg, rgba(131,58,180,1) 0%, rgba(29,233,253,0.5495448179271709) 50%, rgba(252,176,69,1) 100%);*/
            background: rgb(131,58,180);
            background: linear-gradient(90deg, rgba(211, 203, 150, 0.7) 0%, rgba(155,228,235,0.5495448179271709) 50%, rgba(211, 203, 150, 0.7) 100%);
        }
    </style>
</head>
<body>
<table align="center"  cellpadding="6" class="col-lg-6 mt-3 table table-warning table-hover table-bordered">
<tr>
        <%
            for(int columnIndex=1; columnIndex<=resultSetMetaData.getColumnCount(); columnIndex++) {
        %>
            <th><%=resultSetMetaData.getColumnName(columnIndex)%></th>
        <%
            }
        %>
<%
    while (resultSet1.next())
    {
    %>
        <tr>
            <td><a href="SingleRecordDisplay.jsp?user_id=<%=resultSet1.getString(1)%>"><%=resultSet1.getString(1)%></></td>
            <td><%=resultSet1.getTimestamp(2)%></td>
            <td><%=resultSet1.getString(3)%></td>
        </tr>
            <%
    }
%>
    <%
    }else {
        out.println("<h2 align=center>Username or password incorrect</h2>");
    }
%>
</table>
</body>
</html>
