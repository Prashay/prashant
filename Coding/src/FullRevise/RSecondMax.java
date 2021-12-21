package FullRevise;

public class RSecondMax {
    public static void main(String[] ars) {
        int arr[] = {10, 30, 40, 5, 20};
        int size = arr.length;
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n" + arr[size - 1] + " ");


    }
}
