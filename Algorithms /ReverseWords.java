public class ReverseWords {
    public String reverseWords(String s) {
        String[] temp = s.split(" +"); //split on one or more spaces within string
        StringBuilder str = new StringBuilder();
        
        for(int i = temp.length - 1; i >= 0; --i){
            str.append(temp[i].trim() + " ");
        }
        return str.toString().trim();
    }
}