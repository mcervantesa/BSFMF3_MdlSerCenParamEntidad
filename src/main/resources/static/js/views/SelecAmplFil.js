$(document).ready(function(){
	InitHead("Selección Ampliada de Filas");
	InitBtn();
});

function InitBtn(){
	$("#BtnPrint").click(function(){
		try{
			var urlPrint=ObtieneContex()+'/PrintSelecAmpFil';
			$("#DivPrintSelecAmpFil").load(urlPrint,{'bsfOper':''},function(){
				
			});
		}catch(msg){
			console.log('Error BtnPrint '+msg);
		}	
	});
}