public class fuzzbuzz {
	public static void fuzzMethod(int num){
		if(num % 5 == 0){
			if(num % 3 == 0){
				System.out.println("Fuzzbuzz");
			}
		} else if(num % 3 == 0){
			System.out.println("Fizz");
		} else if(num % 5 == 0){
			System.out.println("Buzz");
		}
	}
	public static void main(String[] args){
		int num = 30;
		System.out.println(fuzzMethod(30));
	}
}