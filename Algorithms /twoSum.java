import java.util.*;

public class twoSum{
	//Runtime: O(n^2)
	private static int[] sum(int[] numbers, int target){
		for(int i = 0; i < numbers.length;++i){
			for(int j = 0; j < numbers.length;++j){
				if(nums[j] == target - nums[i]) return new int[] {i,j};
			}
		}
		throw new IllegalArgumentException("no two sum");
		
	}

	public static void main(String args[]){
		int[] arr = {2,7,11,15};
		int target = 9;
		optimizeSum(arr,target);
	}
	




}