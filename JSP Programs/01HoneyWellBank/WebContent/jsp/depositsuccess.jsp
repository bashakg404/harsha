<jsp:directive.page language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" />

<HTML>
<BODY bgcolor="lightgreen">
	<CENTER>
		<H1>BLUE STAR BANK - RAJAJINAGAR, BANGALORE</H1>
	</CENTER>
	<HR />
	NAME: ${sessionScope.NAME}
	<BR /> ACCOUNT_NUMBER: ${sessionScope.ACCOUNTNUMBER}
	<BR />
	<HR />
	<h2>Your amount has been deposited successfully..</h2>
	<h2>Old balance is: ${sessionScope.OLDBALANCE}</h2>
	<h2>Updated balance is: ${sessionScope.UPDATEDBALANCE}</h2>
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
</BODY>
</HTML>