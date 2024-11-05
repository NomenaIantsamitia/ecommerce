package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.ListesDao;
import java.util.List;
import modele.AjoutModele;
import dao.AjoutDao;

public final class listes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"bootstrap/bootstrap-5.0.2-dist/css/bootstrap.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/lister.css\">\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <section>\n");
      out.write("\n");
      out.write("    <article>\n");
      out.write("<h2 class=\"text-danger\" style=\"text-align: center ; font-weight: bold; margin-bottom: 50px ;padding-top: 50px\">Taches a effectuer </h2>\n");
      out.write("<div class=\"col-md-6\">\n");
      out.write("    <form class=\"form-inline my-2 my-lg-2\" >\n");
      out.write("        <p>\n");
      out.write("        <input type=\"search\" class=\"form-control\" id=\"cherche\" aria-label=\"search\" placeholder=\"Recherche\">\n");
      out.write("        <button class=\"btn btn-primary my-2 my-sm-0\" type=\"submit\" name=\"cherche\">Recherche</button>\n");
      out.write("        </p>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("        <table>\n");
      out.write("            <thead>\n");
      out.write("            <tr>\n");
      out.write("                <th></th>\n");
      out.write("                <th>Titre</th>\n");
      out.write("                <th>Date d'echeances</th>\n");
      out.write("                <th>Prioriter</th>\n");
      out.write("                <th colspan=\"2\">Action</th>\n");
      out.write("            </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody id=\"tableau\">\n");

    ListesDao dao = new ListesDao();
    List<AjoutModele> list = dao.fetchAll();
    int i = 0;
    
    for(AjoutModele perso:list){
        int id = perso.getId();
            out.println("<tr>");
            out.println("<td><input type='checkbox' onclick='redirectToLink("+perso.getId()+")'></td>");
            out.println("<td>"+perso.getTitre()+"</td>");
            out.println("<td>"+perso.getDate_echeance()+"</td>");
            out.println("<td>"+perso.getPrioriter()+"</td>");
            
            out.println("<td><button class='btn btn-success' data-bs-toggle='modal' data-bs-target='#mod-modal"+perso.getId()+"'>Modifier</button> </td>");
            out.println("<td><button class='btn btn-danger' data-bs-toggle='modal' data-bs-target='#sup-modal"+perso.getId()+"'>Suprimer</button></td>");
            out.println("</tr> ");
            i++;
            
      out.write("\n");
      out.write("            <div class=\"modal fade\" id=\"sup-modal");
      out.print(id);
      out.write("\" tabindex=\"-1\" aria-labelledby=\"modal-title\" aria-hidden=\"true\">\n");
      out.write("                <div class=\"modal-dialog\">\n");
      out.write("                    <div class=\"modal-content\">\n");
      out.write("                        <div class=\"modal-header\">\n");
      out.write("                            <h5 class=\"modal-title\" id=\"modal-title\">Confirmation</h5>\n");
      out.write("                            <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">\n");
      out.write("                            <p>Voullez vous vraiment supprimer ?</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <a href='SupprimerServlet?id=");
      out.print( id );
      out.write("' class=\"btn btn-succes\">Oui</a>\n");
      out.write("                            <button class=\"btn btn-danger\" data-bs-dismiss=\"modal\">Non</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                            \n");
      out.write("       <div class=\"modal fade\" id=\"mod-modal");
      out.print(id);
      out.write("\" tabindex=\"-1\" aria-labelledby=\"modal-title\" aria-hidden=\"true\">\n");
      out.write("        <div class=\"modal-dialog\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\"  style=\"background: #213A57; color: white;\">\n");
      out.write("                    <h5 class=\"modal-title\" id=\"modal-title\">Modification</h5>\n");
      out.write("                    <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("                     <form action=\"ModifierServlet\" method=\"post\" name=\"formulaire\" onsubmit=\"return verification()\">\n");
      out.write("                        <label>Titre</label><br>\n");
      out.write("                        <input type=\"hidden\" name=\"id\" value=\"");
      out.print( perso.getId() );
      out.write("\" class=\"form-control\">\n");
      out.write("                        <input type=\"text\" name=\"titre\" placeholder=\"Titre\" value=\"");
      out.print( perso.getTitre() );
      out.write("\"  class=\"form-control\"><br><br>\n");
      out.write("                        <label>Description :</label><br>\n");
      out.write("                        <textarea row=\"8\" cols=\"60\" name=\"description\"  class=\"form-control\">");
      out.print( perso.getDescription() );
      out.write("</textarea><br><br>\n");
      out.write("                        <label>Date d'echéance :</label><br>\n");
      out.write("                        <input type=\"date\" name=\"datefin\" placeholder=\"Date d'echeance\" value=\"");
      out.print( perso.getDate_echeance() );
      out.write("\"  class=\"form-control\"><br><br>\n");
      out.write("                        <label>Prioriter : </label>\n");
      out.write("                        <select name=\"prioriter\" value=\"");
      out.print( perso.getPrioriter() );
      out.write("\">\n");
      out.write("                            <option value=\"A\">Urgent et important</option>\n");
      out.write("                            <option value=\"B\">Urgent mais non important</option>\n");
      out.write("                            <option value=\"C\">Important mais non urgent</option>\n");
      out.write("                            <option value=\"D\">Non urgent et non important</option>\n");
      out.write("                        </select><br><br>\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-succes\" value=\"Modifier\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-danger\" data-bs-dismiss=\"modal\">Annuler</button>\n");
      out.write("                     </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("  </tbody>\n");
      out.write("     ");
} 
        out.println("</table>");
        if(i == 0){
            out.println("<h1> ");
            out.println("Aucun taches pour le moment");
            out.println("</h1> ");
      }

      out.write(" \n");
      out.write("    </article>\n");
      out.write("    </section>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("    <style>\n");
      out.write("        tr.hidden{\n");
      out.write("        display:none;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <script src=\"bootstrap/bootstrap-5.0.2-dist/js/bootstrap.min.js\"></script>   \n");
      out.write("    <script>\n");
      out.write("     document.getElementById(\"cherche\").addEventListener('keyup',function(){\n");
      out.write("        \n");
      out.write("         let mots = this.value.toLowerCase();\n");
      out.write("         let rows = document.querySelectorAll(\"#tableau tr\");\n");
      out.write("         rows.forEach(function(row){\n");
      out.write("             let misy = false;\n");
      out.write("             let cells = row.querySelectorAll(\"td\");\n");
      out.write("             cells.forEach(function(cell){\n");
      out.write("                 if(cell.textContent.toLowerCase().includes(mots)){\n");
      out.write("                     misy = true;\n");
      out.write("                 }\n");
      out.write("             })\n");
      out.write("             if(misy){\n");
      out.write("                 row.classList.remove('hidden');\n");
      out.write("                 console.log(mots)\n");
      out.write("             } else {\n");
      out.write("                 row.classList.add('hidden');\n");
      out.write("             }\n");
      out.write("         });\n");
      out.write("     });\n");
      out.write("    function redirectToLink(id){\n");
      out.write("        window.location.href='TerminerServlet?id='+id+'';\n");
      out.write("    }\n");
      out.write("  </script>\n");
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
