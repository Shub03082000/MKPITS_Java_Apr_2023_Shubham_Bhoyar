<%@ page import="BankingServices.ServiceClass" %><%--
  Created by IntelliJ IDEA.
  User: shubh
  Date: 07-11-2023
  Time: 18:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="bank" class="com.example.banking_application_jsp.BankAccount_details" scope="application"/>
<jsp:useBean id="admin" class="com.example.banking_application_jsp.Admin" scope="application"/>
<jsp:setProperty name="bank" property="approved_at" value="<%=new java.sql.Timestamp(session.getCreationTime())%>"/>

<%
    String uId = request.getParameter("user_id");
    session.setAttribute("admin_id",admin.getAdminUsername());
%>
<jsp:setProperty name="bank" property="approved_by" value='<%=session.getAttribute("admin_id")%>'/>
<%
    ServiceClass serviceClass = new ServiceClass();
    if(serviceClass.approvedRegistration(bank,uId)!=0){
        response.sendRedirect("AdminJSP.jsp");
    }else{
        out.println("failed to approved");
    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
