package array;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {10, 30, 20, 50, 74};
        int length = arr.length;
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
