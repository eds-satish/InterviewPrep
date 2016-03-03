import java.util.*;
//Write a function fib() that takes an integer n and returns the nth fibonaci number
public class Fibonacci_Nth {
	//Runtime: Since each fib call makes two calls, we need to think of it as a binary tree.
	//The height of a binary tree is O(n) which means the toal number of nodes is 2^n, so total runtime is O(2^n).
	private static int fib(int n){
		if(n <= 1) return n;

		else{
			return fib(n-1) + fib(n-2);
		}
	}

	//Better way is to ensure memoization. It ensures that a function doesn't run for the same inputs more than once by keeping
	//a previous record of the result (HASHMAP).

	static Map<Integer, Integer>memo_map = new HashMap<Integer,Integer>();

	//Runtime: O(n) time total and O(n) space. (Again, when looking up the memo it is constant time)
	public static int memo(int n){
		if(n < 0) throw new IllegalArgumentException("Index is negative. cannot enforce this!");

		else if(n <= 1) return n;

		if(memo_map.containsKey(n)){
			System.out.println("Memo[" + n + "]");
			return memo_map.get(n);
		} 

		int result = memo(n-1) + memo(n-2);
		memo_map.put(n,result);

		return result; 
	}

	public static void main(String[] args){
		System.out.println(memo(0));
		System.out.println(memo(1));
		System.out.println(memo(2));
		System.out.println(memo(3));
		
	}

	//memoization - O(n) because the tree now goes down to roughly 2n children. 
	/*
		int fibonacci(int n){
			return fiboHelper(n, new int[n+1]);
		}
		int fiboHelper(int n, int[] memo){
			if(n < 2) return n;

			if(memo[n] == 0){
				memo[n] = fiboHelper(n-1,memo) + fiboHelper(n-2,memo);
			}
			return memo[n];
		}

	*/ 
}