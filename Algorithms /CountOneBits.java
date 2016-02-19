//Write a function that takes an unsigned integer and returns the number of '1' bits it has.
public class CountOneBits {
	public static int hammingWeight(int number){
		int count = 0; 
		while(number != 0){
			number = number & (number-1); //convert bits to 1
			count++;
		}
		return count;
	}
	public static void main(String[] args){
		int number = 11;
		System.out.println(hammingWeight(number));
	}
}