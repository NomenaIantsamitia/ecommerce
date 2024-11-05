<%-- 
    Document   : loginUsers
    Created on : 28 sept. 2024, 18:01:06
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
 <style>
            /* Nouveau style pour la page */
            body {
                background: linear-gradient(145deg, #00c6ff, #0072ff);
                height: 100vh;
                display: flex;
                justify-content: center;
                align-items: center;
                font-family: 'Roboto', sans-serif;
                margin: 0;
                padding: 0;
            }

            .login-container {
                background-color: white;
                padding: 3rem;
                border-radius: 15px;
                box-shadow: 0 10px 30px rgba(0, 0, 0, 0.3);
                width: 100%;
                max-width: 450px;
                transition: transform 0.5s ease;
            }

            .login-container:hover {
                transform: translateY(-5px);
            }

            h2 {
                text-align: center;
                margin-bottom: 2rem;
                color: #333;
                font-weight: bold;
                text-transform: uppercase;
            }

            .form-control {
                border-radius: 30px;
                padding: 0.75rem 1.5rem;
                transition: all 0.3s ease;
            }

            .form-control:focus {
                box-shadow: none;
                border-color: #0072ff;
            }

            .form-floating label {
                padding-left: 1.5rem;
            }

            .btn-primary {
                background-color: #0072ff;
                border-color: #0072ff;
                border-radius: 30px;
                font-weight: bold;
                transition: all 0.3s ease;
            }

            .btn-primary:hover {
                background-color: #0056d2;
                transform: scale(1.05);
                box-shadow: 0 5px 15px rgba(0, 114, 255, 0.4);
            }

            /* Style pour le bouton retour */
            .btn-back {
                background-color: #555;
                border-color: #555;
                border-radius: 50px;
                color: white;
                padding: 10px 15px;
                font-size: 0.9rem;
                position: fixed;
                bottom: 30px;
                right: 30px;
                box-shadow: 0 4px 10px rgba(0, 0, 0, 0.3);
            }

            .btn-back:hover {
                background-color: #333;
                transform: translateY(-3px);
                box-shadow: 0 6px 15px rgba(0, 0, 0, 0.4);
            }

            /* Spinner d'animation de chargement */
            .spinner-border {
                display: none;
            }

            .loading .spinner-border {
                display: inline-block;
            }

            .loading .btn-text {
                display: none;
            }
        </style>
    </head>
    <body>
        <div class="login-container">
            <h2>Se Connecter</h2>
            <form action="VerificationUsersServlet" id="loginForm" onsubmit="return handleLogin(event)">
                <div class="form-floating mb-3">
                    <input type="text" class="form-control" id="username" placeholder="Nom d'utilisateur" name="nom" required>
                    <label for="username">Nom d'utilisateur</label>
                </div>
                <div class="form-floating mb-3">
                    <input type="password" class="form-control" name="psw" id="password" placeholder="Mot de passe" required>
                    <label for="password">Mot de passe</label>
                </div>
                <div class="d-grid">
                    <button type="submit" class="btn btn-primary">
                        <span class="btn-text">Se connecter</span>
                        <span class="spinner-border spinner-border-sm" role="status" aria-hidden="true"></span>
                    </button>
                </div>
            </form>
        </div>

        <!-- Bouton de retour en bas à droite -->
        <button class="btn btn-back" onclick="goBack()">↩ Retour</button>

        <script>
            // Rediriger vers une autre page avec le bouton retour
            function goBack() {
                window.location.href = 'RetournerServlet'; // Remplace par la page de retour
            }

            // Gestion du formulaire avec chargement
            function handleLogin(event) {
                event.preventDefault();
                const form = document.getElementById('loginForm');
                const submitButton = form.querySelector('button[type="submit"]');
                submitButton.classList.add('loading');
                setTimeout(() => {
                    form.submit();
                }, 1000); // Remplacer ce délai par une vraie validation si nécessaire
            }
        </script>
    </body>
</html>
