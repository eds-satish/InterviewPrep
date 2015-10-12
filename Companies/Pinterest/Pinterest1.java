import java.util.*;

public class Pinterest1 {

        public static void main(String[] args){

                String[] names = {"Alex","Alice", "Halloween", "LOL"};
                System.out.println(findConjunction(names, 2));
        }
        
        public static String findConjunction(String[] names, int limit){
            //list is empty or null
            if(names == null || names.length == 0 || limit == 0 || limit < -1){
                return null;
            }
            
            StringBuilder str = new StringBuilder();

            for(int i = 0; i < limit;i++){
                if(i == 0){
                    str.append(" " + names[i]);
                }
                else {
                    str.append(", " + names[i]);
                }
           
            }
            str.append(" and " + (names.length - limit) + " more ");
            return str.toString();
        }
}
