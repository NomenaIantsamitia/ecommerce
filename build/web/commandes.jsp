<%--  
    Document   : commandes
    Created on : 25 sept. 2024, 15:28:06
    Author     : PC
--%>

<%@page import="dao.ProduitsDao"%>
<%@page import="modele.CommandeModele"%>
<%@page import="dao.CommandeDao"%>
<%@page import="java.util.List"%>
<%@page import="modele.UtilisateursModele"%>
<%@page import="dao.UtilisateursDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/commandes.css">
    <link rel="stylesheet" href="bootstrap/bootstrap-5.0.2-dist/css/bootstrap.css">
    <script src="bootstrap/bootstrap-5.0.2-dist/js/bootstrap.min.js"></script>
     <link rel="stylesheet" href="javascript/commandes">
    </head>
    <body>
         <div class="container">
        <!-- Inclusion du slider -->
        <jsp:include page="admin.jsp" />

        <div class="main-content">
            <h2 class="text-center">Liste des Commandes</h2>

            <!-- Champ de recherche -->
            <input type="text" id="searchInput" onkeyup="searchCommandes()" placeholder="Rechercher par nom..." class="search-bar">

            <!-- Table des commandes -->
            <div class="table-container">
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th>Nom du client</th>
                            <th>Produit</th>
                            <th>Quantites</th>
                            <th>Total</th>
                            <th>Date</th>
                            <th colspan="2">Action</th>
                        </tr>
                    </thead>
                    <tbody id="commandesTable">
                        <% 
    
    CommandeDao dao = new CommandeDao();
    UtilisateursDao userDao = new UtilisateursDao();
    List<CommandeModele> list = dao.fetchall();
    int i = 0;
    
    for(CommandeModele perso:list){
        int id = perso.getId_commande();
        int idProduit = perso.getId_produit();
        int idUser = perso.getId_users();
        int qtt = perso.getQtt();
        ProduitsDao produit = new ProduitsDao();
        String prod = produit.produitClient(id);
        String user = userDao.nomClient(idUser);
            out.println("<tr>");
          
            out.println("<td>"+user+"</td>");
            out.println("<td>"+prod+"</td>");
            out.println("<td>"+perso.getQtt()+"</td>");
            out.println("<td>"+perso.getTotal()+"</td>");
            out.println("<td>"+perso.getDater()+"</td>");
            out.println("<td><a class='btn btn-success' href='ValiderCommandeServlet?id="+id+"&idProduit="+idProduit+"&idClient="+perso.getId_users()+"&qtt="+qtt+"&prix="+perso.getTotal()+"'> Valider</button></td>");
            out.println("<td><a href='#' class='btn btn-danger'data-bs-toggle='modal' data-bs-target='#sup-modal"+perso.getId_commande()+"'>Supprimer</a></td>");
            out.println("</tr> ");
            i++;
%>
<div class="modal fade" id="sup-modal<%= id %>" aria-labelledby="addCommandeModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="addCommandeModalLabel">Confirmation</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <form action="SupprimerServlet" method="post">
                        
                        <div class="mb-3">
                            Etes vous sur ?
                        </div>
                        <a href="SupprimerServlet?id=<%= id %>" class="btn btn-primary">Oui</a>
                        <a href='users.jsp' class="btn btn-danger" data-bs-dismiss="modal" aria-label="Close">Non</a>
                    </form>
                </div>
            </div>
        </div>
    </div>
<%
   }
     out.println(" </tbody></table>");
 

%>

            </div>
        </div>
    </div>



    <!-- Script JS pour la recherche -->
    <script>
        function searchCommandes() {
            var input, filter, table, tr, td, i, j, txtValue;
            input = document.getElementById("searchInput");
            filter = input.value.toUpperCase();
            table = document.getElementById("commandesTable");
            tr = table.getElementsByTagName("tr");

            for (i = 0; i < tr.length; i++) {
                tr[i].style.display = "none"; 
                td = tr[i].getElementsByTagName("td");
                for (j = 0; j < td.length; j++) {
                    if (td[j]) {
                        txtValue = td[j].textContent || td[j].innerText;
                        if (txtValue.toUpperCase().indexOf(filter) > -1) {
                            tr[i].style.display = "";
                            break;
                        }
                    }
                }
            }
        }
    </script>
    </body>
</html>
