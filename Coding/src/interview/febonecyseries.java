package interview;

import java.util.Scanner;

public class febonecyseries {
    public static void febonecyno(int n) {
        int a = 0;
        int b = 1;
        int c = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + ", ");
            a = b;
            b = c;
            c = a + b;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the no");
        int n = sc.nextInt();
        febonecyno(n);
    }
}
