//return true if classes match
//return false if class dont match

var addClass = function(el,class){
	var elem_array = document.getElementById(el);
	var boolean = false;
	var elem_classes = el.className.split(" ");

	for(var i = 0; i < elem_classes.length;i++){
		if(class === elem_classes[i]){
			boolean = true;
		}
	}
	if(boolean === false){
		elem.className += " " + class; 
	}


}