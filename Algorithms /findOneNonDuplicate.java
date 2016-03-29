//Given an array of integers, every elements appears twice except for one. Find that single one
//LOGIC: use bitwise operators to find it 
//UBER INTERVIEW QUESTION
import java.util.*;
public class findOneNonDuplicate {
	public static int findUnique(int[] arr){
		int x = 0;
		for(int i:arr){ //XOR will return 1 only on two different bits. So if two numbers are the same, it will return 0.
			System.out.println("x is: " + x + " i is: " + i);
			x = x ^ i;
			System.out.println("final x is: " + x);
		}
		return x;
	}
	public static void main(String[] args){
		int arr[] = {1,1,3};
		System.out.println(findUnique(arr));
	}
}