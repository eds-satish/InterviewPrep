public class revereString {
	public static void main(String[] args){
		String s1 = new String("Alex");
		System.out.println(s1);
		System.out.println(reverse(s1));
	}

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

	public static String reverseRecursively(Str str){
		if(str.length() < 2){
			return str;
		}
		return reverseRecursively(str.subString(1) + str.charAt(0));
	}


}