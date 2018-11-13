package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DoctorDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

  String email = request.getParameter("email");
   request.setAttribute("email", email);
 

      out.write("\n");
      out.write("\n");
      out.write("      <html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>About Doctor</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <style>  body{\n");
      out.write("                background-image: url(\"image/last.jpg\");\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("            .navbar {\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      border: 100%;\n");
      out.write("      border-radius: 0;\n");
      out.write("      margin-bottom: 0;\n");
      out.write("      font-size: 16px;\n");
      out.write("      letter-spacing: 5px;\n");
      out.write("      background-color: black;\n");
      out.write("  }\n");
      out.write("        </style>\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>                        \n");
      out.write("      </button>\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\"><b style=\"color: lightcyan\"><span class=\"glyphicon glyphicon-plus-sign\"></span>Mercy Medicare</b></a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("          <li><a href=\"about.jsp\"><b style=\"color: #fefefe\"><span class=\"glyphicon glyphicon-option-vertical\"></span>About Us</b></a></li>\n");
      out.write("          <li class=\"dropdown\">\n");
      out.write("              <a class=\"dropdown-toggle\"  data-toggle=\"dropdown\" href=\"#\" <b style=\"color: #fefefe\"> <span class=\"glyphicon glyphicon-user\"></span>Sign Up</b>\n");
      out.write("                   <span class=\"caret\"></span></a>\n");
      out.write("        <ul class=\"dropdown-menu\">\n");
      out.write("          <li><a href=\"dsignup.jsp\">Doctor SignUp</a></li>\n");
      out.write("          <li><a href=\"patientsignup.jsp\">Patient SignUP</a></li>\n");
      out.write("         \n");
      out.write("        </ul>\n");
      out.write("      </li>\n");
      out.write("          <li class=\"dropdown\">\n");
      out.write("              <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><b style=\"color: #fefefe\"> <span class=\"glyphicon glyphicon-log-in\"></span>Login</b>\n");
      out.write("        <span class=\"caret\"></span></a>\n");
      out.write("        <ul class=\"dropdown-menu\">\n");
      out.write("          <li><a href=\"doctor_login.jsp\">Doctor Login</a></li>\n");
      out.write("          <li><a href=\"PatientLogin.jsp\">Patient Login</a></li>\n");
      out.write("         \n");
      out.write("        </ul>\n");
      out.write("      </li>\n");
      out.write("           \n");
      out.write("      <li><a href=\"contact.jsp\"><b style=\"color: #fefefe\"><span class=\"glyphicon glyphicon-earphone\"></span>Contact Info</b></a></li> \n");
      out.write("      </ul>\n");
      out.write("      </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("     \n");
      out.write("         <form action=\"UpdateDoctorDetails\" method=\"post\" enctype=\"multipart/form-data\"  name=\"myForm\">\n");
      out.write("           \n");
      out.write("             <br> <br><br><br><br><br><br>\n");
      out.write("            <h1 style=\"margin-left: 800px\" >Hello Doctor</h1><br><br>\n");
      out.write("            <table class=\"table table-stripped\" style=\"margin-left: 450px;width: 60%\">\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><input type=\"password\" name=\"password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td><b>Name</b></td>\n");
      out.write("                    <td><input type=\"text\" name=\"name\" placeholder=\"Enter Your Name\" class=\"form-control\" required></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><b>Email</b></td>\n");
      out.write("                    <td><input type=\"email\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" required> </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><b>Phone</b></td>\n");
      out.write("                    <td><input type=\"text\" name=\"phone\" placeholder=\"Enter Your Phone Number\" class=\"form-control\" required=\"\"></td>\n");
      out.write("                </tr>\n");
      out.write("               \n");
      out.write("               \n");
      out.write("                <tr>\n");
      out.write("                    <td><b>Specialist</b></td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"specialist\" class=\"form-control\">\n");
      out.write("                            <option value=\"0\">Select From Here</option>\n");
      out.write("                            <option value=\"Bones\">Bones</option>\n");
      out.write("                            <option value=\"General Surgery\">General Surgery</option>\n");
      out.write("                            <option value=\"Burn\">Burn</option>\n");
      out.write("                            <option value=\"Family Physicians\">Family Physicians</option>\n");
      out.write("                            <option value=\"Cardiologist\">Cardiologist</option>\n");
      out.write("                            <option value=\"Dermatologist\">Dermatologist</option>\n");
      out.write("                            <option value=\"Gastroenterologist\">Gastroenterologist</option>\n");
      out.write("                            <option value=\"Allergist\">Allergist</option>\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><b>Profile Picture</b></td>\n");
      out.write("                    <td><input type=\"file\" name=\"file\" class=\"form-control\"></td>\n");
      out.write("                </tr>\n");
      out.write("              \n");
      out.write("                \n");
      out.write("                  <tr>\n");
      out.write("                    <td rowspan=\"2\"><input type=\"submit\" class=\"btn btn-success\" style=\"position: relative;left: 251px\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("          \n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("     <footer class=\"container-fluid bg-4 text-center\" style=\"background-color: black\">\n");
      out.write("  <div class=\"col-md-3 mb-md-0 mb-3\">\n");
      out.write("      \n");
      out.write("   <h3   style=\"color: white; font-family: 'Abril Fatface';\" class=\"text-uppercase\">Create Your Account</h3>\n");
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
      out.write("            <h3  style=\"color: white; font-family: 'Abril Fatface';\" class=\"text-uppercase\">Get in Touch</h3>\n");
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
      out.write("    </body>\n");
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
