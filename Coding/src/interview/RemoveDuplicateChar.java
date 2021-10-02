package interview;
import java.util.*;

public class RemoveDuplicateChar {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter string");
        String str= sc.nextLine();
        removeduplicate(str);
    }
    static void removeduplicate(String str){
        LinkedHashSet<Character> hsr = new LinkedHashSet<Character>();
        for(int i =0;i<str.length();i++){
        hsr.add(str.charAt(i));
         }

        for (Character ch : hsr){
            System.out.print(ch);
        }
    }
}
