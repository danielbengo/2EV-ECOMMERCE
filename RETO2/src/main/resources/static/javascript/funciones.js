function reload() {
    var e = document.getElementById("languages");
    var selectedLang = e.options[e.selectedIndex].value;
    var url = "?lang=" + selectedLang
    location.href = url;
}
//añadir producto, hay que añadir los onclicks en los "añadir carrito" pero no esta funcional aún
function addNewProduct(idproducto) {
    let url = 'https://ecommerce-maven.azurewebsites.net//order/2/product'
    fetch('https://ecommerce-maven.azurewebsites.net//products/' + idproducto)
        .then(res => respones = res.json())
        .then(data => {
        fetch(url, {
        method: 'POST',
        body: JSON.stringify(data),
        headers: {'Content-Type': 'application/json'} 
        }).then(res => {window.location.href = "/index";
            });
        })

}

//añadir o quitar productos del carro(sin comprobar si esta bien creo que da error)

// function addProduct(idproducto) { let url = 'https://ecommerce-maven.azurewebsites.net/orders/3/products/1?action=add'
//     fetch('https://ecommerce-maven.azurewebsites.net/products/' + idproducto)
//         .then(res => respones = res.json())
//         .then(data => {fetch(url, {
//                 method: 'PUT',
//                 body: JSON.stringify(data),
//                 headers: {'Content-Type': 'application/json'}
//             }).then(res => {window.location.href = "/index"; });
//         })
// }
// function removeProduct(id_product) {
//     let url = 'https://ecommerce-maven.azurewebsites.net/orders/1/products/1?action=delete'
//     fetch('https://ecommerce-maven.azurewebsites.net/products/' + id_product)
//         .then(res => respones = res.json())
//         .then(data => { fetch(url, {
//                 method: 'DELETE',
//                 body: JSON.stringify(data),
//                 headers: {
//                 'Content-Type': 'application/json'}}).then(res => {
//                 window.location.href = "/index";});})
// }
