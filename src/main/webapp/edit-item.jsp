<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editing an item</title>
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
	<form action="EditItemServlet" method="post">
	Item Number: <input type="text" name="itemNumber" value="${itemToEdit.itemNumber}"><br/>
	Item: <input type="text" name="item" value="${item.toEdit.item}"><br/>
	<input type="hidden" name="id" value="${itemToEdit.id}">
	<input type="submit" value="Saved Edited Item">
	</form>
</body>
</html>