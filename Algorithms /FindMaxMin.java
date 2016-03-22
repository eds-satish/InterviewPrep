import java.io.*;

public class FindMaxMin {
	public static void main(String[] args){
		int[] arr = {4, 3, 5, 1, 2, 6, 9, 2, 10, 11};
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for(int i = 0; i < arr.length; ++i){
			if(arr[i] > max){
				max = arr[i];
			} else {
				min = arr[i];
			}
		}
		System.out.println("maximum = " + max);
		System.out.println("minimum = " + min);

	}



}