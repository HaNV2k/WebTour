package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            .hero-image {\n");
      out.write("                background-image: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)), url(\"images/111.jpg\");\n");
      out.write("                height: 100%;\n");
      out.write("                background-position: center;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-size: cover;\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .hero-text {\n");
      out.write("                text-align: center;\n");
      out.write("                position: absolute;\n");
      out.write("                top: 50%;\n");
      out.write("                left: 50%;\n");
      out.write("                transform: translate(-50%, -50%);\n");
      out.write("                color: white;\n");
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
      out.write("        <div>\t\n");
      out.write("            <div class=\"header\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <a class=\"navbar-brand\" href=\"home.jsp\">Viet Nam <span>Traveling</span></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"top-nav\">\n");
      out.write("                        <nav class=\"top-nav-bottom cbp-spmenu cbp-spmenu-vertical cbp-spmenu-right\" id=\"cbp-spmenu-s2\">\n");
      out.write("                            <h3>Menu</h3>\n");
      out.write("                            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/home.jsp\">Home</a>                            \n");
      out.write("                            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/favoriteDestination.jsp\">Favorite destination</a>\n");
      out.write("                            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/login.jsp\">Login</a>\n");
      out.write("                            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/designTour.jsp\">Design Tour</a>         \n");
      out.write("                            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/new.jsp\">News</a>\n");
      out.write("                            \n");
      out.write("                        </nav>\n");
      out.write("                        <div class=\"main buttonset\">\t\n");
      out.write("\n");
      out.write("                            <button id=\"showRightPush\"><img src=\"images/menu.png\" alt=\"\"/></button>\n");
      out.write("\n");
      out.write("                            <script src=\"js/classie.js\"></script>\n");
      out.write("                            <script>\n");
      out.write("                                var menuRight = document.getElementById('cbp-spmenu-s2'),\n");
      out.write("                                        showRightPush = document.getElementById('showRightPush'),\n");
      out.write("                                        body = document.body;\n");
      out.write("\n");
      out.write("                                showRightPush.onclick = function () {\n");
      out.write("                                    classie.toggle(this, 'active');\n");
      out.write("                                    classie.toggle(body, 'cbp-spmenu-push-toleft');\n");
      out.write("                                    classie.toggle(menuRight, 'cbp-spmenu-open');\n");
      out.write("                                    disableOther('showRightPush');\n");
      out.write("                                };\n");
      out.write("\n");
      out.write("                                function disableOther(button) {\n");
      out.write("                                    if (button !== 'showRightPush') {\n");
      out.write("                                        classie.toggle(showRightPush, 'disabled');\n");
      out.write("                                    }\n");
      out.write("                                }\n");
      out.write("                            </script>\n");
      out.write("\n");
      out.write("                        </div>\t\n");
      out.write("                        <div class=\"clearfix\"> </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"hero-image\">\n");
      out.write("            <div class=\"hero-text\">\n");
      out.write("                <h1 style=\"font-size:50px\">Happiness is travelling</h1>\n");
      out.write("                <p>Let's start your journey with us, your dream will come true</p>\n");
      out.write("                <button><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("//listTours\">Explore now</a></button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
