import java.util.*;

//Given a list of words like [rats,star,arts,cie, ice], group same anagrams into buckets and output them

public class anagram_bucket {

	public static void anagram(ArrayList<String> list){
		
		Hashtable<String, ArrayList<String>>l = new Hashtable<String, ArrayList<String>>();
		
		for(String s: list){
			char[] array = s.toCharArray();
			Arrays.sort(array);
			String sortedString = String.valueOf(array);
			

			if(!l.keySet().contains(sortedString)){
				ArrayList<String>value = new ArrayList<String>();
				value.add(s);
				//System.out.println("values are " + value);
				l.put(sortedString,value);
			} else {
				ArrayList<String> existingValue = l.get(sortedString); //returns value based upon the key
				existingValue.add(s);
				l.put(sortedString, existingValue);
			}
		}

		/* to check if doing it correctly */
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
		result.addAll(l.values());
		for(ArrayList<String> ad: result){
			System.out.println(ad);
		}

	}

	public static void main(String[] args){
		ArrayList<String> s = new ArrayList<String>();
		s.add("star");
		s.add("rats");
		s.add("ice");
		s.add("arts");
		s.add("cie");
		anagram(s);
	}




}
