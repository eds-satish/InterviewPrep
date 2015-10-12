Array.prototype.sumArray = function(arr){
	var sum = [];
	if(arr !== null && this.length == arr.length){
		for(var i = 0; i < arr.length; i++){
			sum.push(this[i] + arr[i]);
		}
	}
	return sum;
}

var array1 = [1,2,3,4];
var array2 = [5,6,7,8];

var sum = array1.sumArray(array2);
console.log(sum);