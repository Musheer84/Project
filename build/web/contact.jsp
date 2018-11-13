<%-- 
    Document   : ContactUs
    Created on : Oct 22, 2018, 12:44:34 AM
    Author     : sunny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Contact Us</title>
        <style>
body, html {
    height: 100%;
    margin: 0;
    font-family: Arial, Helvetica, sans-serif;
}

.hero-image {
  background-image:  url("image/contact.jpg");
  height: 100%;
  background-position: center;
  background-repeat:  no-repeat;
  background-size: cover;
  position: relative;
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
* {
    box-sizing: border-box;
}

/* Create two equal columns that floats next to each other */
.column {
    float: left;
    background-color: lightgray;
    width: 50%;
    padding: 10px;
    height: 460px; /* Should be removed. Only for demonstration */
}

/* Clear floats after the columns */
.row:after {
    content: "";
    display: table;
    clear: both;
}
.btn {
    background-color: #3333ff;
  color: white;
  padding: 16px 20px;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}
</style>
    </head>
    <body>
   
<nav class="navbar navbar-inverse">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
        <a class="navbar-brand" href="#"><b style="color: lightcyan"><span class="glyphicon glyphicon-plus-sign"></span>Mercy Medicare</b></a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
          <li><a href="about.jsp"><b style="color: #fefefe"><span class="glyphicon glyphicon-option-vertical"></span>About Us</b></a></li>
           <li class="dropdown">
              <a class="dropdown-toggle"  data-toggle="dropdown" href="#" <b style="color: #fefefe"> <span class="glyphicon glyphicon-user"></span>Sign Up</b>
                   <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="dsignup.jsp">Doctor SignUp</a></li>
          <li><a href="patientsignup.jsp">Patient SignUP</a></li>
         
        </ul>
      </li>
          <li class="dropdown">
              <a class="dropdown-toggle" data-toggle="dropdown" href="#"><b style="color: #fefefe"> <span class="glyphicon glyphicon-log-in"></span>Login</b>
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="doctor_login.jsp">Doctor Login</a></li>
          <li><a href="PatientLogin.jsp">Patient Login</a></li>
         
        </ul>
      </li>
           
        <li><a href="index.html"> <span class="glyphicon glyphicon-home"></span>Home</a></li>
      </ul>
      </div>
  </div>
</nav>
        <p style="font-size: 30px"><b style="background-color: lightgray">Let's build the future of Mercy Medicare</p></b>
       <div class="hero-image">
  <div class="hero-text">
    <h1 style="font-size:50px"></h1>
    
  </div>
</div>
        <div>
            <p style="text-align: center;font-size: 50px; background-color: gray">Get In Touch With Us </p>
        </div>
        <div class="row">
   <div class="column" >
   
       <p style="padding: 40px;font-size: 10px">
      <div style="padding: 30px">
          <h3><span class="glyphicon glyphicon-globe"></span> Our Office</h3>
          <p style="left: 30px;font-size: 20px">Sector-22, Rohini </br> New Delhi, India</p>
      <p style="left: 30px;font-size: 20px"><span class="glyphicon glyphicon-earphone"></span>Contact Number : 9654122932</p>
      <p style="left: 30px;font-size: 20px"><span class="glyphicon glyphicon-envelope"></span> Email : Musheer@gmail.com </p>
      </div>
   </div>
  <div  class="column" >
      <form action="MessageToAdmin"style="padding: 30px">
            <label for="Name"><b>Name</b></label>
            <input type="text" placeholder="Enter Name" name="name" class="form-control"required><br>

    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" class="form-control" required><br>

      <label for="email"><b>Phone Number</b></label>
      <input type="text" placeholder="Enter Phone Number" name="phone" class="form-control" required><br>
    
      <label for="message"><b>Message</b></label>
      <textarea name="message" placeholder="Enter Your's Message" class="form-control"></textarea><br>
      
      <button type="submit" class="btn btn-success">SEND MESSAGE</button>
      </form>
  </div>
</div>   
        



            
</footer>

    </body>
</html>
