public class PowerOfThree {
	public boolean check(int n){
		while(n % 3 == 0 && n > 1){
			n = n / 3;
		}
		return n == 1;
	}
}