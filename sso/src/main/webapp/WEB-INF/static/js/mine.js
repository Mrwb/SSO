var wHei = $(window).height();
$('.main-content').css({
	'min-height':wHei-160
});
$('.full-page').css({
	'min-height':wHei-84
})


$('.toggle-btn').click(function(ev){
	ev.stopPropagation();
	var _this = $(this);
	_this.closest('.menu-right').toggleClass('on');
});
$(document).click(function(){
    $('.menu-right').removeClass('on');
    $('.s-2 ul > li').removeClass('on');
    $('.showOption').parent().removeClass('select-down');
});


$('.showOption').click(function(ev){
	ev.stopPropagation();
	$(this).parent().addClass('select-down').siblings().removeClass('select-down');
	$('.m-2-select > ol > li').click(function(ev){
	 //ev.stopPropagation();
		var result= $(this).text();
		$(this).closest('.m-2-select').find('.showOption').text(result);
		//$(this).closest('.m-2-select').find('ol').hide();
	})

})
/*$('#side-menu > li').hover(function(){
	$(this).addClass('current').siblings().removeClass('current');
})*/
$('.administration').click(function(ev){
	ev.stopPropagation();
	var _this = $(this);
	_this.toggleClass('on');
});
$('.checkThis').click(function(ev){
	ev.stopPropagation();
	var _this = $(this);
	_this.parent().toggleClass('on');
});