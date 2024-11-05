<%-- 
    Document   : usersAdmin
    Created on : 27 sept. 2024, 20:59:54
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/utilisateurs.css">
         <link rel="stylesheet" href="javascript/users.js">
    <link rel="stylesheet" href="bootstrap/bootstrap-5.0.2-dist/css/bootstrap.css">
    <script src="bootstrap/bootstrap-5.0.2-dist/js/bootstrap.min.js"></script>
           <style>

            body {
                font-family: Arial, sans-serif;
                background-color: #f4f4f9;
                margin: 0;
                padding: 0;
            }

            .navbar {
                display: flex;
                justify-content: space-between;
                align-items: center;
                background-color: #007bff;
                padding: 10px 20px;
                position: fixed;
                width: 100%;
                top: 0;
                z-index: 1000;
                box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
            }

            .navbar .profile-img {
                width: 50px;
                height: 50px;
                border-radius: 50%;
                cursor: pointer;
            }

            .nav-links {
                display: flex;
                align-items: center;
            }

            .nav-btn {
                color: white;
                text-decoration: none;
                margin-left: 20px;
                font-weight: bold;
                background-color: transparent;
                border: none;
                cursor: pointer;
            }

            .nav-btn:hover {
                color: #ffcc00;
            }

            .logout-btn {
                background-color: #dc3545;
                padding: 10px 15px;
                border-radius: 5px;
                margin-left: 10px;
            }

            .logout-btn:hover {
                background-color: #c82333;
            }

            .about-container {
                background-color: #fff;
                padding: 20px;
                border-radius: 10px;
                box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
                width: 300px;
                text-align: center;
                margin-top: 100px; /* Ajout de marge pour compenser la navbar fixe */
            }

            .about-container h1 {
                font-size: 24px;
                margin-bottom: 20px;
                color: #333;
            }

            .info p {
                font-size: 16px;
                margin-bottom: 15px;
                color: #555;
            }

            .info span {
                color: #007bff;
                font-weight: bold;
            }

            .btn-modify {
                background-color: #007bff;
                color: white;
                border: none;
                padding: 10px 20px;
                border-radius: 5px;
                cursor: pointer;
                transition: background-color 0.3s;
            }

            .btn-modify:hover {
                background-color: #0056b3;
            }

            .profile-img {
                width: 100px;  
                height: 100px;
                border-radius: 50%;
                cursor: pointer;
            }
        </style>
    </head>
    <body>
         <header>
         <div class="navbar">
        <div class="user-profile">
            <a href="ProfilServlet">
                <img src="Koala.jpg" alt="Profile Image" class="profile-img">
            </a>
        </div>
        <div class="nav-links">
            <a href="AcceuilServlet"  class="nav-btn">Acceuil</a>
            <a href="CompteUsersServlet"  class="nav-btn">Compte</a>           
             <a href="DeconnecterServlet" class="nav-btn logout-btn">Déconnexion</a>
        </div>
    </div>
    </header>
        
       
        <br>
        <br>
       
<script type="text/javascript">
    window.history.forward(); // Désactive le bouton retour
</script>
    </body>
</html>
