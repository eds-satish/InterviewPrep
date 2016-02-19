import java.util.*;
import java.lang.*;

public class StringToInteger {
	public static void main(String[] args){
		String str = "+14";
		convert(str);

	}
	public static int convert(String str){
		if(str.length() == 0 || str == null) return 0;
		str = str.trim(); //get rid of whitespace

		char firstChar = str.charAt(0);
		int sign = 1, startIndex = 0, len = str.length();
		if(firstChar == '+'){
			sign = 1;
			startIndex++;
		} else if(firstChar == '-'){
			sign = -1;
			startIndex++;
		}

		long sum = 0;
		for(int i = startIndex; i < len; ++i){
			System.out.println("char is:  " + str.charAt(i));
			if(!Character.isDigit(str.charAt(i))){
				System.out.println("enter");
				return (int) sum * sign;
			}
			//makes sense to get like 14
			sum = sum * 10 + str.charAt(i) - '0'; //when you subtract the smallest possible ASCII/unicode digit from it (e.g. '0'), then you'll be left with the digit's corresponding value (hence, 1)
						
			if(sign == 1 && sum > Integer.MAX_VALUE) return Integer.MAX_VALUE; //corner case
			if(sign == -1 && (-1) * sum < Integer.MIN_VALUE) return Integer.MIN_VALUE;
		}
		return (int) sum * sign; 

	}
}