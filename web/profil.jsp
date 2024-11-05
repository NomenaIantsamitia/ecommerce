<%-- 
    Document   : profil
    Created on : 25 sept. 2024, 15:54:57
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="css/profil.css">
    <link rel="stylesheet" href="bootstrap/bootstrap-5.0.2-dist/css/bootstrap.css">
    <script src="bootstrap/bootstrap-5.0.2-dist/js/bootstrap.min.js"></script>
     <link rel="stylesheet" href="javascript/products.js">
    </head>
    <body>
         <jsp:include page="admin.jsp" />
         <div class="main-content">
            <h2 class="profil">Mon Profil</h2>

            <form id="profilForm">
                <div class="mb-3">
                    <label for="nom" class="form-label">Nom</label>
                    <input type="text" class="form-control" id="nom" name="nom" value="Jean Dupont" required>
                </div>
                <div class="mb-3">
                    <label for="email" class="form-label">Email</label>
                    <input type="email" class="form-control" id="email" name="email" value="jean.dupont@example.com" required>
                </div>
                <div class="mb-3">
                    <label for="telephone" class="form-label">Téléphone</label>
                    <input type="tel" class="form-control" id="telephone" name="telephone" value="0123456789" required>
                </div>
                <button type="submit" class="btn btn-primary">Mettre à jour</button>
            </form>
        </div>
    </div>

    <!-- Script JS pour validation de formulaire -->
    <script>
        document.getElementById('profilForm').onsubmit = function(event) {
            event.preventDefault(); // Empêche l'envoi du formulaire pour la démonstration
            alert('Profil mis à jour avec succès!');
        };
    </script>
    </body>
</html>
