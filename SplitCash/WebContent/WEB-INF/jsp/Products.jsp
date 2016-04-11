<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
  <head>
  
    <title>Snap Split</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta charset="UTF-8" />
    
    <!-- Bootstrap -->
    <link href="assets/css/bootstrap.min.css" rel="stylesheet" media="screen" />
    
    <!-- Fonts -->
    <link href="http://fonts.googleapis.com/css?family=Bree+Serif" rel="stylesheet" type="text/css" />
    <link href="assets/css/entypo.css" rel="stylesheet" type="text/css" />
    
    <!-- Template CSS -->
    <link href="assets/css/686tees.css" rel="stylesheet" type="text/css" />
    
  </head>
<body>

<div class="container">
  
  <!-- Site Top -->
  
  <div class="row">
  
    <div class="span12">
    
      <ul class="top-nav">
        <li><a href="login.html">Login</a></li>
        <li><a href="register.html">Registration</a></li>
        <li><a href="forgot.html">Lost your password?</a></li>
      </ul>
    
    </div>
  
  </div>
  
  <!-- Header -->
  
  <div class="row">
  
    <div class="span4">
    
      <p class="logo">
        <span class="entypo heart"></span> Split Cash
      </p>
    
    </div>
  
    <div class="span4">
    
      <p class="strapline">
        Dil Ki Deal<br />
        <span>Mil Baant Ke</span>
      </p>
    
    </div>
  
    <div class="span4">
      
      <div class="row">
        
        <div class="span2 offset2 mini-basket">
          
          <p class="mini-basket-title"><a href="basket.html"><span class="entypo cart"></span> Basket</a></p>
          
          <div class="row">
            
            <div class="span1">
              <p class="mini-basket-summary">
                Price<br />
                <span>&#x20B9;0.00</span>
              </p>
            </div>
          
            <div class="span1">
              <p class="mini-basket-summary">
                Items<br />
                <span>0</span>
              </p>
            </div>
          
          </div>
          
        </div>
      
      </div>
      
    </div>
  
  </div>
  
  <!-- Menu -->
  
  <div class="row">
    
    <div class="span12">
    
      <ul class="main-nav clearfix">
      
        <li class="active"><a href="index.html">Products</a></li>
      
      </ul>
    
    </div>
    
  </div>

  <!-- Body -->
  
  <div class="row">
    
    <div class="span12">
    
      <h1>New Products</h1>
    
    </div>
    
  </div>

  <!-- Product Listing -->
  
  <div class="row">
    
    <div class="span4 product-listing">
    
      <p class="title"><a href="product.html">Ibiza Lips</a></p>
      
      <a href="product.html"><img class="image" src="assets/img/product-1.jpg" alt="Ibiza Lips" /></a>
      
      <p class="price">
        &pound; 9.99
        <a class="btn btn-addcart btn-primary" href="basket.html"><span class="entypo cart"></span></a><a class="btn btn-view btn-grey" href="product.html"><span class="entypo search"></span></a>
      </p>
      
    </div>
    
    <div class="span4 product-listing">
    
      <p class="title"><a href="product.html">Ibiza Banana</a></p>
      
      <a href="product.html"><img class="image" src="assets/img/product-2.jpg" alt="Ibiza Banana" /></a>
      
      <p class="price">
        &pound; 9.99
        <a class="btn btn-addcart btn-primary" href="basket.html"><span class="entypo cart"></span></a><a class="btn btn-view btn-grey" href="product.html"><span class="entypo search"></span></a>
      </p>
      
    </div>
    
    <div class="span4 product-listing">
    
      <p class="title"><a href="product.html">I Was There</a></p>
      
      <a href="product.html"><img class="image" src="assets/img/product-3.jpg" alt="I Was There" /></a>
      
      <p class="price">
        &pound; 9.99
        <a class="btn btn-addcart btn-primary" href="basket.html"><span class="entypo cart"></span></a><a class="btn btn-view btn-grey" href="product.html"><span class="entypo search"></span></a>
      </p>
      
    </div>
    
  </div>

  
  <div class="row footer">
  
    <div class="span6">
    
      <ul class="footer-nav">
        <li><a href=""><img src="assets/flags/gb.png" alt="GBP" /></a> &nbsp; <a href=""><img src="assets/flags/us.png" alt="USD" /></a> &nbsp; <a href=""><img src="assets/flags/europeanunion.png" alt="Euro" /></a></li>
        <li><a href="content.html">Terms &amp; Conditions</a></li>
        <li><a href="content.html">Delivery Information</a></li>
        <li><a href="contact.html">Contact</a></li>
      </ul>
    
    </div>
  
    <div class="span6 footer-right">
    
      <p>
        &copy; 686 Tees
      </p>
    
    </div>
  
  </div>
  
</div>

<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="assets/js/bootstrap.min.js"></script>

</body>
</html>