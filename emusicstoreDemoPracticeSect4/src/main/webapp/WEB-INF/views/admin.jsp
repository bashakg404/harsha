<!-- this include will forward the request to header jsp to display header -->

<%@ include file="/WEB-INF/views/template/header.jsp"%>



<div class="container-wrapper">
	<div class="container">
		<div class="page-header">
			<h1>Administrator page</h1>

			<p class="lead">This is the Administrator Page!</p>
		</div>
		<h3>
			<a href="<c:url value="/admin/productInventory" />">Product
				Inventory</a>

		</h3>
		
		<p>Here you can view and modify the inventory!</p>


		<!-- this include will forward the request ro footer to display footer code -->

		<%@ include file="/WEB-INF/views/template/footer.jsp"%>