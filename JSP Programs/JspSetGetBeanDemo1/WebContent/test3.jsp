<html>
<body>
	<jsp:useBean id="EMP3" class="com.cgi.jsp.EmplDet" />

	<jsp:setProperty property="eid" name="EMP3"/>
	<jsp:setProperty property="phone" name="EMP3" param="studentphone"/>
	<hr />
	<h1>
		Eid:
		<jsp:getProperty property="eid" name="EMP3" /><br /> Ename:<jsp:getProperty
			property="ename" name="EMP3" /><br /> Phone:<jsp:getProperty
			property="phone" name="EMP3" /><br /> 
	
</body>
</html>