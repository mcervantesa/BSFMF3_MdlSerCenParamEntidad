$(document).ready(function(){
	InitHead("Cheques");
	InitBtn();
});

function InitBtn(){
	try{
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
	}catch(msg){
		log.error('Error InitBtn '+msg);
	}
	
	
}