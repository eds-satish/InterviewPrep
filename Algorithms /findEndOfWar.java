import java.io.*;
import java.util.*;

public class findEndOfWar {


/*
Given two words like 'small' and 'smile', find a way
to transform the first word into the second, changing
only one letter at a time. Each intermediate word
must be a valid word in a dictionary that you will
be provided. The only interface to this dictionary is
a function called inDict(word), which returns a boolean value.


Example:
small
...
...
...
smile

Sample Transformation:
small -- smell
  |
stall
  |
still
  |
stile
  |
smile

Assume that the dictionary contains words with the 26 lowercase letters of
the English alphabet.

Assume that the start and end words exist in the dictionary.

Possible transformations of "small":
small saall, sball, scall, sdall, ...
*/
  
  //returns boolean if word is in Dictionar 
  public static boolean inDict(String word) {
    Set<String> words = new HashSet<>();
    words.add("small");
    words.add("smell");
    words.add("stall");
    words.add("still");
    words.add("stile");
    words.add("smile");
    return words.contains(word);
  }
  
  //definitely using a graph searching 
  
  public void findLength(String rootWord, String lastWord, Set<String>dict){
    
    Queue<String>queue = new LinkedList<String>();
    
    if(rootWord == null || rootWord.length() == 0){ //null error 
      throw new IllegalArgumentException("invalid start word");
    }
    
    queue.add(rootWord); //adding start word to queue for bfs
    
    
    while(!queue.isEmpty()){
      //before going to next level of tree, need 
      //to pop small
      String firstElem = queue.remove(); //smile
      queue.remove();
      
      //need to lookup queue add method       
      char[] arr = firstElem.toCharArray(); //'smile'
      for(int i=0; i < arr.length;i++){
        for(char firstLetter='a'; firstLetter <= 'z';firstLetter++){ //iterate through entire alphabet
          if(arr[i] != firstLetter){ //'s' != a 
              arr[i] = firstLetter;
          }
          String newWord = new String(arr);  
          if(inDict(newWord)){
            queue.add(newWord); 
            dict.remove(newWord);
          }  
        }
      }    
    }
    return;
  }

  public static void main(String[] args) {
    System.out.println(inDict(""));
  }
}