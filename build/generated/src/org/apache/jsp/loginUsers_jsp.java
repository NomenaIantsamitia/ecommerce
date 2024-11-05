package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginUsers_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link rel=\"stylesheet\" href=\"bootstrap/bootstrap-5.0.2-dist/css/bootstrap.css\">\n");
      out.write("    <script src=\"bootstrap/bootstrap-5.0.2-dist/js/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("        /* Style de la page */\n");
      out.write("        body {\n");
      out.write("            background: linear-gradient(135deg, #71b7e6, #9b59b6);\n");
      out.write("            height: 100vh;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login-container {\n");
      out.write("            background-color: white;\n");
      out.write("            padding: 2rem;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-shadow: 0 10px 20px rgba(0, 0, 0, 0.2);\n");
      out.write("            width: 100%;\n");
      out.write("            max-width: 400px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login-container h2 {\n");
      out.write("            text-align: center;\n");
      out.write("            margin-bottom: 1.5rem;\n");
      out.write("            color: #333;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .form-floating label {\n");
      out.write("            transition: all 0.3s ease;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .form-control:focus + label {\n");
      out.write("            transform: translateY(-140%);\n");
      out.write("            font-size: 0.85rem;\n");
      out.write("            color: #9b59b6;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Animation pour le bouton */\n");
      out.write("        .btn-primary {\n");
      out.write("            background-color: #9b59b6;\n");
      out.write("            border-color: #9b59b6;\n");
      out.write("            transition: all 0.3s ease;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btn-primary:hover {\n");
      out.write("            background-color: #8e44ad;\n");
      out.write("            transform: scale(1.05);\n");
      out.write("            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Animation du chargement */\n");
      out.write("        .spinner-border {\n");
      out.write("            display: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .loading .spinner-border {\n");
      out.write("            display: inline-block;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .loading .btn-text {\n");
      out.write("            display: none;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div class=\"login-container\">\n");
      out.write("        <h2>Login</h2>\n");
      out.write("        <form action=\"VerificationUsersServlet\" id=\"loginForm\" onsubmit=\"return handleLogin(event)\">\n");
      out.write("            <div class=\"form-floating mb-3\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"username\" placeholder=\"Nom d'utilisateur\" name=\"nom\" required>\n");
      out.write("                <label for=\"username\">Nom d'utilisateur</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-floating mb-3\">\n");
      out.write("                <input type=\"password\" class=\"form-control\" name=\"psw\" id=\"password\" placeholder=\"Mot de passe\" required>\n");
      out.write("                <label for=\"password\">Mot de passe</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"d-grid\">\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">\n");
      out.write("                    <span class=\"btn-text\">Se connecter</span>\n");
      out.write("                    <span class=\"spinner-border spinner-border-sm\" role=\"status\" aria-hidden=\"true\"></span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("\n");
      out.write("    </script>\n");
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
