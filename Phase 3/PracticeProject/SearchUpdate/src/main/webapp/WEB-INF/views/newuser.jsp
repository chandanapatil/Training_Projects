<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add User</title>
</head>
<body>
	<div align="center">
		<h1>Add User</h1>
	
		<form:form modelAttribute="form">
			<form:errors path="" element="div" />
			<div>
				<form:label path="name"> User Name</form:label>
				<form:input path="name" />
				<form:errors path="name" />
	
			</div>
			<div>
				<input type="submit" value="Submit" />
			</div>
		</form:form>
	</div>
</body>
</html>