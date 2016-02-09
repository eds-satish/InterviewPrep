public class uniqueString {
	//What type of unique string is it? ASCII or Unicode
	// ASCII defines 128 characters 
	// Unicode defines 2^21 characters
	public static boolean isUnique(String str){
		if(str.length() > 128) return false;

		boolean char_set[] = new boolean[128];
		for(int i = 0; i < str.length(); ++i){
			int value = str.charAt(i);
			if(char_set[value]) return false;
			
			else return char_set[value] = true;
		}
		return true;
	}

	public static void main(String[] args){
		String str = "alex";
		System.out.println(isUnique(str));
	}
x