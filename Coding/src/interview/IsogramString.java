package interview;
import java.util.*;

public class IsogramString {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        System.out.println(isisogram(str));
    }
    static boolean isisogram(String str){
        boolean flag = true;
        char ch[]= str.toCharArray();
        HashSet<Character> hs = new HashSet<Character>();
        for (Character c : ch){
            if(hs.contains(c)){
                flag= false;
            }
            else{
                hs.add(c);
            }
        }


        return flag;
    }
}
