$(document).ready(function(){
	InitHead("Tablas Referenciales");
	InitBtn();
});

function InitBtn(){
	$("#cmbCod").change(function() {
		var urlDet=ObtieneContex()+'/DetalleTabRefPrincipal';
		$("#DivTblTabRef").load(urlDet,{'bsfOper':''},function(){
			AplicTabl('tblDetallTabRef');
		});
	});
	
	$("#BtnPrint").click(function(){
		var urlDet=ObtieneContex()+'/PrintTabRefPrincipal';
		$("#DivPrintTabRef").load(urlDet,{'bsfOper':''},function(){
			
		});
	});
	
}