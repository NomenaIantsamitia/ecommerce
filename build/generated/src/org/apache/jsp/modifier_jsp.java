package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modele.AjoutModele;
import dao.AjoutDao;

public final class modifier_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 
    int id = Integer.parseInt(request.getParameter("id")); 
    AjoutDao dao = new AjoutDao();
    AjoutModele list = dao.elmtModif(id);

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"ModifierServlet\" method=\"post\" name=\"formulaire\" onsubmit=\"return verification()\">\n");
      out.write("            <label>Titre</label><br>\n");
      out.write("            <input type=\"hidden\" name=\"id\" value=\"");
      out.print( list.getId() );
      out.write("\">\n");
      out.write("            <input type=\"text\" name=\"titre\" placeholder=\"Titre\" value=\"");
      out.print( list.getTitre() );
      out.write("\"><br><br>\n");
      out.write("            <label>Description :</label><br>\n");
      out.write("            <textarea row=\"8\" cols=\"60\" name=\"description\">");
      out.print( list.getDescription() );
      out.write("</textarea><br><br>\n");
      out.write("            <label>Date d'echéance :</label><br>\n");
      out.write("            <input type=\"date\" name=\"datefin\" placeholder=\"Date d'echeance\" value=\"");
      out.print( list.getDate_echeance() );
      out.write("\"><br><br>\n");
      out.write("            <label>Prioriter : </label>\n");
      out.write("            <select name=\"prioriter\" value=\"");
      out.print( list.getPrioriter() );
      out.write("\">\n");
      out.write("                <option value=\"A\">Urgent et important</option>\n");
      out.write("                <option value=\"B\">Urgent mais non important</option>\n");
      out.write("                <option value=\"C\">Important mais non urgent</option>\n");
      out.write("                <option value=\"D\">Non urgent et non important</option>\n");
      out.write("            </select><br><br>\n");
      out.write("            <input type=\"submit\" value=\"Modifier\">\n");
      out.write("            \n");
      out.write("        </form>\n");
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
