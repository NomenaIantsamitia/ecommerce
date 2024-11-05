<%-- 
    Document   : updateUsersCount
    Created on : 2 oct. 2024, 21:24:32
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="bootstrap/bootstrap-5.0.2-dist/css/bootstrap.css">
    <script src="bootstrap/bootstrap-5.0.2-dist/js/bootstrap.min.js"></script>
     <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/styles.css">
  <style>
        body {
            background-color: #f4f4f4;
            font-family: 'Arial', sans-serif;
        }

        h1 {
            color: #0B6477;
            margin-bottom: 30px;
        }

        .card {
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            border: none;
        }

        .form-label {
            color: #0B6477;
        }

        input {
            border: 2px solid #14919B;
            border-radius: 5px;
        }

        input:focus {
            border-color: #0AD1C8;
            box-shadow: none;
        }

        button {
            background-color: #45DFB1;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            color: white;
            cursor: pointer;
        }

        button:hover {
            background-color: #80ED99;
        }

        .btn-info {
            background-color: #0AD1C8;
            border: none;
            color: white;
        }

        .btn-info:hover {
            background-color: #80ED99;
        }

        .modal-content {
            border-radius: 10px;
        }

        .text-danger {
            margin-top: 5px;
            font-size: 0.9em;
        }
    </style>
</head>
<body>
     <jsp:include page="usersAdmin.jsp" />
    <div class="container mt-5">
        <h1 class="text-center">Gestion de compte</h1>

        <!-- Formulaire de changement de numéro de compte -->
        <div class="card p-4 mb-4">
     

            <h3 class="text-center mb-3">Changer Numéro de Compte</h3>
            <form action="ChangerNumeroCompteServlet" id="changeAccountForm">
                <div class="mb-3">
                    <label for="oldAccountNumber" class="form-label">Ancien Numéro de Compte</label>
                    <input name="ancien" type="text" class="form-control" id="oldAccountNumber" maxlength="4" required>
                </div>
                <div class="mb-3">
                    <label for="newAccountNumber" class="form-label">Nouveau Numéro de Compte</label>
                    <input  name="nouveau"  class="form-control" id="newAccountNumber" maxlength="4" required>
                </div>
                <div id="accountErrorMessage" class="text-danger"></div>
                <input type="hidden" value="<%= session.getAttribute("id") %>" name="idUser" >
                <button type="submit" class="btn btn-primary w-100">Modifier</button>
            </form>
        </div>

        <!-- Formulaire pour ajouter un solde -->
        <div class="card p-4 mb-4">
            <h3 class="text-center mb-3">Ajouter Solde</h3>
            <form action="AjouterSoldeServlet" id="addBalanceForm">
                <div class="mb-3">
                    <label for="balanceAmount" class="form-label">Montant à Ajouter</label>
                    <input type="number"  name="nouveau"  class="form-control" id="newAccountNumber" required>
                </div>
                <div id="balanceErrorMessage" class="text-danger"></div>
                 <input type="hidden" value="<%= session.getAttribute("id") %>" name="idUser" >
                <button type="submit" class="btn btn-primary w-100">Ajouter Solde</button>
            </form>
        </div>

        <!-- Button pour consulter le solde -->
        <div class="text-center">
            <button class="btn btn-info" data-bs-toggle="modal" data-bs-target="#balanceModal">Consulter Solde</button>
        </div>

        <!-- Modal pour consulter le solde -->
        <div class="modal fade" id="balanceModal" tabindex="-1" aria-labelledby="balanceModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="balanceModalLabel">Solde de votre compte</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <p>Votre solde actuel est de : <span id="currentBalance">0</span> Ar</p>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Scripts -->
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.4.0/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/js/bootstrap.min.js"></script>
    <script>
        let currentBalance =  <%= session.getAttribute("solde") %> ;

        document.getElementById('changeAccountForm').addEventListener('submit', function(event) {
            var old = <%= session.getAttribute("num") %> ;
            const oldAccountNumber = document.getElementById('oldAccountNumber').value;
            const newAccountNumber = document.getElementById('newAccountNumber').value;
            const errorMessage = document.getElementById('accountErrorMessage');
            if(oldAccountNumber != old){
                event.preventDefault();
                errorMessage.textContent = 'Numero de compte ANCIENNE incorrect';
                return;
            }
            if (oldAccountNumber.length !== 4 || newAccountNumber.length !== 4) {
                 event.preventDefault(); 
                errorMessage.textContent = 'Les numéros de compte doivent comporter exactement 4 chiffres.';
                return;
            }

            if (isNaN(oldAccountNumber) || isNaN(newAccountNumber)) {
                 event.preventDefault(); 
                errorMessage.textContent = 'Les numéros de compte doivent contenir uniquement des chiffres.';
                return;
            }

            errorMessage.textContent = '';
            
            alert('Le numéro de compte a été modifié avec succès.');
       
            // Redirige vers le servlet après la validation
            // window.location.href = "UpdateAccountServlet";
        });

        document.getElementById('addBalanceForm').addEventListener('submit', function(event) {
           
            const balanceAmount = parseFloat(document.getElementById('balanceAmount').value);
            const errorMessage = document.getElementById('balanceErrorMessage');

            if (balanceAmount <= 0 || isNaN(balanceAmount)) {
                 event.preventDefault(); 
                errorMessage.textContent = 'Veuillez entrer un montant valide supérieur à zéro.';
                return;
            }

            currentBalance += balanceAmount;
            
            alert('Solde ajouté avec succès.');
            document.getElementById('balanceAmount').value = '';
            errorMessage.textContent = '';
           
        });

        $('#balanceModal').on('show.bs.modal', function () {
            document.getElementById('currentBalance').textContent = currentBalance;
        });
    </script>
</html>
