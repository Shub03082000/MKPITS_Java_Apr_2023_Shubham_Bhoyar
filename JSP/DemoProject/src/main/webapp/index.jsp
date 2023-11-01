<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" >
</head>
<body>
    <div>
        <form action="insertData.jsp" method="post">
            <label>RollNo: </label>
            <input type="text" name="rollno" class="form-control">
            <br>
            <br>
            <label>Name: </label>
            <input type="text" name="name" class="form-control">
            <br>
            <br>
            <label>Address: </label>
            <input type="text" name="address" class="form-control">
            <br>
            <br>
            <label>City: </label>
            <input type="text" name="city" class="form-control">
            <br>
            <br>
        <div>
            <input type="submit" value="submit">
        </div>
    </form>
    </div>
</body>
</html>