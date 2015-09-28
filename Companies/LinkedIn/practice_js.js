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

/* How would you compare two objects in Javascript? 
 * 2 ways to test equality for Strings and numbers
 * its tested by comparing values, while objects 
 * are compared by their reference. 
 */ 

 function isEqual(a,b){
 	var aProperty = Object.getOwnPropertyNames(a),
 		bProperty = Object.getOwnPropertyNames(b);

 	if(aProperty.length != bProperty.length){
 		return false;
 	}

 	for( var i = 0; i < aProperty.length; i++){
 		var propName = aProperty[i];

 		if(a[propName] !== b[propName]){
 			return false;
 		}
 	}
 	return true;
 }

 /* Reverse a string in Javascript */ 
 function reverse(s){
 	var new_str = '';
 	for(var i = s.length - 1; i >= 0; i--){
 		new_str += s[i];
 	}
 	return new_str;
 }

 function reverse(s){
 	return s.split('').reverse().join('');
 }



/* Write a function that returns true or false when finding a substring in a string */




