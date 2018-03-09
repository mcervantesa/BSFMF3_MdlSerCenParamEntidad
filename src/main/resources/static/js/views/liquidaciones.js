$(document).ready(function(){
	InitHead("Liquidaciones"); //Funcion Gral
	InitBtn();
});

function InitBtn(){
	try{
		$("#btnFindLiq").click(function(){
			var urlFindLiq=ObtieneContex()+'/BusqLiquid';
			$("#divBusqLiqu").load(urlFindLiq,{'BSFOPERADOR':''},function(){
				AplicTabl('tblDetall');
			});
		});
		
		$("#BtnSave").click(function(){
			abrirAlertaExito('OPERACIÓN REALIZADA CORRECTAMENTE');
		});
		
		$("#BtnPrint").click(function(){
			var urlPrint=ObtieneContex()+'/PrintLiquid';
			$("#DivPrint").load(urlPrint,{'BSFOPERADOR':''},function(){
				
			});
		});	
	}catch(msg){
		log.error('Error InitBtn '+msg);
	}	
}

function EnviaForm(sendForm){
	var urlDet=ObtieneContex()+'/'+sendForm;
	$("#frmEnv").attr('action',urlDet);
	$("#frmEnv").submit();
}