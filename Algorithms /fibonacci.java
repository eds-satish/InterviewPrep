import java.util.*;
//Runtime: O(2^n) where n is the total number of nodes. Each node has two children. If we do this n times, we roughly get
//O(2^n) nodes. 
public class Fibonacci{
	public static int fibo(int n){
		if(n < 2){
			return n;
		}
		else {
			return fibo(n-1) + fibo(n-2);
		}
	}

	public static void main(String[] args){
		for(int i = 0; i < 10;i++){
			System.out.println("fibo" + fibo(i));
		}
	}

	//this is the bottom approach
	public static int iterative_fast(int n){
		int fib = 0;
		int a = 1;
		for(int i=0; i < n;i++){
			fib = fib + a;
			a = fib;
		}
		return fib;
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