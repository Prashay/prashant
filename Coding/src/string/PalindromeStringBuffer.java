package string;

import java.util.Scanner;

public class PalindromeStringBuffer{
    public static void main(String []args){
        String org;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        org =sc.nextLine();
        StringBuffer bf = new StringBuffer(org);
        bf.reverse();
        String rev = bf.toString();
        if(org.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("NOOOOOOOOO");
        }
    }
}