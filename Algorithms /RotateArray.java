/*
 * Rotate an array of n elements to the right by k steps.
 */
import java.util.*;
public class RotateArray{
	//divde the array into 2 parts
	public static int[] rotate(int[] arr, int order){
		order = order % arr.length; 

		if(arr == null){
			throw new IllegalArgumentException("Illegal argument");
		}

		int firstPart = arr.length - order;

		rotateHelper(arr,0,firstPart-1); //rotate first part, -1 since were dealing with indexes
		rotateHelper(arr,firstPart,arr.length-1); //rotate second part, -1 to catch off by one error bug
		rotateHelper(arr,0,arr.length-1); //rotate whole array

		return arr;

	}
	public static void rotateHelper(int[] arr, int left, int right){
		if(arr == null || arr.length == 1) return;

		while(left < right){
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}

	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(RotateArray.rotate(arr,3)));
	}

}
