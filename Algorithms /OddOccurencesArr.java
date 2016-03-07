//Given a array of inte­gers, in which every ele­ments occurs even num­ber of times except one 
//num­ber which occurs add num­ber of times. Find out that number.
import java.util.*;

public class OddOccurencesArr {
	public static void main(String[] args){
		int[] A = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 6, 6, 6, 6, 7, 7 };
		System.out.println("Number that appears odd times: " + oddOccurences(A));
	}

	//scratch out hashmap and think xor! 
	public static int oddOccurences(int[] arr){
		//numbers appearing even times will scratch out and odd ones will pop out
		int res = 0;
		for(int i = 0; i < arr.length; i++){
			res =  res ^ arr[i];
		}
		return res;
	}

}