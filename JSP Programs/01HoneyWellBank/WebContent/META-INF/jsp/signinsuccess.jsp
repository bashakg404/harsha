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
	<TABLE>
		<TR>
			<TD>
				<FORM ACTION='./deposit.do'>
					<INPUT TYPE='SUBMIT' VALUE='DEPOSIT'>
				</FORM>
				<FORM ACTION='./transfer.do'>
					<INPUT TYPE='SUBMIT' VALUE='TRANSFER'>
				</FORM>
				<FORM ACTION='./withdraw.do'>
					<INPUT TYPE='SUBMIT' VALUE='WITHDRAW'>
				</FORM>
				<FORM ACTION='./balanceresult.do'>
					<INPUT TYPE='SUBMIT' VALUE='BALANCE'>
				</FORM>
				<FORM ACTION='./ministatement.do'>
					<INPUT TYPE='SUBMIT' VALUE='MINI STATEMENT'>
				</FORM>
				<FORM ACTION='./logout.do'>
					<INPUT TYPE='SUBMIT' VALUE='LOGOUT'>
				</FORM>
			</TD>
		</TR>
	</TABLE>
	<HR/>
</BODY>
</HTML>
