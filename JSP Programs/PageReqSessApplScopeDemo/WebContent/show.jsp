<html>
<body>
	<h1>CGI INFO SYSTEMS</h1>
	<table>
		<tr>
			<td>1)String Wrapper Date****</td> ${requestScope.EMAIL }
			<br /> ${sessionScope.PHONE }
			<br /> ${applicationScope.DOB }
			<br />
			</td>
		</tr>



		<tr>
			<td>2) Collections of String Wrapper and Date****</td>
			${requestScope.ARRAYLIST[0] }
			<br /> ${requestScope.ARRAYLIST[1] }
			<br /> ${requestScope.ARRAYLIST[2] }
			<br /> ${requestScope.ARRAYLIST[3] }
			<br /> ${requestScope.ARRAYLIST[4] }
			<br /> ${sessionScope.STRING[0] }
			<br /> ${sessionScope.STRING[1] }
			<br /> ${sessionScope.STRING[2] }
			<br /> ${sessionScope.STRING[3] }
			<br /> ${sessionScope.STRING[4] }
			<br />
			</td>
		</tr>

		<tr>
			<td>3) Collections of Collection (**JSTL)****</td>
			<td>Coming soon</td>
		</tr>

		<tr>
			<td>4) Custom or User Defined class Object****</td>
			<td>Cid: ${CUSTOMER.customerid} <br />
				Cname:${requestScope.CUSTOMER.customername}<br />
				Email:${requestScope.CUSTOMER.email}<br />
				Phone:${requestScope.CUSTOMER.phone}<br />
				Accno:${requestScope.CUSTOMER.account.accountnumber}<br />
				AccType:${requestScope.CUSTOMER.account.accounttype}<br />
				Balance:${requestScope.CUSTOMER.account.balance}<br />
				Street:${requestScope.CUSTOMER.account.address.street}<br />
				City:${requestScope.CUSTOMER.account.address.city}<br /></td>
		</tr>

		<tr>
			<td>5)Collection of User Defined class Object*****</td>

			<td>Cid:${CUSTOMERS[0].customerid } <br />
				Cname:${sessionScope.CUSTOMERS[0].customername} <br />
				Email:${sessionScope.CUSTOMERS[0].email} <br />
				Phone:${sessionScope.CUSTOMERS[0].phone} <br />
				Accno:${sessionScope.CUSTOMERS[0].account.accountnumber} <br />
				AccType:${sessionScope.CUSTOMERS[0].account.accounttype} <br />
				Balance:${sessionScope.CUSTOMERS[0].account.accountbalance} <br />
				Street:${sessionScope.CUSTOMERS[0].account.address.street} <br />
				City:${sessionScope.CUSTOMERS[0].account.address.city} <br />
			</td>
		</tr>

		<td>
		<tr>
			6) Map Object****
			</td>

			<td>Sid:${sessionScope.HASHMAP["sid"] }<br />
				Sname:${sessionScope.HASHMAP["sname"] }<br />
				Email:${sessionScope.HASHMAP["email"] }<br /></td>
		</tr>

		<td>
		<tr>
			7) Collection of Map Object(*JSTL)****
			</td>
			<td>coming soon</td>
		</tr>

	</table>
</body>
</html>