<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${ language.name }</title>
</head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<body>
<div class="container">
<a href="/languages">Dashboard</a>
<hr>
<hr>
<hr>
<hr>
<h1>${ language.name }</h1>
<p>${ language.creator }</p>
<p>${ language.currentVersion }</p>
<hr>
<hr>
<a href="/edit/${language.id}">Edit</a>
<hr>
<hr>
<a href="/delete/${language.id}">Delete</a>

</div>
</body>
</html>