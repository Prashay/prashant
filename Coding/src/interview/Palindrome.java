package interview;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String org, rev = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        org = sc.nextLine();
        int length = org.length();
        for (int i = length - 1; i >= 0; i--) {
            rev = rev + org.charAt(i);
        }
     if(org.equals(rev)){
         System.out.println("Palindrome");
     }
     else{
         System.out.println("Not pallindrome");
     }

    }
}
