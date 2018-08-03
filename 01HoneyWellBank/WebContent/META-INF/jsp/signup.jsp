<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="./javascript/formvalidation.js"></script>
</head>
<body bgcolor="skyblue">
<form action='./newcust.do' name='myform' onsubmit='return(validate())'>
		
			<h1>Enter your details:</h1>
			<table>
			<tr>
			<td>Name</td>
			<td><input type='text' name='name'></td>
			</tr>
			<tr>
			<tr>
			<td>User name</td>
			<td><input type='text' name='username'></td>
			</tr>
			
			<tr>
			<td>Password</td>
			<td><input type='password' name='password'></td>
			</tr>
			<tr>
			<td>Amount</td>
			<td><input type='text' name='amount'></td>
			</tr>
			<tr>
			<td>EmailId</td>
			<td><input type='text' name='emailid'></td>
			</tr>
			
			<tr>
			<td colspan='2' align='center'><input type='submit' value='Submit'></td>
			</tr>
			</table>
			</form>
</body>
</html>