package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.ListesDao;
import modele.InscriptionModele;
import modele.AjoutPersonneModele;
import dao.ListesPersonneDao;
import java.util.List;

public final class listesInscrit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/listesInscrit.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/bootstrap-5.0.2-dist/css/bootstrap.css\">\n");
      out.write("          <script src=\"bootstrap/bootstrap-5.0.2-dist/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <script>\n");
      out.write("    const tooltips = document.querySelector('.tt');\n");
      out.write("    tooltips.forEach(t => {\n");
      out.write("        new bootstrap.Tooltip(t);\n");
      out.write("    }\n");
      out.write("    )\n");
      out.write("</script>\n");
      out.write("    <body style=\"background-color: #0AD1C8\">\n");
      out.write("         <h2 class=\"text-danger\" style=\"text-align: center ; font-weight: bold; margin-bottom: 50px ;padding-top: 100px\">Listes des utilisateurs </h2>\n");
      out.write("         \n");
      out.write("<div class=\"ensemble\">\n");
      out.write("  <table>\n");
      out.write("    <tr>\n");
      out.write("      <th>Nom</th>\n");
      out.write("      <th>email</th>\n");
      out.write("      <th colspan=\"2\">Action</th>\n");
      out.write("    </tr>\n");

    ListesPersonneDao dao = new ListesPersonneDao();
    List<InscriptionModele> list = dao.fetchAll();
    int i=0;
    for(InscriptionModele perso:list){
        int id_users = perso.getId_users();
            out.println("<tr> ");
            
            out.println("<td>"+perso.getNom()+"</td>");
            out.println("<button class='btn btn-primary' data-bs-toggle='modal' data-bs-target='#sup-modal"+perso.getId_users()+"'>Enregistrer</button>");
            out.println("<td>"+perso.getEmail()+"</td>");
            out.println("<td><a href='modifierPersonne.jsp?id="+perso.getId_users()+"' class='btn btn-success'>Modifier</a></td>");
            out.println("<td><a href='SupprimerPersonneServlet?id="+perso.getId_users()+"' class='btn btn-danger'>supprimer</a></td>");
            out.println("</tr> ");
            i++;

    } 
    out.println("</table>");
    out.println("</div>");
    if(i == 0){
        out.println("<h1 style='text-align:center; color:red;'> ");
        out.println("Aucun .....");
        out.println("</h1> ");
    }

      out.write("\n");
      out.write(" \n");
      out.write("<div class=\"modal fade\" id=\"sup-modal\" tabindex=\"-1\" aria-labelledby=\"modal-title\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <h5 class=\"modal-title\" id=\"modal-title\">Confirmation</h5>\n");
      out.write("                <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <p>Voullez vous vraiment</p>\n");
      out.write("\n");
      out.write(" \n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-footer\">\n");
      out.write("                <a href=\"SupprimerPersonneServlet?id=\" class='btn btn-success'>Modifier</a>\n");
      out.write("                <button class=\"btn btn-danger\">Non</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
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
