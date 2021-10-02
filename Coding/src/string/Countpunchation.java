package string;
import java.util.*;

public class Countpunchation {
    public static void main(String[]args){
       int count =0;
       String str;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Sentence");
       str = sc.nextLine();
       for (int i=0;i<str.length();i++){
           if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||
                   str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':'){
               count++;
           }
       }
       System.out.println("total no  of punchation are "+count);
    }
}
