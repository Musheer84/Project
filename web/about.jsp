

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    
    <head>
        
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
         <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="style.css" type="text/css"/>

 
        <title>JSP Page</title>
        <style>
            .navbar {
      
      
      border: 0;
      border-radius: 0;
      margin-bottom: 0;
      font-size: 16px;
      letter-spacing: 5px;
      background-color: black;
  }
            .container {
    margin-top: 20px;
}

/* Carousel Styles */
.carousel-indicators .active {
    background-color: #2980b9;
}

.carousel-inner img {
    width: 100%;
    max-height: 460px
}

.carousel-control {
    width: 0;
}

.carousel-control.left,
.carousel-control.right {
	opacity: 1;
	filter: alpha(opacity=100);
	background-image: none;
	background-repeat: no-repeat;
	text-shadow: none;
}

.carousel-control.left span {
	padding: 15px;
}

.carousel-control.right span {
	padding: 15px;
}

.carousel-control .glyphicon-chevron-left, 
.carousel-control .glyphicon-chevron-right, 
.carousel-control .icon-prev, 
.carousel-control .icon-next {
	position: absolute;
	top: 45%;
	z-index: 5;
	display: inline-block;
}

.carousel-control .glyphicon-chevron-left,
.carousel-control .icon-prev {
	left: 0;
}

.carousel-control .glyphicon-chevron-right,
.carousel-control .icon-next {
	right: 0;
}

.carousel-control.left span,
.carousel-control.right span {
	background-color: #000;
}

.carousel-control.left span:hover,
.carousel-control.right span:hover {
	opacity: .7;
	filter: alpha(opacity=70);
}

/* Carousel Header Styles */
.header-text {
    position: absolute;
    top: 20%;
    left: 1.8%;
    right: auto;
    width: 96.66666666666666%;
    color: #fff;
}

.header-text h2 {
    font-size: 40px;
}

.header-text h2 span {
    background-color: #2980b9;
	padding: 10px;
}

.header-text h3 span {
	background-color: #000;
	padding: 15px;
}

.btn-min-block {
    min-width: 170px;
    line-height: 26px;
}

.btn-theme {
    color: #fff;
    background-color: transparent;
    border: 2px solid #fff;
    margin-right: 15px;
}

.btn-theme:hover {
    color: #000;
    background-color: #fff;
    border-color: #fff;
}
  .parallax {
    /* The image used */
    background-image: url("image/back.jpg");

    /* Set a specific height */
    min-height: 500px; 

    /* Create the parallax scrolling effect */
    background-attachment: fixed;
    background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
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
           
        <li><a href="contact.jsp"> <span class="glyphicon glyphicon-earphone"></span>Contact Info</a></li>
        <li><a href="index.html"> <span class="glyphicon glyphicon-home"></span>Home</a></li>
      </ul>
      </div>
  </div>
</nav>
        <div class="parallax">
            
     <div class="container">
	<div class="row">
		<!-- Carousel -->
    	<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
			<!-- Indicators -->
			<ol class="carousel-indicators">
			  	<li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
			    
			</ol>
			<!-- Wrapper for slides -->
			<div class="carousel-inner">
			    <div class="item active">
			    	<img src="image/wel.jpg" alt="First slide">
                    <!-- Static Header -->
                    <div class="header-text hidden-xs">
                        <div class="col-md-12 text-center">
                            
                            <br>
                            <h3>
                            	
                            </h3>
                            <br><br><br><br><br><br><br><br><br><br><br>
                            <div class="">
                                <a class="btn btn-theme btn-sm btn-min-block" href="signup.jsp">Signup</a></div>
                        </div>
                    </div><!-- /header-text -->
			    </div>
			    
			<!-- Controls -->
			
		</div><!-- /carousel -->
	</div>
</div>
            <h2 style= "font-family: 'Salsa';"><b>Here’s how it works:</b></h2>

<br>

<div class="row">
  <div class="column">
    <div class="card">
      <img src="image/drt.jpg" alt="Jane" style="width:50%">
      <div class="container">
          <h1><b>Explain your health concern</b></h1>
        <h3>We check each doctor’s registration <br>
            certificate before they sign up with us, <br>so you don't have to worry!</h3>
        
      </div>
    </div>
  </div>

  <div class="column">
    <div class="card">
      <img src="image/bp.jpg" alt="Mike" style="width:50%">
      <div class="container">
          <h1><b>5 min response time</b></h1>
        <h3>Our algorithm matches you with <br>the best available doctor right when<br> you need it,
            so you get <br>instant responses.

</h3>
        
      </div>
    </div>
  </div>
  <div class="column">
    <div class="card">
      <img src="image/s2.jpg" alt="John" style="width:50%">
      <div class="container">
          <h1 ><b>Free 3 day follow-up</b></h1>
        <h3>Forgot to ask something? Need <br>clarification? You still have 5 <br>more messages
            <br>over 3 days to follow-up<br> with the doctor.</h3>
        
      </div>
    </div>
  </div>
</div>

     
     
<h1 style= "font-family: 'Salsa';"<b>Let's clear those doubts</b></h1>

<p></p>

<button class="accordion"><b>What happens if I don’t get a response?</b>
</button>
<div class="panel">
  <h3 style= "font-family: 'Salsa';">You are assured a response on Consult, and not just that, most doctors respond within 5 minutes to your consultation. In the super
 rare case that the doctor doesn't respond at all, the money 
is automatically refunded to your account.</h3>
</div>

<button class="accordion"><b>Will the doctor be able to solve my medical issue?</b>
</button>
<div class="panel">
  <h3>Our doctors will give you a qualified opinion on your health issue and help you identify next steps which may include further tests,
      a prescription or lifestyle tips. On the off chance that our doctors can’t form a conclusive diagnosis without a physical examination,
      they will cancel the consultation & refund your money.</h3>
</div>

<button class="accordion"><b>Can I ask a doctor a medical question for free?</b></button>
<div class="panel">
  <h3>We have the free questions service available on our app only. Please download our app and log in to ask a free health question to doctors. 
Doctors usually respond within 24 to 48 hours of you posting your query.</h3>
</div>
<button class="accordion"><b>What’s your money back policy?</b>
</button>
<div class="panel">
  <h3>We have a ‘worry-free’ refund policy. If for any reason you’re not satisfied with 
your online consultation, simply reach out to us on team-consult@Belief.com and we’ll refund your money.</h3>
</div>
<button class="accordion"><b>Are your doctors qualified?</b>
</button>
<div class="panel">
  <h3>We have a strict verification process for every doctor on Belief. 
Any doctor that you consult with is a verified medical practitioner.</h3>
</div>

<button class="accordion"><b>Is a consultation on Belief private?</b>
</button>
<div  class="panel">
  <h3>Every consultation on Belief is completely private & confidential. 
We take your privacy very seriously, and we are compliant with industry 
standards to ensure your consultations are securely stored.</h3>
</div>

<script>
var acc = document.getElementsByClassName("accordion");
var i;

for (i = 0; i < acc.length; i++) {
  acc[i].addEventListener("click", function() {
    this.classList.toggle("active");
    var panel = this.nextElementSibling;
    if (panel.style.maxHeight){
      panel.style.maxHeight = null;
    } else {
      panel.style.maxHeight = panel.scrollHeight + "px";
    } 
  });
}
</script>

        </div>
            <footer class="container-fluid bg-4 text-center"  <b style="background-color: black"></b>
              
  <div class="col-md-3 mb-md-0 mb-3">
      
   <h3   style="color: white; font-family: 'Abril Fatface' ;color: white" class="text-uppercase">Create Your Account</h3>

            <ul class="list-unstyled">
              <li>
                  <a href="dsignup.jsp"><b>Sign Up</b></a>
              </li>
              <li>
                  <a href="#!"><b>About</b></a>
              </li>
              <li>
                  <a href="#!"><b>Jobs</b></a>
              </li>
              
            </ul>

          </div>
    
          <!-- Grid column -->

          <!-- Grid column -->
          <div class="col-md-3 mb-md-0 mb-3">

            <!-- Links -->
            <h3  style=" color: white; font-family: 'Abril Fatface';" class="text-uppercase">Get in Touch</h3>

            <ul class="list-unstyled quick active">
              <li>
                <a href="#!"><span class="glyphicon glyphicon-earphone"></span> +919654122932</a>
              </li>
              <li>
                  <a href="#!"><span class="glyphicon glyphicon-map-marker text-center text-white "></span> NEW DELHI,INDIA</br>Mercy Medicare Pvt.Ltd,</br> Inder Enclave Phase-2,</br> Pincode:110086</a>
              </li>
              <li>
               
              </li>
              
            </ul>

          </div><br>
          
          <p> <a href="#">www.MercyMedicare.com</a></p> 
          <p> <a href="#"><span class="glyphicon glyphicon-envelope"></span>info@mercymedicare.in</a></p>
          <ul class="list-unstyled">
              <li>
                  <a href="#!">Terms of use</a></li>
              <li>
                  <a href="#!"><span class="input-group-text"><i class="fas fa-user"></i></span>Privacy policy</a></li>
              	          <div class="row">
                    <li>
				<div class="col-xs-12 col-sm-12 col-md-12 mt-2 mt-sm-2 text-right text-white">
					
                                    <p class="h6">  &copy All right Reversed.<a class="text-green ml-2" href="https://www.sunlimetech.com" target="_blank">mercytech</a></p>
				</div>
                    </li>
                    
          </ul>



                    
</footer>
    </body>
</html>
