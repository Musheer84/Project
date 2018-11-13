<%-- 
    Document   : patientsignup1
    Created on : Oct 17, 2018, 3:01:08 PM
    Author     : akansha
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Patient Sign UP</title>
        <style>
            body{
                background-image: url("images/patientsignup.jpg");
                background-size: cover;
            }
        </style>
    </head>
    
    <body>
        
        <form action="patiensignup" method="post">
            <br><br>
        <h2 style="margin-left: 50px">HELLO PATIENT</h2><br>
        <table class="table table-stripped" style="margin-right: 500px;margin-left: 50px;width: 50%">
                <tbody>
                    
                    <tr>
                        <td>Specialist</td>
                        <td><input type="text" name="specialist" value="${specialist}" class="form-control" readonly/></td>
                    </tr>
                    <tr>
                        <td>Doctor</td>
                        <td>
                            <select name="doctor" class="form-control" >
                                <option value="0"></option>
                                <c:forEach items="${doctors}" var="x">
                                    <option value="${x.getName()}">${x.getName()}</option>
                                </c:forEach>
                            </select>
                            <button type="submit" formaction="scheduleappointment" class="btn btn-danger">Fetch Day & Time</button>
                        </td>
                
                    </tr>
                    <tr>
                        <td>Day</td>
                        <td><select name="day" class="form-control" >
                                <option value="0"></option>
                            </select></td>
                    </tr>
                    <tr>
                        <td>Time</td>
                        <td><select name="time" class="form-control" >
                                <option value="0"></option>
                            </select></td>
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
