<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
<c:import url="header.jsp">
<c:param name="companyName" value="CGI INFO SYSTEMS"/>
</c:import>

<h1>This is jdbc.jsp</br>
Hello! ${param.employeeName }, </br>
You have Serlected ${param.domName }</h1>
<c:import url="footer.jsp">
<c:param name="companyName" value="CGI info Systems"/>
</c:import>
</body>
</html>