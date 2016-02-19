import java.util.*;

public class Permutations {
	//http://algorithms.tutorialhorizon.com/print-all-the-permutations-of-a-string/
	//Take one char at a time and fix it at the pos.(use swap to put every char at the first pos)
	// Make recursive call for rest of characters
	//Use swap to rever the string back to original form for next iteration



	private char[] arrayA;
	
	//helper method used to swap characters
	public static void swap(char[] arr, int i, int j){
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void permutate(char[] arrayA, int left,int size){
		if(left == size){ //" " string case
			for(int i = 0; i < arrayA.length;++i){
				System.out.print(arrayA[i]);
			}
			System.out.print(" ");
		} else {
			for(int x = left; x < size; ++x){
				swap(arrayA,left,x);
				permutate(arrayA,left+1,size); //recursively calls the next 2  and the following 2
				swap(arrayA,left,x);				

			}
		}
	}
	public static void main(String[] args){
		String s = "Tact Coa";
		char[] charArr = s.toCharArray();
		permutate(charArr,0,charArr.length);
	}


}