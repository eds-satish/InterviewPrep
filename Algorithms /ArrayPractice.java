import java.util.*;
public class ArrayPractice {
	public static void main(String[] args){
		int[] arr1 = {1, 2, 3, 5}; 
		int[] arr = {2147483647, 40, 2147483647};

		int missing = findMissingNum(arr, 5);
		//System.out.printf("Missing number in array %s is %d %n", 
                           //Arrays.toString(arr), missing);

		int[] input = {1,4,1,2,5,4,2,3,100,2144,2,};
		System.out.println(removeDuplicates(input));

	}

	//Recursive Factorial
	public static int recursive_factorial(int number){
		if(number <= 1) return 1;

		else return number * recursive_factorial(number - 1);
	}
	//Iterative factorial
	public static int iterative_factorial(int number){
		int res = 1;
		while(number != 0){
			res = res * number;
			number--;
		}
		return res;
	}

	//Remove an provided element in array
	public static ArrayList<Integer> removeDuplicate(int[] arr, int value){
		ArrayList<Integer>res = new ArrayList<Integer>();
		for(int i = 0; i < arr.length;++i){
			if(value != arr[i]){
				res.add(arr[i]);
			} 
		}
		return res;
	}
	//Given an array and a value, remove all instances of that value and return length
	public static int retLen(int[] arr, int value){
		ArrayList<Integer>res = new ArrayList<Integer>();

		for(int i = 0; i < arr.length;++i){
			if(value != arr[i]) res.add(arr[i]);
		}
		return res.size();
	}
	//Remove all duplicates from array
	public static ArrayList<Integer> removeDuplicates(int[] arr){
		ArrayList<Integer>res = new ArrayList<Integer>();
		Set<Integer>set = new LinkedHashSet<Integer>(); //maintains

		for(int i = 0; i < arr.length;++i){
			if(!set.contains(arr[i])){
				set.add(arr[i]);
				res.add(arr[i]);
			}
		}
		return res;
	}
	//Given a array of inte­gers, in which every ele­ments occurs even num­ber of times except one 
	//num­ber which occurs odd num­ber of times. Find out that number.
	public static int oddOccurences(int[] arr){
		Hashtable<Integer,Integer>map = new Hashtable<Integer,Integer>();

		for(int i = 0; i < arr.length;++i){
			if(!map.containsKey(arr[i])) map.put(arr[i],1);
			else map.put(arr[i],map.get(arr[i])+1);
		}
		for(Map.Entry<Integer,Integer>entry: map.entrySet()){
			if(entry.getValue() % 2 == 1) return entry.getKey(); //check which have a odd value
		}
		throw new IllegalArgumentException("Invalid entry");
	}

	//Find the missing number in an area of 100 integers
	//Algorithmn: Use the sum formula. Subtract all the numbers from sum.
	public static int findMissingNum(int[] arr, int totalCount){
		//1. Sum of the series: Formula: n(n+1)/2 (but only work for one missing number)
		//2. Use Bitset, if the array has more than 1 missing element
		int expectedSum = totalCount * ((totalCount+1)/2);
		int actualSum = 0;
		for(int i : arr) 
			actualSum += i;
		return expectedSum - actualSum;
	}

	//Find missing numbers in an arr  - HARD
	

	//Find the duplicate number in array
	public static int findDuplicate(int[] arr){
		Hashtable<Integer,Integer>map = new Hashtable<Integer,Integer>();
		for(int i = 0; i < arr.length;++i){
			if(!map.containsKey(arr[i])) map.put(arr[i],1);
			else map.put(arr[i],map.get(arr[i])+1);
		}
		for(Map.Entry<Integer,Integer>entry: map.entrySet()){
			if(entry.getValue() > 1) return entry.getKey();
		}
		throw new IllegalArgumentException("invalid arr");
	}

	//Check if array contains a number in Java
	public static boolean containsNum(int[] arr, int value){
		for(int i = 0; i < arr.length;++i) if(arr[i] == value) return true;
		return false;
	}
	//Find largest and smallest number in unsorted array
	public static void MaxAndMin(int[] arr){
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for(int i = 0; i < arr.length;++i){
			if(arr[i] > max) max = arr[i];
			else if(arr[i] < min) min = arr[i]; //corner case with -2147483648 and -2
		}
		System.out.println("max number: " + max);
		System.out.println("min number: " + min);
	}

	//Print pairs in Arrays of Integers whose sum is equal to the number
	//Algorithmn is O(n^2), can we improved it? 
	//Ask if it can contain positive/negative numbers? What happens if it appears twice
	//Are pairs distinct? 
	public static void printPairs(int[] arr, int sum){
		ArrayList<Integer>list = new ArrayList<Integer>();
		for(int i = 0; i < arr.length;++i){
			for(int j = i+1; j < arr.length;++j){
				if(arr[i] + arr[j] == sum){
					System.out.println("(" + arr[i] + "," + arr[j] + ")");
				}
			}
		}
	}
	
	//Runtime: O(n) because it requires less comparisons. Only n to iterate through array
	//and constant operation for set. 
	public static void optimizedPrintPairs(int[] nums, int sum){
		Set<Integer>set = new HashSet<Integer>();
		for(int firstPair: nums){
			int secondPair = sum - firstPair;
			if(!set.contains(secondPair)) set.add(firstPair);
			else System.out.printf("(%d,%d) %n",firstPair,secondPair);
		}
	}

	//Find repeated numbers in an array if it contains a duplicate
	public static void findRepeatedDuplicates(int[] arr){
		Hashtable<Integer,Integer>map = new Hashtable<Integer,Integer>();
		for(int i = 0; i < arr.length;++i){
			if(!map.containsKey(arr[i])) map.put(arr[i],1);
			else map.put(arr[i], map.get(arr[i])+1);
		}

		for(Map.Entry<Integer,Integer>entry: map.entrySet()){
			if(entry.getValue() > 1){
				System.out.println("Duplicated number: " + entry.getKey());
			}
		}
		return;
	}


	//Find intersection of 2 sorted arrays
	public static ArrayList<Integer> intersection(int[] arr, int[] arr2){
		ArrayList<Integer>list = new ArrayList<Integer>();
		for(int i = 0; i < arr.length;++i){
			for(int j = 0; j < arr2.length;++j){
				if(arr[i] == arr2[j]) list.add(arr[j]);
			}
		}
		return list;
	}

	//Find the kth smallest/largest element in unsorted array
	public static int kthSmallest(int[] arr, int k){
		Arrays.sort(arr);
		for(int i = 0; i < arr.length;++i){
			return arr[k-1];
		}
		return 0;
	}

	//Find common elements in three sorted arrays

	//Find First Repeated Element in Array
	public static int firstRepeatedElem(int[] arr){
		List<Integer>list = new ArrayList<Integer>();
		Hashtable<Integer,Integer>map = new Hashtable<Integer,Integer>();
		for(int i = 0; i < arr.length; ++i){
			if(!map.containsKey(arr[i])) map.put(arr[i],1);
			else map.put(arr[i],map.get(arr[i])+1);
		}
		for(Map.Entry<Integer,Integer>entry: map.entrySet()){
			if(entry.getValue() > 1){
				list.add(entry.getKey());
			}
		}
		return list.get(0);
	}

	//Find First NonRepeated Element in Array
	public static int firstNonRepeatedElem(int[] arr){
		List<Integer>list = new ArrayList<Integer>();
		Hashtable<Integer,Integer>map = new Hashtable<Integer,Integer>();
		for(int i = 0; i < arr.length; ++i){
			if(!map.containsKey(arr[i])) map.put(arr[i],1);
			else map.put(arr[i],map.get(arr[i])+1);
		}
		for(Map.Entry<Integer,Integer>entry: map.entrySet()){
			if(entry.getValue() == 1){
				list.add(entry.getKey());
			}
		}
		return list.get(0);
	}

	//Find top two numbers in array
	public static ArrayList<Integer> topTwo(int[] arr){
		ArrayList<Integer>list = new ArrayList<Integer>();
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length;i++){
			if(arr[i] > max1){
				max2 = max1; //have to set it before before losing track of it
				max1 = arr[i];
			} else if(arr[i] > max2){
				max2 = arr[i];
			}
		}
		list.add(max1);
		list.add(max2);
		return list;
	}

	//Check if array has a duplicate
	public static boolean hasDuplicate(int[] arr){
		Set<Integer>set = new HashSet<Integer>();
		if(arr.length == 1) return true;
		for(int i = 0; i < arr.length;++i){
			if(set.contains(arr[i])) return true;
			set.add(arr[i]);
		}
		return false;
	}

	//Merge sorted array


	
	//17,18,19,20,23,24,25,26,27,28





}