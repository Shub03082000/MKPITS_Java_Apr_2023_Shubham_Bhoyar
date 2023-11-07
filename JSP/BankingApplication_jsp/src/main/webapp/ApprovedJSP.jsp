<%--
  Created by IntelliJ IDEA.
  User: shubh
  Date: 07-11-2023
  Time: 18:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="bank" class="com.example.banking_application_jsp.BankAccount_details" scope="application"/>
<jsp:setProperty name="bank" property="approved_at" value="<%=new java.sql.Timestamp(session.getCreationTime())%>"/>
<jsp:setProperty name="bank" property="approved_by" value="<%=session.%>"
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
