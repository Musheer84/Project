<%-- 
    Document   : carosel
    Created on : Oct 13, 2018, 3:04:22 AM
    Author     : sunny
--%>

<%@page import="Dao.DoctorDao"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="Implementation.DoctorDaoImplementation"%>
<%@page import="Dao.DoctorDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
    DoctorDao dd = new DoctorDaoImplementation();
    request.setAttribute("doctors", "s");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
        <style>
         
        </style>
    </head>
    <body>
         <nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
        <a href="index.html" class="navbar-brand">Mercy Medicare</a>
    </div>
      
 
   <ul class="nav navbar-nav navbar-right">
   
       <li class="dropdown">
           <a class="dropdown-toggle" data-toggle="dropdown" ><span class="glyphicon glyphicon-user"></span>Sign Up<span class="caret"></span></a>
               <ul class="dropdown-menu">
                   <li><a href="patientsignup.jsp">Patient</a></li>
              <li><a href="dsignup.jsp">Doctor</a></li>
          </ul>
      </li>
      <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" ><span class="glyphicon glyphicon-log-in"></span> Login<span class="caret"></span></a>
          <ul class="dropdown-menu">
              <li><a href="PatientLogin.jsp">Patient</a></li>
              <li><a href="doctor_login.jsp">Doctor</a></li>
              
          </ul>
      </li>
    </ul>
  </div>
</nav>
        <div class="container-fluid">
            <div id="myCarousel" class="carousel slide" data-ride="carousel" style="background-image: url(image/gd.jpg;);background-size:cover;" >
    <!-- Indicators -->
 
    <!-- Wrapper for slides -->
    <div class="carousel-inner">
        <div class="item active">
            <img src="image/dr2.jpg " alt="know your doctor" style="width: 100%" >
       
      </div>
        <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
        
                    <c:forEach var="x" items="${doctor}">
                        <div class="item" align="right">
            <div style="width: 700px;border: 2px solid black; padding: 25px;margin: 25px">
                <table class="table table-condensed"align="center">
                    <tr>
                        <td></td>
                        <td><img src="${x.getUrl()}"></td>
                    </tr>
                    <tr>
                        <td><b>Name :</b></td>
                        <td>${x.getName()}</td>
                    </tr>
                    <tr>
                        <td><b>Specialist :</b></td>
                        <td>${x.getSpecialist()}</td>
                    </tr>
                    <tr>
                        <td><b>Email :</b></td>
                        <td>${x.getEmail()}</td>
                    </tr>
                    <tr>
                        <td><b>Number :</b></td>
                        <td>${x.getPhone()}</td>
                    </tr>
                    <tr>
                        <td><a href="patientsignup.jsp" class="btn btn-danger">Book Appointment</a></td>
                        <td></td> 
                    </tr>
                </table>
            </div></div>
        </c:forEach> 
       
    </div>
    
  
    </div>

    <!-- Left and right controls -->
    
  </div>
    </div></div>

    </body>
</html>
