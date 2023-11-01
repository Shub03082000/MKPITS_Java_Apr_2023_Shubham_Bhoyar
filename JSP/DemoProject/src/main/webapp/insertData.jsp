<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %><%--
  Created by IntelliJ IDEA.
  User: shubh
  Date: 01-11-2023
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*" %>
<%@ page import="java.io.PrintWriter" %>
<%
        String roll_no = request.getParameter("rollno");
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String city = request.getParameter("city");

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student_information","root","shubham@123");
        PreparedStatement preparedStatement = connection.prepareStatement("insert  into Student_detail values(?,?,?,?)");
        preparedStatement.setString(1,roll_no);
        preparedStatement.setString(2,name);
        preparedStatement.setString(3,address);
        preparedStatement.setString(4,city);
        int result = preparedStatement.executeUpdate();

        PrintWriter printWriter = response.getWriter();
        if(result!=0)

            printWriter.println("Data inserted Successfully");
        else
            printWriter.println("Unable to insert Data");
%>


<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
