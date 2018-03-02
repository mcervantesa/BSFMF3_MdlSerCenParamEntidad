$(document).ready(function(){
	InitHead("Pasivo Aportaciones");
	InitBtn();
});

function InitBtn(){
	$("#btnClos").click(function(){
		var vMsg='<label>¡Atención! Si continua perderá todos los cambios</label><br/><p style="font-family: "Arial Negrita", "Arial";">¿Desea continuar de todos modos?</p>';
		abrirAlertaConfirmacion(vMsg);	
	});
	
	$("#BtnSave").click(function(){
		abrirAlertaExito('OPERACIÓN REALIZADA CORRECTAMENTE');
	});
}