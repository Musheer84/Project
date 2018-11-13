<%-- 
    Document   : patientsignup3
    Created on : Oct 17, 2018, 3:15:43 PM
    Author     : akansha
--%>

<%@page import="java.sql.Date"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Patient Sign Up</title>
        <script type="text/javascript">
            function data(){
               
                var dat = document.getElementsByName('dates');
                var dat_value;
                for(var i= 0; i< dat.length; i++){
                    if(dat[i].checked){
                        dat_value = dat[i].value;
                    }
                }
                
                document.forms['myForm']['day'].value = dat_value;
                
                
                
                var tim = document.getElementsByName('times');
                var tim_value;
                for(var i= 0; i< dat.length; i++){
                    if(tim[i].checked){
                        tim_value = tim[i].value;
                    }
                }
                
                document.forms['myForm']['time'].value = tim_value;
                              
    }         
                               
        </script>
            
        <style>
            body{
                background-image: url("image/back3.jpg");
                background-size: cover;
            }
        </style>
    </head>
    <body>
       
        <br><br>
        
        
        <h2 style="margin-left: 50px">HELLO PATIENT</h2><br>
        <form action="patientsignup" method="post" name="myForm">
        <table class="table table-stripped" style="margin-right: 500px;margin-left: 50px;width: 50%">
            <tbody>
                <tr>
                    <td>Specialist</td>
                    <td><input type="text" class="form-control" value="${specialist} " name="specialist" readonly/></td>
                </tr>
                <tr>
                    <td>Doctor</td>
                    <td><input type="text" class="form-control" value="${name}" name="doctor" readonly/></td>
                </tr>
                
                <tr>
                    <td>Day</td>
                    <td>
                        <select name="" class="form-control">
                            <option value="0"></option>
                            <c:forEach items="${schedule}" var="x">
                                 <c:forEach items="${fn:split(x.getDay(),',')}" var="y">
                                     <option value="${y}">${y}</option>
                                 </c:forEach>
                            </c:forEach>
                        </select>
                       
                    </td>
                </tr>
                
                <tr>
                    <td>Available Dates and Times:</td>
                    
                    <td>
                        
                        <c:forEach items="${bookings}" var="dates">
                            
                            <h1 class="text text-success">
                                <input type="radio" name="dates" value="${dates.key}"/>
                                ${dates.key}
                            </h1>
                            <c:forEach items="${dates.value}" var="times">
                                &nbsp;<input type="radio" name="times" value="${times}"/>
                                <span class="alert alert-danger">${times}</span>
                            </c:forEach>
                                <br><br>
                                
                            
                        </c:forEach>
                                <a onclick="data()" class="btn btn-warning">Confirm Date & Time</a>
                    </td>
                </tr>
                
                <tr>
                    <td>Date</td>
                    <td><input type="text" name="day"  class="form-control"/></td>
                </tr>
                <tr>
                    <td>Time</td>
                    <td><input type="text" name="time"  class="form-control"/>
                    </td>
                </tr>
                 <tr>
                    <td>Name</td>
                    <td><input type="text" name="name" placeholder="Enter Your Name" class="form-control" /></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><input type="email" name="email" placeholder="Enter Your Email" class="form-control" /></td>
                </tr>
                <tr>
                    <td>Phone</td>
                    <td><input type="text" name="phone" placeholder="Enter Your Phone" class="form-control" /></td>
                </tr>
                <tr>
                    <td><input type="submit" class="btn btn-info"/></td>
                </tr>

            </tbody>
        </table>
        </form>
    </body>
</html>
