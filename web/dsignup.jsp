<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
       
<style>
body, html {
    height: 100%;
    font-family: Arial, Helvetica, sans-serif;
}
.navbar {
      
      
      border: 100%;
      border-radius: 0;
      margin-bottom: 0;
      font-size: 16px;
      letter-spacing: 5px;
      background-color: black;
  }

* {
    box-sizing: border-box;
}

.bg-img {
    /* The image used */
    background-image: url("image/mus8.jpg");

    
    height: 100%;

    /* Center and scale the image nicely */
    background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
    position: relative;
}

/* Add styles to the form container */
.container {
    position: absolute;
    right:  50px;
    margin: 20px;
    max-width: 300px;
    padding: 16px;
    background-color: white;
    opacity :0.9;
    top: 50px;
}

/* Full-width input fields */
input[type=text], input[type=password] {
    width: 100%;
    padding: 15px;
    margin: 5px 0 22px 0;
    border: none;
    background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
    background-color: #ddd;
    outline: none;
}

/* Set a style for the submit button */
.btn {
    background-color: #4CAF50;
    color: white;
    padding: 16px 20px;
    border: none;
    cursor: pointer;
    width: 100%;
    opacity: 0.9;
}

.btn:hover {
    opacity: 1;
}
</style>
</head>
<body>
    <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Mercy Medicare</a>
    </div>
    <ul class="nav navbar-nav">
        
      <li class="active"><a href="about.jsp"><span class="glyphicon glyphicon-option-vertical"></span>About US</a></li>
      <li class="dropdown">
              <a class="dropdown-toggle"  data-toggle="dropdown" href="#" <b style="color: #fefefe"> <span class="glyphicon glyphicon-user"></span>Sign Up</b>
                   <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="dsignup.jsp">Doctor SignUp</a></li>
          <li><a href="patientsignup.jsp">Patient SignUP</a></li>
         
        </ul>
      </li>
      <li><a href="index.html"> <span class="glyphicon glyphicon-home"></span>Home</a></li>
    </ul>
  </div>
</nav>


<div class="bg-img">
    <form action="DoctorSignUp" class="container" method="post">
    <h1>Sign Up</h1>
    <span class="glyphicon glyphicon-envelope"></span>
    <label for="email"><b>Email</b></label>
    
    
    <input type="text" placeholder="Enter Email" name="email" required>
     <span class="glyphicon glyphicon-lock"></span>
    <label for="password"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>
      <span class="glyphicon glyphicon-lock"></span>
      <label for="cpassword"><b>Confirm Password</b></label>
    <input type="password" placeholder="Enter Password" name="cpassword" required>
    <label>
        <input type="checkbox" checked="checked" name="remember" style="margin-bottom:15px"> Remember me
      </label>

      <p>By creating an account you agree to our <a href="#" style="color:dodgerblue">Terms & Privacy</a>.</p>

    
    <button type="submit" class="btn">Sign Up</button>
  </form>
</div>

    
        <footer class="container-fluid bg-4 text-center" style="background-color: black">
  <div class="col-md-3 mb-md-0 mb-3">
      
     <h3 style="color: white;font-family: 'Abril Fatface';"class="text-uppercase" >Create Your Account</h3>

            <ul class="list-unstyled">
              <li>
                  <a href="dsignup.jsp">Sign up</a>
              </li>
              <li>
                <a href="#!">About</a>
              </li>
              <li>
                <a href="#!">Jobs</a>
              </li>
              
            </ul>

          </div>
    
          <!-- Grid column -->

          <!-- Grid column -->
          <div class="col-md-3 mb-md-0 mb-3">

            <!-- Links -->
            <h3  style="color: white; font-family: 'Abril Fatface';" class="text-uppercase">Get in Touch</h3>

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
