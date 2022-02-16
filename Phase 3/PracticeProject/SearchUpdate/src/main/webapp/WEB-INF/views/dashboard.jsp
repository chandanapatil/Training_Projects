<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
</head>
<body>
	<div align="center">
		<h1>Dashboard</h1>
		<ul>
			<div modelAttribute="useratt">
				User ID: ${useratt.id}</br>
				Name: ${useratt.name}</br>
				Email: ${useratt.email}</br>
				City: ${useratt.city}
			</div>
		</ul>
	</div>
	<a href="/searchuser">Search Users</a>
</body>
</html>