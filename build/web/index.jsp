<%-- 
    Document   : index
    Created on : 29 sept. 2024, 13:19:00
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
            background-color: #f7f7f7;
            font-family: Arial, sans-serif;
        }

        .login-container {
            margin-top: 100px;
        }

        .card {
            border: none;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
        }

        .card-header {
            background-color: #007bff;
            color: #fff;
            text-align: center;
            font-size: 24px;
        }

        .btn-custom {
            width: 100%;
            font-size: 18px;
            margin-top: 20px;
        }

        .btn-admin {
            background-color: #343a40;
            color: white;
        }

        .btn-user {
            background-color: #007bff;
            color: white;
        }

        .btn-admin:hover, .btn-user:hover {
            opacity: 0.85;
        }
    </style>
    <body>
        <div class="container login-container">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="card">
                    <div class="card-header">
                        Gestion de stock
                    </div>
                    <div class="card-body">
                        <p class="text-center">Veuillez connecter selon votre status</p>
                        <div class="d-grid gap-2">
                            <a href="AdminChoixServlet" class="btn btn-admin btn-custom"> Administrateurs</a>
                            <a href="UtilisateursChoixServlet" class="btn btn-user btn-custom">Utilisateurs</a>
    <i class="fas fa-shopping-cart">Voir le panier</i> 
    <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-shopping-cart">
  <circle cx="9" cy="21" r="1"></circle>
  <circle cx="20" cy="21" r="1"></circle>
  <path d="M1 1h4l2.68 13.39a2 2 0 0 0 2 1.61h9.72a2 2 0 0 0 2-1.61L23 6H6"></path>
</svg>i
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    </body>
</html>
