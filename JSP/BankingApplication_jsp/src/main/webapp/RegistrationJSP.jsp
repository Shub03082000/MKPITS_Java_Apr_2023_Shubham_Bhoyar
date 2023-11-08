<%@ page import="BankingServices.ServiceClass" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="bank" class="com.example.banking_application_jsp.BankAccount_details" scope="application" />
<jsp:setProperty name="bank" property="userName" param="username" />
<jsp:setProperty name="bank" property="password" param="password" />
<jsp:setProperty name="bank" property="name" param="name" />
<jsp:setProperty name="bank" property="address" param="address" />
<jsp:setProperty name="bank" property="city" param="city" />
<jsp:setProperty name="bank" property="balance" param="balance" />
<jsp:setProperty name="bank" property="createdOn" value="<%=new java.sql.Timestamp(session.getCreationTime())%>"/>
<jsp:useBean id="log" class="com.example.banking_application_jsp.LogDetails" scope="application"/>
<%
    session.setAttribute("log_time",bank.getCreatedOn());
    session.setAttribute("user_id",bank.getUserName());
%>

<jsp:setProperty name="log" property="logTime" value='<%= session.getAttribute("log_time")%>'/>
<jsp:setProperty name="log" property="userId" value='<%=session.getAttribute("user_id")%>'/>
<jsp:setProperty name="log" property="task" value="Registration"/>
<%
    ServiceClass serviceClass = new ServiceClass();
    if(serviceClass.insertRecord(bank)!=0){
        out.println("<h3 align=center>Data inserted</h3>");
        serviceClass.displayLogDetails(log);
    }else{
        out.println("<h3>Unable to insert record</h3>");
    }
%>