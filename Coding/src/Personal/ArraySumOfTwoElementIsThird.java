package Personal;

import java.util.LinkedHashSet;

public class ArraySumOfTwoElementIsThird {
    public static void main(String[] arg) {
        int arr[] = {10, 2, 4, 5, 1, 5, 3, -6};
        int sum = 6;
        pairSum(arr, sum);
    }

    static void pairSum(int arr[], int sum) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            int temp = sum - arr[i];
            if (lhs.contains(temp)) {
                System.out.println("Pairs are " + "= (" + arr[i] + "," + temp + ")");
            }
            lhs.add(arr[i]);
        }
    }
}
