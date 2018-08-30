<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RUNNERSWORLD.com</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script>
      
  </script>
</head>
<body>
<nav class="navbar-default  navbar-top">
	 <div class="container-fluid">
	  <ul class="nav navbar-nav">
	  
	  <h1><b>RUNNER'S<small> WORLD</small></b></h1>
	<br>
	  	<li ><a href="${pageContext.request.contextPath}/index">HOME</a></li>
	  	
	  	<li ><a href="#">ABOUT US</a></li>
	  	
	  	<li ><a href="#">MEN</a></li>
      	
      	<li> <a href="#">WOMEN</a></li>     	
      	
      	<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">PRODUCTS<span class="caret"></span></a>
        	<ul class="dropdown-menu">
          	<li><a href="#">TSHIRTS</a></li>
          	<li><a href="#">SHORTS</a></li>
          	<li><a href="#">SHOES</a></li>
          	<li><a href="#">JACKETS</a></li>
          	<li><a href="#">TRACKS</a></li>
          	<li><a href="#">TIGHTS</a></li>
        	</ul>
      	</li>
      	
      	<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">BRAND<span class="caret"></span></a>
        	<ul class="dropdown-menu">
          	<li><a href="#">NIKE</a></li>
          	<li><a href="#">ADIDAS</a></li>
           	<li><a href="#">PUMA</a></li>
          	<li><a href="#">REEBOK</a></li>
        	</ul>
      	</li>
	  </ul>
	  <ul class="nav navbar-nav navbar-right">
	 	<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Admin<span class="caret"></span></a>
	 		<ul class="dropdown-menu">
          	<li><a href="${pageContext.request.contextPath}/product">product</a></li>
          	<li><a href="${pageContext.request.contextPath}/category">category</a></li>
           	<li><a href="${pageContext.request.contextPath}/supplier">supplier</a></li>          	
        	</ul>
	 	</li>	 	
      	<li><a href="${pageContext.request.contextPath}/authSignup"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      	<li><a href="${pageContext.request.contextPath}/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      	<li><a href="#"><span class="glyphicon glyphicon-search"></span> search</a></li>
      	<li><a href="${pageContext.request.contextPath}/cart"><span class="glyphicon glyphicon-shopping-cart"></span> cart</a></li>
      	
    </ul>
	 </div>
</nav>  
	

</body>
</html>