<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<style>
		th, td {
			padding: 10px;
			text-align: center;
		}
	</style>
</head>
<body>
	<h2>Customer Table Demo</h2>
	<hr/><br/>
	<table border="1">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email Address</th>
		</tr>
		<c:forEach var="customer" items="${customer_list}">
		<tr>
			<td>${customer.getFirstName()}</td>
			<td>${customer.getLastName()}</td>
			<td>${customer.getEmail()}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>