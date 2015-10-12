import java.util.*;
public class fibonacci{
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

	public static int iterative_fast(int n){
		int fib = 0;
		int a = 1;
		for(int i=0; i < n;i++){
			fib = fib + a;
			a = fib;
		}
		return fib;
	}
	
}