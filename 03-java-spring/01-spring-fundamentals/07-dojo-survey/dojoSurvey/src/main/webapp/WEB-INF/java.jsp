<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="/">
		<div class="comment">
			<p>Submitted Info</p>
		</div>
		<div>
			<label>Name:</label>
			<c:out value="${name}" />
		</div>
		<div>
			<label>Location:</label>
			<c:out value="${Location}" />
		</div>
		<div>
			<label>Favorite language:</label>
			<c:out value="${lang}" />
		</div>
		<div class="space">
			<label>Comment:</label>
			<c:out value="${Comment}" />
		</div>
		<input type="submit" name="submit" class="button">
	</form>

	<h2>You are worthy!</h2>
</body>
</html>