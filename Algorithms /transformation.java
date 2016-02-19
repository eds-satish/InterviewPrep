import java.util.*;
import java.io.*;

class transformation {
	public static void main(String[] args){


	}

	public static boolean inDict(String word){
		Set<String>words = new HashSet<>();
		words.add("small");
		words.add("smell");
		words.add("stall");
		words.add("still");
		words.add("stile");
		words.add("smile");
		return words.contains(word);
	}

	public boolean findTransform(String startWord, String endWord, Set<String>dict){
		Queue<String>queue = new LinkedList<String>();
		//first check to see if startWord is null, endWord is null, or Set is empty
		if(startWord == null || endWord == null || dict.size() == 0 || startWord.length() == 0){
			throw new IllegalArgumentException("invalid start word");
		}

		queue.add(startWord);

		while(!queue.isEmpty()){
			String rootWord = queue.remove(); //need to keep track of location
			queue.remove();

			//need to add new words from level and check if it exists in dictionary
			//break it apart into separate chars and compare char by char
			char[] charArray = rootWord.toCharArray(); 

			for(int i=0; i < charArray.length; i++){
				for(char firstAlphabetLetter = 'a'; firstAlphabetLetter <= 'z'; firstAlphabetLetter++){
					if(charArray[i] != firstAlphabetLetter){
						charArray[i] = firstAlphabetLetter; //replace the root letter with new letter
					}
					String newlyWordFound = new String(charArray);

					if(inDict(newlyWordFound) == true){
						queue.add(newlyWordFound); //add it to queue of words
						dict.remove(newlyWordFound);
					}
				}
				if(rootWord.equals(endWord)){
					return true;
				}
			}
		}
	}
}

