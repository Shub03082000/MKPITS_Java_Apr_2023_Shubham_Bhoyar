<%@ page import="BankingServices.ServiceClass" %>
<%@ page import="com.example.banking_application_jsp.BankAccount_details" %>
<%@ page import="java.sql.ResultSet" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean class="com.example.banking_application_jsp.BankAccount_details" scope="application" id="bank"/>
    <jsp:setProperty name="bank" property="userName" param="username" />
    <jsp:setProperty name="bank" property="password" param="password" />
    <%
        ServiceClass serviceClass = new ServiceClass();
        ResultSet resultSet = serviceClass.loginAccount(bank);
        if (resultSet.next()){

            out.println("login successful");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("Myhtml.jsp");
            requestDispatcher.forward(request,response);
            session.setAttribute("User_id",bank.getUserName());
        }else {
            out.println("Incorrect username or password");
        }
    %>
    <html>
    <head>
        <title>title</title>
    </head>
    <body>

    </body>
    </html>