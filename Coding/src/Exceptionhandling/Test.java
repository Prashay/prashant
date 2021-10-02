package Exceptionhandling;

import interview.RemoveDuplicateChar;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Test{
    public static void main(String []args){
       String str = "nandan";
       int counter[]= new int[256];
       for (int i =0;i<str.length();i++){
           counter[str.charAt(i)]++;
       }
       char array []= new char[str.length()];
       for(int i=0;i<str.length();i++){
           array[i]=str.charAt(i);
           int flag=0;
           for (int j =0;j<=i;j++){
               if(array[j]==str.charAt(i)){
                   flag++;
               }
           }
           if(flag==1){
               System.out.println("No of character "+str.charAt(i)+"->"+counter[str.charAt(i)]);
           }
       }
    }
}

