$(document).ready(function(){
	InitHead("Liquidaciones"); //Funcion Gral
	InitBtn();
});

function InitBtn(){
	
	try{
		$("#btnFindLiq").click(function(){
			var urlFindLiq=ObtieneContex()+'/BusqLiquid';
			$("#divBusqLiqu").load(urlFindLiq,{'bsfOper':''},function(){
				AplicTabl('tblDetall');
			});
		});
		
		$("#BtnSave").click(function(){
			abrirAlertaExito('OPERACIÓN REALIZADA CORRECTAMENTE');
		});
		
		$("#BtnPrint").click(function(){
			var urlPrint=ObtieneContex()+'/PrintLiquid';
			$("#DivPrint").load(urlPrint,{'bsfOper':''},function(){
				
			});
		});	
	}catch(msg){
		log.error('Error InitBtn '+msg);
	}
	
}