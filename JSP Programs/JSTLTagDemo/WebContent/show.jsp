<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	<h1>CGI INFO SYSTEM INDIA</h1>
	<table border="2" style="font-size:26;color: red;">

		<tr>
			<td>1) String Wrapper And Date</td>
			<td><c:out value="${requestScope.EMAIL}" /> <br />${sessionScope.PHONE }
				<br />${applicationScope.DOB }<br /></td>
		</tr>

	 <tr>
			<td>2) Collection of String Wrapper Date</td>

			<td><table bgcolor="#c3d599" style="font-size: 26; color: red;">
					<tr>
						<c:forEach var="x" items="${requestScope.ARRAYLIST }">
							<td>${x }</td>
						</c:forEach>
					</tr>
				</table>
				<table bgcolor="wheet" style="font-size: 26; color: red;">
					<tr>
						<c:forEach var="x" items="${sessionScope.STRING }">
							<td>${x }</td>
						</c:forEach>
					</tr>
				</table></td>
		 </tr>
		<tr>
			<td>3)Collections of Collection</td>
			<table bgcolor="#c3d599" style="font-size: 26; color: red;">
				<c:forEach var="arraylist1" items="${requestScope.ARRAYLIST1 }">
					<tr>
						<c:forEach var="x" items="${arraylist1 }">
							<td>${x }</td>
					</tr>
				</c:forEach>
				</tr>
				</c:forEach>
			</table>
			</td>
		</tr>

	 <tr>
			<td>4)Customer or User Defined Class Object</td>
			<td>Cid:${CUSTOMER.customerid } <br />
				Cname:${sessionScope.CUSTOMER.customername} <br />
				Email:${sessionScope.CUSTOMER.email} <br />
				Phone:${sessionScope.CUSTOMER.phone} <br />
				Accno:${sessionScope.CUSTOMER.account.accountnumber} <br />
				AccType:${sessionScope.CUSTOMER.account.accounttype} <br />
				Bal:${sessionScope.CUSTOMER.account.accountbalance} <br />
				Street:${sessionScope.CUSTOMER.account.address.street} <br />
				City:${sessionScope.CUSTOMER.account.address.city} <br />
		<tr>
			<td>5) Collection of User Defined Object</td>
			<table bgcolor="wheet" style="font-size:26; color:red;">
				<tr>
					<td>Cid</td>
					<td>Cname</td>
					<td>Email</td>
					<td>Phone</td>
					<td>AccNo</td>
					<td>AccType</td>
					<td>Street</td>
					<td>City</td>
				</tr>
				<c:forEach var="customer" items="${sessionScope.CUSTOMERS }">
					<tr>
						<td>${customer.customerid }</td>
					<tr>
						<td>${customer.customername }</td>
					<tr>
						<td>${customer.email }</td>
					<tr>
						<td>${customer.phone }</td>
					<tr>
						<td>${customer.account.accountnumber }</td>
					<tr>
						<td>${customer.account.accounttype }</td>
					<tr>
						<td>${customer.account.accountbalance}</td>
					<tr>
						<td>${customer.account.address.street }</td>
					<tr>
						<td>${customer.account.address.city }</td>
					</tr>
				</c:forEach>
			</table>
			</td>
		</tr>
		
	<tr><td>6) Map Object</td>
			<table bgcolor="#c3d599" style="font-size: 26; color: red;">
			<tr><td>Map Key</td>
			<td>Map Value</td></tr>
			
			<c:forEach var="entry" items="${sessionScope.HASHMAP }">
			<tr><td>${entry.key }</td>
			<td>${entry.value }</td></tr>
			</c:forEach></table></td></tr>
			
			 <tr><td>7) Collection of Map Object</td>
			<table bgcolor="#c3d599" style="font-size: 26; color: red;">
				<c:forEach var="map" items="${requestScope.ARRAYLIST2 }">
				<table bgcolor="#c3d599" style="font-size: 26; color: red;">
			<tr><td>Map Key</td>
			<td>Map Value</td></tr>
			<c:forEach var="entry" items="${map }">
			<tr><td>${entry.key }</td><td>${entry.value }</td></tr>
			</c:forEach>
			</table>
			</td></tr>
			</c:forEach>
			</table>
			</td></tr>
</body>
</html>