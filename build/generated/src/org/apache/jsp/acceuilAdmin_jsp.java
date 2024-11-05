package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.faces.bean.SessionScoped;
import dao.RetardDao;
import dao.TerminerDao;
import dao.EnCoursDao;
import dao.AjoutDao;
import dao.InscriptionDao;

public final class acceuilAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link rel=\"stylesheet\" href=\"css/acceuilAdmin.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"bootstrap-5.0.2-dist/css/bootstrap.css\">\n");
      out.write("    </head>\n");
 
    int id;
    InscriptionDao dao= new InscriptionDao();
    id = dao.nomBreInscri();
    
    int taches;
    AjoutDao daos= new AjoutDao();
    taches= daos.nomBreTaches();
    
    int encours;
    EnCoursDao cours = new EnCoursDao();
    encours = cours.nombreTachesEncours();
    
    int terminer ;
    TerminerDao termine = new TerminerDao();
    terminer = termine.tachesTerminer();
    
    int retard ;
    RetardDao tard = new RetardDao();
    retard = tard.tachesTerminer(); 

      out.write("\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("  <div class=\"ensembles\">\n");
      out.write("      <div style=\"width: 800PX;\">\n");
      out.write("        <canvas id=\"myChart\" width=\"200\" height=\"200\"></canvas>\n");
      out.write("    </div>\n");
      out.write("        <h1>Gestion des taches</h1>   <br> \n");
      out.write("        <h1>Bonjour ");
      out.print( session.getAttribute("nom") );
      out.write(" </h1> \n");
      out.write("      <div class=\"ensemble\">\n");
      out.write("          \n");
      out.write("         <div> \n");
      out.write("             <p class=\"p1\">Nombres des inscri</p>\n");
      out.write("              <h1> ");
      out.print( id );
      out.write(" </h1>\n");
      out.write("         </div>\n");
      out.write("         <div>\n");
      out.write("            <p class=\"p2\">Nombres des taches</p>\n");
      out.write("            <h1> ");
      out.print( taches );
      out.write(" </h1>\n");
      out.write("         </div>\n");
      out.write("         <div>   \n");
      out.write("            <p class=\"p3\">Taches en cours</p>\n");
      out.write("            <h1> ");
      out.print( encours );
      out.write(" </h1>\n");
      out.write("         </div>\n");
      out.write("         <div>\n");
      out.write("            <p class=\"p4\">Taches terminer</p>\n");
      out.write("            <h1> ");
      out.print( terminer );
      out.write(" </h1>\n");
      out.write("         </div>\n");
      out.write("         <div>\n");
      out.write("            <p class=\"p5\">Taches en redard</p>\n");
      out.write("            <h1> ");
      out.print( retard );
      out.write(" </h1>\n");
      out.write("         </div>\n");
      out.write("      </div> \n");
      out.write("    </div> \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    <script src=\"javascript/chart.js\"></script>\n");
      out.write("    <script>\n");
      out.write("  // Attendre que le DOM soit complètement chargé\n");
      out.write("  document.addEventListener('DOMContentLoaded', function () {\n");
      out.write("    // Récupérer le contexte du canevas\n");
      out.write("    var ctx = document.getElementById('myChart').getContext('2d');\n");
      out.write("    \n");
      out.write("    // Créer le graphique\n");
      out.write("    var myChart = new Chart(ctx, {\n");
      out.write("      type: 'line', // Type de graphique : courbe\n");
      out.write("      data: {\n");
      out.write("        labels: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul'], // Labels de l'axe X\n");
      out.write("        datasets: [{\n");
      out.write("          label: 'My First Dataset', // Légende de la courbe\n");
      out.write("          data: [10, 20, 15, 30, 25, 40, 10], // Données de la courbe\n");
      out.write("          fill: false, // Remplir sous la courbe (false = non rempli)\n");
      out.write("          borderColor: 'rgb(75, 192, 192)', // Couleur de la ligne de la courbe\n");
      out.write("          tension: 0.1 // Courbure de la ligne (0 = ligne droite, 1 = courbe douce)\n");
      out.write("        }]\n");
      out.write("      },\n");
      out.write("      options: {\n");
      out.write("        scales: {\n");
      out.write("          x: {\n");
      out.write("            beginAtZero: true\n");
      out.write("          },\n");
      out.write("          y: {\n");
      out.write("            beginAtZero: true\n");
      out.write("          }\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("    });\n");
      out.write("  });\n");
      out.write("</script>\n");
      out.write(" <script>\n");
      out.write("  document.addEventListener('DOMContentLoaded', function() {\n");
      out.write("    // Appel AJAX pour récupérer les données depuis le serveur\n");
      out.write("    fetch('/adala')\n");
      out.write("      .then(response => response.json())\n");
      out.write("      .then(data => {\n");
      out.write("        // Récupérer les labels et les valeurs de la réponse\n");
      out.write("        const labels = data.labels;\n");
      out.write("        const values = data.data;\n");
      out.write("\n");
      out.write("        // Créer le graphique\n");
      out.write("        var ctx = document.getElementById('myChart').getContext('2d');\n");
      out.write("        var myChart = new Chart(ctx, {\n");
      out.write("          type: 'line',\n");
      out.write("          data: {\n");
      out.write("            labels: labels,  // Utiliser les labels de la base de données\n");
      out.write("            datasets: [{\n");
      out.write("              label: 'Dataset',\n");
      out.write("              data: values,  // Utiliser les données de la base de données\n");
      out.write("              fill: false,\n");
      out.write("              borderColor: 'rgb(75, 192, 192)',\n");
      out.write("              tension: 0.1\n");
      out.write("            }]\n");
      out.write("          },\n");
      out.write("          options: {\n");
      out.write("            scales: {\n");
      out.write("              y: {\n");
      out.write("                beginAtZero: true\n");
      out.write("              }\n");
      out.write("            }\n");
      out.write("          }\n");
      out.write("        });\n");
      out.write("      });\n");
      out.write("  });\n");
      out.write("</script>\n");
      out.write("\n");
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
