<%--
  Created by IntelliJ IDEA.
  User: shubh
  Date: 07-11-2023
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" >
    <style>
        body{
            background-color: lightyellow;
            margin-top: 100px;
        }
        .main{
            box-shadow: rgba(0, 0, 0, 0.25) 0px 54px 55px, rgba(0, 0, 0, 0.12) 0px -12px 30px, rgba(0, 0, 0, 0.12) 0px 4px 6px, rgba(0, 0, 0, 0.17) 0px 12px 13px, rgba(0, 0, 0, 0.09) 0px -3px 5px;
            background-color: darkseagreen;
        }

    </style>
</head>
<body>
<div class="container col-lg-4 p-5 text-dark main">
    <h2 class="text-center" class="mb-3 mt-3">Admin Page</h2>
    <form action="AdminJSP.jsp" method="post">
        <label>Username : </label>
        <input type="text" name="adminUser_id" class="form-control">
        <br>
        <label>Password : </label>
        <input type="password" name="adminPassword" class="form-control">
        <br>
        <div align="center">
            <br>
            <input type="submit" value="Login" class="btn btn-success w-50 mb-2">
            <br>
        </div>
    </form>
</div>
</body>
</html>
