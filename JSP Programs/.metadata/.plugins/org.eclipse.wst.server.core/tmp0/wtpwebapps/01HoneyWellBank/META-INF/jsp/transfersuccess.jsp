<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<HTML>
<BODY bgcolor='lightgreen'>
	<CENTER>
		<H1>BLUE STAR BANK - RAJAJINAGAR, BANGALORE</H1>
	</CENTER>
	<HR>
	NAME: ${sessionScope.NAME}<BR>
	ACCOUNT_NUMBER: ${sessionScope.ACCOUNTNUMBER}<BR>
	<HR />
<h1>amount has been transfered successfully...</h1>
<FORM ACTION='./finalsignin.do'>
		<TABLE>
			<TR>
				<TD><INPUT TYPE='SUBMIT' VALUE='BACK'></TD>
				<TD><input type='hidden' name='JSESSIONID'
					value='<%=session.getId() %>'></TD>
			</TR>
		</TABLE>
	</FORM>
	<FORM ACTION='./logout.do'>
		<TABLE>
			<TR>
				<TD><INPUT TYPE='SUBMIT' VALUE='LOG OUT'></TD>
			</TR>
		</TABLE>
	</FORM>

</body>
</html>