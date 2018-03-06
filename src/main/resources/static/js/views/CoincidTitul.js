$(document).ready(function(){
	InitHead("Coincidencia de Titulares");
	InitBtn();
});

function InitBtn(){
	$("#btnFind").click(function(){
		var ulrDet=ObtieneContex()+'/detallCoinTitu';
		$("#DivDetallCoinc").load(ulrDet,{'bsfOper':''},function(){
			AplicTabl('tblDetallCoincTit');
		});
	});
}