<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="/result">
		<div>
			<label for="full name">Name:</label> <input type="text" name="name"
				required>
		</div>
		<div>
			<label for="location">Dojo Location:</label> <select
				name="Location" required="required">
				<option value="Miami">Miami</option>
				<option value="Seattle">Seattle</option>
				<option value="Chicago">Chicago</option>
				<option value="Los Angeles">Los Angeles</option>
			</select>
		</div>
		<div>
			<label for="lang">Favorite Language:</label> <select
				name="Language" required>
				<option value="Python">Python</option>
				<option value="JavaScript">JavaScript</option>
				<option value="Java">Java</option>
				<option value="MERN">MERN</option>
				<option value="CSS">CSS</option>
			</select>
		</div>
		<div class="comment">
			<p>Comment (optional):</p>
			</div>
			<div>
			<textarea name="Comment"></textarea>
			</div>
		 <input type="submit" name="submit" class="button">
	</form>
</body>
</html>