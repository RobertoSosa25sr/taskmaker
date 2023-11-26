<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Task List</title>
</head>
<body>
<div class="container">
    <h1 class="mt-3">Task List</h1>

    <%-- Display the task list --%>
    <ul>
        <c:forEach var="task" items="${tasks}">
            <li>${task}</li>
        </c:forEach>
    </ul>
</div>
</body>
</html>
