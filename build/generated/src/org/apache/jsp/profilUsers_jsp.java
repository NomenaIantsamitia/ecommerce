package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profilUsers_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("     <style>\n");
      out.write("    * {\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("    font-family: Arial, sans-serif;\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    align-items: center;\n");
      out.write("    height: 100vh;\n");
      out.write("    background-color: #f4f4f9;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("    text-align: center;\n");
      out.write("    background-color: #fff;\n");
      out.write("    padding: 20px;\n");
      out.write("    width: 400px;\n");
      out.write("    border-radius: 10px;\n");
      out.write("    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("}\n");
      out.write("\n");
      out.write("h2 {\n");
      out.write("    color: #333;\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".profile-card {\n");
      out.write("    margin-top: 20px;\n");
      out.write("    padding: 20px;\n");
      out.write("    background-color: #f9f9f9;\n");
      out.write("    border-radius: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".profile-item {\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: space-between;\n");
      out.write("    margin-bottom: 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("label {\n");
      out.write("    font-weight: bold;\n");
      out.write("    color: #555;\n");
      out.write("}\n");
      out.write("\n");
      out.write("span {\n");
      out.write("    color: #333;\n");
      out.write("    padding: 4px 8px;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    background-color: #e7e7e7;\n");
      out.write("    cursor: default;\n");
      out.write("}\n");
      out.write(" </style>\n");
      out.write("    <body>\n");
      out.write("            <div class=\"container\">\n");
      out.write("        <h2>Profil Utilisateur</h2>\n");
      out.write("        <div class=\"profile-card\">\n");
      out.write("            <div class=\"profile-item\">\n");
      out.write("                <label>Nom :</label>\n");
      out.write("                <span></span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"profile-item\">\n");
      out.write("                <label>Numéro de compte :</label>\n");
      out.write("                <span></span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"profile-item\">\n");
      out.write("                <label>Solde :</label>\n");
      out.write("                <span> €</span>\n");
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
