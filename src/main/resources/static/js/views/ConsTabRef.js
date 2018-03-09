$(document).ready(function(){
	InitHead("Consulta Fila de Tabla Referencial");
	InitBtn();
});

function InitBtn(){
	$("#BtnPrint").click(function(){
		var urlPrint =ObtieneContex()+'/PrintConsTabRef';
		$("#divPrintConsTabRef").load(urlPrint,{'BSFOPERADOR':''},function(){
			
		});
	});
}