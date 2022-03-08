<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ShoppingListByUser</title>
<style type="text/css">
#container{
width:960px;
    border:30px solid black; 
    margin:50px;
	margin-left:auto;
	margin-right:auto;
    padding:50px; 
    background-color:orange;
}
</style>
</head>
<body id="container">
<form method = "post" action="ListNavigationServlet">
	<table>
		<c:forEach items= "${requestScope.allLists}" var="currentlist">
			<tr>
			<td><input type="radio" name="id" value="${currentlist.id}"></td>
			<td><h2> ${currentlist.listName}</h2></td></tr>
			<tr><td colspan="3">Ship Date: ${currentlist.tripDate}</td></tr>
			<tr><td colspan="3">Shop: ${currentlist.shop.shopName}</td></tr>
		<c:forEach var="listVal" items ="${currentlist.listOfItems}"><tr><td></td><td colspan="3"> ${listVal.itemNumber}, ${listVal.item}
			</td>
			</tr>
		</c:forEach>
	</c:forEach>
	</table>
	<input type="submit" value="edit" name="doThisToList">
	<input type="submit" value="delete" name="doThisToList">
	<input type="submit" value="add" name="doThisToList">
</form>
<a href="AddItemsForListServlet">Create a new Shipping order</a>
<a href="index.html">Insert a new Item</a>

</body>
</html>