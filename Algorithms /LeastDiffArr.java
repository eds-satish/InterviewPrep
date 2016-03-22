import java.util.*;
import java.io.*;

/*
 * Problem: Find the least difference between any two 
 * elements of an integer array.
 * Solution: Sort Array, compare values through loop.
 */ 

public class LeastDiffArr {
	public static int leastDiff(int[] arr){
		Arrays.sort(arr);
		int min = Integer.MAX_VALUE;
		for(int i = arr.length-1; i > 0; --i){
			int new_diff = arr[i] - arr[i-1];
			if(new_diff < min) min = new_diff;
		}
		return min;
	}
	public static void main(String[] args){
		int[] arr = {64,57,2,78,43,73,53,86};
		leastDiff(arr);
	}
}