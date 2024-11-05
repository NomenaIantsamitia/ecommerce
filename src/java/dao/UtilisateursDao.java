/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import common.AccesBdd;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modele.UtilisateursModele;

/**
 *
 * @author PC
 */
public class UtilisateursDao {

           public void diminuerSolde(int id, double solde) throws SQLException {
        String sql = "UPDATE utilisateurs SET solde = solde - " + solde+ " WHERE id = '" + id + "'";
        AccesBdd acces = new AccesBdd();
        acces.loadDriver();
        acces.executeUpdate(sql);
        acces.closeConnection();
    }
    public boolean verifUser(UtilisateursModele user) throws SQLException{
        boolean valide = false;
        String sql = "SELECT * FROM utilisateurs WHERE nom='"+user.getNom()+"' AND password='"+user.getPassword()+"'";
        AccesBdd ab = new AccesBdd();
        ab.loadDriver();
        ResultSet rs = ab.executeSelect(sql);
        while (rs.next()) {            
            valide = true;
        }
        ab.closeConnection();
        return valide;
    }
   public double nomBreSoldes(int id) throws SQLException {
        String sql = "SELECT solde FROM utilisateurs WHERE id='"+id+"'";
        double nbr = 0;
        AccesBdd acces = new AccesBdd();
        acces.loadDriver();
        ResultSet resultat = acces.executeSelect(sql);
        while(resultat.next()){
            nbr = resultat.getDouble("solde");
        }
        return nbr;       
    }
      public double numUsers(int id) throws SQLException {
        String sql = "SELECT num FROM utilisateurs WHERE id='"+id+"'";
        double nbr = 0;
        AccesBdd acces = new AccesBdd();
        acces.loadDriver();
        ResultSet resultat = acces.executeSelect(sql);
        while(resultat.next()){
            nbr = resultat.getDouble("num");
        }
        return nbr;       
    }

       public int nomBreInscri() throws SQLException {
        String sql = "SELECT COUNT(id) as nbr FROM utilisateurs";
        int nbr = 0;
        AccesBdd acces = new AccesBdd();
        acces.loadDriver();
        ResultSet resultat = acces.executeSelect(sql);
        while(resultat.next()){
            nbr = resultat.getInt("nbr");
        }
        return nbr;       
    }
     public void ajouterUtilisateur(UtilisateursModele utilisateur) throws SQLException {
        String sql = "INSERT INTO utilisateurs (nom, email, password) VALUES ('"
                + utilisateur.getNom() + "', '"
                + utilisateur.getEmail() + "', '"
                + utilisateur.getPassword() + "')";
        AccesBdd acces = new AccesBdd();
        acces.loadDriver();
        acces.executeUpdate(sql);
        acces.closeConnection();
    }
     public void ajoutSolde(int idr,double sols){
         
         String sql = "UPDATE utilisateurs SET solde = '"+sols+"' WHERE id='"+idr+"'";
         AccesBdd ab = new AccesBdd();
         ab.loadDriver();
         ab.executeUpdate(sql);
         ab.closeConnection();
        
     }
    public void ajouterNumero(int id,int numero){
        String sql = "UPDATE utilisateurs SET num = '"+numero+"' WHERE id='"+id+"'";
        AccesBdd ab = new AccesBdd();
        ab.loadDriver();
        ab.executeUpdate(sql);
        ab.closeConnection();
        
    }

    // Modifier un utilisateur existant
    public void modifierUtilisateur(UtilisateursModele utilisateur) throws SQLException {
        String sql = "UPDATE utilisateurs SET nom = '"
                + utilisateur.getNom() + "', email = '"
                + utilisateur.getEmail() + "', password = '"
                + utilisateur.getPassword() + "' WHERE id = " + utilisateur.getId();
        AccesBdd acces = new AccesBdd();
        acces.loadDriver();
        acces.executeUpdate(sql);
        acces.closeConnection();
    }

    // Supprimer un utilisateur
    public void supprimerUtilisateur(int id) throws SQLException {
        String sql = "DELETE FROM utilisateurs WHERE id = '"+id+"'";
        AccesBdd acces = new AccesBdd();
        acces.loadDriver();
        acces.executeUpdate(sql);
        acces.closeConnection();
    }
    public String nomClient(int id) throws SQLException{
        String nom = "";
        String sql = "SELECT nom FROM utilisateurs WHERE id='"+id+"'";
        AccesBdd ab = new AccesBdd();
        ab.loadDriver();
        ResultSet resultat = ab.executeSelect(sql);
        while(resultat.next()){
            nom = resultat.getString("nom");
        }
        return nom;
    }
        public int numeroU(int id) throws SQLException{
        int nom = 0;
        String sql = "SELECT num FROM utilisateurs WHERE id='"+id+"'";
        AccesBdd ab = new AccesBdd();
        ab.loadDriver();
        ResultSet resultat = ab.executeSelect(sql);
        while(resultat.next()){
            nom = Integer.parseInt(resultat.getString("num"));
        }
        return nom;
    }

    // Lister tous les utilisateurs
    public List<UtilisateursModele> fetchall() {
        List<UtilisateursModele> listeUtilisateurs = new ArrayList<>();
        String sql = "SELECT * FROM utilisateurs";
        AccesBdd acces = new AccesBdd();
        acces.loadDriver();
        ResultSet resultat = acces.executeSelect(sql);
        
        try {
            while (resultat.next()) {
                UtilisateursModele utilisateur = new UtilisateursModele();
                utilisateur.setId(resultat.getInt("id"));
                utilisateur.setNom(resultat.getString("nom"));
                utilisateur.setEmail(resultat.getString("email"));
                utilisateur.setPassword(resultat.getString("password"));
                listeUtilisateurs.add(utilisateur);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UtilisateursDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        acces.closeConnection();
        return listeUtilisateurs;
    }
    public int idUsers(String nom,String psw) throws SQLException{
        int id = 0;
        String sql = "SELECT id FROM utilisateurs WHERE nom='"+nom+"' AND password='"+psw+"'";
        AccesBdd ab = new AccesBdd();
        ab.loadDriver();
        ResultSet resultSet = ab.executeSelect(sql);
        while (resultSet.next()) {            
            id = resultSet.getInt("id");
        }
        return id;
    }
    
        public double soldeUsers(String nom,String psw) throws SQLException{
        double solde = 0;
        String sql = "SELECT solde FROM utilisateurs WHERE nom='"+nom+"' AND password='"+psw+"'";
        AccesBdd ab = new AccesBdd();
        ab.loadDriver();
        ResultSet resultSet = ab.executeSelect(sql);
        while (resultSet.next()) {            
            solde = resultSet.getDouble("solde");
        }
        return solde;
    }
            public double numUsers(String nom,String psw) throws SQLException{
        int numero = 0;
        String sql = "SELECT num FROM utilisateurs WHERE nom='"+nom+"' AND password='"+psw+"'";
        AccesBdd ab = new AccesBdd();
        ab.loadDriver();
        ResultSet resultSet = ab.executeSelect(sql);
        while (resultSet.next()) {            
            numero = resultSet.getInt("num");
        }
        return numero;
    }
    
}
