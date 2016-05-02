import java.util.*;

public class Google {
	/* Given a string "abcd" and another "abxcd", find x aka added character
	 *
	 */

	public static Character findExtraChar(String s1, String s2){
		HashMap<Character,Integer>map = new HashMap<Character,Integer>();

		for(int i = 0; i < s1.length();++i){
			if(!map.containsKey(s1.charAt(i))){
				map.put(s1.charAt(i),1);
			} else {
				map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
			}
		}

		for(int i = 0; i < s2.length();++i){
			if(map.containsKey(s2.charAt(i))){
				map.put(s2.charAt(i),map.get(s2.charAt(i))-1);
			} else {
				map.put(s2.charAt(i),1);
			}
		}

		for(Map.Entry<Character,Integer>entry: map.entrySet()){
			if(entry.getValue() == 1 || entry.getValue() < 0) return entry.getKey();
		}
		throw new IllegalArgumentException("null");
		
	}

	/*
	 * Given a sorted array like [1, 3, 5, 6, 9]. Find num that is closest to a given number like
	 * 7.
	 * 


	public static void main(String[] args){
		String s1 = "abcd";
		String s2 = "abxcd";

		String s3 = "abcd";
		String s4 = "abcda";

		System.out.println(findExtraChar(s3,s4));
	}
}