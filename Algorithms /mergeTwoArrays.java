	import java.util.Arrays;

public class mergeTwoArrays{
	//Given two sorted arrays a1, a2. Merge a2 into a1 as one sorted array

	public static int[] merge(int[] a, int[] b){
		int[] result = new int[a.length + b.length];
		int i = 0;
		int j = 0;
		int k = 0;

		while(i<a.length && j<b.length){
			if(a[i] < b[j]){
				result[k] = a[i]; //since it less than append to new array
				i++;//check next a[i]
			}
			else {
				result[k] = b[j];
				j++;
			}
			k++;//increase size of array
		}

		while( i < a.length){
			result[k] = a[i];
			i++;
			k++;
		}

		while(j < b.length){
			result[k] = b[j];
			j++;
			k++;
		}
		return result;
	}

	public static void main(String[] args){
		int[] first_array = {3,6,8,9};
		int[] second_array = {1,2,10};
		System.out.println(Arrays.toString(merge(first_array,second_array)));
	}
}