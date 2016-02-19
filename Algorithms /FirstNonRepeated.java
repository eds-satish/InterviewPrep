import java.util.*;

public class FirstNonRepeated {
	//LOGIC: A non repeated characters only appears once, 
	//so I would store it into a hashmap with a char as its key
	//and its frequency of how many times it appears. The first key with frequency 1 is the correct one

	//Runtime:O(n)?
	public static Character firstNonRepeatedChar(String str){
		HashMap<Character,Integer>hashtable = new HashMap<Character,Integer>();
		
		for(int i = 0; i < str.length();++i){ 
			char ch = str.charAt(i);
			if(hashtable.containsKey(ch)){ //increment freq corresponding to char
				hashtable.put(ch, hashtable.get(ch) + 1);
			} else {
				hashtable.put(ch,1); 
			}
		}

		//another for loop to return char
		for(int i = 0; i < str.length(); ++i){
			char ch = str.charAt(i);
			if(hashtable.get(ch) == 1){
				return ch;
			}
		}
		return null;

	}

	public static void main(String[] args){
		String a = "aaleexx";
		System.out.println(firstNonRepeatedChar(a));
	} 
}