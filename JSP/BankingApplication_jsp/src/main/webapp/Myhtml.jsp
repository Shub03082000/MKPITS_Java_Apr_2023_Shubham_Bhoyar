<%--
  Created by IntelliJ IDEA.
  User: shubh
  Date: 03-11-2023
  Time: 23:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <style>
        body{
            /*background: rgb(131,58,180);*/
            /*background: linear-gradient(90deg, rgba(131,58,180,1) 0%, rgba(29,233,253,0.5495448179271709) 50%, rgba(252,176,69,1) 100%);*/
            background: rgb(131,58,180);
            background: linear-gradient(90deg, rgba(211, 203, 150, 0.7) 0%, rgba(155,228,235,0.5495448179271709) 50%, rgba(211, 203, 150, 0.7) 100%);
        }
        .main{
            margin-top: 50px;
            padding: 20px;

        }
        .main a{
            display: flex;
            justify-content: center;
            align-items: center;
            text-decoration: none;
            font-size: 20px;
            color: white;
            padding: 10px;
        }
        .main a label{
            padding: 10px 18px;
            background-color: teal;
            border-radius: 10px;
        }
    </style>
</head>
<body>
<div class="main">
    <h2 align="center" font-size="50px" class="mb-4">Welcome login Successful</h2>
    <form action="index.jsp" method="post">
        <a href="Deposit.jsp">
            <label>Deposit</label>
        </a>
        <a href="Withdraw.jsp">
            <label>Withdraw</label>
        </a>
        <a href="Transfer.jsp">
            <label>Transfer</label>
        </a>
        <a href="BalanceStatement.jsp">
            <label>Balance</label>
        </a>
    </form>
</div>
</body>
</html>
