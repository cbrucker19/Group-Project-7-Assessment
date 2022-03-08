<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create a new List</title>
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
<form action="CreateNewListServlet" method="post">
Receiving Manager Name: <input type="text" name="listName"><br/>
Ship Date: <input type="text" name="month" placeholder="mm" size="4">
<input type="text" name="day" placeholder="dd" size="4">
<input type="text" name="year" placeholder="yyyy" size="4">
Shop Name: <input type="text" name = "shopName"><br/>

Available Items: <br/>
<select name="allItemsToAdd" multiple size="6">
<c:forEach items="${requestScope.allItems}" var="currentitem">
	<option value="${currentitem.id}">${currentitem.itemNumber} | ${currentitem.item }</option>
</c:forEach>
</select>
<br/>

<input type="submit" value="Create List and Add Items">
</form>

<a href="index.html">Go add new Items Instead</a>

</body>
</html>