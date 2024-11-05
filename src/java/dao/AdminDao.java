/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import common.AccesBdd;
import java.sql.ResultSet;
import java.sql.SQLException;
import modele.AdminModele;
import modele.UtilisateursModele;

/**
 *
 * @author PC
 */
public class AdminDao {
        public boolean verifUser(AdminModele user) throws SQLException{
        boolean valide = false;
        String sql = "SELECT * FROM users WHERE nom='"+user.getNom()+"' AND password='"+user.getPsw()+"'";
        AccesBdd ab = new AccesBdd();
        ab.loadDriver();
        ResultSet rs = ab.executeSelect(sql);
        while (rs.next()) {            
            valide = true;
        }
        ab.closeConnection();
        return valide;
    }
}
