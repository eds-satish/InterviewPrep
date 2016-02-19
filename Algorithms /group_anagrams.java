import java.util.*;

//input : ["eat", "tea", "tan", "ate", "nat", "bat"]
//output: ["ate", "eat", "tea"]
		//["nat", "tan"]
		//["bat"]


public class group_anagrams {

	public List<List<String>> group_anagrams(String[] strs){

		Arrays.sort(strs);
		HashMap<String, List<String>> result = new HashMap<String, List<String>>();

		for(int i = 0; i < strs.length; i++){
			String location = strs[i];
			char[] charArray = strs[i].toCharArray();

			Arrays.sort(charArray);
			String sortedString = String.valueOf(charArray);

			List<String>tempList = result.getOrDefault(sortedString, new ArrayList<String>());
			tempList.add(location);
			result.put(sortedString,tempList);
		}
		return new ArrayList<>(result.values());
	}

}