$(document).ready(function () {
    $('#sidebarCollapse').on('click', function () {
        $('#sidebar, #content').toggleClass('active');
        $('.collapse.in').toggleClass('in');
        $('a[aria-expanded=true]').attr('aria-expanded', 'false');
        document.getElementById("bodyContent").style.width = "100%";
    });
});

function validarSoloLetras(event) {
    var charCode = event.which || event.keyCode;
    var charStr = String.fromCharCode(charCode);
    // Verificar si el carácter presionado es una letra (mayúscula o minúscula)
     if (/^[A-Za-zñÑ]+$/.test(charStr)) {
        return true; // Permitir la entrada del carácter
    } else {
        event.preventDefault(); // Evitar la entrada del carácter
        return false;
    }
}



