package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("     <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("  \n");
      out.write("    <title>Bootstrap contact form</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("     <link rel=\"shortcut icon\" href=\"img/favicon (2).ico\" type=\"image/x-icon\">\n");
      out.write("<link rel=\"icon\" href=\"img/favicon (2).ico\" type=\"image/x-icon\">\n");
      out.write("\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <h2 class=\"text-center\" style=\"margin-top:30px;\">Bootstrap contact form</h2>\n");
      out.write("    <div class=\"container\" style=\"background-color: #3E5F68;margin-top:20px;color:#C8EFF0;\">\n");
      out.write("    \t\n");
      out.write("    \t\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-sm-12 text-center\">\n");
      out.write("            <h2>Contact Us</h2>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-sm-8\">\n");
      out.write("            <h3 class=\"white\">Get In Touch</h3>\n");
      out.write("            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <form id=\"contact-form\" class=\"form-horizontal\" role=\"form\">\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label for=\"name\" class=\"col-12  col-lg-2  control-label\">Name:</label>\n");
      out.write("                <div class=\"col-12  col-lg-10\">\n");
      out.write("                  <input class=\"form-control\" name=\"name\" id=\"name\" type=\"text\">\n");
      out.write("                </div>\n");
      out.write("              </div>                  \n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label for=\"email\" class=\"col-12  col-lg-2  control-label\" style=\"color:white; \">Email:</label>\n");
      out.write("                <div class=\"col-12  col-lg-10\">\n");
      out.write("                  <input class=\"form-control\" name=\"email\" id=\"email\" type=\"email\">\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label for=\"message\" class=\"col-12  col-lg-2  control-label\">Message:</label>\n");
      out.write("                <div class=\"col-12  col-lg-10\">\n");
      out.write("                  <textarea class=\"form-control\" rows=\"7\" name=\"message\" id=\"message\"></textarea>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <div class=\"col-12  col-lg-2\">&nbsp;</div>\n");
      out.write("                <div class=\"col-12  col-lg-10\">\n");
      out.write("                  <button type=\"submit\" class=\"btn btn-info btn-lg btn-full\" style=\"background-color: #7d9298\">Send</button>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </form>\n");
      out.write("          </div><!--End Col 8-->\n");
      out.write("          \n");
      out.write("          <div class=\"col-sm-4\">\n");
      out.write("                <form>\n");
      out.write("            <h3><span class=\"glyphicon glyphicon-globe\"></span> Our office</h3>\n");
      out.write("            <address>\n");
      out.write("                <strong>Abc, Inc.</strong><br>\n");
      out.write("                XXX Ave, Suite yyy<br>\n");
      out.write("                city, state 00000<br>\n");
      out.write("                <abbr title=\"Phone\">\n");
      out.write("                    P:</abbr>\n");
      out.write("                (123) 456-7890\n");
      out.write("            </address>\n");
      out.write("            <address>\n");
      out.write("                <strong>Email</strong><br>\n");
      out.write("                <a href=\"\">email@example.com</a>\n");
      out.write("            </address>\n");
      out.write("            </form>\n");
      out.write("            <br>\n");
      out.write("            <h3>Find Us At</h3>\n");
      out.write("            <ul class=\"list-inline share-buttons\">\n");
      out.write("           \n");
      out.write("\t<li><a href=\"https://www.facebook.com/sharer/sharer.php?u=&t=\" target=\"_blank\" title=\"Share on facebook\"><img src=\"img/flat_web_icon_set/color/Facebook.png\"></a></li>\n");
      out.write("\t<li><a href=\"https://twitter.com/intent/tweet?source=&text=:%20\" target=\"_blank\" title=\"Tweet\"><img src=\"img/flat_web_icon_set/color/Twitter.png\"></a></li>\n");
      out.write("\t<li><a href=\"https://plus.google.com/share?url=\" target=\"_blank\" title=\"Share on Google+\"><img src=\"img/flat_web_icon_set/color/GooglePlus.png\"></a></li>\n");
      out.write("</ul>\n");
      out.write("              \n");
      out.write("            \n");
      out.write("          </div><!--End Col 4-->\n");
      out.write("        </div><!--End Row-->\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
