<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body bgcolor="lightgreen">
	<center>
		<h1>BLUE STAR BANK - RAJAJINAGAR, BANGALORE</h1>
	</center>
	<hr/>
	NAME: ${sessionScope.NAME}
	<br> ACCOUNT_NUMBER: ${sessionScope.ACCOUNTNUMBER}
	<br>
	<hr/>
	MAKE TRANSFER
	<br />
	<hr />
	<form action='./transferresult.do'>
		<table>
			<tr>
				<td>Destination Account Number</td>
				<td><input type='text' name='destinationaccountnumber'></td>
			</tr>
			<tr>
				<td>Transfer amount</td>
				<td><input type='text' name='transferamount'></td>
			</tr>
			<tr>
				<td><input type='submit' value='submit'></td>
			</tr>
		</table>
	</form>
</body>
</html>