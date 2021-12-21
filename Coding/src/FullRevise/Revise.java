package FullRevise;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Revise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
        removeduplicate(str);
    }

    public static void removeduplicate(String str) {
        LinkedHashSet<Character> hsr = new LinkedHashSet<Character>();
        for (int i = 0; i < str.length(); i++) {
            hsr.add(str.charAt(i));
        }
        for (Character ch : hsr) {
            System.out.println(ch);
        }
    }
}

