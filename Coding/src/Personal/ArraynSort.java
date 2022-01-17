package Personal;

public class ArraynSort {
    public static void main(String[] args) {
        int arr[] = {11, 23, 12, 24, 10};
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                int temp = 0;
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println("Sorted Array " + arr[i]);
        }
    }
}
