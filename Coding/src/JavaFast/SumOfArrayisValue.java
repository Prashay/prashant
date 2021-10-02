package JavaFast;

import java.util.LinkedHashSet;

public class SumOfArrayisValue {
    public static void main(String[]args){
        int arr []={1,6,-2,8,5,9,-3};
        int n=6;
        sumofarr(arr,n);
    }
    static  void sumofarr(int arr[],int sum){
        LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
        for (int i=0;i<arr.length;i++){
            int temp =sum-arr[i];
            if(hs.contains(temp)){
                System.out.println("pairs are"+"("+arr[i]+","+temp+") -"+sum);
            }
            hs.add(arr[i]);
        }

    }
}
