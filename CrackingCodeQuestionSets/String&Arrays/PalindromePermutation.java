import java.util.*;

public class PalindromePermutation {
	/*
	 * Given a string, write a function to check if it is a permutation of a palindrome.
	 * A permutation is a rearrangment of letters. 
	 * The palindrome does not need to be limited to just dictionary words.
	 * Input: Tact Coa
	 * Output: True(permutations: "taco cat", "atco cta")
	 */ 

	//Used a hashtable to count how many times each character appears. Iterate through hashtable
	//and ensure that no more than one character has an odd count. Since a permutation of a 
	//palindrome, a string can have no more than character that is odd.
	//taco cat -> t = 2, a = 2, c = 2, o = 1

	public static boolean palindromePermutation(String phrase){
		Hashtable<Character,Integer>map = new Hashtable<Character,Integer>();

		for(char c: phrase.toCharArray()){
			if(!map.containsKey(c)){
				map.put(c,1);
			} else {
				map.put(c,map.get(c)+1);
			}
		}

		for(Map.Entry<Character,Integer>entry: map.entrySet()){
			boolean foundOdd = false;
			if(entry.getValue() % 2 == 1){
				if(foundOdd == true){
					return false;
				}
				foundOdd = true;
			}
		}
		return true;
	}

	public static void main(String[] args){
		System.out.println(palindromePermutation("A man, a plan, a canal, panama"));
	}


}