<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html><body>
	<c:forEach var="aCustomer" items="${customer_list}">
		${aCustomer} <br/>
	</c:forEach>
</body></html>