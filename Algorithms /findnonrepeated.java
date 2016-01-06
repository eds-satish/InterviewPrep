//Find the first non-repeated element in an unsorted array
public class findnonrepeated {
	public static int firstNonRepeated(int[] arr){
		for(int i = 0; i < arr.length; ++i){
			boolean foundDuplicate = false;
			for(int j = 1; j < arr.length && !foundDuplicate;++j){
				if(i != j)
					foundDuplicate = arr[j] == arr[i];
			}
			if(!foundDuplicate) 
				return arr[i];
		}
		return -1;
	}

	public static void main(String[] args){
		int[] arr = {1,1,1,2};
		int[] arr2 = {4,4,3,2,3,5};
		System.out.println(firstNonRepeated(arr2));
	}
}

//to find 2 repeated duplicated elemes
// to approaches
// 1) 2 for loops inner loop check if arr[i] == arr[j] and return arr[i], O(n^2)
// 2) 1 loop have a int count[]
	// if count[arr] == 1 return arr[i] else count[arr]++