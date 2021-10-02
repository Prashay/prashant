package number;

import java.util.Scanner;

public class EvenOddWithout {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrr integet");
        int n = sc.nextInt();
        if((n & 1)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }



}
