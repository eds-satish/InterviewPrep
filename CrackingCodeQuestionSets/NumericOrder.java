/* 
 * Sort the following list in numeric order:
 *
 * 1,10,5,63,29,71,10,12,44,29,10,-1
 *
 */
import java.util.*;
public class NumericOrder {
	public static int[] mergeSort(int[] arr){
		int len = arr.length;
		int midPoint = len / 2;

		if(len < 2) return arr; //catch forever loop

		int leftLen = midPoint;
		int rightLen = len - midPoint;

		int[] leftArr = new int[leftLen];
		int[] rightArr = new int[rightLen];

		for(int i = 0; i < midPoint; ++i){
			leftArr[i] = arr[i]; //copy contents of array until midPoint
		}
		for(int j = midPoint; j < len; ++j){
			rightArr[j-midPoint] = arr[j]; //copy contents of array until end
		}
		//recursively called mergeSort on left and right
		System.out.println("leftArr is: " + Arrays.toString(leftArr));
		System.out.println("rightArr is: " + Arrays.toString(rightArr));
		mergeSort(leftArr);
		mergeSort(rightArr);
		//called a helper function to do the merge part
		merge(leftArr,rightArr,arr);
		return arr;
	}
	public static void merge(int[] left, int[] right, int[] res){
		int i = 0;
		int j = 0;
		int k = 0;

		while(i < left.length && j < right.length){
			System.out.println("1");
			if(left[i] < right[j]){
				res[k++] = left[i++]; //increase size of k and left move onto next index
			} else {
				res[k++] = right[j++]; //right is smaller than left
			}
		}
		//do again for left and right side
		while(i < left.length){
			System.out.println("2");
			res[k++] = left[i++];
		}
		while(j < right.length){
			System.out.println("3");
			res[k++] = right[j++];
		}
		System.out.println("res is" + Arrays.toString(res));
	}

	public static void main(String[] args){
		int[] arr = {1,10,5,63,29,71,10,12,44,29,10,-1};
		int[] test_arr = {6,5,3,1,8,7,2,4};
		System.out.println(Arrays.toString(mergeSort(test_arr)));
	}

}