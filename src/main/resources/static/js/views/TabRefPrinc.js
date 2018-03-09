$(document).ready(function(){
	InitHead("Tablas Referenciales");
	InitBtn();
});

function InitBtn(){
	$("#cmbCod").change(function() {
		var urlDet=ObtieneContex()+'/DetalleTabRefPrincipal';
		$("#DivTblTabRef").load(urlDet,{'BSFOPERADOR':''},function(){
			AplicTabl('tblDetallTabRef');
		});
	});
	
	$("#BtnPrint").click(function(){
		var urlDet=ObtieneContex()+'/PrintTabRefPrincipal';
		$("#DivPrintTabRef").load(urlDet,{'BSFOPERADOR':''},function(){
			
		});
	});	
}

function EnviaForm(sendForm){
	var urlDet=ObtieneContex()+'/'+sendForm;
	$("#frmEnv").attr('action',urlDet);
	$("#frmEnv").submit();
}