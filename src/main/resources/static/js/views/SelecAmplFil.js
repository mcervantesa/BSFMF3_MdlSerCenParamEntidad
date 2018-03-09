$(document).ready(function(){
	InitHead("Selección Ampliada de Filas");
	InitBtn();
});

function InitBtn(){
	$("#BtnPrint").click(function(){
		try{
			var urlPrint=ObtieneContex()+'/PrintSelecAmpFil';
			$("#DivPrintSelecAmpFil").load(urlPrint,{'BSFOPERADOR':''},function(){
				
			});
		}catch(msg){
			console.log('Error BtnPrint '+msg);
		}	
	});
	
	$("#btnFindSelecAmp").click(function(){
		var urlDet=ObtieneContex()+'/DetSelecAmpFil';
		$("#DivDetSelecAmpFil").load(urlDet,{'BSFOPERADOR':''},function(){
			AplicTabl('tblDetallSelecAm');
		});
	});
}