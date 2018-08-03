<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html><body>
<c:import url="header.jsp">
<c:param name="companyName" value="CGI INFO SYSTEMS"/>
</c:import>
<form action="home.jsp" method="post">
<h2>Enter Domain Name</h2>
<input type="text" name="domainName"/>
<h2>Enter Employee Name</h2>
<input type="test" name="employeeName"/>
<input type="submit" value="Submit"/>
</form>
<c:import url="footer.jsp">
<c:param name="companyName" value="CGI info systems"/>
</c:import>
</body></html>