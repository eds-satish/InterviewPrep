import java.util.*;

public class twoSum{
	//should return indices of the two numbers that add up to target
	//Runtime: O(n^2)

	private static int[] sum(int[] numbers, int target){
		int[] res = new int[2];

		for(int i = 0; i < numbers.length; ++i){
			for(int j = i + 1; j < numbers.length; ++j){ //need to take care of array out of bounds error
				if(numbers[i] + numbers[j] == target){	
					res[0] = numbers[i];
					res[1] = numbers[j];
				}
			}
		}
		return res;	
	}

	public static void main(String args[]){
		int[] arr = {2,7,11,15};
		int target = 9;
		optimizeSum(arr,target);
	}
	//REVIEW: More optimal one 
	//http://www.programcreek.com/2012/12/leetcode-solution-of-two-sum-in-java/

	// private static int[] optimizeSum(int[] numbers, int target){
	// 	int[] res = new int[2];
	// 	HashMap<Integer,Integer>map = new HashMap<Integer,Integer>();

	// 	for(int i = 0; i < numbers.length; ++i){
	// 		if(map.containsKey(numbers[i])){
	// 			int index = map.get(numbers[i]);
	// 			res[0] = index+1;
	// 			res[1] = i+1;
	// 			break;
	// 		} else {
	// 			map.put(target-numbers[i],i);
	// 		}
	// 	}
	// 	System.out.println(res[0]);
	// 	return res;

	// }




}