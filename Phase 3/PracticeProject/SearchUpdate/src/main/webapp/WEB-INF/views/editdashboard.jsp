<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Dashboard</title>
</head>
<body>
	<div align="center">
		<h1>Edit Dashboard</h1>
		 <form:form action="save" method="post" modelAttribute="edituser">
	            <table border="0" cellpadding="5">
	                <tr>
	                    <td>ID: </td>
	                    <td>${edituser.id}
	                        <form:hidden path="id"/>
	                    </td>
	                </tr>       
	                <tr>
	                    <td>Name: </td>
	                    <td><form:input path="name" /></td>
	                </tr>
	                <tr>
	                    <td>Email: </td>
	                    <td><form:input path="email" /></td>
	                </tr>
	                <tr>
	                    <td>City: </td>
	                    <td><form:input path="city" /></td>
	                </tr>
	                <tr>
	                    <td colspan="2"><input type="submit" value="Save"></td>
	                </tr>                   
	            </table>
	        </form:form>
	 </div>
</body>
</html>