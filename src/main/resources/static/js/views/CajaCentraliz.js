$(document).ready(function(){
	InitHead("Caja Centralizada");
	InitBtn();
});

function InitBtn(){
	try{
		$("#BtnPrint").click(function(){
			try{
				var urlPrint=ObtieneContex()+'/printParamEnt';
				$("#DivPrintParamEnt").load(urlPrint,{'BSFOPERADOR':''},function(){
					
				});
			}catch(msg){
				console.log('Error BtnPrint '+msg);
			}	
		});
		
		$("#BtnSave").click(function(){
			abrirAlertaExito('OPERACIÓN REALIZADA CORRECTAMENTE');
		});
		
		$("#btnClos").click(function(){
			var vMsg='<label>¡Atención! Si continua perderá todos los cambios</label><br/><p style="font-family: "Arial Negrita", "Arial";">¿Desea continuar de todos modos?</p>';
			abrirAlertaConfirmacion(vMsg);	
		});
		
		$("#aceptarConfirmacion").click(function(){
			parent.regresarMenuFrecuente();	
		});
		
	}catch(msg){
		console.log('Error InitBtn '+msg);
	}
	
}
