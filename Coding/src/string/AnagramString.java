package string;
import java.util.*;

public class AnagramString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String 1");
        String s1 = sc.nextLine();
        System.out.println("Enter the String 2");
        String s2 = sc.nextLine();
        s1.toLowerCase();
        s2.toLowerCase();
        if(s1.length()!=s2.length()){
            System.out.println("nooo anagram");
        }
        else {
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            if (Arrays.equals(ch1, ch2)) {
                System.out.println("anagram");

            } else {
                System.out.println("no anagram");
            }
        }
    }
}
