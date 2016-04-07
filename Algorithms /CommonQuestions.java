public class CommonQuestions {
	public static void main(String[] args){
	}


	//Check if its prime, any number divisible by 1 or itself
	public static boolean isPrime(int n){
		if(n < 2) return false;
		int sqrt = (int)Math.sqrt(n)+1;
		
		for(int i = 2; i < sqrt;++i){
			if(n % i == 0) return false; //number is perfectly divisible - no prime
		}
		return true; 
	}
	//Reverse Integer with library method
	public static int reverseInteger(int num){
		if(num == 0 || num == Integer.MIN_VALUE) return 0;

		boolean isNegative = num < 0 ? true : false;

		if(isNegative) num = -1 * num;

		long reverse = 0;
		int lastDigit = 0;

		while(num != 0){
			lastDigit = num % 10; //gives you last digit 
			reverse = reverse * 10 + lastDigit; //pattern is reverse * 10
			num = num / 10; //get rid of last number
		}

		if(isNegative != true){
			return reverse > Integer.MAX_VALUE ? 0 : (int)reverse;
		} else {
			reverse = reverse * -1;
			return reverse < Integer.MIN_VALUE ? 0 : (int)reverse;
		}

	}
	//Power of Two
	public static boolean powerTwo(int n){
		while(n % 2 == 0 && n > 1){
			n = n / 2;
		}
		return n == 1;
	}
	//Power of Three
	public static boolean powerThree(int n){
		while(n % 3 == 0 && n > 1){
			n = n / 3;
		}
		return n == 1;
	}
	//Fibonacci 
	public static void fuzzbuzz(int num){
		if(num % 5 == 0){
			if(num % 3 == 0){
				System.out.println("FuzzBuzz");
			}
		}
		else if(num % 3 == 0) System.out.println("Fuzz");
		else if(num % 5 == 0) System.out.println("Buzz");
	}

}