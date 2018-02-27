$(document).ready(function(){
	InitHead();
});

function InitHead(){
	try{
		$("#lblTitle").text("Cheques");
		$("#breadcum").click(function(){
			parent.regresarMenuFrecuente();
		});	
	}catch(msg){
		console.log('Error InitHead '+msg);
	}	
}