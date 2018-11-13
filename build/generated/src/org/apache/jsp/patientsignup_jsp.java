package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class patientsignup_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Patient Sign Up</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("body, html {\n");
      out.write("    height: 100%;\n");
      out.write("    font-family: Arial, Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("* {\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bg-img {\n");
      out.write("    /* The image used */\n");
      out.write("    background-image: url(\"image/mus17.jpg\");\n");
      out.write("\n");
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
      out.write("    left : 50px;\n");
      out.write("    margin: 20px;\n");
      out.write("    max-width: 350px;\n");
      out.write("    padding: 16px;\n");
      out.write("    background-color: white;\n");
      out.write("    top: 110px;\n");
      out.write("    \n");
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
      out.write(".imgcontainer {\n");
      out.write("    text-align: center;\n");
      out.write("    margin: 24px 0 12px 0;\n");
      out.write("    position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write("img.avatar {\n");
      out.write("    width: 40%;\n");
      out.write("    border-radius: 50%;\n");
      out.write("}\n");
      out.write(".cbtn {\n");
      out.write("  background-color:  #f44336;\n");
      out.write("  color: white;\n");
      out.write("  padding: 16px 20px;\n");
      out.write("  border: none;\n");
      out.write("  cursor: pointer;\n");
      out.write("  width: 100%;\n");
      out.write("  opacity: 0.9;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    <body>\n");
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
      out.write("          <li><a href=\"signup.jsp\"><b style=\"color: #fefefe\"> <span class=\"glyphicon glyphicon-user\"></span>Sign Up</b></a></li>\n");
      out.write("          <li class=\"dropdown\">\n");
      out.write("              <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><b style=\"color: #fefefe\"> <span class=\"glyphicon glyphicon-user\"></span>Login</b>\n");
      out.write("        <span class=\"caret\"></span></a>\n");
      out.write("        <ul class=\"dropdown-menu\">\n");
      out.write("          <li><a href=\"doctor_login.jsp\">Doctor Login</a></li>\n");
      out.write("          <li><a href=\"patient_login.jsp\">Patient Login</a></li>\n");
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
      out.write("       <div class=\"bg-img\">\n");
      out.write("    <form  class=\"container\" action=\"PatientSignUp\" method=\"post\">\n");
      out.write("    <h1>Sign Up</h1>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("    <label for=\"email\"><b>Email</b></label>\n");
      out.write("    <input type=\"text\" placeholder=\"Enter Email\" name=\"email\" required>\n");
      out.write("\n");
      out.write("    <label for=\"psw\"><b>Password</b></label>\n");
      out.write("    <input type=\"password\" placeholder=\"Enter Password\" name=\"password\" required>\n");
      out.write("      \n");
      out.write("    <label for=\"psw\"><b>Confirm Password</b></label>\n");
      out.write("    <input type=\"password\" placeholder=\"Confirm Password\" name=\"cpassword\" required>\n");
      out.write("    <button type=\"submit\" class=\"btn\" >Sign Up</button><br><br>\n");
      out.write("   \n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("\n");
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
