<%-- 
    Document   : DoctorAppointment
    Created on : Oct 28, 2018, 8:36:28 AM
    Author     : sunny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
  String email  = request.getParameter("email");
  request.setAttribute("email", email);

%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Schedule Appointment</title>
    </head>
    <body>
        <style>  body{
                background-image: url("image/SCHEDULE.jpg");
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
          <li><a href="signup.jsp"><b style="color: #fefefe"> <span class="glyphicon glyphicon-user"></span>Sign Up</b></a></li>
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
   
         <form action="UpdateDoctorSchedule" method="post">
            
            <input type="hidden" name="email" value="${email}"/>
            
            <table class="table table-stripped">
                <thead>
                    <tr><br>
                        <th></th>
                        <th><b style="color:red;">Monday</th></b>
                        <th><b style="color:red ">Tuesday</th></b>
                        <th><b style="color:red ">Wednesday</th></b>
                        <th><b style="color:red ">Thursday</th></b>
                        <th><b style="color:red ">Friday</th></b>
                        <th><b style="color:red ">Saturday</th></b>
                        <th><b style="color:red ">Sunday</th></b>
                    </tr>
                    
                </thead>
                <tbody>
                    <tr>
                        <th>Morning</th>
                        <th><input type="checkbox" name="schedule" value="Monday;;Morning"/></th>
                        <th><input type="checkbox" name="schedule" value="Tuesday;;Morning"/></th>
                        <th><input type="checkbox" name="schedule" value="Wednesday;;Morning"/></th>
                        <th><input type="checkbox" name="schedule" value="Thursday;;Morning"/></th>
                        <th><input type="checkbox" name="schedule" value="Friday;;Morning"/></th>
                        <th><input type="checkbox" name="schedule" value="Saturday;;Morning"/></th>
                        <th><input type="checkbox" name="schedule" value="Sunday;;Morning"/></th>
                    </tr>
                    <tr>
                        <th>Afternoon</th>
                        <th><input type="checkbox" name="schedule" value="Monday;;Afternoon"/></th>
                        <th><input type="checkbox" name="schedule" value="Tuesday;;Afternoon"/></th>
                        <th><input type="checkbox" name="schedule" value="Wednesday;;Afternoon"/></th>
                        <th><input type="checkbox" name="schedule" value="Thursday;;Afternoon"/></th>
                        <th><input type="checkbox" name="schedule" value="Friday;;Afternoon"/></th>
                        <th><input type="checkbox" name="schedule" value="Saturday;;Afternoon"/></th>
                        <th><input type="checkbox" name="schedule" value="Sunday;;Afternoon"/></th>
                    </tr>
                    <tr>
                        <th>Evening</th>
                        <th><input type="checkbox" name="schedule" value="Monday;;Evening"/></th>
                        <th><input type="checkbox" name="schedule" value="Tuesday;;Evening"/></th>
                        <th><input type="checkbox" name="schedule" value="Wednesday;;Evening"/></th>
                        <th><input type="checkbox" name="schedule" value="Thursday;;Evening"/></th>
                        <th><input type="checkbox" name="schedule" value="Friday;;Evening"/></th>
                        <th><input type="checkbox" name="schedule" value="Saturday;;Evening"/></th>
                        <th><input type="checkbox" name="schedule" value="Sunday;;Evening"/></th>
                    </tr>
                    <tr>
                        <td><br>
                            <button type="submit" class="btn btn-success" >Confirm Days</button>
                        </td>
                    </tr>
                </tbody>
            </table>
        </form>

    </body>
</html>
