package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class usersAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"css/utilisateurs.css\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"javascript/users.js\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"bootstrap/bootstrap-5.0.2-dist/css/bootstrap.css\">\n");
      out.write("    <script src=\"bootstrap/bootstrap-5.0.2-dist/js/bootstrap.min.js\"></script>\n");
      out.write("           <style>\n");
      out.write("\n");
      out.write(".about-container {\n");
      out.write("    background-color: #fff;\n");
      out.write("    padding: 30px;\n");
      out.write("    border-radius: 10px;\n");
      out.write("    box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);\n");
      out.write("    width: 300px;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".about-container h1 {\n");
      out.write("    font-size: 24px;\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("    color: #333;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".info p {\n");
      out.write("    font-size: 16px;\n");
      out.write("    margin-bottom: 15px;\n");
      out.write("    color: #555;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".info span {\n");
      out.write("    color: #007bff;\n");
      out.write("    font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn-modify {\n");
      out.write("    background-color: #007bff;\n");
      out.write("    color: white;\n");
      out.write("    border: none;\n");
      out.write("    padding: 10px 20px;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    transition: background-color 0.3s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn-modify:hover {\n");
      out.write("    background-color: #0056b3;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    .profile-img {\n");
      out.write("    width: 100px;  /* Ajuste la taille ici */\n");
      out.write("    height: 100px; /* Ajuste la taille ici */\n");
      out.write("    border-radius: 50%;  /* Rend l'image circulaire */\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <header>\n");
      out.write("         <div class=\"navbar\">\n");
      out.write("        <div class=\"user-profile\">\n");
      out.write("            <a href=\"admin.jsp\">\n");
      out.write("                <img src=\"Koala.jpg\" alt=\"Profile Image\" class=\"profile-img\">\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"nav-links\">\n");
      out.write("            <button class=\"nav-btn\">Acceuil</button>\n");
      out.write("             <button class=\"nav-btn\" data-bs-toggle='modal' data-bs-target='#addCommandeModals'>A propos</button>\n");
      out.write("             <a href=\"loginUsers.jsp\" class=\"nav-btn logout-btn\">Déconnexion</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    </header>\n");
      out.write("        \n");
      out.write("         <div class=\"modal fade\" id=\"addCommandeModals\" tabindex=\"-1\" aria-labelledby=\"addCommandeModalLabel\" aria-hidden=\"true\">\n");
      out.write("        <div class=\"modal-dialog\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                         <div class=\"about-container\">\n");
      out.write("            \n");
      out.write("        <h1>A propos</h1>\n");
      out.write("        <div class=\"info\">\n");
      out.write("            <p><strong>Nom : </strong><span id=\"name\">John Doe</span></p>\n");
      out.write("            <p><strong>Email : </strong><span id=\"email\">john.doe@example.com</span></p>\n");
      out.write("            <p><strong>Solde : </strong><span id=\"balance\">1</span></p>\n");
      out.write("        </div>\n");
      out.write("        <button class=\"btn-modify\" onclick=\"modifyInfo()\">Ajouter solde</button>\n");
      out.write("    </div>\n");
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
