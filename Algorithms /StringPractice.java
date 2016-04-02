import java.util.*;
import java.io.*;
//import static org.junit.Assert.*;


public class StringPractice {
	public static void main(String[] args){
		//String str = "Javav";
		//int[] arr = {1,1,3};
		//String str = "-123";
		
	}


	//Print duplicate characters from String
	public static void duplicate(String str){
		Hashtable<Character,Integer>map = new Hashtable<Character,Integer>();
		for(int i = 0; i < str.length();++i){
			if(!map.containsKey(str.charAt(i))) map.put(str.charAt(i),1);
			else map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
		}
		for(Map.Entry<Character,Integer>entry: map.entrySet()){
			if(entry.getValue() > 1){
				System.out.println(entry.getKey());
			}
		}
	}

	//Print nonduplicate numnber in array
	public static int nonDuplicate(int[] arr){
		int res = 0;
		Hashtable<Integer,Integer>map = new Hashtable<Integer,Integer>();
		for(int i = 0; i < arr.length;++i){
			if(!map.containsKey(arr[i])) map.put(arr[i],1);
			else map.put(arr[i],map.get(arr[i])+1);
		}
		for(Map.Entry<Integer,Integer>entry: map.entrySet()){
			if(entry.getValue() == 1){
				res = entry.getKey();
			}
		}
		return res;
	}

	//Find first nonrepeated character
	public static char getFirstNonRepeatedChar(String str){
		Hashtable<Character,Integer>map = new Hashtable<Character,Integer>();
		for(int i = 0; i < str.length();++i){
			if(!map.containsKey(str.charAt(i))) map.put(str.charAt(i),1);
			else map.put(str.charAt(i),map.get(str.charAt(i))+1);
		}

		for(Map.Entry<Character,Integer>entry: map.entrySet()){
			if(entry.getValue() == 1) return entry.getKey();
		}
		throw new IllegalArgumentException("no nonrepeated character");
	}

	//Find Number of Times Per Char 
	public static void numberofTimes(String str){
		Hashtable<Character,Integer>map = new Hashtable<Character,Integer>();

		for(int i = 0; i < str.length(); i++){
			if(!map.containsKey(str.charAt(i))) map.put(str.charAt(i),1);
			else map.put(str.charAt(i), map.get(str.charAt(i))+1);
		}

		for(Map.Entry<Character,Integer>entry: map.entrySet()){
			System.out.println("char: " + entry.getKey() + " frequency: " +  entry.getValue());
		}
	}

	//Check if a String contains only digits
	public static boolean containsDigit(String str){
		for(int i = 0; i < str.length();++i){
			if(!Character.isDigit(str.charAt(i))) return false;
		}
		return true;
	}

	//Find duplicate characters in String and print them out
	public static void duplicateChar(String str){
		Hashtable<Character,Integer>map = new Hashtable<Character,Integer>();
		for(int i = 0; i < str.length();++i){
			if(!map.containsKey(str.charAt(i))) map.put(str.charAt(i),1);
			else map.put(str.charAt(i), map.get(str.charAt(i))+1);
		}
		for(Map.Entry<Character,Integer>entry: map.entrySet()){
			if(entry.getValue() > 1){
				System.out.print(entry.getKey());
				System.out.print(": " + entry.getValue() + "\n");
			}
		}
	}

	//Count number of vowels and consonants 
	public static void validator(String str){
		int vowelCount = 0;
		int consonantCount = 0;
		for(int i = 0; i < str.length();++i){
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || 
				str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
				str.charAt(i) == 'u' ) vowelCount++;
			else consonantCount ++;
		}
		System.out.println(vowelCount + " vowels");
		System.out.println(consonantCount + " consonants");
	}

	//Convert numeric String to integer known as atoi 
	public static int atoi(String str){
		//think about whitespace case, "", "123", "+123", "-123", MAX, MIN 
		str = str.trim(); //get rid of whitespace
		if(str == null) throw new IllegalArgumentException("String is null");
		else if(str.length() == 0 || str == "") return 0;

		char firstSign = str.charAt(0);
		int operation = 1;
		int indexPos = 0;
		int res = 0;

		if(firstSign == '+'){
			operation = 1;
			indexPos++;
		} else if(firstSign == '-'){
			operation = -1;
			indexPos++;
		}

		for(int i = indexPos; i < str.length();++i){
			if(!Character.isDigit(str.charAt(i))) return (int) res * operation;

			res = res * 10 + str.charAt(i) - '0'; 

			if(firstSign == 1 && res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
			else if(firstSign == -1 && res < Integer.MIN_VALUE) return Integer.MIN_VALUE;

		}
        return (int) res * operation;
	}
	//TODO: TOMORROW
	
	//Find all permutations of a String

	//Reverse words in a sentence

	//Check if string is a palindrome

	//How to remove duplicate characters from string

	//Check if a String is a valid shuffle of two strings

	//Write a program if a String contains another String eg. indexOf

	//Return highest occured character in String

	//Write a program to remove a given character in String

	//Write a program to find longest palindrome in String

	//Write a porgram to sort String on their length





	
}

class ProgrammingTest {
	public void testFirstNonRepeatedCharacter(){
      //  assertEquals('b', StringPractice.getFirstNonRepeatedChar("abcdefghija"));
	}
}