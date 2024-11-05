package test;

import dao.CommandeDao;
import dao.UtilisateursDao;
import static java.lang.System.out;
import java.sql.SQLException;
import java.util.Map;

public class Main{
    public static void main(String[] args) throws SQLException {
       
        double saole = 123;
            int ids = 32;
            UtilisateursDao dao = new UtilisateursDao();
            dao.ajoutSolde(ids, saole);
    }
}