package Personal;

import java.util.ArrayList;
import java.util.List;

public class ArrayListShortingInt {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(2);
        al.add(17);
        al.add(22);

        System.out.println(al);
        for (int i = 0; i < al.size(); i++) {
            int temp = 0;
            for (int j = i + 1; j < al.size(); j++) {
                if (al.get(i) > al.get(j)) {
                    temp = al.get(i);
                    al.set(i, al.get(j));
                    al.set(j, temp);

                }
            }
        }
        for (int i : al) {
            System.out.print(i + " ");
        }

    }
}
