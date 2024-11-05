package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.TerminerDao;
import java.util.List;
import modele.AjoutModele;
import dao.ListesDao;

public final class tachesTerminer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("         <table>\n");
      out.write("            <tr>\n");
      out.write("                <th>Titre</th>\n");
      out.write("                <th>Date d'echeances</th>\n");
      out.write("                <th>Prioriter</th>\n");
      out.write("                <th>Supprimer</th>\n");
      out.write("                \n");
      out.write("            </tr>\n");

    TerminerDao dao = new TerminerDao();
    List<AjoutModele> list = dao.fetchAll();
    int i = 0;
    for(AjoutModele perso:list){
  
            out.println("<tr> ");
            out.println("<td><del>"+perso.getTitre()+"</del></td>");
            out.println("<td><del>"+perso.getDate_echeance()+"</del></td>");
            out.println("<td><del>"+perso.getPrioriter()+"</del></td>");
            out.println("<td><a href='SupprimerTermineServlet?id="+perso.getId()+"'>Supprimer</a></td>");
            out.println("</tr> ");
 
            i++;
        } 
    out.println("</table>");
    if(i == 0){
        out.println("Aucun taches achevee");
    }

      out.write("\n");
      out.write("        \n");
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
