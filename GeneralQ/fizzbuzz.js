var fuzzfcn = function(num){
	for(var i = 0; i < num; i++){
		if(i % 5 === 0){
			if(i % 3 === 0){
				console.log("Fizzbuzz");
			}
		} else if(i % 5 === 0){
			console.log("Buzz");
		} else if(i % 3 === 0){
			console.log("Fizz");
		} else {
			console.log(i);
		}
	}
};

fuzzfcn(19);