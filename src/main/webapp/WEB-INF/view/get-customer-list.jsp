<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
	<title>Customers List</title>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	<link href="css/get-customer.css" rel="stylesheet" />
	<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Fira+Sans&display=swap" rel="stylesheet">
</head>
	<body>
	<div id="customerlist">
	<div class="customer_list_head_wrapper d-flex justify-content-between">
	<h3 class="customer_list_heading">CRM CUSTOMERS LIST</h3>
	<form action="addCustomer">
		<button type="submit" class="btn customer_list_add_customer">ADD CUSTOMER</button>
	</form>
	</div>
	<c:choose>
	<c:when test="${customerList.size()>0}">
	<table class="customer_list_table">
  		<tr class="customer_list_table_row">
		  <th class="customer_list_table_head">Customer Id</th>
		  <th class="customer_list_table_head">Customer Name</th>
		  <th class="customer_list_table_head">Customer Email</th>
		  <th class="customer_list_table_head">Customer School</th>
		  <th class="customer_list_table_head">Manage Customer</th>
  		</tr>
		<c:forEach items ="${customerList}" var = "customer">
		<tr class="customer_list_table_row">
			<td class="customer_list_table_column">${customer.getCustomerId()}</td>
			<td class="customer_list_table_column">${customer.getName()}</td>
			<td class="customer_list_table_column">${customer.getEmail()}</td>
			<td class="customer_list_table_column">${customer.getSchoolName()}</td>
			<td class="d-flex customer_list_table_column">
				<form action="addCustomer" method="GET">
					<input type="text" value="${customer.getCustomerId()}" name="candidateId" hidden />
					<button type="submit" class="customer_list_button"><i class="fa fa-pencil" style="font-size:24px"></i></button>
				</form>
				<form action="deleteCandidate" method="GET">
					<input type="text" value="${customer.getCustomerId()}"  name="candidateId" hidden />
					<button type="submit" class="customer_list_button"><i class="fa fa-trash-o" style="font-size:24px"></i></button>
				</form>
			</td>
		</tr>
		</c:forEach>
		</c:when>
			<c:otherwise>
				<p class="no_customer_text">No Customers Found</p>
			</c:otherwise>
		</c:choose>
	</table>
	</div>
	</body>
</html>