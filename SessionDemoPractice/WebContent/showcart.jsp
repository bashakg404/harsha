<%@page import="java.util.*"%>
<html>
<body>
	<center>
		<h1>JLC Bookstore</h1>
		<h2>Book Search</h2>
	</center>
	<%
		Object obj = request.getAttribute("MSG");
		if (obj != null) {
	%>
	<br />
	<center>
		<font color="red" size="6"><%=obj%> </font>

	</center>
	<%
		} else {

			obj = request.getAttribute("CART");
			ArrayList<String> blist = (ArrayList<String>) obj;
			for (String bnm : blist) {
	%>

	<form action="removefromcart.jlc" method="post">
		<input type="hidden" name="bname" value="<%=bnm%>" /> <font size='5'><%=bnm%><input
			type="submit" value="REMOVE FROM CART" /></font>
	</form>

	<%
		}
	%>
	<br />
	<center>
		<a href="placeorder.jsp">PLACE ORDER</a>
	</center>
	<%
		}
	%><center>
		<br /> <a href="showbooks.jsp">ADD TO CART</a>
	</center>
</body>


</html>