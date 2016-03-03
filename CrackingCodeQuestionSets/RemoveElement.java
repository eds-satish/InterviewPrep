import java.lang.*;

public class RemoveElement {

	public static void main(String[] args){
		int[] arr = {2,7,7,4};
		//removeElement(arr,1));
		System.out.println(remove(arr,1));
	}
	public static int[] removeElement(int[] arr, int elem){
		int[] newarr = new int[arr.length-1];
		for(int i = 0; i < arr.length; i++){
			if(arr[i] != elem){
				newarr[i] = arr[i];
			}
		}
		return newarr;
	}

	//TODO: INCORRECT REVIEW
	// //Given an array and a value, remove all instances of that value and return length
	// public static int remove(int[] arr, int elem){
	// 	int i = 0, len = 0;
	// 	while(len < arr.length){
	// 		if(arr[len] != elem){
	// 			arr[i] = arr[len];
	// 			len++;
	// 		}
	// 		i++;//increment to next one
	// 	}
	// 	return len;
	// }

}