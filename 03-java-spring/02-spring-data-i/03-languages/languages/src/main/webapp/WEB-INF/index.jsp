<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Languages</title>
</head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<body>
<div class="container">
<table class="table table-dark">
<thead>
<tr>
<td>Name</td>
<td>Creator</td>
<td>Version</td>
<td>Action</td>
</tr>
</thead>
<tbody>
<c:forEach items="${ allLanguages }" var="language">
<tr>
<td>${ language.name }</td>
<td>${ language.creator }</td>
<td>${ language.currentVersion }</td>
<td>
	<a href="/delete/${ language.id }">delete</a>
	<a href="/edit/${ language.id }">edit</a>
</td>
</tr>
</c:forEach>
</tbody>
</table>
<form:form method="POST" action="/addLanguage" modelAttribute="language">
<p>
<form:label path="name">Name
<form:errors path="name"/>
<form:input path="name"/></form:label>
</p>
<p>
<form:label path="creator">Creator
<form:errors path="creator"/>
<form:input path="creator"/></form:label>
</p>
<p>
<form:label path="currentVersion">Version
<form:errors path="currentVersion"/>
<form:input path="currentVersion"/></form:label>
</p>
<button>Submit</button>
</form:form>
</div>
</body>
</html>