

// ISOTOPE FILTER

jQuery(document).ready(function($){

	if ( $('.iso-box-wrapper').length > 0 ) { 

	    var $container 	= $('.iso-box-wrapper'), 
	    	$imgs 		= $('.iso-box img');



	    $container.imagesLoaded(function () {

	    	$container.isotope({
				layoutMode: 'fitRows',
				itemSelector: '.iso-box'
	    	});

	    	$imgs.load(function(){
	    		$container.isotope('reLayout');
	    	})

	    });

	    //filter items on button click

	    $('.filter-wrapper li a').click(function(){

	        var $this = $(this), filterValue = $this.attr('data-filter');

			$container.isotope({ 
				filter: filterValue,
				animationOptions: { 
				    duration: 750, 
				    easing: 'linear', 
				    queue: false, 
				}              	 
			});	            

			// don't proceed if already selected 

			if ( $this.hasClass('selected') ) { 
				return false; 
			}

			var filter_wrapper = $this.closest('.filter-wrapper');
			filter_wrapper.find('.selected').removeClass('selected');
			$this.addClass('selected');

	      return false;
	    }); 

	}

});


// MAIN NAVIGATION

 $('.main-navigation').onePageNav({
        scrollThreshold: 0.3, // Adjust if Navigation highlights too early or too late
        scrollOffset: 75, //Height of Navigation Bar
        filter: ':not(.external)',
        changeHash: true
    }); 

    /* NAVIGATION VISIBLE ON SCROLL */
    mainNav();
    $(window).scroll(function () {
        mainNav();
    });

    function mainNav() {
        var top = (document.documentElement && document.documentElement.scrollTop) || document.body.scrollTop;
        if (top > 5) $('.sticky-navigation').stop().animate({
            "opacity": '1',
            "top": '0'
        });
        else $('.sticky-navigation').stop().animate({
            "opacity": '0',
            "top": '-75'
        });
    }



// HIDE MOBILE MENU AFTER CLIKING ON A LINK

    $('.navbar-collapse a').click(function(){
        $(".navbar-collapse").collapse('hide');
    });
    
//动画
    	function kaishiZoomIn() {
		 
    
		setTimeout(function () { 
			$('.sm1').show();//显示,参数说明同上
			$('.sm2').show();//显示,参数说明同上
			$('.tm-home-subtitle').show();
			
       $('.sm1').addClass('animated fadeInUpBig');
    $('.sm2').addClass('animated fadeInUpBig');
    $('.tm-home-subtitle').addClass('animated fadeInRightBig');
    setTimeout(function(){
    	$('.kaishi').show();//显示,参数说明同上
    	$('.kaishi').addClass('animated bounceIn');
  	$('.tm-home-title').removeClass('animated fadeInDownBig');
    	$('.tm-home-title').addClass('animated bounceIn');
    	$('.tm-home-subtitle').removeClass('animated fadeInDownBig');
    	$('.tm-home-subtitle').addClass('animated bounceIn');
    	
    },1000);
    }, 500);
	}
    	$('.kaishi').hide();//显示,参数说明同上
     $('.sm1').hide();//显示,参数说明同上
			$('.sm2').hide();//显示,参数说明同上
			$('.tm-home-subtitle').hide();
    	
    $('.tm-home-title').addClass('animated fadeInLeftBig');
    
    //
   
			
    $('tm-home-title').one('webkitAnimationEnd mozAnimationEnd MSAnimationEnd oanimationend animationend', kaishiZoomIn());
   
   
    //
   
    
