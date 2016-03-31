import java.util.*;

public class findDuplicate {
	//first method find the duplicated NUMBERS!!! and returns it
	//Runtime: O(n^2)
	private static ArrayList<Integer> findNum(int[] arr){
		ArrayList<Integer>arrList = new ArrayList<Integer>();
		//check for null case
		if(arr.length == 0 || arr == null) throw new IllegalArgumentException("Invalid array");

		for(int i = 0; i < arr.length;++i){
			boolean foundNum = false;
			for(int j = i + 1; j < arr.length; ++j){
				if(arr[i] == arr[j]) foundNum = true;
				
			}
			if(foundNum) arrList.add(arr[i]);
		}
		return arrList;
	}

	//ONE DUPLICATE NUMBER
	/*
	public class Solution {
	    public static void main(String[] args){
	        int[] arr = {1,1,2};
	        System.out.println(findDuplicate(arr));
	    }
	    public static int findDuplicate(int[] nums) {
	        int result = 0;
	        for(int i = 0; i < nums.length; ++i){
	            for(int j = i + 1; j < nums.length; ++j){
	                if(nums[i] == nums[j]){
	                    result = nums[i];
	                }
	            }
	        }
	        return result;
	    }
	}
	*/

	//second method returns a boolean if found or not
	//Runtime: O(n) 
	private static boolean findDuplicateNum(int[] arr){
		Set<Integer>set = new HashSet<Integer>();

		if(arr.length == 0 || arr == null) return false;

		for(int i: arr){
			if(set.contains(i)) return true;
			set.add(i);
		}
		return false;
	}

	public static void main(String[] args){
		int[] arr = {1,2,9,5,5,1,2,6,8,9};
		System.out.println(findNum(arr));
	}
}