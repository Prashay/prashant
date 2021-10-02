package encapsulation;
import java.util.*;

public class ReverseString {
    public static void main(String[]args){
        String org,rev ="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        org = sc.nextLine();
        int length = org.length();
        for (int i =length-1;i>=0;i--){
            rev = rev+org.charAt(i);
        }
        System.out.println(rev);

        if(org.equals(rev)){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not a palindrome String");
        }



    }
}
