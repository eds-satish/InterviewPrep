import java.util.*;
class Problem2 {
	public final static int LIMIT = 4000000;

	public static ArrayList<Integer> fibo(int limit){
		//problem says start with 1 and 
		ArrayList<Integer>fibo_arr = new ArrayList<Integer>();
		int first = 1;
		int second = 2;
		fibo_arr.add(first);
		fibo_arr.add(second);

		for(int i = 0; i < limit;i++){
			int preValue = first;
			first = second;
			second = preValue + first;
			if(second >= limit) break; //off by one error
			else fibo_arr.add(second);
		}
		return fibo_arr;
	}

	//helper function that calculates whether its even and if it is
	//totals the sum
	public static int evenOfSum(ArrayList<Integer>res){
		int sum = 0;
		for(int i: res){
			if(i % 2 == 0){
				sum += i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args){
		Problem2 fibonacci = new Problem2();
		ArrayList sequence = fibonacci.fibo(LIMIT);
		System.out.println("Fibo is " + sequence);
		int sum = fibonacci.evenOfSum(sequence);
		System.out.println(sum);
	}
}