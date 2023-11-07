<%--
  Created by IntelliJ IDEA.
  User: shubh
  Date: 03-11-2023
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" >
    <style>
        body{
            background: linear-gradient(90deg, rgba(218,221,137,0.7764355742296919) 0%, rgb(176, 196, 222) 50%);
            margin-top: 10px;
        }
        .main{
            box-shadow: rgba(0, 0, 0, 0.25) 0px 54px 55px, rgba(0, 0, 0, 0.12) 0px -12px 30px, rgba(0, 0, 0, 0.12) 0px 4px 6px, rgba(0, 0, 0, 0.17) 0px 12px 13px, rgba(0, 0, 0, 0.09) 0px -3px 5px;
            background-color: lightsteelblue;
        }
        div a{
            color: darkred;
        }
    </style>
</head>
<body>
<div class="container col-lg-4 py-3 px-5 text-dark main">
    <h2 class="text-center" class="mb-3 mt-3">Registration</h2>
        <form action="RegistrationJSP.jsp" method="post">
            <label>Username : </label>
            <input type="text" name="username" class="form-control">
            <br>
            <label>Password : </label>
            <input type="password" name="password" class="form-control">
            <br>
            <label>Name : </label>
            <input type="text" name="name" class="form-control">
            <br>
            <label>Address : </label>
            <input type="text" name="address" class="form-control">
            <br>
            <label>City : </label>
            <input type="text" name="city" class="form-control">
            <br>
            <label>Balance : </label>
            <input type="number" name="balance" class="form-control">
            <br>
            <div align="center">
                <br>
                <input type="submit" value="Submit" class="btn btn-success w-50 mb-2">
            </div>
        </form>
</div>
</body>
</html>
