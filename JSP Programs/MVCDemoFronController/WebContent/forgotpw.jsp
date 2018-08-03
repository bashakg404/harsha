<%@ page isELIgnored="false"%>
<html>
<body>
	<center>
		<h1>CGI Developement Team</h1>
		<h2>Password Assistance Form</h2>
		<font color=red size=5> ${MSG }</font>
		<form action="forgotpw.cgi" method="post">
			<table>
				<tr>
					<td>Email Id</td>
					<td><input type="text" name="email" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="submit" /></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>