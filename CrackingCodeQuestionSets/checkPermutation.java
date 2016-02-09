import java.util.*;

public class checkPermutation {
	private static String sortStr(String str){
		String newString = str.toLowerCase().replaceAll("\\s+", ""); //case-sensitive
		char[] sortedChar = newString.toCharArray();
		Arrays.sort(sortedChar);
		return new String(sortedChar); 
	}

	public static boolean permutation(String str1, String str2){
		return sortStr(str1).equals(sortStr(str2)); //returns true if same sequencce
	}

	public static void main(String[] args){
		String str1 = "ALEX";
		String str2 = " xael     ";
		System.out.println(permutation(str1,str2));
	}
}