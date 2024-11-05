package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <link rel=\"stylesheet\" href=\"bootstrap/bootstrap-5.0.2-dist/css/bootstrap.css\">\n");
      out.write("        <script src=\"bootstrap/bootstrap-5.0.2-dist/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("         body {\n");
      out.write("            background-color: #f7f7f7;\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login-container {\n");
      out.write("            margin-top: 100px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .card {\n");
      out.write("            border: none;\n");
      out.write("            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .card-header {\n");
      out.write("            background-color: #007bff;\n");
      out.write("            color: #fff;\n");
      out.write("            text-align: center;\n");
      out.write("            font-size: 24px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btn-custom {\n");
      out.write("            width: 100%;\n");
      out.write("            font-size: 18px;\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btn-admin {\n");
      out.write("            background-color: #343a40;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btn-user {\n");
      out.write("            background-color: #007bff;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btn-admin:hover, .btn-user:hover {\n");
      out.write("            opacity: 0.85;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container login-container\">\n");
      out.write("        <div class=\"row justify-content-center\">\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <div class=\"card-header\">\n");
      out.write("                        Gestion de stock\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <p class=\"text-center\">Veuillez connecter selon votre status</p>\n");
      out.write("                        <div class=\"d-grid gap-2\">\n");
      out.write("                            <a href=\"AdminChoixServlet\" class=\"btn btn-admin btn-custom\"> Administrateurs</a>\n");
      out.write("                            <a href=\"UtilisateursChoixServlet\" class=\"btn btn-user btn-custom\">Utilisateurs</a>\n");
      out.write("    <i class=\"fas fa-shopping-cart\">Voir le panier</i> \n");
      out.write("    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"feather feather-shopping-cart\">\n");
      out.write("  <circle cx=\"9\" cy=\"21\" r=\"1\"></circle>\n");
      out.write("  <circle cx=\"20\" cy=\"21\" r=\"1\"></circle>\n");
      out.write("  <path d=\"M1 1h4l2.68 13.39a2 2 0 0 0 2 1.61h9.72a2 2 0 0 0 2-1.61L23 6H6\"></path>\n");
      out.write("</svg>i\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
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
