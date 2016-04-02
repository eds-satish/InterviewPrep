import java.util.*;
public class ArrayPractice {
	public static void main(String[] args){
		int[] arr = {2,2,7,44444444,222,42143124,1112,2};
		System.out.println(retLen(arr,2));
	}

	//Remove an provided element in array
	public static ArrayList<Integer> removeDuplicate(int[] arr, int value){
		ArrayList<Integer>res = new ArrayList<Integer>();
		for(int i = 0; i < arr.length;++i){
			if(value != arr[i]){
				res.add(arr[i]);
			} 
		}
		return res;
	}
	//Given an array and a value, remove all instances of that value and return length
	public static int retLen(int[] arr, int value){
		ArrayList<Integer>res = new ArrayList<Integer>();

		for(int i = 0; i < arr.length;++i){
			if(value != arr[i]) res.add(arr[i]);
		}
		return res.size();
	}

	

}