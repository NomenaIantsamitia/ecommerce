package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class commandes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"css/commandes.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"bootstrap/bootstrap-5.0.2-dist/css/bootstrap.css\">\n");
      out.write("    <script src=\"bootstrap/bootstrap-5.0.2-dist/js/bootstrap.min.js\"></script>\n");
      out.write("     <link rel=\"stylesheet\" href=\"javascript/commandes\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <div class=\"container\">\n");
      out.write("        <!-- Inclusion du slider -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "admin.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"main-content\">\n");
      out.write("            <h2 class=\"text-center\">Liste des Commandes</h2>\n");
      out.write("\n");
      out.write("            <!-- Bouton pour ajouter une nouvelle commande -->\n");
      out.write("            <div class=\"add-btn\">\n");
      out.write("                <button class=\"btn btn-primary\" data-bs-toggle=\"modal\" data-bs-target=\"#addCommandeModal\">Ajouter Commande</button>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Champ de recherche -->\n");
      out.write("            <input type=\"text\" id=\"searchInput\" onkeyup=\"searchCommandes()\" placeholder=\"Rechercher par nom...\" class=\"search-bar\">\n");
      out.write("\n");
      out.write("            <!-- Table des commandes -->\n");
      out.write("            <div class=\"table-container\">\n");
      out.write("                <table class=\"table table-striped\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>ID</th>\n");
      out.write("                            <th>Nom du Client</th>\n");
      out.write("                            <th>Produit</th>\n");
      out.write("                            <th>Date</th>\n");
      out.write("                            <th colspan=\"2\">Action</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody id=\"commandesTable\">\n");
      out.write("                        \n");
      out.write("                        <tr>\n");
      out.write("                            <td> commande.getId</td>\n");
      out.write("                            <td>getNomClient()</td>\n");
      out.write("                            <td>Produit</td>\n");
      out.write("                            <td> Date</td>\n");
      out.write("                            <td>\n");
      out.write("                                <button class=\"btn btn-success\" data-bs-toggle=\"modal\" data-bs-target=\"#mod-modal\">Modifier</button>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <button class=\"btn btn-danger\" data-bs-toggle=\"modal\" data-bs-target=\"#sup-modal\">Supprimer</button>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                      \n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Modal pour ajouter une commande -->\n");
      out.write("    <div class=\"modal fade\" id=\"addCommandeModal\" tabindex=\"-1\" aria-labelledby=\"addCommandeModalLabel\" aria-hidden=\"true\">\n");
      out.write("        <div class=\"modal-dialog\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <h5 class=\"modal-title\" id=\"addCommandeModalLabel\">Ajouter Commande</h5>\n");
      out.write("                    <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("                    <form action=\"#\" method=\"post\">\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                            <label for=\"nomClient\" class=\"form-label\">Nom du Client</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"nomClient\" name=\"nomClient\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                            <label for=\"produit\" class=\"form-label\">Produit</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"produit\" name=\"produit\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                            <label for=\"date\" class=\"form-label\">Date</label>\n");
      out.write("                            <input type=\"date\" class=\"form-control\" id=\"date\" name=\"date\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">Ajouter</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Script JS pour la recherche -->\n");
      out.write("    <script>\n");
      out.write("        function searchCommandes() {\n");
      out.write("            var input, filter, table, tr, td, i, j, txtValue;\n");
      out.write("            input = document.getElementById(\"searchInput\");\n");
      out.write("            filter = input.value.toUpperCase();\n");
      out.write("            table = document.getElementById(\"commandesTable\");\n");
      out.write("            tr = table.getElementsByTagName(\"tr\");\n");
      out.write("\n");
      out.write("            for (i = 0; i < tr.length; i++) {\n");
      out.write("                tr[i].style.display = \"none\"; \n");
      out.write("                td = tr[i].getElementsByTagName(\"td\");\n");
      out.write("                for (j = 0; j < td.length; j++) {\n");
      out.write("                    if (td[j]) {\n");
      out.write("                        txtValue = td[j].textContent || td[j].innerText;\n");
      out.write("                        if (txtValue.toUpperCase().indexOf(filter) > -1) {\n");
      out.write("                            tr[i].style.display = \"\";\n");
      out.write("                            break;\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </script>\n");
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
