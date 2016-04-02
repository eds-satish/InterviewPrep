public class PalindromePermutation {
    public boolean canPermutePalindrome(String s) {
        //Count the frequency per character within that String
    	Hashtable<Character,Integer>map = new Hashtable<Character,Integer>();
        for(int i = 0; i < s.length();++i){
            char c = s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,1);
            } else {
                map.put(c, map.get(c)+1);
            }
        }
        //if the char freq is even its a palindrome
        int count = 0;
        for(int i: map.values()){
            if(i % 2 == 0) continue; //even its even
            else {
            	count++;
                if(count > 1){ //in a palindrome they will only be 1 count to take consider the last char
                    return false;
                }
            }
        }
        return true;
    }
}