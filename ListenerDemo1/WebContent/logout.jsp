<%@page session="false"%>
<html><body>
<h1> Java Learning Center</h1>
<table align='right'>
<td><tr>
<h1>Total Visited:<%=application.getAttribute("TV") %></h1></td></tr>
<td><tr>
<h1>Total Visited:<%=application.getAttribute("TA") %></h1></td></tr>
</table><br/><br/>
<h1>You have Logged out Successfully</h1>
<br/><br/>
<a href="index,jsp">Go To Index Page</a>
</body></html>