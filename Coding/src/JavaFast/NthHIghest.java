package JavaFast;

import java.util.Scanner;

public class NthHIghest {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = sc .nextInt();
        int array[]= {95, 35, 72 ,98, 54, 68, 75, 99};

        int temp, size;

        size = array.length;

        for(int i = 0; i<size; i++ ){
            for(int j = i+1; j<size; j++){

                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(n+"th largest number is: "+array[size-n]);
    }
}
