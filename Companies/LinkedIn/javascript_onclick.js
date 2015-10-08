// http://imgur.com/iVi7UwY
/

function(){

	var popUp = document.getElementsByClass('hide-data');
	var link = document.getElementById('network-updates').children[0];

	link.addEventListener("mouseover", (function(event) {
		popUp.className += "show";
	}

	link.addEventListener("mouseout", (function(event) {
		if(popUp.className.contains('show') && !(popUp.mouseover)){
			popUp.className = classes.substring(0, 'show');
		}
	}))

}))


<!-- css -->

.hide-data {
	display:none;
}

.hide-data.show {
	display:block;
}

.hide-data.noshow {
	display:none;
}
