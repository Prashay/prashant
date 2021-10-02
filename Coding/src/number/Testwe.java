package number;
import java.util.*;

public class Testwe{
    public static void main(String [] args){
        String str= "codedecode";
        int length = str.length();
        System.out.println(isogram(str));
        }
        static boolean isogram(String str){
        boolean flag=true;
        char [] ch = str.toCharArray();
        HashSet hs = new HashSet();

        for (Character c : ch){
            if(hs.contains(c)){
                flag = false;
            }
            else{
                hs.add(c);
            }
        }
        return true;
        }
    }
