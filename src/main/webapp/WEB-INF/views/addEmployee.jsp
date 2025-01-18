<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Employee Data</title>
</head>
<body>
    <h1>Welcome to Employee Database</h1>
    <form action="/addEmployee" method="post"> <!-- POST method -->
        Enter your name: <input type="text" name="name"><br>
        Enter your role: <input type="text" name="role"><br>
        Enter your department: <input type="text" name="department"><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
