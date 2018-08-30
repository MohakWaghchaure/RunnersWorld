<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>sign up</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  
<style>
.bg { 
    /* The image used */
    background-image: url("img/rimg1.jpg");

    /* Full height */
    height: 100%; 

    /* Center and scale the image nicely */
    background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
}            
</style>

</head>
<body>
	<div id="head">
	<jsp:include page="header.jsp"></jsp:include>
	</div>
	<div class="bg">
	<div class="container"><br>
	<div class="col-xs-4">
  <form:form  action="/front/authSignUp" modelAttribute="userInfo"  method="post" accept-charset="utf-8" class="form">
  <h2>SIGN UP</h2><hr>
    <div class="form-group">
      <label for="name">NAME:</label>
      <form:input type="text" path="uName" class="form-control" placeholder="Enter name"/>
    </div>
     <div class="form-group">
      <label for="email">EMAIL:</label>
      <form:input type="email" path="uEmail" class="form-control" placeholder="Enter email"/>
    </div>
     <div class="form-group">
      <label for="username">USERNAME:</label>
      <form:input type="text" path="uUsername" class="form-control" placeholder="Enter username"/>
    </div>
    <div class="form-group">
      <label for="pwd">PASSWORD:</label>
      <form:input type="password" path="uPassward" class="form-control" placeholder="Enter password"/>
    </div>
    <div class="form-group">
      <label for="pwd">CONFIRM PASSWORD:</label>
      <input type="password" class="form-control" placeholder="confirm password"/>
    </div>
    <div class="form-group">
      <label for="pwd">PHONE:</label>
      <form:input type="text" path="uCon" class="form-control" placeholder="Enter Phone No."/>
    </div>
    <div class="form-group">
      <label for="pwd">ADDRESS:</label>
      <form:input type="text" path="uAdd" class="form-control" placeholder="Enter address"/>
    </div>
    <hr>
    <button type="submit" class="btn btn-default">SIGNUP</button>
    <button type="reset" class="btn btn-cancel">CANCEL</button>
    <hr>
  </form:form>
  </div>
</div>
</div>	
	
	<div id="foot">
	<jsp:include page="/WEB-INF/views/footer.jsp"></jsp:include>
	</div>
	
</body>
</html>