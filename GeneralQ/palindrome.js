function isPalindrome(word){
	var length = word.length;
	for(var i = 0; i < Math.floor(length/2);i++){
		if(word[i] === word[length - 1 - i]){
			console.log(word[i]);
			console.log(word[length-1 - i]);
			return false;
		}
	}
	return true;
}

isPalindrome("racecar");