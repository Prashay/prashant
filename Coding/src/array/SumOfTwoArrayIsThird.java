package array;

import java.util.LinkedHashSet;

public class SumOfTwoArrayIsThird {
    public static void main(String[]args){
        int arr[] = {-1, 6, 3, 2, 9, 11, 4};
        int n = 5;
        printpair(arr, n);
    }
    static void printpair(int arr[],int sum){
        LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
        for (int i=0;i< arr.length;i++){
            int temp =sum-arr[i];
            if(hs.contains(temp)){
                System.out.println("pair is"+"("+arr[i]+","+temp+")"+"="+sum);
            }
            hs.add(arr[i]);
        }

    }
}
