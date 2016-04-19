public class LongestCommonSubsequence {
	//Big-O Approach: In a given string of length n, there can be 2^n subsequences that can be made, so
	//recursively it would be O(2^n).
	public static int LCS(String A, String B){
		/*
		 * Recursive approach: Compare strings in reverse order one character a time
		 * 2 cases:
		 * 1. Both characters are the same - Add 1 to the result and remove the last character from both the strings 
		 * and make a recursive call to the modified strings.
		 * 2. Both characters are different - Return the max of both recursive calls
		 * 2 recursive calls - Remove the last character of String 1 and make a recursive call and remove the last character
		 * from String 2 and make a recursive call 
		 */ 
		int lenA = A.length();
		int lenB = B.length();

		if(lenA == 0 || lenB == 0){
			return 0;
		}

		//check if last characters are the same
		if(A.charAt(lenA - 1) == B.charAt(lenB - 1)){
			return 1 + LCS(A.substring(0,lenA-1), B.substring(0,lenB-1));
		} else {
			//2nd case
			return Math.max(
				LCS(A.substring(0,lenA-1),B.substring(0,lenB)), 
				LCS(A.substring(0,lenA),B.substring(0,lenB-1)));
		}
	}
	public static void main(String[] args){
		System.out.println(LCS("acbaed","abcadf"));
	}
}