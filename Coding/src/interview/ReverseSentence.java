package interview;
import java.util.*;

public class ReverseSentence{
   public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the string");
       String str = "my name is prashant jha";
       String output = reverseWord(str+" ");
       System.out.println("reverse of "+str+ " =="+output);
   }

   public static String reverseWord(String str){
        String []string = str.split("\\s");
        String output =" ";

        for (int i = string.length-1;i>=0;i--){
            output = output+string[i]+" ";
        }
        return output;
    }

}