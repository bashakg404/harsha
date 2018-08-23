
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!-- this include will forward the request to header jsp to display header -->

<%@ include file="/WEB-INF/views/template/header.jsp"%>



<div class="container-wrapper">
	<div class="container">
		<div class="page-header">
			<h1>Edit Product</h1>

			<p class="lead">Please update the Product information here..</p>
		</div>
		<!-- in the video its commondName but above spring5.0 versions its modelAttribute -->
		<form:form action="${pageContext.request.contextPath }/admin/productInventory/editProduct" method="post" 
		modelAttribute="product" enctype="multipart/form-data">
		<form:hidden path="productId" value="${product.productId }"/>
			<div class="form-group">
				<label for="name">Name</label>
				<form:input path="productName" id="name" class="form-control" value="${product.productName }"/>

			</div>
			<div class="form-group">
				<label for="category">Category</label> <label
					class="checkbox-inline"><form:radiobutton
						path="productCategory" id="category" value="instrument" />Instrument</label>
				<label class="checkbox-inline"><form:radiobutton
						path="productCategory" id="category" value="record" />Record</label> 
						<label class="checkbox-inline"><form:radiobutton
						path="productCategory" id="category" value="accessory" />Accessory</label>

			</div>
			<div class="form-group">
			<label for="description" >Description</label>
			<form:textarea path="productDescription" id="description" class="form-control" value="${product.productDescription }"/>
			</div>
			
			<div>
			<div class="form-group">
			<label for="Price">Price</label>
			<form:input path="productPrice" id="price" class="form-control" value="${product.productPrice }"/>
			</div>
			
			<div>
			<div class="form-group" >
			<label for="condition">Condition</label>
			<label class="checkbox-inline"><form:radiobutton
			path="productCondition" id="condition" value="new" />New</label>
			<label class="checkbox-inline"><form:radiobutton
			path="productCondition" id="condition" value="used" />Used</label>
			</div>
			
			<div>
			<div class="form-group" >
			<label for="status">Status</label>
			<label class="checkbox-inline"><form:radiobutton
			path="productStatus" id="status" value="active" />Active</label>
			<label class="checkbox-inline"><form:radiobutton
			path="productCondition" id="condition" value="inactve" />Inactive</label>
			</div>
			
			<div class="form-group">
			<label for="unitInStock">Unit In Stock</label>
			<form:input path="unitInStock" id="unitInStock" class="form-control" value="${product.unitInStock }"/>
			</div>
			
			<div class="form-group">
			<label for="manufacturer">Manufacturer</label>
			<form:input path="productManufacturer" id="manufacturer" class="form-control" value="${product.productManufacturer }"/>
			</div>
			
			<div class="form-group">
			<label class="control-label"for="productImage">Upload Picture</label>
			<form:input id="productImage" path="productImage" type="file" class="form:input-large"/>
			</div>
			
		
			
			
			<br><br>
			<input type="submit" value="Submit" class="bt btn-default"/>
			<a href="<c:url value="/admin/productInventory" />" class="btn btn-default">Cancel</a> 
		</form:form>

		<!-- this include will forward the request to footer to display footer code -->

		<%@ include file="/WEB-INF/views/template/footer.jsp"%>