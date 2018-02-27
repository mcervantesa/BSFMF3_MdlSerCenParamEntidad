$(document).ready(function(){
	InitHead();
	InitBtn();
});

function InitHead(){
	try{
		$("#lblTitle").text("Liquidaciones");
		$("#breadcum").click(function(){
			parent.regresarMenuFrecuente();
		});	
	}catch(msg){
		console.log('Error InitHead '+msg);
	}	
}

function InitBtn(){
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
}