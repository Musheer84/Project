package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class doctorupdate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
 
  String email  = request.getParameter("email");
  request.setAttribute("email", email);


      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("          <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>Schedule Appointment</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <style>  body{\n");
      out.write("                background-image: url(\"image/SCHEDULE.jpg\");\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("             .navbar {\n");
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
      out.write("              <nav class=\"navbar navbar-inverse\">\n");
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
      out.write("   \n");
      out.write("         <form action=\"UpdateDoctorSchedule\" method=\"post\">\n");
      out.write("            \n");
      out.write("            <input type=\"hidden\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("            \n");
      out.write("            <table class=\"table table-stripped\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr><br>\n");
      out.write("                        <th></th>\n");
      out.write("                        <th><b style=\"color:red;\">Monday</th></b>\n");
      out.write("                        <th><b style=\"color:red \">Tuesday</th></b>\n");
      out.write("                        <th><b style=\"color:red \">Wednesday</th></b>\n");
      out.write("                        <th><b style=\"color:red \">Thursday</th></b>\n");
      out.write("                        <th><b style=\"color:red \">Friday</th></b>\n");
      out.write("                        <th><b style=\"color:red \">Saturday</th></b>\n");
      out.write("                        <th><b style=\"color:red \">Sunday</th></b>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Morning</th>\n");
      out.write("                        <th><input type=\"checkbox\" name=\"schedule\" value=\"Monday;;Morning\"/></th>\n");
      out.write("                        <th><input type=\"checkbox\" name=\"schedule\" value=\"Tuesday;;Morning\"/></th>\n");
      out.write("                        <th><input type=\"checkbox\" name=\"schedule\" value=\"Wednesday;;Morning\"/></th>\n");
      out.write("                        <th><input type=\"checkbox\" name=\"schedule\" value=\"Thursday;;Morning\"/></th>\n");
      out.write("                        <th><input type=\"checkbox\" name=\"schedule\" value=\"Friday;;Morning\"/></th>\n");
      out.write("                        <th><input type=\"checkbox\" name=\"schedule\" value=\"Saturday;;Morning\"/></th>\n");
      out.write("                        <th><input type=\"checkbox\" name=\"schedule\" value=\"Sunday;;Morning\"/></th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Afternoon</th>\n");
      out.write("                        <th><input type=\"checkbox\" name=\"schedule\" value=\"Monday;;Afternoon\"/></th>\n");
      out.write("                        <th><input type=\"checkbox\" name=\"schedule\" value=\"Tuesday;;Afternoon\"/></th>\n");
      out.write("                        <th><input type=\"checkbox\" name=\"schedule\" value=\"Wednesday;;Afternoon\"/></th>\n");
      out.write("                        <th><input type=\"checkbox\" name=\"schedule\" value=\"Thursday;;Afternoon\"/></th>\n");
      out.write("                        <th><input type=\"checkbox\" name=\"schedule\" value=\"Friday;;Afternoon\"/></th>\n");
      out.write("                        <th><input type=\"checkbox\" name=\"schedule\" value=\"Saturday;;Afternoon\"/></th>\n");
      out.write("                        <th><input type=\"checkbox\" name=\"schedule\" value=\"Sunday;;Afternoon\"/></th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Evening</th>\n");
      out.write("                        <th><input type=\"checkbox\" name=\"schedule\" value=\"Monday;;Evening\"/></th>\n");
      out.write("                        <th><input type=\"checkbox\" name=\"schedule\" value=\"Tuesday;;Evening\"/></th>\n");
      out.write("                        <th><input type=\"checkbox\" name=\"schedule\" value=\"Wednesday;;Evening\"/></th>\n");
      out.write("                        <th><input type=\"checkbox\" name=\"schedule\" value=\"Thursday;;Evening\"/></th>\n");
      out.write("                        <th><input type=\"checkbox\" name=\"schedule\" value=\"Friday;;Evening\"/></th>\n");
      out.write("                        <th><input type=\"checkbox\" name=\"schedule\" value=\"Saturday;;Evening\"/></th>\n");
      out.write("                        <th><input type=\"checkbox\" name=\"schedule\" value=\"Sunday;;Evening\"/></th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><br>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-success\" >Confirm Days</button>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
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
