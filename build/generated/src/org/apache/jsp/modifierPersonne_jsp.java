package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modele.InscriptionModele;
import dao.InscriptionDao;

public final class modifierPersonne_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
 
    int id = Integer.parseInt(request.getParameter("id")); 
    InscriptionDao dao = new InscriptionDao();
    InscriptionModele list = dao.personneModif(id);

      out.write("\n");
      out.write("    <body>\n");
      out.write("<nav>\n");
      out.write("  <a href=\"acceuilAdmin.jsp\">Acceuil</a>\n");
      out.write("  <a href=\"inscription.jsp\">Ajout</a>\n");
      out.write("  <a href=\"listesInscrit.jsp\">Listes</a>\n");
      out.write("  <a href=\"tachesTerminer.jsp\">Taches terminee</a>\n");
      out.write("  <a href=\"tachesRetard.jsp\">Taches en retard</a>\n");
      out.write("  <a href=\"tachesCours.jsp\">Taches en cours</a>\n");
      out.write("  <a href=\"deconnexionAdmin.jsp\">Deconnexion</a>\n");
      out.write("</nav>\n");
      out.write("    <form action=\"ModifierPersonneServlet\" method=\"post\" onsubmit=\"return verification()\" name=\"formulaire\">\n");
      out.write("         <p class=\"alert alert-info\" id=\"modifier\"></p>\n");
      out.write("        <label>Nom :</label><br>\n");
      out.write("        <input type=\"hidden\" name=\"id_users\" value=\"");
      out.print( list.getId_users());
      out.write("\">\n");
      out.write("        <input type=\"text\" placeholer=\"Entrer nom utilisateur\" name=\"nom\" value=\"");
      out.print( list.getNom() );
      out.write("\"><br>\n");
      out.write("        <span id=\"nomErreur\"></span><br>\n");
      out.write("        <label>Email :</label><br>\n");
      out.write("        <input type=\"email\" placeholer=\"Entrer email utilisateur\" name=\"email\" value=\"");
      out.print( list.getEmail() );
      out.write("\"><br>\n");
      out.write("        <span id=\"emailErreur\"></span><br>\n");
      out.write("        <label>Mot de passe :</label><br>\n");
      out.write("        <input type=\"password\" placeholer=\"Entrer votre mot de passe\" name=\"password\" maxlength=\"8\" minlength=\"6\"><br>\n");
      out.write("         <span id=\"pswErreur\"></span><br>\n");
      out.write("        <input type=\"submit\" value=\"Modifier\" id=\"connecter\">\n");
      out.write("        <input type=\"reset\" value=\"Annuler\">\n");
      out.write("    </form>\n");
      out.write("    </body>\n");
      out.write("       <script lang=\"JavaScript\">\n");
      out.write("        function verification(){\n");
      out.write("\n");
      out.write("        if(document.forms[\"formulaire\"].elements[\"nom\"].value == \"\"){\n");
      out.write("              var a = document.getElementById(\"nomErreur\");\n");
      out.write("              a.textContent = \"* Entrer votre nom\";\n");
      out.write("              a.style.color = \"red\";\n");
      out.write("             return false;\n");
      out.write("        }\n");
      out.write("        else if(document.forms[\"formulaire\"].elements[\"email\"].value == \"\"){\n");
      out.write("             var a = document.getElementById(\"emailErreur\");\n");
      out.write("              a.textContent = \"* Entrer votre email\";\n");
      out.write("              a.style.color = \"red\";\n");
      out.write("             return false;\n");
      out.write("        }\n");
      out.write("         else if(document.forms[\"formulaire\"].elements[\"password\"].value == \"\"){\n");
      out.write("             var a = document.getElementById(\"pswErreur\");\n");
      out.write("              a.textContent = \"* Completez lz champ\";\n");
      out.write("              a.style.color = \"red\";\n");
      out.write("             return false;\n");
      out.write("        }\n");
      out.write("        else {  \n");
      out.write("            alert(\"Inscription termine\");\n");
      out.write("\n");
      out.write("        }\n");
      out.write("    }\n");
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
