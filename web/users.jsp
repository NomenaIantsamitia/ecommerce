<%-- 
    Document   : users
    Created on : 25 sept. 2024, 12:57:55
    Author     : PC
--%>


<%@page import="java.util.List"%>
<%@page import="modele.UtilisateursModele"%>
<%@page import="dao.UtilisateursDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/users.css">
         <link rel="stylesheet" href="javascript/users.js">
    <link rel="stylesheet" href="bootstrap/bootstrap-5.0.2-dist/css/bootstrap.css">
    <script src="bootstrap/bootstrap-5.0.2-dist/js/bootstrap.min.js"></script>
    </head>
    <body>
         <jsp:include page="admin.jsp" />
        <div class="content">
        <div class="container">
            <h2>Liste des Utilisateurs</h2>

            <!-- Bouton pour ajouter un utilisateur -->
             <button class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#addCommandeModal">Ajouter utilisateur</button>
 <div class="modal fade" id="addCommandeModal" tabindex="-1" aria-labelledby="addCommandeModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="addCommandeModalLabel">Ajout utilisateur</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <form action="AjouterUtilisateursServlet" method="post">
                        <div class="mb-3">
                            <label for="nomClient" class="form-label">Nom du Client</label>
                            <input type="text" class="form-control" id="nomClient" name="anarana" required>
                        </div>
                        <div class="mb-3">
                            <label for="produit" class="form-label">Email</label>
                            <input type="email" class="form-control" id="produit" name="mailaka" required>
                        </div>
                        <div class="mb-3">
                            <label for="password" class="form-label">Password</label>
                            <input type="password" class="form-control" id="mdp" name="kaody" required>
                        </div>
                        <button type="submit" class="btn btn-primary">Ajouter</button>
                        
                    </form>
                </div>
            </div>
        </div>
    </div>
            <!-- Champ de recherche -->
            <input type="text" id="searchInput" placeholder="Rechercher par nom..." onkeyup="searchFunction()">

            <!-- Table des utilisateurs -->
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nom</th>
                        <th>Email</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody id="userTable">
<% 
    
    UtilisateursDao dao = new UtilisateursDao();
    List<UtilisateursModele> list = dao.fetchall();
    int i = 0;
    
    for(UtilisateursModele perso:list){
        int id = perso.getId();
            out.println("<tr>");
          
            out.println("<td>"+perso.getId()+"</td>");
            out.println("<td>"+perso.getNom()+"</td>");
            out.println("<td>"+perso.getEmail()+"</td>");
            
            out.println("<td><button class='btn btn-success' data-bs-toggle='modal' data-bs-target='#mod-modal"+perso.getId()+"'>Modifier</button></td>");
            out.println("<td><a href='#' class='btn btn-danger'data-bs-toggle='modal' data-bs-target='#sup-modal"+perso.getId()+"'>Supprimer</a></td>");
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
                    <form action="AnnulerServlet" method="post">
                        
                        <div class="mb-3">
                            Voullez vous vraiment supprimer ?
                        </div>
                        <a href="SupprimerServlet?id=<%= id %>" class="btn btn-primary">Oui</a>
                        <a href='users.jsp' class="btn btn-danger" data-bs-dismiss="modal" aria-label="Close">Non</a>
                    </form>
                </div>
            </div>
        </div>
    </div>

 <div class="modal fade" id="mod-modal<%= perso.getId() %>" tabindex="-1" aria-labelledby="addCommandeModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="addCommandeModalLabel">Modifier utilisateurs</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <form action="ModifierServlet" method="post">
                        <div class="mb-3">
                            <input type="hidden" name="id" value="<%= perso.getId() %>" class="form-control">
                            <label for="nomClient" class="form-label">Nom du Client</label>
                            <input type="text" class="form-control" id="nomClient" name="nomClient" value="<%= perso.getNom() %>">
                        </div>
                        <div class="mb-3">
                            <label for="produit" class="form-label">Email</label>
                            <input type="email" class="form-control" id="produit" name="email" value='<%= perso.getEmail() %>'>
                        </div>
                        <div class="mb-3">
                            <label for="date" class="form-label">Password</label>
                            <input type="password" class="form-control" id="date" name="psw" value='<%= perso.getPassword() %>'>
                        </div>
                        <button type="submit" class="btn btn-primary">Modifier</button>
                        <a href='users.jsp' class="btn-close" data-bs-dismiss="modal" aria-label="Close">Annuler</a>
                    </form>
                </div>
            </div>
        </div>
    </div>
<%  }
     out.println(" </tbody></table>");
 

%>
                
        </div>
    </div>
    </body>
    <!-- Script de recherche en JavaScript -->
    <script>
        function searchFunction() {
            var input, filter, table, tr, td, i, txtValue;
            input = document.getElementById("searchInput");
            filter = input.value.toUpperCase();
            table = document.getElementById("userTable");
            tr = table.getElementsByTagName("tr");

            for (i = 0; i < tr.length; i++) {
                td = tr[i].getElementsByTagName("td")[1]; // Recherche dans la colonne "Nom"
                if (td) {
                    txtValue = td.textContent || td.innerText;
                    if (txtValue.toUpperCase().indexOf(filter) > -1) {
                        tr[i].style.display = "";
                    } else {
                        tr[i].style.display = "none";
                    }
                }
            }
        }
    </script>
 
</html>
