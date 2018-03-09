$(document).ready(function(){
	InitHead("Centros");
	InitBtn();
});

function InitBtn(){
	$("#BtnPrint").click(function(){
		var urlPrint=ObtieneContex()+'/PrintCentros';
		$("#DivPrintCentros").load(urlPrint,{'BSFOPERADOR':''},function(){
			
		});
	});
}