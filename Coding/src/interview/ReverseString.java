package interview;
import java.util.*;

public class ReverseString {
    public static void main(String[]args){
        String org,rev="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        org =sc.nextLine();
        int length=org.length();
        for(int i = length-1;i>=0;i--){
            rev=rev+org.charAt(i);
        }
        System.out.println("Reverse of the number is "+rev);

    }
}
