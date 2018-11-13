<%-- 
    Document   : chooseyourtype
    Created on : 11 Oct, 2018, 1:03:20 AM
    Author     : jyoti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

   <html>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href="https://fonts.googleapis.com/css?family=Paytone+One" rel="stylesheet">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://www.w3schools.com/lib/w3-theme-indigo.css">

  
  
  
<style>
     
       
body {margin:0;height:2000px;

}

.icon-bar {
  position: fixed;
  float: right;
  top: 90%;
  -webkit-transform: translateY(30%);
  -ms-transform: translateY(30%);
  transform: translateY(30%);
}

.icon-bar a {
  display: block;
  text-align: center;
  padding: 16px;
  transition: all 0.3s ease;
  color: white;
  font-size: 20px;
  float: right;
}

.icon-bar a:hover {
  background-color: #000;
  float: right;
}

.facebook {
  background: #3B5998;
  color: white;
  float: right;
}

.twitter {
  background: #55ACEE;
  color: white;
  float: right;
}

.google {
  background: #dd4b39;
  color: white;
  float: right;
}

.linkedin {
  background: #007bb5;
  color: white;
  float: right;
}

.youtube {
  background: #bb0000;
  color: white;
  float: right;
}

.content {
  margin-left: 75px;
  font-size: 30px;
}

body, html {
    height: 100%;
    margin: 0;
    font-family: Arial, Helvetica, sans-serif;
   background-color: gainsboro;
   background-image: url("image/portal.jpg");
   background-size: cover;
}

.hero-image {
  background-image: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)), url("image/sign1.jpg");
  height: 50%; width:50%;
  background-position: left;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
  
}
.hero-image2{
     background-image: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)), url("image/patient.jpg");
  height: 50%; width:50%;
  background-position: right;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
    float: right;
}

.hero-text {
  text-align: center;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  color: white;
}

.hero-text button {
  border: none;
  outline: 0;
  display: inline-block;
  padding: 10px 25px;
  color: black;
  background-color: #ddd;
  text-align: center;
  cursor: pointer;
}

.hero-text button:hover {
  background-color: #555;
  color: white;
}
.well{
    background-color:gainsboro;
}
a.button {
    -webkit-appearance: button;
    -moz-appearance: button;
    appearance: button;

    text-decoration: none;
    color: initial;
}
</style>
<body>
    
    
    
<div class="icon-bar">
  <a href="#" class="facebook"><i class="fa fa-facebook"></i></a> 
  <a href="#" class="twitter"><i class="fa fa-twitter"></i></a> 
  <a href="#" class="google"><i class="fa fa-google"></i></a> 
  <a href="#" class="linkedin"><i class="fa fa-linkedin"></i></a>
  <a href="#" class="youtube"><i class="fa fa-youtube"></i></a> 
</div>
    <div class="container">
        <div class="well">
  
</div>
   
    </div>
    <div class="hero-image">
  <div class="hero-text">
      <h1><b>SIGN UP AS A DOCTOR</b></h1>
    <a href="dsignup.jsp" class="btn btn-success">Signup </a>
    
  </div>
</div>
    <br>
    <br>
     <div class="container">
        <div class="well">
  
</div>
    </div>
   
    <div class="hero-image2">
  <div class="hero-text">
      <h1><b>SIGN UP AS A PATIENT</b></h1>
      <a href="patientsignup.jsp" class="btn btn-success">Signup</a>
  </div>
</div>
   
 </body>
</html>
