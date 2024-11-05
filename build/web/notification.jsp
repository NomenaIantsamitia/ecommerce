<%-- 
    Document   : notification
    Created on : 25 sept. 2024, 15:37:01
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
     <link rel="stylesheet" href="css/notification.css">
    <link rel="stylesheet" href="bootstrap/bootstrap-5.0.2-dist/css/bootstrap.css">
    <script src="bootstrap/bootstrap-5.0.2-dist/js/bootstrap.min.js"></script>
     <link rel="stylesheet" href="javascript/products.js">
    </head>
    <body>
        
        <!-- Inclusion du slider -->
        <jsp:include page="admin.jsp" />
 <div class="container">
        <div class="main-content">
            <h2 class="text-center">Notifications</h2>

            <!-- Champ de recherche -->
            <input type="text" id="searchInput" onkeyup="searchNotifications()" placeholder="Rechercher une notification..." class="search-bar">

            <!-- Liste des notifications -->
            <div class="notifications-container" id="notificationsList">
               
                <div class="notification-item">
                    <p>Commande #123 a été expédiée.</p>
                    <p>Vous avez reçu un nouveau message de l'administration.</p>
                     <p>Votre commande #456 a été annulée.</p>
                     <p>Nouvelle mise à jour disponible pour votre application.</p>
                     
                    <button class="btn btn-danger" onclick="deleteNotification(this)">Supprimer</button>
                </div>
            </div>
        </div>
    </div>

    <!-- Script JS pour la recherche et suppression -->
    <script>
        function searchNotifications() {
            var input, filter, container, notifications, p, i, txtValue;
            input = document.getElementById("searchInput");
            filter = input.value.toUpperCase();
            container = document.getElementById("notificationsList");
            notifications = container.getElementsByClassName("notification-item");

            for (i = 0; i < notifications.length; i++) {
                p = notifications[i].getElementsByTagName("p")[0];
                txtValue = p.textContent || p.innerText;
                if (txtValue.toUpperCase().indexOf(filter) > -1) {
                    notifications[i].style.display = "";
                } else {
                    notifications[i].style.display = "none";
                }
            }
        }

        function deleteNotification(button) {
            var notification = button.parentElement;
            notification.remove();
        }
    </script>
 
    </body>
</html>
