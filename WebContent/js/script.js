$('#provincia').change(function(){
    $('#ciudad').removeAttr('disabled');
});

$('document').ready(function(){
    $('#provincia').on("change", function(e){
        var provinciaSeleccionada = $(this).val();
        $('#ciudad option').show();
        $('#ciudad option').not('.'+provinciaSeleccionada).hide()
    }) 


$()
function validar(obj){
	var d = document.submit;
	if(obj.checked==true){
		d.submit.disabled = false;
	}else{
		d.submit.disabled= true;
	}
}
})