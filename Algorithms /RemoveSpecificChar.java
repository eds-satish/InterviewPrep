import java.util.*;

//LOGIC: Convert the original string into characters and loop per character.
// Compare character with removeCharStr to see if theyre not equal and insert it into the array
public class RemoveSpecificChar {
	public static String remove(String orig,char removeCharStr){

		char[] arr1 = orig.toCharArray();
		char[] newString = new char[arr1.length];
		int i = 0;

		for(char ch: arr1){
			if(ch != removeCharStr){
				newString[i] = ch;
				++i; //move to next index for next character
			}
		}
		return new String(newString);
	}
	public static void main(String[] args){
		String a = "Alex";
		System.out.println(remove(a,'e'));
	}

}