$(document).ready(function(){
	InitHead("Pasivo Prioridades Cargos");//Funcion Gral
	InitBtn();
});

function InitBtn(){
	$("#BtnPrint").click(function(){
		var urlPrint=ObtieneContex()+'/printPriorCargo';
		$("#DivPrint").load(urlPrint,{'bsfOper':''},function(){
			
		});
	});
	
	$("#BtnSave").click(function(){
		abrirAlertaExito('OPERACIÓN REALIZADA CORRECTAMENTE');
	});
	
	$("#btnClos").click(function(){
		var vMsg='<label>¡Atención! Si continua perderá todos los cambios</label><br/><p style="font-family: "Arial Negrita", "Arial";">¿Desea continuar de todos modos?</p>';
		abrirAlertaConfirmacion(vMsg);	
	});	
}
