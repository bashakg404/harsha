<%@page import="com.cgiindia.jsp.Employee"%>
<html>
<body>
	<h1>
		<hr />
		USING Use Bean and Other Tags
		<jsp:useBean id="employee" class="com.cgiindia.jsp.Employee"
			scope="session"></jsp:useBean>
		<jsp:setProperty property="eid" name="employee" value="99" />
		<jsp:setProperty property="ename" name="employee" value="Harsha" />
		<jsp:setProperty property="phone" name="employee" value="5436453723" />
		<br /> Eid:<jsp:getProperty property="eid" name="employee" /><br />
		Name:<jsp:getProperty property="ename" name="employee" /><br /> Phone:<jsp:getProperty
			property="phone" name="employee" />
	</h1>
</body>
</html>