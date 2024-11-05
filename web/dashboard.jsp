<%-- 
    Document   : dashboard
    Created on : 25 sept. 2024, 11:29:22
    Author     : PC
--%>

<%@page import="dao.CommandeDao"%>
<%@page import="java.util.Map"%>
<%@page import="dao.UtilisateursDao"%>
<%@page import="dao.ProduitsDao"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
      
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/dashboard.css">
    <link rel="stylesheet" href="bootstrap/bootstrap-5.0.2-dist/css/bootstrap.css">
    <script src="bootstrap/bootstrap-5.0.2-dist/js/bootstrap.min.js"></script>
    <!-- Chart.js -->
    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
    </head>
    <%
       int id , electronique,vetements,jeux,accesoires,livres;
       ProduitsDao dao = new ProduitsDao();
       id = dao.nomBreInscri();
       electronique = dao.nbrElectronique();
       vetements = dao.nbrVetements();
       jeux = dao.nbrJeux();
       accesoires = dao.nbrAccesoires();
       livres = dao.nbrLivres();
       
       int si ;
       UtilisateursDao da = new UtilisateursDao();
       si = da.nomBreInscri();
       
       
       
    %>
    <body>
      
        <jsp:include page="admin.jsp" />
    <div class="container ensemble mt-4">
        <%
         CommandeDao produitsDao = new CommandeDao();
        Map<String, Integer> ventesMensuelles = produitsDao.getVentesMensuelles();
   // Map<String, Integer> ventesMensuelles = (Map<String, Integer>) request.getAttribute("ventesMensuelles");
    
    String[] mois = {"Jan", "Fév", "Mar", "Avr", "Mai", "Juin","Juillet","Aout","Septembre","Octobre","Novembre","Decembre"};
    int[] ventes = new int[12];

    for (int i = 0; i < mois.length; i++) {
        ventes[i] = ventesMensuelles.getOrDefault(mois[i], i);

    }
%>
       

        <!-- Cartes de Statistiques -->
        <div class="row">
            <div class="col-lg-4 col-md-6 mb-4">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Total Produits</h5>
                        <p class="card-text"> <%= id %> Produits enregistrés</p>
                    </div>
                </div>
            </div>
            <div class="col-lg-4 col-md-6 mb-4">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Stock Disponible</h5>
                        <p class="card-text">1200 articles en stock</p>
                    </div>
                </div>
            </div>
            <div class="col-lg-4 col-md-6 mb-4">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Utilisateurs Actifs</h5>
                        <p class="card-text" id="admin"> <%= si %>  Administrateurs</p>
                    </div>
                </div>
            </div>
        </div>

        <!-- Graphique des Statistiques -->
        <div class="row">
            <div class="col-lg-6 mb-4">
                <div class="card">
                    <div class="card-header">
                        <h5>État des Stocks par Catégorie</h5>
                    </div>
                    <div class="card-body">
                        <canvas id="stockChart"></canvas>
                    </div>
                </div>
            </div>

            <div class="col-lg-6 mb-4">
                <div class="card">
                    <div class="card-header">
                        <h5>Rapport des Ventes Mensuelles</h5>
                    </div>
                    <div class="card-body">
                        <canvas id="salesChart"></canvas>
                    </div>
                </div>
            </div>
        </div>

    </div>


       <script>
    
var ctxStock = document.getElementById('stockChart').getContext('2d');
var electronique = <%= electronique %>;
var vetements = <%= vetements %>;
var accesoires = <%= accesoires %>;
var livre = <%= livres %>;
var jeu = <%= jeux %>;
var stockChart = new Chart(ctxStock, {
    type: 'bar',
    data: {
        labels: ['Électronique', 'Sport', 'Accessoires', 'Livres', 'Jeux'],
        datasets: [{
            label: 'Articles en Stock',
            data: [electronique, vetements, accesoires, livre, jeu],
            backgroundColor: [
                '#1abc9c',
                '#3498db',
                '#9b59b6',
                '#e74c3c',
                '#f39c12'
            ],
            borderColor: [
                '#16a085',
                '#2980b9',
                '#8e44ad',
                '#c0392b',
                '#e67e22'
            ],
            borderWidth: 1
        }]
    },
    options: {
        scales: {
            y: {
                beginAtZero: true
            }
        }
    }
});

// Graphique des ventes mensuelles
var ctxSales = document.getElementById('salesChart').getContext('2d');
var jan = <%= ventes[0] %>;
var fev = <%= ventes[1] %>;
var mar = <%= ventes[2] %>;
var apr = <%= ventes[3] %>;
var mai = <%= ventes[4] %>;
var juin = <%= ventes[5] %>;
var jui = <%= ventes[6] %>;
var aout = <%= ventes[7] %>;
var sept = <%= ventes[8] %>;
var oct = <%= ventes[9] %>;
var nov = <%= ventes[10] %>;
var dec = <%= ventes[11] %>;
var salesChart = new Chart(ctxSales, {
    type: 'line',
    data: {
        labels: ['Jan', 'Fév', 'Mar', 'Avr', 'Mai', 'Juin',"Juillet","Aout","Septembre","Octobre","Novembre","Decembre"],
        datasets: [{
            label: 'Ventes Mensuelles',
            data: [jan, fev, mar, apr, mai, juin,jui,aout,sept,oct,nov,dec],
            backgroundColor: 'rgba(52, 152, 219, 0.2)',
            borderColor: '#3498db',
            borderWidth: 2
        }]
    },
    options: {
        scales: {
            y: {
                beginAtZero: true
            }
        }
    }
});
       </script>
    </body>
</html>
