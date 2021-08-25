package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class roommate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <title>Profile</title>\n");
      out.write("        <style>\n");
      out.write("            body, html {\n");
      out.write("                height: 93%;\n");
      out.write("                margin: 0;\n");
      out.write("                font-family: Arial, Helvetica, sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .hero-text {\n");
      out.write("                text-align: center;\n");
      out.write("                position: absolute;\n");
      out.write("                top: 50%;\n");
      out.write("                left: 50%;\n");
      out.write("                transform: translate(-50%, -50%);\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .hero-text button {\n");
      out.write("                border: none;\n");
      out.write("                outline: 0;\n");
      out.write("                display: inline-block;\n");
      out.write("                padding: 10px 25px;\n");
      out.write("                color: black;\n");
      out.write("                background-color: #ddd;\n");
      out.write("                text-align: center;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .hero-text button:hover {\n");
      out.write("                background-color: #555;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div style=\"float: left;width: 60%;background-color: lightcoral\">\n");
      out.write("\n");
      out.write("            <div style=\"height: 240px;width: 100%;float: left;\">              \n");
      out.write("                <div style=\"width: 310px;margin-left: 50px;float: left;margin-top: 15px;\">\n");
      out.write("                    <img src='images/Avatar (3).jpg 'style=\"width: 200px;height: 200px;margin-left: 5%\">     \n");
      out.write("                </div>\n");
      out.write("                <div id=\"\" name = \"address\" for=\"\" style=\"margin-left: 40px;margin-top: 15px;float: left;width: 200px\">  \n");
      out.write("<!--                    <p style=\"\"><b></b></p>\n");
      out.write("                    Ho Va Ten : Nguyen Van Ha</p>\n");
      out.write("\n");
      out.write("                    <p>Age: 21<i></i></p>\n");
      out.write("                    <p>Date : 17/07/2000<b style=\"color: red\"><i></i></b></p>-->\n");
      out.write("                    <h> chua nhan dc qua </h> <i></i>\n");
      out.write("                                        \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
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
