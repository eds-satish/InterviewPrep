import java.util.*;
public class PalindromePermutation {
    public boolean canPermutePalindrome(String s) {
        //Count the frequency per character within that String
        int freq = 0;
    	Hashtable<Character,Integer>map = new Hashtable<Character,Integer>();
        for(int i = 0; i < s.length();++i){
            char c = s.charAt(i);
            if(!map.containsKey(c)) map.put(c,1);
            else map.put(c, map.get(c)+1);  
        }
        //the char freq is even when its a palindrome
        for(Map.Entry<Character,Integer>entry: map.entrySet()){
            if(entry.getValue() % 2 == 0) continue; //even 
            else {
                freq++;
                if(freq > 1) return false; //only have to take in account the 1 count last char you are comparing.
            }
        }
        return true;
    }
}