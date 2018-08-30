<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>products</title>
</head>
<body>
	<div id="head">
	<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
	</div><br>
		
	<div class="container">
	<h3>PRODUCTS</h3><hr>
	
	<form:form method="POST" modelAttribute="product" action="/front/product" accept-charset="utf-8" class="form">
	<div class="form-group">
		<label for="pId">ID:</label>
		<form:input path="pId" class="form-control"></form:input>
	</div>
	<div class="form-group">
		<label for="pName">NAME:</label>
		<form:input path="pName" class="form-control"></form:input>
	</div>
	<div class="form-group">
		<label for="pDesc">DESCRIPTION:</label>
		<form:input path="pDesc" class="form-control"></form:input>
	</div>
	<div class="form-group">
		<label for="pPrice" >PRICE</label>
		<form:input path="pPrice" class="form-control"></form:input>
	</div>
	
	<div class="form-group">
		<label for="cId" >CATEGORY ID</label>
		<form:select path="cId" class="form-control"></form:select>
	</div>
	<div class="form-group">
		<label for="sId" >SUPPLIER ID</label>
		<form:select path="sId" class="form-control"></form:select>
	</div>
	
	
	<hr>
    <button type="submit" class="btn btn-default">ADD</button>
    <button type="reset" class="btn btn-cancel">CANCEL</button>
    <hr>
	</form:form>
	
	<br>
<table class="table table-bordered">
	<tr>
		<th>ID</th>
		<th>NAME</th>
		<th>DESCRIPTION</th>
		<th>PRICE</th>
		
		
	</tr>
	<c:forEach var="i" items="${ListProduct}">
		<tr>
			<td>${i.pId}</td>
			<td>${i.pName} </td>
			<td>${i.pDesc}</td>
			<td>${i.pPrice}</td>
			
			
			<td><a href="UpdateProduct${i.pId}" class="btn btn-success">Update</a></td>
			<td><a href="DeleteProduct${i.pId}" class="btn btn-success">Delete</a></td>
		</tr>
	</c:forEach>
	</table>
	
</body>
</html>