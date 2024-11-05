
alert("Ok");
function searchFunction() {
    var input, filter, table, tr, td, i, j, txtValue;
    input = document.getElementById("searchInput");
    filter = input.value.toUpperCase();
    table = document.getElementById("productTable");
    tr = table.getElementsByTagName("tr");

    // Boucle à travers toutes les lignes de table et cache celles qui ne correspondent pas à la recherche
    for (i = 0; i < tr.length; i++) {
        tr[i].style.display = "none"; // Masquer toutes les lignes au départ
        td = tr[i].getElementsByTagName("td");
        for (j = 0; j < td.length; j++) {
            if (td[j]) {
                txtValue = td[j].textContent || td[j].innerText;
                if (txtValue.toUpperCase().indexOf(filter) > -1) {
                    tr[i].style.display = ""; // Afficher la ligne si une colonne correspond à la recherche
                    break;
                }
            }
        }
    }
}

// Fonction pour supprimer un produit
function deleteProduct(btn) {
    var row = btn.parentNode.parentNode;
    row.parentNode.removeChild(row); // Suppression de la ligne
}

// Fonction pour modifier un produit (à améliorer selon les besoins)
function editProduct(btn) {
    alert('Fonction de modification non implémentée'); // Placeholder pour la modification
}
