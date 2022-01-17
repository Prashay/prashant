package Personal;

import java.util.ArrayList;

public class ArraytoArrayListAddNew {
    public static void main(String[] args) {
        int arr[] = {10, 30, 20, 40, 30};
        ArrayList<Integer> ar = new ArrayList<Integer>(arr.length);
        ar.add(50);

        for (int i : arr) {
            ar.add(i);
        }
        System.out.println(ar);
    }
}
