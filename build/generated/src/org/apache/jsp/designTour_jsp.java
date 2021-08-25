package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class designTour_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Viet Nam Traveling</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta property=\"og:title\" content=\"Vide\" />      \n");
      out.write("        <link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        <link href=\"css/style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        <link href=\"css/component.css\" rel  =\"stylesheet\" type=\"text/css\"  />\n");
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
      out.write("        <form action=\"designTourController\" method=\"Post\">\n");
      out.write("        <div class=\"hero-text\" style=\"background: #ddd\">\n");
      out.write("            <body style=\"background: #ddd\">\n");
      out.write("                <br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("                <table style=\"border: 4px solid #048BC1; margin-right: auto; margin-left: auto; width: 960px; height: auto\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"2\" style=\"padding: 20px 10px 15px 10px; font-size: xx-large; text-align: center; vertical-align: middle; font-weight: bold; color:#048BC1\">Design Tour<br><br></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <th style=\"width: 20%\"><p>Email:</p><br><br><br></th>\n");
      out.write("                        <td style=\"width: 80%\"><input type='text' name='email' style=\"padding: 10px 20px; font-size: 16px; ; border-radius: 5px;margin: auto;border: 0px ;width: 70%;\">\n");
      out.write("                            <br><br><br></td>  \n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <th style=\"width: 20%\">Phone:<br><br><br></th>\n");
      out.write("                        <td style=\"width: 80%\"><input type='number' name='phone' style=\"padding: 10px 20px; font-size: 16px; ; border-radius: 5px;margin: auto;border: 0px;width: 70%;\">\n");
      out.write("                            <br><br><br></td>  \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th style=\"width: 20%\">Address:<br><br><br></th>\n");
      out.write("                        <td style=\"width: 80%\"><input type='text' name='address' style=\"padding: 10px 20px; font-size: 16px; ; border-radius: 5px;margin: auto;border: 0px;width: 70%;\">\n");
      out.write("                            <br><br><br></td>  \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th style=\"width: 20%\">Start time:<br><br><br></th>\n");
      out.write("                        <td style=\"width: 80%\"><input type='text' name='startTime' style=\"padding: 10px 20px; font-size: 16px; ; border-radius: 5px;margin: auto;border: 0px;width: 70%;\">\n");
      out.write("                            <br><br><br></td>  \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                        <th style=\"width: 20%\">End time:<br><br><br></th>\n");
      out.write("                        <td style=\"width: 80%\"><input type='text' name='endTime' style=\"padding: 10px 20px; font-size: 16px; ; border-radius: 5px;margin: auto;border: 0px;width: 70%;\">\n");
      out.write("                            <br><br><br></td>  \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th style=\"width: 20%\">Slot:<br><br><br></th>\n");
      out.write("                        <td style=\"width: 80%\"><input type='number' name='slot' style=\"padding: 10px 20px; font-size: 16px; ; border-radius: 5px;margin: auto;border: 0px;width: 70%;\">\n");
      out.write("                            <br><br><br></td>  \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                        <th style=\"width: 20%\">Price:<br><br><br></th>\n");
      out.write("                        <td style=\"width: 80%\"><input type='text' name='price' style=\"padding: 10px 20px; font-size: 16px; ; border-radius: 5px;margin: auto;border: 0px;width: 70%;\">\n");
      out.write("                            <br><br><br></td>  \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                        <th style=\"width: 20%\">Transport:<br><br><br></th>\n");
      out.write("                        <td style=\"width: 80%\"><input type='text' name='transport' style=\"padding: 10px 20px; font-size: 16px; ; border-radius: 5px;margin: auto;border: 0px;width: 70%;\">\n");
      out.write("                            <br><br><br></td>  \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"2\" style=\"text-align: center;\">\n");
      out.write("                            <button type=\"submit\" style=\"background: #03a9f4;\n");
      out.write("                                    font-size:16px;border-radius: 5px;color: #ffffff;padding: 10px 20px;border: none;\"><b>CREATE TOUR</b></button><br><br></td>          \n");
      out.write("                    </tr>             \n");
      out.write("                </table>\n");
      out.write("            </body>\n");
      out.write("        </div>\n");
      out.write("        </form>\n");
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
