public class reverseString {


	public static void main(String[] args){
		String str = new String("lady");
		char[] arr = str.toCharArray();
		int last = str.length()-1;
		char temp;


		for(int i = 0; i < str.length()/2; ++i){
			temp = str.charAt(i);
			arr[i] = arr[last]; 
			arr[last] = temp;
			last--; //catch off by 1 error

		}
		str = new String(arr);
		System.out.println(str);
	}

	public static String recursiveReverse(String str){
		if(str.length() < 2){
			return str;
		}

		return recursiveReverse(str.substring(1) + str.charAt(0));
	}

	//Other optional ways
	public static String reverse(String str){

		StringBuilder s1 = new StringBuilder();
		char[] arr = str.toCharArray();

		if(str.length() == 0){
			return str;
		}

		if(str == null){
			return str;
		}

		for(int i = str.length() - 1; i >= 0; i--){
			s1.append(arr[i]);
		}
		return s1.toString();
	}
	

	
}