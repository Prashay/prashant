package interview;

public class ArraySort {
    public static void main(String []args){
        int arr[] = {56, 78, 11, 48, 33};
        int length = arr.length;
        int temp = 0;
        for (int i = 0; i < length; i++) {

            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
            System.out.print(arr[i] + " ");
        }

    }
}
