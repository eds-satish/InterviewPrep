import java.util.*;
//Write a function to check if it is a permutation of a palindrome
// A palindrome is a word or phrase that is the same forwards and backwards
// A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words. 

public class PalindromePermutation {
	public static void main(String[] args){
		String pali = "Rats live on no evil star";
		System.out.println(isValidPermutation(pali));
	}

	public static boolean isValidPermutation(String str){
		int[] table = buildCharCountTable(str);
		return checkMaxOneOdd(table);
	}

	//Check to see if one character has an odd count
	public static boolean checkMaxOneOdd(int[] table){
		boolean foundOne = false;
		for(int count: table){
			if(count % 2 == 1){
				foundOne = false;
			}
			foundOne = true;
		}
		return foundOne;
	}


	//Count how many times a char appears
	public static int[] buildCharCountTable(String str){
		int[] table = new int[Character.getNumericValue('z')- Character.getNumericValue('a')];

		for(char c : str.toCharArray()){
			//get the ccount for each character
			int x = getCharNumber(c);
			if(x != -1){
				table[x]++;
			}
		}
		return table;
	}

	//Map each Character to a number, remember it's case insensitve 
	public static int getCharNumber(Character c){
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int A = Character.getNumericValue('A');
		int Z = Character.getNumericValue('Z');

		int value = Character.getNumericValue(c);

		if(a <= value && value <= z){
			return value - a;
		} else if(A <= value && value <= Z){
			return value - A;
		}
		return -1; //non-letter characters map to -1
	}
	


}