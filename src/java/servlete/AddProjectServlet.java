/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlete;

import dao.ProduitsDao;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import modele.ProduitModele;

/**
 *
 * @author PC
 */
@MultipartConfig
public class AddProjectServlet extends HttpServlet {

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
           String nom = request.getParameter("nom"); 
            String categorie = request.getParameter("categorie");
            String prix = request.getParameter("prix");
            double prixA = Double.parseDouble(prix);
            String qtt = request.getParameter("qtt");
            int qttA = Integer.parseInt(qtt);
            double total = prixA * qttA;
             Part filePart = request.getPart("file");
            String fileName = filePart.getSubmittedFileName();
            String UPLOAD_DIR = "image";

        // Chemin du dossier de téléchargement
        String uploadPath = getServletContext().getRealPath("") + File.separator + UPLOAD_DIR;
        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) {
            uploadDir.mkdirs(); // Créer le dossier si n'existe pas
        }

        // Enregistrer le fichier
        File file = new File(uploadDir,fileName);
        try (InputStream inputStream = filePart.getInputStream()){
            Files.copy(inputStream, file.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }

        // Réponse à l'utilisateur
      

            
            ProduitModele pm = new ProduitModele();
            pm.setNom(nom);
            pm.setCategorie(categorie);
            pm.setPrixtotal(total);
            pm.setQtt(qttA);
            pm.setTaux(prixA);
            pm.setImg(fileName);
            try {
                ProduitsDao dao = new ProduitsDao();
                dao.ajoutProduit(pm);
                request.getRequestDispatcher("products.jsp").forward(request, response);
            } catch (Exception e) {
                out.println(e);
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
