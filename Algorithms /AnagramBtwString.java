import java.util.*;

public class AnagramBtwString {
	
	public static void main(String[]args){
		String s1 = "word";
		String s2 = "rowd";
		System.out.println(findAnagrams(s1,s2));
	}

	public static boolean findAnagrams(String word, String anagram){
		if(word.length() != anagram.length()) return false; 

		if(word == null || anagram == null || word.length() == 0 || anagram.length() == 0) return false;

		char[] word = Arrays.sort(word.toCharArray());
		char[] anagram = Arrays.sort(anagram.toCharArray());

		return Arrays.equals(word,anagram);
	}
}