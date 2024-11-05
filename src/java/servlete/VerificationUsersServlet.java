/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlete;

import dao.UtilisateursDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.JDBCType;
import static java.sql.JDBCType.NULL;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modele.UtilisateursModele;

/**
 *
 * @author PC
 */
public class VerificationUsersServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            HttpSession session = request.getSession();
            String nom = request.getParameter("nom");
            String psw = request.getParameter("psw");
            UtilisateursModele um = new UtilisateursModele();
            um.setNom(nom);
            um.setPassword(psw);
            UtilisateursDao dao = new UtilisateursDao();
            try {
                boolean value = dao.verifUser(um);
                if(value == true){
                    int idee = dao.idUsers(nom, psw);
                    double solde = dao.soldeUsers(nom, psw);
                    session.setAttribute("solde", solde);
                    double numero = dao.numUsers(nom, psw);
                    
                    session.setAttribute("num", numero);
                    session.setAttribute("nom", nom);
                    session.setAttribute("psw", psw);
                    session.setAttribute("id",idee);
                    if(numero == 0){
                        request.getRequestDispatcher("acceuil.jsp").forward(request, response);
                    }
                    else{
                        request.getRequestDispatcher("utilisateurs.jsp").forward(request, response); 
                    }
                }
                else{
                    request.getRequestDispatcher("loginUsers.jsp").forward(request, response);
                }
            } catch (Exception e) {
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
    HttpSession session = request.getSession(false); // Ne pas créer de nouvelle session
    if (session == null || session.getAttribute("user") == null) {
        // Si la session est invalide ou que l'utilisateur n'est pas connecté, rediriger
        response.sendRedirect("loginUsers.jsp");
    } else {
        // Sinon, afficher la page normalement
        request.getRequestDispatcher("utilisateurs.jsp").forward(request, response);
    }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
