var fuzzbuzz = function(num){
	for(var i = 0; i < num;i++){
		if(i % 5 === 0){
			if(num % 3 === 0){
				console.log("Fuzzbuzz");
			}
		} else if(i % 5 === 0){
			console.log("Buzz");
		} else if(i % 3 === 0){
			console.log("Fuzz");
		} else {
			console.log(i);
		}
	}
};

fuzzbuzz(20);