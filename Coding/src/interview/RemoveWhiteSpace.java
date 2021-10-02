package interview;
import java.util.*;

public class RemoveWhiteSpace {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        String str = sc.nextLine();

        System.out.println(removewhite(str));
    }
    static String removewhite(String str){
     StringBuilder sbr = new StringBuilder();
     char [] chr= str.toCharArray();

     for(char c : chr){
         if(!Character.isWhitespace(c)){
              sbr.append(c);
         }
     }
     return sbr.toString();
    }
}
