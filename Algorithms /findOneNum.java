/*Given an array of numbers nums, in which exactly two elements appear only once and 
all the other 
elements appear exactly twice. Find the two elements that appear only once.

For example:

Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].

Note:
The order of the result is not important. So in the above example, [5, 3] is also correct.
Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?
*/ 


import java.util.*;
public class findOneNum{
	public static List<Integer> singleNumber(int[] nums) {

		List<Integer>result = new ArrayList<Integer>();
		Map<Integer,List<Integer>>map = new HashMap<Integer,List<Integer>>();
		Map<Integer,Integer>secondMap = new HashMap<Integer,Integer>();


		if(nums == null || nums.length == 0){
			throw new IllegalArgumentException("no num");
		}

		for(int i = 0; i < nums.length;i++){
			if(!map.containsKey(nums[i])){ //if the map doesnt have the list of values in keys
				List<Integer>currentValue = new ArrayList<Integer>(); //making a list because map asks for that
				currentValue.add(nums[i]);  //add each invidiual key to list
				map.put(nums[i],currentValue); //for each key append list of values
				secondMap.put(nums[i],1); //1 -> 1 //it appears once
			}else {
				secondMap.put(nums[i],secondMap.get(nums[i])+1);
				//map.get(nums[i]).add(nums[i]);
			}
		}

		for(Integer key: secondMap.keySet()){
			if(secondMap.get(key) == 2){
				result.add(key);
			}
		}
		return result;
	}

	public static void main(String[] args){
	    int[] myArray = {1,2,1,2,3,5};
	    System.out.println(singleNumber(myArray));
  	}	




}