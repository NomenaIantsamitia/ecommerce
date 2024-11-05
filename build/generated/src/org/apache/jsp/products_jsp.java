package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modele.ProduitModele;
import java.util.List;
import dao.ProduitsDao;

public final class products_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("          <link rel=\"stylesheet\" href=\"css/products.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"bootstrap/bootstrap-5.0.2-dist/css/bootstrap.css\">\n");
      out.write("    <script src=\"bootstrap/bootstrap-5.0.2-dist/js/bootstrap.min.js\"></script>\n");
      out.write("     <link rel=\"stylesheet\" href=\"javascript/products.js\">\n");
      out.write("    <style>\n");
      out.write("        .error-message {\n");
      out.write("            color: red;\n");
      out.write("            font-size: 0.9em;\n");
      out.write("            display: none;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("             ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "admin.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"main-container\">\n");
      out.write("        <!-- Inclusion de sliders.jsp -->\n");
      out.write("        \n");
      out.write("       \n");
      out.write("      \n");
      out.write("\n");
      out.write("        <!-- Contenu principal de la page -->\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h2 class=\"text-danger text-center my-5\">Gestion des Produits</h2>\n");
      out.write("\n");
      out.write("         <button type=\"button\" class=\"btn btn-primary\" data-bs-toggle=\"modal\" data-bs-target=\"#addProductModal\">\n");
      out.write("        Ajouter un produit\n");
      out.write("    </button>\n");
      out.write("\n");
      out.write("                <!-- Champ de recherche -->\n");
      out.write("                <input type=\"text\" id=\"searchInput\" placeholder=\"Rechercher un produit...\" class=\"form-control mb-4\" onkeyup=\"searchFunction()\">\n");
      out.write(" <div class=\"container mt-5\">\n");
      out.write("      \n");
      out.write("\n");
      out.write("     <!-- Modal -->\n");
      out.write("    <div class=\"modal fade\" id=\"addProductModal\" tabindex=\"-1\" aria-labelledby=\"addProductModalLabel\" aria-hidden=\"true\">\n");
      out.write("        <div class=\"modal-dialog\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <h5 class=\"modal-title\" id=\"addProductModalLabel\">Ajouter un produit</h5>\n");
      out.write("                    <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("                    <form action=\"AddProjectServlet\" method=\"post\" id=\"productForm\" enctype=\"multipart/form-data\">\n");
      out.write("                        \n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                            <label for=\"productName\" class=\"form-label\">Nom</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"productName\" name=\"nom\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                        <label for=\"file\">Sélectionnez une image :</label>\n");
      out.write("                        <input type=\"file\" id=\"file\" name=\"file\" accept=\"image/*\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                            <label for=\"productCategory\" class=\"form-label\">Catégorie</label>\n");
      out.write("                            <select name=\"categorie\" id=\"productCategory\" class=\"form-select\">\n");
      out.write("                                <option value=\"electronique\">Électronique</option>\n");
      out.write("                                <option value=\"sport\">Sport</option>\n");
      out.write("                                <option value=\"jeux\">Jeux</option>\n");
      out.write("                                <option value=\"accessoires\">Accessoires</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                       \n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                            <label for=\"productPrice\" class=\"form-label\">Prix</label>\n");
      out.write("                            <input type=\"number\" class=\"form-control\" id=\"productPrice\" name=\"prix\" required>\n");
      out.write("                            <span class=\"error-message\" id=\"priceError\">Prix negatif ou trop petit valeurs </span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Quantité -->\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                            <label for=\"productQuantity\" class=\"form-label\">Quantité</label>\n");
      out.write("                            <input type=\"number\" class=\"form-control\" id=\"productQuantity\" name=\"qtt\" required>\n");
      out.write("                            <span class=\"error-message\" id=\"quantityError\">La quantité doit être un nombre strictement positif.</span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Bouton Ajouter -->\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-success\">Ajouter</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("                <!-- Table des produits avec scrollbar -->\n");
      out.write("                <div class=\"class=\"list-group list-group-flush border-bottom scrollarea\">\n");
      out.write("                    <table class=\"table table-striped\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Photo</th>\n");
      out.write("                                <th>Nom</th>\n");
      out.write("                                <th>Categories</th>\n");
      out.write("                                <th>Prix/Unite</th>\n");
      out.write("                                <th>Quantité</th>\n");
      out.write("                                <th>Action</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <div class=\"list-group list-group-flush border-bottom scrollarea\">\n");
      out.write("                        <tbody id=\"productTable\">\n");
      out.write(" ");

    ProduitsDao dao = new ProduitsDao();
    List<ProduitModele> lisitra = dao.findAll();
    int i=0;
    for(ProduitModele perso:lisitra){
        int id_users = perso.getId();
            out.println("<tr> ");
             out.println("<td><img src='image/"+perso.getImg()+"' style='width:50px;height:50px;'></td>");
            out.println("<td>"+perso.getNom()+"</td>");
            out.println("<td>"+perso.getCategorie()+"</td>");
            out.println("<td>"+perso.getTaux()+"</td>");
            out.println("<td>"+perso.getQtt()+"</td>");
            out.println("<td><a href='modifierPersonne.jsp' class='btn btn-success'>Modifier</a></td>");
            out.println("<td><a href='SupprimerPersonneServlet' class='btn btn-danger'>supprimer</a></td>");
            out.println("</tr> ");
            i++;

    } 
    out.println(" </tbody></div></table>");
    
    if(i == 0){
        out.println("<h1 style='text-align:center; color:red;'> ");
        out.println("Aucun .....");
        out.println("</h1> ");
    }

      out.write("                           \n");
      out.write(" \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("            <script>\n");
      out.write("function searchFunction() {\n");
      out.write("    var input, filter, table, tr, td, i, j, txtValue;\n");
      out.write("    input = document.getElementById(\"searchInput\");\n");
      out.write("    filter = input.value.toUpperCase();\n");
      out.write("    table = document.getElementById(\"productTable\");\n");
      out.write("    tr = table.getElementsByTagName(\"tr\");\n");
      out.write("\n");
      out.write("    // Boucle à travers toutes les lignes de table et cache celles qui ne correspondent pas à la recherche\n");
      out.write("    for (i = 0; i < tr.length; i++) {\n");
      out.write("        tr[i].style.display = \"none\"; // Masquer toutes les lignes au départ\n");
      out.write("        td = tr[i].getElementsByTagName(\"td\");\n");
      out.write("        for (j = 0; j < td.length; j++) {\n");
      out.write("            if (td[j]) {\n");
      out.write("                txtValue = td[j].textContent || td[j].innerText;\n");
      out.write("                if (txtValue.toUpperCase().indexOf(filter) > -1) {\n");
      out.write("                    tr[i].style.display = \"\"; // Afficher la ligne si une colonne correspond à la recherche\n");
      out.write("                    break;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("      document.getElementById('productForm').addEventListener('submit', function(event) {\n");
      out.write("            let price = document.getElementById('productPrice').value;\n");
      out.write("            let quantity = document.getElementById('productQuantity').value;\n");
      out.write("            let isValid = true;\n");
      out.write("\n");
      out.write("            // Vérification du prix\n");
      out.write("            if (price <= 1000 || !/^[0-9]+$/.test(price)) {\n");
      out.write("                document.getElementById('priceError').style.display = 'block';\n");
      out.write("                isValid = false;\n");
      out.write("            } \n");
      out.write("            else {\n");
      out.write("                document.getElementById('priceError').style.display = 'none';\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            // Vérification de la quantité\n");
      out.write("            if (quantity <= 0 || !/^[0-9]+$/.test(quantity)) {\n");
      out.write("                document.getElementById('quantityError').style.display = 'block';\n");
      out.write("                isValid = false;\n");
      out.write("            } else {\n");
      out.write("                document.getElementById('quantityError').style.display = 'none';\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            // Si invalid, prévenir l'envoi du formulaire\n");
      out.write("            if (!isValid) {\n");
      out.write("                event.preventDefault();\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("\n");
      out.write("            </script>\n");
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
