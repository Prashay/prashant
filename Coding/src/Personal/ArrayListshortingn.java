package Personal;

import java.util.ArrayList;

public class ArrayListshortingn {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(2);
        al.add(17);
        al.add(22);
        System.out.println(al);
        int size = al.size();
        for (int i = 0; i < size; i++) {
            int temp = 0;
            for (int j = i + 1; j < size; j++) {
                if (al.get(i) > al.get(j)) {
                    temp = al.get(i);
                    al.set(i, al.get(j));
                    al.set(j, temp);
                }
            }
        }
        for (int i : al) {
            System.out.print(i + ",");
        }
    }
}
