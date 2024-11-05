package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Map;
import dao.UtilisateursDao;
import dao.ProduitsDao;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("      \n");
      out.write("        <link href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/dashboard.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"bootstrap/bootstrap-5.0.2-dist/css/bootstrap.css\">\n");
      out.write("    <script src=\"bootstrap/bootstrap-5.0.2-dist/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- Chart.js -->\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/chart.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    ");

       int id , electronique,vetements,jeux,accesoires,livres;
       ProduitsDao dao = new ProduitsDao();
       id = dao.nomBreInscri();
       electronique = dao.nbrElectronique();
       vetements = dao.nbrVetements();
       jeux = dao.nbrJeux();
       accesoires = dao.nbrAccesoires();
       livres = dao.nbrLivres();
       
       int si ;
       UtilisateursDao da = new UtilisateursDao();
       si = da.nomBreInscri();
       
       
       
    
      out.write("\n");
      out.write("    <body>\n");
      out.write("      \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "admin.jsp", out, false);
      out.write("\n");
      out.write("    <div class=\"container ensemble mt-4\">\n");
      out.write("        <h1>Tableau de Bord</h1>\n");
      out.write("\n");
      out.write("        <!-- Cartes de Statistiques -->\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-4 col-md-6 mb-4\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <h5 class=\"card-title\">Total Produits</h5>\n");
      out.write("                        <p class=\"card-text\"> ");
      out.print( id );
      out.write(" Produits enregistrés</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-4 col-md-6 mb-4\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <h5 class=\"card-title\">Stock Disponible</h5>\n");
      out.write("                        <p class=\"card-text\">1200 articles en stock</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-4 col-md-6 mb-4\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <h5 class=\"card-title\">Utilisateurs Actifs</h5>\n");
      out.write("                        <p class=\"card-text\" id=\"admin\"> ");
      out.print( si );
      out.write("  Administrateurs</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Graphique des Statistiques -->\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-6 mb-4\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <div class=\"card-header\">\n");
      out.write("                        <h5>État des Stocks par Catégorie</h5>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <canvas id=\"stockChart\"></canvas>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-lg-6 mb-4\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <div class=\"card-header\">\n");
      out.write("                        <h5>Rapport des Ventes Mensuelles</h5>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <canvas id=\"salesChart\"></canvas>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");

    Map<String, Integer> ventesMensuelles = (Map<String, Integer>) request.getAttribute("ventesMensuelles");
    String[] mois = {"Jan", "Fév", "Mar", "Avr", "Mai", "Juin","Juillet","Aout","Septembre","Octobre","Novembre","Decembre"};
    int[] ventes = new int[mois.length];

    for (int i = 0; i < mois.length; i++) {
        ventes[i] = ventesMensuelles.getOrDefault(mois[i], 0);
    }

      out.write("\n");
      out.write("\n");
      out.write("       <script>\n");
      out.write("    \n");
      out.write("var ctxStock = document.getElementById('stockChart').getContext('2d');\n");
      out.write("var electronique = ");
      out.print( electronique );
      out.write(";\n");
      out.write("var vetements = ");
      out.print( vetements );
      out.write(";\n");
      out.write("var accesoires = ");
      out.print( accesoires );
      out.write(";\n");
      out.write("var livre = ");
      out.print( livres );
      out.write(";\n");
      out.write("var jeu = ");
      out.print( jeux );
      out.write(";\n");
      out.write("var stockChart = new Chart(ctxStock, {\n");
      out.write("    type: 'bar',\n");
      out.write("    data: {\n");
      out.write("        labels: ['Électronique', 'Sport', 'Accessoires', 'Livres', 'Jeux'],\n");
      out.write("        datasets: [{\n");
      out.write("            label: 'Articles en Stock',\n");
      out.write("            data: [electronique, vetements, accesoires, livre, jeu],\n");
      out.write("            backgroundColor: [\n");
      out.write("                '#1abc9c',\n");
      out.write("                '#3498db',\n");
      out.write("                '#9b59b6',\n");
      out.write("                '#e74c3c',\n");
      out.write("                '#f39c12'\n");
      out.write("            ],\n");
      out.write("            borderColor: [\n");
      out.write("                '#16a085',\n");
      out.write("                '#2980b9',\n");
      out.write("                '#8e44ad',\n");
      out.write("                '#c0392b',\n");
      out.write("                '#e67e22'\n");
      out.write("            ],\n");
      out.write("            borderWidth: 1\n");
      out.write("        }]\n");
      out.write("    },\n");
      out.write("    options: {\n");
      out.write("        scales: {\n");
      out.write("            y: {\n");
      out.write("                beginAtZero: true\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("});\n");
      out.write("\n");
      out.write("// Graphique des ventes mensuelles\n");
      out.write("var ctxSales = document.getElementById('salesChart').getContext('2d');\n");
      out.write("var salesChart = new Chart(ctxSales, {\n");
      out.write("    type: 'line',\n");
      out.write("    data: {\n");
      out.write("        labels: ['Jan', 'Fév', 'Mar', 'Avr', 'Mai', 'Juin'],\n");
      out.write("        datasets: [{\n");
      out.write("            label: 'Ventes Mensuelles',\n");
      out.write("            data: [");
      out.print( ventes[0] );
      out.write(',');
      out.write(' ');
      out.print( ventes[1] );
      out.write(',');
      out.write(' ');
      out.print( ventes[2] );
      out.write(',');
      out.write(' ');
      out.print( ventes[3] );
      out.write(',');
      out.write(' ');
      out.print( ventes[4] );
      out.write(',');
      out.write(' ');
      out.print( ventes[5] );
      out.write("],\n");
      out.write("            backgroundColor: 'rgba(52, 152, 219, 0.2)',\n");
      out.write("            borderColor: '#3498db',\n");
      out.write("            borderWidth: 2\n");
      out.write("        }]\n");
      out.write("    },\n");
      out.write("    options: {\n");
      out.write("        scales: {\n");
      out.write("            y: {\n");
      out.write("                beginAtZero: true\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("});\n");
      out.write("       </script>\n");
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
