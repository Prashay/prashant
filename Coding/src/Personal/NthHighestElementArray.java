package Personal;

import java.util.Scanner;

public class NthHighestElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Eneter the Highest no value for n");
        int n = sc.nextInt();
        int arr[] = {10, 30, 20, 50, 40};
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            int temp = 0;
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Nth Highest element " + arr[size - n]);

    }
}
