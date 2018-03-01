$(document).ready(function(){
	InitHead("Lista de Auditorías"); //Funcion Gral	
	InitTable();
	InitBtn();
});


function InitTable(){
	AplicTabl('tblListAut');
}

function InitBtn(){
	
	try{
		$("#BtnBack").click(function(){
			var urlAct=ObtieneContex()+'/ListAudLiquid';
			$("#frmBack").attr('action', urlAct);
			$("#frmBack").submit();
		});	
	}catch(msg){
		console.log('Error InitBtn '+msg);	
	}
	
}