<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
     
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>suppliers</title>
</head>
<body>
	<div id="head">
	<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
	</div><br>
	
	<div class="container">
	<h3>SUPPLIERS</h3><hr>
	
	<form:form method="POST" modelAttribute="supplier" action="/front/supplier" accept-charset="utf-8" class="form">
	<div class="form-group">
		<label for="sId">ID:</label>
		<form:input path="sId" class="form-control"></form:input>
	</div>
	<div class="form-group">
		<label for="sName">SUPPLIER:</label>
		<form:input path="sName" class="form-control"></form:input>
	</div>
	<div class="form-group">
		<label for="sAddress">ADDRESS:</label>
		<form:input path="sAddress" class="form-control"></form:input>
	</div>
	<div class="form-group">
		<label for="sCont">CONTACT:</label>
		<form:input path="sCont" class="form-control"></form:input>
	</div>
	<div class="form-group">
		<label for="sEmail">EMAIL:</label>
		<form:input path="sEmail" class="form-control"></form:input>
	</div>
	<hr>
    <button type="submit" class="btn btn-default">ADD</button>
    <button type="reset" class="btn btn-cancel">CANCEL</button>
    <hr>
	</form:form>
	</div>
	
	<br>
	<table class="table table-bordered">
	<tr>
		<th>ID</th>
		<th>SUPPLIER</th>
		<th>ADDRESS</th>
		<th>CONTACT</th>
		<th>EMAIL</th>
		
		
	</tr>
	<c:forEach var="i" items="${ListCategory}">
		<tr>
			<td>${i.sId}</td>
			<td>${i.sName} </td>
			<td>${i.sAddress}</td>
			<td>${i.sCont}</td>
			<td>${i.sEmail}</td>
			
			<td><a href="UpdateProduct${i.sId}" class="btn btn-success">Update</a></td>
			<td><a href="DeleteProduct${i.sId}" class="btn btn-success">Delete</a></td>
		</tr>
	</c:forEach>
	</table>
	
</body>
</html>