//Implement a method to perform basic string compression using the counts of repeated chars. 
//Input: "aabcccccaaa"
//Output:"a2b1c5a3"
//In addition, if the compressed string would not become smaller than the original string, your method should return the original string. (Error case)


//LOGIC: Loop through the string, keeping track of the count of each character
public class StringCompressed {

	public static void main(String[] args){
		String str = "aaabcccccbb";
		System.out.println(compressed(str));
	}

	public static String compressed(String str){
		StringBuilder newStr = new StringBuilder(); //since its mutable so you can easily changed it 
		int letterCount = 0;
		
		for(int i = 0; i < str.length(); ++i){
			letterCount++;
			//you would append when the character is different
			if( (i+1) >= str.length() || str.charAt(i) != str.charAt(i+1)){ //i+1 takes the index out of bounds error
				newStr.append(str.charAt(i));
				newStr.append(letterCount);
				//reset the count back to 0
				letterCount = 0;
			}
		}
		return newStr.length() < str.length() ? newStr.toString() : str;
	}

}