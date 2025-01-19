<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employee Form</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <form action="/employee/addEmployee" method="post">
        <input type="hidden" name="id" value="${employee.id}" />
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" value="${employee.name}" required /><br />

        <label for="designation">Designation:</label>
        <input type="text" id="designation" name="designation" value="${employee.designation}" required /><br />

        <label for="department">Department:</label>
        <input type="text" id="department" name="department" value="${employee.department}" required /><br />

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" value="${employee.email}" required /><br />

        <button type="submit">Save</button>
        <a href="/employees">Cancel</a>
    </form>
</body>
</html>
