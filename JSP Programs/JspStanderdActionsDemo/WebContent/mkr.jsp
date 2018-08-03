 <html>
<body>
	<jsp:include page="header.jsp">
		<jsp:param name="cname" value="Java Learning Cente" />
	</jsp:include>

	This is mkr.jsp home page
	<br> Which shows ${param.branchname} branch details Contact email:
	${param.email }
	<jsp:include page="footer.jsp">
		<jsp:param name="cname" value="Java Learning Center" />
	</jsp:include>
</body>
</html> 