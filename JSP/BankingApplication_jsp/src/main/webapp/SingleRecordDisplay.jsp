<%@ page import="BankingServices.ServiceClass" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.ResultSetMetaData" %><%--
  Created by IntelliJ IDEA.
  User: shubh
  Date: 07-11-2023
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String userId = request.getParameter("user_id");
%>
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
<%
    ServiceClass serviceClass = new ServiceClass();
    ResultSet resultSet = serviceClass.displayIndividualRecord(userId);
    ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
%>
<table align="center"  cellpadding="6" class="col-lg-6 mt-3 table table-warning table-hover table-bordered">

    <%
        while (resultSet.next())
        {
    %>
            <tr>
                <th><%=resultSetMetaData.getColumnName(1)%></th>
                <td><%=resultSet.getString(1)%></td>
            </tr>
            <tr>
                <th><%=resultSetMetaData.getColumnName(2)%></th>
                <td><%=resultSet.getString(2)%></td>
            </tr>
            <tr>
                <th><%=resultSetMetaData.getColumnName(3)%></th>
                <td><%=resultSet.getString(3)%></td>
            </tr>
            <tr>
                <th><%=resultSetMetaData.getColumnName(4)%></th>
                <td><%=resultSet.getString(4)%></td>
            </tr>
            <tr>
                <th><%=resultSetMetaData.getColumnName(5)%></th>
                <td><%=resultSet.getString(5)%></td>
            </tr>
            <tr>
                <th><%=resultSetMetaData.getColumnName(6)%></th>
                <td><%=resultSet.getInt(6)%></td>
            </tr>
            <tr>
                <th><%=resultSetMetaData.getColumnName(7)%></th>
                <td><%=resultSet.getTimestamp(7)%></td>
            </tr>
            <tr>
                <th><%=resultSetMetaData.getColumnName(8)%></th>
                <td><%=resultSet.getString(8)%></td>
            </tr>
            <tr>
                <th><%=resultSetMetaData.getColumnName(9)%></th>
                <td><%=resultSet.getString(9)%></td>
            </tr>
            <tr>
                <th><%=resultSetMetaData.getColumnName(10)%></th>
                <td><%=resultSet.getString(10)%></td>
            </tr>
    <%
    %>
    <tr class="table borderless">
        <td colspan="2" align="center">
            <input type="submit" value="Approve" class="btn-success fs-1">
            <input type="submit" value="Reject" class="btn-danger fs-1">
        </td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
