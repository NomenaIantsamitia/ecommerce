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
import modele.CommandeModele;

/**
 *
 * @author PC
 */
public class CommandeDao {
   

    public void ajouterCommande(CommandeModele commande) throws SQLException {
        String sql = "INSERT INTO commande (id_utilisateurs, id_produit, qtt, total) " +
                     "VALUES ('" + commande.getId_users() + "', '" + commande.getId_produit() + 
                     "', '" + commande.getQtt() + "', '" + commande.getTotal() + "')";
        AccesBdd acces = new AccesBdd();
        acces.loadDriver();
        acces.executeUpdate(sql);
        acces.closeConnection();
    }

    /*public  modifierCommande(CommandeModele commande) throws SQLException {
        String sql = "UPDATE commande SET id_utilisateurs = '" + commande.getId_users() + 
                     "', id_produit = '" + commande.getId_produit() + "', qtt = '" + commande.getQtt() + 
                     "', total = '" + commande.getTotal() + "', status = '" + commande.getStatus() + 
                     "' WHERE id_commande = '" + commande.getId_commande() + "'";
        AccesBdd acces = new AccesBdd();
        acces.loadDriver();
        boolean result = acces.executeUpdate(sql);
        acces.closeConnection();
        return result;
    }

    public boolean supprimerCommande(int id_commande) throws SQLException {
        String sql = "DELETE FROM commande WHERE id_commande = '" + id_commande + "'";
        AccesBdd acces = new AccesBdd();
        acces.loadDriver();
        boolean result = acces.executeUpdate(sql);
        acces.closeConnection();
        return result;
    }*/
    
        public Map<String, Integer> getVentesMensuelles() {
        Map<String, Integer> ventes = new HashMap<>();
        String sql = "SELECT MONTH(date) as mois, SUM(total) as totalVentes FROM commande WHERE status = 'valider' GROUP BY mois";
        
        AccesBdd acces = new AccesBdd();
        acces.loadDriver();
        ResultSet rs = acces.executeSelect(sql);
        
        try {
            while (rs.next()) {
                String mois = getMois(rs.getInt("mois")); // Transformer le numéro du mois en nom du mois
                ventes.put(mois, rs.getInt("totalVentes"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProduitsDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            acces.closeConnection();
        }
        return ventes;
    }
            private String getMois(int mois) {
        switch (mois) {
            case 1: return "Jan";
            case 2: return "Fév";
            case 3: return "Mar";
            case 4: return "Avr";
            case 5: return "Mai";
            case 6: return "Juin";
            case 7: return "Juilllet";
            case 8: return "Aout";
            case 9: return "Septembre";
            case 10: return "Octobre";
            case 11: return "Novembre";
            case 12: return "Decembre";
            default: return "";
        }
    }
    
    public List<CommandeModele> fetchall() {
        List<CommandeModele> listeUtilisateurs = new ArrayList<>();
        String sql = "SELECT * FROM commande WHERE status = 'En attente'";
        AccesBdd acces = new AccesBdd();
        acces.loadDriver();
        ResultSet resultat = acces.executeSelect(sql);
        
        try {
            while (resultat.next()) {
                CommandeModele utilisateur = new CommandeModele();
                utilisateur.setId_commande(resultat.getInt("id"));
                utilisateur.setId_produit(resultat.getInt("id_produit"));
                utilisateur.setId_users(resultat.getInt("id_utilisateurs"));
                utilisateur.setQtt(resultat.getInt("qtt"));
                utilisateur.setTotal(resultat.getDouble("total"));
                utilisateur.setStatus(resultat.getString("status"));
                utilisateur.setDater(resultat.getDate("date"));
                listeUtilisateurs.add(utilisateur);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UtilisateursDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        acces.closeConnection();
        return listeUtilisateurs;
    }
    
    public String validerCommande(int id){
        String status = "";
        String sql = "UPDATE commande SET status='valider' WHERE id='"+id+"'";
        AccesBdd ab = new AccesBdd();
        ab.loadDriver();
        ab.executeUpdate(sql);
        ab.closeConnection();
        
        return status;
    }
    
    public List<CommandeModele> listerCommandes() throws SQLException {
        String sql = "SELECT * FROM commande WHERE status = 'En attente'";
        AccesBdd acces = new AccesBdd();
        acces.loadDriver();
        ResultSet resultat = acces.executeSelect(sql);
        List<CommandeModele> commandes = new ArrayList<>();
        while (resultat.next()) {
            CommandeModele commande = new CommandeModele();
            commande.setId_commande(resultat.getInt("id_commande"));
            commande.setId_users(resultat.getInt("id_utilisateurs"));
            commande.setId_produit(resultat.getInt("id_produit"));
            commande.setQtt(resultat.getInt("qtt"));
            commande.setTotal(resultat.getDouble("total"));
            commande.setStatus(resultat.getString("status"));
            commandes.add(commande);
        }
        acces.closeConnection();
        return commandes;
    }

}
