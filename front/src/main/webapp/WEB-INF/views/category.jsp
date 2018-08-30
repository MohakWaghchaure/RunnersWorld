<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
   
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>categories</title>
</head>
<body>
	<div id="head">
	<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
	</div><br>	
	
	<div class="container">
	<h3>CATEGORIES</h3><hr>
	
	<form:form method="POST" modelAttribute="category" action="/front/category" accept-charset="utf-8" class="form">
	<div class="form-group">
		<label for="cId">ID:</label>
		<form:input path="cId" class="form-control"></form:input>
	</div>
	<div class="form-group">
		<label for="cName">NAME:</label>
		<form:input path="cName" class="form-control"></form:input>
	</div>
	<div class="form-group">
		<label for="cSz">SIZE:</label>
		<form:input path="cSz" class="form-control"></form:input>
	</div>
	<div class="form-group">
		<label for="cGen">GENDER:</label>
		<form:input path="cGen" class="form-control"></form:input>
	</div>
	<div class="form-group">
		<label for="cCol">COLOR</label>
		<form:input path="cCol" class="form-control"></form:input>
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
		<th>NAME</th>
		<th>SIZE</th>
		<th>GENDER</th>
		<th>COLOR</th>
		
		
	</tr>
	<c:forEach var="i" items="${listcat}">
		<tr>
			<td>${i.cId}</td>
			<td>${i.cName}</td>
			<td>${i.cSz}</td>
			<td>${i.cGen}</td>
			<td>${i.cCol}</td>
			
			<td><a href="UpdateProduct${i.pId}" class="btn btn-success">Update</a></td>
			<td><a href="DeleteProduct${i.pId}" class="btn btn-success">Delete</a></td>
		</tr>
	</c:forEach>
	</table>

</body>
</html>