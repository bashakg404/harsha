<%@page isELIgnored="false"%>
<html>
<body>
	<center>
		<h1>CGI Developement Team</h1>
		<h2>Login Form</h2>
		<font color=red size=5> ${MSG }</font>
		<form action="login.cgi" method="post">
			<table>
				<td>Username</td>
				<td><input type="text" name="username" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Login" /></td>
				</tr>
			</table>
		</form>
		<h2>
			<a href="register.jsp">New User SignUp</a>|<a href="forgotpw.jsp">Forgot
				My Password</a>
		</h2>
	</center>
</body>
</html>