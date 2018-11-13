
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="Implementation.BookingDaoImplementation"%>
<%@page import="Dao.BookingDao"%>
<% 
 BookingDao bd = new BookingDaoImplementation();
 request.setAttribute("bookings", bd.getBooking());
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <style>
        .navbar {
      
      
      border: 100%;
      border-radius: 0;
      margin-bottom: 0;
      font-size: 16px;
      letter-spacing: 5px;
      background-color: black;
  }
    body {
    font-family: "Lato", sans-serif;
    
    background-image: url("image/p3.jpg");
    background-size: cover;
}
   </style>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>View Booking</title>
    </head>
    <body style="margin: auto;width: 100%">
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
          
           
      <li><a href="index.html"><b style="color: #fefefe"><span class="glyphicon glyphicon-home"></span>Home</b></a></li> 
      </ul>
      </div>
  </div>
</nav>
       
        <h1>Here Are Your Booking</h1>
        <table class="table table-stripped">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Patient Email</th>
                    <th>Doctor Name</th>
                    <th>Specialist</th>
                    <th>Day</th>
                    <th>Time</th>
                    <td><b>Date</b></td>
                    <td></td>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="x" items="${bookings}">
                    <tr>
                        <td>${x.getId()}</td>
                        <td>${x.getPatientemail()}</td>
                        <td>${x.getDoctorname()}</td>
                        <td>${x.getSpecialist()}</td>
                        <td>${x.getDay()}</td>
                        <td>${x.getTime()}</td>
                        <td>${x.getDate()}</td>
                        <td><a href="DeleteBooking?id=${x.getId()}" class="btn btn-danger">Delete</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
   
    </body>
</html>
