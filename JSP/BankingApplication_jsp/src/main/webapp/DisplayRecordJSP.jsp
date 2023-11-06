<%@ page import="BankingServices.ServiceClass" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.ResultSetMetaData" %><%--
  Created by IntelliJ IDEA.
  User: shubh
  Date: 06-11-2023
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="transaction" class="com.example.banking_application_jsp.Transactions" scope="application"/>
<jsp:setProperty name="transaction" property="userId" value='<%=session.getAttribute("User_id")%>'/>
<%
    ServiceClass serviceClass = new ServiceClass();
    ResultSet resultSet = serviceClass.displayRecord(transaction);
    ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
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
    <h3 class="text-center">Balance Statement</h3>
    <h3 class="text-center">Username : <%=session.getAttribute("User_id")%></h3>
    <table align="center"  cellpadding="8" class="col-lg-6 table table-info table-hover table-borderless">
        <tr>
            <%
                for(int columnIndex=1; columnIndex<=resultSetMetaData.getColumnCount(); columnIndex++) {
            %>
            <th><%=resultSetMetaData.getColumnName(columnIndex)%></th>
            <%
                }
            %>
        </tr>
        <%
            while(resultSet.next())
            {
        %>
            <tr>
                <td><%=resultSet.getDate(1)%></td>
                <td><%=resultSet.getInt(2)%></td>
                <td><%=resultSet.getString(3)%></td>
            </tr>
        <%
            }
        %>
    </table>
</body>
</html>
