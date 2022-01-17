package Personal;

public class UniqueElementsArray {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 2, 4, 5, 3, 5, 6, 6, 7, 2};
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("unique elements are " + arr[i]);
            }
        }
    }
}
