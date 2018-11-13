<%-- 
    Document   : BookAppointment
    Created on : Oct 31, 2018, 3:04:47 PM
    Author     : musheer
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String email = request.getParameter("email");
    request.setAttribute("email", email);

   


%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
body {
    font-family: "Lato", sans-serif;
    transition: background-color .5s;
    background-image: url("image/ba.jpg");
    background-size: contain;
}
     </style>
    <head>
         <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
         <link rel="stylesheet" href="style.css" type="text/css"/>
        <title>Book Appointment</title>
    </head>
    <body style="margin: auto;width: 100%">
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
       
        <form action="BookAppointment">
            <table class="table table-stripped">
                <tr>
                    <td><b>Email :</b></td>
                    <td><input type="email" name="email" class="form-control" value="${email}"/></td>
                </tr>
                <tr>
                    <td><b>Specialist :</b></td>
                    <td>
                        <select name="specialists" class="form-control" >
                            <option value="0">Select From Here</option>
                            <option value="Bones">Bones</option>
                            <option value="General Surgery">General Surgery</option>
                            <option value="Burn">Burn</option>
                            <option value="Family Physicians">Family Physicians</option>
                            <option value="Cardiologist">Cardiologist</option>
                            <option value="Dermatologist">Dermatologist</option>
                            <option value="Gastroenterologist">Gastroenterologist</option>
                            <option value="Allergist">Allergist</option>
                        </select><br>
                        <button type="submit" formaction="FetchDoctor?email=${email}" class="btn btn-danger">Fetch Doctor</button>
                      
                    </td>
                </tr>
                <tr>
                    <td><b>Specialist Selected</b></td>
                    <td><input type="text" name="specialist" placeholder="Specialist You Have Selected Will Appear Here" class="form-control" value="${specialist}"/></td>
                </tr>
                <tr>
                    <td><b>Doctor :</b></td>
                    <td>
                        <select name="doctornames" class="form-control">
                            <option value="0">Select From Here</option>
                            <c:forEach items="${doctors}" var="x">
                                <option value="${x.getName()}">${x.getName()}</option>
                            </c:forEach>
                        </select><br>
                        <button type="submit" formaction="FetchApp?email=${email}" class="btn btn-danger">Fetch Schedule</button>
                    </td>
                </tr>
                <tr>
                    <td><b>Doctor Selected :</b></td>
                    <td><input type="text" name="doctorname" placeholder="Doctor You Have Selected Will Appear Here" class="form-control" value="${doctorname}"/></td>
                </tr>
                <tr>
                    <td><b>Schedule</b></td>
                    <td>
                         <c:if test="${not empty doctorScheduleMap}">
                            <c:forEach var="entry" items="${doctorScheduleMap}">
                                <input type="radio" name="days" value="${entry.key}"/>${entry.key}<br>
                                
                                
                                <c:forEach var="times" items="${entry.value}">
                                    &nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="times"  value="${times}"/>${times}&nbsp;&nbsp;&nbsp;
                                    
                                </c:forEach>
                                    <br>
                            </c:forEach>
                            
                        </c:if>

                    <button type="submit" formaction="FetchDate?day=${day}" class="btn btn-danger">Fetch Date</button>   
                    </td>
                    
                </tr>
                <tr>
                    <td><b>Day Selected :</b></td>
                    <td><input type="text" name="day" placeholder="Day You Have Selected Will Appear Here" class="form-control" value="${day}"/></td>
                </tr>
                <tr>
                    <td><b>Time Selected :</b></td>
                    <td><input type="text" name="time" placeholder="Time You Have Selected Will Appear Here" class="form-control" value="${time}"/></td>
                </tr>
                </tr>
                <tr>
                    <td><b>Dates</b></td>
                    <td>
                        <c:forEach var="x" items="${DAYS}">
                            &nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="date" value="${x}"/>${x}&nbsp;&nbsp;&nbsp;&nbsp;
                        </c:forEach>
                    </td>
                </tr>
                <td></td>
                <td><input type="submit" class="btn btn-success" value="Book Appointment"/></td>
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
