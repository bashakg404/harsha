<html>
<body>
	<center>
		<h1>JLC Bookstore</h1>
		<h2>Book Search</h2>
		<form action="searchbooks.jlc" method="post">
			<table>
				<tr>
					<td><h2>Select Category</h2></td>
				</tr>
				<tr>
					<td><select name="category">
							<option value="select">select</option>
							<option value="Java">Java</option>
							<option value="Testing">Testing</option>
							<option value=".NET">.NET</option>
							<option value="SAP">SAP</option>
					</select></td>
				</tr>
				<tr>
					<td><input type="submit" value="SearchBooks" /></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>