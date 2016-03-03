import java.util.*;

public class RemoveDuplicateLetters {
	public static void main(String[] args){
		String s = "asdasdasdasdvsddsvdsdggggqqqqplo";
		String lexo = removeDuplicateLetter(s);
		char[] arr = lexo.toCharArray();
		Arrays.sort(arr);
		System.out.println(new String(arr));
	}
	public static String removeDuplicateLetter(String s){
		if(s.length() == 0 || s == null){
			return "";
		}
		s = s.trim();
		int len = s.length();
		HashMap<Character,Integer>res = new HashMap<Character,Integer>();
		
		//Set the count per how many times char appears
		for(int i = 0; i < len; ++i){
			if(res.get(s.charAt(i)) == null){
				res.put(s.charAt(i),1); //count per char
			} else {
				res.put(s.charAt(i), res.get(s.charAt(i)) + 1);
			}
		}
		//loop through string
		int firstLetterIndex = 0;
		for(int i = 0; i < len; ++i){
			// if(s.charAt(i) < s.charAt(pos)){
			// 	System.out.println("enter");
			// 	pos = i;
			// }
			res.put(s.charAt(i), res.get(s.charAt(i)) - 1); //0 value are non duplicates
			if(res.get(s.charAt(i)) == 0){
				return s.charAt(firstLetterIndex) + 
				removeDuplicateLetter(s.substring(firstLetterIndex + 1).replaceAll(s.charAt(firstLetterIndex) + "","")); //will do remove..("b")
			}
		}
		return ""; //invalid case
	}
}