<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightgreen">
	<center>
		<h1>BLUE STAR BANK - RAJAJINAGAR, BANGALORE</h1>
	</center>
	<hr>
	NAME: ${sessionScope.NAME}
	<br> ACCOUNT_NUMBER: ${sessionScope.ACCOUNTNUMBER}
	<br>
	<hr />
	MAKE WITHDRAW
	<br />
	<hr />
	<form action='./withdrawresult.do'>
		<table>
			<tr>
				<td>Withdraw amount</td>
				<td><input type='text' name='withdrawamount'></td>
			</tr>
			<tr>
				<td><input type='submit' value='submit'></td>
			</tr>
		</table>
	</form>
</body>
</html>