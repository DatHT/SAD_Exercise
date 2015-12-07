var count = 1;
var item = 0;
//-----------Add new input search-------------
$(document).ready(function(){
	$('#btn-plus-search').click(function() {
		var input = '<input type="search" name="" id="input-search'+count+'"class="form-control input-lg" value="" title="" placeholder="Nguyên liệu">';
		$('#btn-plus-search').before(input);
		count++;
		if (count >= 5) {
			$('#btn-plus-search').hide();
		}
	});
});
//---------End Add new input search------------

//--------------Ajax load result---------------
function ajax_loading(item){
	var searchStr="";
        for(var i=0;i<count;i++){
        	searchStr+=$("#input-search"+i).val();
        	if (i!=count-1) {
        		searchStr+="+";
        	};
        }

        
    $.ajax({
        type: "GET",
        url: "/getAllNews",
        //data: "{}",
        //contentType: "application/json; charset=utf-8",
        dataType:"json", 
        success: function(result) {
        	//alert("Success!");
//        	alert(result);
        	var resultObj = result;
//        	alert(result.length);
            var html="";
            $.each (resultObj, function (key, item){
            	html+='<li class="list-group-item">';
            		html+='<h3>'+resultObj.Title+'</h3>';
            		html+='<p>'+resultObj.HighLight+'</p>';
            	html+='</li>';
            });
            $('#search-result').html(html);
        },
        error: function(jqXHR, textStatus, ex) {
            alert(textStatus + "," + ex + "," + jqXHR.responseText);
        }
    });
}

$(window).load(function(){
	load_category();
});

function load_category(){
	$.ajax({
        type: "GET",
        url: "getCategories",
        //data: "{}",
        //contentType: "application/json; charset=utf-8",
        dataType:"json", 
        success: function(result) {
        	var resultObj = result;
        	console.log(result.categoryName);
            var html="";
            $.each (resultObj, function (key, item){
            	html+='<li role="presentation"><a role="menuitem" tabindex="-1" href="#">'+resultObj.categoryName+'</a></li>';
            });
            $('#category').html(html);
        }
	});
}
//-----------End Ajax load result--------------

//---------Ajax load result when click---------
$("#search-button").click(function(){
        item=0;
        ajax_loading(item);
});
//-----------End Ajax load result--------------

//---------Ajax load result when scroll--------
$(document).scroll(function()
{
    if(($(window).scrollTop() == $(document).height() - $(window).height())&& $("#check-search").val() == "off")
    {
        $('#loading').html("<img src='resources/user_page/images/loading.gif'/>").fadeIn('fast');
        item=item+13;
        ajax_loading(item);
    }
});
//-----------End Ajax load result--------------
