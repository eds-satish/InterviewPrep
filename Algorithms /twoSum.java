public class twoSum{
	//should return indices of the two numbers that add up to target
	public static int[] sum(int[] numbers, int target){
		int[] arr = new int[2];
		for(int i = 0; i<numbers.length;i++){
			for(int j = i+1;j<numbers.length;j++){
				System.out.println("Numbers i" + numbers[i]);
				System.out.println("Numbers j" + numbers[j]);
				if(numbers[i] + numbers[j] == target){	
					arr[0] = numbers[i];
					arr[1] = numbers[j];
				}
			}
		}
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		return arr;	
	}

	public static void main(String args[]){
		int[] arr = {2,7,11,15};
		int target = 26;

		sum(arr,target);
	}

 	public static int[] optimizeSum(int[] numbers, int target){
 		HashMap<Integer,Integer>map = new HashMap<Integer,Integer>();
 		int[] result = new int[2];
 		for(int i = 0; i < numbers.length;i++){
 			if(map.containsKey(numbers[i])){
 				int index = map.get(numbers[i]);
 				result[0] = index+1;
 				result[1] = i+1;
 				break;
 			}
 			else {
 				map.put(target - numbers[i], i);
 			}
 		}
 		return result;
 	}



}