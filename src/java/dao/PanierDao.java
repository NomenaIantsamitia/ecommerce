/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import common.AccesBdd;
import java.sql.SQLException;
import modele.PanierModele;

/**
 *
 * @author PC
 */
public class PanierDao {
    public void ajoutPanier(PanierModele panier) throws SQLException {
        
        String sql = "INSERT INTO panier (id_produit,nom,prix_total) VALUES('"+panier.getIdProduit()+"','"+panier.getNom()+"','"+panier.getPrixTotal()+"') ";

        AccesBdd acces = new AccesBdd();
        acces.loadDriver();
        acces.executeUpdate(sql);
        acces.closeConnection();
    }
    public void modifStatus(int id){
        String sql = "UPDATE panier SET status = 'panier' WHERE id_utilisateur = '"+id+"'";
        AccesBdd ab = new AccesBdd();
        ab.loadDriver();
        ab.executeUpdate(sql);
        ab.closeConnection();
    }
}
