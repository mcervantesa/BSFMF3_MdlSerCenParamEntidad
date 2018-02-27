$(document).ready(function(){
	InitHead();
	InitTable();
	InitBtn();
});

function InitHead(){
	try{
		$("#lblTitle").text("Lista Auditoria Parámetros de Liquidación");
		$("#breadcum").click(function(){
			parent.regresarMenuFrecuente();
		});	
	}catch(msg){
		console.log('Error InitHead '+msg);
	}	
}
function InitTable(){
	var urlList=ObtieneContex()+'/FindListAudLiquid';
	$("#divBusqListAudP").load(urlList,{'bsfOper':''},function(){
		AplicTabl('tblDetallListAud');
	});
}

function InitBtn(){
	
	$("#BtnPrint").click(function(){
		var urlPrint =ObtieneContex()+'/PrintListAudLiquid';
		$("#divPrintListAudLiquid").load(urlPrint,{'bsfOper':''},function(){
			
		});
	});
	
	$("#BtnBack").click(function(){
		var urlAct=ObtieneContex()+'/liquidaciones';
		$("#frmBack").attr('action', urlAct);
		$("#frmBack").submit();
	});
	
	$("#BtnVer").click(function(){
		var urlAct=ObtieneContex()+'/ListAudit';
		$("#frmBack").attr('action', urlAct);
		$("#frmBack").submit();
	});
	
}