<%-- 
    Document   : acceuil
    Created on : 29 sept. 2024, 15:21:46
    Author     : PC
--%>

<%@page import="java.util.List"%>
<%@page import="modele.ProduitModele"%>
<%@page import="dao.ProduitsDao"%>
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

    </head>
 
    <body>
      <jsp:include page="usersAdmin.jsp" />

  <section class="product-container">
    <%
        ProduitsDao dao = new ProduitsDao();
        
        List<ProduitModele> lisitra = dao.findAll();
        for(ProduitModele perso : lisitra) {
            int id_users = perso.getId();
    
    %>
        <div class='product'>
            <img src='image/<%= perso.getImg() %>' alt='Produit 1'>
            <div class='product-details'>
                <h2> <%= perso.getCategorie() %></h2>
                <p><%= perso.getTaux() %> Ar</p>
            </div>
        </div>
        
        <!-- Modal pour chaque produit -->
        

    <%
        }
    %>
</section>

</html>
