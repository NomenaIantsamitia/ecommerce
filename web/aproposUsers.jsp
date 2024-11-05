<%-- 
    Document   : aproposUsers
    Created on : 27 sept. 2024, 21:08:53
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/aproposUsers.css">
        <title>JSP Page</title>
        <style>
             .product-container {
    display: flex;
    flex-wrap: wrap;
    justify-content: center;
    max-height: 600px; /* Limite la hauteur */
    overflow-y: auto;  /* Barre de défilement */
    padding: 20px;
    margin-top: 1px;
}
        </style>
    </head>
    <body>
      
          <jsp:include page="usersAdmin.jsp" />
    </body>
</html>
