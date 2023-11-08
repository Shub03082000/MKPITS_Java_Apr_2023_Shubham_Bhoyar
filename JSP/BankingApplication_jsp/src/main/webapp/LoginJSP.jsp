<%@ page import="BankingServices.ServiceClass" %>
<%@ page import="com.example.banking_application_jsp.BankAccount_details" %>
<%@ page import="java.sql.ResultSet" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean class="com.example.banking_application_jsp.BankAccount_details" scope="application" id="bank"/>
    <jsp:setProperty name="bank" property="userName" param="username" />
    <jsp:setProperty name="bank" property="password" param="password" />
<jsp:setProperty name="bank" property="createdOn" value="<%=new java.sql.Timestamp(session.getCreationTime())%>"/>
<jsp:useBean id="log" class="com.example.banking_application_jsp.LogDetails" scope="application"/>
<%
    session.setAttribute("log_time",bank.getCreatedOn());
    session.setAttribute("userid",bank.getUserName());
%>
<jsp:setProperty name="log" property="logTime" value='<%=session.getAttribute("log_time")%>'/>
<jsp:setProperty name="log" property="userId" value='<%=session.getAttribute("userid")%>'/>
<jsp:setProperty name="log" property="task" value="login"/>
    <%
        ServiceClass serviceClass = new ServiceClass();
        ResultSet resultSet = serviceClass.loginAccount(bank);
        if (resultSet.next()){
            out.println("login successful");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("Myhtml.jsp");
            requestDispatcher.forward(request,response);
            session.setAttribute("User_id",bank.getUserName());
            serviceClass.displayLogDetails(log);
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