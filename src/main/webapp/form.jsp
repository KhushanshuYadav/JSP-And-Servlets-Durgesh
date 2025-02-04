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

<form action="<%= application.getContextPath()%>/third" method="post">

<spacer type="block" width="50" />


<button type="submit">Submit Form</button>

</form>

</body>
</html>