<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>

  <style>
.bg { 
    /* The image used */
    background-image: url("img/rimg.jpg");

    /* Full height */
    height: 100%; 

    /* Center and scale the image nicely */
    background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
}            
</style>
</head>
<body class="bg">

	<div id="head">
	<jsp:include page="header.jsp"></jsp:include>
	</div>
	
	<div class="bg">
	<div class="container"><br>
	<div class="col-xs-4">
  <form action="/" method="get">
  <h2>LOGIN</h2><hr>
    <div class="form-group">
      <label for="username">USERNAME:</label>
      <input type="text" class="form-control" placeholder="Enter username">
    </div>
    <div class="form-group">
      <label for="pwd">PASSWORD:</label>
      <input type="password" class="form-control"  placeholder="Enter password">
    </div>
    <div class="checkbox">
      <label><input type="checkbox" name="remember"> Remember me</label>
    </div>
    <button type="submit" class="btn btn-default">LOGIN</button>
    <button type="reset" class="btn btn-cancel">CANCEL</button>
  </form><hr>
</div>

</div>
</div>	
	
</body>
</html>