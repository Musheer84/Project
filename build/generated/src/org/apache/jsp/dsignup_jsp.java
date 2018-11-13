package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dsignup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script><link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Montserrat\" rel=\"stylesheet\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("   <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("       <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("       <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("       <link href=\"https://fonts.googleapis.com/css?family=Knewave\" rel=\"stylesheet\">\n");
      out.write("       <link href=\"https://fonts.googleapis.com/css?family=Salsa\" rel=\"stylesheet\"> \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("body, html {\n");
      out.write("    height: 100%;\n");
      out.write("    font-family: Arial, Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write(".navbar {\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      border: 100%;\n");
      out.write("      border-radius: 0;\n");
      out.write("      margin-bottom: 0;\n");
      out.write("      font-size: 16px;\n");
      out.write("      letter-spacing: 5px;\n");
      out.write("      background-color: black;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("* {\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bg-img {\n");
      out.write("    /* The image used */\n");
      out.write("    background-image: url(\"image/mus8.jpg\");\n");
      out.write("\n");
      out.write("    \n");
      out.write("    height: 100%;\n");
      out.write("\n");
      out.write("    /* Center and scale the image nicely */\n");
      out.write("    background-position: center;\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    background-size: cover;\n");
      out.write("    position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Add styles to the form container */\n");
      out.write(".container {\n");
      out.write("    position: absolute;\n");
      out.write("    right:  50px;\n");
      out.write("    margin: 20px;\n");
      out.write("    max-width: 300px;\n");
      out.write("    padding: 16px;\n");
      out.write("    background-color: white;\n");
      out.write("    opacity :0.9;\n");
      out.write("    top: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Full-width input fields */\n");
      out.write("input[type=text], input[type=password] {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 15px;\n");
      out.write("    margin: 5px 0 22px 0;\n");
      out.write("    border: none;\n");
      out.write("    background: #f1f1f1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text]:focus, input[type=password]:focus {\n");
      out.write("    background-color: #ddd;\n");
      out.write("    outline: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Set a style for the submit button */\n");
      out.write(".btn {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("    padding: 16px 20px;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    width: 100%;\n");
      out.write("    opacity: 0.9;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn:hover {\n");
      out.write("    opacity: 1;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">Mercy Medicare</a>\n");
      out.write("    </div>\n");
      out.write("    <ul class=\"nav navbar-nav\">\n");
      out.write("      <li class=\"active\"><a href=\"about.jsp\"><span class=\"glyphicon glyphicon-option-vertical\"></span>About US</a></li>\n");
      out.write("      <li><a href=\"signup.jsp\"> <span class=\"glyphicon glyphicon-user\"></span>Sign Up</a></li>\n");
      out.write("      <li><a href=\"index.html\"> <span class=\"glyphicon glyphicon-home\"></span>Home</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"bg-img\">\n");
      out.write("    <form action=\"DoctorSignUp\" class=\"container\" method=\"post\">\n");
      out.write("    <h1>Sign Up</h1>\n");
      out.write("    <span class=\"glyphicon glyphicon-envelope\"></span>\n");
      out.write("    <label for=\"email\"><b>Email</b></label>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <input type=\"text\" placeholder=\"Enter Email\" name=\"email\" required>\n");
      out.write("     <span class=\"glyphicon glyphicon-lock\"></span>\n");
      out.write("    <label for=\"password\"><b>Password</b></label>\n");
      out.write("    <input type=\"password\" placeholder=\"Enter Password\" name=\"password\" required>\n");
      out.write("      <span class=\"glyphicon glyphicon-lock\"></span>\n");
      out.write("      <label for=\"cpassword\"><b>Confirm Password</b></label>\n");
      out.write("    <input type=\"password\" placeholder=\"Enter Password\" name=\"cpassword\" required>\n");
      out.write("    <label>\n");
      out.write("        <input type=\"checkbox\" checked=\"checked\" name=\"remember\" style=\"margin-bottom:15px\"> Remember me\n");
      out.write("      </label>\n");
      out.write("\n");
      out.write("      <p>By creating an account you agree to our <a href=\"#\" style=\"color:dodgerblue\">Terms & Privacy</a>.</p>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <button type=\"submit\" class=\"btn\">Sign Up</button>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("        <footer class=\"container-fluid bg-4 text-center\" style=\"background-color: black\">\n");
      out.write("  <div class=\"col-md-3 mb-md-0 mb-3\">\n");
      out.write("      \n");
      out.write("      <h3   style=\"font-family: 'Abril Fatface';\" class=\"text-uppercase\"> Create Your Account</h3>\n");
      out.write("\n");
      out.write("            <ul class=\"list-unstyled\">\n");
      out.write("              <li>\n");
      out.write("                  <a href=\"dsignup.jsp\">Sign up</a>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                <a href=\"#!\">About</a>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                <a href=\"#!\">Jobs</a>\n");
      out.write("              </li>\n");
      out.write("              \n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("    \n");
      out.write("          <!-- Grid column -->\n");
      out.write("\n");
      out.write("          <!-- Grid column -->\n");
      out.write("          <div class=\"col-md-3 mb-md-0 mb-3\">\n");
      out.write("\n");
      out.write("            <!-- Links -->\n");
      out.write("            <h3  style=\"font-family: 'Abril Fatface';\" class=\"text-uppercase\">Get in Touch</h3>\n");
      out.write("\n");
      out.write("            <ul class=\"list-unstyled quick active\">\n");
      out.write("              <li>\n");
      out.write("                <a href=\"#!\"><span class=\"glyphicon glyphicon-earphone\"></span> +919654122932</a>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                  <a href=\"#!\"><span class=\"glyphicon glyphicon-map-marker text-center text-white \"></span> NEW DELHI,INDIA</br>Mercy Medicare Pvt.Ltd,</br> Inder Enclave Phase-2,</br> Pincode:110086</a>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("               \n");
      out.write("              </li>\n");
      out.write("              \n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("          </div><br>\n");
      out.write("          \n");
      out.write("          <p> <a href=\"#\">www.MercyMedicare.com</a></p> \n");
      out.write("          <p> <a href=\"#\"><span class=\"glyphicon glyphicon-envelope\"></span>info@mercymedicare.in</a></p>\n");
      out.write("          <ul class=\"list-unstyled\">\n");
      out.write("              <li>\n");
      out.write("                  <a href=\"#!\">Terms of use</a></li>\n");
      out.write("              <li>\n");
      out.write("                  <a href=\"#!\"><span class=\"input-group-text\"><i class=\"fas fa-user\"></i></span>Privacy policy</a></li>\n");
      out.write("              \t          <div class=\"row\">\n");
      out.write("                    <li>\n");
      out.write("\t\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-12 mt-2 mt-sm-2 text-right text-white\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("                                    <p class=\"h6\">  &copy All right Reversed.<a class=\"text-green ml-2\" href=\"https://www.sunlimetech.com\" target=\"_blank\">mercytech</a></p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                    </li>\n");
      out.write("                   \n");
      out.write("          </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            \n");
      out.write("</footer>\n");
      out.write("    \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
