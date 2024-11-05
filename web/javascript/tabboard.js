
var ctxStock = document.getElementById('stockChart').getContext('2d');

var stockChart = new Chart(ctxStock, {
    type: 'bar',
    data: {
        labels: ['Électronique', 'Vêtements', 'Accessoires', 'Livres', 'Jeux'],
        datasets: [{
            label: 'Articles en Stock',
            data: [500, 300, 200, 150, 100],
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
var salesChart = new Chart(ctxSales, {
    type: 'line',
    data: {
        labels: ['Jan', 'Fév', 'Mar', 'Avr', 'Mai', 'Juin'],
        datasets: [{
            label: 'Ventes Mensuelles',
            data: [1200, 1500, 1000, 1700, 1900, 2200],
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