//***************************************************************************************************************************************
//NOTA:
//Para utilizar este archivo se debe poner una imagen en la ruta "static/img" el nombre de la imagen es "messages-g.png"
//Para que puedan usar el loading se tiene que poner la siguientes lienas en el head
//<link rel="stylesheet" th:href="@{/css/primefaces.css}" />
//<link rel="stylesheet" th:href="@{/css/base.css}" />
//<link th:href="@{/css/bootstrap.min.css}" rel="stylesheet" />
//<script th:src="@{/js/jquery-3.1.1.min.js}"></script>
//<script th:src="@{/js/bootbox.min.js}"></script>
//<script th:src="@{/js/bootstrap.min.js}"></script>
//<script th:src="@{/js/page/bootboxOWN.js}"></script>
//
//***************************************************************************************************************************************
var bootbox_loading;
var _nomPath;
var _warning = "-224px 0px -265px 0px";
var _error = "-391px 0px -90px 0px";
var _ok = "-9px 0px -470px 0px";
var _info = "-305px 0px -176px 0px";
var _not = "-473px 0px -8px 0px";
var _aux1 = '<p style="overflow: hidden; float: left; margin-left: 5%;"><img style="margin: ';
var _aux2 = "";
var _message;
// ########################################################################################################################################################
// init Docunemt ready
// ########################################################################################################################################################
$(document).ready(function() {
    // ========================================================================================================================================================
    // Obtener contexto
    // ========================================================================================================================================================
    _nomPath = window.location.pathname;
    _nomPath = _nomPath.substring(1, _nomPath.length);
    _nomPath = _nomPath.split("/", 1);
    _nomPath = _nomPath + "/";

    _aux2 = ';" src="/' + _nomPath + 'img/messages-g.png" /></p>';
    $(".img_ok").each(function() {
	$("#" + this.id).attr("src", "/" + _nomPath + "img/messages-g.png");
    });
});

// ########################################################################################################################################################
// FIN Docunemt ready
// ########################################################################################################################################################
function _loading(textShow) {
    if (typeof textShow === 'undefined') {
	textShow = "Cargando su petición";
    }
    var msg = '<div class="ui-dialog-content ui-widget-content"style="text-align: center">' + '<div class="progress-container"><div class="progress" style="height: 10px"><div class="progress-bar">'
	    + '<div class="progress-shadow">' + '</div></div></div></div><br/>' + '<label class="ui-widget ui-state-default ui-corner-all">' + textShow + '</label></div>';
    bootbox_loading = bootbox.dialog({
	message : msg,
	closeButton : false
    }).css({
	'top' : '50%',
	'margin-top' : function() {
	    return -(($(this).height() / 2));
	}
    });
}
function Mensaje(textShow, tipo, callback) {
    if (typeof tipo === 'undefined' || tipo === null) {
	tipo = "warning";
    }
    if (typeof textShow === 'undefined' || textShow === null) {
	textShow = '</br>Coloca tu texto en el primer parametro</br>';
    }
    var textShowAux = '<center>' + textShow + '</center>';
    switch (tipo) {
    case "warning":
	_message = _aux1 + _warning + _aux2 + textShowAux;
	break;
    case "error":
	_message = _aux1 + _error + _aux2 + textShowAux;
	break;
    case "ok":
	_message = _aux1 + _ok + _aux2 + textShowAux;
	break;
    case "info":
	_message = _aux1 + _info + _aux2 + textShowAux;
	break;
    case "not":
	_message = _aux1 + _not + _aux2 + textShowAux;
	break;
    default:
	_message = _aux1 + _warning + _aux2 + textShowAux;
	break;
    }
    bootbox.alert({
	// size : "small",
	message : _message,
	callback : function() {
	    if (typeof callback === 'function') {
		// Es seguro ejecutar la función
		callback();
	    }
	}
    }).css({
	'top' : '50%',
	'margin-top' : function() {
	    return -(($(this).height() / 2));
	}
    });
}

function _confirm(textShow, tipo, callback) {
    if (typeof tipo === 'undefined' || tipo === null) {
	tipo = "warning";
    }
    if (typeof textShow === 'undefined' || textShow === null) {
	textShow = '</br>Coloca tu texto en el primer parametro</br>';
    }
    var textShowAux = '<center>' + textShow + '</center>';
    switch (tipo) {
    case "warning":
	_message = _aux1 + _warning + _aux2 + textShowAux;
	break;
    case "error":
	_message = _aux1 + _error + _aux2 + textShowAux;
	break;
    case "ok":
	_message = _aux1 + _ok + _aux2 + textShowAux;
	break;
    case "info":
	_message = _aux1 + _info + _aux2 + textShowAux;
	break;
    case "not":
	_message = _aux1 + _not + _aux2 + textShowAux;
	break;
    default:
	_message = _aux1 + _warning + _aux2 + textShowAux;
	break;
    }
    bootbox.confirm({
	// size : "small",
	message : _message,
	buttons : {
	    confirm : {
		label : 'Ok',
	     className : ''
	    },
	    cancel : {
		label : 'Cancelar',
	     className : ''
	    }
	},
	callback : function(result) {
	    // console.log("aceptar");
	    if (typeof callback === 'function') {
		// Es seguro ejecutar la función
		callback(result);
	    }
	}
    }).css({
	'top' : '50%',
	'margin-top' : function() {
	    return -(($(this).height() / 2));
	}
    });
}
