import java.util.*;

//input : ["eat", "tea", "tan", "ate", "nat", "bat"]
//output: ["ate", "eat", "tea"]
		//["nat", "tan"]
		//["bat"]


public class group_anagrams {
	public static void main(String[] args){
		String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(group_anagrams(arr));
	}

	public static List<List<String>> group_anagrams(String[] strs){

		Hashtable<String,List<String>>map = new Hashtable<String,List<String>>();
		for(int i = 0; i < strs.length;++i){
			String origWord = strs[i];
			char[] indexChar = origWord.toCharArray();
			Arrays.sort(indexChar);
			String sortedStr = String.valueOf(indexChar);

			List<String>tempList = map.getOrDefault(sortedStr, new ArrayList<String>()); //returns list or emptry list if null
			tempList.add(origWord);
			map.put(sortedStr,tempList);
		}
		return new ArrayList<>(map.values());
	}

}