$(document).ready(function(){
	InitHead();
	InitBtn();
});

function InitHead(){
	try{
		$("#lblTitle").text("Pasivo Prioridades Cargos");
		$("#breadcum").click(function(){
			parent.regresarMenuFrecuente();
		});	
	}catch(msg){
		console.log('Error InitHead '+msg);
	}	
}

function InitBtn(){
	
}
