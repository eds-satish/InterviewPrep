public class CountWord {
	public static void main(String[] args){
		String a = "Alex i";
		System.out.println(wordCount(a));
	}

	public static int wordCount(String str){
		String temp = str.trim();
		int spaceCount = 0;
		for(int i = 0; i < str.length();++i){
			if(temp.charAt(i) == ' '){
				spaceCount++; //count the spaceCount
			}
		}
		return spaceCount + 1; //account for last word
	}
	
}