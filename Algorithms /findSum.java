import java.util.*;

class findSum {

	public static void main(String[] args){
		int[] array = {2,6,3,9,11};
		int sum = 9;
		printPairs(array,sum);
	}


	public static void printPairs(int[] array, int sum){ //its On^2 want On
		for(int i = 0; i < array.length;i++){
			int first = array[i];
			for(int j = i+1; j < array.length;j++){
				int second = array[j];
				if((first + second) == sum){
					System.out.printf("(%d, %d) %n", first,second);
				}
			}
		}
	}

	public static void optimizePairs(int[] array, int sum){
		if(array.length < 2){
			return; 
		}
		Set set = new HashSet(array.length);

		for(int value: array){
			//target word is sum - value
			//check to see if the set doesnt contain so add 
			//else print

		}
	}


}