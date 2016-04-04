import java.util.*;
import java.io.*;
//import static org.junit.Assert.*;


public class StringPractice {
	public static void main(String[] args){
		String str = "aaaaaaaaaaaaaaaaabbbbcddddeeeeee";
		String str2 = "Alex is awesome";
		System.out.println(countWord(str2));		
		
	}


	//Print duplicate characters from String
	public static void printDuplicate(String str){
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
	public static int printNonDuplicate(int[] arr){
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
	
	//Find all permutations of a String
	public static void permutation(String input){ //review more
		permutate("",input);
	}
	//keeping one character fix and permutate on others 
	private static void permutate(String res, String word){
		//Base Case: when the word is empty just return that
		if(word.isEmpty()) System.out.println(res);

		else {
			for(int i = 0; i < word.length(); ++i){
				//res + word.charAt(i) is the fix char
				permutate(res + word.charAt(i), word.substring(0,i) + word.substring(i+1,word.length()));
			}
		}

	}

	//Reverse words in a sentence
	public static String reverseSentence(String str){
		if(str == null) throw new IllegalArgumentException("String invalid!");
		String[] arr = str.split(" +"); //split on more than 1 space
		StringBuilder res = new StringBuilder();

		for(int i = arr.length-1; i >= 0; i--){
			res.append(arr[i].trim() + " ");
		}
		return res.toString();
	}

	//Check if string is a palindrome
	public static boolean findPalindrome(String str){
		boolean flag = true;
		if(str == null) throw new IllegalArgumentException("Str is null");

		if(str.length() == 1) flag = true;

		for(int i = 0; i < str.length();++i){
			if(str.charAt(i) != str.charAt(str.length()-1-i)) flag = false;
		}
		return flag;
	}

	//How to remove an specific character from String
	public static String removeChar(String str, char value){
		StringBuilder res = new StringBuilder();
		for(int i = 0; i < str.length();++i){
			if(str.charAt(i) != value) res.append(str.charAt(i) + "");
		}
		return res.toString();
	}
	//Remove all duplicate characters in String, remember to used a set
	//Input: 'Bananas'
	//Output: 'Bans'
	public static String allDuplicate(String str){
		Set<Character>set = new HashSet<Character>();
		StringBuilder res = new StringBuilder();
		for(int i = 0; i < str.length();++i){
			if(!set.contains(str.charAt(i))){
				set.add(str.charAt(i));
				res.append(str.charAt(i) + "");
			} 
		}
		return res.toString();
	}

	//Check if a String is a valid shuffle of two strings
	// public static boolean validShuffle(String str1, String str2, String str3){
	// 	if(str1.length() + str2.length() != str3.length()) return false;

	// }



	//Write a program if a String contains another String eg. indexOf - FINISH

	//Return highest occured character in String
	public static char highestOccur(String str){
		Hashtable<Character,Integer>map = new Hashtable<Character,Integer>();
		int maxCount = 0;
		for(int i = 0; i < str.length();++i){
			if(!map.containsKey(str.charAt(i))) map.put(str.charAt(i),1);
			else map.put(str.charAt(i),map.get(str.charAt(i))+1);

			if(map.get(str.charAt(i)) > maxCount) maxCount = map.get(str.charAt(i));
		}
		for(Map.Entry<Character,Integer>entry: map.entrySet()){
			if(entry.getValue() == maxCount) return entry.getKey();
		}
		throw new IllegalArgumentException("no occurence found");		
	}

	//Count Word in String
	public static int countWord(String str){
		int count = 0;
		for(int i = 0; i < str.length();++i){
			if(str.charAt(i) == ' ') count ++;
		}
		count++; //account for last one
		return count;
	}

	

	//Find longest palindrome in String - FINISH 

	//Sort String on their length - FINISH


}

class ProgrammingTest {
	public void testFirstNonRepeatedCharacter(){
      //  assertEquals('b', StringPractice.getFirstNonRepeatedChar("abcdefghija"));
	}
}