package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class modifCompte_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background-color: #f4f4f9;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            height: 100vh;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container {\n");
      out.write("            background-color: #fff;\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\n");
      out.write("            max-width: 400px;\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h2 {\n");
      out.write("            text-align: center;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            color: #333;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .form-group {\n");
      out.write("            margin-bottom: 15px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .form-group label {\n");
      out.write("            display: block;\n");
      out.write("            margin-bottom: 5px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            color: #555;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .form-group input {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 10px;\n");
      out.write("            font-size: 16px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btn {\n");
      out.write("            background-color: #28a745;\n");
      out.write("            color: #fff;\n");
      out.write("            padding: 10px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            width: 100%;\n");
      out.write("            font-size: 16px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            margin-top: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btn:hover {\n");
      out.write("            background-color: #218838;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .message {\n");
      out.write("            margin-top: 20px;\n");
      out.write("            padding: 10px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            text-align: center;\n");
      out.write("            display: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .success {\n");
      out.write("            background-color: #d4edda;\n");
      out.write("            color: #155724;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .error {\n");
      out.write("            background-color: #f8d7da;\n");
      out.write("            color: #721c24;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <h2>Créer un Compte</h2>\n");
      out.write("    <form id=\"accountForm\">\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label for=\"accountNumber1\">Numéro de compte</label>\n");
      out.write("            <input type=\"text\" id=\"accountNumber1\" maxlength=\"4\" required>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label for=\"accountNumber2\">Confirmer le numéro de compte</label>\n");
      out.write("            <input type=\"text\" id=\"accountNumber2\" maxlength=\"4\" required>\n");
      out.write("        </div>\n");
      out.write("        <button type=\"submit\" class=\"btn\">Créer un Compte</button>\n");
      out.write("    </form>\n");
      out.write("    <div id=\"message\" class=\"message\"></div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    document.getElementById('accountForm').addEventListener('submit', function (event) {\n");
      out.write("        event.preventDefault();\n");
      out.write("        \n");
      out.write("        const accountNumber1 = document.getElementById('accountNumber1').value;\n");
      out.write("        const accountNumber2 = document.getElementById('accountNumber2').value;\n");
      out.write("        const messageDiv = document.getElementById('message');\n");
      out.write("\n");
      out.write("        if (accountNumber1.length !== 4 || accountNumber2.length !== 4) {\n");
      out.write("            messageDiv.innerHTML = \"Le numéro de compte doit contenir exactement 4 chiffres.\";\n");
      out.write("            messageDiv.className = \"message error\";\n");
      out.write("            messageDiv.style.display = \"block\";\n");
      out.write("        } else if (accountNumber1 !== accountNumber2) {\n");
      out.write("            messageDiv.innerHTML = \"Les numéros de compte ne correspondent pas.\";\n");
      out.write("            messageDiv.className = \"message error\";\n");
      out.write("            messageDiv.style.display = \"block\";\n");
      out.write("        } else {\n");
      out.write("            messageDiv.innerHTML = \"Compte créé avec succès !\";\n");
      out.write("            messageDiv.className = \"message success\";\n");
      out.write("            messageDiv.style.display = \"block\";\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
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
