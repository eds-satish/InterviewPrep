import java.util.*;

public class lps {
	private static int start, maxLen;
    
    public static String longestPalindrome(String s) {
        int len = s.length();
        
        if (len < 2)
            return s;

        //when length is > 2 
        for (int i = 0; i < len-1; i++) {
            extendPalindrome(s, i, i);  //assume odd length, try to extend Palindrome as possible
            extendPalindrome(s, i, i+1); //assume even length.
        }
        System.out.println(s.substring(start,start + maxLen));
        return s.substring(start, start + maxLen);
    }

    private static void extendPalindrome(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        if (maxLen < j - i - 1) {
            start = i + 1;
            maxLen = j - i - 1;
        }
    }

	public static void main(String args[]){
		String s = "abcdeba";
		longestPalindrome(s);
	}


/*
private int[][] dp(char[] charArray) {
    int[][] dpTable = new int[charArray.length][charArray.length];
    // populate the one character palindrome length
    for (int i = 0; i &lt; charArray.length; i++) {
        dpTable[i][i] = 1;
    }
 
    // populate the two character palindrome length
    for (int i = 0; i &lt; charArray.length - 1; i++) {
    if (charArray[i] == charArray[i + 1])
        dpTable[i][i + 1] = 2;
    else
        dpTable[i][i + 1] = 1;
    }
    int k = 2;
    while (k &lt; charArray.length) {
        int i = 0 , j = k;
        for (; j &lt; charArray.length; i++, j++) {
            if (charArray[i] == charArray[j]) {
                dpTable[i][j] = 2 + dpTable[i + 1][j - 1];
            } else {
                dpTable[i][j] = Math.max(dpTable[i + 1][j], dpTable[i][j - 1]);
            }
        }
        k++;
    }
    return dpTable;
}

*/


}

