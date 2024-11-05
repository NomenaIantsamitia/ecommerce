<%-- 
    Document   : utilisateurs.jsp
    Created on : 27 sept. 2024, 15:37:53
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
    <style>
        .errorMessage {
            color: red;
            font-size: 0.9em;
            display: none;
        }
    </style>
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
                <button data-bs-toggle='modal' data-bs-target='#addCommandeModal<%= id_users %>'>Acheter</button>
      
            </div>   
         </div>
        <!-- Modal pour chaque produit -->
        <div class="modal fade" id="addCommandeModal<%= id_users %>" tabindex="-1" aria-labelledby="addCommandeModalLabel<%= id_users %>" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="addCommandeModalLabel<%= id_users %>">Completer les champs</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <form action="AjouterCommandeServlet" name="formula" id="accountForm" method="post" onsubmit="return verification(document.getElementById('qttAchat<%= id_users %>').value,document.getElementById('numCompte<%= id_users %>').value,<%= perso.getTaux() %>,<%= session.getAttribute("num") %>,<%= session.getAttribute("solde") %>)">
                            <div class="mb-3">
                                <label for="qtt">Entrer la quantité</label>
                                <input type="number" class="form-control" id="qttAchat<%= id_users %>" name="qtt" required>
                                <label for="numCompte">Entrer votre numéro de compte</label>
                                <input type="number" class="form-control" id="numCompte<%= id_users %>" name="numCompte" required>
                            </div>
                            <input type="hidden" name="idUsers" value="<%= session.getAttribute("id") %>">
                            <input type="hidden" name="idProduit" value="<%= id_users %>">
                            <input type="hidden" name="idTaux" value="<%= perso.getTaux() %>">
                            <input type="submit" class="btn btn-primary" value="Payer">
                        </form>
                    </div>
                </div>
            </div>
        </div>

    <%
        }
    %>
</section>

    <script type="text/javascript">
  //   window.history.forward(); Désactive le bouton retour

  function verification(qtt,numero,taux,num,solde) {
    var total = qtt * taux;
    if(qtt  <= 0){
        alert("Quantites saisie incorrecte");
        event.preventDefault(); // Empêche l'envoi du formulaire
        return;
    }
        if(numero != num){
        alert("Veuillez saisir un numero de compte incorecte");
        event.preventDefault(); // Empêche l'envoi du formulaire
        return;
    }
    if(total > solde){
        alert("Solde insufisante total = "+total+" et votre solde est "+solde);
        event.preventDefault(); // Empêche l'envoi du formulaire
        return;
    }

    alert("Achat avec succes");


}


</script>
    </body>
</html>
