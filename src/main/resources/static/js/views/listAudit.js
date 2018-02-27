$(document).ready(function(){
	InitHead();	
	InitTable();
	InitBtn();
});

function InitHead(){
	try{
		$("#lblTitle").text("Lista de Auditorías");
		$("#breadcum").click(function(){
			parent.regresarMenuFrecuente();
		});	
	}catch(msg){
		console.log('Error InitHead '+msg);
	}	
}

function InitTable(){
	AplicTabl('tblListAut');
}

function InitBtn(){
	$("#BtnBack").click(function(){
		var urlAct=ObtieneContex()+'/ListAudLiquid';
		$("#frmBack").attr('action', urlAct);
		$("#frmBack").submit();
	});
}