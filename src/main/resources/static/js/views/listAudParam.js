$(document).ready(function(){
	InitHead("Lista Auditoria Parámetros de Liquidación");//Funcion Gral
	InitTable();
	InitBtn();
});

function InitTable(){
	var urlList=ObtieneContex()+'/FindListAudLiquid';
	$("#divBusqListAudP").load(urlList,{'BSFOPERADOR':''},function(){
		AplicTabl('tblDetallListAud');
	});
}

function InitBtn(){
	try{
		$("#BtnPrint").click(function(){
			var urlPrint =ObtieneContex()+'/PrintListAudLiquid';
			$("#divPrintListAudLiquid").load(urlPrint,{'BSFOPERADOR':''},function(){
				
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
	}catch(msg){ log.error('Error InitBtn '+msg);}
	
	
}