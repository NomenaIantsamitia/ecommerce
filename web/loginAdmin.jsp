<%-- 
    Document   : loginAdmin
    Created on : 4 oct. 2024, 23:34:34
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
                background-color: #f4f4f9;
                font-family: Arial, sans-serif;
            }

            .card {
                border-radius: 8px;
                border: none;
                box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
            }

            #username, #password {
                border-radius: 6px;
            }

            #username:focus, #password:focus {
                box-shadow: none;
                border-color: #007bff;
            }

            .btn-primary {
                border-radius: 6px;
            }

            .alert-danger {
                margin-top: 10px;
                padding: 8px;
                font-size: 0.9em;
            }

            #btn-go-back {
                position: fixed;
                bottom: 20px;
                right: 20px;
                background-color: #007bff;
                color: white;
                border-radius: 50%;
                padding: 10px 15px;
                border: none;
                cursor: pointer;
            }

            #btn-go-back:hover {
                background-color: #0056b3;
            }
        </style>
    </head>
    <body>
        <div class="container d-flex justify-content-center align-items-center vh-100">
            <div class="card p-4 shadow-lg" style="width: 100%; max-width: 400px;">
                <h2 class="text-center mb-4">Connexion Admin</h2>
                <div id="error-message" class="alert alert-danger d-none"></div>
                <form action="VerifAdminServlet" method="post" id="admin-login-form">
                    <div class="form-group">
                        <label for="username">Nom d'utilisateur</label>
                        <input type="text" name="nom" class="form-control" id="username" required>
                    </div>
                    <div class="form-group">
                        <label for="password">Mot de passe</label>
                        <input type="password" name="psw" class="form-control" id="password" required>
                    </div>
                    <button type="submit" class="btn btn-primary btn-block">Se connecter</button>
                </form>
            </div>
        </div>

        <!-- Bouton revenir à une autre page -->
        <button id="btn-go-back" onclick="goBack()">↩</button>

        <script>
            // Fonction pour rediriger vers une autre page
            function goBack() {
                window.location.href = 'RetourServlet'; // Remplace 'index.jsp' par la page vers laquelle tu veux rediriger
            }
        </script>
    </body>
</html>
