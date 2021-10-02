package interview;

import java.util.Scanner;

public class Vowel {

    public static void main(String[]args){
        int vcount= 0;
        int ccount =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        String str =sc.nextLine();
        int length=str.length();
        str.toLowerCase();
        for (int i=0;i<length;i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u'  ){
                vcount++;
            }
            else if (str.charAt(i)>'a' || str.charAt(i)<'z'){
                ccount++;
            }
        }
        System.out.println("vowels are "+ vcount);
        System.out.println("Consonent are "+ccount);
    }
}
