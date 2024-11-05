package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import modele.UtilisateursModele;
import dao.UtilisateursDao;

public final class aproposUsers_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/aproposUsers.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("             .product-container {\n");
      out.write("    display: flex;\n");
      out.write("    flex-wrap: wrap;\n");
      out.write("    justify-content: center;\n");
      out.write("    max-height: 600px; /* Limite la hauteur */\n");
      out.write("    overflow-y: auto;  /* Barre de défilement */\n");
      out.write("    padding: 20px;\n");
      out.write("    margin-top: 1px;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"product-container\">\n");
      out.write("          ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "usersAdmin.jsp", out, false);
      out.write("\n");
      out.write("          </div>\n");
      out.write("          ");
 
    
    UtilisateursDao dao = new UtilisateursDao();
    List<UtilisateursModele> list = dao.fetchall();
    int i = 0;
    
    for(UtilisateursModele perso:list){
        int id = perso.getId();
            out.println("<tr>");
          
            out.println("<td>"+perso.getId()+"</td>");
            out.println("<td>"+perso.getNom()+"</td>");
            out.println("<td>"+perso.getEmail()+"</td>");
            
            out.println("<td><button class='btn btn-success' data-bs-toggle='modal' data-bs-target='#mod-modal"+perso.getId()+"'>Modifier</button></td>");
            out.println("<td><a href='#' class='btn btn-danger'data-bs-toggle='modal' data-bs-target='#sup-modal"+perso.getId()+"'>Supprimer</a></td>");
            out.println("</tr> ");
            i++;
 

      out.write("\n");
      out.write("         <div class=\"about-container\">\n");
      out.write("            \n");
      out.write("        <h1>A propos</h1>\n");
      out.write("        <div class=\"info\">\n");
      out.write("            <p><strong>Nom : </strong><span id=\"name\">John Doe</span></p>\n");
      out.write("            <p><strong>Email : </strong><span id=\"email\">john.doe@example.com</span></p>\n");
      out.write("            <p><strong>Solde : </strong><span id=\"balance\">1</span></p>\n");
      out.write("        </div>\n");
      out.write("        <button class=\"btn-modify\" onclick=\"modifyInfo()\">Modifier</button>\n");
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
