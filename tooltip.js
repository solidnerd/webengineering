var messageCount=0;

$(document).ready(onReady);

function onReady(){
	$("input").powerTip({placement:'n'});
	$("textarea").powerTip({placement:'n'});
	$("textarea").keyup(function(){
		if(messageCount < 160){
			messageCount = $(this).val().length;
			$("#textareacounter").html("Counter:"+messageCount);
		}
	});
}

$("#reset").click(function(){
	$("#textareacounter").html("Counter:0");
	messageCount = 0;
});



