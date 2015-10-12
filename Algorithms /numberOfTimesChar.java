import java.util.*;
public class numberOfTimesChar{
	public static Map<Character,Integer> getCharFreq(String s) {
  		Map<Character,Integer> charFreq = new HashMap<Character,Integer>();
  		if (s != null) {
  			int newCount;
	   	 	for (Character c : s.toCharArray()) {
	      		Integer count = charFreq.get(c);
	      		if(count == null){
	      			newCount = 1;
	      		}
	      		else {
	      			newCount = count + 1;
	      		}
	      		charFreq.put(c, newCount);
	    	}
  		}
  return charFreq;
}


	public static void main(String[] args){
		String s = "abdsd3$asda$asasdd$sadas";
		Map counts = getCharFreq(s);
		System.out.println(counts.get('$')); // => 3
		System.out.println(counts.get('a')); // => 7
		counts.get('s'); // => 6
	}
}
