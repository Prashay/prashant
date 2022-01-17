package HashMap;

import java.util.Scanner;

public class CountCharacterOccuren {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Word");
        String str = sc.nextLine();
        str = str.toLowerCase();

        int counter []= new int[256];
        for (int i=0;i<str.length();i++){
            counter[str.charAt(i)]++;
        }
        char arr[]= str.toCharArray();
        for (int i =0;i<str.length();i++){
            arr[i]= str.charAt(i);
            int flag =0;
            for (int j=0;j<=i;j++){
                if (arr[j] == str.charAt(i)) {
                    flag++;
                }
            }
            if(flag==1){
                System.out.println("No of occurence of "+str.charAt(i)+ " is  "+counter[str.charAt(i)]);
            }
        }
    }
}
