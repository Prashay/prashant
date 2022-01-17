package Personal;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] arg) {
        String org, rev = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        org = sc.nextLine();
        int length = org.length();
        for (int i = length - 1; i >= 0; i--) {
            rev = rev + org.charAt(i);
        }
        System.out.println(rev);
        if (org.equals(rev)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }

}
