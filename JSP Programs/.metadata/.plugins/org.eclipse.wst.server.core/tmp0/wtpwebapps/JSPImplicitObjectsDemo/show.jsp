<html>
<body>
	<h1>CGI INFORMATION SYSTEM INDIA</h1>
	<table>
		<tr>
			<td>Employee Name</td>
			<td>${param.sname }</td>
		</tr>
		<tr>
			<td>Primary Email</td>
			<td>${paramValues.email[0] }</td>
		</tr>
		<tr>
			<td>Secondary Email</td>
			<td>${paramValues.email[1] }</td>
		</tr>
		<tr>
			<td>Host</td>
			<td>${header.host}</td>
		</tr>
		<tr>
			<td>Referer</td>
			<td>${header.referer }</td>
		</tr>
		<tr>
			<td>JSessionID Cookie</td>
			<td>${cookie.JSESSIONID.value }</td>
		</tr>
		<tr>
			<td>Email Cookie</td>
			<td>${cookie.email.value }</td>
		</tr>
		<tr>
			<td>Phone Cookie</td>
			<td>${cookie.phone.value }</td>
		</tr>
		<tr>
			<td>CP :State</td>
			<td>${initParam.state }</td>
		</tr>
		<tr>
			<td>CP :City</td>
			<td>${initParam.city }</td>
		</tr>
		<tr>
			<td>USING PAGE CONTEXT</td>
			<td>${pageContext.session.id }<br />

				${pageContext.request.remoteAddr }<br />
				${pageContext.request.method }<br />
				${pageContext.request.requestURI }<br />
				${pageContext.response.contentType } <br /></td>
		</tr>

	</table>

</body>
</html>