import java.util.*;

public class findLargestValueInArray {
	
	public static int findMax(int[] input){
		int max_value = INTEGER.MIN_VALUE;

		for(int i = 0; i < input.length;i++){
			if(input[i] > max_value){
				max_value = input[i];
			}
			return max_value;
		}
	}
}