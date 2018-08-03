<%@page import="java.util.*"%>
<html>
<body>
	<center>
		<h1>JLC Bookstore</h1>
		<h2>Book Search</h2>
		<font color="green" size='6'>${ADDED}</font>
	</center>
	<br/>

	<%
		Object obj = request.getAttribute("MSG");
		if (obj != null) {
	%>
	<br/>
	<center>
		<font color="red" size="6"><%=obj%> </font> <br /> <a
			href="index.jsp"><h2>GO TO SEARCH PAGE</h2></a>
	</center>
	<%
		} else {

			obj = session.getAttribute("BOOKS");
			ArrayList<String> blist = (ArrayList<String>) obj;
			for (String bnm : blist) {
	%>

	<form action="addtocart.jlc" method="post">
		<input type="hidden" name="bname" value="<%=bnm%>" /> <font size='5'><%=bnm%><input
			type="submit" value="ADD TO CART" /></font>
	</form>
	<%
		}
	%>
	<br />
	<form action="showcart.jlc">
		<input type="submit" value="SHOW CART" />
	</form>
	<%
		}
	%>
</body>


</html>