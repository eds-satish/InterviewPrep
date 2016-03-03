import java.util.*;

public class MergeSort {
	public static void main(String[] args){
		int arr[] = {5,2,1,0,10,15,20,30,25,4};
		mergeSort(arr);
		reverse(arr);
		System.out.println(Arrays.toString(arr)); 
		//or 
		//ArraysUtils.reverse(arr);
	}

	public static void mergeSort(int[] inputArr){
		int size = inputArr.length;
		int mid = size / 2;

		if(size < 2) return; //corner case or else you get forever loop
		
		int leftSize = mid;
		int rightSize = size - mid;

		int[] left = new int[leftSize];
		int[] right = new int[rightSize];

		//copy array contents 
		for(int i = 0; i < mid;++i){
			left[i] = inputArr[i];
		}

		for(int j = mid; j < size; ++j){
			right[j-mid] = inputArr[j];
		}

		mergeSort(left);
		mergeSort(right);

		merge(left,right,inputArr);
		System.out.println(Arrays.toString(inputArr));
	}

	public static void reverse(int[] arr){
		int len = arr.length;
		
		for(int i = 0; i < len/2; ++i){
			int temp = arr[i];
			arr[i] = arr[len-i-1];
			arr[len-i-1] = temp;	
		}
	}

	 


	//helper function to be called recursively
	public static void merge(int[] left, int[] right, int[] resArr){
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < left.length && j < right.length){
			if(left[i] <= right[j]){
				//to improve readibility do a post increment
				resArr[k++] = left[i++];
				//i++; //move onto next index
				//k++; //increase size for next iteration
			} else {
				resArr[k++] = right[j++];
			}
		}
		//take care of left out arrays from either left or right side
		while(i < left.length){
			resArr[k++] = left[i++];
		}
		while(j < right.length){
			resArr[k++] = right[j++];
		}
	}
}