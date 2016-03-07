public class ValidPalindrome {
	public static void main(String[] args){
		String a = "racecar";
		String invalid = "re";
		String b = "";
		String c = "car";
		System.out.println(valid(c));
	}
	public static boolean valid(String str){ //str = "racecar"
		boolean found = true;
		str = str.trim();

		if(str == " " || str.length() == 0) return true;
		else if(str == null) throw new IllegalArgumentException("Invalid String");

		for(int i = 0; i < str.length();++i){
			if(str.charAt(i) != str.charAt(str.length()-i-1)){
				found = false;
		}
		return found;
	}
}