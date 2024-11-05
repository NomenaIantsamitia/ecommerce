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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import modele.ProduitModele;

/**
 *
 * @author PC
 */
public class ProduitsDao {
       public void diminuerQuantite(int id, int quantite) throws SQLException {
        String sql = "UPDATE produits SET qtt = qtt - " + quantite + " WHERE id = '" + id + "'";
        AccesBdd acces = new AccesBdd();
        acces.loadDriver();
        acces.executeUpdate(sql);
        acces.closeConnection();
    }
    public double prixTotal(int id,int qtt) throws SQLException{
        double prix = 0;
        String sql = "SELECT taux as nbr FROM produits WHERE id = '"+id+"'";
        AccesBdd ab = new AccesBdd();
        ab.loadDriver();
        ResultSet resultSet = ab.executeSelect(sql);
        while(resultSet.next()){
           prix = resultSet.getDouble("nbr") * qtt;
        }
        
        return prix;
    }
     public int nbrElectronique() throws SQLException{
         int qtt = 0;
         String sql = "SELECT SUM(qtt) as nbr FROM produits WHERE categorie = 'electronique' ";
          AccesBdd acces = new AccesBdd();
        acces.loadDriver();
        ResultSet resultat = acces.executeSelect(sql);
        while(resultat.next()){
            qtt= resultat.getInt("nbr");
        }
         return qtt;
        
     }
     public int nbrVetements() throws SQLException{
         int vetm = 0;
         String sql = "SELECT SUM(qtt) as vetm FROM produits WHERE categorie = 'sport'";
         AccesBdd ab = new AccesBdd();
         ab.loadDriver();
         ResultSet resultSet = ab.executeSelect(sql);
         while (resultSet.next()) {
             vetm = resultSet.getInt("vetm");
             
         }
         return vetm;
         
     }
          public int nbrAccesoires() throws SQLException{
         int vetm = 0;
         String sql = "SELECT SUM(qtt) as vetm FROM produits WHERE categorie = 'accessoires'";
         AccesBdd ab = new AccesBdd();
         ab.loadDriver();
         ResultSet resultSet = ab.executeSelect(sql);
         while (resultSet.next()) {
             vetm = resultSet.getInt("vetm");
             
         }
         return vetm;
         
     }
  public int nbrJeux() throws SQLException{
         int vetm = 0;
         String sql = "SELECT SUM(qtt) as vetm FROM produits WHERE categorie = 'jeux'";
         AccesBdd ab = new AccesBdd();
         ab.loadDriver();
         ResultSet resultSet = ab.executeSelect(sql);
         while (resultSet.next()) {
             vetm = resultSet.getInt("vetm");
             
         }
         return vetm;
         
     }
       public int nbrLivres() throws SQLException{
         int vetm = 0;
         String sql = "SELECT SUM(qtt) as vetm FROM produits WHERE categorie = 'livres'";
         AccesBdd ab = new AccesBdd();
         ab.loadDriver();
         ResultSet resultSet = ab.executeSelect(sql);
         while (resultSet.next()) {
             vetm = resultSet.getInt("vetm");
             
         }
         return vetm;
         
     }
     
   public int nomBreInscri() throws SQLException {
        String sql = "SELECT COUNT(id) as nbr FROM produits";
        int nbr = 0;
        AccesBdd acces = new AccesBdd();
        acces.loadDriver();
        ResultSet resultat = acces.executeSelect(sql);
        while(resultat.next()){
            nbr = resultat.getInt("nbr");
        }
        return nbr;       
    }

       public String produitClient(int id) throws SQLException{
        String nom = "";
        String sql = "SELECT nom FROM produits WHERE id='"+id+"'";
        AccesBdd ab = new AccesBdd();
        ab.loadDriver();
        ResultSet resultat = ab.executeSelect(sql);
        while(resultat.next()){
            nom = resultat.getString("nom");
        }
        return nom;
    }
    public void ajoutProduit(ProduitModele produit) throws SQLException {
        // Calcul du prixtotal avant insertion
        double prixtotal = produit.getTaux() * produit.getQtt();
        produit.setPrixtotal(prixtotal);

        String sql = "INSERT INTO produits (nom, categorie, taux, qtt, prixtotal,image) "
                + "VALUES('"+produit.getNom()+"','"+produit.getCategorie()+"','"+produit.getTaux()+"','"+produit.getQtt()+"','"+produit.getPrixtotal()+"','"+produit.getImg()+"')";

        AccesBdd acces = new AccesBdd();
        acces.loadDriver();
        acces.executeUpdate(sql);
        acces.closeConnection();
    }
    
    public void modifierProduit(ProduitModele produit) throws SQLException {
        // Calcul du nouveau prixtotal avant mise à jour
        double prixtotal = produit.getTaux() * produit.getQtt();
        produit.setPrixtotal(prixtotal);

        String sql = "UPDATE produits SET nom='" + produit.getNom() 
                   + "', categorie='" + produit.getCategorie() 
                   + "', taux='" + produit.getTaux() 
                   + "', qtt='" + produit.getQtt() 
                   + "', prixtotal='" + produit.getPrixtotal() 
                   + "' WHERE id='" + produit.getId() + "'";

        AccesBdd acces = new AccesBdd();
        acces.loadDriver();
        acces.executeUpdate(sql);
        acces.closeConnection();
    }
    
    public void supprimerProduit(int id) throws SQLException {
        String sql = "DELETE FROM produits WHERE id='" + id + "'";

        AccesBdd acces = new AccesBdd();
        acces.loadDriver();
        acces.executeUpdate(sql);
        acces.closeConnection();
    }
    public List<ProduitModele> findAll() {
        List<ProduitModele> produits = new ArrayList<>();
        String sql = "SELECT * FROM produits ORDER BY categorie";

        AccesBdd acces = new AccesBdd();
        acces.loadDriver();
        ResultSet resultat = acces.executeSelect(sql);

        try {
            while (resultat.next()) {
                ProduitModele produit = new ProduitModele();
                produit.setId(resultat.getInt("id"));
                produit.setImg(resultat.getString("image"));
                produit.setNom(resultat.getString("nom"));
                produit.setCategorie(resultat.getString("categorie"));
                produit.setTaux(resultat.getDouble("taux"));
                produit.setQtt(resultat.getInt("qtt"));
                produit.setPrixtotal(resultat.getDouble("prixtotal"));
                
                produits.add(produit);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProduitsDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            acces.closeConnection();
        }

        return produits;
    }
}

    
   
