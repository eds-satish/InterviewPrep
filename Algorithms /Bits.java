public class Bits {
	//Flip Bit to Win - You have an integer and you can flip exactly 1 bit from 0 to a 1. Write code to find the length
	//of the longest sequence of 1s you could create.

	//Write a funcion that takes an unsigned integer and returns the number of '1' bits it has
	public static int hammingWeight(int num){
		int count = 0;
		while(num != 0){
			num = num & (num - 1); //count the number of times it takes to get to 0
			count++;
		}
		return count;
	}

	public static void main(String[] args){
		int num = 11;
		System.out.println(hammingWeight(11));
	}

}