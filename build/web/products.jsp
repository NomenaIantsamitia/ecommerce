<%-- 
    Document   : products
    Created on : 25 sept. 2024, 15:02:08
    Author     : PC
--%>

<%@page import="modele.ProduitModele"%>
<%@page import="java.util.List"%>
<%@page import="dao.ProduitsDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
          <link rel="stylesheet" href="css/products.css">
    <link rel="stylesheet" href="bootstrap/bootstrap-5.0.2-dist/css/bootstrap.css">
    <script src="bootstrap/bootstrap-5.0.2-dist/js/bootstrap.min.js"></script>
     <link rel="stylesheet" href="javascript/products.js">
    <style>
        .error-message {
            color: red;
            font-size: 0.9em;
            display: none;
        }
    </style>
    </head>
    
    <body>
             <jsp:include page="admin.jsp" />
        <div class="main-container">
        <!-- Inclusion de sliders.jsp -->
        
       
      

        <!-- Contenu principal de la page -->
        <div class="content">
            <div class="container">
                <h2 class="text-danger text-center my-5">Gestion des Produits</h2>

         <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#addProductModal">
        Ajouter un produit
    </button>

                <!-- Champ de recherche -->
                <input type="text" id="searchInput" placeholder="Rechercher un produit..." class="form-control mb-4" onkeyup="searchFunction()">
 <div class="container mt-5">
      

     <!-- Modal -->
    <div class="modal fade" id="addProductModal" tabindex="-1" aria-labelledby="addProductModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="addProductModalLabel">Ajouter un produit</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <form action="AddProjectServlet" method="post" id="productForm" enctype="multipart/form-data">
                        
                        <div class="mb-3">
                            <label for="productName" class="form-label">Nom</label>
                            <input type="text" class="form-control" id="productName" name="nom" required>
                        </div>
                        <div class="mb-3">
                        <label for="file">Sélectionnez une image :</label>
                        <input type="file" id="file" name="file" accept="image/*" required>
                        </div>
                        <div class="mb-3">
                            <label for="productCategory" class="form-label">Catégorie</label>
                            <select name="categorie" id="productCategory" class="form-select">
                                <option value="electronique">Électronique</option>
                                <option value="sport">Sport</option>
                                <option value="jeux">Jeux</option>
                                <option value="accessoires">Accessoires</option>
                            </select>
                        </div>

                       
                        <div class="mb-3">
                            <label for="productPrice" class="form-label">Prix</label>
                            <input type="number" class="form-control" id="productPrice" name="prix" required>
                            <span class="error-message" id="priceError">Prix negatif ou trop petit valeurs </span>
                        </div>

                        <!-- Quantité -->
                        <div class="mb-3">
                            <label for="productQuantity" class="form-label">Quantité</label>
                            <input type="number" class="form-control" id="productQuantity" name="qtt" required>
                            <span class="error-message" id="quantityError">La quantité doit être un nombre strictement positif.</span>
                        </div>

                        <!-- Bouton Ajouter -->
                        <button type="submit" class="btn btn-success">Ajouter</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
                <!-- Table des produits avec scrollbar -->
                <div class="class="list-group list-group-flush border-bottom scrollarea">
                    <table class="table table-striped">
                        <thead>
                            <tr>
                                <th>Photo</th>
                                <th>Nom</th>
                                <th>Categories</th>
                                <th>Prix/Unite</th>
                                <th>Quantité</th>
                                
                            </tr>
                        </thead>
                        <div class="list-group list-group-flush border-bottom scrollarea">
                        <tbody id="productTable">
 <%
    ProduitsDao dao = new ProduitsDao();
    List<ProduitModele> lisitra = dao.findAll();
    int i=0;
    for(ProduitModele perso:lisitra){
        int id_users = perso.getId();
            out.println("<tr> ");
             out.println("<td><img src='image/"+perso.getImg()+"' style='width:50px;height:50px;'></td>");
            out.println("<td>"+perso.getNom()+"</td>");
            out.println("<td>"+perso.getCategorie()+"</td>");
            out.println("<td>"+perso.getTaux()+"</td>");
            out.println("<td>"+perso.getQtt()+"</td>");
           
            out.println("</tr> ");
            i++;

    } 
    out.println(" </tbody></div></table>");
    
    if(i == 0){
        out.println("<h1 style='text-align:center; color:red;'> ");
        out.println("Aucun .....");
        out.println("</h1> ");
    }
%>                           
 
                </div>
            </div>
        </div>
    </div>
            <script>
function searchFunction() {
    var input, filter, table, tr, td, i, j, txtValue;
    input = document.getElementById("searchInput");
    filter = input.value.toUpperCase();
    table = document.getElementById("productTable");
    tr = table.getElementsByTagName("tr");

    // Boucle à travers toutes les lignes de table et cache celles qui ne correspondent pas à la recherche
    for (i = 0; i < tr.length; i++) {
        tr[i].style.display = "none"; // Masquer toutes les lignes au départ
        td = tr[i].getElementsByTagName("td");
        for (j = 0; j < td.length; j++) {
            if (td[j]) {
                txtValue = td[j].textContent || td[j].innerText;
                if (txtValue.toUpperCase().indexOf(filter) > -1) {
                    tr[i].style.display = ""; // Afficher la ligne si une colonne correspond à la recherche
                    break;
                }
            }
        }
    }
}

      document.getElementById('productForm').addEventListener('submit', function(event) {
            let price = document.getElementById('productPrice').value;
            let quantity = document.getElementById('productQuantity').value;
            let isValid = true;

            // Vérification du prix
            if (price <= 1000 || !/^[0-9]+$/.test(price)) {
                document.getElementById('priceError').style.display = 'block';
                isValid = false;
            } 
            else {
                document.getElementById('priceError').style.display = 'none';
            }

            // Vérification de la quantité
            if (quantity <= 0 || !/^[0-9]+$/.test(quantity)) {
                document.getElementById('quantityError').style.display = 'block';
                isValid = false;
            } else {
                document.getElementById('quantityError').style.display = 'none';
            }

            // Si invalid, prévenir l'envoi du formulaire
            if (!isValid) {
                event.preventDefault();
            }
        });

            </script>
    </body>
</html>
