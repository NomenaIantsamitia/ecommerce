<%-- 
    Document   : profilUsers
    Created on : 4 oct. 2024, 22:57:17
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
     <style>
    * {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}

body {
    font-family: Arial, sans-serif;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
    background-color: #f4f4f9;
}

.container {
    text-align: center;
    background-color: #fff;
    padding: 20px;
    width: 100px;
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

h2 {
    color: #333;
    margin-bottom: 20px;
}

.profile-card {
    margin-top: 20px;
    padding: 20px;
    background-color: #f9f9f9;
    border-radius: 8px;
}

.profile-item {
    display: flex;
    justify-content: space-between;
    margin-bottom: 15px;
}

label {
    font-weight: bold;
    color: #555;
}

span {
    color: #333;
    padding: 4px 8px;
    border-radius: 4px;
    background-color: #e7e7e7;
    cursor: default;
}
 </style>
    <body>
         <jsp:include page="usersAdmin.jsp" />
            <div class="container">
        <h2>Profil Utilisateur</h2>
        <div class="profile-card">
            <div class="profile-item">
                <label>Nom :</label>
                <span><%= session.getAttribute("nom")%></span>
            </div>
            <div class="profile-item">
                <label>Solde :</label>
                <span><%= session.getAttribute("psw")%> </span>
            </div>
            <div class="profile-item">
                <label>Numéro de compte :</label>
                <span><%= session.getAttribute("num")%></span>
            </div>
            
            <div class="profile-item">
                <label>Solde :</label>
                <span><%= session.getAttribute("solde")%> Ar</span>
            </div>
        </div>
    </div>
    </body>
</html>
