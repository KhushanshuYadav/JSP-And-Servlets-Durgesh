<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form</title>
</head>
<body>

<h1>This is my first Project</h1>

<%@ include file="linkMenu.jsp" %>


<br>
<br>


<form action="<%= application.getContextPath()%>/third" method="post">

         <label for="fullName">Full Name:</label>
         <br>
         <input type="text" id="fullName" name="fullName" placeholder="Enter your full name" required>
         <br>
         <br>
         <label for="age">Age:</label>
         <br>
         <input type="number" id="age" name="age" placeholder="Enter your age" required min="1">
         <br>
         <br>
         <button type="submit">Submit Form</button>


</form>

</body>
</html>