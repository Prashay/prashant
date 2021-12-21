package FullRevise;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RsumN {
    public static void main(String[] args) {
        int arr[] = {10, 40, 20, 60, 50, 80};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  sum value");
        int n = sc.nextInt();
        RsumN r = new RsumN();

        arraySum(arr, n);
    }

    public static void arraySum(int array[], int sum) {
        LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
        for (int i = 0; i < array.length; i++) {
            int temp = sum - array[i];
            if (hs.contains(temp)) {
                System.out.println("Pairs are" + "(" + array[i] + "," + temp + ")");
            }
            hs.add(array[i]);
        }
    }
}
