

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<center>
	<h1>Welcome to the HomePage</h1>
	<body>
		<form action="URL Login" method="Post">
		
			<table  border="1" width="30%" cellpadding="3">

				<tr>
					<td>User Name</td>
					<td><input type= "text" name= "username" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				</tr>
				</table>
				<tr>
				<center>
				<input =center type= "Submit" value= "Login" /> </center>
			    <!-- <td> <a href="login.jsp">Login</a></td>
 -->				</tr>
				<tr>
				<td> New User? <a href ="registrationpage.jsp">Register</a></td>
				</tr>
		</form>
		
		
	</body>
</html>
