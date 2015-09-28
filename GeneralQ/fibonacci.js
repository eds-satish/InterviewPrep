var fibo_recursive = function(n){
	if(n < 2){ 
		return 1; 
	} else{
		return fibo_recursive(n-1) + fibo_recursive(n-2);
	}
};


var fibo_iterative = function(n){
	var first_num = 0;
	var sec_num = 1;
	for(var i = 0; i < n; i++){
		first_num = first_num + sec_num;
		sec_num = first_num;
	}
	return sec_num;
};

fibo_recursive(18);
for(var x = 0; x < 18; x++){
	console.log(fibo_recursive(x));
}

//recursive fibonacci = 2^n since you call T twice