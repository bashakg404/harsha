<html>
<body>
	<jsp:include page="header.jsp">
		<jsp:param name="cname" value="Java Learning Center" />
		</jsp:include>
		<form action="test.jsp">
			<h1>Select the Branch</h1>
		    <select name="branch">
			<option value="MHA">Marat halli</option>
			<option value="BTM">BTM Layout</option>
			<option value="MKR">Mathikere</option>
			</select>
			<input type="submit" value="submit"/></form>
			<jsp:include page="footer.jsp">
			<jsp:param name="cname" value="Java Learning Center"/>
			</jsp:include>
		</form></body>
</html>