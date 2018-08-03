<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body bgcolor="lightgreen">
	<center>
		<h1>BLUE STAR BANK - RAJAJINAGAR, BANGALORE</h1>
	</center>
	<hr />
	NAME: ${sessionScope.NAME}
	<br> ACCOUNT_NUMBER: ${sessionScope.ACCOUNTNUMBER}
	<br>
	<hr />
	
	<form>
		<center>
			<h2 align="center">
				<u>MINI STATEMENT</u>
			</h2>
			<table border='1'>
				<tr>
					<th>TRANS_ID</th>
					<th>TRANSACTION</th>
					<th>TRANSACTION_DATE</th>
					<th>AMOUNT</th>
					<th>DESCRIPTION</th>
				</tr>
<%-- <c:forEach var="tovalues" items="#{LIST}"></c:forEach> blunder mistake,tag closed there only --%>
				<c:forEach var="a" items="${requestScope.LIST}">
				  
				<tr>
			<td>${a.getTransactionId() }</td>
					<td>${a.getTransactiontype()}</td>
					<td>${a.getDate()}</td>
					<td>${a.getAmount()}</td>
					<td>${a.getDesc()}</td>
				</tr>
				 
				</c:forEach>
			</table>
		</center>
</form>
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