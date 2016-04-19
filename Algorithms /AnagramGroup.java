import java.util.*;

//Given a list of words like [rats,star,arts,cie, ice], group same anagrams into buckets and output them

public class AnagramGroup {
	public static void anagram(ArrayList<String> list){
		Arrays.sort(list); //makes the inner lists lexographic order
		Hashtable<String,List<String>>map = new Hashtable<String,List<String>>();
		for(String s : list){
			char[] arr = s.toCharArray();
			Arrays.sort(arr);
			String sortedStr = String.valueOf(arr);

			List<String>temp = new ArrayList<String>();

			if(!map.containsKey(sortedStr)){
				temp.add(s);
				map.put(sortedStr,temp);
			} else map.get(sortedStr).add(s);
		}

		for(Map.Entry<String,List<String>>entry: map.entrySet()) System.out.println(entry.getValue());
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
