<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE>
<html>
<head>
	<title>Customers List</title>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	<link href="css/add-customer.css" rel="stylesheet" />
	<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Fira+Sans&display=swap" rel="stylesheet">
</head>
<body>
<div id="add_customer">
<div class="add_customer_header d-flex justify-content-between">
	<h3 class="add_customer_heading">ADD CUSTOMER</h3>
	<form action="getCustomerList">
		<button type="submit" class="btn add_customer_cancel">CANCEL</button>
	</form>
</div>
	<div class="col-12 d-flex justify-content-center">
		<div class="col-6">
			<form:form action="addNewCustomer" modelAttribute="customer">
			<form:input hidden="true" class="form-control" type="text" path="customerId"/>
				<div class="form-group">
					<p class="add_customer_label">Customer Name</p>
					<form:input class="form-control" type="text" path="name"/>
				</div>
				<div class="form-group">
					<p class="add_customer_label">Customer Email</p>
					<form:input class="form-control" type="text" path="email"/>
				</div>
				<div class="form-group">
					<p class="add_customer_label">Customer School Name</p>
					<form:input class="form-control" type="text" path="schoolName"/>
				</div>
				<button type="text" class="btn add_customer_submit">ADD CUSTOMER</button>
			</form:form>
		</div>
	</div>
</div>
</body>
</html>