<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
   .color{
   color:black;
   }
  </style> 
</head>
<body>

	<div class="container"> 
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
      <li data-target="#myCarousel" data-slide-to="4"></li>
      <li data-target="#myCarousel" data-slide-to="5"></li>
      <li data-target="#myCarousel" data-slide-to="6"></li>
      <li data-target="#myCarousel" data-slide-to="7"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
        <img src="img/run1.jpg" alt="img" style="width:100%; height:650px">         
      </div>

	<div class="item">
        <img src="img/khart.jpeg" alt="img" style="width:100%; height:650px">
        <div class="carousel-caption">
        	<h1>DON'T HIT THE WALLS, HIT THE ROADS... </h1>
     	</div>
      </div>
      
       <div class="item">
        <img src="img/shoe.jpg" alt="img" style="width:100%; height:650px">
        <div class="carousel-caption">
        	<h1>TOP BRANDS</h1>
     	</div>
      </div>
      
      <div class="item">
        <img src="img/run56.jpg" alt="img" style="width:100%; height:650px">
        <div class="carousel-caption">
        	<h1 class="color">BEST ACCESSORIES</h1>
     	</div>
      </div>

      <div class="item">
        <img src="img/ac.jpg" alt="img" style="width:100%; height:650px">
        <div class="carousel-caption">
        	<h1>PICK YOUR COLOUR</h1>
     	</div>
      </div>
    
      <div class="item">
        <img src="img/run34.jpeg" alt="img" style="width:100%; height:650px">
        <div class="carousel-caption">
        	<h1>CLOTHNG</h1>
     	</div>
      </div>
      
       <div class="item">
        <img src="img/run42.jpg" alt="img" style="width:100%; height:650px">
        <div class="carousel-caption">
        	<h1 class="color">JACKETS</h1>
     	</div>
      </div>
      
       <div class="item">
        <img src="img/run90.jpg" alt="img" style="width:100%; height:650px">
        <div class="carousel-caption">
        	<h1>COMPRESSON TIGHTS</h1>
     	</div>
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>


</body>
</html>