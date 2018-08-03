<html>
<body>
	<%
		String branchname = request.getParameter("branch");
		if (branchname.equals("MHA")) {
	%>
	<jsp:forward page="mha.jsp">
		<jsp:param name="branchname" value="MHA" />
		<jsp:param name="email" value="mha@jlc.com" />
	</jsp:forward>
	<%
		} else if (branchname.equals("BTM")) {
	%>

	<jsp:forward page="btm.jsp">
	<jsp:param name="branchname" value="BTM" />
	<jsp:param name="email" value="btm@jlc.com" />
	</jsp:forward>
	<%
		}
		else if (branchname.equals("MKR")) {
			%>

			<jsp:forward page="mkr.jsp">
			<jsp:param name="branchname" value="MKR" />
			<jsp:param name="email" value="mkr@jlc.com" />
			</jsp:forward>
			<%}
		
	%>
</body>
</html>