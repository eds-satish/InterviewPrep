import java.util.*;
public class GroupOfAnagrams{
	//Given an array of strings, return all groups of strings
	//that are anagrams to each other.

	//An anagram is the result of rearranging the letters of a word
	//to produce a new word or phrase, using all the original letters
	//exactly once.
	//i.e. Torchwood to Doctor Who
  
  public static List<String> findAnagrams(String[] strs){
    List<String>result = new ArrayList<String>();
     
    //base case, string is 0 and the string is null
    if(strs == null || strs.length == 0){
      return result;
    }else if(strs.length == 1){ 
      result.add(strs[0]); //return original string 
      return result;
    }
    
    Map<String, List<String>> myMap = new HashMap<String, List<String>>(); //list is one single word and list of all anagrams
    for(int i =0; i< strs.length;i++){
      char[] arr = strs[i].toCharArray();
      Arrays.sort(arr); 
      String sortedValue = new String(arr);//makes it easy to compare 
      if(!myMap.containsKey(sortedValue)){ //key is a single string
        List<String> anagrams = new ArrayList<String>();
        anagrams.add(strs[i]);
        myMap.put(sortedValue, anagrams);
      }else{
        myMap.get(sortedValue).add(strs[i]);
      }
      
    }
    for(List<String> value : myMap.values()){ //[['alex],['tiger'],'gietr']]
      if(value.size() > 1){ //has at least two words, in order to have an anagram between         with two words
        result.addAll(value);        
      }
    }
    return result;    
  }
  
  public static void main(String[] args){
      String[] strs = { "alex", "tiger", "gietr"};
      List<String> anagrams = findAnagrams(strs);
      System.out.println(anagrams);
  }  
    
  
}