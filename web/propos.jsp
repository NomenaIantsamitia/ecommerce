<%-- 
    Document   : propos
    Created on : 2 oct. 2024, 18:49:31
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
    </head>
<style>
body {
    background-color: #f8f9fa;
}

h2, h3 {
    text-align: center;
}

.form-group {
    margin-bottom: 15px;
}

#balanceSection {
    background-color: #f1f1f1;
    padding: 15px;
    border-radius: 10px;
}

</style>
    <body>
                    <jsp:include page="usersAdmin.jsp" />
       <div class="container mt-3">

        <h2 id="formTitle">Créer un Compte</h2>
        <form id="accountForm" action="modifCompte.jsp">
            <div class="form-group">
                <label for="accountNumber1">Numéro de compte</label>
                <input type="text" class="form-control" id="accountNumber1" required>
            </div>
            <div class="form-group">
                <label for="accountNumber2">Confirmer le numéro de compte</label>
                <input type="text" class="form-control" id="accountNumber2" required>
                <small id="accountNumberHelp" class="form-text text-muted">Max 4 chiffres uniquement.</small>
            </div>
            <button type="submit" class="btn btn-primary">Créer un Compte</button>
        </form>

   
    </div>
        <script>

        let accountCreated = false;
let currentAccountNumber = '';
let currentBalance = 0;

// Formulaire pour créer un compte
document.getElementById('accountForm').addEventListener('submit', function(event) {
    event.preventDefault();
    
    const accountNumber1 = document.getElementById('accountNumber1').value;
    const accountNumber2 = document.getElementById('accountNumber2').value;
    const messageDiv = document.getElementById('message');

    // Vérification des numéros de compte
    if (!/^\d{1,4}$/.test(accountNumber1) || !/^\d{1,4}$/.test(accountNumber2)) {
        messageDiv.innerHTML = '<div class="alert alert-danger">Le numéro de compte doit contenir uniquement des chiffres et être maximum de 4 chiffres.</div>';
    } else if (accountNumber1 !== accountNumber2) {
        messageDiv.innerHTML = '<div class="alert alert-danger">Les numéros de compte ne correspondent pas.</div>';
    } else {
        messageDiv.innerHTML = '<div class="alert alert-success">Compte créé avec succès !</div>';
        currentAccountNumber = accountNumber1;
        accountCreated = true;
        showBalanceSection();
    }
});

// Formulaire pour modifier le compte
document.getElementById('modifyAccountForm').addEventListener('submit', function(event) {
    event.preventDefault();
    
    const oldAccountNumber = document.getElementById('oldAccountNumber').value;
    const newAccountNumber = document.getElementById('newAccountNumber').value;
    const messageDiv = document.getElementById('message');

    if (oldAccountNumber !== currentAccountNumber) {
        messageDiv.innerHTML = '<div class="alert alert-danger">L\'ancien numéro de compte est incorrect.</div>';
    } else if (!/^\d{1,4}$/.test(newAccountNumber)) {
        messageDiv.innerHTML = '<div class="alert alert-danger">Le nouveau numéro de compte doit contenir uniquement des chiffres et être maximum de 4 chiffres.</div>';
    } else {
        messageDiv.innerHTML = '<div class="alert alert-success">Numéro de compte modifié avec succès !</div>';
        currentAccountNumber = newAccountNumber;
    }
});

// Ajouter du solde au compte
document.getElementById('addBalance').addEventListener('click', function() {
    const balanceInput = document.getElementById('balance').value;
    if (balanceInput !== '' && !isNaN(balanceInput)) {
        currentBalance += parseFloat(balanceInput);
        document.getElementById('currentBalance').innerText = 'Solde actuel: ' + currentBalance + ' unités';
        document.getElementById('balance').value = ''; // Réinitialiser le champ
    }
});

// Afficher la section de gestion de compte
function showBalanceSection() {
    document.getElementById('accountForm').classList.add('d-none');
    document.getElementById('balanceSection').classList.remove('d-none');
    document.getElementById('formTitle').innerText = 'Gérer votre Compte';
}

        </script>
        
    </body>
</html>
