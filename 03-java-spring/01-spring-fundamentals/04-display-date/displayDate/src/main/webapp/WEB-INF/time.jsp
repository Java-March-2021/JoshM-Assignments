<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/style.css">
<title>Time</title>
</head>
<body class = timeStyle onload="dtAlert('<c:out value="${day}"/>')">
<h1><c:out value="${timeFormat}"/></h1> 
<script src="js/script.js"></script>
</body>
</html>