//4 ways to do it 
	//loop
	//constructor
	//slice/splice
	//concat

	//slice
	// to make an independent copy of an array rather than a copy
	// of the reference to it, you can use the array slice-method
	var dup_array = original_array.slice();
	//loop

	for(var i = 0, len = original_array.length; i < len; i++){
		dup_array[i] = original_array[i];
	}

	//duplicate([1,2,3,4,5]); // [1,2,3,4,5,1,2,3,4,5]

Array.prototype.duplicate = function(){
	var len = this.length;
	for(var i = 0; i < len; i++){
		this[len + i] = this[i];
	}
	return this;
}

Array.prototype.duplicate = function(){
	var array = this;
	return array.concat(array);
}

