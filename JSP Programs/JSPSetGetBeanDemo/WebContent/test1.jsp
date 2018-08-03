<%-- <%@ page import="com.cgiindia.jsp.Employee"%>
<html>
<body>
	<h1>
		<%
			Employee employee = new Employee();
		System.out.println("=-=-=-=");
			employee.setEid(45);
			employee.setEname("basha");
			employee.setPhone(45678945);
			session.setAttribute("EMPL", employee);
			System.out.println("Attribute Set");
		%>
		 <hr />
		<%
			Employee emplo = (Employee) session.getAttribute("EMPL");
			System.out.println("Attributr Get");
		%>
		Eid:<%=emplo.getEid()%><br /> Ename:<%=emplo.getEname()%><br />
		Phone:<%=emplo.getPhone()%><br /> 
	</h1>
</body>
</html>  --%>