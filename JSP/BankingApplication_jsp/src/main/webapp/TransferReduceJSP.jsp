<%@ page import="BankingServices.ServiceClass" %><%--
  Created by IntelliJ IDEA.
  User: shubh
  Date: 04-11-2023
  Time: 08:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="transaction" class="com.example.banking_application_jsp.Transactions" scope="application"/>
<jsp:useBean id="bank" class="com.example.banking_application_jsp.BankAccount_details" scope="application"/>
<jsp:setProperty name="bank" property="userName" param="username" />
<jsp:setProperty name="transaction" property="transfer_id" value='<%=session.getAttribute("User_id")%>'/>
<jsp:setProperty name="transaction" property="date" value="<%=new java.sql.Date(session.getCreationTime())%>"/>
<jsp:setProperty name="transaction" property="balance" param="amount"/>

<%
    ServiceClass serviceClass = new ServiceClass();
    if(serviceClass.transferReduceAmount(transaction, bank.getUserName())!=0){
        out.println("<h3 align=center>Transfer successfully</h3>");
    }else{
        out.println("<h3 align=center>failed to transfer</h3>");
    }
%>
<html>
<head>
    <title>deposit</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" >
    <style>
        body{
            /*background: rgb(131,58,180);*/
            /*background: linear-gradient(90deg, rgba(131,58,180,1) 0%, rgba(29,233,253,0.5495448179271709) 50%, rgba(252,176,69,1) 100%);*/
            background: rgb(131,58,180);
            background: linear-gradient(90deg, rgba(211, 203, 150, 0.7) 0%, rgba(155,228,235,0.5495448179271709) 50%, rgba(211, 203, 150, 0.7) 100%);
            margin-top: 50px;
        }
        .back{
            font-size: 30px;
            text-decoration: none;
            color: darkred;
            font-weight: bolder;
        }
    </style>
</head>
<body>
<a href="Myhtml.jsp" class="d-flex justify-content-center back" >Back</a>
</body>
</html>
