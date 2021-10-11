package Test1;

import java.util.Scanner;

public class Operator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no ");
        int n1 = sc.nextInt();
        System.out.println("Enter the 2nd no ");
        int n2 = sc.nextInt();

        System.out.println("Operation ");
        String str = sc.next();
        int n3 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '+') {
                n3 = n1 + n2;
            } else if (str.charAt(i) == '-') {
                n3 = n1 - n2;
            } else if (str.charAt(i) == '*') {
                n3 = n1 * n2;

            }
            System.out.println("output");
            System.out.println(n3);
        }

    }
}
