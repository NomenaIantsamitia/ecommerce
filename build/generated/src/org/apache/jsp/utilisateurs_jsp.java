package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import modele.ProduitModele;
import dao.ProduitsDao;

public final class utilisateurs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"css/utilisateurs.css\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"javascript/users.js\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"bootstrap/bootstrap-5.0.2-dist/css/bootstrap.css\">\n");
      out.write("    <script src=\"bootstrap/bootstrap-5.0.2-dist/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write(" \n");
      out.write("    <body>\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "usersAdmin.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("  <section class=\"product-container\">\n");
      out.write("    ");

        ProduitsDao dao = new ProduitsDao();
        
        List<ProduitModele> lisitra = dao.findAll();
        for(ProduitModele perso : lisitra) {
            int id_users = perso.getId();
    
    
      out.write("\n");
      out.write("        <div class='product'>\n");
      out.write("            <img src='image/");
      out.print( perso.getImg() );
      out.write("' alt='Produit 1'>\n");
      out.write("            <div class='product-details'>\n");
      out.write("                <h2> ");
      out.print( perso.getNom() );
      out.write("</h2>\n");
      out.write("                <p>");
      out.print( perso.getTaux() );
      out.write(" Ar</p>\n");
      out.write("                <button data-bs-toggle='modal' data-bs-target='#addCommandeModal");
      out.print( id_users );
      out.write("'>Acheter</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <!-- Modal pour chaque produit -->\n");
      out.write("        <div class=\"modal fade\" id=\"addCommandeModal");
      out.print( id_users );
      out.write("\" tabindex=\"-1\" aria-labelledby=\"addCommandeModalLabel");
      out.print( id_users );
      out.write("\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h5 class=\"modal-title\" id=\"addCommandeModalLabel");
      out.print( id_users );
      out.write("\">Completer les champs</h5>\n");
      out.write("                        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <form action=\"AjouterCommandeServlet\" method=\"post\" name=\"formulaire\" onsubmit=\"return verification()\">\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <label for=\"qtt\">Entrer la quantité</label>\n");
      out.write("                                <input type=\"number\" class=\"form-control\" id=\"qtt\" name=\"qtt\" required>\n");
      out.write("                                <label for=\"qtt\">Entrer votre numero de compte</label>\n");
      out.write("                                <input type=\"number\" class=\"form-control\" id=\"qtt\" name=\"numCompte\" required>\n");
      out.write("                                <span class=\"error-message\" id=\"numError\">Numero de compte incorrect </span>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Champ caché pour l'ID du produit -->\n");
      out.write("                             <input type=\"hidden\" name=\"idUsers\" value=\"");
      out.print( request.getAttribute("id") );
      out.write("\">\n");
      out.write("                            <input type=\"hidden\" name=\"idProduit\" value=\"");
      out.print( id_users );
      out.write("\">\n");
      out.write("                            <input  type=\"submit\" class=\"btn btn-primary\" value=\"Payer\">\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    ");

        }
    
      out.write("\n");
      out.write("</section>\n");
      out.write("<script>\n");
      out.write("    function verification(){\n");
      out.write("        var numCompte = ");
      out.print( request.getAttribute("numeroCompte") );
      out.write(";\n");
      out.write("        var num = document.forms['formulaire'].elements['numCompte'].value;\n");
      out.write("        if(numCompte != num){\n");
      out.write("            alert(numCompte);\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("</script>\n");
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
