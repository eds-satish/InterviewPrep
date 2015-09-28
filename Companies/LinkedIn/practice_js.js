/* Write a class function in native (non-jquery) Javascript */
/*
<div id="changeme" class="big red"></div>

<button onclick="addClass('changeme', 'round')">Add a class</button>

function addClass(id, new_class){
	var n = 0;

	new_class = new_class.split(",");

	for(var i = 0; i < new_class.length;i++){
		if((" ")+document.getElementById(id).className + "").indexOf(" " + new_class[i] + " ") === -1){
			document.getElementById(id).className += " " + new_class[i];
			n++
		}
		return n;
	}
}*/


/* Creation a functon that compares 2 objects (deep equal) */

/* Strict equality === 
 * only true if the operands are of same type
 * no type conversion
 */

/* Loose equality ==
 * converts the operands if they are not of same type, then applies strict 
 */ 

function cmp(a,b){
	if (a === b){
		return true;
	}
	else {
		return false;
	}
}

console.log("2 = 3 is " + cmp(2,3));
console.log("2 = 2 is " + cmp(2,2));



/* Write a function that returns true or false when finding a substring in a string */




