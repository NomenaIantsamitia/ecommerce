package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.ListesDao;
import modele.InscriptionModele;
import modele.AjoutPersonneModele;
import dao.ListesPersonneDao;
import java.util.List;

public final class ajout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <link rel=\"stylesheet\" href=\"css/ajout.css\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"bootstrap/bootstrap-5.0.2-dist/css/bootstrap.css\">\n");
      out.write("         \n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("    <h1>Gestion des taches</h1>\n");
      out.write("    </header>\n");
      out.write("    <section>\n");
      out.write("        <nav>\n");
      out.write("        <a href=\"listes.jsp\">Listes</a><br>\n");
      out.write("        <a href=\"ajout.jsp\">Ajout</a><br>\n");
      out.write("        <a href=\"deconnexion.jsp\">Deconnexion</a><br>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <article>\n");
      out.write("        <form action=\"AjoutServlet\" method=\"post\" onsubmit=\"return verification()\"  name=\"formulaire\">\n");
      out.write("            <p id=\"enregistrer\" class=\"alert alert-info\">Ajout des Taches</p>\n");
      out.write("            <label>Titre</label><br>\n");
      out.write("            <input type=\"text\" name=\"titre\" placeholder=\"Titre\"><br><br>\n");
      out.write("            <label>Description :</label><br>\n");
      out.write("            <textarea row=\"8\" cols=\"60\" name=\"description\"></textarea><br><br>\n");
      out.write("            <label>Date d'echéance :</label><br>\n");
      out.write("            <input type=\"date\" name=\"datefin\" placeholder=\"Date d'echeance\"><br><br>\n");
      out.write("            <label>Prioriter : </label>\n");
      out.write("            <select name=\"prioriter\">\n");
      out.write("                <option value=\"A\">Urgent et important</option>\n");
      out.write("                <option value=\"B\">Urgent mais non important</option>\n");
      out.write("                <option value=\"C\">Important mais non urgent</option>\n");
      out.write("                <option value=\"D\">Non urgent et non important</option>\n");
      out.write("            </select><br><br>\n");
      out.write("            <input type=\"submit\" value=\"Ajouter\">\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("    </article>\n");
      out.write("</section>\n");
      out.write(" </body>\n");
      out.write(" <script lang=\"JavaScript\">\n");
      out.write("        function verification(){\n");
      out.write("            const currentDate = new Date();\n");
      out.write("            const givenDate = new Date(document.forms[\"formulaire\"].elements[\"datefin\"].value);\n");
      out.write("            const givenDateValue = document.forms[\"formulaire\"].elements[\"datefin\"].value;\n");
      out.write("            if(document.forms[\"formulaire\"].elements[\"titre\"].value == \"\"){\n");
      out.write("                alert(\"Titre obligatoire\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if(document.forms[\"formulaire\"].elements[\"description\"].value == \"\"){\n");
      out.write("                alert(\"Veuillez faire la description\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if(givenDate < currentDate){\n");
      out.write("                alert(\"Date non valide\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if(givenDateValue == \"\"){\n");
      out.write("                alert(\"Date invalide\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            else{\n");
      out.write("                 var a = document.getElementById(\"enregistrer\");\n");
      out.write("              a.textContent = \"* Taches enregistrer\";\n");
      out.write("             return true;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        }\n");
      out.write("    </script>\n");
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
