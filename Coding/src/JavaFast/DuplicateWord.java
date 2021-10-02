package JavaFast;

import java.util.*;

public class DuplicateWord {
    public static void main(String []args){
        String str ="Java is a topic where topic is a word";
        str =str.toLowerCase();
        String arr[]= str.split(" ");

        List ar = new ArrayList();
        Set st = new HashSet();

        for (String i :arr){
            if(!st.add(i)){
                ar.add(i);
            }

        }

        System.out.print(ar);
    }
}
