$(document).ready(function(){
	InitHead();
});

function InitHead(){
	try{
		$("#lblTitle").text("Acuerdos");
		$("#breadcum").click(function(){
			parent.regresarMenuFrecuente();
		});	
	}catch(msg){
		console.log('Error InitHead '+msg);
	}
	
}