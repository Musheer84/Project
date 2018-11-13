


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
  String email = request.getParameter("email");
   request.setAttribute("email", email);
 
%>

      <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>About Doctor</title>
    </head>
    <body>
        
        <style>  body{
                background-image: url("image/last.jpg");
                background-size: cover;
            }
            .navbar {
      
      
      border: 100%;
      border-radius: 0;
      margin-bottom: 0;
      font-size: 16px;
      letter-spacing: 5px;
      background-color: black;
  }
        </style>
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
           
      <li><a href="contact.jsp"><b style="color: #fefefe"><span class="glyphicon glyphicon-earphone"></span>Contact Info</b></a></li> 
      </ul>
      </div>
  </div>
</nav>
     
         <form action="UpdateDoctorDetails" method="post" enctype="multipart/form-data"  name="myForm">
           
             <br> <br><br><br><br><br><br>
            <h1 style="margin-left: 800px" >Hello Doctor</h1><br><br>
            <table class="table table-stripped" style="margin-left: 450px;width: 60%">
                
                
                <tr>
                    <td><b>Name</b></td>
                    <td><input type="text" name="name" placeholder="Enter Your Name" class="form-control" required></td>
                </tr>
                <tr>
                    <td><b>Email</b></td>
                    <td><input type="email" name="email" value="${email}" class="form-control" required> </td>
                </tr>
                <tr>
                    <td><b>Phone</b></td>
                    <td><input type="text" name="phone" placeholder="Enter Your Phone Number" class="form-control" required=""></td>
                </tr>
               
               
                <tr>
                    <td><b>Specialist</b></td>
                    <td>
                        <select name="specialist" class="form-control">
                            <option value="0">Select From Here</option>
                            <option value="Bones">Bones</option>
                            <option value="General Surgery">General Surgery</option>
                            <option value="Burn">Burn</option>
                            <option value="Family Physicians">Family Physicians</option>
                            <option value="Cardiologist">Cardiologist</option>
                            <option value="Dermatologist">Dermatologist</option>
                            <option value="Gastroenterologist">Gastroenterologist</option>
                            <option value="Allergist">Allergist</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td><b>Profile Picture</b></td>
                    <td><input type="file" name="file" class="form-control"></td>
                </tr>
              
                
                  <tr>
                    <td rowspan="2"><input type="submit" class="btn btn-success" style="position: relative;left: 251px"></td>
                </tr>
            </table>
          
            
         </form>
     <footer class="container-fluid bg-4 text-center" style="background-color: black">
  <div class="col-md-3 mb-md-0 mb-3">
      
   <h3   style="color: white; font-family: 'Abril Fatface';" class="text-uppercase">Create Your Account</h3>

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
