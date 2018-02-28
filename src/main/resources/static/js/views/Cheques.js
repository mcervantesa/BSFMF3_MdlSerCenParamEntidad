$(document).ready(function(){
	InitHead();
	InitBtn();
});

function InitHead(){
	try{
		$("#lblTitle").text("Cheques");
		$("#breadcum").click(function(){
			parent.regresarMenuFrecuente();
		});	
	}catch(msg){
		console.log('Error InitHead '+msg);
	}	
}

function InitBtn(){
	$("#btnClos").click(function(){
		var vMsg='<label>¡Atención! Si continua perderá todos los cambios</label><br/><p style="font-family: "Arial Negrita", "Arial";">¿Desea continuar de todos modos?</p>';
		abrirAlertaConfirmacion(vMsg);	
	});
	
	$("#aceptarConfirmacion").click(function(){
		parent.regresarMenuFrecuente();	
	});
	
	$("#BtnPrint").click(function(){
		try{
			var urlPrint=ObtieneContex()+'/printCheque';
			$("#DivPrintChequ").load(urlPrint,{'bsfOper':''},function(){
				
			});
		}catch(msg){
			console.log('Error BtnPrint '+msg);
		}
	});
	
	$("#BtnSave").click(function(){
		abrirAlertaExito('OPERACIÓN REALIZADA CORRECTAMENTE');
	});
	
}