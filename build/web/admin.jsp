<%-- 
    Document   : admin.jsp
    Created on : 25 sept. 2024, 10:23:09
    Author     : PC

--%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
          <link rel="stylesheet" href="css/admin.css">
    <link rel="stylesheet" href="bootstrap/bootstrap-5.0.2-dist/css/bootstrap.css">
    <script src="bootstrap/bootstrap-5.0.2-dist/js/bootstrap.min.js"></script>
    </head>
<style>

      .profile-img {
                width: 200px;  
                height: 200px;
                border-radius: 50%;
                cursor: pointer;
            }
        </style>
    <body>
    <div class="sidebar">
        <a href="#">
                <img src="Koala.jpg" alt="Profile Image" class="profile-img">
        </a>

        <h2><%= session.getAttribute("nom") %></h2>
        <a href="AdminDashBoardServlet" class="nav-link">Dashboard</a>
        <a href="UsersAdminServlet" class="nav-link">Utilisateurs</a>
        <a href="ProductAdminServlet" class="nav-link">Produits</a>
        <a href="CommandeAdminServlet" class="nav-link">Commandes</a>
        
        <a href="DeconnecterAdminServlet" class="nav-link">Déconnexion</a>
    </div>
<script type="text/javascript">
    window.history.forward(); // Désactive le bouton retour
</script>
    </body>
</html>
