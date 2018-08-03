<jsp:directive.page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"/>

<HTML>
<BODY bgcolor="lightgreen">
	<CENTER><H1>BLUE STAR BANK - RAJAJINAGAR, BANGALORE</H1></CENTER>
	<HR/>
	NAME: ${sessionScope.NAME}<BR/>
	ACCOUNT_NUMBER: ${sessionScope.ACCOUNTNUMBER}<BR/>
	<HR/>
	<h2>${requestScope.MSG}</h2>
</BODY>
</HTML>