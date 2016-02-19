public class ReplaceSpaces {
	private static void replaceSpace(char[] arr, int length){

		int spaceCount = 0, newLength, i;
		//first loop counts how many spaces there are in the string to determine new length
		for(i = 0; i < length; ++i){
			if(arr[i] == ' ') spaceCount++;
		}

		newLength = length + spaceCount * 2;
		System.out.println(newLength); 
		arr[newLength] = '\0';
		//second loop recusively finds the space and replaces it with '%20' if theres a space, if not copy original character
		for(i = length - 1; i >= 0; --i){
			if(arr[i] == ' '){
				arr[newLength - 1] = '0';
				arr[newLength - 2] = '2';
				arr[newLength - 3] = '%';
				newLength = newLength - 3;
			}
			else {
				arr[newLength - 1] = arr[i];
				newLength = newLength - 1;
			}
		}
		System.out.println(arr);
	}

	public static void main(String[] args){
		char[] arr = {'M', 'r', ' ', 'J', 'o', 'h', 'n', ' ', 'S', 'm', 'i','t','h'};
		System.out.println(arr.length);
		int length = 13;
		replaceSpace(arr,length);
	}
}