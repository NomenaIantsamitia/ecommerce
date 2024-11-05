<%-- 
    Document   : modifCompte
    Created on : 2 oct. 2024, 20:06:16
    Author     : PC
--%>

<%@page import="java.util.List"%>
<%@page import="modele.ProduitModele"%>
<%@page import="dao.ProduitsDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="bootstrap/bootstrap-5.0.2-dist/css/bootstrap.css">
    <script src="bootstrap/bootstrap-5.0.2-dist/js/bootstrap.min.js"></script>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .container {
            background-color: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            max-width: 400px;
            width: 100%;
        }

        h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #333;
        }

        .form-group {
            margin-bottom: 15px;
        }

        .form-group label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
            color: #555;
        }

        .form-group input {
            width: 100%;
            padding: 10px;
            font-size: 16px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }

        .btn {
            background-color: #28a745;
            color: #fff;
            padding: 10px;
            border: none;
            border-radius: 5px;
            width: 100%;
            font-size: 16px;
            cursor: pointer;
            margin-top: 10px;
        }

        .btn:hover {
            background-color: #218838;
        }

        .message {
            margin-top: 20px;
            padding: 10px;
            border-radius: 5px;
            text-align: center;
            display: none;
        }

        .success {
            background-color: #d4edda;
            color: #155724;
        }

        .error {
            background-color: #f8d7da;
            color: #721c24;
        }

        .error {
            color: red;
            font-size: 14px;
        }
        .success {
            color: green;
            font-size: 14px;
        }
    </style>
</head>

<body>

     <jsp:include page="usersAdmin.jsp" />
    <!-- Formulaire pour créer un compte -->
    <div class="container mt-5">
        <h2>Creer un compte</h2>
        <form id="accountForm" action="AddCountServlet" method="POST">
            <div class="mb-3">
                <label for="accountNumber" class="form-label" name="first">Numéro de compte</label>
                <input type="text" class="form-control" id="accountNumber" name="accountNumber" maxlength="4" required>
            </div>
            <div class="mb-3">
                <label for="confirmAccountNumber" class="form-label" name="confirm">Confirmer votre numero de compte</label>
                <input type="text" class="form-control" id="confirmAccountNumber" name="confirmAccountNumber" maxlength="4" required>
            </div>
            <div id="errorMessage" class="error"></div>
            <div id="successMessage" class="success"></div>
            <input type="hidden" name="idUser" value="<%= session.getAttribute("id") %>">
            <button type="submit" class="btn btn-primary">Creer</button>
        </form>
    </div>

    <script>
        document.getElementById('accountForm').addEventListener('submit', function(event) {
            // Récupère les valeurs des deux champs
            const accountNumber = document.getElementById('accountNumber').value;
            const confirmAccountNumber = document.getElementById('confirmAccountNumber').value;
            const errorMessage = document.getElementById('errorMessage');
            const successMessage = document.getElementById('successMessage');
            
            // Efface les messages d'erreur et de succès
            errorMessage.textContent = '';
            successMessage.textContent = '';
            
            // Validation des champs (numéro de compte doit avoir 4 chiffres)
            if (accountNumber.length !== 4 || isNaN(accountNumber)) {
                event.preventDefault(); // Empêche l'envoi du formulaire
                errorMessage.textContent = 'Le numéro de compte doit comporter exactement 4 chiffres.';
                return;
            }

            if (accountNumber !== confirmAccountNumber) {
                event.preventDefault(); // Empêche l'envoi du formulaire
                errorMessage.textContent = 'Les numéros de compte ne correspondent pas.';
                return;
            }

            // Si la validation est réussie
           alert('Compte créé avec succès !');
            // Le formulaire sera envoyé à la servlet après cette validation
        });
    </script>
  
    </body>
</html>
