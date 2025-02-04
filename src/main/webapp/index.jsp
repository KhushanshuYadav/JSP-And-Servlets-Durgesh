<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First Project</title>
</head>
<body>

<h1>This is my first Project</h1>

<%@ include file="linkMenu.jsp" %>

<p>Welcome to home page of my first Project</p>

<p id="para"> Text will change here </p>

<button id="btn" >click me</button>

</body>

<script src="<%= application.getContextPath() %>/javascript/clickRepresentation.js"></script>

</html>