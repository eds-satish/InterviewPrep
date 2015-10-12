//returns a index of an given element in a string

function findIndexOf(){
	if(typeof Array.prototype.indexOf == 'undefined'){
		Array.prototype.indexOf = function(object){
			for(var i = 0, length = this.length; i < length;i++){
				if(this[i] == object){
					return i;
				}
			}
			return -1;
		};
	}
	var myArray = ['elm1','elm2','elm3'];
	console.log(myArray.indexOf('elm3'));
}

console.log(findIndexOf());