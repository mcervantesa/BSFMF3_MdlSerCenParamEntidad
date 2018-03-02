$(document).ready(function(){
	InitHead("Mantenimiento de Centros Autorizados");
	InitBtn();
});

function InitBtn(){
	$("#BtnPrint").click(function(){
		var urlPrint =ObtieneContex()+'/PrintMantCentAut';
		$("#divPrintMantCentAut").load(urlPrint,{'bsfOper':''},function(){
			
		});
	});
}