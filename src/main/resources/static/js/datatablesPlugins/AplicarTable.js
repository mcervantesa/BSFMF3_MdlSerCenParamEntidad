function AplicTabl(NameTable){
	
	$('#'+NameTable).dataTable({
	"searching": false,
	"bDestroy": true,
	dom: "<'row'<'col-sm-4'l><'col-sm-4 text-center'B><'col-sm-4'f>/>tp",
	"lengthMenu": [[10, 25, 50, -1], [10, 25, 50, "Todos"]],
	"language": { "url": "js/datatablesPlugins/language_table.js" }

});

$(".even").hover(
		function () {
			$(this).addClass("hoverRow");
		}, function () {
			$(this).removeClass("hoverRow");
		}
	);
	$(".odd").hover(
		function () {
			$(this).addClass("hoverRow");
		}, function () {
			$(this).removeClass("hoverRow");
		}
	);
}
