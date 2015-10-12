import java.util.*;

public class findAnagramsBtwTwoStrings {
	


	//MY preferred way
	public static boolean findAnagrams(String word, String anagram){

		//check if Strings are equal by breaking apart the String into a char
		//array

		//ALWAYS MAKE SURE String are in same case and character array are sorted


		if(word == null || anagram == null || word.length() == 0 || anagram.length() == 0){
			return false;
		}
		if(word.length() != anagram.length()){
			return false;
		}

		char[] wordArr = word.toCharArray();
		char[] anagramArr = anagram.toCharArray();

		Arrays.sort(wordArr);
		Arrays.sort(anagramArr);

		return Arrays.equals(wordArr,anagramArr);
	}

	public static boolean anotherWay(String word, String anagram){
		
		if(word.length() != anagram.length()){
			return false;
		}

		char[] charArray = word.toCharArray();

		for(char c: charArray){
			int index = anagram.indexOf(c);
			if(index != -1){
				anagram = anagram.substring(0, index) + anagram.substring(index +1, anagram.length());
			} else {
				return false;
			}
		}
		return anagram.isEmpty();


	}


	public static void main(String[]args){
		String s1 = "word";
		String s2 = "rowd";

		System.out.println(findAnagrams(s1,s2));
	}


}